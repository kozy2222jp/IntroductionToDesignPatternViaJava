package visitor.sample;

import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();                                   // ���O�𓾂�
    public abstract int getSize();                                      // �T�C�Y�𓾂�
    public Entry add(Entry entry) throws FileTreatmentException {       // �G���g����ǉ�����
        throw new FileTreatmentException();
    }
    public Iterator iterator() throws FileTreatmentException {    // Iterator�̐���
        throw new FileTreatmentException();
    }
    public String toString() {                                          // ������\��
        return getName() + " (" + getSize() + ")";
    }
}
