package visitor.sample;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = "";                         // ���ݒ��ڂ��Ă���f�B���N�g����
    public void visit(File file) {                  // �t�@�C����K�₵���Ƃ��ɌĂ΂��
        System.out.println(currentdir + "/" + file);
    }
    public void visit(Directory directory) {   // �f�B���N�g����K�₵���Ƃ��ɌĂ΂��
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
