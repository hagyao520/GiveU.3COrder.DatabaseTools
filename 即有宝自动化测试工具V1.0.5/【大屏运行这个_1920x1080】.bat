::����exe�ļ���lnk��ݷ�ʽ
@echo off
set "SrcFile=%USERPROFILE%\Desktop\���б��Զ������Թ���V1.0.5\jar\GiveU.3COrder.DatabaseTools-0.0.1-SNAPSHOT_1920x1080.jar"
set "LnkFile=���б��Զ������Թ���V1.0.5.lnk"
set "IconPath=%USERPROFILE%\Desktop\���б��Զ������Թ���V1.0.5\ico\���б�.ico"
call :CreateShort "%SrcFile%" "%LnkFile%" "%IconPath%"
::call :CreateShort1 "%SrcFile1%" "%LnkFile1%" "%IconPath%"

echo �����ݷ�ʽ�����ɹ���
goto :eof

::Arguments              Ŀ��������
::Description            ��ݷ�ʽ��ע
::FullName               ���ؿ�ݷ�ʽ����·��
::Hotkey                 ��ݷ�ʽ��ݼ�
::IconLocation           ��ݷ�ʽͼ�꣬������ʹ��Ĭ��ͼ��
::TargetPath             Ŀ��
::WindowStyle            ��������״̬
::WorkingDirectory       ��ʼλ��

:CreateShort
mshta VBScript:Execute("Set a=CreateObject(""WScript.Shell""):Set b=a.CreateShortcut(a.SpecialFolders(""DeskTop"") & ""\%~2""):b.TargetPath=""%~1"":b.IconLocation=""%~3"":b.Save:close")

:CreateShort1
::mshta VBScript:Execute("Set a=CreateObject(""WScript.Shell""):Set b=a.CreateShortcut(a.SpecialFolders(""DeskTop"") & ""\%~2""):b.TargetPath=""%~1"":b.IconLocation=""%~3"":b.Save:close")