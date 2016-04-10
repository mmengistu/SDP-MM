package sml;

/**
 * Software Design and Programming (2015_16)Part-time
 *
 * @author Muluneh Mengistu
 */

public class BnzInstruction extends Instruction {

    private String jump;
    private int op1;
    //private int op2;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int op1, String jump) {
        this(label, "bnz");
        this.op1 = op1;
        this.jump = jump;
    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        if (value1 !=0){
        	int pc =0;
        	for (Instruction ins : m.getProg()){
        		if (ins.label.equals(opcode)){
        			m.setPc(pc);
        			break;
        		}
        		++pc;
        	}
        }
       // m.getRegisters().setRegister(op1,op1);
    }

    @Override
    public String toString() {
        return super.toString() + " " + op1 + " JUMP " + jump;
    }
}
