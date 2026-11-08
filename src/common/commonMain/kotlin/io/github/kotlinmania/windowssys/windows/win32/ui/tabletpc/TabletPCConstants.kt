package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val ALT_BREAKS_FULL: ALT_BREAKS = 2

public val ALT_BREAKS_SAME: ALT_BREAKS = 0

public val ALT_BREAKS_UNIQUE: ALT_BREAKS = 1

public val ASYNC_RECO_ADDSTROKE_FAILED: UInt = 4u

public val ASYNC_RECO_INTERRUPTED: UInt = 1u

public val ASYNC_RECO_PROCESS_FAILED: UInt = 2u

public val ASYNC_RECO_RESETCONTEXT_FAILED: UInt = 16u

public val ASYNC_RECO_SETCACMODE_FAILED: UInt = 8u

public val ASYNC_RECO_SETFACTOID_FAILED: UInt = 128u

public val ASYNC_RECO_SETFLAGS_FAILED: UInt = 64u

public val ASYNC_RECO_SETGUIDE_FAILED: UInt = 32u

public val ASYNC_RECO_SETTEXTCONTEXT_FAILED: UInt = 256u

public val ASYNC_RECO_SETWORDLIST_FAILED: UInt = 512u

public val AsyncStylusQueue: StylusQueue = 3

public val AsyncStylusQueueImmediate: StylusQueue = 2

public val BEST_COMPLETE: UInt = 2u

public val CAC_FULL: UInt = 0u

public val CAC_PREFIX: UInt = 1u

public val CAC_RANDOM: UInt = 2u

public val CFL_INTERMEDIATE: CONFIDENCE_LEVEL = 1

public val CFL_POOR: CONFIDENCE_LEVEL = 2

public val CFL_STRONG: CONFIDENCE_LEVEL = 0

public val Closed: VisualState = 4

public val CorrectionMode_NotVisible: CorrectionMode = 0

public val CorrectionMode_PostInsertionCollapsed: CorrectionMode = 2

public val CorrectionMode_PostInsertionExpanded: CorrectionMode = 3

public val CorrectionMode_PreInsertion: CorrectionMode = 1

public val CorrectionPosition_Auto: CorrectionPosition = 0

public val CorrectionPosition_Bottom: CorrectionPosition = 1

public val CorrectionPosition_Top: CorrectionPosition = 2

public val DISPID_DAAntiAliased: DISPID_InkDrawingAttributes = 6

public val DISPID_DAClone: DISPID_InkDrawingAttributes = 10

public val DISPID_DAColor: DISPID_InkDrawingAttributes = 2

public val DISPID_DAExtendedProperties: DISPID_InkDrawingAttributes = 11

public val DISPID_DAFitToCurve: DISPID_InkDrawingAttributes = 4

public val DISPID_DAHeight: DISPID_InkDrawingAttributes = 1

public val DISPID_DAIgnorePressure: DISPID_InkDrawingAttributes = 5

public val DISPID_DAPenTip: DISPID_InkDrawingAttributes = 9

public val DISPID_DARasterOperation: DISPID_InkDrawingAttributes = 8

public val DISPID_DATransparency: DISPID_InkDrawingAttributes = 7

public val DISPID_DAWidth: DISPID_InkDrawingAttributes = 3

public val DISPID_DisableNoScroll: DISPID_InkEdit = 3

public val DISPID_DragIcon: DISPID_InkEdit = 21

public val DISPID_DrawAttr: DISPID_InkEdit = 27

public val DISPID_Enabled: DISPID_InkEdit = 5

public val DISPID_Factoid: DISPID_InkEdit = 29

public val DISPID_GetGestStatus: DISPID_InkEdit = 33

public val DISPID_Hwnd: DISPID_InkEdit = 2

public val DISPID_IAddStrokesAtRectangle: DISPID_Ink = 17

public val DISPID_ICAutoRedraw: DISPID_InkCollector = 8

public val DISPID_ICBId: DISPID_InkCursorButton = 1

public val DISPID_ICBName: DISPID_InkCursorButton = 0

public val DISPID_ICBState: DISPID_InkCursorButton = 2

public val DISPID_ICBsCount: DISPID_InkCursorButtons = 1

public val DISPID_ICBsItem: DISPID_InkCursorButtons = 0

public val DISPID_ICBs_NewEnum: DISPID_InkCursorButtons = -4

public val DISPID_ICCollectingInk: DISPID_InkCollector = 9

public val DISPID_ICCollectionMode: DISPID_InkCollector = 28

public val DISPID_ICCursors: DISPID_InkCollector = 20

public val DISPID_ICDefaultDrawingAttributes: DISPID_InkCollector = 5

public val DISPID_ICDesiredPacketDescription: DISPID_InkCollector = 32

public val DISPID_ICDynamicRendering: DISPID_InkCollector = 31

public val DISPID_ICECursorButtonDown: DISPID_InkCollectorEvent = 5

public val DISPID_ICECursorButtonUp: DISPID_InkCollectorEvent = 6

public val DISPID_ICECursorDown: DISPID_InkCollectorEvent = 2

public val DISPID_ICECursorInRange: DISPID_InkCollectorEvent = 7

public val DISPID_ICECursorOutOfRange: DISPID_InkCollectorEvent = 8

public val DISPID_ICEGesture: DISPID_InkCollectorEvent = 10

public val DISPID_ICENewInAirPackets: DISPID_InkCollectorEvent = 4

public val DISPID_ICENewPackets: DISPID_InkCollectorEvent = 3

public val DISPID_ICEStroke: DISPID_InkCollectorEvent = 1

public val DISPID_ICESystemGesture: DISPID_InkCollectorEvent = 9

public val DISPID_ICETabletAdded: DISPID_InkCollectorEvent = 11

public val DISPID_ICETabletRemoved: DISPID_InkCollectorEvent = 12

public val DISPID_ICEnabled: DISPID_InkCollector = 1

public val DISPID_ICGetEventInterest: DISPID_InkCollector = 11

public val DISPID_ICGetGestureStatus: DISPID_InkCollector = 30

public val DISPID_ICGetWindowInputRectangle: DISPID_InkCollector = 24

public val DISPID_ICHwnd: DISPID_InkCollector = 2

public val DISPID_ICInk: DISPID_InkCollector = 7

public val DISPID_ICMarginX: DISPID_InkCollector = 21

public val DISPID_ICMarginY: DISPID_InkCollector = 22

public val DISPID_ICMouseIcon: DISPID_InkCollector = 35

public val DISPID_ICMousePointer: DISPID_InkCollector = 36

public val DISPID_ICPaint: DISPID_InkCollector = 3

public val DISPID_ICRenderer: DISPID_InkCollector = 6

public val DISPID_ICSetAllTabletsMode: DISPID_InkCollector = 26

public val DISPID_ICSetEventInterest: DISPID_InkCollector = 10

public val DISPID_ICSetGestureStatus: DISPID_InkCollector = 29

public val DISPID_ICSetSingleTabletIntegratedMode: DISPID_InkCollector = 27

public val DISPID_ICSetWindowInputRectangle: DISPID_InkCollector = 23

public val DISPID_ICSsAdd: DISPID_InkCustomStrokes = 2

public val DISPID_ICSsClear: DISPID_InkCustomStrokes = 4

public val DISPID_ICSsCount: DISPID_InkCustomStrokes = 1

public val DISPID_ICSsItem: DISPID_InkCustomStrokes = 0

public val DISPID_ICSsRemove: DISPID_InkCustomStrokes = 3

public val DISPID_ICSs_NewEnum: DISPID_InkCustomStrokes = -4

public val DISPID_ICSupportHighContrastInk: DISPID_InkCollector = 38

public val DISPID_ICTablet: DISPID_InkCollector = 25

public val DISPID_ICText: DISPID_InkCollector = 4

public val DISPID_ICanPaste: DISPID_Ink = 24

public val DISPID_IClip: DISPID_Ink = 18

public val DISPID_IClipboardCopy: DISPID_Ink = 23

public val DISPID_IClipboardCopyWithRectangle: DISPID_Ink = 22

public val DISPID_IClipboardPaste: DISPID_Ink = 25

public val DISPID_IClone: DISPID_Ink = 10

public val DISPID_ICreateStroke: DISPID_Ink = 16

public val DISPID_ICreateStrokeFromPoints: DISPID_Ink = 21

public val DISPID_ICreateStrokes: DISPID_Ink = 15

public val DISPID_ICsCount: DISPID_InkCursors = 1

public val DISPID_ICsItem: DISPID_InkCursors = 0

public val DISPID_ICs_NewEnum: DISPID_InkCursors = -4

public val DISPID_ICsrButtons: DISPID_InkCursor = 3

public val DISPID_ICsrDrawingAttributes: DISPID_InkCursor = 2

public val DISPID_ICsrId: DISPID_InkCursor = 1

public val DISPID_ICsrInverted: DISPID_InkCursor = 4

public val DISPID_ICsrName: DISPID_InkCursor = 0

public val DISPID_ICsrTablet: DISPID_InkCursor = 5

public val DISPID_ICustomStrokes: DISPID_Ink = 9

public val DISPID_IDeleteStroke: DISPID_Ink = 5

public val DISPID_IDeleteStrokes: DISPID_Ink = 4

public val DISPID_IDirty: DISPID_Ink = 8

public val DISPID_IEInkAdded: DISPID_InkEvent = 1

public val DISPID_IEInkDeleted: DISPID_InkEvent = 2

public val DISPID_IEPData: DISPID_InkExtendedProperty = 2

public val DISPID_IEPGuid: DISPID_InkExtendedProperty = 1

public val DISPID_IEPsAdd: DISPID_InkExtendedProperties = 2

public val DISPID_IEPsClear: DISPID_InkExtendedProperties = 4

public val DISPID_IEPsCount: DISPID_InkExtendedProperties = 1

public val DISPID_IEPsDoesPropertyExist: DISPID_InkExtendedProperties = 5

public val DISPID_IEPsItem: DISPID_InkExtendedProperties = 0

public val DISPID_IEPsRemove: DISPID_InkExtendedProperties = 3

public val DISPID_IEPs_NewEnum: DISPID_InkExtendedProperties = -4

public val DISPID_IExtendedProperties: DISPID_Ink = 2

public val DISPID_IExtractStrokes: DISPID_Ink = 6

public val DISPID_IExtractWithRectangle: DISPID_Ink = 7

public val DISPID_IGConfidence: DISPID_InkGesture = 2

public val DISPID_IGGetHotPoint: DISPID_InkGesture = 1

public val DISPID_IGId: DISPID_InkGesture = 0

public val DISPID_IGetBoundingBox: DISPID_Ink = 3

public val DISPID_IHitTestCircle: DISPID_Ink = 11

public val DISPID_IHitTestWithLasso: DISPID_Ink = 13

public val DISPID_IHitTestWithRectangle: DISPID_Ink = 12

public val DISPID_IInkDivider_Divide: DISPID_InkDivider = 4

public val DISPID_IInkDivider_LineHeight: DISPID_InkDivider = 3

public val DISPID_IInkDivider_RecognizerContext: DISPID_InkDivider = 2

public val DISPID_IInkDivider_Strokes: DISPID_InkDivider = 1

public val DISPID_IInkDivisionResult_ResultByType: DISPID_InkDivisionResult = 2

public val DISPID_IInkDivisionResult_Strokes: DISPID_InkDivisionResult = 1

public val DISPID_IInkDivisionUnit_DivisionType: DISPID_InkDivisionUnit = 2

public val DISPID_IInkDivisionUnit_RecognizedString: DISPID_InkDivisionUnit = 3

public val DISPID_IInkDivisionUnit_RotationTransform: DISPID_InkDivisionUnit = 4

public val DISPID_IInkDivisionUnit_Strokes: DISPID_InkDivisionUnit = 1

public val DISPID_IInkDivisionUnits_Count: DISPID_InkDivisionUnits = 1

public val DISPID_IInkDivisionUnits_Item: DISPID_InkDivisionUnits = 0

public val DISPID_IInkDivisionUnits_NewEnum: DISPID_InkDivisionUnits = -4

public val DISPID_ILoad: DISPID_Ink = 20

public val DISPID_INearestPoint: DISPID_Ink = 14

public val DISPID_IOAttachMode: DISPID_InkCollector = 14

public val DISPID_IODraw: DISPID_InkCollector = 16

public val DISPID_IOEPainted: DISPID_InkCollectorEvent = 14

public val DISPID_IOEPainting: DISPID_InkCollectorEvent = 13

public val DISPID_IOESelectionChanged: DISPID_InkCollectorEvent = 16

public val DISPID_IOESelectionChanging: DISPID_InkCollectorEvent = 15

public val DISPID_IOESelectionMoved: DISPID_InkCollectorEvent = 18

public val DISPID_IOESelectionMoving: DISPID_InkCollectorEvent = 17

public val DISPID_IOESelectionResized: DISPID_InkCollectorEvent = 20

public val DISPID_IOESelectionResizing: DISPID_InkCollectorEvent = 19

public val DISPID_IOEStrokesDeleted: DISPID_InkCollectorEvent = 22

public val DISPID_IOEStrokesDeleting: DISPID_InkCollectorEvent = 21

public val DISPID_IOEditingMode: DISPID_InkCollector = 12

public val DISPID_IOEraserMode: DISPID_InkCollector = 33

public val DISPID_IOEraserWidth: DISPID_InkCollector = 34

public val DISPID_IOHitTestSelection: DISPID_InkCollector = 15

public val DISPID_IOSelection: DISPID_InkCollector = 13

public val DISPID_IOSupportHighContrastSelectionUI: DISPID_InkCollector = 39

public val DISPID_IPBackColor: DISPID_InkCollector = 19

public val DISPID_IPEChangeUICues: DISPID_InkCollectorEvent = 23

public val DISPID_IPEClick: DISPID_InkCollectorEvent = 24

public val DISPID_IPEDblClick: DISPID_InkCollectorEvent = 25

public val DISPID_IPEInvalidated: DISPID_InkCollectorEvent = 26

public val DISPID_IPEKeyDown: DISPID_InkCollectorEvent = 37

public val DISPID_IPEKeyPress: DISPID_InkCollectorEvent = 38

public val DISPID_IPEKeyUp: DISPID_InkCollectorEvent = 39

public val DISPID_IPEMouseDown: DISPID_InkCollectorEvent = 27

public val DISPID_IPEMouseEnter: DISPID_InkCollectorEvent = 28

public val DISPID_IPEMouseHover: DISPID_InkCollectorEvent = 29

public val DISPID_IPEMouseLeave: DISPID_InkCollectorEvent = 30

public val DISPID_IPEMouseMove: DISPID_InkCollectorEvent = 31

public val DISPID_IPEMouseUp: DISPID_InkCollectorEvent = 32

public val DISPID_IPEMouseWheel: DISPID_InkCollectorEvent = 33

public val DISPID_IPEResize: DISPID_InkCollectorEvent = 40

public val DISPID_IPESizeChanged: DISPID_InkCollectorEvent = 41

public val DISPID_IPESizeModeChanged: DISPID_InkCollectorEvent = 34

public val DISPID_IPEStyleChanged: DISPID_InkCollectorEvent = 35

public val DISPID_IPESystemColorsChanged: DISPID_InkCollectorEvent = 36

public val DISPID_IPInkEnabled: DISPID_InkCollector = 37

public val DISPID_IPPicture: DISPID_InkCollector = 17

public val DISPID_IPSizeMode: DISPID_InkCollector = 18

public val DISPID_IRBottom: DISPID_InkRectangle = 3

public val DISPID_IRData: DISPID_InkRectangle = 7

public val DISPID_IRDraw: DISPID_InkRenderer = 5

public val DISPID_IRDrawStroke: DISPID_InkRenderer = 6

public val DISPID_IRERecognition: DISPID_InkRecognitionEvent = 2

public val DISPID_IRERecognitionWithAlternates: DISPID_InkRecognitionEvent = 1

public val DISPID_IRGColumns: DISPID_InkRecognizerGuide = 4

public val DISPID_IRGDrawnBox: DISPID_InkRecognizerGuide = 2

public val DISPID_IRGGuideData: DISPID_InkRecognizerGuide = 6

public val DISPID_IRGMidline: DISPID_InkRecognizerGuide = 5

public val DISPID_IRGRows: DISPID_InkRecognizerGuide = 3

public val DISPID_IRGWritingBox: DISPID_InkRecognizerGuide = 1

public val DISPID_IRGetObjectTransform: DISPID_InkRenderer = 3

public val DISPID_IRGetRectangle: DISPID_InkRectangle = 5

public val DISPID_IRGetViewTransform: DISPID_InkRenderer = 1

public val DISPID_IRInkSpaceToPixel: DISPID_InkRenderer = 8

public val DISPID_IRInkSpaceToPixelFromPoints: DISPID_InkRenderer = 10

public val DISPID_IRLeft: DISPID_InkRectangle = 2

public val DISPID_IRMeasure: DISPID_InkRenderer = 11

public val DISPID_IRMeasureStroke: DISPID_InkRenderer = 12

public val DISPID_IRMove: DISPID_InkRenderer = 13

public val DISPID_IRPixelToInkSpace: DISPID_InkRenderer = 7

public val DISPID_IRPixelToInkSpaceFromPoints: DISPID_InkRenderer = 9

public val DISPID_IRRight: DISPID_InkRectangle = 4

public val DISPID_IRRotate: DISPID_InkRenderer = 14

public val DISPID_IRScale: DISPID_InkRenderer = 15

public val DISPID_IRSetObjectTransform: DISPID_InkRenderer = 4

public val DISPID_IRSetRectangle: DISPID_InkRectangle = 6

public val DISPID_IRSetViewTransform: DISPID_InkRenderer = 2

public val DISPID_IRTop: DISPID_InkRectangle = 1

public val DISPID_IRecoCtx2_EnabledUnicodeRanges: DISPID_InkRecoContext2 = 0

public val DISPID_IRecoCtx_BackgroundRecognize: DISPID_InkRecoContext = 15

public val DISPID_IRecoCtx_BackgroundRecognizeWithAlternates: DISPID_InkRecoContext = 16

public val DISPID_IRecoCtx_CharacterAutoCompletionMode: DISPID_InkRecoContext = 2

public val DISPID_IRecoCtx_Clone: DISPID_InkRecoContext = 11

public val DISPID_IRecoCtx_EndInkInput: DISPID_InkRecoContext = 14

public val DISPID_IRecoCtx_Factoid: DISPID_InkRecoContext = 3

public val DISPID_IRecoCtx_Flags: DISPID_InkRecoContext = 7

public val DISPID_IRecoCtx_Guide: DISPID_InkRecoContext = 6

public val DISPID_IRecoCtx_IsStringSupported: DISPID_InkRecoContext = 17

public val DISPID_IRecoCtx_PrefixText: DISPID_InkRecoContext = 8

public val DISPID_IRecoCtx_Recognize: DISPID_InkRecoContext = 12

public val DISPID_IRecoCtx_Recognizer: DISPID_InkRecoContext = 5

public val DISPID_IRecoCtx_StopBackgroundRecognition: DISPID_InkRecoContext = 13

public val DISPID_IRecoCtx_StopRecognition: DISPID_InkRecoContext = 10

public val DISPID_IRecoCtx_Strokes: DISPID_InkRecoContext = 1

public val DISPID_IRecoCtx_SuffixText: DISPID_InkRecoContext = 9

public val DISPID_IRecoCtx_WordList: DISPID_InkRecoContext = 4

public val DISPID_IRecosCount: DISPID_InkRecognizers = 1

public val DISPID_IRecosGetDefaultRecognizer: DISPID_InkRecognizers = 2

public val DISPID_IRecosItem: DISPID_InkRecognizers = 0

public val DISPID_IRecos_NewEnum: DISPID_InkRecognizers = -4

public val DISPID_ISDBezierCusps: DISPID_InkStrokeDisp = 15

public val DISPID_ISDBezierPoints: DISPID_InkStrokeDisp = 13

public val DISPID_ISDClip: DISPID_InkStrokeDisp = 7

public val DISPID_ISDDeleted: DISPID_InkStrokeDisp = 20

public val DISPID_ISDDrawingAttributes: DISPID_InkStrokeDisp = 4

public val DISPID_ISDExtendedProperties: DISPID_InkStrokeDisp = 11

public val DISPID_ISDFindIntersections: DISPID_InkStrokeDisp = 5

public val DISPID_ISDGetBoundingBox: DISPID_InkStrokeDisp = 3

public val DISPID_ISDGetFlattenedBezierPoints: DISPID_InkStrokeDisp = 27

public val DISPID_ISDGetPacketData: DISPID_InkStrokeDisp = 24

public val DISPID_ISDGetPacketDescriptionPropertyMetrics: DISPID_InkStrokeDisp = 21

public val DISPID_ISDGetPacketValuesByProperty: DISPID_InkStrokeDisp = 25

public val DISPID_ISDGetPoints: DISPID_InkStrokeDisp = 22

public val DISPID_ISDGetRectangleIntersections: DISPID_InkStrokeDisp = 6

public val DISPID_ISDHitTestCircle: DISPID_InkStrokeDisp = 8

public val DISPID_ISDID: DISPID_InkStrokeDisp = 2

public val DISPID_ISDInk: DISPID_InkStrokeDisp = 12

public val DISPID_ISDInkIndex: DISPID_InkStrokeDisp = 1

public val DISPID_ISDMove: DISPID_InkStrokeDisp = 30

public val DISPID_ISDNearestPoint: DISPID_InkStrokeDisp = 9

public val DISPID_ISDPacketCount: DISPID_InkStrokeDisp = 17

public val DISPID_ISDPacketDescription: DISPID_InkStrokeDisp = 19

public val DISPID_ISDPacketSize: DISPID_InkStrokeDisp = 18

public val DISPID_ISDPolylineCusps: DISPID_InkStrokeDisp = 14

public val DISPID_ISDRotate: DISPID_InkStrokeDisp = 31

public val DISPID_ISDScale: DISPID_InkStrokeDisp = 33

public val DISPID_ISDScaleToRectangle: DISPID_InkStrokeDisp = 28

public val DISPID_ISDSelfIntersections: DISPID_InkStrokeDisp = 16

public val DISPID_ISDSetPacketValuesByProperty: DISPID_InkStrokeDisp = 26

public val DISPID_ISDSetPoints: DISPID_InkStrokeDisp = 23

public val DISPID_ISDShear: DISPID_InkStrokeDisp = 32

public val DISPID_ISDSplit: DISPID_InkStrokeDisp = 10

public val DISPID_ISDTransform: DISPID_InkStrokeDisp = 29

public val DISPID_ISave: DISPID_Ink = 19

public val DISPID_ISsAdd: DISPID_InkStrokes = 4

public val DISPID_ISsAddStrokes: DISPID_InkStrokes = 5

public val DISPID_ISsClip: DISPID_InkStrokes = 17

public val DISPID_ISsCount: DISPID_InkStrokes = 1

public val DISPID_ISsGetBoundingBox: DISPID_InkStrokes = 10

public val DISPID_ISsInk: DISPID_InkStrokes = 3

public val DISPID_ISsItem: DISPID_InkStrokes = 0

public val DISPID_ISsModifyDrawingAttributes: DISPID_InkStrokes = 9

public val DISPID_ISsMove: DISPID_InkStrokes = 13

public val DISPID_ISsRecognitionResult: DISPID_InkStrokes = 18

public val DISPID_ISsRemove: DISPID_InkStrokes = 6

public val DISPID_ISsRemoveRecognitionResult: DISPID_InkStrokes = 19

public val DISPID_ISsRemoveStrokes: DISPID_InkStrokes = 7

public val DISPID_ISsRotate: DISPID_InkStrokes = 14

public val DISPID_ISsScale: DISPID_InkStrokes = 16

public val DISPID_ISsScaleToRectangle: DISPID_InkStrokes = 11

public val DISPID_ISsShear: DISPID_InkStrokes = 15

public val DISPID_ISsToString: DISPID_InkStrokes = 8

public val DISPID_ISsTransform: DISPID_InkStrokes = 12

public val DISPID_ISsValid: DISPID_InkStrokes = 2

public val DISPID_ISs_NewEnum: DISPID_InkStrokes = -4

public val DISPID_IStrokes: DISPID_Ink = 1

public val DISPID_IT2DeviceKind: DISPID_InkTablet2 = 0

public val DISPID_IT3IsMultiTouch: DISPID_InkTablet3 = 0

public val DISPID_IT3MaximumCursors: DISPID_InkTablet3 = 1

public val DISPID_ITData: DISPID_InkTransform = 15

public val DISPID_ITGetTransform: DISPID_InkTransform = 13

public val DISPID_ITHardwareCapabilities: DISPID_InkTablet = 5

public val DISPID_ITIsPacketPropertySupported: DISPID_InkTablet = 3

public val DISPID_ITMaximumInputRectangle: DISPID_InkTablet = 4

public val DISPID_ITName: DISPID_InkTablet = 0

public val DISPID_ITPlugAndPlayId: DISPID_InkTablet = 1

public val DISPID_ITPropertyMetrics: DISPID_InkTablet = 2

public val DISPID_ITReflect: DISPID_InkTransform = 4

public val DISPID_ITReset: DISPID_InkTransform = 1

public val DISPID_ITRotate: DISPID_InkTransform = 3

public val DISPID_ITScale: DISPID_InkTransform = 6

public val DISPID_ITSetTransform: DISPID_InkTransform = 14

public val DISPID_ITShear: DISPID_InkTransform = 5

public val DISPID_ITTranslate: DISPID_InkTransform = 2

public val DISPID_ITeDx: DISPID_InkTransform = 11

public val DISPID_ITeDy: DISPID_InkTransform = 12

public val DISPID_ITeM11: DISPID_InkTransform = 7

public val DISPID_ITeM12: DISPID_InkTransform = 8

public val DISPID_ITeM21: DISPID_InkTransform = 9

public val DISPID_ITeM22: DISPID_InkTransform = 10

public val DISPID_ITsCount: DISPID_InkTablets = 2

public val DISPID_ITsDefaultTablet: DISPID_InkTablets = 1

public val DISPID_ITsIsPacketPropertySupported: DISPID_InkTablets = 3

public val DISPID_ITsItem: DISPID_InkTablets = 0

public val DISPID_ITs_NewEnum: DISPID_InkTablets = -4

public val DISPID_IeeChange: DISPID_InkEditEvents = 1

public val DISPID_IeeClick: DISPID_InkEditEvents = 9

public val DISPID_IeeCursorDown: DISPID_InkEditEvents = 21

public val DISPID_IeeDblClick: DISPID_InkEditEvents = 8

public val DISPID_IeeGesture: DISPID_InkEditEvents = 23

public val DISPID_IeeKeyDown: DISPID_InkEditEvents = 3

public val DISPID_IeeKeyPress: DISPID_InkEditEvents = 7

public val DISPID_IeeKeyUp: DISPID_InkEditEvents = 4

public val DISPID_IeeMouseDown: DISPID_InkEditEvents = 6

public val DISPID_IeeMouseMove: DISPID_InkEditEvents = 10

public val DISPID_IeeMouseUp: DISPID_InkEditEvents = 5

public val DISPID_IeeRecognitionResult: DISPID_InkEditEvents = 24

public val DISPID_IeeSelChange: DISPID_InkEditEvents = 2

public val DISPID_IeeStroke: DISPID_InkEditEvents = 22

public val DISPID_InkInsertMode: DISPID_InkEdit = 25

public val DISPID_InkMode: DISPID_InkEdit = 24

public val DISPID_InkRecoAlternate_AlternatesWithConstantPropertyValues: DISPID_InkRecoAlternate = 15

public val DISPID_InkRecoAlternate_Ascender: DISPID_InkRecoAlternate = 5

public val DISPID_InkRecoAlternate_Baseline: DISPID_InkRecoAlternate = 3

public val DISPID_InkRecoAlternate_Confidence: DISPID_InkRecoAlternate = 7

public val DISPID_InkRecoAlternate_ConfidenceAlternates: DISPID_InkRecoAlternate = 14

public val DISPID_InkRecoAlternate_Descender: DISPID_InkRecoAlternate = 6

public val DISPID_InkRecoAlternate_GetPropertyValue: DISPID_InkRecoAlternate = 12

public val DISPID_InkRecoAlternate_GetStrokesFromStrokeRanges: DISPID_InkRecoAlternate = 9

public val DISPID_InkRecoAlternate_GetStrokesFromTextRange: DISPID_InkRecoAlternate = 10

public val DISPID_InkRecoAlternate_GetTextRangeFromStrokes: DISPID_InkRecoAlternate = 11

public val DISPID_InkRecoAlternate_LineAlternates: DISPID_InkRecoAlternate = 13

public val DISPID_InkRecoAlternate_LineNumber: DISPID_InkRecoAlternate = 2

public val DISPID_InkRecoAlternate_Midline: DISPID_InkRecoAlternate = 4

public val DISPID_InkRecoAlternate_String: DISPID_InkRecoAlternate = 1

public val DISPID_InkRecoAlternate_Strokes: DISPID_InkRecoAlternate = 8

public val DISPID_InkRecognitionAlternates_Count: DISPID_InkRecognitionAlternates = 1

public val DISPID_InkRecognitionAlternates_Item: DISPID_InkRecognitionAlternates = 0

public val DISPID_InkRecognitionAlternates_NewEnum: DISPID_InkRecognitionAlternates = -4

public val DISPID_InkRecognitionAlternates_Strokes: DISPID_InkRecognitionAlternates = 2

public val DISPID_InkRecognitionResult_AlternatesFromSelection: DISPID_InkRecognitionResult = 5

public val DISPID_InkRecognitionResult_ModifyTopAlternate: DISPID_InkRecognitionResult = 6

public val DISPID_InkRecognitionResult_SetResultOnStrokes: DISPID_InkRecognitionResult = 7

public val DISPID_InkRecognitionResult_Strokes: DISPID_InkRecognitionResult = 3

public val DISPID_InkRecognitionResult_TopAlternate: DISPID_InkRecognitionResult = 2

public val DISPID_InkRecognitionResult_TopConfidence: DISPID_InkRecognitionResult = 4

public val DISPID_InkRecognitionResult_TopString: DISPID_InkRecognitionResult = 1

public val DISPID_InkWordList2_AddWords: DISPID_InkWordList2 = 3

public val DISPID_InkWordList_AddWord: DISPID_InkWordList = 0

public val DISPID_InkWordList_Merge: DISPID_InkWordList = 2

public val DISPID_InkWordList_RemoveWord: DISPID_InkWordList = 1

public val DISPID_Locked: DISPID_InkEdit = 4

public val DISPID_MICClear: DISPID_MathInputControlEvents = 3

public val DISPID_MICClose: DISPID_MathInputControlEvents = 1

public val DISPID_MICInsert: DISPID_MathInputControlEvents = 0

public val DISPID_MICPaint: DISPID_MathInputControlEvents = 2

public val DISPID_MaxLength: DISPID_InkEdit = 6

public val DISPID_MultiLine: DISPID_InkEdit = 7

public val DISPID_PIPAttachedEditWindow: DISPID_PenInputPanel = 0

public val DISPID_PIPAutoShow: DISPID_PenInputPanel = 16

public val DISPID_PIPBusy: DISPID_PenInputPanel = 12

public val DISPID_PIPCommitPendingInput: DISPID_PenInputPanel = 10

public val DISPID_PIPCurrentPanel: DISPID_PenInputPanel = 2

public val DISPID_PIPDefaultPanel: DISPID_PenInputPanel = 3

public val DISPID_PIPEInputFailed: DISPID_PenInputPanelEvents = 2

public val DISPID_PIPEPanelChanged: DISPID_PenInputPanelEvents = 1

public val DISPID_PIPEPanelMoving: DISPID_PenInputPanelEvents = 3

public val DISPID_PIPEVisibleChanged: DISPID_PenInputPanelEvents = 0

public val DISPID_PIPEnableTsf: DISPID_PenInputPanel = 15

public val DISPID_PIPFactoid: DISPID_PenInputPanel = 1

public val DISPID_PIPHeight: DISPID_PenInputPanel = 8

public val DISPID_PIPHorizontalOffset: DISPID_PenInputPanel = 14

public val DISPID_PIPLeft: DISPID_PenInputPanel = 6

public val DISPID_PIPMoveTo: DISPID_PenInputPanel = 9

public val DISPID_PIPRefresh: DISPID_PenInputPanel = 11

public val DISPID_PIPTop: DISPID_PenInputPanel = 5

public val DISPID_PIPVerticalOffset: DISPID_PenInputPanel = 13

public val DISPID_PIPVisible: DISPID_PenInputPanel = 4

public val DISPID_PIPWidth: DISPID_PenInputPanel = 7

public val DISPID_RTSelLength: DISPID_InkEdit = 10

public val DISPID_RTSelStart: DISPID_InkEdit = 9

public val DISPID_RTSelText: DISPID_InkEdit = 11

public val DISPID_RecoCapabilities: DISPID_InkRecognizer = 4

public val DISPID_RecoClsid: DISPID_InkRecognizer = 1

public val DISPID_RecoCreateRecognizerContext: DISPID_InkRecognizer = 7

public val DISPID_RecoId: DISPID_InkRecognizer2 = 0

public val DISPID_RecoLanguageID: DISPID_InkRecognizer = 5

public val DISPID_RecoName: DISPID_InkRecognizer = 2

public val DISPID_RecoPreferredPacketDescription: DISPID_InkRecognizer = 6

public val DISPID_RecoSupportedProperties: DISPID_InkRecognizer = 8

public val DISPID_RecoTimeout: DISPID_InkEdit = 26

public val DISPID_RecoUnicodeRanges: DISPID_InkRecognizer2 = 1

public val DISPID_RecoVendor: DISPID_InkRecognizer = 3

public val DISPID_Recognize: DISPID_InkEdit = 32

public val DISPID_Recognizer: DISPID_InkEdit = 28

public val DISPID_Refresh: DISPID_InkEdit = 35

public val DISPID_SEStrokesAdded: DISPID_StrokeEvent = 1

public val DISPID_SEStrokesRemoved: DISPID_StrokeEvent = 2

public val DISPID_ScrollBars: DISPID_InkEdit = 8

public val DISPID_SelAlignment: DISPID_InkEdit = 12

public val DISPID_SelBold: DISPID_InkEdit = 13

public val DISPID_SelCharOffset: DISPID_InkEdit = 14

public val DISPID_SelColor: DISPID_InkEdit = 15

public val DISPID_SelFontName: DISPID_InkEdit = 16

public val DISPID_SelFontSize: DISPID_InkEdit = 17

public val DISPID_SelInk: DISPID_InkEdit = 30

public val DISPID_SelInksDisplayMode: DISPID_InkEdit = 31

public val DISPID_SelItalic: DISPID_InkEdit = 18

public val DISPID_SelRTF: DISPID_InkEdit = 19

public val DISPID_SelUnderline: DISPID_InkEdit = 20

public val DISPID_SetGestStatus: DISPID_InkEdit = 34

public val DISPID_Status: DISPID_InkEdit = 22

public val DISPID_Text: DISPID_InkEdit = 0

public val DISPID_TextRTF: DISPID_InkEdit = 1

public val DISPID_UseMouseForInput: DISPID_InkEdit = 23

public val DockedBottom: VisualState = 3

public val DockedTop: VisualState = 2

public val DynamicRenderer: GUID = GUID.from_u128(U128(0xecd32aea746f4dcbuL, 0xbf68082757faff18uL))

public val EM_GETDRAWATTR: UInt = 1541u

public val EM_GETFACTOID: UInt = 1549u

public val EM_GETGESTURESTATUS: UInt = 1545u

public val EM_GETINKINSERTMODE: UInt = 1539u

public val EM_GETINKMODE: UInt = 1537u

public val EM_GETMOUSEICON: UInt = 1553u

public val EM_GETMOUSEPOINTER: UInt = 1555u

public val EM_GETRECOGNIZER: UInt = 1547u

public val EM_GETRECOTIMEOUT: UInt = 1543u

public val EM_GETSELINK: UInt = 1551u

public val EM_GETSELINKDISPLAYMODE: UInt = 1562u

public val EM_GETSTATUS: UInt = 1557u

public val EM_GETUSEMOUSEFORINPUT: UInt = 1559u

public val EM_RECOGNIZE: UInt = 1558u

public val EM_SETDRAWATTR: UInt = 1542u

public val EM_SETFACTOID: UInt = 1550u

public val EM_SETGESTURESTATUS: UInt = 1546u

public val EM_SETINKINSERTMODE: UInt = 1540u

public val EM_SETINKMODE: UInt = 1538u

public val EM_SETMOUSEICON: UInt = 1554u

public val EM_SETMOUSEPOINTER: UInt = 1556u

public val EM_SETRECOGNIZER: UInt = 1548u

public val EM_SETRECOTIMEOUT: UInt = 1544u

public val EM_SETSELINK: UInt = 1552u

public val EM_SETSELINKDISPLAYMODE: UInt = 1561u

public val EM_SETUSEMOUSEFORINPUT: UInt = 1560u

public val EventMask_All: EventMask = 4095

public val EventMask_CorrectionModeChanged: EventMask = 128

public val EventMask_CorrectionModeChanging: EventMask = 64

public val EventMask_InPlaceSizeChanged: EventMask = 8

public val EventMask_InPlaceSizeChanging: EventMask = 4

public val EventMask_InPlaceStateChanged: EventMask = 2

public val EventMask_InPlaceStateChanging: EventMask = 1

public val EventMask_InPlaceVisibilityChanged: EventMask = 512

public val EventMask_InPlaceVisibilityChanging: EventMask = 256

public val EventMask_InputAreaChanged: EventMask = 32

public val EventMask_InputAreaChanging: EventMask = 16

public val EventMask_TextInserted: EventMask = 2048

public val EventMask_TextInserting: EventMask = 1024

public val FACILITY_INK: UInt = 40u

public val FACTOID_BOPOMOFO: PCWSTR = w("BOPOMOFO")

public val FACTOID_CHINESESIMPLECOMMON: PCWSTR = w("CHS_COMMON")

public val FACTOID_CHINESETRADITIONALCOMMON: PCWSTR = w("CHT_COMMON")

public val FACTOID_CURRENCY: PCWSTR = w("CURRENCY")

public val FACTOID_DATE: PCWSTR = w("DATE")

public val FACTOID_DEFAULT: PCWSTR = w("DEFAULT")

public val FACTOID_DIGIT: PCWSTR = w("DIGIT")

public val FACTOID_EMAIL: PCWSTR = w("EMAIL")

public val FACTOID_FILENAME: PCWSTR = w("FILENAME")

public val FACTOID_HANGULCOMMON: PCWSTR = w("HANGUL_COMMON")

public val FACTOID_HANGULRARE: PCWSTR = w("HANGUL_RARE")

public val FACTOID_HIRAGANA: PCWSTR = w("HIRAGANA")

public val FACTOID_JAMO: PCWSTR = w("JAMO")

public val FACTOID_JAPANESECOMMON: PCWSTR = w("JPN_COMMON")

public val FACTOID_KANJICOMMON: PCWSTR = w("KANJI_COMMON")

public val FACTOID_KANJIRARE: PCWSTR = w("KANJI_RARE")

public val FACTOID_KATAKANA: PCWSTR = w("KATAKANA")

public val FACTOID_KOREANCOMMON: PCWSTR = w("KOR_COMMON")

public val FACTOID_LOWERCHAR: PCWSTR = w("LOWERCHAR")

public val FACTOID_NONE: PCWSTR = w("NONE")

public val FACTOID_NUMBER: PCWSTR = w("NUMBER")

public val FACTOID_NUMBERSIMPLE: PCWSTR = w("NUMSIMPLE")

public val FACTOID_ONECHAR: PCWSTR = w("ONECHAR")

public val FACTOID_PERCENT: PCWSTR = w("PERCENT")

public val FACTOID_POSTALCODE: PCWSTR = w("POSTALCODE")

public val FACTOID_PUNCCHAR: PCWSTR = w("PUNCCHAR")

public val FACTOID_SYSTEMDICTIONARY: PCWSTR = w("SYSDICT")

public val FACTOID_TELEPHONE: PCWSTR = w("TELEPHONE")

public val FACTOID_TIME: PCWSTR = w("TIME")

public val FACTOID_UPPERCHAR: PCWSTR = w("UPPERCHAR")

public val FACTOID_WEB: PCWSTR = w("WEB")

public val FACTOID_WORDLIST: PCWSTR = w("WORDLIST")

public val FLICKACTION_COMMANDCODE_APPCOMMAND: FLICKACTION_COMMANDCODE = 2

public val FLICKACTION_COMMANDCODE_CUSTOMKEY: FLICKACTION_COMMANDCODE = 3

public val FLICKACTION_COMMANDCODE_KEYMODIFIER: FLICKACTION_COMMANDCODE = 4

public val FLICKACTION_COMMANDCODE_NULL: FLICKACTION_COMMANDCODE = 0

public val FLICKACTION_COMMANDCODE_SCROLL: FLICKACTION_COMMANDCODE = 1

public val FLICKDIRECTION_DOWN: FLICKDIRECTION = 6

public val FLICKDIRECTION_DOWNLEFT: FLICKDIRECTION = 5

public val FLICKDIRECTION_DOWNRIGHT: FLICKDIRECTION = 7

public val FLICKDIRECTION_INVALID: FLICKDIRECTION = 8

public val FLICKDIRECTION_LEFT: FLICKDIRECTION = 4

public val FLICKDIRECTION_MIN: FLICKDIRECTION = 0

public val FLICKDIRECTION_RIGHT: FLICKDIRECTION = 0

public val FLICKDIRECTION_UP: FLICKDIRECTION = 2

public val FLICKDIRECTION_UPLEFT: FLICKDIRECTION = 3

public val FLICKDIRECTION_UPRIGHT: FLICKDIRECTION = 1

public val FLICKMODE_DEFAULT: FLICKMODE = 1

public val FLICKMODE_LEARNING: FLICKMODE = 2

public val FLICKMODE_MAX: FLICKMODE = 2

public val FLICKMODE_MIN: FLICKMODE = 0

public val FLICKMODE_OFF: FLICKMODE = 0

public val FLICKMODE_ON: FLICKMODE = 1

public val FLICK_WM_HANDLED_MASK: UInt = 1u

public val Floating: VisualState = 1

public val GESTURE_ARROW_DOWN: UInt = 61497u

public val GESTURE_ARROW_LEFT: UInt = 61498u

public val GESTURE_ARROW_RIGHT: UInt = 61499u

public val GESTURE_ARROW_UP: UInt = 61496u

public val GESTURE_ASTERISK: UInt = 61608u

public val GESTURE_BRACE_LEFT: UInt = 61674u

public val GESTURE_BRACE_OVER: UInt = 61672u

public val GESTURE_BRACE_RIGHT: UInt = 61675u

public val GESTURE_BRACE_UNDER: UInt = 61673u

public val GESTURE_BRACKET_LEFT: UInt = 61670u

public val GESTURE_BRACKET_OVER: UInt = 61668u

public val GESTURE_BRACKET_RIGHT: UInt = 61671u

public val GESTURE_BRACKET_UNDER: UInt = 61669u

public val GESTURE_BULLET: UInt = 61450u

public val GESTURE_BULLET_CROSS: UInt = 61451u

public val GESTURE_CHECK: UInt = 61445u

public val GESTURE_CHEVRON_DOWN: UInt = 61489u

public val GESTURE_CHEVRON_LEFT: UInt = 61490u

public val GESTURE_CHEVRON_RIGHT: UInt = 61491u

public val GESTURE_CHEVRON_UP: UInt = 61488u

public val GESTURE_CIRCLE: UInt = 61472u

public val GESTURE_CIRCLE_CIRCLE: UInt = 61475u

public val GESTURE_CIRCLE_CROSS: UInt = 61477u

public val GESTURE_CIRCLE_LINE_HORZ: UInt = 61479u

public val GESTURE_CIRCLE_LINE_VERT: UInt = 61478u

public val GESTURE_CIRCLE_TAP: UInt = 61474u

public val GESTURE_CLOSEUP: UInt = 61455u

public val GESTURE_CROSS: UInt = 61447u

public val GESTURE_CURLICUE: UInt = 61456u

public val GESTURE_DIAGONAL_LEFTDOWN: UInt = 61534u

public val GESTURE_DIAGONAL_LEFTUP: UInt = 61532u

public val GESTURE_DIAGONAL_RIGHTDOWN: UInt = 61535u

public val GESTURE_DIAGONAL_RIGHTUP: UInt = 61533u

public val GESTURE_DIGIT_0: UInt = 61594u

public val GESTURE_DIGIT_1: UInt = 61595u

public val GESTURE_DIGIT_2: UInt = 61596u

public val GESTURE_DIGIT_3: UInt = 61597u

public val GESTURE_DIGIT_4: UInt = 61598u

public val GESTURE_DIGIT_5: UInt = 61599u

public val GESTURE_DIGIT_6: UInt = 61600u

public val GESTURE_DIGIT_7: UInt = 61601u

public val GESTURE_DIGIT_8: UInt = 61602u

public val GESTURE_DIGIT_9: UInt = 61603u

public val GESTURE_DOLLAR: UInt = 61607u

public val GESTURE_DOUBLE_ARROW_DOWN: UInt = 61501u

public val GESTURE_DOUBLE_ARROW_LEFT: UInt = 61502u

public val GESTURE_DOUBLE_ARROW_RIGHT: UInt = 61503u

public val GESTURE_DOUBLE_ARROW_UP: UInt = 61500u

public val GESTURE_DOUBLE_CIRCLE: UInt = 61473u

public val GESTURE_DOUBLE_CURLICUE: UInt = 61457u

public val GESTURE_DOUBLE_DOWN: UInt = 61625u

public val GESTURE_DOUBLE_LEFT: UInt = 61626u

public val GESTURE_DOUBLE_RIGHT: UInt = 61627u

public val GESTURE_DOUBLE_TAP: UInt = 61681u

public val GESTURE_DOUBLE_UP: UInt = 61624u

public val GESTURE_DOWN: UInt = 61529u

public val GESTURE_DOWN_ARROW_LEFT: UInt = 61506u

public val GESTURE_DOWN_ARROW_RIGHT: UInt = 61507u

public val GESTURE_DOWN_LEFT: UInt = 61546u

public val GESTURE_DOWN_LEFT_LONG: UInt = 61542u

public val GESTURE_DOWN_RIGHT: UInt = 61547u

public val GESTURE_DOWN_RIGHT_LONG: UInt = 61543u

public val GESTURE_DOWN_UP: UInt = 61537u

public val GESTURE_EXCLAMATION: UInt = 61604u

public val GESTURE_INFINITY: UInt = 61446u

public val GESTURE_LEFT: UInt = 61530u

public val GESTURE_LEFT_ARROW_DOWN: UInt = 61509u

public val GESTURE_LEFT_ARROW_UP: UInt = 61508u

public val GESTURE_LEFT_DOWN: UInt = 61549u

public val GESTURE_LEFT_RIGHT: UInt = 61538u

public val GESTURE_LEFT_UP: UInt = 61548u

public val GESTURE_LETTER_A: UInt = 61568u

public val GESTURE_LETTER_B: UInt = 61569u

public val GESTURE_LETTER_C: UInt = 61570u

public val GESTURE_LETTER_D: UInt = 61571u

public val GESTURE_LETTER_E: UInt = 61572u

public val GESTURE_LETTER_F: UInt = 61573u

public val GESTURE_LETTER_G: UInt = 61574u

public val GESTURE_LETTER_H: UInt = 61575u

public val GESTURE_LETTER_I: UInt = 61576u

public val GESTURE_LETTER_J: UInt = 61577u

public val GESTURE_LETTER_K: UInt = 61578u

public val GESTURE_LETTER_L: UInt = 61579u

public val GESTURE_LETTER_M: UInt = 61580u

public val GESTURE_LETTER_N: UInt = 61581u

public val GESTURE_LETTER_O: UInt = 61582u

public val GESTURE_LETTER_P: UInt = 61583u

public val GESTURE_LETTER_Q: UInt = 61584u

public val GESTURE_LETTER_R: UInt = 61585u

public val GESTURE_LETTER_S: UInt = 61586u

public val GESTURE_LETTER_T: UInt = 61587u

public val GESTURE_LETTER_U: UInt = 61588u

public val GESTURE_LETTER_V: UInt = 61589u

public val GESTURE_LETTER_W: UInt = 61590u

public val GESTURE_LETTER_X: UInt = 61591u

public val GESTURE_LETTER_Y: UInt = 61592u

public val GESTURE_LETTER_Z: UInt = 61593u

public val GESTURE_NULL: UInt = 61440u

public val GESTURE_OPENUP: UInt = 61454u

public val GESTURE_PARAGRAPH: UInt = 61448u

public val GESTURE_PLUS: UInt = 61609u

public val GESTURE_QUAD_TAP: UInt = 61683u

public val GESTURE_QUESTION: UInt = 61605u

public val GESTURE_RECTANGLE: UInt = 61458u

public val GESTURE_RIGHT: UInt = 61531u

public val GESTURE_RIGHT_ARROW_DOWN: UInt = 61511u

public val GESTURE_RIGHT_ARROW_UP: UInt = 61510u

public val GESTURE_RIGHT_DOWN: UInt = 61551u

public val GESTURE_RIGHT_LEFT: UInt = 61539u

public val GESTURE_RIGHT_UP: UInt = 61550u

public val GESTURE_SCRATCHOUT: UInt = 61441u

public val GESTURE_SECTION: UInt = 61449u

public val GESTURE_SEMICIRCLE_LEFT: UInt = 61480u

public val GESTURE_SEMICIRCLE_RIGHT: UInt = 61481u

public val GESTURE_SHARP: UInt = 61606u

public val GESTURE_SQUARE: UInt = 61443u

public val GESTURE_SQUIGGLE: UInt = 61452u

public val GESTURE_STAR: UInt = 61444u

public val GESTURE_SWAP: UInt = 61453u

public val GESTURE_TAP: UInt = 61680u

public val GESTURE_TRIANGLE: UInt = 61442u

public val GESTURE_TRIPLE_DOWN: UInt = 61629u

public val GESTURE_TRIPLE_LEFT: UInt = 61630u

public val GESTURE_TRIPLE_RIGHT: UInt = 61631u

public val GESTURE_TRIPLE_TAP: UInt = 61682u

public val GESTURE_TRIPLE_UP: UInt = 61628u

public val GESTURE_UP: UInt = 61528u

public val GESTURE_UP_ARROW_LEFT: UInt = 61504u

public val GESTURE_UP_ARROW_RIGHT: UInt = 61505u

public val GESTURE_UP_DOWN: UInt = 61536u

public val GESTURE_UP_LEFT: UInt = 61544u

public val GESTURE_UP_LEFT_LONG: UInt = 61540u

public val GESTURE_UP_RIGHT: UInt = 61545u

public val GESTURE_UP_RIGHT_LONG: UInt = 61541u

public val GUID_DYNAMIC_RENDERER_CACHED_DATA: GUID = GUID.from_u128(U128(0xbf531b9225bf4a95uL, 0x89ad0e476b34b4f5uL))

public val GUID_GESTURE_DATA: GUID = GUID.from_u128(U128(0x41e4ec0f26aa455auL, 0x9aa52cd36cf63fb9uL))

public val GUID_PACKETPROPERTY_GUID_ALTITUDE_ORIENTATION: GUID = GUID.from_u128(U128(0x82dec5c7f6ba4906uL, 0x894f66d68dfc456cuL))

public val GUID_PACKETPROPERTY_GUID_AZIMUTH_ORIENTATION: GUID = GUID.from_u128(U128(0x29123b48828410buL, 0xb250a0536595e5dcuL))

public val GUID_PACKETPROPERTY_GUID_BUTTON_PRESSURE: GUID = GUID.from_u128(U128(0x8b7fefc496aa4bfeuL, 0xac268a5f0be07bf5uL))

public val GUID_PACKETPROPERTY_GUID_DEVICE_CONTACT_ID: GUID = GUID.from_u128(U128(0x2585b91049b4750uL, 0x9615df8948ab3c9cuL))

public val GUID_PACKETPROPERTY_GUID_FINGERCONTACTCONFIDENCE: GUID = GUID.from_u128(U128(0xe706c80457f04f00uL, 0x8a0c853d57789be9uL))

public val GUID_PACKETPROPERTY_GUID_HEIGHT: GUID = GUID.from_u128(U128(0xe61858d2e4474218uL, 0x9d3f18865c203df4uL))

public val GUID_PACKETPROPERTY_GUID_NORMAL_PRESSURE: GUID = GUID.from_u128(U128(0x7307502df9f44e18uL, 0xb3f22ce1b1a3610cuL))

public val GUID_PACKETPROPERTY_GUID_PACKET_STATUS: GUID = GUID.from_u128(U128(0x6e0e07bfafe74cf7uL, 0x87d1af6446208418uL))

public val GUID_PACKETPROPERTY_GUID_PITCH_ROTATION: GUID = GUID.from_u128(U128(0x7f7e57b7be374be1uL, 0xa3567a84160e1893uL))

public val GUID_PACKETPROPERTY_GUID_ROLL_ROTATION: GUID = GUID.from_u128(U128(0x5d5d5e566ba94c5buL, 0x9fb0851c91714e56uL))

public val GUID_PACKETPROPERTY_GUID_SERIAL_NUMBER: GUID = GUID.from_u128(U128(0x78a81b5609354493uL, 0xbaae00541a8a16c4uL))

public val GUID_PACKETPROPERTY_GUID_TANGENT_PRESSURE: GUID = GUID.from_u128(U128(0x6da4488b524441ecuL, 0x905b32d89ab80809uL))

public val GUID_PACKETPROPERTY_GUID_TIMER_TICK: GUID = GUID.from_u128(U128(0x436510c5fed345d1uL, 0x8b7671d3ea7a829duL))

public val GUID_PACKETPROPERTY_GUID_TWIST_ORIENTATION: GUID = GUID.from_u128(U128(0xd32496013b241e4uL, 0xace67ae9d43d2d3buL))

public val GUID_PACKETPROPERTY_GUID_WIDTH: GUID = GUID.from_u128(U128(0xbaabe94d271248f5uL, 0xbe9d8f8b5ea0711auL))

public val GUID_PACKETPROPERTY_GUID_X: GUID = GUID.from_u128(U128(0x598a6a8f52c04ba0uL, 0x93afaf357411a561uL))

public val GUID_PACKETPROPERTY_GUID_X_TILT_ORIENTATION: GUID = GUID.from_u128(U128(0xa8d07b3a8bf040b0uL, 0x95a9b80a6bb787bfuL))

public val GUID_PACKETPROPERTY_GUID_Y: GUID = GUID.from_u128(U128(0xb53f9f7504e04498uL, 0xa7eec30dbb5a9011uL))

public val GUID_PACKETPROPERTY_GUID_YAW_ROTATION: GUID = GUID.from_u128(U128(0x6a8499807c3a45b7uL, 0xaa8290a262950e89uL))

public val GUID_PACKETPROPERTY_GUID_Y_TILT_ORIENTATION: GUID = GUID.from_u128(U128(0xe9323891d7743afuL, 0xac005b950d6d4b2duL))

public val GUID_PACKETPROPERTY_GUID_Z: GUID = GUID.from_u128(U128(0x735adb300ebb4788uL, 0xa0e40f316490055duL))

public val GestureRecognizer: GUID = GUID.from_u128(U128(0xea30c654c62c441fuL, 0xac0095f9a196782cuL))

public val HandwrittenTextInsertion: GUID = GUID.from_u128(U128(0x9f074ee2e6e94d8auL, 0xa047eb5b5c3c55dauL))

public val IAG_AllGestures: InkApplicationGesture = 0

public val IAG_ArrowDown: InkApplicationGesture = 61497

public val IAG_ArrowLeft: InkApplicationGesture = 61498

public val IAG_ArrowRight: InkApplicationGesture = 61499

public val IAG_ArrowUp: InkApplicationGesture = 61496

public val IAG_Check: InkApplicationGesture = 61445

public val IAG_ChevronDown: InkApplicationGesture = 61489

public val IAG_ChevronLeft: InkApplicationGesture = 61490

public val IAG_ChevronRight: InkApplicationGesture = 61491

public val IAG_ChevronUp: InkApplicationGesture = 61488

public val IAG_Circle: InkApplicationGesture = 61472

public val IAG_Curlicue: InkApplicationGesture = 61456

public val IAG_DoubleCircle: InkApplicationGesture = 61473

public val IAG_DoubleCurlicue: InkApplicationGesture = 61457

public val IAG_DoubleTap: InkApplicationGesture = 61681

public val IAG_Down: InkApplicationGesture = 61529

public val IAG_DownLeft: InkApplicationGesture = 61546

public val IAG_DownLeftLong: InkApplicationGesture = 61542

public val IAG_DownRight: InkApplicationGesture = 61547

public val IAG_DownRightLong: InkApplicationGesture = 61543

public val IAG_DownUp: InkApplicationGesture = 61537

public val IAG_Exclamation: InkApplicationGesture = 61604

public val IAG_Left: InkApplicationGesture = 61530

public val IAG_LeftDown: InkApplicationGesture = 61549

public val IAG_LeftRight: InkApplicationGesture = 61538

public val IAG_LeftUp: InkApplicationGesture = 61548

public val IAG_NoGesture: InkApplicationGesture = 61440

public val IAG_Right: InkApplicationGesture = 61531

public val IAG_RightDown: InkApplicationGesture = 61551

public val IAG_RightLeft: InkApplicationGesture = 61539

public val IAG_RightUp: InkApplicationGesture = 61550

public val IAG_Scratchout: InkApplicationGesture = 61441

public val IAG_SemiCircleLeft: InkApplicationGesture = 61480

public val IAG_SemiCircleRight: InkApplicationGesture = 61481

public val IAG_Square: InkApplicationGesture = 61443

public val IAG_Star: InkApplicationGesture = 61444

public val IAG_Tap: InkApplicationGesture = 61680

public val IAG_Triangle: InkApplicationGesture = 61442

public val IAG_Up: InkApplicationGesture = 61528

public val IAG_UpDown: InkApplicationGesture = 61536

public val IAG_UpLeft: InkApplicationGesture = 61544

public val IAG_UpLeftLong: InkApplicationGesture = 61540

public val IAG_UpRight: InkApplicationGesture = 61545

public val IAG_UpRightLong: InkApplicationGesture = 61541

public val IBBM_CurveFit: InkBoundingBoxMode = 2

public val IBBM_Default: InkBoundingBoxMode = 0

public val IBBM_NoCurveFit: InkBoundingBoxMode = 1

public val IBBM_PointsOnly: InkBoundingBoxMode = 3

public val IBBM_Union: InkBoundingBoxMode = 4

public val ICBS_Down: InkCursorButtonState = 2

public val ICBS_Unavailable: InkCursorButtonState = 0

public val ICBS_Up: InkCursorButtonState = 1

public val ICB_Copy: InkClipboardModes = 0

public val ICB_Cut: InkClipboardModes = 1

public val ICB_Default: InkClipboardModes = 0

public val ICB_DelayedCopy: InkClipboardModes = 32

public val ICB_ExtractOnly: InkClipboardModes = 48

public val ICEI_AllEvents: InkCollectorEventInterest = 16

public val ICEI_CursorButtonDown: InkCollectorEventInterest = 4

public val ICEI_CursorButtonUp: InkCollectorEventInterest = 5

public val ICEI_CursorDown: InkCollectorEventInterest = 0

public val ICEI_CursorInRange: InkCollectorEventInterest = 6

public val ICEI_CursorOutOfRange: InkCollectorEventInterest = 7

public val ICEI_DblClick: InkCollectorEventInterest = 15

public val ICEI_DefaultEvents: InkCollectorEventInterest = -1

public val ICEI_MouseDown: InkCollectorEventInterest = 11

public val ICEI_MouseMove: InkCollectorEventInterest = 12

public val ICEI_MouseUp: InkCollectorEventInterest = 13

public val ICEI_MouseWheel: InkCollectorEventInterest = 14

public val ICEI_NewInAirPackets: InkCollectorEventInterest = 3

public val ICEI_NewPackets: InkCollectorEventInterest = 2

public val ICEI_Stroke: InkCollectorEventInterest = 1

public val ICEI_SystemGesture: InkCollectorEventInterest = 8

public val ICEI_TabletAdded: InkCollectorEventInterest = 9

public val ICEI_TabletRemoved: InkCollectorEventInterest = 10

public val ICF_Bitmap: InkClipboardFormats = 64

public val ICF_CopyMask: InkClipboardFormats = 127

public val ICF_Default: InkClipboardFormats = 127

public val ICF_EnhancedMetafile: InkClipboardFormats = 8

public val ICF_InkSerializedFormat: InkClipboardFormats = 1

public val ICF_Metafile: InkClipboardFormats = 32

public val ICF_None: InkClipboardFormats = 0

public val ICF_PasteMask: InkClipboardFormats = 7

public val ICF_SketchInk: InkClipboardFormats = 2

public val ICF_TextInk: InkClipboardFormats = 6

public val ICM_GestureOnly: InkCollectionMode = 1

public val ICM_InkAndGesture: InkCollectionMode = 2

public val ICM_InkOnly: InkCollectionMode = 0

public val IDM_Ink: InkDisplayMode = 0

public val IDM_Text: InkDisplayMode = 1

public val IDT_Drawing: InkDivisionType = 3

public val IDT_Line: InkDivisionType = 1

public val IDT_Paragraph: InkDivisionType = 2

public val IDT_Segment: InkDivisionType = 0

public val IECN_GESTURE: UInt = 2050u

public val IECN_RECOGNITIONRESULT: UInt = 2051u

public val IECN_STROKE: UInt = 2049u

public val IECN__BASE: UInt = 2048u

public val IEC__BASE: UInt = 1536u

public val IEF_CopyFromOriginal: InkExtractFlags = 0

public val IEF_Default: InkExtractFlags = 1

public val IEF_RemoveFromOriginal: InkExtractFlags = 1

public val IEM_Disabled: InkMode = 0

public val IEM_Ink: InkMode = 1

public val IEM_InkAndGesture: InkMode = 2

public val IEM_InsertInk: InkInsertMode = 1

public val IEM_InsertText: InkInsertMode = 0

public val IES_Collecting: InkEditStatus = 1

public val IES_Idle: InkEditStatus = 0

public val IES_Recognizing: InkEditStatus = 2

public val IKM_Alt: InkShiftKeyModifierFlags = 4

public val IKM_Control: InkShiftKeyModifierFlags = 2

public val IKM_Shift: InkShiftKeyModifierFlags = 1

public val IMF_BOLD: INK_METRIC_FLAGS = 4

public val IMF_FONT_SELECTED_IN_HDC: INK_METRIC_FLAGS = 1

public val IMF_ITALIC: INK_METRIC_FLAGS = 2

public val IMF_Left: InkMouseButton = 1

public val IMF_Middle: InkMouseButton = 4

public val IMF_Right: InkMouseButton = 2

public val IMP_Arrow: InkMousePointer = 1

public val IMP_ArrowHourglass: InkMousePointer = 11

public val IMP_ArrowQuestion: InkMousePointer = 12

public val IMP_Crosshair: InkMousePointer = 2

public val IMP_Custom: InkMousePointer = 99

public val IMP_Default: InkMousePointer = 0

public val IMP_Hand: InkMousePointer = 14

public val IMP_Hourglass: InkMousePointer = 9

public val IMP_Ibeam: InkMousePointer = 3

public val IMP_NoDrop: InkMousePointer = 10

public val IMP_SizeAll: InkMousePointer = 13

public val IMP_SizeNESW: InkMousePointer = 4

public val IMP_SizeNS: InkMousePointer = 5

public val IMP_SizeNWSE: InkMousePointer = 6

public val IMP_SizeWE: InkMousePointer = 7

public val IMP_UpArrow: InkMousePointer = 8

public val INKEDIT_CLASS: PCWSTR = w("INKEDIT")

public val INKEDIT_CLASSW: PCWSTR = w("INKEDIT")

public val INKRECOGNITIONPROPERTY_BOXNUMBER: PCWSTR = w("{2C243E3A-F733-4EB6-B1F8-B5DC5C2C4CDA}")

public val INKRECOGNITIONPROPERTY_CONFIDENCELEVEL: PCWSTR = w("{7DFE11A7-FB5D-4958-8765-154ADF0D833F}")

public val INKRECOGNITIONPROPERTY_HOTPOINT: PCWSTR = w("{CA6F40DC-5292-452a-91FB-2181C0BEC0DE}")

public val INKRECOGNITIONPROPERTY_LINEMETRICS: PCWSTR = w("{8CC24B27-30A9-4b96-9056-2D3A90DA0727}")

public val INKRECOGNITIONPROPERTY_LINENUMBER: PCWSTR = w("{DBF29F2C-5289-4BE8-B3D8-6EF63246253E}")

public val INKRECOGNITIONPROPERTY_MAXIMUMSTROKECOUNT: PCWSTR = w("{BF0EEC4E-4B7D-47a9-8CFA-234DD24BD22A}")

public val INKRECOGNITIONPROPERTY_POINTSPERINCH: PCWSTR = w("{7ED16B76-889C-468e-8276-0021B770187E}")

public val INKRECOGNITIONPROPERTY_SEGMENTATION: PCWSTR = w("{B3C0FE6C-FB51-4164-BA2F-844AF8F983DA}")

public val INK_SERIALIZED_FORMAT: PCWSTR = w("Ink Serialized Format")

public val IOAM_Behind: InkOverlayAttachMode = 0

public val IOAM_InFront: InkOverlayAttachMode = 1

public val IOEM_Delete: InkOverlayEditingMode = 1

public val IOEM_Ink: InkOverlayEditingMode = 0

public val IOEM_Select: InkOverlayEditingMode = 2

public val IOERM_PointErase: InkOverlayEraserMode = 1

public val IOERM_StrokeErase: InkOverlayEraserMode = 0

public val IPCM_Default: InkPersistenceCompressionMode = 0

public val IPCM_MaximumCompression: InkPersistenceCompressionMode = 1

public val IPCM_NoCompression: InkPersistenceCompressionMode = 2

public val IPF_Base64GIF: InkPersistenceFormat = 3

public val IPF_Base64InkSerializedFormat: InkPersistenceFormat = 1

public val IPF_GIF: InkPersistenceFormat = 2

public val IPF_InkSerializedFormat: InkPersistenceFormat = 0

public val IPSM_AutoSize: InkPictureSizeMode = 0

public val IPSM_CenterImage: InkPictureSizeMode = 1

public val IPSM_Normal: InkPictureSizeMode = 2

public val IPSM_StretchImage: InkPictureSizeMode = 3

public val IPT_Ball: InkPenTip = 0

public val IPT_Rectangle: InkPenTip = 1

public val IP_CURSOR_DOWN: UInt = 1u

public val IP_INVERTED: UInt = 2u

public val IP_MARGIN: UInt = 4u

public val IRAS_All: InkRecognitionAlternatesSelection = -1

public val IRAS_DefaultCount: InkRecognitionAlternatesSelection = 10

public val IRAS_Start: InkRecognitionAlternatesSelection = 0

public val IRCACM_Full: InkRecognizerCharacterAutoCompletionMode = 0

public val IRCACM_Prefix: InkRecognizerCharacterAutoCompletionMode = 1

public val IRCACM_Random: InkRecognizerCharacterAutoCompletionMode = 2

public val IRC_AdviseInkChange: InkRecognizerCapabilities = 4096

public val IRC_Alpha: InkRecognizerCapabilities = 1048576

public val IRC_ArbitraryAngle: InkRecognizerCapabilities = 1024

public val IRC_Beta: InkRecognizerCapabilities = 2097152

public val IRC_BoxedInput: InkRecognizerCapabilities = 16

public val IRC_CharacterAutoCompletionInput: InkRecognizerCapabilities = 32

public val IRC_Cursive: InkRecognizerCapabilities = 262144

public val IRC_DontCare: InkRecognizerCapabilities = 1

public val IRC_DownAndLeft: InkRecognizerCapabilities = 256

public val IRC_DownAndRight: InkRecognizerCapabilities = 512

public val IRC_FreeInput: InkRecognizerCapabilities = 4

public val IRC_Intermediate: InkRecognitionConfidence = 1

public val IRC_Lattice: InkRecognizerCapabilities = 2048

public val IRC_LeftAndDown: InkRecognizerCapabilities = 128

public val IRC_LinedInput: InkRecognizerCapabilities = 8

public val IRC_Object: InkRecognizerCapabilities = 2

public val IRC_Personalizable: InkRecognizerCapabilities = 16384

public val IRC_Poor: InkRecognitionConfidence = 2

public val IRC_PrefersArbitraryAngle: InkRecognizerCapabilities = 32768

public val IRC_PrefersParagraphBreaking: InkRecognizerCapabilities = 65536

public val IRC_PrefersSegmentation: InkRecognizerCapabilities = 131072

public val IRC_RightAndDown: InkRecognizerCapabilities = 64

public val IRC_StrokeReorder: InkRecognizerCapabilities = 8192

public val IRC_Strong: InkRecognitionConfidence = 0

public val IRC_TextPrediction: InkRecognizerCapabilities = 524288

public val IRM_AutoSpace: InkRecognitionModes = 64

public val IRM_Coerce: InkRecognitionModes = 2

public val IRM_DisablePersonalization: InkRecognitionModes = 32

public val IRM_LineMode: InkRecognitionModes = 16

public val IRM_Max: InkRecognitionModes = 128

public val IRM_None: InkRecognitionModes = 0

public val IRM_PrefixOk: InkRecognitionModes = 8

public val IRM_TopInkBreaksOnly: InkRecognitionModes = 4

public val IRM_WordModeOnly: InkRecognitionModes = 1

public val IRO_Black: InkRasterOperation = 1

public val IRO_CopyPen: InkRasterOperation = 13

public val IRO_MaskNotPen: InkRasterOperation = 3

public val IRO_MaskPen: InkRasterOperation = 9

public val IRO_MaskPenNot: InkRasterOperation = 5

public val IRO_MergeNotPen: InkRasterOperation = 12

public val IRO_MergePen: InkRasterOperation = 15

public val IRO_MergePenNot: InkRasterOperation = 14

public val IRO_NoOperation: InkRasterOperation = 11

public val IRO_Not: InkRasterOperation = 6

public val IRO_NotCopyPen: InkRasterOperation = 4

public val IRO_NotMaskPen: InkRasterOperation = 8

public val IRO_NotMergePen: InkRasterOperation = 2

public val IRO_NotXOrPen: InkRasterOperation = 10

public val IRO_White: InkRasterOperation = 16

public val IRO_XOrPen: InkRasterOperation = 7

public val IRS_InkAddedFailed: InkRecognitionStatus = 4

public val IRS_Interrupted: InkRecognitionStatus = 1

public val IRS_NoError: InkRecognitionStatus = 0

public val IRS_ProcessFailed: InkRecognitionStatus = 2

public val IRS_SetAutoCompletionModeFailed: InkRecognitionStatus = 8

public val IRS_SetFactoidFailed: InkRecognitionStatus = 128

public val IRS_SetFlagsFailed: InkRecognitionStatus = 64

public val IRS_SetGuideFailed: InkRecognitionStatus = 32

public val IRS_SetPrefixSuffixFailed: InkRecognitionStatus = 256

public val IRS_SetStrokesFailed: InkRecognitionStatus = 16

public val IRS_SetWordListFailed: InkRecognitionStatus = 512

public val ISC_AllElements: InkSelectionConstants = -1

public val ISC_FirstElement: InkSelectionConstants = 0

public val ISG_DoubleTap: InkSystemGesture = 17

public val ISG_Drag: InkSystemGesture = 19

public val ISG_Flick: InkSystemGesture = 31

public val ISG_HoldEnter: InkSystemGesture = 21

public val ISG_HoldLeave: InkSystemGesture = 22

public val ISG_HoverEnter: InkSystemGesture = 23

public val ISG_HoverLeave: InkSystemGesture = 24

public val ISG_RightDrag: InkSystemGesture = 20

public val ISG_RightTap: InkSystemGesture = 18

public val ISG_Tap: InkSystemGesture = 16

public val InPlace: VisualState = 0

public val InPlaceDirection_Auto: InPlaceDirection = 0

public val InPlaceDirection_Bottom: InPlaceDirection = 1

public val InPlaceDirection_Top: InPlaceDirection = 2

public val InPlaceState_Auto: InPlaceState = 0

public val InPlaceState_Expanded: InPlaceState = 2

public val InPlaceState_HoverTarget: InPlaceState = 1

public val Ink: GUID = GUID.from_u128(U128(0x13de4a428d214c8euL, 0xbf9c8f69cb068fcauL))

public val InkCollector: GUID = GUID.from_u128(U128(0x43fb1553ad744ee8uL, 0x88e43e6daac915dbuL))

public val InkCollectorClipInkToMargin: Int = 0

public val InkCollectorDefaultMargin: Int = -2147483648

public val InkDisp: GUID = GUID.from_u128(U128(0x937c1a34151d4610uL, 0x9ca6a8cc9bdb5d83uL))

public val InkDivider: GUID = GUID.from_u128(U128(0x8854f6a046834ae7uL, 0x9191752fe64612c3uL))

public val InkDrawingAttributes: GUID = GUID.from_u128(U128(0xd8bf32a205a544c3uL, 0xb3aa5e80ac7d2576uL))

public val InkEdit: GUID = GUID.from_u128(U128(0xe5ca59f557c44dd8uL, 0x9bd61deeedd27af4uL))

public val InkMaxTransparencyValue: Int = 255

public val InkMinTransparencyValue: Int = 0

public val InkOverlay: GUID = GUID.from_u128(U128(0x65d00646cde34a88uL, 0x91636769f0f1a97duL))

public val InkPicture: GUID = GUID.from_u128(U128(0x4a1e553fe364fdeuL, 0x865e344194e69424uL))

public val InkRecognizerContext: GUID = GUID.from_u128(U128(0xaac46a3792294fc0uL, 0x8cce4497569bf4d1uL))

public val InkRecognizerGuide: GUID = GUID.from_u128(U128(0x8770d941a63a4671uL, 0xa3752855a18eba73uL))

public val InkRecognizers: GUID = GUID.from_u128(U128(0x9fd4e808f6e64e65uL, 0x98d3aa39054c1255uL))

public val InkRectangle: GUID = GUID.from_u128(U128(0x43b07326aae04b62uL, 0xa83d5fd768b7353cuL))

public val InkRenderer: GUID = GUID.from_u128(U128(0x9c1cc6e4d7eb4eebuL, 0x909115a7c8791ed9uL))

public val InkStrokes: GUID = GUID.from_u128(U128(0x48f491bc240e4860uL, 0xb079a1e94d3d2c86uL))

public val InkTablets: GUID = GUID.from_u128(U128(0x6e4fcb12510a4d40uL, 0x93041da10ae9147cuL))

public val InkTransform: GUID = GUID.from_u128(U128(0xe3d5d93c16634a78uL, 0xa1a722375dfebaeeuL))

public val InkWordList: GUID = GUID.from_u128(U128(0x9de85094f71f44f1uL, 0x847115a2fa76fcf3uL))

public val InteractionMode_DockedBottom: InteractionMode = 3

public val InteractionMode_DockedTop: InteractionMode = 2

public val InteractionMode_Floating: InteractionMode = 1

public val InteractionMode_InPlace: InteractionMode = 0

public val KEYMODIFIER_ALTGR: KEYMODIFIER = 16

public val KEYMODIFIER_CONTROL: KEYMODIFIER = 1

public val KEYMODIFIER_EXT: KEYMODIFIER = 32

public val KEYMODIFIER_MENU: KEYMODIFIER = 2

public val KEYMODIFIER_SHIFT: KEYMODIFIER = 4

public val KEYMODIFIER_WIN: KEYMODIFIER = 8

public val LEFT_BUTTON: MouseButton = 1

public val LM_ASCENDER: LINE_METRICS = 2

public val LM_BASELINE: LINE_METRICS = 0

public val LM_DESCENDER: LINE_METRICS = 3

public val LM_MIDLINE: LINE_METRICS = 1

public val MAX_FRIENDLYNAME: UInt = 64u

public val MAX_LANGUAGES: UInt = 64u

public val MAX_PACKET_BUTTON_COUNT: UInt = 32u

public val MAX_PACKET_PROPERTY_COUNT: UInt = 32u

public val MAX_VENDORNAME: UInt = 32u

public val MICROSOFT_PENINPUT_PANEL_PROPERTY_T: PCWSTR = w("Microsoft PenInputPanel 1.5")

public val MICROSOFT_TIP_COMBOBOXLIST_PROPERTY: PCWSTR = w("Microsoft TIP ComboBox List Window Identifier")

public val MICROSOFT_TIP_NO_INSERT_BUTTON_PROPERTY: PCWSTR = w("Microsoft TIP No Insert Option")

public val MICROSOFT_TIP_OPENING_MSG: PCWSTR = w("TabletInputPanelOpening")

public val MICROSOFT_URL_EXPERIENCE_PROPERTY: PCWSTR = w("Microsoft TIP URL Experience")

public val MICUIELEMENTSTATE_DISABLED: MICUIELEMENTSTATE = 4

public val MICUIELEMENTSTATE_HOT: MICUIELEMENTSTATE = 2

public val MICUIELEMENTSTATE_NORMAL: MICUIELEMENTSTATE = 1

public val MICUIELEMENTSTATE_PRESSED: MICUIELEMENTSTATE = 3

public val MICUIELEMENT_BUTTON_CANCEL: MICUIELEMENT = 128

public val MICUIELEMENT_BUTTON_CLEAR: MICUIELEMENT = 8

public val MICUIELEMENT_BUTTON_CORRECT: MICUIELEMENT = 4

public val MICUIELEMENT_BUTTON_ERASE: MICUIELEMENT = 2

public val MICUIELEMENT_BUTTON_INSERT: MICUIELEMENT = 64

public val MICUIELEMENT_BUTTON_REDO: MICUIELEMENT = 32

public val MICUIELEMENT_BUTTON_UNDO: MICUIELEMENT = 16

public val MICUIELEMENT_BUTTON_WRITE: MICUIELEMENT = 1

public val MICUIELEMENT_INKPANEL_BACKGROUND: MICUIELEMENT = 256

public val MICUIELEMENT_RESULTPANEL_BACKGROUND: MICUIELEMENT = 512

public val MIDDLE_BUTTON: MouseButton = 4

public val MathInputControl: GUID = GUID.from_u128(U128(0xc561816c14d84090uL, 0x830c98d994b21c7buL))

public val NO_BUTTON: MouseButton = 0

public val NUM_FLICK_DIRECTIONS: UInt = 8u

public val PROPERTY_UNITS_AMPERE: PROPERTY_UNITS = 15

public val PROPERTY_UNITS_CANDELA: PROPERTY_UNITS = 16

public val PROPERTY_UNITS_CENTIMETERS: PROPERTY_UNITS = 2

public val PROPERTY_UNITS_DEFAULT: PROPERTY_UNITS = 0

public val PROPERTY_UNITS_DEGREES: PROPERTY_UNITS = 3

public val PROPERTY_UNITS_ENGLINEAR: PROPERTY_UNITS = 10

public val PROPERTY_UNITS_ENGROTATION: PROPERTY_UNITS = 11

public val PROPERTY_UNITS_FAHRENHEIT: PROPERTY_UNITS = 14

public val PROPERTY_UNITS_GRAMS: PROPERTY_UNITS = 7

public val PROPERTY_UNITS_INCHES: PROPERTY_UNITS = 1

public val PROPERTY_UNITS_KELVIN: PROPERTY_UNITS = 13

public val PROPERTY_UNITS_POUNDS: PROPERTY_UNITS = 6

public val PROPERTY_UNITS_RADIANS: PROPERTY_UNITS = 4

public val PROPERTY_UNITS_SECONDS: PROPERTY_UNITS = 5

public val PROPERTY_UNITS_SILINEAR: PROPERTY_UNITS = 8

public val PROPERTY_UNITS_SIROTATION: PROPERTY_UNITS = 9

public val PROPERTY_UNITS_SLUGS: PROPERTY_UNITS = 12

public val PT_Default: PanelType = 0

public val PT_Handwriting: PanelType = 2

public val PT_Inactive: PanelType = 1

public val PT_Keyboard: PanelType = 3

public val PanelInputArea_Auto: PanelInputArea = 0

public val PanelInputArea_CharacterPad: PanelInputArea = 3

public val PanelInputArea_Keyboard: PanelInputArea = 1

public val PanelInputArea_WritingPad: PanelInputArea = 2

public val PenInputPanel: GUID = GUID.from_u128(U128(0xf744e4961b5a489euL, 0x81dcfbd7ac6298a8uL))

public val PenInputPanel_Internal: GUID = GUID.from_u128(U128(0x802b1fb9056b4720uL, 0xb0cc80d23b71171euL))

public val RECOCONF_HIGHCONFIDENCE: UInt = 1u

public val RECOCONF_LOWCONFIDENCE: Int = -1

public val RECOCONF_MEDIUMCONFIDENCE: UInt = 0u

public val RECOCONF_NOTSET: UInt = 128u

public val RECOFLAG_AUTOSPACE: UInt = 64u

public val RECOFLAG_COERCE: UInt = 2u

public val RECOFLAG_DISABLEPERSONALIZATION: UInt = 32u

public val RECOFLAG_LINEMODE: UInt = 16u

public val RECOFLAG_PREFIXOK: UInt = 8u

public val RECOFLAG_SINGLESEG: UInt = 4u

public val RECOFLAG_WORDMODE: UInt = 1u

public val RECO_TYPE_WCHAR: RECO_TYPE = 1

public val RECO_TYPE_WSTRING: RECO_TYPE = 0

public val RF_ADVISEINKCHANGE: Int = 4096

public val RF_ARBITRARY_ANGLE: Int = 1024

public val RF_BOXED_INPUT: Int = 16

public val RF_CAC_INPUT: Int = 32

public val RF_DONTCARE: Int = 1

public val RF_DOWN_AND_LEFT: Int = 256

public val RF_DOWN_AND_RIGHT: Int = 512

public val RF_FREE_INPUT: Int = 4

public val RF_LATTICE: Int = 2048

public val RF_LEFT_AND_DOWN: Int = 128

public val RF_LINED_INPUT: Int = 8

public val RF_OBJECT: Int = 2

public val RF_PERFORMSLINEBREAKING: Int = 65536

public val RF_PERSONALIZABLE: Int = 16384

public val RF_REQUIRESSEGMENTATIONBREAKING: Int = 131072

public val RF_RIGHT_AND_DOWN: Int = 64

public val RF_STROKEREORDER: Int = 8192

public val RIGHT_BUTTON: MouseButton = 2

public val RTSDI_AllData: RealTimeStylusDataInterest = -1

public val RTSDI_CustomStylusDataAdded: RealTimeStylusDataInterest = 32768

public val RTSDI_DefaultEvents: RealTimeStylusDataInterest = 37766

public val RTSDI_Error: RealTimeStylusDataInterest = 1

public val RTSDI_InAirPackets: RealTimeStylusDataInterest = 32

public val RTSDI_None: RealTimeStylusDataInterest = 0

public val RTSDI_Packets: RealTimeStylusDataInterest = 256

public val RTSDI_RealTimeStylusDisabled: RealTimeStylusDataInterest = 4

public val RTSDI_RealTimeStylusEnabled: RealTimeStylusDataInterest = 2

public val RTSDI_StylusButtonDown: RealTimeStylusDataInterest = 2048

public val RTSDI_StylusButtonUp: RealTimeStylusDataInterest = 1024

public val RTSDI_StylusDown: RealTimeStylusDataInterest = 128

public val RTSDI_StylusInRange: RealTimeStylusDataInterest = 16

public val RTSDI_StylusNew: RealTimeStylusDataInterest = 8

public val RTSDI_StylusOutOfRange: RealTimeStylusDataInterest = 64

public val RTSDI_StylusUp: RealTimeStylusDataInterest = 512

public val RTSDI_SystemEvents: RealTimeStylusDataInterest = 4096

public val RTSDI_TabletAdded: RealTimeStylusDataInterest = 8192

public val RTSDI_TabletRemoved: RealTimeStylusDataInterest = 16384

public val RTSDI_UpdateMapping: RealTimeStylusDataInterest = 65536

public val RTSLT_AsyncEventLock: RealTimeStylusLockType = 4

public val RTSLT_AsyncObjLock: RealTimeStylusLockType = 13

public val RTSLT_ExcludeCallback: RealTimeStylusLockType = 8

public val RTSLT_ObjLock: RealTimeStylusLockType = 1

public val RTSLT_SyncEventLock: RealTimeStylusLockType = 2

public val RTSLT_SyncObjLock: RealTimeStylusLockType = 11

public val RealTimeStylus: GUID = GUID.from_u128(U128(0xe26b366df99843ceuL, 0x836fcb6d904432b0uL))

public val SAFE_PARTIAL: UInt = 1u

public val SCROLLDIRECTION_DOWN: SCROLLDIRECTION = 1

public val SCROLLDIRECTION_UP: SCROLLDIRECTION = 0

public val SHR_E: SelectionHitResult = 5

public val SHR_N: SelectionHitResult = 7

public val SHR_NE: SelectionHitResult = 3

public val SHR_NW: SelectionHitResult = 1

public val SHR_None: SelectionHitResult = 0

public val SHR_S: SelectionHitResult = 8

public val SHR_SE: SelectionHitResult = 2

public val SHR_SW: SelectionHitResult = 4

public val SHR_Selection: SelectionHitResult = 9

public val SHR_W: SelectionHitResult = 6

public val STR_GUID_ALTITUDEORIENTATION: PCWSTR = w("{82DEC5C7-F6BA-4906-894F-66D68DFC456C}")

public val STR_GUID_AZIMUTHORIENTATION: PCWSTR = w("{029123B4-8828-410B-B250-A0536595E5DC}")

public val STR_GUID_BUTTONPRESSURE: PCWSTR = w("{8B7FEFC4-96AA-4BFE-AC26-8A5F0BE07BF5}")

public val STR_GUID_DEVICE_CONTACT_ID: PCWSTR = w("{02585B91-049B-4750-9615-DF8948AB3C9C}")

public val STR_GUID_FINGERCONTACTCONFIDENCE: PCWSTR = w("{E706C804-57F0-4F00-8A0C-853D57789BE9}")

public val STR_GUID_HEIGHT: PCWSTR = w("{E61858D2-E447-4218-9D3F-18865C203DF4}")

public val STR_GUID_NORMALPRESSURE: PCWSTR = w("{7307502D-F9F4-4E18-B3F2-2CE1B1A3610C}")

public val STR_GUID_PAKETSTATUS: PCWSTR = w("{6E0E07BF-AFE7-4CF7-87D1-AF6446208418}")

public val STR_GUID_PITCHROTATION: PCWSTR = w("{7F7E57B7-BE37-4BE1-A356-7A84160E1893}")

public val STR_GUID_ROLLROTATION: PCWSTR = w("{5D5D5E56-6BA9-4C5B-9FB0-851C91714E56}")

public val STR_GUID_SERIALNUMBER: PCWSTR = w("{78A81B56-0935-4493-BAAE-00541A8A16C4}")

public val STR_GUID_TANGENTPRESSURE: PCWSTR = w("{6DA4488B-5244-41EC-905B-32D89AB80809}")

public val STR_GUID_TIMERTICK: PCWSTR = w("{436510C5-FED3-45D1-8B76-71D3EA7A829D}")

public val STR_GUID_TWISTORIENTATION: PCWSTR = w("{0D324960-13B2-41E4-ACE6-7AE9D43D2D3B}")

public val STR_GUID_WIDTH: PCWSTR = w("{BAABE94D-2712-48F5-BE9D-8F8B5EA0711A}")

public val STR_GUID_X: PCWSTR = w("{598A6A8F-52C0-4BA0-93AF-AF357411A561}")

public val STR_GUID_XTILTORIENTATION: PCWSTR = w("{A8D07B3A-8BF0-40B0-95A9-B80A6BB787BF}")

public val STR_GUID_Y: PCWSTR = w("{B53F9F75-04E0-4498-A7EE-C30DBB5A9011}")

public val STR_GUID_YAWROTATION: PCWSTR = w("{6A849980-7C3A-45B7-AA82-90A262950E89}")

public val STR_GUID_YTILTORIENTATION: PCWSTR = w("{0E932389-1D77-43AF-AC00-5B950D6D4B2D}")

public val STR_GUID_Z: PCWSTR = w("{735ADB30-0EBB-4788-A0E4-0F316490055D}")

public val SketchInk: GUID = GUID.from_u128(U128(0xf0291081e87c4e07uL, 0x97daa0a03761e586uL))

public val StrokeBuilder: GUID = GUID.from_u128(U128(0xe810cee76e514cb0uL, 0xaa3a0b985b70daf7uL))

public val SyncStylusQueue: StylusQueue = 1

public val TABLET_DISABLE_FLICKFALLBACKKEYS: UInt = 1048576u

public val TABLET_DISABLE_FLICKS: UInt = 65536u

public val TABLET_DISABLE_PENBARRELFEEDBACK: UInt = 16u

public val TABLET_DISABLE_PENTAPFEEDBACK: UInt = 8u

public val TABLET_DISABLE_PRESSANDHOLD: UInt = 1u

public val TABLET_DISABLE_SMOOTHSCROLLING: UInt = 524288u

public val TABLET_DISABLE_TOUCHSWITCH: UInt = 32768u

public val TABLET_DISABLE_TOUCHUIFORCEOFF: UInt = 512u

public val TABLET_DISABLE_TOUCHUIFORCEON: UInt = 256u

public val TABLET_ENABLE_FLICKLEARNINGMODE: UInt = 262144u

public val TABLET_ENABLE_FLICKSONCONTEXT: UInt = 131072u

public val TABLET_ENABLE_MULTITOUCHDATA: UInt = 16777216u

public val TCF_ALLOW_RECOGNITION: GET_DANDIDATE_FLAGS = 1

public val TCF_FORCE_RECOGNITION: GET_DANDIDATE_FLAGS = 2

public val TDK_Mouse: TabletDeviceKind = 0

public val TDK_Pen: TabletDeviceKind = 1

public val TDK_Touch: TabletDeviceKind = 2

public val THWC_CursorMustTouch: TabletHardwareCapabilities = 2

public val THWC_CursorsHavePhysicalIds: TabletHardwareCapabilities = 8

public val THWC_HardProximity: TabletHardwareCapabilities = 4

public val THWC_Integrated: TabletHardwareCapabilities = 1

public val TPMU_Centimeters: TabletPropertyMetricUnit = 2

public val TPMU_Default: TabletPropertyMetricUnit = 0

public val TPMU_Degrees: TabletPropertyMetricUnit = 3

public val TPMU_Grams: TabletPropertyMetricUnit = 7

public val TPMU_Inches: TabletPropertyMetricUnit = 1

public val TPMU_Pounds: TabletPropertyMetricUnit = 6

public val TPMU_Radians: TabletPropertyMetricUnit = 4

public val TPMU_Seconds: TabletPropertyMetricUnit = 5

public val TextInputPanel: GUID = GUID.from_u128(U128(0xf9b189d7228b4f2buL, 0x8650b97f59e02c8cuL))

public val TipAutoCompleteClient: GUID = GUID.from_u128(U128(0x807c1e6c1d00453fuL, 0xb920b61bb7cdd997uL))

public val WM_TABLET_ADDED: UInt = 712u

public val WM_TABLET_DEFBASE: UInt = 704u

public val WM_TABLET_DELETED: UInt = 713u

public val WM_TABLET_FLICK: UInt = 715u

public val WM_TABLET_MAXOFFSET: UInt = 32u

public val WM_TABLET_QUERYSYSTEMGESTURESTATUS: UInt = 716u

public val rtfBoth: ScrollBarsConstants = 3

public val rtfCenter: SelAlignmentConstants = 2

public val rtfFixedSingle: BorderStyleConstants = 1

public val rtfFlat: AppearanceConstants = 0

public val rtfHorizontal: ScrollBarsConstants = 1

public val rtfLeft: SelAlignmentConstants = 0

public val rtfNoBorder: BorderStyleConstants = 0

public val rtfNone: ScrollBarsConstants = 0

public val rtfRight: SelAlignmentConstants = 1

public val rtfThreeD: AppearanceConstants = 1

public val rtfVertical: ScrollBarsConstants = 2
