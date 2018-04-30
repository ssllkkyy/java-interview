/**
* @FileName锟斤拷Test00.java
* @Package锟斤拷com.itchina.exam
* @Description: (锟斤拷锟斤拷锟侥硷拷锟斤拷什么)
* @author锟斤拷Rocky
* @date锟斤拷 Oct 26, 2016
* @version锟斤拷 V1.0
*/
package com.java.interview.exam.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
/**
 * 锟斤拷目录锟斤拷锟斤拷.java锟斤拷锟侥硷拷全锟斤拷锟斤拷锟狡碉拷锟斤拷一锟斤拷目录锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
 */
public class Test00
{
	public static void main(String[] args) throws IOException
	{
		//锟斤拷装d:\\java锟斤拷锟侥柯?
		File startFile = new File("d:\\java");
		// 锟斤拷取锟斤拷目录锟铰碉拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
		File[] files = startFile.listFiles(new FilenameFilter()
		{
			@Override
			public boolean accept(File dir, String name)
			{
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		// 锟叫讹拷目锟侥碉拷锟角凤拷锟斤拷冢锟斤拷锟斤拷锟斤拷诰徒锟斤拷锟?
		File endFile = new File("d:\\jar");
		if (!endFile.exists())
		{
			endFile.mkdir();
		}
		// 锟斤拷锟斤拷锟侥硷拷锟斤拷锟斤拷
		for (File f : files)
		{
			String name = f.getName(); // 锟矫碉拷锟侥硷拷锟斤拷
			File newFile = new File(endFile, name);// 锟斤拷路锟斤拷锟斤拷锟侥硷拷锟斤拷拼锟斤拷
			BufferedReader br = new BufferedReader(new FileReader(f));
			BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));

			String line = null;
			while ((line = br.readLine()) != null)
			{
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			bw.close();
			br.close();
		}
		// 锟斤拷锟斤拷
		File[] endFileArray = endFile.listFiles();
		for (File file : endFileArray)
		{
			String name = file.getName();
			String newname = name.replace(".java", ".jar");
			File newFile = new File(endFile, newname);
			file.renameTo(newFile);
		}

	}
}
