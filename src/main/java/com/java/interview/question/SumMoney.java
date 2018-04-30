/**
* @FileName��Test00.java
* @Package��com.itchina.exam
* @Description: (�����ļ���ʲô)
* @author��Rocky
* @date�� Oct 26, 2016
* @version�� V1.0
*/
package com.java.interview.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
/**
 * ��Ŀ¼����.java���ļ�ȫ�����Ƶ���һ��Ŀ¼������������
 */
public class SumMoney
{
	public static void main(String[] args) throws IOException
	{
		//��װd:\\java���Ŀ¼
		File startFile = new File("d:\\java");
		// ��ȡ��Ŀ¼�µ�������������������
		File[] files = startFile.listFiles(new FilenameFilter()
		{

			@Override
			public boolean accept(File dir, String name)
			{
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		// �ж�Ŀ�ĵ��Ƿ���ڣ������ھͽ���
		File endFile = new File("d:\\jar");
		if (!endFile.exists())
		{
			endFile.mkdir();
		}
		// �����ļ�����
		for (File f : files)
		{
			String name = f.getName(); // �õ��ļ���
			File newFile = new File(endFile, name);// ��·�����ļ���ƴ��
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
		// ����
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
