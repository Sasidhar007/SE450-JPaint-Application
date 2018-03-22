package model.dialogs;

import model.DoRedo;
import model.DoUndo;
import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;
import model.StartAndEndPointMode;
import model.interfaces.IApplicationState;
import model.interfaces.IDialogProvider;
import view.interfaces.IDialogChoice;

public class DialogProvider implements IDialogProvider {
    private final IDialogChoice<ShapeType> chooseShapeDialog;
    private final IDialogChoice<ShapeColor> choosePrimaryColorDialog;
    private final IDialogChoice<ShapeColor> chooseSecondaryColorDialog;
    private final IDialogChoice<ShapeShadingType> chooseShadingTypeDialog;
    private final IDialogChoice<StartAndEndPointMode> chooseStartAndEndPointModeDialog;
    private final IDialogChoice<DoUndo> chooseUndoDialog;
    private final IDialogChoice<DoRedo> chooseRedoDialog;
    private final IApplicationState applicationState;
	

    public DialogProvider(IApplicationState applicationState) {
        this.applicationState = applicationState;
        chooseShapeDialog = new ChooseShapeDialog(this.applicationState);
        choosePrimaryColorDialog = new ChoosePrimaryColorDialog(this.applicationState);
        chooseSecondaryColorDialog = new ChooseSecondaryColorDialog(this.applicationState);
        chooseShadingTypeDialog = new ChooseShadingTypeDialog(this.applicationState);
        chooseStartAndEndPointModeDialog = new ChooseStartAndEndPointModeDialog(this.applicationState);
        chooseUndoDialog = new ChooseUndoDialog(this.applicationState);
        chooseRedoDialog = new ChooseRedoDialog(this.applicationState);
    }

    @Override
    public IDialogChoice<ShapeType> getChooseShapeDialog() {
        return chooseShapeDialog;
    }

    @Override
    public IDialogChoice<ShapeColor> getChoosePrimaryColorDialog() {
        return choosePrimaryColorDialog;
    }

    @Override
    public IDialogChoice<ShapeColor> getChooseSecondaryColorDialog() {
        return chooseSecondaryColorDialog;
    }

    @Override
    public IDialogChoice<ShapeShadingType> getChooseShadingTypeDialog() {
        return chooseShadingTypeDialog;
    }

    @Override
    public IDialogChoice<StartAndEndPointMode> getChooseStartAndEndPointModeDialog() {
        return chooseStartAndEndPointModeDialog;
    }

	@Override
	public IDialogChoice<DoUndo> getChooseDoUndo() {
		return chooseUndoDialog;
	}
	
	@Override
	public IDialogChoice<DoRedo> getChooseDoRedo() {
		return chooseRedoDialog;
	}
}
