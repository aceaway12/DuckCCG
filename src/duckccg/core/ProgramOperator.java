package duckccg.core;
public class ProgramOperator {
	public static void main(String[] args) {
		MenuManager.initialize();
	}
	public static void beginSoloDraft() {
		MenuManager.switchToScreen(MenuManager.DRAFT_MENU);
	}
}
