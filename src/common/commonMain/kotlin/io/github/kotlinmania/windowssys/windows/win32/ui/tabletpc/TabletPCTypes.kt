package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

public typealias AltBreaks = Int

public typealias AppearanceConstants = Int

public typealias BorderStyleConstants = Int

public typealias ConfidenceLevel = Int

public typealias CorrectionMode = Int

public typealias CorrectionPosition = Int

public typealias DispidInk = Int

public typealias DispidInkCollector = Int

public typealias DispidInkCollectorEvent = Int

public typealias DispidInkCursor = Int

public typealias DispidInkCursorButton = Int

public typealias DispidInkCursorButtons = Int

public typealias DispidInkCursors = Int

public typealias DispidInkCustomStrokes = Int

public typealias DispidInkDivider = Int

public typealias DispidInkDivisionResult = Int

public typealias DispidInkDivisionUnit = Int

public typealias DispidInkDivisionUnits = Int

public typealias DispidInkDrawingAttributes = Int

public typealias DispidInkEdit = Int

public typealias DispidInkEditEvents = Int

public typealias DispidInkEvent = Int

public typealias DispidInkExtendedProperties = Int

public typealias DispidInkExtendedProperty = Int

public typealias DispidInkGesture = Int

public typealias DispidInkRecoAlternate = Int

public typealias DispidInkRecoContext = Int

public typealias DispidInkRecoContext2 = Int

public typealias DispidInkRecognitionAlternates = Int

public typealias DispidInkRecognitionEvent = Int

public typealias DispidInkRecognitionResult = Int

public typealias DispidInkRecognizer = Int

public typealias DispidInkRecognizer2 = Int

public typealias DispidInkRecognizerGuide = Int

public typealias DispidInkRecognizers = Int

public typealias DispidInkRectangle = Int

public typealias DispidInkRenderer = Int

public typealias DispidInkStrokeDisp = Int

public typealias DispidInkStrokes = Int

public typealias DispidInkTablet = Int

public typealias DispidInkTablet2 = Int

public typealias DispidInkTablet3 = Int

public typealias DispidInkTablets = Int

public typealias DispidInkTransform = Int

public typealias DispidInkWordList = Int

public typealias DispidInkWordList2 = Int

public typealias DispidMathInputControlEvents = Int

public typealias DispidPenInputPanel = Int

public typealias DispidPenInputPanelEvents = Int

public typealias DispidStrokeEvent = Int

public typealias EventMask = Int

public typealias FlickactionCommandcode = Int

public typealias Flickdirection = Int

public typealias Flickmode = Int

public typealias GetDandidateFlags = Int

public typealias Hrecoalt = MutPtr

public typealias Hrecocontext = MutPtr

public typealias Hrecognizer = MutPtr

public typealias Hrecolattice = MutPtr

public typealias Hrecowordlist = MutPtr

public typealias InkMetricFlags = Int

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

public typealias Keymodifier = Int

public typealias LineMetrics = Int

public typealias Micuielement = Int

public typealias Micuielementstate = Int

public typealias MouseButton = Int

public typealias PropertyUnits = Int

public typealias PanelInputArea = Int

public typealias PanelType = Int

public fun interface PfnRecoCallbackFn {
    public operator fun invoke(param0: UInt, param1: MutPtr, param2: Hrecocontext): Hresult
}

public typealias PfnRecoCallback = PfnRecoCallbackFn?

public typealias RecoType = Int

public typealias RealTimeStylusDataInterest = Int

public typealias RealTimeStylusLockType = Int

public typealias Scrolldirection = Int

public typealias ScrollBarsConstants = Int

public typealias SelAlignmentConstants = Int

public typealias SelectionHitResult = Int

public typealias StylusQueue = Int

public typealias TabletDeviceKind = Int

public typealias TabletHardwareCapabilities = Int

public typealias TabletPropertyMetricUnit = Int

public typealias VisualState = Int
