package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val ALT_BREAKS_FULL: AltBreaks = 2

public val ALT_BREAKS_SAME: AltBreaks = 0

public val ALT_BREAKS_UNIQUE: AltBreaks = 1

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

public val ASYNC_STYLUS_QUEUE: StylusQueue = 3

public val ASYNC_STYLUS_QUEUE_IMMEDIATE: StylusQueue = 2

public val BEST_COMPLETE: UInt = 2u

public val CAC_FULL: UInt = 0u

public val CAC_PREFIX: UInt = 1u

public val CAC_RANDOM: UInt = 2u

public val CFL_INTERMEDIATE: ConfidenceLevel = 1

public val CFL_POOR: ConfidenceLevel = 2

public val CFL_STRONG: ConfidenceLevel = 0

public val CLOSED: VisualState = 4

public val CORRECTION_MODE_NOT_VISIBLE: CorrectionMode = 0

public val CORRECTION_MODE_POST_INSERTION_COLLAPSED: CorrectionMode = 2

public val CORRECTION_MODE_POST_INSERTION_EXPANDED: CorrectionMode = 3

public val CORRECTION_MODE_PRE_INSERTION: CorrectionMode = 1

public val CORRECTION_POSITION_AUTO: CorrectionPosition = 0

public val CORRECTION_POSITION_BOTTOM: CorrectionPosition = 1

public val CORRECTION_POSITION_TOP: CorrectionPosition = 2

public val DISPID_DA_ANTI_ALIASED: DispidInkDrawingAttributes = 6

public val DISPID_DA_CLONE: DispidInkDrawingAttributes = 10

public val DISPID_DA_COLOR: DispidInkDrawingAttributes = 2

public val DISPID_DA_EXTENDED_PROPERTIES: DispidInkDrawingAttributes = 11

public val DISPID_DA_FIT_TO_CURVE: DispidInkDrawingAttributes = 4

public val DISPID_DA_HEIGHT: DispidInkDrawingAttributes = 1

public val DISPID_DA_IGNORE_PRESSURE: DispidInkDrawingAttributes = 5

public val DISPID_DA_PEN_TIP: DispidInkDrawingAttributes = 9

public val DISPID_DA_RASTER_OPERATION: DispidInkDrawingAttributes = 8

public val DISPID_DA_TRANSPARENCY: DispidInkDrawingAttributes = 7

public val DISPID_DA_WIDTH: DispidInkDrawingAttributes = 3

public val DISPID_DISABLE_NO_SCROLL: DispidInkEdit = 3

public val DISPID_DRAG_ICON: DispidInkEdit = 21

public val DISPID_DRAW_ATTR: DispidInkEdit = 27

public val DISPID_ENABLED: DispidInkEdit = 5

public val DISPID_FACTOID: DispidInkEdit = 29

public val DISPID_GET_GEST_STATUS: DispidInkEdit = 33

public val DISPID_HWND: DispidInkEdit = 2

public val DISPID_I_ADD_STROKES_AT_RECTANGLE: DispidInk = 17

public val DISPID_IC_AUTO_REDRAW: DispidInkCollector = 8

public val DISPID_ICB_ID: DispidInkCursorButton = 1

public val DISPID_ICB_NAME: DispidInkCursorButton = 0

public val DISPID_ICB_STATE: DispidInkCursorButton = 2

public val DISPID_IC_BS_COUNT: DispidInkCursorButtons = 1

public val DISPID_IC_BS_ITEM: DispidInkCursorButtons = 0

public val DISPID_IC_BS_NEW_ENUM: DispidInkCursorButtons = -4

public val DISPID_IC_COLLECTING_INK: DispidInkCollector = 9

public val DISPID_IC_COLLECTION_MODE: DispidInkCollector = 28

public val DISPID_IC_CURSORS: DispidInkCollector = 20

public val DISPID_IC_DEFAULT_DRAWING_ATTRIBUTES: DispidInkCollector = 5

public val DISPID_IC_DESIRED_PACKET_DESCRIPTION: DispidInkCollector = 32

public val DISPID_IC_DYNAMIC_RENDERING: DispidInkCollector = 31

public val DISPID_ICE_CURSOR_BUTTON_DOWN: DispidInkCollectorEvent = 5

public val DISPID_ICE_CURSOR_BUTTON_UP: DispidInkCollectorEvent = 6

public val DISPID_ICE_CURSOR_DOWN: DispidInkCollectorEvent = 2

public val DISPID_ICE_CURSOR_IN_RANGE: DispidInkCollectorEvent = 7

public val DISPID_ICE_CURSOR_OUT_OF_RANGE: DispidInkCollectorEvent = 8

public val DISPID_ICE_GESTURE: DispidInkCollectorEvent = 10

public val DISPID_ICE_NEW_IN_AIR_PACKETS: DispidInkCollectorEvent = 4

public val DISPID_ICE_NEW_PACKETS: DispidInkCollectorEvent = 3

public val DISPID_ICE_STROKE: DispidInkCollectorEvent = 1

public val DISPID_ICE_SYSTEM_GESTURE: DispidInkCollectorEvent = 9

public val DISPID_ICE_TABLET_ADDED: DispidInkCollectorEvent = 11

public val DISPID_ICE_TABLET_REMOVED: DispidInkCollectorEvent = 12

public val DISPID_IC_ENABLED: DispidInkCollector = 1

public val DISPID_IC_GET_EVENT_INTEREST: DispidInkCollector = 11

public val DISPID_IC_GET_GESTURE_STATUS: DispidInkCollector = 30

public val DISPID_IC_GET_WINDOW_INPUT_RECTANGLE: DispidInkCollector = 24

public val DISPID_IC_HWND: DispidInkCollector = 2

public val DISPID_IC_INK: DispidInkCollector = 7

public val DISPID_IC_MARGIN_X: DispidInkCollector = 21

public val DISPID_IC_MARGIN_Y: DispidInkCollector = 22

public val DISPID_IC_MOUSE_ICON: DispidInkCollector = 35

public val DISPID_IC_MOUSE_POINTER: DispidInkCollector = 36

public val DISPID_IC_PAINT: DispidInkCollector = 3

public val DISPID_IC_RENDERER: DispidInkCollector = 6

public val DISPID_IC_SET_ALL_TABLETS_MODE: DispidInkCollector = 26

public val DISPID_IC_SET_EVENT_INTEREST: DispidInkCollector = 10

public val DISPID_IC_SET_GESTURE_STATUS: DispidInkCollector = 29

public val DISPID_IC_SET_SINGLE_TABLET_INTEGRATED_MODE: DispidInkCollector = 27

public val DISPID_IC_SET_WINDOW_INPUT_RECTANGLE: DispidInkCollector = 23

public val DISPID_IC_SS_ADD: DispidInkCustomStrokes = 2

public val DISPID_IC_SS_CLEAR: DispidInkCustomStrokes = 4

public val DISPID_IC_SS_COUNT: DispidInkCustomStrokes = 1

public val DISPID_IC_SS_ITEM: DispidInkCustomStrokes = 0

public val DISPID_IC_SS_REMOVE: DispidInkCustomStrokes = 3

public val DISPID_IC_SS_NEW_ENUM: DispidInkCustomStrokes = -4

public val DISPID_IC_SUPPORT_HIGH_CONTRAST_INK: DispidInkCollector = 38

public val DISPID_IC_TABLET: DispidInkCollector = 25

public val DISPID_IC_TEXT: DispidInkCollector = 4

public val DISPID_I_CAN_PASTE: DispidInk = 24

public val DISPID_I_CLIP: DispidInk = 18

public val DISPID_I_CLIPBOARD_COPY: DispidInk = 23

public val DISPID_I_CLIPBOARD_COPY_WITH_RECTANGLE: DispidInk = 22

public val DISPID_I_CLIPBOARD_PASTE: DispidInk = 25

public val DISPID_I_CLONE: DispidInk = 10

public val DISPID_I_CREATE_STROKE: DispidInk = 16

public val DISPID_I_CREATE_STROKE_FROM_POINTS: DispidInk = 21

public val DISPID_I_CREATE_STROKES: DispidInk = 15

public val DISPID_I_CS_COUNT: DispidInkCursors = 1

public val DISPID_I_CS_ITEM: DispidInkCursors = 0

public val DISPID_I_CS_NEW_ENUM: DispidInkCursors = -4

public val DISPID_I_CSR_BUTTONS: DispidInkCursor = 3

public val DISPID_I_CSR_DRAWING_ATTRIBUTES: DispidInkCursor = 2

public val DISPID_I_CSR_ID: DispidInkCursor = 1

public val DISPID_I_CSR_INVERTED: DispidInkCursor = 4

public val DISPID_I_CSR_NAME: DispidInkCursor = 0

public val DISPID_I_CSR_TABLET: DispidInkCursor = 5

public val DISPID_I_CUSTOM_STROKES: DispidInk = 9

public val DISPID_I_DELETE_STROKE: DispidInk = 5

public val DISPID_I_DELETE_STROKES: DispidInk = 4

public val DISPID_I_DIRTY: DispidInk = 8

public val DISPID_IE_INK_ADDED: DispidInkEvent = 1

public val DISPID_IE_INK_DELETED: DispidInkEvent = 2

public val DISPID_IEP_DATA: DispidInkExtendedProperty = 2

public val DISPID_IEP_GUID: DispidInkExtendedProperty = 1

public val DISPID_IE_PS_ADD: DispidInkExtendedProperties = 2

public val DISPID_IE_PS_CLEAR: DispidInkExtendedProperties = 4

public val DISPID_IE_PS_COUNT: DispidInkExtendedProperties = 1

public val DISPID_IE_PS_DOES_PROPERTY_EXIST: DispidInkExtendedProperties = 5

public val DISPID_IE_PS_ITEM: DispidInkExtendedProperties = 0

public val DISPID_IE_PS_REMOVE: DispidInkExtendedProperties = 3

public val DISPID_IE_PS_NEW_ENUM: DispidInkExtendedProperties = -4

public val DISPID_I_EXTENDED_PROPERTIES: DispidInk = 2

public val DISPID_I_EXTRACT_STROKES: DispidInk = 6

public val DISPID_I_EXTRACT_WITH_RECTANGLE: DispidInk = 7

public val DISPID_IG_CONFIDENCE: DispidInkGesture = 2

public val DISPID_IG_GET_HOT_POINT: DispidInkGesture = 1

public val DISPID_IG_ID: DispidInkGesture = 0

public val DISPID_I_GET_BOUNDING_BOX: DispidInk = 3

public val DISPID_I_HIT_TEST_CIRCLE: DispidInk = 11

public val DISPID_I_HIT_TEST_WITH_LASSO: DispidInk = 13

public val DISPID_I_HIT_TEST_WITH_RECTANGLE: DispidInk = 12

public val DISPID_I_INK_DIVIDER_DIVIDE: DispidInkDivider = 4

public val DISPID_I_INK_DIVIDER_LINE_HEIGHT: DispidInkDivider = 3

public val DISPID_I_INK_DIVIDER_RECOGNIZER_CONTEXT: DispidInkDivider = 2

public val DISPID_I_INK_DIVIDER_STROKES: DispidInkDivider = 1

public val DISPID_I_INK_DIVISION_RESULT_RESULT_BY_TYPE: DispidInkDivisionResult = 2

public val DISPID_I_INK_DIVISION_RESULT_STROKES: DispidInkDivisionResult = 1

public val DISPID_I_INK_DIVISION_UNIT_DIVISION_TYPE: DispidInkDivisionUnit = 2

public val DISPID_I_INK_DIVISION_UNIT_RECOGNIZED_STRING: DispidInkDivisionUnit = 3

public val DISPID_I_INK_DIVISION_UNIT_ROTATION_TRANSFORM: DispidInkDivisionUnit = 4

public val DISPID_I_INK_DIVISION_UNIT_STROKES: DispidInkDivisionUnit = 1

public val DISPID_I_INK_DIVISION_UNITS_COUNT: DispidInkDivisionUnits = 1

public val DISPID_I_INK_DIVISION_UNITS_ITEM: DispidInkDivisionUnits = 0

public val DISPID_I_INK_DIVISION_UNITS_NEW_ENUM: DispidInkDivisionUnits = -4

public val DISPID_I_LOAD: DispidInk = 20

public val DISPID_I_NEAREST_POINT: DispidInk = 14

public val DISPID_IO_ATTACH_MODE: DispidInkCollector = 14

public val DISPID_IO_DRAW: DispidInkCollector = 16

public val DISPID_IOE_PAINTED: DispidInkCollectorEvent = 14

public val DISPID_IOE_PAINTING: DispidInkCollectorEvent = 13

public val DISPID_IOE_SELECTION_CHANGED: DispidInkCollectorEvent = 16

public val DISPID_IOE_SELECTION_CHANGING: DispidInkCollectorEvent = 15

public val DISPID_IOE_SELECTION_MOVED: DispidInkCollectorEvent = 18

public val DISPID_IOE_SELECTION_MOVING: DispidInkCollectorEvent = 17

public val DISPID_IOE_SELECTION_RESIZED: DispidInkCollectorEvent = 20

public val DISPID_IOE_SELECTION_RESIZING: DispidInkCollectorEvent = 19

public val DISPID_IOE_STROKES_DELETED: DispidInkCollectorEvent = 22

public val DISPID_IOE_STROKES_DELETING: DispidInkCollectorEvent = 21

public val DISPID_IO_EDITING_MODE: DispidInkCollector = 12

public val DISPID_IO_ERASER_MODE: DispidInkCollector = 33

public val DISPID_IO_ERASER_WIDTH: DispidInkCollector = 34

public val DISPID_IO_HIT_TEST_SELECTION: DispidInkCollector = 15

public val DISPID_IO_SELECTION: DispidInkCollector = 13

public val DISPID_IO_SUPPORT_HIGH_CONTRAST_SELECTION_UI: DispidInkCollector = 39

public val DISPID_IP_BACK_COLOR: DispidInkCollector = 19

public val DISPID_IPE_CHANGE_UI_CUES: DispidInkCollectorEvent = 23

public val DISPID_IPE_CLICK: DispidInkCollectorEvent = 24

public val DISPID_IPE_DBL_CLICK: DispidInkCollectorEvent = 25

public val DISPID_IPE_INVALIDATED: DispidInkCollectorEvent = 26

public val DISPID_IPE_KEY_DOWN: DispidInkCollectorEvent = 37

public val DISPID_IPE_KEY_PRESS: DispidInkCollectorEvent = 38

public val DISPID_IPE_KEY_UP: DispidInkCollectorEvent = 39

public val DISPID_IPE_MOUSE_DOWN: DispidInkCollectorEvent = 27

public val DISPID_IPE_MOUSE_ENTER: DispidInkCollectorEvent = 28

public val DISPID_IPE_MOUSE_HOVER: DispidInkCollectorEvent = 29

public val DISPID_IPE_MOUSE_LEAVE: DispidInkCollectorEvent = 30

public val DISPID_IPE_MOUSE_MOVE: DispidInkCollectorEvent = 31

public val DISPID_IPE_MOUSE_UP: DispidInkCollectorEvent = 32

public val DISPID_IPE_MOUSE_WHEEL: DispidInkCollectorEvent = 33

public val DISPID_IPE_RESIZE: DispidInkCollectorEvent = 40

public val DISPID_IPE_SIZE_CHANGED: DispidInkCollectorEvent = 41

public val DISPID_IPE_SIZE_MODE_CHANGED: DispidInkCollectorEvent = 34

public val DISPID_IPE_STYLE_CHANGED: DispidInkCollectorEvent = 35

public val DISPID_IPE_SYSTEM_COLORS_CHANGED: DispidInkCollectorEvent = 36

public val DISPID_IP_INK_ENABLED: DispidInkCollector = 37

public val DISPID_IP_PICTURE: DispidInkCollector = 17

public val DISPID_IP_SIZE_MODE: DispidInkCollector = 18

public val DISPID_IR_BOTTOM: DispidInkRectangle = 3

public val DISPID_IR_DATA: DispidInkRectangle = 7

public val DISPID_IR_DRAW: DispidInkRenderer = 5

public val DISPID_IR_DRAW_STROKE: DispidInkRenderer = 6

public val DISPID_IRE_RECOGNITION: DispidInkRecognitionEvent = 2

public val DISPID_IRE_RECOGNITION_WITH_ALTERNATES: DispidInkRecognitionEvent = 1

public val DISPID_IRG_COLUMNS: DispidInkRecognizerGuide = 4

public val DISPID_IRG_DRAWN_BOX: DispidInkRecognizerGuide = 2

public val DISPID_IRG_GUIDE_DATA: DispidInkRecognizerGuide = 6

public val DISPID_IRG_MIDLINE: DispidInkRecognizerGuide = 5

public val DISPID_IRG_ROWS: DispidInkRecognizerGuide = 3

public val DISPID_IRG_WRITING_BOX: DispidInkRecognizerGuide = 1

public val DISPID_IR_GET_OBJECT_TRANSFORM: DispidInkRenderer = 3

public val DISPID_IR_GET_RECTANGLE: DispidInkRectangle = 5

public val DISPID_IR_GET_VIEW_TRANSFORM: DispidInkRenderer = 1

public val DISPID_IR_INK_SPACE_TO_PIXEL: DispidInkRenderer = 8

public val DISPID_IR_INK_SPACE_TO_PIXEL_FROM_POINTS: DispidInkRenderer = 10

public val DISPID_IR_LEFT: DispidInkRectangle = 2

public val DISPID_IR_MEASURE: DispidInkRenderer = 11

public val DISPID_IR_MEASURE_STROKE: DispidInkRenderer = 12

public val DISPID_IR_MOVE: DispidInkRenderer = 13

public val DISPID_IR_PIXEL_TO_INK_SPACE: DispidInkRenderer = 7

public val DISPID_IR_PIXEL_TO_INK_SPACE_FROM_POINTS: DispidInkRenderer = 9

public val DISPID_IR_RIGHT: DispidInkRectangle = 4

public val DISPID_IR_ROTATE: DispidInkRenderer = 14

public val DISPID_IR_SCALE: DispidInkRenderer = 15

public val DISPID_IR_SET_OBJECT_TRANSFORM: DispidInkRenderer = 4

public val DISPID_IR_SET_RECTANGLE: DispidInkRectangle = 6

public val DISPID_IR_SET_VIEW_TRANSFORM: DispidInkRenderer = 2

public val DISPID_IR_TOP: DispidInkRectangle = 1

public val DISPID_I_RECO_CTX2_ENABLED_UNICODE_RANGES: DispidInkRecoContext2 = 0

public val DISPID_I_RECO_CTX_BACKGROUND_RECOGNIZE: DispidInkRecoContext = 15

public val DISPID_I_RECO_CTX_BACKGROUND_RECOGNIZE_WITH_ALTERNATES: DispidInkRecoContext = 16

public val DISPID_I_RECO_CTX_CHARACTER_AUTO_COMPLETION_MODE: DispidInkRecoContext = 2

public val DISPID_I_RECO_CTX_CLONE: DispidInkRecoContext = 11

public val DISPID_I_RECO_CTX_END_INK_INPUT: DispidInkRecoContext = 14

public val DISPID_I_RECO_CTX_FACTOID: DispidInkRecoContext = 3

public val DISPID_I_RECO_CTX_FLAGS: DispidInkRecoContext = 7

public val DISPID_I_RECO_CTX_GUIDE: DispidInkRecoContext = 6

public val DISPID_I_RECO_CTX_IS_STRING_SUPPORTED: DispidInkRecoContext = 17

public val DISPID_I_RECO_CTX_PREFIX_TEXT: DispidInkRecoContext = 8

public val DISPID_I_RECO_CTX_RECOGNIZE: DispidInkRecoContext = 12

public val DISPID_I_RECO_CTX_RECOGNIZER: DispidInkRecoContext = 5

public val DISPID_I_RECO_CTX_STOP_BACKGROUND_RECOGNITION: DispidInkRecoContext = 13

public val DISPID_I_RECO_CTX_STOP_RECOGNITION: DispidInkRecoContext = 10

public val DISPID_I_RECO_CTX_STROKES: DispidInkRecoContext = 1

public val DISPID_I_RECO_CTX_SUFFIX_TEXT: DispidInkRecoContext = 9

public val DISPID_I_RECO_CTX_WORD_LIST: DispidInkRecoContext = 4

public val DISPID_I_RECOS_COUNT: DispidInkRecognizers = 1

public val DISPID_I_RECOS_GET_DEFAULT_RECOGNIZER: DispidInkRecognizers = 2

public val DISPID_I_RECOS_ITEM: DispidInkRecognizers = 0

public val DISPID_I_RECOS_NEW_ENUM: DispidInkRecognizers = -4

public val DISPID_ISD_BEZIER_CUSPS: DispidInkStrokeDisp = 15

public val DISPID_ISD_BEZIER_POINTS: DispidInkStrokeDisp = 13

public val DISPID_ISD_CLIP: DispidInkStrokeDisp = 7

public val DISPID_ISD_DELETED: DispidInkStrokeDisp = 20

public val DISPID_ISD_DRAWING_ATTRIBUTES: DispidInkStrokeDisp = 4

public val DISPID_ISD_EXTENDED_PROPERTIES: DispidInkStrokeDisp = 11

public val DISPID_ISD_FIND_INTERSECTIONS: DispidInkStrokeDisp = 5

public val DISPID_ISD_GET_BOUNDING_BOX: DispidInkStrokeDisp = 3

public val DISPID_ISD_GET_FLATTENED_BEZIER_POINTS: DispidInkStrokeDisp = 27

public val DISPID_ISD_GET_PACKET_DATA: DispidInkStrokeDisp = 24

public val DISPID_ISD_GET_PACKET_DESCRIPTION_PROPERTY_METRICS: DispidInkStrokeDisp = 21

public val DISPID_ISD_GET_PACKET_VALUES_BY_PROPERTY: DispidInkStrokeDisp = 25

public val DISPID_ISD_GET_POINTS: DispidInkStrokeDisp = 22

public val DISPID_ISD_GET_RECTANGLE_INTERSECTIONS: DispidInkStrokeDisp = 6

public val DISPID_ISD_HIT_TEST_CIRCLE: DispidInkStrokeDisp = 8

public val DISPID_ISDID: DispidInkStrokeDisp = 2

public val DISPID_ISD_INK: DispidInkStrokeDisp = 12

public val DISPID_ISD_INK_INDEX: DispidInkStrokeDisp = 1

public val DISPID_ISD_MOVE: DispidInkStrokeDisp = 30

public val DISPID_ISD_NEAREST_POINT: DispidInkStrokeDisp = 9

public val DISPID_ISD_PACKET_COUNT: DispidInkStrokeDisp = 17

public val DISPID_ISD_PACKET_DESCRIPTION: DispidInkStrokeDisp = 19

public val DISPID_ISD_PACKET_SIZE: DispidInkStrokeDisp = 18

public val DISPID_ISD_POLYLINE_CUSPS: DispidInkStrokeDisp = 14

public val DISPID_ISD_ROTATE: DispidInkStrokeDisp = 31

public val DISPID_ISD_SCALE: DispidInkStrokeDisp = 33

public val DISPID_ISD_SCALE_TO_RECTANGLE: DispidInkStrokeDisp = 28

public val DISPID_ISD_SELF_INTERSECTIONS: DispidInkStrokeDisp = 16

public val DISPID_ISD_SET_PACKET_VALUES_BY_PROPERTY: DispidInkStrokeDisp = 26

public val DISPID_ISD_SET_POINTS: DispidInkStrokeDisp = 23

public val DISPID_ISD_SHEAR: DispidInkStrokeDisp = 32

public val DISPID_ISD_SPLIT: DispidInkStrokeDisp = 10

public val DISPID_ISD_TRANSFORM: DispidInkStrokeDisp = 29

public val DISPID_I_SAVE: DispidInk = 19

public val DISPID_I_SS_ADD: DispidInkStrokes = 4

public val DISPID_I_SS_ADD_STROKES: DispidInkStrokes = 5

public val DISPID_I_SS_CLIP: DispidInkStrokes = 17

public val DISPID_I_SS_COUNT: DispidInkStrokes = 1

public val DISPID_I_SS_GET_BOUNDING_BOX: DispidInkStrokes = 10

public val DISPID_I_SS_INK: DispidInkStrokes = 3

public val DISPID_I_SS_ITEM: DispidInkStrokes = 0

public val DISPID_I_SS_MODIFY_DRAWING_ATTRIBUTES: DispidInkStrokes = 9

public val DISPID_I_SS_MOVE: DispidInkStrokes = 13

public val DISPID_I_SS_RECOGNITION_RESULT: DispidInkStrokes = 18

public val DISPID_I_SS_REMOVE: DispidInkStrokes = 6

public val DISPID_I_SS_REMOVE_RECOGNITION_RESULT: DispidInkStrokes = 19

public val DISPID_I_SS_REMOVE_STROKES: DispidInkStrokes = 7

public val DISPID_I_SS_ROTATE: DispidInkStrokes = 14

public val DISPID_I_SS_SCALE: DispidInkStrokes = 16

public val DISPID_I_SS_SCALE_TO_RECTANGLE: DispidInkStrokes = 11

public val DISPID_I_SS_SHEAR: DispidInkStrokes = 15

public val DISPID_I_SS_TO_STRING: DispidInkStrokes = 8

public val DISPID_I_SS_TRANSFORM: DispidInkStrokes = 12

public val DISPID_I_SS_VALID: DispidInkStrokes = 2

public val DISPID_I_SS_NEW_ENUM: DispidInkStrokes = -4

public val DISPID_I_STROKES: DispidInk = 1

public val DISPID_IT2DEVICE_KIND: DispidInkTablet2 = 0

public val DISPID_IT3IS_MULTI_TOUCH: DispidInkTablet3 = 0

public val DISPID_IT3MAXIMUM_CURSORS: DispidInkTablet3 = 1

public val DISPID_IT_DATA: DispidInkTransform = 15

public val DISPID_IT_GET_TRANSFORM: DispidInkTransform = 13

public val DISPID_IT_HARDWARE_CAPABILITIES: DispidInkTablet = 5

public val DISPID_IT_IS_PACKET_PROPERTY_SUPPORTED: DispidInkTablet = 3

public val DISPID_IT_MAXIMUM_INPUT_RECTANGLE: DispidInkTablet = 4

public val DISPID_IT_NAME: DispidInkTablet = 0

public val DISPID_IT_PLUG_AND_PLAY_ID: DispidInkTablet = 1

public val DISPID_IT_PROPERTY_METRICS: DispidInkTablet = 2

public val DISPID_IT_REFLECT: DispidInkTransform = 4

public val DISPID_IT_RESET: DispidInkTransform = 1

public val DISPID_IT_ROTATE: DispidInkTransform = 3

public val DISPID_IT_SCALE: DispidInkTransform = 6

public val DISPID_IT_SET_TRANSFORM: DispidInkTransform = 14

public val DISPID_IT_SHEAR: DispidInkTransform = 5

public val DISPID_IT_TRANSLATE: DispidInkTransform = 2

public val DISPID_I_TE_DX: DispidInkTransform = 11

public val DISPID_I_TE_DY: DispidInkTransform = 12

public val DISPID_I_TE_M11: DispidInkTransform = 7

public val DISPID_I_TE_M12: DispidInkTransform = 8

public val DISPID_I_TE_M21: DispidInkTransform = 9

public val DISPID_I_TE_M22: DispidInkTransform = 10

public val DISPID_I_TS_COUNT: DispidInkTablets = 2

public val DISPID_I_TS_DEFAULT_TABLET: DispidInkTablets = 1

public val DISPID_I_TS_IS_PACKET_PROPERTY_SUPPORTED: DispidInkTablets = 3

public val DISPID_I_TS_ITEM: DispidInkTablets = 0

public val DISPID_I_TS_NEW_ENUM: DispidInkTablets = -4

public val DISPID_IEE_CHANGE: DispidInkEditEvents = 1

public val DISPID_IEE_CLICK: DispidInkEditEvents = 9

public val DISPID_IEE_CURSOR_DOWN: DispidInkEditEvents = 21

public val DISPID_IEE_DBL_CLICK: DispidInkEditEvents = 8

public val DISPID_IEE_GESTURE: DispidInkEditEvents = 23

public val DISPID_IEE_KEY_DOWN: DispidInkEditEvents = 3

public val DISPID_IEE_KEY_PRESS: DispidInkEditEvents = 7

public val DISPID_IEE_KEY_UP: DispidInkEditEvents = 4

public val DISPID_IEE_MOUSE_DOWN: DispidInkEditEvents = 6

public val DISPID_IEE_MOUSE_MOVE: DispidInkEditEvents = 10

public val DISPID_IEE_MOUSE_UP: DispidInkEditEvents = 5

public val DISPID_IEE_RECOGNITION_RESULT: DispidInkEditEvents = 24

public val DISPID_IEE_SEL_CHANGE: DispidInkEditEvents = 2

public val DISPID_IEE_STROKE: DispidInkEditEvents = 22

public val DISPID_INK_INSERT_MODE: DispidInkEdit = 25

public val DISPID_INK_MODE: DispidInkEdit = 24

public val DISPID_INK_RECO_ALTERNATE_ALTERNATES_WITH_CONSTANT_PROPERTY_VALUES: DispidInkRecoAlternate = 15

public val DISPID_INK_RECO_ALTERNATE_ASCENDER: DispidInkRecoAlternate = 5

public val DISPID_INK_RECO_ALTERNATE_BASELINE: DispidInkRecoAlternate = 3

public val DISPID_INK_RECO_ALTERNATE_CONFIDENCE: DispidInkRecoAlternate = 7

public val DISPID_INK_RECO_ALTERNATE_CONFIDENCE_ALTERNATES: DispidInkRecoAlternate = 14

public val DISPID_INK_RECO_ALTERNATE_DESCENDER: DispidInkRecoAlternate = 6

public val DISPID_INK_RECO_ALTERNATE_GET_PROPERTY_VALUE: DispidInkRecoAlternate = 12

public val DISPID_INK_RECO_ALTERNATE_GET_STROKES_FROM_STROKE_RANGES: DispidInkRecoAlternate = 9

public val DISPID_INK_RECO_ALTERNATE_GET_STROKES_FROM_TEXT_RANGE: DispidInkRecoAlternate = 10

public val DISPID_INK_RECO_ALTERNATE_GET_TEXT_RANGE_FROM_STROKES: DispidInkRecoAlternate = 11

public val DISPID_INK_RECO_ALTERNATE_LINE_ALTERNATES: DispidInkRecoAlternate = 13

public val DISPID_INK_RECO_ALTERNATE_LINE_NUMBER: DispidInkRecoAlternate = 2

public val DISPID_INK_RECO_ALTERNATE_MIDLINE: DispidInkRecoAlternate = 4

public val DISPID_INK_RECO_ALTERNATE_STRING: DispidInkRecoAlternate = 1

public val DISPID_INK_RECO_ALTERNATE_STROKES: DispidInkRecoAlternate = 8

public val DISPID_INK_RECOGNITION_ALTERNATES_COUNT: DispidInkRecognitionAlternates = 1

public val DISPID_INK_RECOGNITION_ALTERNATES_ITEM: DispidInkRecognitionAlternates = 0

public val DISPID_INK_RECOGNITION_ALTERNATES_NEW_ENUM: DispidInkRecognitionAlternates = -4

public val DISPID_INK_RECOGNITION_ALTERNATES_STROKES: DispidInkRecognitionAlternates = 2

public val DISPID_INK_RECOGNITION_RESULT_ALTERNATES_FROM_SELECTION: DispidInkRecognitionResult = 5

public val DISPID_INK_RECOGNITION_RESULT_MODIFY_TOP_ALTERNATE: DispidInkRecognitionResult = 6

public val DISPID_INK_RECOGNITION_RESULT_SET_RESULT_ON_STROKES: DispidInkRecognitionResult = 7

public val DISPID_INK_RECOGNITION_RESULT_STROKES: DispidInkRecognitionResult = 3

public val DISPID_INK_RECOGNITION_RESULT_TOP_ALTERNATE: DispidInkRecognitionResult = 2

public val DISPID_INK_RECOGNITION_RESULT_TOP_CONFIDENCE: DispidInkRecognitionResult = 4

public val DISPID_INK_RECOGNITION_RESULT_TOP_STRING: DispidInkRecognitionResult = 1

public val DISPID_INK_WORD_LIST2_ADD_WORDS: DispidInkWordList2 = 3

public val DISPID_INK_WORD_LIST_ADD_WORD: DispidInkWordList = 0

public val DISPID_INK_WORD_LIST_MERGE: DispidInkWordList = 2

public val DISPID_INK_WORD_LIST_REMOVE_WORD: DispidInkWordList = 1

public val DISPID_LOCKED: DispidInkEdit = 4

public val DISPID_MIC_CLEAR: DispidMathInputControlEvents = 3

public val DISPID_MIC_CLOSE: DispidMathInputControlEvents = 1

public val DISPID_MIC_INSERT: DispidMathInputControlEvents = 0

public val DISPID_MIC_PAINT: DispidMathInputControlEvents = 2

public val DISPID_MAX_LENGTH: DispidInkEdit = 6

public val DISPID_MULTI_LINE: DispidInkEdit = 7

public val DISPID_PIP_ATTACHED_EDIT_WINDOW: DispidPenInputPanel = 0

public val DISPID_PIP_AUTO_SHOW: DispidPenInputPanel = 16

public val DISPID_PIP_BUSY: DispidPenInputPanel = 12

public val DISPID_PIP_COMMIT_PENDING_INPUT: DispidPenInputPanel = 10

public val DISPID_PIP_CURRENT_PANEL: DispidPenInputPanel = 2

public val DISPID_PIP_DEFAULT_PANEL: DispidPenInputPanel = 3

public val DISPID_PIPE_INPUT_FAILED: DispidPenInputPanelEvents = 2

public val DISPID_PIPE_PANEL_CHANGED: DispidPenInputPanelEvents = 1

public val DISPID_PIPE_PANEL_MOVING: DispidPenInputPanelEvents = 3

public val DISPID_PIPE_VISIBLE_CHANGED: DispidPenInputPanelEvents = 0

public val DISPID_PIP_ENABLE_TSF: DispidPenInputPanel = 15

public val DISPID_PIP_FACTOID: DispidPenInputPanel = 1

public val DISPID_PIP_HEIGHT: DispidPenInputPanel = 8

public val DISPID_PIP_HORIZONTAL_OFFSET: DispidPenInputPanel = 14

public val DISPID_PIP_LEFT: DispidPenInputPanel = 6

public val DISPID_PIP_MOVE_TO: DispidPenInputPanel = 9

public val DISPID_PIP_REFRESH: DispidPenInputPanel = 11

public val DISPID_PIP_TOP: DispidPenInputPanel = 5

public val DISPID_PIP_VERTICAL_OFFSET: DispidPenInputPanel = 13

public val DISPID_PIP_VISIBLE: DispidPenInputPanel = 4

public val DISPID_PIP_WIDTH: DispidPenInputPanel = 7

public val DISPID_RT_SEL_LENGTH: DispidInkEdit = 10

public val DISPID_RT_SEL_START: DispidInkEdit = 9

public val DISPID_RT_SEL_TEXT: DispidInkEdit = 11

public val DISPID_RECO_CAPABILITIES: DispidInkRecognizer = 4

public val DISPID_RECO_CLSID: DispidInkRecognizer = 1

public val DISPID_RECO_CREATE_RECOGNIZER_CONTEXT: DispidInkRecognizer = 7

public val DISPID_RECO_ID: DispidInkRecognizer2 = 0

public val DISPID_RECO_LANGUAGE_ID: DispidInkRecognizer = 5

public val DISPID_RECO_NAME: DispidInkRecognizer = 2

public val DISPID_RECO_PREFERRED_PACKET_DESCRIPTION: DispidInkRecognizer = 6

public val DISPID_RECO_SUPPORTED_PROPERTIES: DispidInkRecognizer = 8

public val DISPID_RECO_TIMEOUT: DispidInkEdit = 26

public val DISPID_RECO_UNICODE_RANGES: DispidInkRecognizer2 = 1

public val DISPID_RECO_VENDOR: DispidInkRecognizer = 3

public val DISPID_RECOGNIZE: DispidInkEdit = 32

public val DISPID_RECOGNIZER: DispidInkEdit = 28

public val DISPID_REFRESH: DispidInkEdit = 35

public val DISPID_SE_STROKES_ADDED: DispidStrokeEvent = 1

public val DISPID_SE_STROKES_REMOVED: DispidStrokeEvent = 2

public val DISPID_SCROLL_BARS: DispidInkEdit = 8

public val DISPID_SEL_ALIGNMENT: DispidInkEdit = 12

public val DISPID_SEL_BOLD: DispidInkEdit = 13

public val DISPID_SEL_CHAR_OFFSET: DispidInkEdit = 14

public val DISPID_SEL_COLOR: DispidInkEdit = 15

public val DISPID_SEL_FONT_NAME: DispidInkEdit = 16

public val DISPID_SEL_FONT_SIZE: DispidInkEdit = 17

public val DISPID_SEL_INK: DispidInkEdit = 30

public val DISPID_SEL_INKS_DISPLAY_MODE: DispidInkEdit = 31

public val DISPID_SEL_ITALIC: DispidInkEdit = 18

public val DISPID_SEL_RTF: DispidInkEdit = 19

public val DISPID_SEL_UNDERLINE: DispidInkEdit = 20

public val DISPID_SET_GEST_STATUS: DispidInkEdit = 34

public val DISPID_STATUS: DispidInkEdit = 22

public val DISPID_TEXT: DispidInkEdit = 0

public val DISPID_TEXT_RTF: DispidInkEdit = 1

public val DISPID_USE_MOUSE_FOR_INPUT: DispidInkEdit = 23

public val DOCKED_BOTTOM: VisualState = 3

public val DOCKED_TOP: VisualState = 2

public val DYNAMIC_RENDERER: Guid = Guid.fromU128(U128(0xecd32aea746f4dcbuL, 0xbf68082757faff18uL))

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

public val EVENT_MASK_ALL: EventMask = 4095

public val EVENT_MASK_CORRECTION_MODE_CHANGED: EventMask = 128

public val EVENT_MASK_CORRECTION_MODE_CHANGING: EventMask = 64

public val EVENT_MASK_IN_PLACE_SIZE_CHANGED: EventMask = 8

public val EVENT_MASK_IN_PLACE_SIZE_CHANGING: EventMask = 4

public val EVENT_MASK_IN_PLACE_STATE_CHANGED: EventMask = 2

public val EVENT_MASK_IN_PLACE_STATE_CHANGING: EventMask = 1

public val EVENT_MASK_IN_PLACE_VISIBILITY_CHANGED: EventMask = 512

public val EVENT_MASK_IN_PLACE_VISIBILITY_CHANGING: EventMask = 256

public val EVENT_MASK_INPUT_AREA_CHANGED: EventMask = 32

public val EVENT_MASK_INPUT_AREA_CHANGING: EventMask = 16

public val EVENT_MASK_TEXT_INSERTED: EventMask = 2048

public val EVENT_MASK_TEXT_INSERTING: EventMask = 1024

public val FACILITY_INK: UInt = 40u

public val FACTOID_BOPOMOFO: Pcwstr = w("BOPOMOFO")

public val FACTOID_CHINESESIMPLECOMMON: Pcwstr = w("CHS_COMMON")

public val FACTOID_CHINESETRADITIONALCOMMON: Pcwstr = w("CHT_COMMON")

public val FACTOID_CURRENCY: Pcwstr = w("CURRENCY")

public val FACTOID_DATE: Pcwstr = w("DATE")

public val FACTOID_DEFAULT: Pcwstr = w("DEFAULT")

public val FACTOID_DIGIT: Pcwstr = w("DIGIT")

public val FACTOID_EMAIL: Pcwstr = w("EMAIL")

public val FACTOID_FILENAME: Pcwstr = w("FILENAME")

public val FACTOID_HANGULCOMMON: Pcwstr = w("HANGUL_COMMON")

public val FACTOID_HANGULRARE: Pcwstr = w("HANGUL_RARE")

public val FACTOID_HIRAGANA: Pcwstr = w("HIRAGANA")

public val FACTOID_JAMO: Pcwstr = w("JAMO")

public val FACTOID_JAPANESECOMMON: Pcwstr = w("JPN_COMMON")

public val FACTOID_KANJICOMMON: Pcwstr = w("KANJI_COMMON")

public val FACTOID_KANJIRARE: Pcwstr = w("KANJI_RARE")

public val FACTOID_KATAKANA: Pcwstr = w("KATAKANA")

public val FACTOID_KOREANCOMMON: Pcwstr = w("KOR_COMMON")

public val FACTOID_LOWERCHAR: Pcwstr = w("LOWERCHAR")

public val FACTOID_NONE: Pcwstr = w("NONE")

public val FACTOID_NUMBER: Pcwstr = w("NUMBER")

public val FACTOID_NUMBERSIMPLE: Pcwstr = w("NUMSIMPLE")

public val FACTOID_ONECHAR: Pcwstr = w("ONECHAR")

public val FACTOID_PERCENT: Pcwstr = w("PERCENT")

public val FACTOID_POSTALCODE: Pcwstr = w("POSTALCODE")

public val FACTOID_PUNCCHAR: Pcwstr = w("PUNCCHAR")

public val FACTOID_SYSTEMDICTIONARY: Pcwstr = w("SYSDICT")

public val FACTOID_TELEPHONE: Pcwstr = w("TELEPHONE")

public val FACTOID_TIME: Pcwstr = w("TIME")

public val FACTOID_UPPERCHAR: Pcwstr = w("UPPERCHAR")

public val FACTOID_WEB: Pcwstr = w("WEB")

public val FACTOID_WORDLIST: Pcwstr = w("WORDLIST")

public val FLICKACTION_COMMANDCODE_APPCOMMAND: FlickactionCommandcode = 2

public val FLICKACTION_COMMANDCODE_CUSTOMKEY: FlickactionCommandcode = 3

public val FLICKACTION_COMMANDCODE_KEYMODIFIER: FlickactionCommandcode = 4

public val FLICKACTION_COMMANDCODE_NULL: FlickactionCommandcode = 0

public val FLICKACTION_COMMANDCODE_SCROLL: FlickactionCommandcode = 1

public val FLICKDIRECTION_DOWN: Flickdirection = 6

public val FLICKDIRECTION_DOWNLEFT: Flickdirection = 5

public val FLICKDIRECTION_DOWNRIGHT: Flickdirection = 7

public val FLICKDIRECTION_INVALID: Flickdirection = 8

public val FLICKDIRECTION_LEFT: Flickdirection = 4

public val FLICKDIRECTION_MIN: Flickdirection = 0

public val FLICKDIRECTION_RIGHT: Flickdirection = 0

public val FLICKDIRECTION_UP: Flickdirection = 2

public val FLICKDIRECTION_UPLEFT: Flickdirection = 3

public val FLICKDIRECTION_UPRIGHT: Flickdirection = 1

public val FLICKMODE_DEFAULT: Flickmode = 1

public val FLICKMODE_LEARNING: Flickmode = 2

public val FLICKMODE_MAX: Flickmode = 2

public val FLICKMODE_MIN: Flickmode = 0

public val FLICKMODE_OFF: Flickmode = 0

public val FLICKMODE_ON: Flickmode = 1

public val FLICK_WM_HANDLED_MASK: UInt = 1u

public val FLOATING: VisualState = 1

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

public val GUID_DYNAMIC_RENDERER_CACHED_DATA: Guid = Guid.fromU128(U128(0xbf531b9225bf4a95uL, 0x89ad0e476b34b4f5uL))

public val GUID_GESTURE_DATA: Guid = Guid.fromU128(U128(0x41e4ec0f26aa455auL, 0x9aa52cd36cf63fb9uL))

public val GUID_PACKETPROPERTY_GUID_ALTITUDE_ORIENTATION: Guid = Guid.fromU128(U128(0x82dec5c7f6ba4906uL, 0x894f66d68dfc456cuL))

public val GUID_PACKETPROPERTY_GUID_AZIMUTH_ORIENTATION: Guid = Guid.fromU128(U128(0x29123b48828410buL, 0xb250a0536595e5dcuL))

public val GUID_PACKETPROPERTY_GUID_BUTTON_PRESSURE: Guid = Guid.fromU128(U128(0x8b7fefc496aa4bfeuL, 0xac268a5f0be07bf5uL))

public val GUID_PACKETPROPERTY_GUID_DEVICE_CONTACT_ID: Guid = Guid.fromU128(U128(0x2585b91049b4750uL, 0x9615df8948ab3c9cuL))

public val GUID_PACKETPROPERTY_GUID_FINGERCONTACTCONFIDENCE: Guid = Guid.fromU128(U128(0xe706c80457f04f00uL, 0x8a0c853d57789be9uL))

public val GUID_PACKETPROPERTY_GUID_HEIGHT: Guid = Guid.fromU128(U128(0xe61858d2e4474218uL, 0x9d3f18865c203df4uL))

public val GUID_PACKETPROPERTY_GUID_NORMAL_PRESSURE: Guid = Guid.fromU128(U128(0x7307502df9f44e18uL, 0xb3f22ce1b1a3610cuL))

public val GUID_PACKETPROPERTY_GUID_PACKET_STATUS: Guid = Guid.fromU128(U128(0x6e0e07bfafe74cf7uL, 0x87d1af6446208418uL))

public val GUID_PACKETPROPERTY_GUID_PITCH_ROTATION: Guid = Guid.fromU128(U128(0x7f7e57b7be374be1uL, 0xa3567a84160e1893uL))

public val GUID_PACKETPROPERTY_GUID_ROLL_ROTATION: Guid = Guid.fromU128(U128(0x5d5d5e566ba94c5buL, 0x9fb0851c91714e56uL))

public val GUID_PACKETPROPERTY_GUID_SERIAL_NUMBER: Guid = Guid.fromU128(U128(0x78a81b5609354493uL, 0xbaae00541a8a16c4uL))

public val GUID_PACKETPROPERTY_GUID_TANGENT_PRESSURE: Guid = Guid.fromU128(U128(0x6da4488b524441ecuL, 0x905b32d89ab80809uL))

public val GUID_PACKETPROPERTY_GUID_TIMER_TICK: Guid = Guid.fromU128(U128(0x436510c5fed345d1uL, 0x8b7671d3ea7a829duL))

public val GUID_PACKETPROPERTY_GUID_TWIST_ORIENTATION: Guid = Guid.fromU128(U128(0xd32496013b241e4uL, 0xace67ae9d43d2d3buL))

public val GUID_PACKETPROPERTY_GUID_WIDTH: Guid = Guid.fromU128(U128(0xbaabe94d271248f5uL, 0xbe9d8f8b5ea0711auL))

public val GUID_PACKETPROPERTY_GUID_X: Guid = Guid.fromU128(U128(0x598a6a8f52c04ba0uL, 0x93afaf357411a561uL))

public val GUID_PACKETPROPERTY_GUID_X_TILT_ORIENTATION: Guid = Guid.fromU128(U128(0xa8d07b3a8bf040b0uL, 0x95a9b80a6bb787bfuL))

public val GUID_PACKETPROPERTY_GUID_Y: Guid = Guid.fromU128(U128(0xb53f9f7504e04498uL, 0xa7eec30dbb5a9011uL))

public val GUID_PACKETPROPERTY_GUID_YAW_ROTATION: Guid = Guid.fromU128(U128(0x6a8499807c3a45b7uL, 0xaa8290a262950e89uL))

public val GUID_PACKETPROPERTY_GUID_Y_TILT_ORIENTATION: Guid = Guid.fromU128(U128(0xe9323891d7743afuL, 0xac005b950d6d4b2duL))

public val GUID_PACKETPROPERTY_GUID_Z: Guid = Guid.fromU128(U128(0x735adb300ebb4788uL, 0xa0e40f316490055duL))

public val GESTURE_RECOGNIZER: Guid = Guid.fromU128(U128(0xea30c654c62c441fuL, 0xac0095f9a196782cuL))

public val HANDWRITTEN_TEXT_INSERTION: Guid = Guid.fromU128(U128(0x9f074ee2e6e94d8auL, 0xa047eb5b5c3c55dauL))

public val IAG_ALL_GESTURES: InkApplicationGesture = 0

public val IAG_ARROW_DOWN: InkApplicationGesture = 61497

public val IAG_ARROW_LEFT: InkApplicationGesture = 61498

public val IAG_ARROW_RIGHT: InkApplicationGesture = 61499

public val IAG_ARROW_UP: InkApplicationGesture = 61496

public val IAG_CHECK: InkApplicationGesture = 61445

public val IAG_CHEVRON_DOWN: InkApplicationGesture = 61489

public val IAG_CHEVRON_LEFT: InkApplicationGesture = 61490

public val IAG_CHEVRON_RIGHT: InkApplicationGesture = 61491

public val IAG_CHEVRON_UP: InkApplicationGesture = 61488

public val IAG_CIRCLE: InkApplicationGesture = 61472

public val IAG_CURLICUE: InkApplicationGesture = 61456

public val IAG_DOUBLE_CIRCLE: InkApplicationGesture = 61473

public val IAG_DOUBLE_CURLICUE: InkApplicationGesture = 61457

public val IAG_DOUBLE_TAP: InkApplicationGesture = 61681

public val IAG_DOWN: InkApplicationGesture = 61529

public val IAG_DOWN_LEFT: InkApplicationGesture = 61546

public val IAG_DOWN_LEFT_LONG: InkApplicationGesture = 61542

public val IAG_DOWN_RIGHT: InkApplicationGesture = 61547

public val IAG_DOWN_RIGHT_LONG: InkApplicationGesture = 61543

public val IAG_DOWN_UP: InkApplicationGesture = 61537

public val IAG_EXCLAMATION: InkApplicationGesture = 61604

public val IAG_LEFT: InkApplicationGesture = 61530

public val IAG_LEFT_DOWN: InkApplicationGesture = 61549

public val IAG_LEFT_RIGHT: InkApplicationGesture = 61538

public val IAG_LEFT_UP: InkApplicationGesture = 61548

public val IAG_NO_GESTURE: InkApplicationGesture = 61440

public val IAG_RIGHT: InkApplicationGesture = 61531

public val IAG_RIGHT_DOWN: InkApplicationGesture = 61551

public val IAG_RIGHT_LEFT: InkApplicationGesture = 61539

public val IAG_RIGHT_UP: InkApplicationGesture = 61550

public val IAG_SCRATCHOUT: InkApplicationGesture = 61441

public val IAG_SEMI_CIRCLE_LEFT: InkApplicationGesture = 61480

public val IAG_SEMI_CIRCLE_RIGHT: InkApplicationGesture = 61481

public val IAG_SQUARE: InkApplicationGesture = 61443

public val IAG_STAR: InkApplicationGesture = 61444

public val IAG_TAP: InkApplicationGesture = 61680

public val IAG_TRIANGLE: InkApplicationGesture = 61442

public val IAG_UP: InkApplicationGesture = 61528

public val IAG_UP_DOWN: InkApplicationGesture = 61536

public val IAG_UP_LEFT: InkApplicationGesture = 61544

public val IAG_UP_LEFT_LONG: InkApplicationGesture = 61540

public val IAG_UP_RIGHT: InkApplicationGesture = 61545

public val IAG_UP_RIGHT_LONG: InkApplicationGesture = 61541

public val IBBM_CURVE_FIT: InkBoundingBoxMode = 2

public val IBBM_DEFAULT: InkBoundingBoxMode = 0

public val IBBM_NO_CURVE_FIT: InkBoundingBoxMode = 1

public val IBBM_POINTS_ONLY: InkBoundingBoxMode = 3

public val IBBM_UNION: InkBoundingBoxMode = 4

public val ICBS_DOWN: InkCursorButtonState = 2

public val ICBS_UNAVAILABLE: InkCursorButtonState = 0

public val ICBS_UP: InkCursorButtonState = 1

public val ICB_COPY: InkClipboardModes = 0

public val ICB_CUT: InkClipboardModes = 1

public val ICB_DEFAULT: InkClipboardModes = 0

public val ICB_DELAYED_COPY: InkClipboardModes = 32

public val ICB_EXTRACT_ONLY: InkClipboardModes = 48

public val ICEI_ALL_EVENTS: InkCollectorEventInterest = 16

public val ICEI_CURSOR_BUTTON_DOWN: InkCollectorEventInterest = 4

public val ICEI_CURSOR_BUTTON_UP: InkCollectorEventInterest = 5

public val ICEI_CURSOR_DOWN: InkCollectorEventInterest = 0

public val ICEI_CURSOR_IN_RANGE: InkCollectorEventInterest = 6

public val ICEI_CURSOR_OUT_OF_RANGE: InkCollectorEventInterest = 7

public val ICEI_DBL_CLICK: InkCollectorEventInterest = 15

public val ICEI_DEFAULT_EVENTS: InkCollectorEventInterest = -1

public val ICEI_MOUSE_DOWN: InkCollectorEventInterest = 11

public val ICEI_MOUSE_MOVE: InkCollectorEventInterest = 12

public val ICEI_MOUSE_UP: InkCollectorEventInterest = 13

public val ICEI_MOUSE_WHEEL: InkCollectorEventInterest = 14

public val ICEI_NEW_IN_AIR_PACKETS: InkCollectorEventInterest = 3

public val ICEI_NEW_PACKETS: InkCollectorEventInterest = 2

public val ICEI_STROKE: InkCollectorEventInterest = 1

public val ICEI_SYSTEM_GESTURE: InkCollectorEventInterest = 8

public val ICEI_TABLET_ADDED: InkCollectorEventInterest = 9

public val ICEI_TABLET_REMOVED: InkCollectorEventInterest = 10

public val ICF_BITMAP: InkClipboardFormats = 64

public val ICF_COPY_MASK: InkClipboardFormats = 127

public val ICF_DEFAULT: InkClipboardFormats = 127

public val ICF_ENHANCED_METAFILE: InkClipboardFormats = 8

public val ICF_INK_SERIALIZED_FORMAT: InkClipboardFormats = 1

public val ICF_METAFILE: InkClipboardFormats = 32

public val ICF_NONE: InkClipboardFormats = 0

public val ICF_PASTE_MASK: InkClipboardFormats = 7

public val ICF_SKETCH_INK: InkClipboardFormats = 2

public val ICF_TEXT_INK: InkClipboardFormats = 6

public val ICM_GESTURE_ONLY: InkCollectionMode = 1

public val ICM_INK_AND_GESTURE: InkCollectionMode = 2

public val ICM_INK_ONLY: InkCollectionMode = 0

public val IDM_INK: InkDisplayMode = 0

public val IDM_TEXT: InkDisplayMode = 1

public val IDT_DRAWING: InkDivisionType = 3

public val IDT_LINE: InkDivisionType = 1

public val IDT_PARAGRAPH: InkDivisionType = 2

public val IDT_SEGMENT: InkDivisionType = 0

public val IECN_GESTURE: UInt = 2050u

public val IECN_RECOGNITIONRESULT: UInt = 2051u

public val IECN_STROKE: UInt = 2049u

public val IECN__BASE: UInt = 2048u

public val IEC__BASE: UInt = 1536u

public val IEF_COPY_FROM_ORIGINAL: InkExtractFlags = 0

public val IEF_DEFAULT: InkExtractFlags = 1

public val IEF_REMOVE_FROM_ORIGINAL: InkExtractFlags = 1

public val IEM_DISABLED: InkMode = 0

public val IEM_INK: InkMode = 1

public val IEM_INK_AND_GESTURE: InkMode = 2

public val IEM_INSERT_INK: InkInsertMode = 1

public val IEM_INSERT_TEXT: InkInsertMode = 0

public val IES_COLLECTING: InkEditStatus = 1

public val IES_IDLE: InkEditStatus = 0

public val IES_RECOGNIZING: InkEditStatus = 2

public val IKM_ALT: InkShiftKeyModifierFlags = 4

public val IKM_CONTROL: InkShiftKeyModifierFlags = 2

public val IKM_SHIFT: InkShiftKeyModifierFlags = 1

public val IMF_BOLD: InkMetricFlags = 4

public val IMF_FONT_SELECTED_IN_HDC: InkMetricFlags = 1

public val IMF_ITALIC: InkMetricFlags = 2

public val IMF_LEFT: InkMouseButton = 1

public val IMF_MIDDLE: InkMouseButton = 4

public val IMF_RIGHT: InkMouseButton = 2

public val IMP_ARROW: InkMousePointer = 1

public val IMP_ARROW_HOURGLASS: InkMousePointer = 11

public val IMP_ARROW_QUESTION: InkMousePointer = 12

public val IMP_CROSSHAIR: InkMousePointer = 2

public val IMP_CUSTOM: InkMousePointer = 99

public val IMP_DEFAULT: InkMousePointer = 0

public val IMP_HAND: InkMousePointer = 14

public val IMP_HOURGLASS: InkMousePointer = 9

public val IMP_IBEAM: InkMousePointer = 3

public val IMP_NO_DROP: InkMousePointer = 10

public val IMP_SIZE_ALL: InkMousePointer = 13

public val IMP_SIZE_NESW: InkMousePointer = 4

public val IMP_SIZE_NS: InkMousePointer = 5

public val IMP_SIZE_NWSE: InkMousePointer = 6

public val IMP_SIZE_WE: InkMousePointer = 7

public val IMP_UP_ARROW: InkMousePointer = 8

public val INKEDIT_CLASS: Pcwstr = w("INKEDIT")

public val INKEDIT_CLASSW: Pcwstr = w("INKEDIT")

public val INKRECOGNITIONPROPERTY_BOXNUMBER: Pcwstr = w("{2C243E3A-F733-4EB6-B1F8-B5DC5C2C4CDA}")

public val INKRECOGNITIONPROPERTY_CONFIDENCELEVEL: Pcwstr = w("{7DFE11A7-FB5D-4958-8765-154ADF0D833F}")

public val INKRECOGNITIONPROPERTY_HOTPOINT: Pcwstr = w("{CA6F40DC-5292-452a-91FB-2181C0BEC0DE}")

public val INKRECOGNITIONPROPERTY_LINEMETRICS: Pcwstr = w("{8CC24B27-30A9-4b96-9056-2D3A90DA0727}")

public val INKRECOGNITIONPROPERTY_LINENUMBER: Pcwstr = w("{DBF29F2C-5289-4BE8-B3D8-6EF63246253E}")

public val INKRECOGNITIONPROPERTY_MAXIMUMSTROKECOUNT: Pcwstr = w("{BF0EEC4E-4B7D-47a9-8CFA-234DD24BD22A}")

public val INKRECOGNITIONPROPERTY_POINTSPERINCH: Pcwstr = w("{7ED16B76-889C-468e-8276-0021B770187E}")

public val INKRECOGNITIONPROPERTY_SEGMENTATION: Pcwstr = w("{B3C0FE6C-FB51-4164-BA2F-844AF8F983DA}")

public val INK_SERIALIZED_FORMAT: Pcwstr = w("Ink Serialized Format")

public val IOAM_BEHIND: InkOverlayAttachMode = 0

public val IOAM_IN_FRONT: InkOverlayAttachMode = 1

public val IOEM_DELETE: InkOverlayEditingMode = 1

public val IOEM_INK: InkOverlayEditingMode = 0

public val IOEM_SELECT: InkOverlayEditingMode = 2

public val IOERM_POINT_ERASE: InkOverlayEraserMode = 1

public val IOERM_STROKE_ERASE: InkOverlayEraserMode = 0

public val IPCM_DEFAULT: InkPersistenceCompressionMode = 0

public val IPCM_MAXIMUM_COMPRESSION: InkPersistenceCompressionMode = 1

public val IPCM_NO_COMPRESSION: InkPersistenceCompressionMode = 2

public val IPF_BASE64GIF: InkPersistenceFormat = 3

public val IPF_BASE64INK_SERIALIZED_FORMAT: InkPersistenceFormat = 1

public val IPF_GIF: InkPersistenceFormat = 2

public val IPF_INK_SERIALIZED_FORMAT: InkPersistenceFormat = 0

public val IPSM_AUTO_SIZE: InkPictureSizeMode = 0

public val IPSM_CENTER_IMAGE: InkPictureSizeMode = 1

public val IPSM_NORMAL: InkPictureSizeMode = 2

public val IPSM_STRETCH_IMAGE: InkPictureSizeMode = 3

public val IPT_BALL: InkPenTip = 0

public val IPT_RECTANGLE: InkPenTip = 1

public val IP_CURSOR_DOWN: UInt = 1u

public val IP_INVERTED: UInt = 2u

public val IP_MARGIN: UInt = 4u

public val IRAS_ALL: InkRecognitionAlternatesSelection = -1

public val IRAS_DEFAULT_COUNT: InkRecognitionAlternatesSelection = 10

public val IRAS_START: InkRecognitionAlternatesSelection = 0

public val IRCACM_FULL: InkRecognizerCharacterAutoCompletionMode = 0

public val IRCACM_PREFIX: InkRecognizerCharacterAutoCompletionMode = 1

public val IRCACM_RANDOM: InkRecognizerCharacterAutoCompletionMode = 2

public val IRC_ADVISE_INK_CHANGE: InkRecognizerCapabilities = 4096

public val IRC_ALPHA: InkRecognizerCapabilities = 1048576

public val IRC_ARBITRARY_ANGLE: InkRecognizerCapabilities = 1024

public val IRC_BETA: InkRecognizerCapabilities = 2097152

public val IRC_BOXED_INPUT: InkRecognizerCapabilities = 16

public val IRC_CHARACTER_AUTO_COMPLETION_INPUT: InkRecognizerCapabilities = 32

public val IRC_CURSIVE: InkRecognizerCapabilities = 262144

public val IRC_DONT_CARE: InkRecognizerCapabilities = 1

public val IRC_DOWN_AND_LEFT: InkRecognizerCapabilities = 256

public val IRC_DOWN_AND_RIGHT: InkRecognizerCapabilities = 512

public val IRC_FREE_INPUT: InkRecognizerCapabilities = 4

public val IRC_INTERMEDIATE: InkRecognitionConfidence = 1

public val IRC_LATTICE: InkRecognizerCapabilities = 2048

public val IRC_LEFT_AND_DOWN: InkRecognizerCapabilities = 128

public val IRC_LINED_INPUT: InkRecognizerCapabilities = 8

public val IRC_OBJECT: InkRecognizerCapabilities = 2

public val IRC_PERSONALIZABLE: InkRecognizerCapabilities = 16384

public val IRC_POOR: InkRecognitionConfidence = 2

public val IRC_PREFERS_ARBITRARY_ANGLE: InkRecognizerCapabilities = 32768

public val IRC_PREFERS_PARAGRAPH_BREAKING: InkRecognizerCapabilities = 65536

public val IRC_PREFERS_SEGMENTATION: InkRecognizerCapabilities = 131072

public val IRC_RIGHT_AND_DOWN: InkRecognizerCapabilities = 64

public val IRC_STROKE_REORDER: InkRecognizerCapabilities = 8192

public val IRC_STRONG: InkRecognitionConfidence = 0

public val IRC_TEXT_PREDICTION: InkRecognizerCapabilities = 524288

public val IRM_AUTO_SPACE: InkRecognitionModes = 64

public val IRM_COERCE: InkRecognitionModes = 2

public val IRM_DISABLE_PERSONALIZATION: InkRecognitionModes = 32

public val IRM_LINE_MODE: InkRecognitionModes = 16

public val IRM_MAX: InkRecognitionModes = 128

public val IRM_NONE: InkRecognitionModes = 0

public val IRM_PREFIX_OK: InkRecognitionModes = 8

public val IRM_TOP_INK_BREAKS_ONLY: InkRecognitionModes = 4

public val IRM_WORD_MODE_ONLY: InkRecognitionModes = 1

public val IRO_BLACK: InkRasterOperation = 1

public val IRO_COPY_PEN: InkRasterOperation = 13

public val IRO_MASK_NOT_PEN: InkRasterOperation = 3

public val IRO_MASK_PEN: InkRasterOperation = 9

public val IRO_MASK_PEN_NOT: InkRasterOperation = 5

public val IRO_MERGE_NOT_PEN: InkRasterOperation = 12

public val IRO_MERGE_PEN: InkRasterOperation = 15

public val IRO_MERGE_PEN_NOT: InkRasterOperation = 14

public val IRO_NO_OPERATION: InkRasterOperation = 11

public val IRO_NOT: InkRasterOperation = 6

public val IRO_NOT_COPY_PEN: InkRasterOperation = 4

public val IRO_NOT_MASK_PEN: InkRasterOperation = 8

public val IRO_NOT_MERGE_PEN: InkRasterOperation = 2

public val IRO_NOT_X_OR_PEN: InkRasterOperation = 10

public val IRO_WHITE: InkRasterOperation = 16

public val IRO_X_OR_PEN: InkRasterOperation = 7

public val IRS_INK_ADDED_FAILED: InkRecognitionStatus = 4

public val IRS_INTERRUPTED: InkRecognitionStatus = 1

public val IRS_NO_ERROR: InkRecognitionStatus = 0

public val IRS_PROCESS_FAILED: InkRecognitionStatus = 2

public val IRS_SET_AUTO_COMPLETION_MODE_FAILED: InkRecognitionStatus = 8

public val IRS_SET_FACTOID_FAILED: InkRecognitionStatus = 128

public val IRS_SET_FLAGS_FAILED: InkRecognitionStatus = 64

public val IRS_SET_GUIDE_FAILED: InkRecognitionStatus = 32

public val IRS_SET_PREFIX_SUFFIX_FAILED: InkRecognitionStatus = 256

public val IRS_SET_STROKES_FAILED: InkRecognitionStatus = 16

public val IRS_SET_WORD_LIST_FAILED: InkRecognitionStatus = 512

public val ISC_ALL_ELEMENTS: InkSelectionConstants = -1

public val ISC_FIRST_ELEMENT: InkSelectionConstants = 0

public val ISG_DOUBLE_TAP: InkSystemGesture = 17

public val ISG_DRAG: InkSystemGesture = 19

public val ISG_FLICK: InkSystemGesture = 31

public val ISG_HOLD_ENTER: InkSystemGesture = 21

public val ISG_HOLD_LEAVE: InkSystemGesture = 22

public val ISG_HOVER_ENTER: InkSystemGesture = 23

public val ISG_HOVER_LEAVE: InkSystemGesture = 24

public val ISG_RIGHT_DRAG: InkSystemGesture = 20

public val ISG_RIGHT_TAP: InkSystemGesture = 18

public val ISG_TAP: InkSystemGesture = 16

public val IN_PLACE: VisualState = 0

public val IN_PLACE_DIRECTION_AUTO: InPlaceDirection = 0

public val IN_PLACE_DIRECTION_BOTTOM: InPlaceDirection = 1

public val IN_PLACE_DIRECTION_TOP: InPlaceDirection = 2

public val IN_PLACE_STATE_AUTO: InPlaceState = 0

public val IN_PLACE_STATE_EXPANDED: InPlaceState = 2

public val IN_PLACE_STATE_HOVER_TARGET: InPlaceState = 1

public val INK: Guid = Guid.fromU128(U128(0x13de4a428d214c8euL, 0xbf9c8f69cb068fcauL))

public val INK_COLLECTOR: Guid = Guid.fromU128(U128(0x43fb1553ad744ee8uL, 0x88e43e6daac915dbuL))

public val INK_COLLECTOR_CLIP_INK_TO_MARGIN: Int = 0

public val INK_COLLECTOR_DEFAULT_MARGIN: Int = -2147483648.toInt()

public val INK_DISP: Guid = Guid.fromU128(U128(0x937c1a34151d4610uL, 0x9ca6a8cc9bdb5d83uL))

public val INK_DIVIDER: Guid = Guid.fromU128(U128(0x8854f6a046834ae7uL, 0x9191752fe64612c3uL))

public val INK_DRAWING_ATTRIBUTES: Guid = Guid.fromU128(U128(0xd8bf32a205a544c3uL, 0xb3aa5e80ac7d2576uL))

public val INK_EDIT: Guid = Guid.fromU128(U128(0xe5ca59f557c44dd8uL, 0x9bd61deeedd27af4uL))

public val INK_MAX_TRANSPARENCY_VALUE: Int = 255

public val INK_MIN_TRANSPARENCY_VALUE: Int = 0

public val INK_OVERLAY: Guid = Guid.fromU128(U128(0x65d00646cde34a88uL, 0x91636769f0f1a97duL))

public val INK_PICTURE: Guid = Guid.fromU128(U128(0x4a1e553fe364fdeuL, 0x865e344194e69424uL))

public val INK_RECOGNIZER_CONTEXT: Guid = Guid.fromU128(U128(0xaac46a3792294fc0uL, 0x8cce4497569bf4d1uL))

public val INK_RECOGNIZER_GUIDE: Guid = Guid.fromU128(U128(0x8770d941a63a4671uL, 0xa3752855a18eba73uL))

public val INK_RECOGNIZERS: Guid = Guid.fromU128(U128(0x9fd4e808f6e64e65uL, 0x98d3aa39054c1255uL))

public val INK_RECTANGLE: Guid = Guid.fromU128(U128(0x43b07326aae04b62uL, 0xa83d5fd768b7353cuL))

public val INK_RENDERER: Guid = Guid.fromU128(U128(0x9c1cc6e4d7eb4eebuL, 0x909115a7c8791ed9uL))

public val INK_STROKES: Guid = Guid.fromU128(U128(0x48f491bc240e4860uL, 0xb079a1e94d3d2c86uL))

public val INK_TABLETS: Guid = Guid.fromU128(U128(0x6e4fcb12510a4d40uL, 0x93041da10ae9147cuL))

public val INK_TRANSFORM: Guid = Guid.fromU128(U128(0xe3d5d93c16634a78uL, 0xa1a722375dfebaeeuL))

public val INK_WORD_LIST: Guid = Guid.fromU128(U128(0x9de85094f71f44f1uL, 0x847115a2fa76fcf3uL))

public val INTERACTION_MODE_DOCKED_BOTTOM: InteractionMode = 3

public val INTERACTION_MODE_DOCKED_TOP: InteractionMode = 2

public val INTERACTION_MODE_FLOATING: InteractionMode = 1

public val INTERACTION_MODE_IN_PLACE: InteractionMode = 0

public val KEYMODIFIER_ALTGR: Keymodifier = 16

public val KEYMODIFIER_CONTROL: Keymodifier = 1

public val KEYMODIFIER_EXT: Keymodifier = 32

public val KEYMODIFIER_MENU: Keymodifier = 2

public val KEYMODIFIER_SHIFT: Keymodifier = 4

public val KEYMODIFIER_WIN: Keymodifier = 8

public val LEFT_BUTTON: MouseButton = 1

public val LM_ASCENDER: LineMetrics = 2

public val LM_BASELINE: LineMetrics = 0

public val LM_DESCENDER: LineMetrics = 3

public val LM_MIDLINE: LineMetrics = 1

public val MAX_FRIENDLYNAME: UInt = 64u

public val MAX_LANGUAGES: UInt = 64u

public val MAX_PACKET_BUTTON_COUNT: UInt = 32u

public val MAX_PACKET_PROPERTY_COUNT: UInt = 32u

public val MAX_VENDORNAME: UInt = 32u

public val MICROSOFT_PENINPUT_PANEL_PROPERTY_T: Pcwstr = w("Microsoft PenInputPanel 1.5")

public val MICROSOFT_TIP_COMBOBOXLIST_PROPERTY: Pcwstr = w("Microsoft TIP ComboBox List Window Identifier")

public val MICROSOFT_TIP_NO_INSERT_BUTTON_PROPERTY: Pcwstr = w("Microsoft TIP No Insert Option")

public val MICROSOFT_TIP_OPENING_MSG: Pcwstr = w("TabletInputPanelOpening")

public val MICROSOFT_URL_EXPERIENCE_PROPERTY: Pcwstr = w("Microsoft TIP URL Experience")

public val MICUIELEMENTSTATE_DISABLED: Micuielementstate = 4

public val MICUIELEMENTSTATE_HOT: Micuielementstate = 2

public val MICUIELEMENTSTATE_NORMAL: Micuielementstate = 1

public val MICUIELEMENTSTATE_PRESSED: Micuielementstate = 3

public val MICUIELEMENT_BUTTON_CANCEL: Micuielement = 128

public val MICUIELEMENT_BUTTON_CLEAR: Micuielement = 8

public val MICUIELEMENT_BUTTON_CORRECT: Micuielement = 4

public val MICUIELEMENT_BUTTON_ERASE: Micuielement = 2

public val MICUIELEMENT_BUTTON_INSERT: Micuielement = 64

public val MICUIELEMENT_BUTTON_REDO: Micuielement = 32

public val MICUIELEMENT_BUTTON_UNDO: Micuielement = 16

public val MICUIELEMENT_BUTTON_WRITE: Micuielement = 1

public val MICUIELEMENT_INKPANEL_BACKGROUND: Micuielement = 256

public val MICUIELEMENT_RESULTPANEL_BACKGROUND: Micuielement = 512

public val MIDDLE_BUTTON: MouseButton = 4

public val MATH_INPUT_CONTROL: Guid = Guid.fromU128(U128(0xc561816c14d84090uL, 0x830c98d994b21c7buL))

public val NO_BUTTON: MouseButton = 0

public val NUM_FLICK_DIRECTIONS: UInt = 8u

public val PROPERTY_UNITS_AMPERE: PropertyUnits = 15

public val PROPERTY_UNITS_CANDELA: PropertyUnits = 16

public val PROPERTY_UNITS_CENTIMETERS: PropertyUnits = 2

public val PROPERTY_UNITS_DEFAULT: PropertyUnits = 0

public val PROPERTY_UNITS_DEGREES: PropertyUnits = 3

public val PROPERTY_UNITS_ENGLINEAR: PropertyUnits = 10

public val PROPERTY_UNITS_ENGROTATION: PropertyUnits = 11

public val PROPERTY_UNITS_FAHRENHEIT: PropertyUnits = 14

public val PROPERTY_UNITS_GRAMS: PropertyUnits = 7

public val PROPERTY_UNITS_INCHES: PropertyUnits = 1

public val PROPERTY_UNITS_KELVIN: PropertyUnits = 13

public val PROPERTY_UNITS_POUNDS: PropertyUnits = 6

public val PROPERTY_UNITS_RADIANS: PropertyUnits = 4

public val PROPERTY_UNITS_SECONDS: PropertyUnits = 5

public val PROPERTY_UNITS_SILINEAR: PropertyUnits = 8

public val PROPERTY_UNITS_SIROTATION: PropertyUnits = 9

public val PROPERTY_UNITS_SLUGS: PropertyUnits = 12

public val PT_DEFAULT: PanelType = 0

public val PT_HANDWRITING: PanelType = 2

public val PT_INACTIVE: PanelType = 1

public val PT_KEYBOARD: PanelType = 3

public val PANEL_INPUT_AREA_AUTO: PanelInputArea = 0

public val PANEL_INPUT_AREA_CHARACTER_PAD: PanelInputArea = 3

public val PANEL_INPUT_AREA_KEYBOARD: PanelInputArea = 1

public val PANEL_INPUT_AREA_WRITING_PAD: PanelInputArea = 2

public val PEN_INPUT_PANEL: Guid = Guid.fromU128(U128(0xf744e4961b5a489euL, 0x81dcfbd7ac6298a8uL))

public val PEN_INPUT_PANEL_INTERNAL: Guid = Guid.fromU128(U128(0x802b1fb9056b4720uL, 0xb0cc80d23b71171euL))

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

public val RECO_TYPE_WCHAR: RecoType = 1

public val RECO_TYPE_WSTRING: RecoType = 0

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

public val RTSDI_ALL_DATA: RealTimeStylusDataInterest = -1

public val RTSDI_CUSTOM_STYLUS_DATA_ADDED: RealTimeStylusDataInterest = 32768

public val RTSDI_DEFAULT_EVENTS: RealTimeStylusDataInterest = 37766

public val RTSDI_ERROR: RealTimeStylusDataInterest = 1

public val RTSDI_IN_AIR_PACKETS: RealTimeStylusDataInterest = 32

public val RTSDI_NONE: RealTimeStylusDataInterest = 0

public val RTSDI_PACKETS: RealTimeStylusDataInterest = 256

public val RTSDI_REAL_TIME_STYLUS_DISABLED: RealTimeStylusDataInterest = 4

public val RTSDI_REAL_TIME_STYLUS_ENABLED: RealTimeStylusDataInterest = 2

public val RTSDI_STYLUS_BUTTON_DOWN: RealTimeStylusDataInterest = 2048

public val RTSDI_STYLUS_BUTTON_UP: RealTimeStylusDataInterest = 1024

public val RTSDI_STYLUS_DOWN: RealTimeStylusDataInterest = 128

public val RTSDI_STYLUS_IN_RANGE: RealTimeStylusDataInterest = 16

public val RTSDI_STYLUS_NEW: RealTimeStylusDataInterest = 8

public val RTSDI_STYLUS_OUT_OF_RANGE: RealTimeStylusDataInterest = 64

public val RTSDI_STYLUS_UP: RealTimeStylusDataInterest = 512

public val RTSDI_SYSTEM_EVENTS: RealTimeStylusDataInterest = 4096

public val RTSDI_TABLET_ADDED: RealTimeStylusDataInterest = 8192

public val RTSDI_TABLET_REMOVED: RealTimeStylusDataInterest = 16384

public val RTSDI_UPDATE_MAPPING: RealTimeStylusDataInterest = 65536

public val RTSLT_ASYNC_EVENT_LOCK: RealTimeStylusLockType = 4

public val RTSLT_ASYNC_OBJ_LOCK: RealTimeStylusLockType = 13

public val RTSLT_EXCLUDE_CALLBACK: RealTimeStylusLockType = 8

public val RTSLT_OBJ_LOCK: RealTimeStylusLockType = 1

public val RTSLT_SYNC_EVENT_LOCK: RealTimeStylusLockType = 2

public val RTSLT_SYNC_OBJ_LOCK: RealTimeStylusLockType = 11

public val REAL_TIME_STYLUS: Guid = Guid.fromU128(U128(0xe26b366df99843ceuL, 0x836fcb6d904432b0uL))

public val SAFE_PARTIAL: UInt = 1u

public val SCROLLDIRECTION_DOWN: Scrolldirection = 1

public val SCROLLDIRECTION_UP: Scrolldirection = 0

public val SHR_E: SelectionHitResult = 5

public val SHR_N: SelectionHitResult = 7

public val SHR_NE: SelectionHitResult = 3

public val SHR_NW: SelectionHitResult = 1

public val SHR_NONE: SelectionHitResult = 0

public val SHR_S: SelectionHitResult = 8

public val SHR_SE: SelectionHitResult = 2

public val SHR_SW: SelectionHitResult = 4

public val SHR_SELECTION: SelectionHitResult = 9

public val SHR_W: SelectionHitResult = 6

public val STR_GUID_ALTITUDEORIENTATION: Pcwstr = w("{82DEC5C7-F6BA-4906-894F-66D68DFC456C}")

public val STR_GUID_AZIMUTHORIENTATION: Pcwstr = w("{029123B4-8828-410B-B250-A0536595E5DC}")

public val STR_GUID_BUTTONPRESSURE: Pcwstr = w("{8B7FEFC4-96AA-4BFE-AC26-8A5F0BE07BF5}")

public val STR_GUID_DEVICE_CONTACT_ID: Pcwstr = w("{02585B91-049B-4750-9615-DF8948AB3C9C}")

public val STR_GUID_FINGERCONTACTCONFIDENCE: Pcwstr = w("{E706C804-57F0-4F00-8A0C-853D57789BE9}")

public val STR_GUID_HEIGHT: Pcwstr = w("{E61858D2-E447-4218-9D3F-18865C203DF4}")

public val STR_GUID_NORMALPRESSURE: Pcwstr = w("{7307502D-F9F4-4E18-B3F2-2CE1B1A3610C}")

public val STR_GUID_PAKETSTATUS: Pcwstr = w("{6E0E07BF-AFE7-4CF7-87D1-AF6446208418}")

public val STR_GUID_PITCHROTATION: Pcwstr = w("{7F7E57B7-BE37-4BE1-A356-7A84160E1893}")

public val STR_GUID_ROLLROTATION: Pcwstr = w("{5D5D5E56-6BA9-4C5B-9FB0-851C91714E56}")

public val STR_GUID_SERIALNUMBER: Pcwstr = w("{78A81B56-0935-4493-BAAE-00541A8A16C4}")

public val STR_GUID_TANGENTPRESSURE: Pcwstr = w("{6DA4488B-5244-41EC-905B-32D89AB80809}")

public val STR_GUID_TIMERTICK: Pcwstr = w("{436510C5-FED3-45D1-8B76-71D3EA7A829D}")

public val STR_GUID_TWISTORIENTATION: Pcwstr = w("{0D324960-13B2-41E4-ACE6-7AE9D43D2D3B}")

public val STR_GUID_WIDTH: Pcwstr = w("{BAABE94D-2712-48F5-BE9D-8F8B5EA0711A}")

public val STR_GUID_X: Pcwstr = w("{598A6A8F-52C0-4BA0-93AF-AF357411A561}")

public val STR_GUID_XTILTORIENTATION: Pcwstr = w("{A8D07B3A-8BF0-40B0-95A9-B80A6BB787BF}")

public val STR_GUID_Y: Pcwstr = w("{B53F9F75-04E0-4498-A7EE-C30DBB5A9011}")

public val STR_GUID_YAWROTATION: Pcwstr = w("{6A849980-7C3A-45B7-AA82-90A262950E89}")

public val STR_GUID_YTILTORIENTATION: Pcwstr = w("{0E932389-1D77-43AF-AC00-5B950D6D4B2D}")

public val STR_GUID_Z: Pcwstr = w("{735ADB30-0EBB-4788-A0E4-0F316490055D}")

public val SKETCH_INK: Guid = Guid.fromU128(U128(0xf0291081e87c4e07uL, 0x97daa0a03761e586uL))

public val STROKE_BUILDER: Guid = Guid.fromU128(U128(0xe810cee76e514cb0uL, 0xaa3a0b985b70daf7uL))

public val SYNC_STYLUS_QUEUE: StylusQueue = 1

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

public val TCF_ALLOW_RECOGNITION: GetDandidateFlags = 1

public val TCF_FORCE_RECOGNITION: GetDandidateFlags = 2

public val TDK_MOUSE: TabletDeviceKind = 0

public val TDK_PEN: TabletDeviceKind = 1

public val TDK_TOUCH: TabletDeviceKind = 2

public val THWC_CURSOR_MUST_TOUCH: TabletHardwareCapabilities = 2

public val THWC_CURSORS_HAVE_PHYSICAL_IDS: TabletHardwareCapabilities = 8

public val THWC_HARD_PROXIMITY: TabletHardwareCapabilities = 4

public val THWC_INTEGRATED: TabletHardwareCapabilities = 1

public val TPMU_CENTIMETERS: TabletPropertyMetricUnit = 2

public val TPMU_DEFAULT: TabletPropertyMetricUnit = 0

public val TPMU_DEGREES: TabletPropertyMetricUnit = 3

public val TPMU_GRAMS: TabletPropertyMetricUnit = 7

public val TPMU_INCHES: TabletPropertyMetricUnit = 1

public val TPMU_POUNDS: TabletPropertyMetricUnit = 6

public val TPMU_RADIANS: TabletPropertyMetricUnit = 4

public val TPMU_SECONDS: TabletPropertyMetricUnit = 5

public val TEXT_INPUT_PANEL: Guid = Guid.fromU128(U128(0xf9b189d7228b4f2buL, 0x8650b97f59e02c8cuL))

public val TIP_AUTO_COMPLETE_CLIENT: Guid = Guid.fromU128(U128(0x807c1e6c1d00453fuL, 0xb920b61bb7cdd997uL))

public val WM_TABLET_ADDED: UInt = 712u

public val WM_TABLET_DEFBASE: UInt = 704u

public val WM_TABLET_DELETED: UInt = 713u

public val WM_TABLET_FLICK: UInt = 715u

public val WM_TABLET_MAXOFFSET: UInt = 32u

public val WM_TABLET_QUERYSYSTEMGESTURESTATUS: UInt = 716u

public val RTF_BOTH: ScrollBarsConstants = 3

public val RTF_CENTER: SelAlignmentConstants = 2

public val RTF_FIXED_SINGLE: BorderStyleConstants = 1

public val RTF_FLAT: AppearanceConstants = 0

public val RTF_HORIZONTAL: ScrollBarsConstants = 1

public val RTF_LEFT: SelAlignmentConstants = 0

public val RTF_NO_BORDER: BorderStyleConstants = 0

public val RTF_NONE: ScrollBarsConstants = 0

public val RTF_RIGHT: SelAlignmentConstants = 1

public val RTF_THREE_D: AppearanceConstants = 1

public val RTF_VERTICAL: ScrollBarsConstants = 2
