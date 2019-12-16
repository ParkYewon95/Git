package day08;

public class Fish extends day08.Animal {
	String name;
		
		public Fish() {
			super("물고기");
	}

	public Fish(String name)	{
		super("물고기");
		this.name = name;
	}
		
		@Override
		public void breath() {
			System.out.println("아가미로 동작...");
		}
		
		public void print() {
			System.out.printf("[%s, %s,%s]%n",
					super.kind, this.kind,this.name);
		}

	}