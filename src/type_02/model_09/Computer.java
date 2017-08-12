package type_02.model_09;

public class Computer {
	private CPU cpu;
	private Disk disk;
	private Memory memory;

	public Computer() {
		cpu = new CPU();
		disk = new Disk();
		memory = new Memory();
	}

	public void startup() {
		System.out.println("Computer startup begin");
		cpu.startup();
		disk.startup();
		memory.startup();
		System.out.println("Computer startup end");
	}

	public void shutdown() {
		System.out.println("Computer shutdown begin");
		cpu.shutdown();
		disk.shutdown();
		memory.shutdown();
		System.out.println("Computer startup end");
	}
}
