package de.tuebingen.sfs.submodulefromroot;

import de.tuebingen.sfs.submoduledemo.App;

public class SubmoduleFromRoot {

	public static void main(String args[]) {
		greet();
		App.greet();
	}

	public static void greet() {
		System.out.println("Running the submodule with full folder structure");
	}
}
