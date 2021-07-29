package boxingMatch;

public class Ring {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;

	public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}

	public void run() {

		if (checkWeight()) {

			if (whoIsStart().equals(this.f1)) {
				while (this.f1.health > 0 && this.f2.health > 0) {
					System.out.println("======== YENÝ ROUND ===========");
					this.f2.health = this.f1.hit(this.f2);
					if (isWin()) {
						break;
					}
					this.f1.health = this.f2.hit(this.f1);
					if (isWin()) {
						break;
					}
					printScore();
				}
			} else {
				while (this.f1.health > 0 && this.f2.health > 0) {
					System.out.println("======== YENÝ ROUND ===========");
					this.f1.health = this.f2.hit(this.f1);
					if (isWin()) {
						break;
					}
					this.f2.health = this.f1.hit(this.f2);
					if (isWin()) {
						break;
					}
					printScore();
				}
			}

		} else {
			System.out.println("Sporcularýn aðýrlýklarý uyuþmuyor.");
		}
	}

	Fighter whoIsStart() {
		double randomValue = Math.random() * 100; // 0.0 to 99.9
		return randomValue <= 50 ? this.f1 : this.f2;
	}

	public boolean checkWeight() {
		return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
	}

	public boolean isWin() {
		if (f1.health == 0) {
			System.out.println("Maçý Kazanan : " + f2.name);
			return true;
		} else if (f2.health == 0) {
			System.out.println("Maçý Kazanan : " + f2.name);
			return true;
		}

		return false;
	}

	public void printScore() {
		System.out.println("------------");
		System.out.println(f1.name + " Kalan Can \t:" + f1.health);
		System.out.println(f2.name + " Kalan Can \t:" + f2.health);
	}
}
