package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.core.HRESULT

public typealias ALT_BREAKS = Int

public typealias AppearanceConstants = Int

public typealias BorderStyleConstants = Int

public typealias CONFIDENCE_LEVEL = Int

public typealias CorrectionMode = Int

public typealias CorrectionPosition = Int

public typealias DISPID_Ink = Int

public typealias DISPID_InkCollector = Int

public typealias DISPID_InkCollectorEvent = Int

public typealias DISPID_InkCursor = Int

public typealias DISPID_InkCursorButton = Int

public typealias DISPID_InkCursorButtons = Int

public typealias DISPID_InkCursors = Int

public typealias DISPID_InkCustomStrokes = Int

public typealias DISPID_InkDivider = Int

public typealias DISPID_InkDivisionResult = Int

public typealias DISPID_InkDivisionUnit = Int

public typealias DISPID_InkDivisionUnits = Int

public typealias DISPID_InkDrawingAttributes = Int

public typealias DISPID_InkEdit = Int

public typealias DISPID_InkEditEvents = Int

public typealias DISPID_InkEvent = Int

public typealias DISPID_InkExtendedProperties = Int

public typealias DISPID_InkExtendedProperty = Int

public typealias DISPID_InkGesture = Int

public typealias DISPID_InkRecoAlternate = Int

public typealias DISPID_InkRecoContext = Int

public typealias DISPID_InkRecoContext2 = Int

public typealias DISPID_InkRecognitionAlternates = Int

public typealias DISPID_InkRecognitionEvent = Int

public typealias DISPID_InkRecognitionResult = Int

public typealias DISPID_InkRecognizer = Int

public typealias DISPID_InkRecognizer2 = Int

public typealias DISPID_InkRecognizerGuide = Int

public typealias DISPID_InkRecognizers = Int

public typealias DISPID_InkRectangle = Int

public typealias DISPID_InkRenderer = Int

public typealias DISPID_InkStrokeDisp = Int

public typealias DISPID_InkStrokes = Int

public typealias DISPID_InkTablet = Int

public typealias DISPID_InkTablet2 = Int

public typealias DISPID_InkTablet3 = Int

public typealias DISPID_InkTablets = Int

public typealias DISPID_InkTransform = Int

public typealias DISPID_InkWordList = Int

public typealias DISPID_InkWordList2 = Int

public typealias DISPID_MathInputControlEvents = Int

public typealias DISPID_PenInputPanel = Int

public typealias DISPID_PenInputPanelEvents = Int

public typealias DISPID_StrokeEvent = Int

public typealias EventMask = Int

public typealias FLICKACTION_COMMANDCODE = Int

public typealias FLICKDIRECTION = Int

public typealias FLICKMODE = Int

public typealias GET_DANDIDATE_FLAGS = Int

public typealias HRECOALT = Long

public typealias HRECOCONTEXT = Long

public typealias HRECOGNIZER = Long

public typealias HRECOLATTICE = Long

public typealias HRECOWORDLIST = Long

public typealias INK_METRIC_FLAGS = Int

public typealias InPlaceDirection = Int

public typealias InPlaceState = Int

public typealias InkApplicationGesture = Int

public typealias InkBoundingBoxMode = Int

public typealias InkClipboardFormats = Int

public typealias InkClipboardModes = Int

public typealias InkCollectionMode = Int

public typealias InkCollectorEventInterest = Int

public typealias InkCursorButtonState = Int

public typealias InkDisplayMode = Int

public typealias InkDivisionType = Int

public typealias InkEditStatus = Int

public typealias InkExtractFlags = Int

public typealias InkInsertMode = Int

public typealias InkMode = Int

public typealias InkMouseButton = Int

public typealias InkMousePointer = Int

public typealias InkOverlayAttachMode = Int

public typealias InkOverlayEditingMode = Int

public typealias InkOverlayEraserMode = Int

public typealias InkPenTip = Int

public typealias InkPersistenceCompressionMode = Int

public typealias InkPersistenceFormat = Int

public typealias InkPictureSizeMode = Int

public typealias InkRasterOperation = Int

public typealias InkRecognitionAlternatesSelection = Int

public typealias InkRecognitionConfidence = Int

public typealias InkRecognitionModes = Int

public typealias InkRecognitionStatus = Int

public typealias InkRecognizerCapabilities = Int

public typealias InkRecognizerCharacterAutoCompletionMode = Int

public typealias InkSelectionConstants = Int

public typealias InkShiftKeyModifierFlags = Int

public typealias InkSystemGesture = Int

public typealias InteractionMode = Int

public typealias KEYMODIFIER = Int

public typealias LINE_METRICS = Int

public typealias MICUIELEMENT = Int

public typealias MICUIELEMENTSTATE = Int

public typealias MouseButton = Int

public typealias PROPERTY_UNITS = Int

public typealias PanelInputArea = Int

public typealias PanelType = Int

public fun interface PfnRecoCallbackFn {
    public operator fun invoke(param0: UInt, param1: Long, param2: HRECOCONTEXT): HRESULT
}

public typealias PfnRecoCallback = PfnRecoCallbackFn?

public typealias RECO_TYPE = Int

public typealias RealTimeStylusDataInterest = Int

public typealias RealTimeStylusLockType = Int

public typealias SCROLLDIRECTION = Int

public typealias ScrollBarsConstants = Int

public typealias SelAlignmentConstants = Int

public typealias SelectionHitResult = Int

public typealias StylusQueue = Int

public typealias TabletDeviceKind = Int

public typealias TabletHardwareCapabilities = Int

public typealias TabletPropertyMetricUnit = Int

public typealias VisualState = Int
