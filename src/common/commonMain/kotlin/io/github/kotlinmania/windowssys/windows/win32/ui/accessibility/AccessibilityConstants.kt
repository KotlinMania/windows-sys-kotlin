package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.windowssys.core.GUID

public val ANNO_CONTAINER: AnnoScope = 1

public val ANNO_THIS: AnnoScope = 0

public val ANRUS_ON_SCREEN_KEYBOARD_ACTIVE: ACC_UTILITY_STATE_FLAGS = 1u

public val ANRUS_PRIORITY_AUDIO_ACTIVE: ACC_UTILITY_STATE_FLAGS = 4u

public val ANRUS_PRIORITY_AUDIO_ACTIVE_NODUCK: ACC_UTILITY_STATE_FLAGS = 8u

public val ANRUS_PRIORITY_AUDIO_DYNAMIC_DUCK: UInt = 16u

public val ANRUS_TOUCH_MODIFICATION_ACTIVE: ACC_UTILITY_STATE_FLAGS = 2u

public val AcceleratorKey_Property_GUID: GUID = GUID.from_u128(0x514865df25574cb9uL, 0xaeed6ced084ce52cuL)

public val AccessKey_Property_GUID: GUID = GUID.from_u128(0x6827b12a7f94a15uL, 0x917cffa5ad3eb0a7uL)

public val ActiveEnd_End: ActiveEnd = 2

public val ActiveEnd_None: ActiveEnd = 0

public val ActiveEnd_Start: ActiveEnd = 1

public val ActiveTextPositionChanged_Event_GUID: GUID = GUID.from_u128(0xa5c09e9cc77d4f25uL, 0xb491e5bb7017cbd4uL)

public val AnimationStyle_BlinkingBackground: AnimationStyle = 2

public val AnimationStyle_LasVegasLights: AnimationStyle = 1

public val AnimationStyle_MarchingBlackAnts: AnimationStyle = 4

public val AnimationStyle_MarchingRedAnts: AnimationStyle = 5

public val AnimationStyle_None: AnimationStyle = 0

public val AnimationStyle_Other: AnimationStyle = -1

public val AnimationStyle_Shimmer: AnimationStyle = 6

public val AnimationStyle_SparkleText: AnimationStyle = 3

public val AnnotationObjects_Property_GUID: GUID = GUID.from_u128(0x310910c87c6e4f20uL, 0xbecd4aaf6d191156uL)

public val AnnotationType_AdvancedProofingIssue: UIA_ANNOTATIONTYPE = 60020

public val AnnotationType_Author: UIA_ANNOTATIONTYPE = 60019

public val AnnotationType_CircularReferenceError: UIA_ANNOTATIONTYPE = 60022

public val AnnotationType_Comment: UIA_ANNOTATIONTYPE = 60003

public val AnnotationType_ConflictingChange: UIA_ANNOTATIONTYPE = 60018

public val AnnotationType_DataValidationError: UIA_ANNOTATIONTYPE = 60021

public val AnnotationType_DeletionChange: UIA_ANNOTATIONTYPE = 60012

public val AnnotationType_EditingLockedChange: UIA_ANNOTATIONTYPE = 60016

public val AnnotationType_Endnote: UIA_ANNOTATIONTYPE = 60009

public val AnnotationType_ExternalChange: UIA_ANNOTATIONTYPE = 60017

public val AnnotationType_Footer: UIA_ANNOTATIONTYPE = 60007

public val AnnotationType_Footnote: UIA_ANNOTATIONTYPE = 60010

public val AnnotationType_FormatChange: UIA_ANNOTATIONTYPE = 60014

public val AnnotationType_FormulaError: UIA_ANNOTATIONTYPE = 60004

public val AnnotationType_GrammarError: UIA_ANNOTATIONTYPE = 60002

public val AnnotationType_Header: UIA_ANNOTATIONTYPE = 60006

public val AnnotationType_Highlighted: UIA_ANNOTATIONTYPE = 60008

public val AnnotationType_InsertionChange: UIA_ANNOTATIONTYPE = 60011

public val AnnotationType_Mathematics: UIA_ANNOTATIONTYPE = 60023

public val AnnotationType_MoveChange: UIA_ANNOTATIONTYPE = 60013

public val AnnotationType_Sensitive: UIA_ANNOTATIONTYPE = 60024

public val AnnotationType_SpellingError: UIA_ANNOTATIONTYPE = 60001

public val AnnotationType_TrackChanges: UIA_ANNOTATIONTYPE = 60005

public val AnnotationType_Unknown: UIA_ANNOTATIONTYPE = 60000

public val AnnotationType_UnsyncedChange: UIA_ANNOTATIONTYPE = 60015

public val AnnotationTypes_Property_GUID: GUID = GUID.from_u128(0x64b71f7653c44696uL, 0xa21920e940c9a176uL)

public val Annotation_AdvancedProofingIssue_GUID: GUID = GUID.from_u128(0xdac7b72cc0f24b84uL, 0xb90d5fafc0f0ef1cuL)

public val Annotation_AnnotationTypeId_Property_GUID: GUID = GUID.from_u128(0x20ae484f69ef4c48uL, 0x8f5bc4938b206ac7uL)

public val Annotation_AnnotationTypeName_Property_GUID: GUID = GUID.from_u128(0x9b8188925ac94af9uL, 0xaa96f58a77b058e3uL)

public val Annotation_Author_GUID: GUID = GUID.from_u128(0xf161d3a7f81b4128uL, 0xb17f71f690914520uL)

public val Annotation_Author_Property_GUID: GUID = GUID.from_u128(0x7a5284629c5c4a03uL, 0xa9748b307a9937f2uL)

public val Annotation_CircularReferenceError_GUID: GUID = GUID.from_u128(0x25bd9cf417454659uL, 0xba67727f0318c616uL)

public val Annotation_Comment_GUID: GUID = GUID.from_u128(0xfd2fda3026b34c06uL, 0x8bc798f1532e46fduL)

public val Annotation_ConflictingChange_GUID: GUID = GUID.from_u128(0x98af8802517c459fuL, 0xaf13016d3fab877euL)

public val Annotation_Custom_GUID: GUID = GUID.from_u128(0x9ec8275039314952uL, 0x85bc1dbff78a43e3uL)

public val Annotation_DataValidationError_GUID: GUID = GUID.from_u128(0xc8649fa89775437euL, 0xad46e709d93c2343uL)

public val Annotation_DateTime_Property_GUID: GUID = GUID.from_u128(0x99b5ca5d1acf414buL, 0xa4d06b350b047578uL)

public val Annotation_DeletionChange_GUID: GUID = GUID.from_u128(0xbe3d5b05951d42e7uL, 0x901dadc8c2cf34d0uL)

public val Annotation_EditingLockedChange_GUID: GUID = GUID.from_u128(0xc31f3e1c74234dacuL, 0x834841f099ff6f64uL)

public val Annotation_Endnote_GUID: GUID = GUID.from_u128(0x7565725c2d994839uL, 0x960d33d3b866aba5uL)

public val Annotation_ExternalChange_GUID: GUID = GUID.from_u128(0x75a05b315f1142fduL, 0x887ddfa010db2392uL)

public val Annotation_Footer_GUID: GUID = GUID.from_u128(0xcceab046183347aauL, 0x8080701ed0b0c832uL)

public val Annotation_Footnote_GUID: GUID = GUID.from_u128(0x3de10e21412542dbuL, 0x8620be8083080624uL)

public val Annotation_FormatChange_GUID: GUID = GUID.from_u128(0xeb247345d4f141ceuL, 0x8e52f79b69635e48uL)

public val Annotation_FormulaError_GUID: GUID = GUID.from_u128(0x956119820cab46d5uL, 0xa2f0e30d1905f8bfuL)

public val Annotation_GrammarError_GUID: GUID = GUID.from_u128(0x757a048d451841c6uL, 0x854cdc009b7cfb53uL)

public val Annotation_Header_GUID: GUID = GUID.from_u128(0x867b409bb2164472uL, 0xa219525e310681f8uL)

public val Annotation_Highlighted_GUID: GUID = GUID.from_u128(0x757c884e80834081uL, 0x8b9ce87f5072f0e4uL)

public val Annotation_InsertionChange_GUID: GUID = GUID.from_u128(0xdbeb3a6df154164uL, 0xa3c0e21a8ce931c4uL)

public val Annotation_Mathematics_GUID: GUID = GUID.from_u128(0xeaab634b26d040c1uL, 0x807357ca1c633c9buL)

public val Annotation_MoveChange_GUID: GUID = GUID.from_u128(0x9da587eb23e54490uL, 0xb3851a22ddc8b187uL)

public val Annotation_Pattern_GUID: GUID = GUID.from_u128(0xf6c72ad7356c4850uL, 0x9291316f608a8c84uL)

public val Annotation_Sensitive_GUID: GUID = GUID.from_u128(0x37f4c04f0f124464uL, 0x929c828fd15292e3uL)

public val Annotation_SpellingError_GUID: GUID = GUID.from_u128(0xae85567e9ece423fuL, 0x81b796c43d53e50euL)

public val Annotation_Target_Property_GUID: GUID = GUID.from_u128(0xb71b302d210444aduL, 0x9c5c092b4907d70fuL)

public val Annotation_TrackChanges_GUID: GUID = GUID.from_u128(0x21e6e888dc144016uL, 0xac27190553c8c470uL)

public val Annotation_UnsyncedChange_GUID: GUID = GUID.from_u128(0x1851116a0e474b30uL, 0x8cb5d7dae4fbcd1buL)

public val AppBar_Control_GUID: GUID = GUID.from_u128(0x6114908dcc024d37uL, 0x875bb530c7139554uL)

public val AriaProperties_Property_GUID: GUID = GUID.from_u128(0x4213678ce0254922uL, 0xbeb5e43ba08e6221uL)

public val AriaRole_Property_GUID: GUID = GUID.from_u128(0xdd207b95be4a4e0duL, 0xb72763ace94b6916uL)

public val Assertive: LiveSetting = 2

public val AsyncContentLoadedState_Beginning: AsyncContentLoadedState = 0

public val AsyncContentLoadedState_Completed: AsyncContentLoadedState = 2

public val AsyncContentLoadedState_Progress: AsyncContentLoadedState = 1

public val AsyncContentLoaded_Event_GUID: GUID = GUID.from_u128(0x5fdee11cd2fa4fb9uL, 0x904e5cbee894d5efuL)

public val AutomationElementMode_Full: AutomationElementMode = 1

public val AutomationElementMode_None: AutomationElementMode = 0

public val AutomationFocusChanged_Event_GUID: GUID = GUID.from_u128(0xb68a1f17f60d41a7uL, 0xa3ccb05292155fe0uL)

public val AutomationId_Property_GUID: GUID = GUID.from_u128(0xc82c0500b60e4310uL, 0xa267303c531f8ee5uL)

public val AutomationIdentifierType_Annotation: AutomationIdentifierType = 6

public val AutomationIdentifierType_Changes: AutomationIdentifierType = 7

public val AutomationIdentifierType_ControlType: AutomationIdentifierType = 3

public val AutomationIdentifierType_Event: AutomationIdentifierType = 2

public val AutomationIdentifierType_LandmarkType: AutomationIdentifierType = 5

public val AutomationIdentifierType_Pattern: AutomationIdentifierType = 1

public val AutomationIdentifierType_Property: AutomationIdentifierType = 0

public val AutomationIdentifierType_Style: AutomationIdentifierType = 8

public val AutomationIdentifierType_TextAttribute: AutomationIdentifierType = 4

public val AutomationPropertyChanged_Event_GUID: GUID = GUID.from_u128(0x2527fba18d7a4630uL, 0xa4cce66315942f52uL)

public val BoundingRectangle_Property_GUID: GUID = GUID.from_u128(0x7bbfe8b23bfc48dduL, 0xb729c794b846e9a1uL)

public val BulletStyle_DashBullet: BulletStyle = 5

public val BulletStyle_FilledRoundBullet: BulletStyle = 2

public val BulletStyle_FilledSquareBullet: BulletStyle = 4

public val BulletStyle_HollowRoundBullet: BulletStyle = 1

public val BulletStyle_HollowSquareBullet: BulletStyle = 3

public val BulletStyle_None: BulletStyle = 0

public val BulletStyle_Other: BulletStyle = -1

public val Button_Control_GUID: GUID = GUID.from_u128(0x5a78e369c6a14f33uL, 0xa9d779f20d0c788euL)

public val CAccPropServices: GUID = GUID.from_u128(0xb5f8350b054848b1uL, 0xa6ee88bd00b4a5e7uL)

public val CLSID_AccPropServices: GUID = GUID.from_u128(0xb5f8350b054848b1uL, 0xa6ee88bd00b4a5e7uL)

public val CUIAutomation: GUID = GUID.from_u128(0xff48dba460ef4201uL, 0xaa8754103eef594euL)

public val CUIAutomation8: GUID = GUID.from_u128(0xe22ad333b25f460cuL, 0x83d00581107395c9uL)

public val CUIAutomationRegistrar: GUID = GUID.from_u128(0x6e29fabf997742d1uL, 0x8d0eca7e61ad87e6uL)

public val Calendar_Control_GUID: GUID = GUID.from_u128(0x8913eb8800e546bcuL, 0x8e4e14a786e165a1uL)

public val CapStyle_AllCap: CapStyle = 2

public val CapStyle_AllPetiteCaps: CapStyle = 3

public val CapStyle_None: CapStyle = 0

public val CapStyle_Other: CapStyle = -1

public val CapStyle_PetiteCaps: CapStyle = 4

public val CapStyle_SmallCap: CapStyle = 1

public val CapStyle_Titling: CapStyle = 6

public val CapStyle_Unicase: CapStyle = 5

public val CaretBidiMode_LTR: CaretBidiMode = 0

public val CaretBidiMode_RTL: CaretBidiMode = 1

public val CaretPosition_BeginningOfLine: CaretPosition = 2

public val CaretPosition_EndOfLine: CaretPosition = 1

public val CaretPosition_Unknown: CaretPosition = 0

public val CenterPoint_Property_GUID: GUID = GUID.from_u128(0xcb00c08540c4edbuL, 0x944526359ea69785uL)

public val Changes_Event_GUID: GUID = GUID.from_u128(0x7df26714614f4e05uL, 0x9488716c5ba19436uL)

public val Changes_Summary_GUID: GUID = GUID.from_u128(0x313d65a6e60f4d62uL, 0x986155afd728d207uL)

public val CheckBox_Control_GUID: GUID = GUID.from_u128(0xfb50f922a3db49c0uL, 0x8bc306dad55778e2uL)

public val ClassName_Property_GUID: GUID = GUID.from_u128(0x157b7215894f4b65uL, 0x84e2aac0da08b16buL)

public val ClickablePoint_Property_GUID: GUID = GUID.from_u128(0x196903bb2034818uL, 0xa9f3f08e675f2341uL)

public val CoalesceEventsOptions_Disabled: CoalesceEventsOptions = 0

public val CoalesceEventsOptions_Enabled: CoalesceEventsOptions = 1

public val ComboBox_Control_GUID: GUID = GUID.from_u128(0x54cb426c2f334fffuL, 0xaaa1aef60dac5debuL)

public val ConditionType_And: ConditionType = 3

public val ConditionType_False: ConditionType = 1

public val ConditionType_Not: ConditionType = 5

public val ConditionType_Or: ConditionType = 4

public val ConditionType_Property: ConditionType = 2

public val ConditionType_True: ConditionType = 0

public val ConnectionRecoveryBehaviorOptions_Disabled: ConnectionRecoveryBehaviorOptions = 0

public val ConnectionRecoveryBehaviorOptions_Enabled: ConnectionRecoveryBehaviorOptions = 1

public val ControlType_Property_GUID: GUID = GUID.from_u128(0xca774fea28ac4bc2uL, 0x94caacec6d6c10a3uL)

public val ControllerFor_Property_GUID: GUID = GUID.from_u128(0x51124c8aa5d24f13uL, 0x9be67fa8ba9d3a90uL)

public val Culture_Property_GUID: GUID = GUID.from_u128(0xe2d74f273d794dc2uL, 0xb88b3044963a8afbuL)

public val CustomNavigation_Pattern_GUID: GUID = GUID.from_u128(0xafea938a621e4054uL, 0xbb2c2f46114dac3fuL)

public val Custom_Control_GUID: GUID = GUID.from_u128(0xf29ea0c3adb7430auL, 0xba90e52c7313e6eduL)

public val DISPID_ACC_CHILD: Int = -5002

public val DISPID_ACC_CHILDCOUNT: Int = -5001

public val DISPID_ACC_DEFAULTACTION: Int = -5013

public val DISPID_ACC_DESCRIPTION: Int = -5005

public val DISPID_ACC_DODEFAULTACTION: Int = -5018

public val DISPID_ACC_FOCUS: Int = -5011

public val DISPID_ACC_HELP: Int = -5008

public val DISPID_ACC_HELPTOPIC: Int = -5009

public val DISPID_ACC_HITTEST: Int = -5017

public val DISPID_ACC_KEYBOARDSHORTCUT: Int = -5010

public val DISPID_ACC_LOCATION: Int = -5015

public val DISPID_ACC_NAME: Int = -5003

public val DISPID_ACC_NAVIGATE: Int = -5016

public val DISPID_ACC_PARENT: Int = -5000

public val DISPID_ACC_ROLE: Int = -5006

public val DISPID_ACC_SELECT: Int = -5014

public val DISPID_ACC_SELECTION: Int = -5012

public val DISPID_ACC_STATE: Int = -5007

public val DISPID_ACC_VALUE: Int = -5004

public val DataGrid_Control_GUID: GUID = GUID.from_u128(0x84b783afd1034b0auL, 0x8415e73942410f4buL)

public val DataItem_Control_GUID: GUID = GUID.from_u128(0xa0177842d94f42a5uL, 0x814b6068addc8da5uL)

public val DescribedBy_Property_GUID: GUID = GUID.from_u128(0x7c5865b8999240fduL, 0x8db06bf1d317f998uL)

public val DockPosition_Bottom: DockPosition = 2

public val DockPosition_Fill: DockPosition = 4

public val DockPosition_Left: DockPosition = 1

public val DockPosition_None: DockPosition = 5

public val DockPosition_Right: DockPosition = 3

public val DockPosition_Top: DockPosition = 0

public val Dock_DockPosition_Property_GUID: GUID = GUID.from_u128(0x6d67f02ec0b04b10uL, 0xb5b918d6ecf98760uL)

public val Dock_Pattern_GUID: GUID = GUID.from_u128(0x9cbaa84683c8428duL, 0x827f7e6063fe0620uL)

public val Document_Control_GUID: GUID = GUID.from_u128(0x3cd6bb6f6f084562uL, 0xb229e4e2fc7a9eb4uL)

public val Drag_DragCancel_Event_GUID: GUID = GUID.from_u128(0xc3ede6fa34514e0fuL, 0x9e71df9c280a4657uL)

public val Drag_DragComplete_Event_GUID: GUID = GUID.from_u128(0x38e96188ef1f463euL, 0x91ca3a7792c29cafuL)

public val Drag_DragStart_Event_GUID: GUID = GUID.from_u128(0x883a480b3aa9429duL, 0x95e4d9c8d011f0dduL)

public val Drag_DropEffect_Property_GUID: GUID = GUID.from_u128(0x646f277948d34b23uL, 0x89024bf100005df3uL)

public val Drag_DropEffects_Property_GUID: GUID = GUID.from_u128(0xf5d611567ce649beuL, 0xa8369269dcec920fuL)

public val Drag_GrabbedItems_Property_GUID: GUID = GUID.from_u128(0x77c1562c7b864b21uL, 0x9ed73cefda6f4c43uL)

public val Drag_IsGrabbed_Property_GUID: GUID = GUID.from_u128(0x45f206f375cc4ccauL, 0xa9b9fcdfb982d8a2uL)

public val Drag_Pattern_GUID: GUID = GUID.from_u128(0xc0bee21fccb34feduL, 0x995b114f6e3d2728uL)

public val DropTarget_DragEnter_Event_GUID: GUID = GUID.from_u128(0xaad9319b032c4a88uL, 0x961d1cf579581e34uL)

public val DropTarget_DragLeave_Event_GUID: GUID = GUID.from_u128(0xf82eb1524a24988uL, 0x9217de162aee272buL)

public val DropTarget_DropTargetEffect_Property_GUID: GUID = GUID.from_u128(0x8bb75975a0ca4981uL, 0xb81887fc66e9509duL)

public val DropTarget_DropTargetEffects_Property_GUID: GUID = GUID.from_u128(0xbc1dd4edcb8945f1uL, 0xa592e03b08ae790fuL)

public val DropTarget_Dropped_Event_GUID: GUID = GUID.from_u128(0x622cead81edb4a3duL, 0xabbcbe2211ff68b5uL)

public val DropTarget_Pattern_GUID: GUID = GUID.from_u128(0xbcbec56bd344b7buL, 0x9fd52659905ea3dcuL)

public val Edit_Control_GUID: GUID = GUID.from_u128(0x6504a5c82c864f87uL, 0xae7b1abddc810cf9uL)

public val EventArgsType_ActiveTextPositionChanged: EventArgsType = 8

public val EventArgsType_AsyncContentLoaded: EventArgsType = 3

public val EventArgsType_Changes: EventArgsType = 6

public val EventArgsType_Notification: EventArgsType = 7

public val EventArgsType_PropertyChanged: EventArgsType = 1

public val EventArgsType_Simple: EventArgsType = 0

public val EventArgsType_StructureChanged: EventArgsType = 2

public val EventArgsType_StructuredMarkup: EventArgsType = 9

public val EventArgsType_TextEditTextChanged: EventArgsType = 5

public val EventArgsType_WindowClosed: EventArgsType = 4

public val ExpandCollapseState_Collapsed: ExpandCollapseState = 0

public val ExpandCollapseState_Expanded: ExpandCollapseState = 1

public val ExpandCollapseState_LeafNode: ExpandCollapseState = 3

public val ExpandCollapseState_PartiallyExpanded: ExpandCollapseState = 2

public val ExpandCollapse_ExpandCollapseState_Property_GUID: GUID = GUID.from_u128(0x275a4c4885a74f69uL, 0xaba0af157610002buL)

public val ExpandCollapse_Pattern_GUID: GUID = GUID.from_u128(0xae05efa2f9d1428auL, 0x834c53a5c52f9b8buL)

public val FillColor_Property_GUID: GUID = GUID.from_u128(0x6e0ec4d0e2a84a56uL, 0x9de7953389933b39uL)

public val FillType_Color: FillType = 1

public val FillType_Gradient: FillType = 2

public val FillType_None: FillType = 0

public val FillType_Pattern: FillType = 4

public val FillType_Picture: FillType = 3

public val FillType_Property_GUID: GUID = GUID.from_u128(0xc6fc74e48cb9429cuL, 0xa9e19bc4ac372b62uL)

public val FlowDirections_BottomToTop: FlowDirections = 2

public val FlowDirections_Default: FlowDirections = 0

public val FlowDirections_RightToLeft: FlowDirections = 1

public val FlowDirections_Vertical: FlowDirections = 4

public val FlowsFrom_Property_GUID: GUID = GUID.from_u128(0x5c6844f19de48f8uL, 0x95fa880d5b0fd615uL)

public val FlowsTo_Property_GUID: GUID = GUID.from_u128(0xe4f33d20559a47fbuL, 0xa830f9cb4ff1a70auL)

public val FrameworkId_Property_GUID: GUID = GUID.from_u128(0xdbfd99007e1a4f58uL, 0xb61b7063120f773buL)

public val FullDescription_Property_GUID: GUID = GUID.from_u128(0xd4450ff6aef4f33uL, 0x95dd7befa72a4391uL)

public val GridItem_ColumnSpan_Property_GUID: GUID = GUID.from_u128(0x583ea3f586d04b08uL, 0xa6ec2c5463ffc109uL)

public val GridItem_Column_Property_GUID: GUID = GUID.from_u128(0xc774c15c62c04519uL, 0x8bdc47be573c8ad5uL)

public val GridItem_Parent_Property_GUID: GUID = GUID.from_u128(0x9d912252b97f4eccuL, 0x8510ea0e33427c72uL)

public val GridItem_Pattern_GUID: GUID = GUID.from_u128(0xf2d5c877a4624957uL, 0xa2a52c96b303bc63uL)

public val GridItem_RowSpan_Property_GUID: GUID = GUID.from_u128(0x4582291c466b4e93uL, 0x8e833d1715ec0c5euL)

public val GridItem_Row_Property_GUID: GUID = GUID.from_u128(0x6223972ac9454563uL, 0x9329fdc974af2553uL)

public val Grid_ColumnCount_Property_GUID: GUID = GUID.from_u128(0xfe96f37544aa4536uL, 0xac7a2a75d71a3efcuL)

public val Grid_Pattern_GUID: GUID = GUID.from_u128(0x260a2ccb93a84e44uL, 0xa4c13df397f2b02buL)

public val Grid_RowCount_Property_GUID: GUID = GUID.from_u128(0x2a9505bfc2eb4fb6uL, 0xb3568245ae53703euL)

public val Group_Control_GUID: GUID = GUID.from_u128(0xad50aa1ce8c84774uL, 0xae1bdd86df0b3bdcuL)

public val HCF_AVAILABLE: HIGHCONTRASTW_FLAGS = 2u

public val HCF_CONFIRMHOTKEY: HIGHCONTRASTW_FLAGS = 8u

public val HCF_HIGHCONTRASTON: HIGHCONTRASTW_FLAGS = 1u

public val HCF_HOTKEYACTIVE: HIGHCONTRASTW_FLAGS = 4u

public val HCF_HOTKEYAVAILABLE: HIGHCONTRASTW_FLAGS = 64u

public val HCF_HOTKEYSOUND: HIGHCONTRASTW_FLAGS = 16u

public val HCF_INDICATOR: HIGHCONTRASTW_FLAGS = 32u

public val HCF_OPTION_NOTHEMECHANGE: HIGHCONTRASTW_FLAGS = 4096u

public val HasKeyboardFocus_Property_GUID: GUID = GUID.from_u128(0xcf8afd393f464800uL, 0x9656b2bf12529905uL)

public val HeaderItem_Control_GUID: GUID = GUID.from_u128(0xe6bc12cb7c8e49cfuL, 0xb1684a93a32bebb0uL)

public val Header_Control_GUID: GUID = GUID.from_u128(0x5b90cbce78fb4614uL, 0x82b6554d74718e67uL)

public val HeadingLevel1: UIA_HEADINGLEVEL_ID = 80051

public val HeadingLevel2: UIA_HEADINGLEVEL_ID = 80052

public val HeadingLevel3: UIA_HEADINGLEVEL_ID = 80053

public val HeadingLevel4: UIA_HEADINGLEVEL_ID = 80054

public val HeadingLevel5: UIA_HEADINGLEVEL_ID = 80055

public val HeadingLevel6: UIA_HEADINGLEVEL_ID = 80056

public val HeadingLevel7: UIA_HEADINGLEVEL_ID = 80057

public val HeadingLevel8: UIA_HEADINGLEVEL_ID = 80058

public val HeadingLevel9: UIA_HEADINGLEVEL_ID = 80059

public val HeadingLevel_None: UIA_HEADINGLEVEL_ID = 80050

public val HeadingLevel_Property_GUID: GUID = GUID.from_u128(0x29084272aaaf4a30uL, 0x87963c12f62b6bbbuL)

public val HelpText_Property_GUID: GUID = GUID.from_u128(0x8555685097745c7uL, 0xa7a6abaf5684121auL)

public val HorizontalTextAlignment_Centered: HorizontalTextAlignment = 1

public val HorizontalTextAlignment_Justified: HorizontalTextAlignment = 3

public val HorizontalTextAlignment_Left: HorizontalTextAlignment = 0

public val HorizontalTextAlignment_Right: HorizontalTextAlignment = 2

public val HostedFragmentRootsInvalidated_Event_GUID: GUID = GUID.from_u128(0xe6bdb03e09214ec5uL, 0x8dcfeae877b0426buL)

public val Hyperlink_Control_GUID: GUID = GUID.from_u128(0x8a56022cb00d4d15uL, 0x8ff05b6b266e5e02uL)

public val IIS_ControlAccessible: GUID = GUID.from_u128(0x38c682a6973143f2uL, 0x9faee901e641b101uL)

public val IIS_IsOleaccProxy: GUID = GUID.from_u128(0x902697fa80e44560uL, 0x802aa13f22a64709uL)

public val Image_Control_GUID: GUID = GUID.from_u128(0x2d3736e46b164c57uL, 0xa962f93260a75243uL)

public val InputDiscarded_Event_GUID: GUID = GUID.from_u128(0x7f36c3677b18417cuL, 0x97e39d58ddc944abuL)

public val InputReachedOtherElement_Event_GUID: GUID = GUID.from_u128(0xed201d8a4e6c415euL, 0xa8742460c9b66ba8uL)

public val InputReachedTarget_Event_GUID: GUID = GUID.from_u128(0x93ed549a054940f0uL, 0xbedb28e44f7de2a3uL)

public val Invoke_Invoked_Event_GUID: GUID = GUID.from_u128(0xdfd699f0c91549dduL, 0xb422dde785c3d24buL)

public val Invoke_Pattern_GUID: GUID = GUID.from_u128(0xd976c2fc66ea4a6euL, 0xb28fc24c7546ad37uL)

public val IsAnnotationPatternAvailable_Property_GUID: GUID = GUID.from_u128(0xb5b32386d5c41b6uL, 0xbcc45e807f6551c4uL)

public val IsContentElement_Property_GUID: GUID = GUID.from_u128(0x4bda64a8f5d8480buL, 0x8155ef2e89adb672uL)

public val IsControlElement_Property_GUID: GUID = GUID.from_u128(0x95f35085abcc4afduL, 0xa5f4dbb46c230fdbuL)

public val IsCustomNavigationPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x8f8e80d4235148e0uL, 0x874a54aa7313889auL)

public val IsDataValidForForm_Property_GUID: GUID = GUID.from_u128(0x445ac684c3fc4dd9uL, 0xacf8845a579296bauL)

public val IsDialog_Property_GUID: GUID = GUID.from_u128(0x9d0dfb9b84364501uL, 0xbbbbe534a4fb3b3fuL)

public val IsDockPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x2600a4c42ff84c96uL, 0xae318fe619a13c6cuL)

public val IsDragPatternAvailable_Property_GUID: GUID = GUID.from_u128(0xe997a7b71d394ca7uL, 0xbe0f277fcf5605ccuL)

public val IsDropTargetPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x686b62e8e194aafuL, 0x873d384f6d3b92beuL)

public val IsEnabled_Property_GUID: GUID = GUID.from_u128(0x2109427fda604feduL, 0xbf1b264bdce6eb3auL)

public val IsExpandCollapsePatternAvailable_Property_GUID: GUID = GUID.from_u128(0x929d380652874725uL, 0xaa16222afc63d595uL)

public val IsGridItemPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x5a43e524f9a24b12uL, 0x84c8b48a3efedd34uL)

public val IsGridPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x5622c26cf0ef4f3buL, 0x97cb714c0868588buL)

public val IsInvokePatternAvailable_Property_GUID: GUID = GUID.from_u128(0x4e72573883644679uL, 0xaa6cf3f41931f750uL)

public val IsItemContainerPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x624b5ca7fe404957uL, 0xa01920c4cf11920fuL)

public val IsKeyboardFocusable_Property_GUID: GUID = GUID.from_u128(0xf7b8552a08594b37uL, 0xb9cb51e72092f29fuL)

public val IsLegacyIAccessiblePatternAvailable_Property_GUID: GUID = GUID.from_u128(0xd8ebd0c7929a4ee7uL, 0x8d3ad3d94413027buL)

public val IsMultipleViewPatternAvailable_Property_GUID: GUID = GUID.from_u128(0xff0a31eb8e25469duL, 0x8d6ee771a27c1b90uL)

public val IsObjectModelPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x6b21d89b2841412fuL, 0x8ef215ca952318bauL)

public val IsOffscreen_Property_GUID: GUID = GUID.from_u128(0x3c3d160db7942dbuL, 0xa2ef1c231eede507uL)

public val IsPassword_Property_GUID: GUID = GUID.from_u128(0xe8482eb1687c497buL, 0xbebc03be53ec1454uL)

public val IsPeripheral_Property_GUID: GUID = GUID.from_u128(0xda7582767ed549d4uL, 0x8e68ecc9a2d300dduL)

public val IsRangeValuePatternAvailable_Property_GUID: GUID = GUID.from_u128(0xfda4244aeb4d43ffuL, 0xb5aded36d373ec4cuL)

public val IsRequiredForForm_Property_GUID: GUID = GUID.from_u128(0x4f5f43cf59fb4bdeuL, 0xa270602e5e1141e9uL)

public val IsScrollItemPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x1cad1a0509274b76uL, 0x97e10fcdb209b98auL)

public val IsScrollPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x3ebb7b4a828a4b57uL, 0x9d222fea1632ed0duL)

public val IsSelectionItemPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x8becd62d0bc34109uL, 0xbee28e6715290e68uL)

public val IsSelectionPattern2Available_Property_GUID: GUID = GUID.from_u128(0x490806fb6e894a47uL, 0x8319d266e511f021uL)

public val IsSelectionPatternAvailable_Property_GUID: GUID = GUID.from_u128(0xf588acbec7694838uL, 0x9a602686dc1188c4uL)

public val IsSpreadsheetItemPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x9fe79b2a2f9443fduL, 0x996b549e316f4acduL)

public val IsSpreadsheetPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x6ff43732e4b44555uL, 0x97bcecdbbc4d1888uL)

public val IsStructuredMarkupPatternAvailable_Property_GUID: GUID = GUID.from_u128(0xb0d4c1962c0b489cuL, 0xb165a405928c6f3duL)

public val IsStylesPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x27f353d3459c4b59uL, 0xa49050611dacafb5uL)

public val IsSynchronizedInputPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x75d69cc5d2bf4943uL, 0x876eb45b62a6cc66uL)

public val IsTableItemPatternAvailable_Property_GUID: GUID = GUID.from_u128(0xeb36b40d8ea4489buL, 0xa013e60d5951fe34uL)

public val IsTablePatternAvailable_Property_GUID: GUID = GUID.from_u128(0xcb83575f45c24048uL, 0x9c76159715a139dfuL)

public val IsTextChildPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x559e65df30ff43b5uL, 0xb5ed5b283b80c7e9uL)

public val IsTextEditPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x7843425c8b32484cuL, 0x9ab5e3200571ffdauL)

public val IsTextPattern2Available_Property_GUID: GUID = GUID.from_u128(0x41cf921de3f14b22uL, 0x9c81e1c3ed331c22uL)

public val IsTextPatternAvailable_Property_GUID: GUID = GUID.from_u128(0xfbe2d69daff64a45uL, 0x82e2fc92a82f5917uL)

public val IsTogglePatternAvailable_Property_GUID: GUID = GUID.from_u128(0x78686d53fcd04b83uL, 0x9b785832ce63bb5buL)

public val IsTransformPattern2Available_Property_GUID: GUID = GUID.from_u128(0x25980b4bbe044710uL, 0xab4afda31dbd2895uL)

public val IsTransformPatternAvailable_Property_GUID: GUID = GUID.from_u128(0xa7f78804d68b4077uL, 0xa5c67a5ea1ac31c5uL)

public val IsValuePatternAvailable_Property_GUID: GUID = GUID.from_u128(0xb5020a72119473buL, 0xbe375ceb98bbfb22uL)

public val IsVirtualizedItemPatternAvailable_Property_GUID: GUID = GUID.from_u128(0x302cb1512ac845d6uL, 0x977bd2b3a5a53f20uL)

public val IsWindowPatternAvailable_Property_GUID: GUID = GUID.from_u128(0xe7a57bb158884155uL, 0x98dcb422fd57f2bcuL)

public val ItemContainer_Pattern_GUID: GUID = GUID.from_u128(0x3d13da0f8b9a4a99uL, 0x85fac5c9a69f1ed4uL)

public val ItemStatus_Property_GUID: GUID = GUID.from_u128(0x51de0321397343e7uL, 0x89130b08e813c37fuL)

public val ItemType_Property_GUID: GUID = GUID.from_u128(0xcdda434d6222413buL, 0xa68a325dd1d40f39uL)

public val LIBID_Accessibility: GUID = GUID.from_u128(0x1ea4dbf03c3b11cfuL, 0x810c00aa00389b71uL)

public val LabeledBy_Property_GUID: GUID = GUID.from_u128(0xe5b8924bfc8a4a35uL, 0x8031cf78ac43e55euL)

public val LandmarkType_Property_GUID: GUID = GUID.from_u128(0x454045f26f6149f7uL, 0xa4f8b5f0cf82da1euL)

public val LayoutInvalidated_Event_GUID: GUID = GUID.from_u128(0xed7d6544a6bd4595uL, 0x9bae3d28946cc715uL)

public val LegacyIAccessible_ChildId_Property_GUID: GUID = GUID.from_u128(0x9a191b5d9ef24787uL, 0xa459dcde885dd4e8uL)

public val LegacyIAccessible_DefaultAction_Property_GUID: GUID = GUID.from_u128(0x3b331729eaad4502uL, 0xb85f92615622913cuL)

public val LegacyIAccessible_Description_Property_GUID: GUID = GUID.from_u128(0x464484187d704ea9uL, 0x9d27b7e775cf2ad7uL)

public val LegacyIAccessible_Help_Property_GUID: GUID = GUID.from_u128(0x94402352161c4b77uL, 0xa98da872cc33947auL)

public val LegacyIAccessible_KeyboardShortcut_Property_GUID: GUID = GUID.from_u128(0x8f6909ac00b84259uL, 0xa41c966266d43a8auL)

public val LegacyIAccessible_Name_Property_GUID: GUID = GUID.from_u128(0xcaeb063d40ae4869uL, 0xaa5a1b8e5d666739uL)

public val LegacyIAccessible_Pattern_GUID: GUID = GUID.from_u128(0x54cc0a9f339548afuL, 0xba8d73f85690f3e0uL)

public val LegacyIAccessible_Role_Property_GUID: GUID = GUID.from_u128(0x6856e59fcbaf4e31uL, 0x93e8bcbf6f7e491cuL)

public val LegacyIAccessible_Selection_Property_GUID: GUID = GUID.from_u128(0x8aa8b1e0089140ccuL, 0x8b0690d7d4166219uL)

public val LegacyIAccessible_State_Property_GUID: GUID = GUID.from_u128(0xdf98585422814340uL, 0xab9cc60e2c5803f6uL)

public val LegacyIAccessible_Value_Property_GUID: GUID = GUID.from_u128(0xb5c5b0b682174a77uL, 0x97a5190a85ed0156uL)

public val Level_Property_GUID: GUID = GUID.from_u128(0x242ac529cd36400fuL, 0xaad97876ef3af627uL)

public val ListItem_Control_GUID: GUID = GUID.from_u128(0x7b3717f244d14a58uL, 0x98a8f12a9b8f78e2uL)

public val List_Control_GUID: GUID = GUID.from_u128(0x9b149ee17cca4cfcuL, 0x9af1cac7bddd3031uL)

public val LiveRegionChanged_Event_GUID: GUID = GUID.from_u128(0x102d5e90e6a941b6uL, 0xb1c5a9b1929d9510uL)

public val LiveSetting_Property_GUID: GUID = GUID.from_u128(0xc12bcd8e2a8e4950uL, 0x8ae73625111d58ebuL)

public val LocalizedControlType_Property_GUID: GUID = GUID.from_u128(0x8763404fa1bd452auL, 0x89c43f01d3833806uL)

public val LocalizedLandmarkType_Property_GUID: GUID = GUID.from_u128(0x7ac81980eafb4fb2uL, 0xbf91f485bef5e8e1uL)

public val MSAA_MENU_SIG: Int = -1441927155

public val MenuBar_Control_GUID: GUID = GUID.from_u128(0xcc3842500e7b4ae8uL, 0x95aea08f261b52eeuL)

public val MenuClosed_Event_GUID: GUID = GUID.from_u128(0x3cf1266e15824041uL, 0xacd788a35a965297uL)

public val MenuItem_Control_GUID: GUID = GUID.from_u128(0xf45225d3d0a049d8uL, 0x98349a000d2aeddcuL)

public val MenuModeEnd_Event_GUID: GUID = GUID.from_u128(0x9ecd4c9f80dd47b8uL, 0x82675aec06bb2cffuL)

public val MenuModeStart_Event_GUID: GUID = GUID.from_u128(0x18d7c631166a4ac9uL, 0xae3bef4b5420e681uL)

public val MenuOpened_Event_GUID: GUID = GUID.from_u128(0xebe2e94566ca4ed1uL, 0x9ff82ad7df0a1b08uL)

public val Menu_Control_GUID: GUID = GUID.from_u128(0x2e9b14400ea841fduL, 0xb374c1ea6f503cd1uL)

public val MultipleView_CurrentView_Property_GUID: GUID = GUID.from_u128(0x7a81a67ab94f4875uL, 0x918b65c8d2f998e5uL)

public val MultipleView_Pattern_GUID: GUID = GUID.from_u128(0x547a6ae4113f47c4uL, 0x850fdb4dfa466b1duL)

public val MultipleView_SupportedViews_Property_GUID: GUID = GUID.from_u128(0x8d5db9fdce3c4ae7uL, 0xb788400a3c645547uL)

public val NAVDIR_DOWN: UInt = 2u

public val NAVDIR_FIRSTCHILD: UInt = 7u

public val NAVDIR_LASTCHILD: UInt = 8u

public val NAVDIR_LEFT: UInt = 3u

public val NAVDIR_MAX: UInt = 9u

public val NAVDIR_MIN: UInt = 0u

public val NAVDIR_NEXT: UInt = 5u

public val NAVDIR_PREVIOUS: UInt = 6u

public val NAVDIR_RIGHT: UInt = 4u

public val NAVDIR_UP: UInt = 1u

public val Name_Property_GUID: GUID = GUID.from_u128(0xc3a6921b4a9944f1uL, 0xbca661187052c431uL)

public val NavigateDirection_FirstChild: NavigateDirection = 3

public val NavigateDirection_LastChild: NavigateDirection = 4

public val NavigateDirection_NextSibling: NavigateDirection = 1

public val NavigateDirection_Parent: NavigateDirection = 0

public val NavigateDirection_PreviousSibling: NavigateDirection = 2

public val NewNativeWindowHandle_Property_GUID: GUID = GUID.from_u128(0x5196b33b380a4982uL, 0x95e191f3ef60e024uL)

public val NormalizeState_Custom: NormalizeState = 2

public val NormalizeState_None: NormalizeState = 0

public val NormalizeState_View: NormalizeState = 1

public val NotificationKind_ActionAborted: NotificationKind = 3

public val NotificationKind_ActionCompleted: NotificationKind = 2

public val NotificationKind_ItemAdded: NotificationKind = 0

public val NotificationKind_ItemRemoved: NotificationKind = 1

public val NotificationKind_Other: NotificationKind = 4

public val NotificationProcessing_All: NotificationProcessing = 2

public val NotificationProcessing_CurrentThenMostRecent: NotificationProcessing = 4

public val NotificationProcessing_ImportantAll: NotificationProcessing = 0

public val NotificationProcessing_ImportantMostRecent: NotificationProcessing = 1

public val NotificationProcessing_MostRecent: NotificationProcessing = 3

public val Notification_Event_GUID: GUID = GUID.from_u128(0x72c5a2f79788480fuL, 0xb8eb4dee00f6186fuL)

public val ObjectModel_Pattern_GUID: GUID = GUID.from_u128(0x3e04acfe08fc47ecuL, 0x96bc353fa3b34aa7uL)

public val Off: LiveSetting = 0

public val OptimizeForVisualContent_Property_GUID: GUID = GUID.from_u128(0x6a852250c75a4e5duL, 0xb858e381b0f78861uL)

public val OrientationType_Horizontal: OrientationType = 1

public val OrientationType_None: OrientationType = 0

public val OrientationType_Vertical: OrientationType = 2

public val Orientation_Property_GUID: GUID = GUID.from_u128(0xa01eee6238844415uL, 0x887e678ec21e39bauL)

public val OutlineColor_Property_GUID: GUID = GUID.from_u128(0xc395d6c04b554762uL, 0xa073fd303a634f52uL)

public val OutlineStyles_Embossed: OutlineStyles = 8

public val OutlineStyles_Engraved: OutlineStyles = 4

public val OutlineStyles_None: OutlineStyles = 0

public val OutlineStyles_Outline: OutlineStyles = 1

public val OutlineStyles_Shadow: OutlineStyles = 2

public val OutlineThickness_Property_GUID: GUID = GUID.from_u128(0x13e67cc7dac24888uL, 0xbdd3375c62fa9618uL)

public val PROPID_ACC_DEFAULTACTION: GUID = GUID.from_u128(0x180c072bc27f43c7uL, 0x9922f63562a4632buL)

public val PROPID_ACC_DESCRIPTION: GUID = GUID.from_u128(0x4d48dfe4bd3f491fuL, 0xa648492d6f20c588uL)

public val PROPID_ACC_DESCRIPTIONMAP: GUID = GUID.from_u128(0x1ff1435f8a14477buL, 0xb226a0abe279975duL)

public val PROPID_ACC_DODEFAULTACTION: GUID = GUID.from_u128(0x1ba095232e3b49a6uL, 0xa05959682a3c48fduL)

public val PROPID_ACC_FOCUS: GUID = GUID.from_u128(0x6eb335df1c294127uL, 0xb12cdee9fd157f2buL)

public val PROPID_ACC_HELP: GUID = GUID.from_u128(0xc831e11f44db4a99uL, 0x9768cb8f978b7231uL)

public val PROPID_ACC_HELPTOPIC: GUID = GUID.from_u128(0x787d13798ede440buL, 0x8aec11f7bf9030b3uL)

public val PROPID_ACC_KEYBOARDSHORTCUT: GUID = GUID.from_u128(0x7d9bceee7d1e4979uL, 0x93825180f4172c34uL)

public val PROPID_ACC_NAME: GUID = GUID.from_u128(0x608d3df881284aa7uL, 0xa428f55e49267291uL)

public val PROPID_ACC_NAV_DOWN: GUID = GUID.from_u128(0x31670ed3cdf48d2uL, 0x9613138f2dd8a668uL)

public val PROPID_ACC_NAV_FIRSTCHILD: GUID = GUID.from_u128(0xcfd02558557b4c67uL, 0x84f92a09fce40749uL)

public val PROPID_ACC_NAV_LASTCHILD: GUID = GUID.from_u128(0x302ecaa548d54f8duL, 0xb6711a8d20a77832uL)

public val PROPID_ACC_NAV_LEFT: GUID = GUID.from_u128(0x228086cb82f14a39uL, 0x8705dcdc0fff92f5uL)

public val PROPID_ACC_NAV_NEXT: GUID = GUID.from_u128(0x1cdc54558cd94c92uL, 0xa3713939a2fe3eeeuL)

public val PROPID_ACC_NAV_PREV: GUID = GUID.from_u128(0x776d3891c73b4480uL, 0xb3f6076a16a15af6uL)

public val PROPID_ACC_NAV_RIGHT: GUID = GUID.from_u128(0xcd211d9fe1cb4fe5uL, 0xa77c920b884d095buL)

public val PROPID_ACC_NAV_UP: GUID = GUID.from_u128(0x16e1a2b1a4e4767uL, 0x86123386f66935ecuL)

public val PROPID_ACC_PARENT: GUID = GUID.from_u128(0x474c22b6ffc2467auL, 0xb1b5e958b4657330uL)

public val PROPID_ACC_ROLE: GUID = GUID.from_u128(0xcb905ff27bd14c05uL, 0xb3c8e6c241364d70uL)

public val PROPID_ACC_ROLEMAP: GUID = GUID.from_u128(0xf79acda2140d4fe6uL, 0x8914208476328269uL)

public val PROPID_ACC_SELECTION: GUID = GUID.from_u128(0xb99d073cd731405buL, 0x9061d95e8f842984uL)

public val PROPID_ACC_STATE: GUID = GUID.from_u128(0xa8d4d5b00a2142d0uL, 0xa5c0514e984f457buL)

public val PROPID_ACC_STATEMAP: GUID = GUID.from_u128(0x43946c5e0ac04042uL, 0xb52507bbdbe17fa7uL)

public val PROPID_ACC_VALUE: GUID = GUID.from_u128(0x123fe443211a4615uL, 0x9527c45a7e93717auL)

public val PROPID_ACC_VALUEMAP: GUID = GUID.from_u128(0xda1c3d79fc5c420euL, 0xb3999d1533549e75uL)

public val Pane_Control_GUID: GUID = GUID.from_u128(0x5c2b3f5b918242a3uL, 0x8dec8c04c1ee634duL)

public val Polite: LiveSetting = 1

public val PositionInSet_Property_GUID: GUID = GUID.from_u128(0x33d1dc54641e4d76uL, 0xa6b113f341c1f896uL)

public val ProcessId_Property_GUID: GUID = GUID.from_u128(0x404999989c314245uL, 0xa40387320e59eaf6uL)

public val ProgressBar_Control_GUID: GUID = GUID.from_u128(0x228c9f86c36c47bbuL, 0x9fb6a5834bfc53a4uL)

public val PropertyConditionFlags_IgnoreCase: PropertyConditionFlags = 1

public val PropertyConditionFlags_MatchSubstring: PropertyConditionFlags = 2

public val PropertyConditionFlags_None: PropertyConditionFlags = 0

public val ProviderDescription_Property_GUID: GUID = GUID.from_u128(0xdca5708ac16b4cd9uL, 0xb889beb16a804904uL)

public val ProviderOptions_ClientSideProvider: ProviderOptions = 1

public val ProviderOptions_HasNativeIAccessible: ProviderOptions = 128

public val ProviderOptions_NonClientAreaProvider: ProviderOptions = 4

public val ProviderOptions_OverrideProvider: ProviderOptions = 8

public val ProviderOptions_ProviderOwnsSetFocus: ProviderOptions = 16

public val ProviderOptions_RefuseNonClientSupport: ProviderOptions = 64

public val ProviderOptions_ServerSideProvider: ProviderOptions = 2

public val ProviderOptions_UseClientCoordinates: ProviderOptions = 256

public val ProviderOptions_UseComThreading: ProviderOptions = 32

public val ProviderType_BaseHwnd: ProviderType = 0

public val ProviderType_NonClientArea: ProviderType = 2

public val ProviderType_Proxy: ProviderType = 1

public val ROLE_SYSTEM_ALERT: UInt = 8u

public val ROLE_SYSTEM_ANIMATION: UInt = 54u

public val ROLE_SYSTEM_APPLICATION: UInt = 14u

public val ROLE_SYSTEM_BORDER: UInt = 19u

public val ROLE_SYSTEM_BUTTONDROPDOWN: UInt = 56u

public val ROLE_SYSTEM_BUTTONDROPDOWNGRID: UInt = 58u

public val ROLE_SYSTEM_BUTTONMENU: UInt = 57u

public val ROLE_SYSTEM_CARET: UInt = 7u

public val ROLE_SYSTEM_CELL: UInt = 29u

public val ROLE_SYSTEM_CHARACTER: UInt = 32u

public val ROLE_SYSTEM_CHART: UInt = 17u

public val ROLE_SYSTEM_CHECKBUTTON: UInt = 44u

public val ROLE_SYSTEM_CLIENT: UInt = 10u

public val ROLE_SYSTEM_CLOCK: UInt = 61u

public val ROLE_SYSTEM_COLUMN: UInt = 27u

public val ROLE_SYSTEM_COLUMNHEADER: UInt = 25u

public val ROLE_SYSTEM_COMBOBOX: UInt = 46u

public val ROLE_SYSTEM_CURSOR: UInt = 6u

public val ROLE_SYSTEM_DIAGRAM: UInt = 53u

public val ROLE_SYSTEM_DIAL: UInt = 49u

public val ROLE_SYSTEM_DIALOG: UInt = 18u

public val ROLE_SYSTEM_DOCUMENT: UInt = 15u

public val ROLE_SYSTEM_DROPLIST: UInt = 47u

public val ROLE_SYSTEM_EQUATION: UInt = 55u

public val ROLE_SYSTEM_GRAPHIC: UInt = 40u

public val ROLE_SYSTEM_GRIP: UInt = 4u

public val ROLE_SYSTEM_GROUPING: UInt = 20u

public val ROLE_SYSTEM_HELPBALLOON: UInt = 31u

public val ROLE_SYSTEM_HOTKEYFIELD: UInt = 50u

public val ROLE_SYSTEM_INDICATOR: UInt = 39u

public val ROLE_SYSTEM_IPADDRESS: UInt = 63u

public val ROLE_SYSTEM_LINK: UInt = 30u

public val ROLE_SYSTEM_LIST: UInt = 33u

public val ROLE_SYSTEM_LISTITEM: UInt = 34u

public val ROLE_SYSTEM_MENUBAR: UInt = 2u

public val ROLE_SYSTEM_MENUITEM: UInt = 12u

public val ROLE_SYSTEM_MENUPOPUP: UInt = 11u

public val ROLE_SYSTEM_OUTLINE: UInt = 35u

public val ROLE_SYSTEM_OUTLINEBUTTON: UInt = 64u

public val ROLE_SYSTEM_OUTLINEITEM: UInt = 36u

public val ROLE_SYSTEM_PAGETAB: UInt = 37u

public val ROLE_SYSTEM_PAGETABLIST: UInt = 60u

public val ROLE_SYSTEM_PANE: UInt = 16u

public val ROLE_SYSTEM_PROGRESSBAR: UInt = 48u

public val ROLE_SYSTEM_PROPERTYPAGE: UInt = 38u

public val ROLE_SYSTEM_PUSHBUTTON: UInt = 43u

public val ROLE_SYSTEM_RADIOBUTTON: UInt = 45u

public val ROLE_SYSTEM_ROW: UInt = 28u

public val ROLE_SYSTEM_ROWHEADER: UInt = 26u

public val ROLE_SYSTEM_SCROLLBAR: UInt = 3u

public val ROLE_SYSTEM_SEPARATOR: UInt = 21u

public val ROLE_SYSTEM_SLIDER: UInt = 51u

public val ROLE_SYSTEM_SOUND: UInt = 5u

public val ROLE_SYSTEM_SPINBUTTON: UInt = 52u

public val ROLE_SYSTEM_SPLITBUTTON: UInt = 62u

public val ROLE_SYSTEM_STATICTEXT: UInt = 41u

public val ROLE_SYSTEM_STATUSBAR: UInt = 23u

public val ROLE_SYSTEM_TABLE: UInt = 24u

public val ROLE_SYSTEM_TEXT: UInt = 42u

public val ROLE_SYSTEM_TITLEBAR: UInt = 1u

public val ROLE_SYSTEM_TOOLBAR: UInt = 22u

public val ROLE_SYSTEM_TOOLTIP: UInt = 13u

public val ROLE_SYSTEM_WHITESPACE: UInt = 59u

public val ROLE_SYSTEM_WINDOW: UInt = 9u

public val RadioButton_Control_GUID: GUID = GUID.from_u128(0x3bdb49dbfe2c4483uL, 0xb3e1e57f219440c6uL)

public val RangeValue_IsReadOnly_Property_GUID: GUID = GUID.from_u128(0x25fa1055debf4373uL, 0xa79e1f1a1908d3c4uL)

public val RangeValue_LargeChange_Property_GUID: GUID = GUID.from_u128(0xa1f963253a3d4b44uL, 0x8e1f4a46d9844019uL)

public val RangeValue_Maximum_Property_GUID: GUID = GUID.from_u128(0x19319914f9794b35uL, 0xa1a6d37e05433473uL)

public val RangeValue_Minimum_Property_GUID: GUID = GUID.from_u128(0x78cbd3b2684d4860uL, 0xaf93d1f95cb022fduL)

public val RangeValue_Pattern_GUID: GUID = GUID.from_u128(0x18b00d87b1c9476auL, 0xbfbd5f0bdb926f63uL)

public val RangeValue_SmallChange_Property_GUID: GUID = GUID.from_u128(0x81c2c45739414107uL, 0x9975139760f7c072uL)

public val RangeValue_Value_Property_GUID: GUID = GUID.from_u128(0x131f5d98c50c489duL, 0xabe5ae220898c5f7uL)

public val Rotation_Property_GUID: GUID = GUID.from_u128(0x767cdc7daec04110uL, 0xad3230edd403492euL)

public val RowOrColumnMajor_ColumnMajor: RowOrColumnMajor = 1

public val RowOrColumnMajor_Indeterminate: RowOrColumnMajor = 2

public val RowOrColumnMajor_RowMajor: RowOrColumnMajor = 0

public val RuntimeId_Property_GUID: GUID = GUID.from_u128(0xa39eebfa7fba4c89uL, 0xb4d4b99e2de7d160uL)

public val SELFLAG_ADDSELECTION: UInt = 8u

public val SELFLAG_EXTENDSELECTION: UInt = 4u

public val SELFLAG_NONE: UInt = 0u

public val SELFLAG_REMOVESELECTION: UInt = 16u

public val SELFLAG_TAKEFOCUS: UInt = 1u

public val SELFLAG_TAKESELECTION: UInt = 2u

public val SELFLAG_VALID: UInt = 31u

public val SERKF_AVAILABLE: SERIALKEYS_FLAGS = 2u

public val SERKF_INDICATOR: SERIALKEYS_FLAGS = 4u

public val SERKF_SERIALKEYSON: SERIALKEYS_FLAGS = 1u

public val SID_ControlElementProvider: GUID = GUID.from_u128(0xf4791d68e2544ba3uL, 0x9a5326a5c5497946uL)

public val SID_IsUIAutomationObject: GUID = GUID.from_u128(0xb96fdb8572044724uL, 0x842bc7059dedb9d0uL)

public val SKF_AUDIBLEFEEDBACK: STICKYKEYS_FLAGS = 64u

public val SKF_AVAILABLE: STICKYKEYS_FLAGS = 2u

public val SKF_CONFIRMHOTKEY: STICKYKEYS_FLAGS = 8u

public val SKF_HOTKEYACTIVE: STICKYKEYS_FLAGS = 4u

public val SKF_HOTKEYSOUND: STICKYKEYS_FLAGS = 16u

public val SKF_INDICATOR: STICKYKEYS_FLAGS = 32u

public val SKF_LALTLATCHED: STICKYKEYS_FLAGS = 268435456u

public val SKF_LALTLOCKED: STICKYKEYS_FLAGS = 1048576u

public val SKF_LCTLLATCHED: STICKYKEYS_FLAGS = 67108864u

public val SKF_LCTLLOCKED: STICKYKEYS_FLAGS = 262144u

public val SKF_LSHIFTLATCHED: STICKYKEYS_FLAGS = 16777216u

public val SKF_LSHIFTLOCKED: STICKYKEYS_FLAGS = 65536u

public val SKF_LWINLATCHED: STICKYKEYS_FLAGS = 1073741824u

public val SKF_LWINLOCKED: STICKYKEYS_FLAGS = 4194304u

public val SKF_RALTLATCHED: STICKYKEYS_FLAGS = 536870912u

public val SKF_RALTLOCKED: STICKYKEYS_FLAGS = 2097152u

public val SKF_RCTLLATCHED: STICKYKEYS_FLAGS = 134217728u

public val SKF_RCTLLOCKED: STICKYKEYS_FLAGS = 524288u

public val SKF_RSHIFTLATCHED: STICKYKEYS_FLAGS = 33554432u

public val SKF_RSHIFTLOCKED: STICKYKEYS_FLAGS = 131072u

public val SKF_RWINLATCHED: STICKYKEYS_FLAGS = 2147483648u

public val SKF_RWINLOCKED: STICKYKEYS_FLAGS = 8388608u

public val SKF_STICKYKEYSON: STICKYKEYS_FLAGS = 1u

public val SKF_TRISTATE: STICKYKEYS_FLAGS = 128u

public val SKF_TWOKEYSOFF: STICKYKEYS_FLAGS = 256u

public val SSF_AVAILABLE: SOUNDSENTRY_FLAGS = 2u

public val SSF_INDICATOR: SOUNDSENTRY_FLAGS = 4u

public val SSF_SOUNDSENTRYON: SOUNDSENTRY_FLAGS = 1u

public val SSGF_DISPLAY: SOUND_SENTRY_GRAPHICS_EFFECT = 3u

public val SSGF_NONE: SOUND_SENTRY_GRAPHICS_EFFECT = 0u

public val SSTF_BORDER: SOUNDSENTRY_TEXT_EFFECT = 2u

public val SSTF_CHARS: SOUNDSENTRY_TEXT_EFFECT = 1u

public val SSTF_DISPLAY: SOUNDSENTRY_TEXT_EFFECT = 3u

public val SSTF_NONE: SOUNDSENTRY_TEXT_EFFECT = 0u

public val SSWF_CUSTOM: SOUNDSENTRY_WINDOWS_EFFECT = 4u

public val SSWF_DISPLAY: SOUNDSENTRY_WINDOWS_EFFECT = 3u

public val SSWF_NONE: SOUNDSENTRY_WINDOWS_EFFECT = 0u

public val SSWF_TITLE: SOUNDSENTRY_WINDOWS_EFFECT = 1u

public val SSWF_WINDOW: SOUNDSENTRY_WINDOWS_EFFECT = 2u

public val STATE_SYSTEM_HASPOPUP: UInt = 1073741824u

public val STATE_SYSTEM_NORMAL: UInt = 0u

public val SayAsInterpretAs_Address: SayAsInterpretAs = 11

public val SayAsInterpretAs_Alphanumeric: SayAsInterpretAs = 12

public val SayAsInterpretAs_Cardinal: SayAsInterpretAs = 2

public val SayAsInterpretAs_Currency: SayAsInterpretAs = 8

public val SayAsInterpretAs_Date: SayAsInterpretAs = 5

public val SayAsInterpretAs_Date_DayMonth: SayAsInterpretAs = 20

public val SayAsInterpretAs_Date_DayMonthYear: SayAsInterpretAs = 16

public val SayAsInterpretAs_Date_MonthDay: SayAsInterpretAs = 21

public val SayAsInterpretAs_Date_MonthDayYear: SayAsInterpretAs = 15

public val SayAsInterpretAs_Date_MonthYear: SayAsInterpretAs = 19

public val SayAsInterpretAs_Date_Year: SayAsInterpretAs = 22

public val SayAsInterpretAs_Date_YearMonth: SayAsInterpretAs = 18

public val SayAsInterpretAs_Date_YearMonthDay: SayAsInterpretAs = 17

public val SayAsInterpretAs_Media: SayAsInterpretAs = 14

public val SayAsInterpretAs_Name: SayAsInterpretAs = 13

public val SayAsInterpretAs_Net: SayAsInterpretAs = 9

public val SayAsInterpretAs_None: SayAsInterpretAs = 0

public val SayAsInterpretAs_Number: SayAsInterpretAs = 4

public val SayAsInterpretAs_Ordinal: SayAsInterpretAs = 3

public val SayAsInterpretAs_Spell: SayAsInterpretAs = 1

public val SayAsInterpretAs_Telephone: SayAsInterpretAs = 7

public val SayAsInterpretAs_Time: SayAsInterpretAs = 6

public val SayAsInterpretAs_Time_HoursMinutes12: SayAsInterpretAs = 24

public val SayAsInterpretAs_Time_HoursMinutes24: SayAsInterpretAs = 26

public val SayAsInterpretAs_Time_HoursMinutesSeconds12: SayAsInterpretAs = 23

public val SayAsInterpretAs_Time_HoursMinutesSeconds24: SayAsInterpretAs = 25

public val SayAsInterpretAs_Url: SayAsInterpretAs = 10

public val ScrollAmount_LargeDecrement: ScrollAmount = 0

public val ScrollAmount_LargeIncrement: ScrollAmount = 3

public val ScrollAmount_NoAmount: ScrollAmount = 2

public val ScrollAmount_SmallDecrement: ScrollAmount = 1

public val ScrollAmount_SmallIncrement: ScrollAmount = 4

public val ScrollBar_Control_GUID: GUID = GUID.from_u128(0xdaf34b3650654946uL, 0xb22f92595fc0751auL)

public val ScrollItem_Pattern_GUID: GUID = GUID.from_u128(0x4591d005a8034d5cuL, 0xb4d58d2800f906a7uL)

public val Scroll_HorizontalScrollPercent_Property_GUID: GUID = GUID.from_u128(0xc7c13c0eeb2147ffuL, 0xacc4b5a3350f5191uL)

public val Scroll_HorizontalViewSize_Property_GUID: GUID = GUID.from_u128(0x70c2e5d4fcb04713uL, 0xa9aaaf92ff79e4cduL)

public val Scroll_HorizontallyScrollable_Property_GUID: GUID = GUID.from_u128(0x8b92514728cd49aeuL, 0xbd63f44118d2e719uL)

public val Scroll_Pattern_GUID: GUID = GUID.from_u128(0x895fa4b4759d4c50uL, 0x8e1503460672003cuL)

public val Scroll_VerticalScrollPercent_Property_GUID: GUID = GUID.from_u128(0x6c8d7099b2a84948uL, 0xbff73cf9058bfefbuL)

public val Scroll_VerticalViewSize_Property_GUID: GUID = GUID.from_u128(0xde6a2e22d8c740c5uL, 0x83bae5f681d53108uL)

public val Scroll_VerticallyScrollable_Property_GUID: GUID = GUID.from_u128(0x8916479800684315uL, 0xb89a1e7cfbbc3dfcuL)

public val Selection2_CurrentSelectedItem_Property_GUID: GUID = GUID.from_u128(0x34257c2683b541a6uL, 0x939cae841c136236uL)

public val Selection2_FirstSelectedItem_Property_GUID: GUID = GUID.from_u128(0xcc24ea67369c4e55uL, 0x9ff738da69540c29uL)

public val Selection2_ItemCount_Property_GUID: GUID = GUID.from_u128(0xbb49eb9f456d4048uL, 0xb5919c2026b84636uL)

public val Selection2_LastSelectedItem_Property_GUID: GUID = GUID.from_u128(0xcf7bda902d8349f8uL, 0x860c9ce394cf89b4uL)

public val SelectionItem_ElementAddedToSelectionEvent_Event_GUID: GUID = GUID.from_u128(0x3c822dd1c4074dbauL, 0x91dd79d4aed0aec6uL)

public val SelectionItem_ElementRemovedFromSelectionEvent_Event_GUID: GUID = GUID.from_u128(0x97fa8a9707941afuL, 0x8b9c0934d8305e5cuL)

public val SelectionItem_ElementSelectedEvent_Event_GUID: GUID = GUID.from_u128(0xb9c7dbfb4ebe4532uL, 0xaaf4008cf647233cuL)

public val SelectionItem_IsSelected_Property_GUID: GUID = GUID.from_u128(0xf122835fcd5f43dfuL, 0xb79d4b849e9e6020uL)

public val SelectionItem_Pattern_GUID: GUID = GUID.from_u128(0x9bc64eeb87c74b28uL, 0x94bb4d9fa437b6efuL)

public val SelectionItem_SelectionContainer_Property_GUID: GUID = GUID.from_u128(0xa4365b6e9c1e4b63uL, 0x8b53c2421dd1e8fbuL)

public val Selection_CanSelectMultiple_Property_GUID: GUID = GUID.from_u128(0x49d73da5c8834500uL, 0x883d8fcf8daf6cbeuL)

public val Selection_InvalidatedEvent_Event_GUID: GUID = GUID.from_u128(0xcac1490416b44b53uL, 0x8e474cb1df267bb7uL)

public val Selection_IsSelectionRequired_Property_GUID: GUID = GUID.from_u128(0xb1ae442263fe44e7uL, 0xa5a5a738c829b19auL)

public val Selection_Pattern2_GUID: GUID = GUID.from_u128(0xfba25cabab9849f7uL, 0xa7dcfe539dc15be7uL)

public val Selection_Pattern_GUID: GUID = GUID.from_u128(0x66e3b7e8d8214d25uL, 0x8761435d2c8b253fuL)

public val Selection_Selection_Property_GUID: GUID = GUID.from_u128(0xaa6dc2a20e2b4d38uL, 0x96d534e470b81853uL)

public val SemanticZoom_Control_GUID: GUID = GUID.from_u128(0x5fd34a43061e42c8uL, 0xb5899dccf74bc43auL)

public val Separator_Control_GUID: GUID = GUID.from_u128(0x8767eba32a634ab0uL, 0xac8daa50e23de978uL)

public val SizeOfSet_Property_GUID: GUID = GUID.from_u128(0x1600d33c3b9f4369uL, 0x9431aa293f344cf1uL)

public val Size_Property_GUID: GUID = GUID.from_u128(0x2b5f761df8854404uL, 0x973f9b1d98e36d8fuL)

public val Slider_Control_GUID: GUID = GUID.from_u128(0xb033c24b3b354ceauL, 0xb609763682fa660buL)

public val Spinner_Control_GUID: GUID = GUID.from_u128(0x60cc4b383cb14161uL, 0xb442c6b726c17825uL)

public val SplitButton_Control_GUID: GUID = GUID.from_u128(0x7011f01f4ace4901uL, 0xb461920a6f1ca650uL)

public val SpreadsheetItem_AnnotationObjects_Property_GUID: GUID = GUID.from_u128(0xa3194c38c9bc4604uL, 0x9396ae3f9f457f7buL)

public val SpreadsheetItem_AnnotationTypes_Property_GUID: GUID = GUID.from_u128(0xc70c51d0d6024b45uL, 0xafbcb4712b96d72buL)

public val SpreadsheetItem_Formula_Property_GUID: GUID = GUID.from_u128(0xe602e47d1b474beauL, 0x87cf3b0b0b5c15b6uL)

public val SpreadsheetItem_Pattern_GUID: GUID = GUID.from_u128(0x32cf83fff1a84a8cuL, 0x8658d47ba74e20bauL)

public val Spreadsheet_Pattern_GUID: GUID = GUID.from_u128(0x6a5b24c99d1e4b85uL, 0x9e44c02e3169b10buL)

public val StatusBar_Control_GUID: GUID = GUID.from_u128(0xd45e7d1b5873475fuL, 0x95a40433e1f1b00auL)

public val StructureChangeType_ChildAdded: StructureChangeType = 0

public val StructureChangeType_ChildRemoved: StructureChangeType = 1

public val StructureChangeType_ChildrenBulkAdded: StructureChangeType = 3

public val StructureChangeType_ChildrenBulkRemoved: StructureChangeType = 4

public val StructureChangeType_ChildrenInvalidated: StructureChangeType = 2

public val StructureChangeType_ChildrenReordered: StructureChangeType = 5

public val StructureChanged_Event_GUID: GUID = GUID.from_u128(0x599779613edd4b11uL, 0xb13b676b2a2a6ca9uL)

public val StructuredMarkup_CompositionComplete_Event_GUID: GUID = GUID.from_u128(0xc48a3c17677a4047uL, 0xa68dfc1257528aefuL)

public val StructuredMarkup_Deleted_Event_GUID: GUID = GUID.from_u128(0xf9d0a020e1c14ecfuL, 0xb9aa52efde7e41e1uL)

public val StructuredMarkup_Pattern_GUID: GUID = GUID.from_u128(0xabbd087886654f5cuL, 0x94fc36e7d8bb706buL)

public val StructuredMarkup_SelectionChanged_Event_GUID: GUID = GUID.from_u128(0xa7c815f7ff9f41c7uL, 0xa3a7ab6cbfdb4903uL)

public val StyleId_BulletedList: UIA_STYLE_ID = 70015

public val StyleId_BulletedList_GUID: GUID = GUID.from_u128(0x5963ed6464264632uL, 0x8cafa32ad402d91auL)

public val StyleId_Custom: UIA_STYLE_ID = 70000

public val StyleId_Custom_GUID: GUID = GUID.from_u128(0xef2edd3ea9994b7cuL, 0xa37809bbd52a3516uL)

public val StyleId_Emphasis: UIA_STYLE_ID = 70013

public val StyleId_Emphasis_GUID: GUID = GUID.from_u128(0xca6e7dbe355e4820uL, 0x95a0925f041d3470uL)

public val StyleId_Heading1: UIA_STYLE_ID = 70001

public val StyleId_Heading1_GUID: GUID = GUID.from_u128(0x7f7e8f6968664621uL, 0x930c9a5d0ca5961cuL)

public val StyleId_Heading2: UIA_STYLE_ID = 70002

public val StyleId_Heading2_GUID: GUID = GUID.from_u128(0xbaa9b2415c69469duL, 0x85ad474737b52b14uL)

public val StyleId_Heading3: UIA_STYLE_ID = 70003

public val StyleId_Heading3_GUID: GUID = GUID.from_u128(0xbf8be9d2d8b84ec5uL, 0x8c529cfb0d035970uL)

public val StyleId_Heading4: UIA_STYLE_ID = 70004

public val StyleId_Heading4_GUID: GUID = GUID.from_u128(0x8436ffc0957845fcuL, 0x83a4ff40053315dduL)

public val StyleId_Heading5: UIA_STYLE_ID = 70005

public val StyleId_Heading5_GUID: GUID = GUID.from_u128(0x909f424d0dbf406euL, 0x97bb4e773d9798f7uL)

public val StyleId_Heading6: UIA_STYLE_ID = 70006

public val StyleId_Heading6_GUID: GUID = GUID.from_u128(0x89d234595d5b4824uL, 0xa42011d3ed82e40fuL)

public val StyleId_Heading7: UIA_STYLE_ID = 70007

public val StyleId_Heading7_GUID: GUID = GUID.from_u128(0xa3790473e9ae422duL, 0xb8e33b675c6181a4uL)

public val StyleId_Heading8: UIA_STYLE_ID = 70008

public val StyleId_Heading8_GUID: GUID = GUID.from_u128(0x2bc14145a40c4881uL, 0x84aef2235685380cuL)

public val StyleId_Heading9: UIA_STYLE_ID = 70009

public val StyleId_Heading9_GUID: GUID = GUID.from_u128(0xc70d9133bb2a43d3uL, 0x8ac633657884b0f0uL)

public val StyleId_Normal: UIA_STYLE_ID = 70012

public val StyleId_Normal_GUID: GUID = GUID.from_u128(0xcd14d429e45e4475uL, 0xa1c57f9e6be96ebauL)

public val StyleId_NumberedList: UIA_STYLE_ID = 70016

public val StyleId_NumberedList_GUID: GUID = GUID.from_u128(0x1e96dbd564c343d0uL, 0xb1eeb53b06e3eddfuL)

public val StyleId_Quote: UIA_STYLE_ID = 70014

public val StyleId_Quote_GUID: GUID = GUID.from_u128(0x5d1c21ea81954f6cuL, 0x87ea5dabece64c1duL)

public val StyleId_Subtitle: UIA_STYLE_ID = 70011

public val StyleId_Subtitle_GUID: GUID = GUID.from_u128(0xb5d9fc175d6f4420uL, 0xb4397cb19ad434e2uL)

public val StyleId_Title: UIA_STYLE_ID = 70010

public val StyleId_Title_GUID: GUID = GUID.from_u128(0x15d8201affcf481fuL, 0xb0a130b63be98f07uL)

public val Styles_ExtendedProperties_Property_GUID: GUID = GUID.from_u128(0xf451cda0ba0a4681uL, 0xb0b00dbdb53e58f3uL)

public val Styles_FillColor_Property_GUID: GUID = GUID.from_u128(0x63eff97aa1c54b1duL, 0x84ebb765f2edd632uL)

public val Styles_FillPatternColor_Property_GUID: GUID = GUID.from_u128(0x939a59fe8fbd4e75uL, 0xa271ac4595195163uL)

public val Styles_FillPatternStyle_Property_GUID: GUID = GUID.from_u128(0x81cf651f482b4451uL, 0xa30ae1545e554fb8uL)

public val Styles_Pattern_GUID: GUID = GUID.from_u128(0x1ae62655da724d60uL, 0xa153e5aa6988e3bfuL)

public val Styles_Shape_Property_GUID: GUID = GUID.from_u128(0xc71a23f8778c400duL, 0x84583b543e526984uL)

public val Styles_StyleId_Property_GUID: GUID = GUID.from_u128(0xda82852f38174233uL, 0x82af02279e72cc77uL)

public val Styles_StyleName_Property_GUID: GUID = GUID.from_u128(0x1c12b03505d14f55uL, 0x9e8e1489f3ff550duL)

public val SupportedTextSelection_Multiple: SupportedTextSelection = 2

public val SupportedTextSelection_None: SupportedTextSelection = 0

public val SupportedTextSelection_Single: SupportedTextSelection = 1

public val SynchronizedInputType_KeyDown: SynchronizedInputType = 2

public val SynchronizedInputType_KeyUp: SynchronizedInputType = 1

public val SynchronizedInputType_LeftMouseDown: SynchronizedInputType = 8

public val SynchronizedInputType_LeftMouseUp: SynchronizedInputType = 4

public val SynchronizedInputType_RightMouseDown: SynchronizedInputType = 32

public val SynchronizedInputType_RightMouseUp: SynchronizedInputType = 16

public val SynchronizedInput_Pattern_GUID: GUID = GUID.from_u128(0x5c288a6c47b488buL, 0xb65333977a551b8buL)

public val SystemAlert_Event_GUID: GUID = GUID.from_u128(0xd271545d7a3a47a7uL, 0x847481d29a2451c9uL)

public val TabItem_Control_GUID: GUID = GUID.from_u128(0x2c6a634f921b4e6euL, 0xb26e08fcb0798f4cuL)

public val Tab_Control_GUID: GUID = GUID.from_u128(0x38cd1f2d337a4bd2uL, 0xa5e3adb469e30bd3uL)

public val TableItem_ColumnHeaderItems_Property_GUID: GUID = GUID.from_u128(0x967a56a374b6431euL, 0x8de699c411031c58uL)

public val TableItem_Pattern_GUID: GUID = GUID.from_u128(0xdf1343bd18884a29uL, 0xa50cb92e6de37f6fuL)

public val TableItem_RowHeaderItems_Property_GUID: GUID = GUID.from_u128(0xb3f853a005744cd8uL, 0xbcd7ed5923572d97uL)

public val Table_ColumnHeaders_Property_GUID: GUID = GUID.from_u128(0xaff1d72b968d42b1uL, 0xb459150b299da664uL)

public val Table_Control_GUID: GUID = GUID.from_u128(0x773bfa0e5bc44debuL, 0x921bde7b3206229euL)

public val Table_Pattern_GUID: GUID = GUID.from_u128(0xc415218ea028461euL, 0xaa928f925cf79351uL)

public val Table_RowHeaders_Property_GUID: GUID = GUID.from_u128(0xd9e35b876eb84562uL, 0xaac6a8a9075236a8uL)

public val Table_RowOrColumnMajor_Property_GUID: GUID = GUID.from_u128(0x83be75c329fe4a30uL, 0x85e12a6277fd106euL)

public val TextChild_Pattern_GUID: GUID = GUID.from_u128(0x7533cab73bfe41efuL, 0x9e85e2638cbe169euL)

public val TextDecorationLineStyle_Dash: TextDecorationLineStyle = 5

public val TextDecorationLineStyle_DashDot: TextDecorationLineStyle = 6

public val TextDecorationLineStyle_DashDotDot: TextDecorationLineStyle = 7

public val TextDecorationLineStyle_Dot: TextDecorationLineStyle = 4

public val TextDecorationLineStyle_Double: TextDecorationLineStyle = 3

public val TextDecorationLineStyle_DoubleWavy: TextDecorationLineStyle = 11

public val TextDecorationLineStyle_LongDash: TextDecorationLineStyle = 13

public val TextDecorationLineStyle_None: TextDecorationLineStyle = 0

public val TextDecorationLineStyle_Other: TextDecorationLineStyle = -1

public val TextDecorationLineStyle_Single: TextDecorationLineStyle = 1

public val TextDecorationLineStyle_ThickDash: TextDecorationLineStyle = 14

public val TextDecorationLineStyle_ThickDashDot: TextDecorationLineStyle = 15

public val TextDecorationLineStyle_ThickDashDotDot: TextDecorationLineStyle = 16

public val TextDecorationLineStyle_ThickDot: TextDecorationLineStyle = 17

public val TextDecorationLineStyle_ThickLongDash: TextDecorationLineStyle = 18

public val TextDecorationLineStyle_ThickSingle: TextDecorationLineStyle = 9

public val TextDecorationLineStyle_ThickWavy: TextDecorationLineStyle = 12

public val TextDecorationLineStyle_Wavy: TextDecorationLineStyle = 8

public val TextDecorationLineStyle_WordsOnly: TextDecorationLineStyle = 2

public val TextEditChangeType_AutoComplete: TextEditChangeType = 4

public val TextEditChangeType_AutoCorrect: TextEditChangeType = 1

public val TextEditChangeType_Composition: TextEditChangeType = 2

public val TextEditChangeType_CompositionFinalized: TextEditChangeType = 3

public val TextEditChangeType_None: TextEditChangeType = 0

public val TextEdit_ConversionTargetChanged_Event_GUID: GUID = GUID.from_u128(0x3388c183ed4f4c8buL, 0x9baa364d51d8847fuL)

public val TextEdit_Pattern_GUID: GUID = GUID.from_u128(0x69f3ff895af94c75uL, 0x9340f2de292e4591uL)

public val TextEdit_TextChanged_Event_GUID: GUID = GUID.from_u128(0x120b0308ec224eb8uL, 0x9c989867cda1b165uL)

public val TextPatternRangeEndpoint_End: TextPatternRangeEndpoint = 1

public val TextPatternRangeEndpoint_Start: TextPatternRangeEndpoint = 0

public val TextUnit_Character: TextUnit = 0

public val TextUnit_Document: TextUnit = 6

public val TextUnit_Format: TextUnit = 1

public val TextUnit_Line: TextUnit = 3

public val TextUnit_Page: TextUnit = 5

public val TextUnit_Paragraph: TextUnit = 4

public val TextUnit_Word: TextUnit = 2

public val Text_AfterParagraphSpacing_Attribute_GUID: GUID = GUID.from_u128(0x588cbb38e62f497cuL, 0xb5d1ccdf0ee823d8uL)

public val Text_AfterSpacing_Attribute_GUID: GUID = GUID.from_u128(0x588cbb38e62f497cuL, 0xb5d1ccdf0ee823d8uL)

public val Text_AnimationStyle_Attribute_GUID: GUID = GUID.from_u128(0x628209f07c9a4d57uL, 0xbe641f1836571ff5uL)

public val Text_AnnotationObjects_Attribute_GUID: GUID = GUID.from_u128(0xff41cf68e7ab40b9uL, 0x8c7272a8ed94017duL)

public val Text_AnnotationTypes_Attribute_GUID: GUID = GUID.from_u128(0xad2eb431ee4e4be1uL, 0xa7ba5559155a73efuL)

public val Text_BackgroundColor_Attribute_GUID: GUID = GUID.from_u128(0xfdc49a07583d4f17uL, 0xad2777fc832a3c0buL)

public val Text_BeforeParagraphSpacing_Attribute_GUID: GUID = GUID.from_u128(0xbe7b0ab1c8224a24uL, 0x85e9c8f2650fc79cuL)

public val Text_BeforeSpacing_Attribute_GUID: GUID = GUID.from_u128(0xbe7b0ab1c8224a24uL, 0x85e9c8f2650fc79cuL)

public val Text_BulletStyle_Attribute_GUID: GUID = GUID.from_u128(0xc1097c90d5c44237uL, 0x97813bec8ba54e48uL)

public val Text_CapStyle_Attribute_GUID: GUID = GUID.from_u128(0xfb059c5092cc49a5uL, 0xba8f0aa872bba2f3uL)

public val Text_CaretBidiMode_Attribute_GUID: GUID = GUID.from_u128(0x929ee7a651d34715uL, 0x96dcb694fa24a168uL)

public val Text_CaretPosition_Attribute_GUID: GUID = GUID.from_u128(0xb227b13198894752uL, 0xa91b733efdc5c5a0uL)

public val Text_Control_GUID: GUID = GUID.from_u128(0xae9772dcd3314f09uL, 0xbe207e6dfaf07b0auL)

public val Text_Culture_Attribute_GUID: GUID = GUID.from_u128(0xc2025af9a42d4ceduL, 0xa1fbc6746315222euL)

public val Text_FontName_Attribute_GUID: GUID = GUID.from_u128(0x64e63ba8f2e5476euL, 0xa4771734feaaf726uL)

public val Text_FontSize_Attribute_GUID: GUID = GUID.from_u128(0xdc5eeeff05064673uL, 0x93f2377e4a8e01f1uL)

public val Text_FontWeight_Attribute_GUID: GUID = GUID.from_u128(0x6fc02359b3164f5fuL, 0xb401f1ce55741853uL)

public val Text_ForegroundColor_Attribute_GUID: GUID = GUID.from_u128(0x72d1c95d5e60471auL, 0x96b16c1b3b77a436uL)

public val Text_HorizontalTextAlignment_Attribute_GUID: GUID = GUID.from_u128(0x4ea6161fba3477auL, 0x952abb326d026a5buL)

public val Text_IndentationFirstLine_Attribute_GUID: GUID = GUID.from_u128(0x206f9ad5c1d3424auL, 0x81826da9a7f3d632uL)

public val Text_IndentationLeading_Attribute_GUID: GUID = GUID.from_u128(0x5cf66bac2d454a4buL, 0xb6c9f7221d2815b0uL)

public val Text_IndentationTrailing_Attribute_GUID: GUID = GUID.from_u128(0x97ff6c0f1ce4408auL, 0xb67b94d83eb69bf2uL)

public val Text_IsActive_Attribute_GUID: GUID = GUID.from_u128(0xf5a4e533e1b8436buL, 0x935db57aa3f558c4uL)

public val Text_IsHidden_Attribute_GUID: GUID = GUID.from_u128(0x360182fbbdd747f6uL, 0xab6919e33f8a3344uL)

public val Text_IsItalic_Attribute_GUID: GUID = GUID.from_u128(0xfce12a5613364a34uL, 0x96631bab47239320uL)

public val Text_IsReadOnly_Attribute_GUID: GUID = GUID.from_u128(0xa738156bca3e495euL, 0x9514833c440feb11uL)

public val Text_IsSubscript_Attribute_GUID: GUID = GUID.from_u128(0xf0ead8588f53413cuL, 0x873f1a7d7f5e0de4uL)

public val Text_IsSuperscript_Attribute_GUID: GUID = GUID.from_u128(0xda706ee4b3aa4645uL, 0xa41fcd25157dea76uL)

public val Text_LineSpacing_Attribute_GUID: GUID = GUID.from_u128(0x63ff70aed9434b47uL, 0x8ab7a7a033d3214buL)

public val Text_Link_Attribute_GUID: GUID = GUID.from_u128(0xb38ef51d9e8d4e46uL, 0x914456ebe177329buL)

public val Text_MarginBottom_Attribute_GUID: GUID = GUID.from_u128(0x7ee593c472b44cacuL, 0x92713ed24b0e4d42uL)

public val Text_MarginLeading_Attribute_GUID: GUID = GUID.from_u128(0x9e9242d05ed04900uL, 0x8e8aeecc03835afcuL)

public val Text_MarginTop_Attribute_GUID: GUID = GUID.from_u128(0x683d936fc9b94a9auL, 0xb3d9d20d33311e2auL)

public val Text_MarginTrailing_Attribute_GUID: GUID = GUID.from_u128(0xaf522f98999d40afuL, 0xa5b20169d0342002uL)

public val Text_OutlineStyles_Attribute_GUID: GUID = GUID.from_u128(0x5b675b27db8946feuL, 0x970c614d523bb97duL)

public val Text_OverlineColor_Attribute_GUID: GUID = GUID.from_u128(0x83ab383afd4340dauL, 0xab3eecf8165cbb6duL)

public val Text_OverlineStyle_Attribute_GUID: GUID = GUID.from_u128(0xa234d66617e427fuL, 0x871de1ff1e0c213fuL)

public val Text_Pattern2_GUID: GUID = GUID.from_u128(0x498479a25b22448duL, 0xb6e4647490860698uL)

public val Text_Pattern_GUID: GUID = GUID.from_u128(0x8615f05d7de544fduL, 0xa6792ca4b46033a8uL)

public val Text_SayAsInterpretAs_Attribute_GUID: GUID = GUID.from_u128(0xb38ad6aceee14b6euL, 0x88cc014cefa93fcbuL)

public val Text_SelectionActiveEnd_Attribute_GUID: GUID = GUID.from_u128(0x1f668cc39bbf416buL, 0xb0a2f89f86f6612cuL)

public val Text_StrikethroughColor_Attribute_GUID: GUID = GUID.from_u128(0xbfe15a188c414c5auL, 0x9a0b04af0e07f487uL)

public val Text_StrikethroughStyle_Attribute_GUID: GUID = GUID.from_u128(0x72913ef1da004f01uL, 0x899cac5a8577a307uL)

public val Text_StyleId_Attribute_GUID: GUID = GUID.from_u128(0x14c300dec32b449buL, 0xab7cb0e0789aea5duL)

public val Text_StyleName_Attribute_GUID: GUID = GUID.from_u128(0x22c9e0914d6645d8uL, 0xa828737bab4c98a7uL)

public val Text_Tabs_Attribute_GUID: GUID = GUID.from_u128(0x2e68d00b92fe42d8uL, 0x899aa784aa4454a1uL)

public val Text_TextChangedEvent_Event_GUID: GUID = GUID.from_u128(0x4a342082f48348c4uL, 0xac11a84b435e2a84uL)

public val Text_TextFlowDirections_Attribute_GUID: GUID = GUID.from_u128(0x8bdf8739f420423euL, 0xaf7720a5d973a907uL)

public val Text_TextSelectionChangedEvent_Event_GUID: GUID = GUID.from_u128(0x918edaa171b349aeuL, 0x974179beb8d358f3uL)

public val Text_UnderlineColor_Attribute_GUID: GUID = GUID.from_u128(0xbfa12c73fde24473uL, 0xbf641036d6aa0f45uL)

public val Text_UnderlineStyle_Attribute_GUID: GUID = GUID.from_u128(0x5f3b21c0ede444bduL, 0x9c363853038cbfebuL)

public val Thumb_Control_GUID: GUID = GUID.from_u128(0x701ca877e3104dd6uL, 0xb644797e4faea213uL)

public val TitleBar_Control_GUID: GUID = GUID.from_u128(0x98aa55bf3bb04b65uL, 0x836e2ea30dbc171fuL)

public val ToggleState_Indeterminate: ToggleState = 2

public val ToggleState_Off: ToggleState = 0

public val ToggleState_On: ToggleState = 1

public val Toggle_Pattern_GUID: GUID = GUID.from_u128(0xb419760e2f443ffuL, 0x8c5f9457c82b56e9uL)

public val Toggle_ToggleState_Property_GUID: GUID = GUID.from_u128(0xb23cdc5222c24c6cuL, 0x9dedf5c422479edeuL)

public val ToolBar_Control_GUID: GUID = GUID.from_u128(0x8f06b751e1824e98uL, 0x88932284543a7dceuL)

public val ToolTipClosed_Event_GUID: GUID = GUID.from_u128(0x276d71ef24a949b6uL, 0x8e97da98b401bbcduL)

public val ToolTipOpened_Event_GUID: GUID = GUID.from_u128(0x3f4b97ff2edc451duL, 0xbca495a3188d5b03uL)

public val ToolTip_Control_GUID: GUID = GUID.from_u128(0x5ddc6d121374768uL, 0x98ea73f52f7134f3uL)

public val Tranform_Pattern2_GUID: GUID = GUID.from_u128(0x8afcfd07a36944deuL, 0x988b2f7ff49fb8a8uL)

public val Transform2_CanZoom_Property_GUID: GUID = GUID.from_u128(0xf357e890a7564359uL, 0x9ca686702bf8f381uL)

public val Transform2_ZoomLevel_Property_GUID: GUID = GUID.from_u128(0xeee29f1af4a24b5buL, 0xac6595cf93283387uL)

public val Transform2_ZoomMaximum_Property_GUID: GUID = GUID.from_u128(0x42ab6b77ceb04ecauL, 0xb82a6cfa5fa1fc08uL)

public val Transform2_ZoomMinimum_Property_GUID: GUID = GUID.from_u128(0x742ccc164ad14e07uL, 0x96feb122c6e6b22buL)

public val Transform_CanMove_Property_GUID: GUID = GUID.from_u128(0x1b75824d208b4fdfuL, 0xbccdf1f4e5741f4fuL)

public val Transform_CanResize_Property_GUID: GUID = GUID.from_u128(0xbb98dca54c1a41d4uL, 0xa4f6ebc128644180uL)

public val Transform_CanRotate_Property_GUID: GUID = GUID.from_u128(0x10079b483849476fuL, 0xac9644a95c8440d9uL)

public val Transform_Pattern_GUID: GUID = GUID.from_u128(0x24b46fdb587e49f1uL, 0x9c4ad8e98b664b7buL)

public val TreeItem_Control_GUID: GUID = GUID.from_u128(0x62c9feb98ffc4878uL, 0xa3a496b030315c18uL)

public val TreeScope_Ancestors: TreeScope = 16

public val TreeScope_Children: TreeScope = 2

public val TreeScope_Descendants: TreeScope = 4

public val TreeScope_Element: TreeScope = 1

public val TreeScope_None: TreeScope = 0

public val TreeScope_Parent: TreeScope = 8

public val TreeScope_Subtree: TreeScope = 7

public val TreeTraversalOptions_Default: TreeTraversalOptions = 0

public val TreeTraversalOptions_LastToFirstOrder: TreeTraversalOptions = 2

public val TreeTraversalOptions_PostOrder: TreeTraversalOptions = 1

public val Tree_Control_GUID: GUID = GUID.from_u128(0x7561349cd24143f4uL, 0x9908b5f091bee611uL)

public val UIA_AcceleratorKeyPropertyId: UIA_PROPERTY_ID = 30006

public val UIA_AccessKeyPropertyId: UIA_PROPERTY_ID = 30007

public val UIA_ActiveTextPositionChangedEventId: UIA_EVENT_ID = 20036

public val UIA_AfterParagraphSpacingAttributeId: UIA_TEXTATTRIBUTE_ID = 40042

public val UIA_AnimationStyleAttributeId: UIA_TEXTATTRIBUTE_ID = 40000

public val UIA_AnnotationAnnotationTypeIdPropertyId: UIA_PROPERTY_ID = 30113

public val UIA_AnnotationAnnotationTypeNamePropertyId: UIA_PROPERTY_ID = 30114

public val UIA_AnnotationAuthorPropertyId: UIA_PROPERTY_ID = 30115

public val UIA_AnnotationDateTimePropertyId: UIA_PROPERTY_ID = 30116

public val UIA_AnnotationObjectsAttributeId: UIA_TEXTATTRIBUTE_ID = 40032

public val UIA_AnnotationObjectsPropertyId: UIA_PROPERTY_ID = 30156

public val UIA_AnnotationPatternId: UIA_PATTERN_ID = 10023

public val UIA_AnnotationTargetPropertyId: UIA_PROPERTY_ID = 30117

public val UIA_AnnotationTypesAttributeId: UIA_TEXTATTRIBUTE_ID = 40031

public val UIA_AnnotationTypesPropertyId: UIA_PROPERTY_ID = 30155

public val UIA_AppBarControlTypeId: UIA_CONTROLTYPE_ID = 50040

public val UIA_AriaPropertiesPropertyId: UIA_PROPERTY_ID = 30102

public val UIA_AriaRolePropertyId: UIA_PROPERTY_ID = 30101

public val UIA_AsyncContentLoadedEventId: UIA_EVENT_ID = 20006

public val UIA_AutomationFocusChangedEventId: UIA_EVENT_ID = 20005

public val UIA_AutomationIdPropertyId: UIA_PROPERTY_ID = 30011

public val UIA_AutomationPropertyChangedEventId: UIA_EVENT_ID = 20004

public val UIA_BackgroundColorAttributeId: UIA_TEXTATTRIBUTE_ID = 40001

public val UIA_BeforeParagraphSpacingAttributeId: UIA_TEXTATTRIBUTE_ID = 40041

public val UIA_BoundingRectanglePropertyId: UIA_PROPERTY_ID = 30001

public val UIA_BulletStyleAttributeId: UIA_TEXTATTRIBUTE_ID = 40002

public val UIA_ButtonControlTypeId: UIA_CONTROLTYPE_ID = 50000

public val UIA_CalendarControlTypeId: UIA_CONTROLTYPE_ID = 50001

public val UIA_CapStyleAttributeId: UIA_TEXTATTRIBUTE_ID = 40003

public val UIA_CaretBidiModeAttributeId: UIA_TEXTATTRIBUTE_ID = 40039

public val UIA_CaretPositionAttributeId: UIA_TEXTATTRIBUTE_ID = 40038

public val UIA_CenterPointPropertyId: UIA_PROPERTY_ID = 30165

public val UIA_ChangesEventId: UIA_EVENT_ID = 20034

public val UIA_CheckBoxControlTypeId: UIA_CONTROLTYPE_ID = 50002

public val UIA_ClassNamePropertyId: UIA_PROPERTY_ID = 30012

public val UIA_ClickablePointPropertyId: UIA_PROPERTY_ID = 30014

public val UIA_ComboBoxControlTypeId: UIA_CONTROLTYPE_ID = 50003

public val UIA_ControlTypePropertyId: UIA_PROPERTY_ID = 30003

public val UIA_ControllerForPropertyId: UIA_PROPERTY_ID = 30104

public val UIA_CultureAttributeId: UIA_TEXTATTRIBUTE_ID = 40004

public val UIA_CulturePropertyId: UIA_PROPERTY_ID = 30015

public val UIA_CustomControlTypeId: UIA_CONTROLTYPE_ID = 50025

public val UIA_CustomLandmarkTypeId: UIA_LANDMARKTYPE_ID = 80000

public val UIA_CustomNavigationPatternId: UIA_PATTERN_ID = 10033

public val UIA_DataGridControlTypeId: UIA_CONTROLTYPE_ID = 50028

public val UIA_DataItemControlTypeId: UIA_CONTROLTYPE_ID = 50029

public val UIA_DescribedByPropertyId: UIA_PROPERTY_ID = 30105

public val UIA_DockDockPositionPropertyId: UIA_PROPERTY_ID = 30069

public val UIA_DockPatternId: UIA_PATTERN_ID = 10011

public val UIA_DocumentControlTypeId: UIA_CONTROLTYPE_ID = 50030

public val UIA_DragDropEffectPropertyId: UIA_PROPERTY_ID = 30139

public val UIA_DragDropEffectsPropertyId: UIA_PROPERTY_ID = 30140

public val UIA_DragGrabbedItemsPropertyId: UIA_PROPERTY_ID = 30144

public val UIA_DragIsGrabbedPropertyId: UIA_PROPERTY_ID = 30138

public val UIA_DragPatternId: UIA_PATTERN_ID = 10030

public val UIA_Drag_DragCancelEventId: UIA_EVENT_ID = 20027

public val UIA_Drag_DragCompleteEventId: UIA_EVENT_ID = 20028

public val UIA_Drag_DragStartEventId: UIA_EVENT_ID = 20026

public val UIA_DropTargetDropTargetEffectPropertyId: UIA_PROPERTY_ID = 30142

public val UIA_DropTargetDropTargetEffectsPropertyId: UIA_PROPERTY_ID = 30143

public val UIA_DropTargetPatternId: UIA_PATTERN_ID = 10031

public val UIA_DropTarget_DragEnterEventId: UIA_EVENT_ID = 20029

public val UIA_DropTarget_DragLeaveEventId: UIA_EVENT_ID = 20030

public val UIA_DropTarget_DroppedEventId: UIA_EVENT_ID = 20031

public val UIA_E_ELEMENTNOTAVAILABLE: UInt = 2147746305u

public val UIA_E_ELEMENTNOTENABLED: UInt = 2147746304u

public val UIA_E_INVALIDOPERATION: UInt = 2148734217u

public val UIA_E_NOCLICKABLEPOINT: UInt = 2147746306u

public val UIA_E_NOTSUPPORTED: UInt = 2147746308u

public val UIA_E_PROXYASSEMBLYNOTLOADED: UInt = 2147746307u

public val UIA_E_TIMEOUT: UInt = 2148734213u

public val UIA_EditControlTypeId: UIA_CONTROLTYPE_ID = 50004

public val UIA_ExpandCollapseExpandCollapseStatePropertyId: UIA_PROPERTY_ID = 30070

public val UIA_ExpandCollapsePatternId: UIA_PATTERN_ID = 10005

public val UIA_FillColorPropertyId: UIA_PROPERTY_ID = 30160

public val UIA_FillTypePropertyId: UIA_PROPERTY_ID = 30162

public val UIA_FlowsFromPropertyId: UIA_PROPERTY_ID = 30148

public val UIA_FlowsToPropertyId: UIA_PROPERTY_ID = 30106

public val UIA_FontNameAttributeId: UIA_TEXTATTRIBUTE_ID = 40005

public val UIA_FontSizeAttributeId: UIA_TEXTATTRIBUTE_ID = 40006

public val UIA_FontWeightAttributeId: UIA_TEXTATTRIBUTE_ID = 40007

public val UIA_ForegroundColorAttributeId: UIA_TEXTATTRIBUTE_ID = 40008

public val UIA_FormLandmarkTypeId: UIA_LANDMARKTYPE_ID = 80001

public val UIA_FrameworkIdPropertyId: UIA_PROPERTY_ID = 30024

public val UIA_FullDescriptionPropertyId: UIA_PROPERTY_ID = 30159

public val UIA_GridColumnCountPropertyId: UIA_PROPERTY_ID = 30063

public val UIA_GridItemColumnPropertyId: UIA_PROPERTY_ID = 30065

public val UIA_GridItemColumnSpanPropertyId: UIA_PROPERTY_ID = 30067

public val UIA_GridItemContainingGridPropertyId: UIA_PROPERTY_ID = 30068

public val UIA_GridItemPatternId: UIA_PATTERN_ID = 10007

public val UIA_GridItemRowPropertyId: UIA_PROPERTY_ID = 30064

public val UIA_GridItemRowSpanPropertyId: UIA_PROPERTY_ID = 30066

public val UIA_GridPatternId: UIA_PATTERN_ID = 10006

public val UIA_GridRowCountPropertyId: UIA_PROPERTY_ID = 30062

public val UIA_GroupControlTypeId: UIA_CONTROLTYPE_ID = 50026

public val UIA_HasKeyboardFocusPropertyId: UIA_PROPERTY_ID = 30008

public val UIA_HeaderControlTypeId: UIA_CONTROLTYPE_ID = 50034

public val UIA_HeaderItemControlTypeId: UIA_CONTROLTYPE_ID = 50035

public val UIA_HeadingLevelPropertyId: UIA_PROPERTY_ID = 30173

public val UIA_HelpTextPropertyId: UIA_PROPERTY_ID = 30013

public val UIA_HorizontalTextAlignmentAttributeId: UIA_TEXTATTRIBUTE_ID = 40009

public val UIA_HostedFragmentRootsInvalidatedEventId: UIA_EVENT_ID = 20025

public val UIA_HyperlinkControlTypeId: UIA_CONTROLTYPE_ID = 50005

public val UIA_IAFP_DEFAULT: UInt = 0u

public val UIA_IAFP_UNWRAP_BRIDGE: UInt = 1u

public val UIA_ImageControlTypeId: UIA_CONTROLTYPE_ID = 50006

public val UIA_IndentationFirstLineAttributeId: UIA_TEXTATTRIBUTE_ID = 40010

public val UIA_IndentationLeadingAttributeId: UIA_TEXTATTRIBUTE_ID = 40011

public val UIA_IndentationTrailingAttributeId: UIA_TEXTATTRIBUTE_ID = 40012

public val UIA_InputDiscardedEventId: UIA_EVENT_ID = 20022

public val UIA_InputReachedOtherElementEventId: UIA_EVENT_ID = 20021

public val UIA_InputReachedTargetEventId: UIA_EVENT_ID = 20020

public val UIA_InvokePatternId: UIA_PATTERN_ID = 10000

public val UIA_Invoke_InvokedEventId: UIA_EVENT_ID = 20009

public val UIA_IsActiveAttributeId: UIA_TEXTATTRIBUTE_ID = 40036

public val UIA_IsAnnotationPatternAvailablePropertyId: UIA_PROPERTY_ID = 30118

public val UIA_IsContentElementPropertyId: UIA_PROPERTY_ID = 30017

public val UIA_IsControlElementPropertyId: UIA_PROPERTY_ID = 30016

public val UIA_IsCustomNavigationPatternAvailablePropertyId: UIA_PROPERTY_ID = 30151

public val UIA_IsDataValidForFormPropertyId: UIA_PROPERTY_ID = 30103

public val UIA_IsDialogPropertyId: UIA_PROPERTY_ID = 30174

public val UIA_IsDockPatternAvailablePropertyId: UIA_PROPERTY_ID = 30027

public val UIA_IsDragPatternAvailablePropertyId: UIA_PROPERTY_ID = 30137

public val UIA_IsDropTargetPatternAvailablePropertyId: UIA_PROPERTY_ID = 30141

public val UIA_IsEnabledPropertyId: UIA_PROPERTY_ID = 30010

public val UIA_IsExpandCollapsePatternAvailablePropertyId: UIA_PROPERTY_ID = 30028

public val UIA_IsGridItemPatternAvailablePropertyId: UIA_PROPERTY_ID = 30029

public val UIA_IsGridPatternAvailablePropertyId: UIA_PROPERTY_ID = 30030

public val UIA_IsHiddenAttributeId: UIA_TEXTATTRIBUTE_ID = 40013

public val UIA_IsInvokePatternAvailablePropertyId: UIA_PROPERTY_ID = 30031

public val UIA_IsItalicAttributeId: UIA_TEXTATTRIBUTE_ID = 40014

public val UIA_IsItemContainerPatternAvailablePropertyId: UIA_PROPERTY_ID = 30108

public val UIA_IsKeyboardFocusablePropertyId: UIA_PROPERTY_ID = 30009

public val UIA_IsLegacyIAccessiblePatternAvailablePropertyId: UIA_PROPERTY_ID = 30090

public val UIA_IsMultipleViewPatternAvailablePropertyId: UIA_PROPERTY_ID = 30032

public val UIA_IsObjectModelPatternAvailablePropertyId: UIA_PROPERTY_ID = 30112

public val UIA_IsOffscreenPropertyId: UIA_PROPERTY_ID = 30022

public val UIA_IsPasswordPropertyId: UIA_PROPERTY_ID = 30019

public val UIA_IsPeripheralPropertyId: UIA_PROPERTY_ID = 30150

public val UIA_IsRangeValuePatternAvailablePropertyId: UIA_PROPERTY_ID = 30033

public val UIA_IsReadOnlyAttributeId: UIA_TEXTATTRIBUTE_ID = 40015

public val UIA_IsRequiredForFormPropertyId: UIA_PROPERTY_ID = 30025

public val UIA_IsScrollItemPatternAvailablePropertyId: UIA_PROPERTY_ID = 30035

public val UIA_IsScrollPatternAvailablePropertyId: UIA_PROPERTY_ID = 30034

public val UIA_IsSelectionItemPatternAvailablePropertyId: UIA_PROPERTY_ID = 30036

public val UIA_IsSelectionPattern2AvailablePropertyId: UIA_PROPERTY_ID = 30168

public val UIA_IsSelectionPatternAvailablePropertyId: UIA_PROPERTY_ID = 30037

public val UIA_IsSpreadsheetItemPatternAvailablePropertyId: UIA_PROPERTY_ID = 30132

public val UIA_IsSpreadsheetPatternAvailablePropertyId: UIA_PROPERTY_ID = 30128

public val UIA_IsStylesPatternAvailablePropertyId: UIA_PROPERTY_ID = 30127

public val UIA_IsSubscriptAttributeId: UIA_TEXTATTRIBUTE_ID = 40016

public val UIA_IsSuperscriptAttributeId: UIA_TEXTATTRIBUTE_ID = 40017

public val UIA_IsSynchronizedInputPatternAvailablePropertyId: UIA_PROPERTY_ID = 30110

public val UIA_IsTableItemPatternAvailablePropertyId: UIA_PROPERTY_ID = 30039

public val UIA_IsTablePatternAvailablePropertyId: UIA_PROPERTY_ID = 30038

public val UIA_IsTextChildPatternAvailablePropertyId: UIA_PROPERTY_ID = 30136

public val UIA_IsTextEditPatternAvailablePropertyId: UIA_PROPERTY_ID = 30149

public val UIA_IsTextPattern2AvailablePropertyId: UIA_PROPERTY_ID = 30119

public val UIA_IsTextPatternAvailablePropertyId: UIA_PROPERTY_ID = 30040

public val UIA_IsTogglePatternAvailablePropertyId: UIA_PROPERTY_ID = 30041

public val UIA_IsTransformPattern2AvailablePropertyId: UIA_PROPERTY_ID = 30134

public val UIA_IsTransformPatternAvailablePropertyId: UIA_PROPERTY_ID = 30042

public val UIA_IsValuePatternAvailablePropertyId: UIA_PROPERTY_ID = 30043

public val UIA_IsVirtualizedItemPatternAvailablePropertyId: UIA_PROPERTY_ID = 30109

public val UIA_IsWindowPatternAvailablePropertyId: UIA_PROPERTY_ID = 30044

public val UIA_ItemContainerPatternId: UIA_PATTERN_ID = 10019

public val UIA_ItemStatusPropertyId: UIA_PROPERTY_ID = 30026

public val UIA_ItemTypePropertyId: UIA_PROPERTY_ID = 30021

public val UIA_LabeledByPropertyId: UIA_PROPERTY_ID = 30018

public val UIA_LandmarkTypePropertyId: UIA_PROPERTY_ID = 30157

public val UIA_LayoutInvalidatedEventId: UIA_EVENT_ID = 20008

public val UIA_LegacyIAccessibleChildIdPropertyId: UIA_PROPERTY_ID = 30091

public val UIA_LegacyIAccessibleDefaultActionPropertyId: UIA_PROPERTY_ID = 30100

public val UIA_LegacyIAccessibleDescriptionPropertyId: UIA_PROPERTY_ID = 30094

public val UIA_LegacyIAccessibleHelpPropertyId: UIA_PROPERTY_ID = 30097

public val UIA_LegacyIAccessibleKeyboardShortcutPropertyId: UIA_PROPERTY_ID = 30098

public val UIA_LegacyIAccessibleNamePropertyId: UIA_PROPERTY_ID = 30092

public val UIA_LegacyIAccessiblePatternId: UIA_PATTERN_ID = 10018

public val UIA_LegacyIAccessibleRolePropertyId: UIA_PROPERTY_ID = 30095

public val UIA_LegacyIAccessibleSelectionPropertyId: UIA_PROPERTY_ID = 30099

public val UIA_LegacyIAccessibleStatePropertyId: UIA_PROPERTY_ID = 30096

public val UIA_LegacyIAccessibleValuePropertyId: UIA_PROPERTY_ID = 30093

public val UIA_LevelPropertyId: UIA_PROPERTY_ID = 30154

public val UIA_LineSpacingAttributeId: UIA_TEXTATTRIBUTE_ID = 40040

public val UIA_LinkAttributeId: UIA_TEXTATTRIBUTE_ID = 40035

public val UIA_ListControlTypeId: UIA_CONTROLTYPE_ID = 50008

public val UIA_ListItemControlTypeId: UIA_CONTROLTYPE_ID = 50007

public val UIA_LiveRegionChangedEventId: UIA_EVENT_ID = 20024

public val UIA_LiveSettingPropertyId: UIA_PROPERTY_ID = 30135

public val UIA_LocalizedControlTypePropertyId: UIA_PROPERTY_ID = 30004

public val UIA_LocalizedLandmarkTypePropertyId: UIA_PROPERTY_ID = 30158

public val UIA_MainLandmarkTypeId: UIA_LANDMARKTYPE_ID = 80002

public val UIA_MarginBottomAttributeId: UIA_TEXTATTRIBUTE_ID = 40018

public val UIA_MarginLeadingAttributeId: UIA_TEXTATTRIBUTE_ID = 40019

public val UIA_MarginTopAttributeId: UIA_TEXTATTRIBUTE_ID = 40020

public val UIA_MarginTrailingAttributeId: UIA_TEXTATTRIBUTE_ID = 40021

public val UIA_MenuBarControlTypeId: UIA_CONTROLTYPE_ID = 50010

public val UIA_MenuClosedEventId: UIA_EVENT_ID = 20007

public val UIA_MenuControlTypeId: UIA_CONTROLTYPE_ID = 50009

public val UIA_MenuItemControlTypeId: UIA_CONTROLTYPE_ID = 50011

public val UIA_MenuModeEndEventId: UIA_EVENT_ID = 20019

public val UIA_MenuModeStartEventId: UIA_EVENT_ID = 20018

public val UIA_MenuOpenedEventId: UIA_EVENT_ID = 20003

public val UIA_MultipleViewCurrentViewPropertyId: UIA_PROPERTY_ID = 30071

public val UIA_MultipleViewPatternId: UIA_PATTERN_ID = 10008

public val UIA_MultipleViewSupportedViewsPropertyId: UIA_PROPERTY_ID = 30072

public val UIA_NamePropertyId: UIA_PROPERTY_ID = 30005

public val UIA_NativeWindowHandlePropertyId: UIA_PROPERTY_ID = 30020

public val UIA_NavigationLandmarkTypeId: UIA_LANDMARKTYPE_ID = 80003

public val UIA_NotificationEventId: UIA_EVENT_ID = 20035

public val UIA_ObjectModelPatternId: UIA_PATTERN_ID = 10022

public val UIA_OptimizeForVisualContentPropertyId: UIA_PROPERTY_ID = 30111

public val UIA_OrientationPropertyId: UIA_PROPERTY_ID = 30023

public val UIA_OutlineColorPropertyId: UIA_PROPERTY_ID = 30161

public val UIA_OutlineStylesAttributeId: UIA_TEXTATTRIBUTE_ID = 40022

public val UIA_OutlineThicknessPropertyId: UIA_PROPERTY_ID = 30164

public val UIA_OverlineColorAttributeId: UIA_TEXTATTRIBUTE_ID = 40023

public val UIA_OverlineStyleAttributeId: UIA_TEXTATTRIBUTE_ID = 40024

public val UIA_PFIA_DEFAULT: UInt = 0u

public val UIA_PFIA_UNWRAP_BRIDGE: UInt = 1u

public val UIA_PaneControlTypeId: UIA_CONTROLTYPE_ID = 50033

public val UIA_PositionInSetPropertyId: UIA_PROPERTY_ID = 30152

public val UIA_ProcessIdPropertyId: UIA_PROPERTY_ID = 30002

public val UIA_ProgressBarControlTypeId: UIA_CONTROLTYPE_ID = 50012

public val UIA_ProviderDescriptionPropertyId: UIA_PROPERTY_ID = 30107

public val UIA_RadioButtonControlTypeId: UIA_CONTROLTYPE_ID = 50013

public val UIA_RangeValueIsReadOnlyPropertyId: UIA_PROPERTY_ID = 30048

public val UIA_RangeValueLargeChangePropertyId: UIA_PROPERTY_ID = 30051

public val UIA_RangeValueMaximumPropertyId: UIA_PROPERTY_ID = 30050

public val UIA_RangeValueMinimumPropertyId: UIA_PROPERTY_ID = 30049

public val UIA_RangeValuePatternId: UIA_PATTERN_ID = 10003

public val UIA_RangeValueSmallChangePropertyId: UIA_PROPERTY_ID = 30052

public val UIA_RangeValueValuePropertyId: UIA_PROPERTY_ID = 30047

public val UIA_RotationPropertyId: UIA_PROPERTY_ID = 30166

public val UIA_RuntimeIdPropertyId: UIA_PROPERTY_ID = 30000

public val UIA_SayAsInterpretAsAttributeId: UIA_TEXTATTRIBUTE_ID = 40043

public val UIA_SayAsInterpretAsMetadataId: UIA_METADATA_ID = 100000

public val UIA_ScrollBarControlTypeId: UIA_CONTROLTYPE_ID = 50014

public val UIA_ScrollHorizontalScrollPercentPropertyId: UIA_PROPERTY_ID = 30053

public val UIA_ScrollHorizontalViewSizePropertyId: UIA_PROPERTY_ID = 30054

public val UIA_ScrollHorizontallyScrollablePropertyId: UIA_PROPERTY_ID = 30057

public val UIA_ScrollItemPatternId: UIA_PATTERN_ID = 10017

public val UIA_ScrollPatternId: UIA_PATTERN_ID = 10004

public val UIA_ScrollPatternNoScroll: Double = -1.0

public val UIA_ScrollVerticalScrollPercentPropertyId: UIA_PROPERTY_ID = 30055

public val UIA_ScrollVerticalViewSizePropertyId: UIA_PROPERTY_ID = 30056

public val UIA_ScrollVerticallyScrollablePropertyId: UIA_PROPERTY_ID = 30058

public val UIA_SearchLandmarkTypeId: UIA_LANDMARKTYPE_ID = 80004

public val UIA_Selection2CurrentSelectedItemPropertyId: UIA_PROPERTY_ID = 30171

public val UIA_Selection2FirstSelectedItemPropertyId: UIA_PROPERTY_ID = 30169

public val UIA_Selection2ItemCountPropertyId: UIA_PROPERTY_ID = 30172

public val UIA_Selection2LastSelectedItemPropertyId: UIA_PROPERTY_ID = 30170

public val UIA_SelectionActiveEndAttributeId: UIA_TEXTATTRIBUTE_ID = 40037

public val UIA_SelectionCanSelectMultiplePropertyId: UIA_PROPERTY_ID = 30060

public val UIA_SelectionIsSelectionRequiredPropertyId: UIA_PROPERTY_ID = 30061

public val UIA_SelectionItemIsSelectedPropertyId: UIA_PROPERTY_ID = 30079

public val UIA_SelectionItemPatternId: UIA_PATTERN_ID = 10010

public val UIA_SelectionItemSelectionContainerPropertyId: UIA_PROPERTY_ID = 30080

public val UIA_SelectionItem_ElementAddedToSelectionEventId: UIA_EVENT_ID = 20010

public val UIA_SelectionItem_ElementRemovedFromSelectionEventId: UIA_EVENT_ID = 20011

public val UIA_SelectionItem_ElementSelectedEventId: UIA_EVENT_ID = 20012

public val UIA_SelectionPattern2Id: UIA_PATTERN_ID = 10034

public val UIA_SelectionPatternId: UIA_PATTERN_ID = 10001

public val UIA_SelectionSelectionPropertyId: UIA_PROPERTY_ID = 30059

public val UIA_Selection_InvalidatedEventId: UIA_EVENT_ID = 20013

public val UIA_SemanticZoomControlTypeId: UIA_CONTROLTYPE_ID = 50039

public val UIA_SeparatorControlTypeId: UIA_CONTROLTYPE_ID = 50038

public val UIA_SizeOfSetPropertyId: UIA_PROPERTY_ID = 30153

public val UIA_SizePropertyId: UIA_PROPERTY_ID = 30167

public val UIA_SliderControlTypeId: UIA_CONTROLTYPE_ID = 50015

public val UIA_SpinnerControlTypeId: UIA_CONTROLTYPE_ID = 50016

public val UIA_SplitButtonControlTypeId: UIA_CONTROLTYPE_ID = 50031

public val UIA_SpreadsheetItemAnnotationObjectsPropertyId: UIA_PROPERTY_ID = 30130

public val UIA_SpreadsheetItemAnnotationTypesPropertyId: UIA_PROPERTY_ID = 30131

public val UIA_SpreadsheetItemFormulaPropertyId: UIA_PROPERTY_ID = 30129

public val UIA_SpreadsheetItemPatternId: UIA_PATTERN_ID = 10027

public val UIA_SpreadsheetPatternId: UIA_PATTERN_ID = 10026

public val UIA_StatusBarControlTypeId: UIA_CONTROLTYPE_ID = 50017

public val UIA_StrikethroughColorAttributeId: UIA_TEXTATTRIBUTE_ID = 40025

public val UIA_StrikethroughStyleAttributeId: UIA_TEXTATTRIBUTE_ID = 40026

public val UIA_StructureChangedEventId: UIA_EVENT_ID = 20002

public val UIA_StyleIdAttributeId: UIA_TEXTATTRIBUTE_ID = 40034

public val UIA_StyleNameAttributeId: UIA_TEXTATTRIBUTE_ID = 40033

public val UIA_StylesExtendedPropertiesPropertyId: UIA_PROPERTY_ID = 30126

public val UIA_StylesFillColorPropertyId: UIA_PROPERTY_ID = 30122

public val UIA_StylesFillPatternColorPropertyId: UIA_PROPERTY_ID = 30125

public val UIA_StylesFillPatternStylePropertyId: UIA_PROPERTY_ID = 30123

public val UIA_StylesPatternId: UIA_PATTERN_ID = 10025

public val UIA_StylesShapePropertyId: UIA_PROPERTY_ID = 30124

public val UIA_StylesStyleIdPropertyId: UIA_PROPERTY_ID = 30120

public val UIA_StylesStyleNamePropertyId: UIA_PROPERTY_ID = 30121

public val UIA_SummaryChangeId: UIA_CHANGE_ID = 90000

public val UIA_SynchronizedInputPatternId: UIA_PATTERN_ID = 10021

public val UIA_SystemAlertEventId: UIA_EVENT_ID = 20023

public val UIA_TabControlTypeId: UIA_CONTROLTYPE_ID = 50018

public val UIA_TabItemControlTypeId: UIA_CONTROLTYPE_ID = 50019

public val UIA_TableColumnHeadersPropertyId: UIA_PROPERTY_ID = 30082

public val UIA_TableControlTypeId: UIA_CONTROLTYPE_ID = 50036

public val UIA_TableItemColumnHeaderItemsPropertyId: UIA_PROPERTY_ID = 30085

public val UIA_TableItemPatternId: UIA_PATTERN_ID = 10013

public val UIA_TableItemRowHeaderItemsPropertyId: UIA_PROPERTY_ID = 30084

public val UIA_TablePatternId: UIA_PATTERN_ID = 10012

public val UIA_TableRowHeadersPropertyId: UIA_PROPERTY_ID = 30081

public val UIA_TableRowOrColumnMajorPropertyId: UIA_PROPERTY_ID = 30083

public val UIA_TabsAttributeId: UIA_TEXTATTRIBUTE_ID = 40027

public val UIA_TextChildPatternId: UIA_PATTERN_ID = 10029

public val UIA_TextControlTypeId: UIA_CONTROLTYPE_ID = 50020

public val UIA_TextEditPatternId: UIA_PATTERN_ID = 10032

public val UIA_TextEdit_ConversionTargetChangedEventId: UIA_EVENT_ID = 20033

public val UIA_TextEdit_TextChangedEventId: UIA_EVENT_ID = 20032

public val UIA_TextFlowDirectionsAttributeId: UIA_TEXTATTRIBUTE_ID = 40028

public val UIA_TextPattern2Id: UIA_PATTERN_ID = 10024

public val UIA_TextPatternId: UIA_PATTERN_ID = 10014

public val UIA_Text_TextChangedEventId: UIA_EVENT_ID = 20015

public val UIA_Text_TextSelectionChangedEventId: UIA_EVENT_ID = 20014

public val UIA_ThumbControlTypeId: UIA_CONTROLTYPE_ID = 50027

public val UIA_TitleBarControlTypeId: UIA_CONTROLTYPE_ID = 50037

public val UIA_TogglePatternId: UIA_PATTERN_ID = 10015

public val UIA_ToggleToggleStatePropertyId: UIA_PROPERTY_ID = 30086

public val UIA_ToolBarControlTypeId: UIA_CONTROLTYPE_ID = 50021

public val UIA_ToolTipClosedEventId: UIA_EVENT_ID = 20001

public val UIA_ToolTipControlTypeId: UIA_CONTROLTYPE_ID = 50022

public val UIA_ToolTipOpenedEventId: UIA_EVENT_ID = 20000

public val UIA_Transform2CanZoomPropertyId: UIA_PROPERTY_ID = 30133

public val UIA_Transform2ZoomLevelPropertyId: UIA_PROPERTY_ID = 30145

public val UIA_Transform2ZoomMaximumPropertyId: UIA_PROPERTY_ID = 30147

public val UIA_Transform2ZoomMinimumPropertyId: UIA_PROPERTY_ID = 30146

public val UIA_TransformCanMovePropertyId: UIA_PROPERTY_ID = 30087

public val UIA_TransformCanResizePropertyId: UIA_PROPERTY_ID = 30088

public val UIA_TransformCanRotatePropertyId: UIA_PROPERTY_ID = 30089

public val UIA_TransformPattern2Id: UIA_PATTERN_ID = 10028

public val UIA_TransformPatternId: UIA_PATTERN_ID = 10016

public val UIA_TreeControlTypeId: UIA_CONTROLTYPE_ID = 50023

public val UIA_TreeItemControlTypeId: UIA_CONTROLTYPE_ID = 50024

public val UIA_UnderlineColorAttributeId: UIA_TEXTATTRIBUTE_ID = 40029

public val UIA_UnderlineStyleAttributeId: UIA_TEXTATTRIBUTE_ID = 40030

public val UIA_ValueIsReadOnlyPropertyId: UIA_PROPERTY_ID = 30046

public val UIA_ValuePatternId: UIA_PATTERN_ID = 10002

public val UIA_ValueValuePropertyId: UIA_PROPERTY_ID = 30045

public val UIA_VirtualizedItemPatternId: UIA_PATTERN_ID = 10020

public val UIA_VisualEffectsPropertyId: UIA_PROPERTY_ID = 30163

public val UIA_WindowCanMaximizePropertyId: UIA_PROPERTY_ID = 30073

public val UIA_WindowCanMinimizePropertyId: UIA_PROPERTY_ID = 30074

public val UIA_WindowControlTypeId: UIA_CONTROLTYPE_ID = 50032

public val UIA_WindowIsModalPropertyId: UIA_PROPERTY_ID = 30077

public val UIA_WindowIsTopmostPropertyId: UIA_PROPERTY_ID = 30078

public val UIA_WindowPatternId: UIA_PATTERN_ID = 10009

public val UIA_WindowWindowInteractionStatePropertyId: UIA_PROPERTY_ID = 30076

public val UIA_WindowWindowVisualStatePropertyId: UIA_PROPERTY_ID = 30075

public val UIA_Window_WindowClosedEventId: UIA_EVENT_ID = 20017

public val UIA_Window_WindowOpenedEventId: UIA_EVENT_ID = 20016

public val UIAutomationType_Array: UIAutomationType = 65536

public val UIAutomationType_Bool: UIAutomationType = 2

public val UIAutomationType_BoolArray: UIAutomationType = 65538

public val UIAutomationType_Double: UIAutomationType = 4

public val UIAutomationType_DoubleArray: UIAutomationType = 65540

public val UIAutomationType_Element: UIAutomationType = 7

public val UIAutomationType_ElementArray: UIAutomationType = 65543

public val UIAutomationType_Int: UIAutomationType = 1

public val UIAutomationType_IntArray: UIAutomationType = 65537

public val UIAutomationType_Out: UIAutomationType = 131072

public val UIAutomationType_OutBool: UIAutomationType = 131074

public val UIAutomationType_OutBoolArray: UIAutomationType = 196610

public val UIAutomationType_OutDouble: UIAutomationType = 131076

public val UIAutomationType_OutDoubleArray: UIAutomationType = 196612

public val UIAutomationType_OutElement: UIAutomationType = 131079

public val UIAutomationType_OutElementArray: UIAutomationType = 196615

public val UIAutomationType_OutInt: UIAutomationType = 131073

public val UIAutomationType_OutIntArray: UIAutomationType = 196609

public val UIAutomationType_OutPoint: UIAutomationType = 131077

public val UIAutomationType_OutPointArray: UIAutomationType = 196613

public val UIAutomationType_OutRect: UIAutomationType = 131078

public val UIAutomationType_OutRectArray: UIAutomationType = 196614

public val UIAutomationType_OutString: UIAutomationType = 131075

public val UIAutomationType_OutStringArray: UIAutomationType = 196611

public val UIAutomationType_Point: UIAutomationType = 5

public val UIAutomationType_PointArray: UIAutomationType = 65541

public val UIAutomationType_Rect: UIAutomationType = 6

public val UIAutomationType_RectArray: UIAutomationType = 65542

public val UIAutomationType_String: UIAutomationType = 3

public val UIAutomationType_StringArray: UIAutomationType = 65539

public val UiaAppendRuntimeId: UInt = 3u

public val UiaRootObjectId: Int = -25

public val Value_IsReadOnly_Property_GUID: GUID = GUID.from_u128(0xeb090f30e24c4799uL, 0xa7050d247bc037f8uL)

public val Value_Pattern_GUID: GUID = GUID.from_u128(0x17faad9ec877475buL, 0xb93377332779b637uL)

public val Value_Value_Property_GUID: GUID = GUID.from_u128(0xe95f5e64269f4a85uL, 0xba994092c3ea2986uL)

public val VirtualizedItem_Pattern_GUID: GUID = GUID.from_u128(0xf510173e2e7145e9uL, 0xa6e562f6ed8289d5uL)

public val VisualEffects_Bevel: VisualEffects = 16

public val VisualEffects_Glow: VisualEffects = 4

public val VisualEffects_None: VisualEffects = 0

public val VisualEffects_Property_GUID: GUID = GUID.from_u128(0xe61a8565aad946d7uL, 0x9e704e8a8420d420uL)

public val VisualEffects_Reflection: VisualEffects = 2

public val VisualEffects_Shadow: VisualEffects = 1

public val VisualEffects_SoftEdges: VisualEffects = 8

public val WindowInteractionState_BlockedByModalWindow: WindowInteractionState = 3

public val WindowInteractionState_Closing: WindowInteractionState = 1

public val WindowInteractionState_NotResponding: WindowInteractionState = 4

public val WindowInteractionState_ReadyForUserInteraction: WindowInteractionState = 2

public val WindowInteractionState_Running: WindowInteractionState = 0

public val WindowVisualState_Maximized: WindowVisualState = 1

public val WindowVisualState_Minimized: WindowVisualState = 2

public val WindowVisualState_Normal: WindowVisualState = 0

public val Window_CanMaximize_Property_GUID: GUID = GUID.from_u128(0x64fff53f635d41c1uL, 0x950ccb5adfbe28e3uL)

public val Window_CanMinimize_Property_GUID: GUID = GUID.from_u128(0xb73b462559884b97uL, 0xb4c2a6fe6e78c8c6uL)

public val Window_Control_GUID: GUID = GUID.from_u128(0xe13a7242f4624f4duL, 0xaec153b28d6c3290uL)

public val Window_IsModal_Property_GUID: GUID = GUID.from_u128(0xff4e689237b94fcauL, 0x8532ffe674ecfeeduL)

public val Window_IsTopmost_Property_GUID: GUID = GUID.from_u128(0xef7d85d309374962uL, 0x9241b62345f24041uL)

public val Window_Pattern_GUID: GUID = GUID.from_u128(0x27901735c7604994uL, 0xad115919e606b110uL)

public val Window_WindowClosed_Event_GUID: GUID = GUID.from_u128(0xedf141f8fa674e22uL, 0xbbf7944e05735ee2uL)

public val Window_WindowInteractionState_Property_GUID: GUID = GUID.from_u128(0x4fed26a404554fa2uL, 0xb21cc4da2db1ff9cuL)

public val Window_WindowOpened_Event_GUID: GUID = GUID.from_u128(0xd3e81d06de454f2fuL, 0x9633de9e02fb65afuL)

public val Window_WindowVisualState_Property_GUID: GUID = GUID.from_u128(0x4ab7905fe860453euL, 0xa30af6431e5daad5uL)

public val ZoomUnit_LargeDecrement: ZoomUnit = 1

public val ZoomUnit_LargeIncrement: ZoomUnit = 3

public val ZoomUnit_NoAmount: ZoomUnit = 0

public val ZoomUnit_SmallDecrement: ZoomUnit = 2

public val ZoomUnit_SmallIncrement: ZoomUnit = 4
