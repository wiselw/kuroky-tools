package com.kuroky.entity.ocr;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.vietocr.ImageHelper;

public class OCRTest {

	public static void main(String[] args) {
		//loadDLL("liblept168.dll");//注意加载先后顺序  
		//loadDLL("libtesseract302.dll");//注意加载先后顺序 
		Tesseract instance = Tesseract.getInstance();  // JNA Interface Mapping
		BufferedImage image;
		try {
			image = ImageIO.read(new FileInputStream("E:/pic/2015-04-27-15-04-59-071.jpg"));
			//BufferedImage textImage = ImageHelper.convertImageToGrayscale(ImageHelper.getSubImage(image, 690, 735, 43,45));
			BufferedImage textImage = ImageHelper.getSubImage(image, 750, 735, 43,45);
			ImageIO.write(textImage, "jpg", new File("E:/pic/a.jpg")); 
			String a=instance.doOCR(textImage);
			System.out.println(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// 图片锐化,自己使用中影响识别率的主要因素是针式打印机字迹不连贯,所以锐化反而降低识别率  
		// textImage = ImageHelper.convertImageToBinary(textImage);  
		// 图片放大5倍,增强识别率(很多图片本身无法识别,放大5倍时就可以轻易识,但是考滤到客户电脑配置低,针式打印机打印不连贯的问题,这里就放大5倍)  
		//textImage = ImageHelper.getScaledInstance(textImage, endX * 5, endY * 5);  
	}
	private static void loadDLL(String libFullName) {  
        try {  
            String nativeTempDir = System.getProperty("java.io.tmpdir");  
            InputStream in = null;  
            FileOutputStream writer = null;  
            BufferedInputStream reader = null;  
            System.out.println(nativeTempDir  + libFullName);
            File extractedLibFile = new File(nativeTempDir + libFullName);  
            if (!extractedLibFile.exists()) {  
                try {  
                    in = Tesseract.class.getResourceAsStream("/" + libFullName);  
                    Tesseract.class.getResource(libFullName);  
                    reader = new BufferedInputStream(in);  
                    writer = new FileOutputStream(extractedLibFile);  
                    byte[] buffer = new byte[1024];  
                    while (reader.read(buffer) > 0) {  
                        writer.write(buffer);  
                        buffer = new byte[1024];  
                    }  
                    in.close();  
                    writer.close();  
                   // System.load(extractedLibFile.toString());  
                } catch (IOException e) {  
                    e.printStackTrace();  
                } finally {  
                    if (in != null) {  
                        in.close();  
                    }  
                    if (writer != null) {  
                        writer.close();  
                    }  
                }  
            } else {  
               // System.load(extractedLibFile.toString());  
            }  
        } catch (IOException e) {  
            e.printStackTrace();
        }  
 }  

}
