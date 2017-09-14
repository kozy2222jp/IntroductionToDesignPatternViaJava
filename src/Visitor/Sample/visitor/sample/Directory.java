package visitor.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;                    // �f�B���N�g���̖��O
    private ArrayList dir = new ArrayList();      // �f�B���N�g���G���g���̏W��
    public Directory(String name) {         // �R���X�g���N�^
        this.name = name;
    }
    public String getName() {               // ���O�𓾂�
        return name;
    }
    public int getSize() {                  // �T�C�Y�𓾂�
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {         // �G���g���̒ǉ�
        dir.add(entry);
        return this;
    }
    public Iterator iterator() {      // Iterator�̐���
        return dir.iterator();
    }
    public void accept(Visitor v) {         // �K��҂̎󂯓���
        v.visit(this);
    }
}
