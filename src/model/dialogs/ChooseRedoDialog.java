package model.dialogs;

	import model.DoRedo;
	import model.interfaces.IApplicationState;
	import view.interfaces.IDialogChoice;

	public class ChooseRedoDialog implements IDialogChoice<DoRedo>{

			private IApplicationState applicationState;


			public ChooseRedoDialog(IApplicationState applicationState) {
			        this.applicationState = applicationState;
			    }

			@Override
			public String getDialogTitle() {
				return "Are You Sure You want to Redo?";
			}

			@Override
			public String getDialogText() {
				return "Redo";
			}

			@Override
			public DoRedo[] getDialogOptions() {
				return DoRedo.values();
			}

			@Override
			public DoRedo getCurrentSelection() {
				return applicationState.getRedo();
			}
}
