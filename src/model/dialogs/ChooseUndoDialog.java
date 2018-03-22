package model.dialogs;

import model.DoUndo;
import model.interfaces.IApplicationState;
import view.interfaces.IDialogChoice;

public class ChooseUndoDialog implements IDialogChoice<DoUndo>{

		private IApplicationState applicationState;


		public ChooseUndoDialog(IApplicationState applicationState) {
		        this.applicationState = applicationState;
		    }

		@Override
		public String getDialogTitle() {
			return "Are You Sure You want to undo?";
		}

		@Override
		public String getDialogText() {
			return "Undo";
		}

		@Override
		public DoUndo[] getDialogOptions() {
			return DoUndo.values();
		}

		@Override
		public DoUndo getCurrentSelection() {
			return applicationState.getUndo();
		}

	}

