package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val ALPHA_SHIFT: UInt = 24u

public val ABORTED: Status = 9

public val ACCESS_DENIED: Status = 12

public val ADJUST_BLACK_SATURATION: CurveAdjustments = 7

public val ADJUST_CONTRAST: CurveAdjustments = 2

public val ADJUST_DENSITY: CurveAdjustments = 1

public val ADJUST_EXPOSURE: CurveAdjustments = 0

public val ADJUST_HIGHLIGHT: CurveAdjustments = 3

public val ADJUST_MIDTONE: CurveAdjustments = 5

public val ADJUST_SHADOW: CurveAdjustments = 4

public val ADJUST_WHITE_SATURATION: CurveAdjustments = 6

public val BLUE_SHIFT: UInt = 0u

public val BRUSH_TYPE_HATCH_FILL: BrushType = 1

public val BRUSH_TYPE_LINEAR_GRADIENT: BrushType = 4

public val BRUSH_TYPE_PATH_GRADIENT: BrushType = 3

public val BRUSH_TYPE_SOLID_COLOR: BrushType = 0

public val BRUSH_TYPE_TEXTURE_FILL: BrushType = 2

public val COLOR_ADJUST_TYPE_ANY: ColorAdjustType = 6

public val COLOR_ADJUST_TYPE_BITMAP: ColorAdjustType = 1

public val COLOR_ADJUST_TYPE_BRUSH: ColorAdjustType = 2

public val COLOR_ADJUST_TYPE_COUNT: ColorAdjustType = 5

public val COLOR_ADJUST_TYPE_DEFAULT: ColorAdjustType = 0

public val COLOR_ADJUST_TYPE_PEN: ColorAdjustType = 3

public val COLOR_ADJUST_TYPE_TEXT: ColorAdjustType = 4

public val COLOR_CHANNEL_FLAGS_C: ColorChannelFlags = 0

public val COLOR_CHANNEL_FLAGS_K: ColorChannelFlags = 3

public val COLOR_CHANNEL_FLAGS_LAST: ColorChannelFlags = 4

public val COLOR_CHANNEL_FLAGS_M: ColorChannelFlags = 1

public val COLOR_CHANNEL_FLAGS_Y: ColorChannelFlags = 2

public val COLOR_MATRIX_FLAGS_ALT_GRAY: ColorMatrixFlags = 2

public val COLOR_MATRIX_FLAGS_DEFAULT: ColorMatrixFlags = 0

public val COLOR_MATRIX_FLAGS_SKIP_GRAYS: ColorMatrixFlags = 1

public val COLOR_MODE_ARGB32: ColorMode = 0

public val COLOR_MODE_ARGB64: ColorMode = 1

public val COMBINE_MODE_COMPLEMENT: CombineMode = 5

public val COMBINE_MODE_EXCLUDE: CombineMode = 4

public val COMBINE_MODE_INTERSECT: CombineMode = 1

public val COMBINE_MODE_REPLACE: CombineMode = 0

public val COMBINE_MODE_UNION: CombineMode = 2

public val COMBINE_MODE_XOR: CombineMode = 3

public val COMPOSITING_MODE_SOURCE_COPY: CompositingMode = 1

public val COMPOSITING_MODE_SOURCE_OVER: CompositingMode = 0

public val COMPOSITING_QUALITY_ASSUME_LINEAR: CompositingQuality = 4

public val COMPOSITING_QUALITY_DEFAULT: CompositingQuality = 0

public val COMPOSITING_QUALITY_GAMMA_CORRECTED: CompositingQuality = 3

public val COMPOSITING_QUALITY_HIGH_QUALITY: CompositingQuality = 2

public val COMPOSITING_QUALITY_HIGH_SPEED: CompositingQuality = 1

public val COMPOSITING_QUALITY_INVALID: CompositingQuality = -1

public val CONVERT_TO_EMF_PLUS_FLAGS_DEFAULT: ConvertToEmfPlusFlags = 0

public val CONVERT_TO_EMF_PLUS_FLAGS_INVALID_RECORD: ConvertToEmfPlusFlags = 4

public val CONVERT_TO_EMF_PLUS_FLAGS_ROP_USED: ConvertToEmfPlusFlags = 1

public val CONVERT_TO_EMF_PLUS_FLAGS_TEXT: ConvertToEmfPlusFlags = 2

public val COORDINATE_SPACE_DEVICE: CoordinateSpace = 2

public val COORDINATE_SPACE_PAGE: CoordinateSpace = 1

public val COORDINATE_SPACE_WORLD: CoordinateSpace = 0

public val CURVE_CHANNEL_ALL: CurveChannel = 0

public val CURVE_CHANNEL_BLUE: CurveChannel = 3

public val CURVE_CHANNEL_GREEN: CurveChannel = 2

public val CURVE_CHANNEL_RED: CurveChannel = 1

public val CUSTOM_LINE_CAP_TYPE_ADJUSTABLE_ARROW: CustomLineCapType = 1

public val CUSTOM_LINE_CAP_TYPE_DEFAULT: CustomLineCapType = 0

public val DASH_CAP_FLAT: DashCap = 0

public val DASH_CAP_ROUND: DashCap = 2

public val DASH_CAP_TRIANGLE: DashCap = 3

public val DASH_STYLE_CUSTOM: DashStyle = 5

public val DASH_STYLE_DASH: DashStyle = 1

public val DASH_STYLE_DASH_DOT: DashStyle = 3

public val DASH_STYLE_DASH_DOT_DOT: DashStyle = 4

public val DASH_STYLE_DOT: DashStyle = 2

public val DASH_STYLE_SOLID: DashStyle = 0

public val DEBUG_EVENT_LEVEL_FATAL: DebugEventLevel = 0

public val DEBUG_EVENT_LEVEL_WARNING: DebugEventLevel = 1

public val DITHER_TYPE_DUAL_SPIRAL4X4: DitherType = 7

public val DITHER_TYPE_DUAL_SPIRAL8X8: DitherType = 8

public val DITHER_TYPE_ERROR_DIFFUSION: DitherType = 9

public val DITHER_TYPE_MAX: DitherType = 10

public val DITHER_TYPE_NONE: DitherType = 0

public val DITHER_TYPE_ORDERED16X16: DitherType = 4

public val DITHER_TYPE_ORDERED4X4: DitherType = 2

public val DITHER_TYPE_ORDERED8X8: DitherType = 3

public val DITHER_TYPE_SOLID: DitherType = 1

public val DITHER_TYPE_SPIRAL4X4: DitherType = 5

public val DITHER_TYPE_SPIRAL8X8: DitherType = 6

public val DRIVER_STRING_OPTIONS_CMAP_LOOKUP: DriverStringOptions = 1

public val DRIVER_STRING_OPTIONS_LIMIT_SUBPIXEL: DriverStringOptions = 8

public val DRIVER_STRING_OPTIONS_REALIZED_ADVANCE: DriverStringOptions = 4

public val DRIVER_STRING_OPTIONS_VERTICAL: DriverStringOptions = 2

public val EMF_PLUS_RECORD_TOTAL: EmfPlusRecordType = 16443

public val EMF_PLUS_RECORD_TYPE_BEGIN_CONTAINER: EmfPlusRecordType = 16423

public val EMF_PLUS_RECORD_TYPE_BEGIN_CONTAINER_NO_PARAMS: EmfPlusRecordType = 16424

public val EMF_PLUS_RECORD_TYPE_CLEAR: EmfPlusRecordType = 16393

public val EMF_PLUS_RECORD_TYPE_COMMENT: EmfPlusRecordType = 16387

public val EMF_PLUS_RECORD_TYPE_DRAW_ARC: EmfPlusRecordType = 16402

public val EMF_PLUS_RECORD_TYPE_DRAW_BEZIERS: EmfPlusRecordType = 16409

public val EMF_PLUS_RECORD_TYPE_DRAW_CLOSED_CURVE: EmfPlusRecordType = 16407

public val EMF_PLUS_RECORD_TYPE_DRAW_CURVE: EmfPlusRecordType = 16408

public val EMF_PLUS_RECORD_TYPE_DRAW_DRIVER_STRING: EmfPlusRecordType = 16438

public val EMF_PLUS_RECORD_TYPE_DRAW_ELLIPSE: EmfPlusRecordType = 16399

public val EMF_PLUS_RECORD_TYPE_DRAW_IMAGE: EmfPlusRecordType = 16410

public val EMF_PLUS_RECORD_TYPE_DRAW_IMAGE_POINTS: EmfPlusRecordType = 16411

public val EMF_PLUS_RECORD_TYPE_DRAW_LINES: EmfPlusRecordType = 16397

public val EMF_PLUS_RECORD_TYPE_DRAW_PATH: EmfPlusRecordType = 16405

public val EMF_PLUS_RECORD_TYPE_DRAW_PIE: EmfPlusRecordType = 16401

public val EMF_PLUS_RECORD_TYPE_DRAW_RECTS: EmfPlusRecordType = 16395

public val EMF_PLUS_RECORD_TYPE_DRAW_STRING: EmfPlusRecordType = 16412

public val EMF_PLUS_RECORD_TYPE_END_CONTAINER: EmfPlusRecordType = 16425

public val EMF_PLUS_RECORD_TYPE_END_OF_FILE: EmfPlusRecordType = 16386

public val EMF_PLUS_RECORD_TYPE_FILL_CLOSED_CURVE: EmfPlusRecordType = 16406

public val EMF_PLUS_RECORD_TYPE_FILL_ELLIPSE: EmfPlusRecordType = 16398

public val EMF_PLUS_RECORD_TYPE_FILL_PATH: EmfPlusRecordType = 16404

public val EMF_PLUS_RECORD_TYPE_FILL_PIE: EmfPlusRecordType = 16400

public val EMF_PLUS_RECORD_TYPE_FILL_POLYGON: EmfPlusRecordType = 16396

public val EMF_PLUS_RECORD_TYPE_FILL_RECTS: EmfPlusRecordType = 16394

public val EMF_PLUS_RECORD_TYPE_FILL_REGION: EmfPlusRecordType = 16403

public val EMF_PLUS_RECORD_TYPE_GET_DC: EmfPlusRecordType = 16388

public val EMF_PLUS_RECORD_TYPE_HEADER: EmfPlusRecordType = 16385

public val EMF_PLUS_RECORD_TYPE_INVALID: EmfPlusRecordType = 16384

public val EMF_PLUS_RECORD_TYPE_MAX: EmfPlusRecordType = 16442

public val EMF_PLUS_RECORD_TYPE_MIN: EmfPlusRecordType = 16385

public val EMF_PLUS_RECORD_TYPE_MULTI_FORMAT_END: EmfPlusRecordType = 16391

public val EMF_PLUS_RECORD_TYPE_MULTI_FORMAT_SECTION: EmfPlusRecordType = 16390

public val EMF_PLUS_RECORD_TYPE_MULTI_FORMAT_START: EmfPlusRecordType = 16389

public val EMF_PLUS_RECORD_TYPE_MULTIPLY_WORLD_TRANSFORM: EmfPlusRecordType = 16428

public val EMF_PLUS_RECORD_TYPE_OBJECT: EmfPlusRecordType = 16392

public val EMF_PLUS_RECORD_TYPE_OFFSET_CLIP: EmfPlusRecordType = 16437

public val EMF_PLUS_RECORD_TYPE_RESET_CLIP: EmfPlusRecordType = 16433

public val EMF_PLUS_RECORD_TYPE_RESET_WORLD_TRANSFORM: EmfPlusRecordType = 16427

public val EMF_PLUS_RECORD_TYPE_RESTORE: EmfPlusRecordType = 16422

public val EMF_PLUS_RECORD_TYPE_ROTATE_WORLD_TRANSFORM: EmfPlusRecordType = 16431

public val EMF_PLUS_RECORD_TYPE_SAVE: EmfPlusRecordType = 16421

public val EMF_PLUS_RECORD_TYPE_SCALE_WORLD_TRANSFORM: EmfPlusRecordType = 16430

public val EMF_PLUS_RECORD_TYPE_SERIALIZABLE_OBJECT: EmfPlusRecordType = 16440

public val EMF_PLUS_RECORD_TYPE_SET_ANTI_ALIAS_MODE: EmfPlusRecordType = 16414

public val EMF_PLUS_RECORD_TYPE_SET_CLIP_PATH: EmfPlusRecordType = 16435

public val EMF_PLUS_RECORD_TYPE_SET_CLIP_RECT: EmfPlusRecordType = 16434

public val EMF_PLUS_RECORD_TYPE_SET_CLIP_REGION: EmfPlusRecordType = 16436

public val EMF_PLUS_RECORD_TYPE_SET_COMPOSITING_MODE: EmfPlusRecordType = 16419

public val EMF_PLUS_RECORD_TYPE_SET_COMPOSITING_QUALITY: EmfPlusRecordType = 16420

public val EMF_PLUS_RECORD_TYPE_SET_INTERPOLATION_MODE: EmfPlusRecordType = 16417

public val EMF_PLUS_RECORD_TYPE_SET_PAGE_TRANSFORM: EmfPlusRecordType = 16432

public val EMF_PLUS_RECORD_TYPE_SET_PIXEL_OFFSET_MODE: EmfPlusRecordType = 16418

public val EMF_PLUS_RECORD_TYPE_SET_RENDERING_ORIGIN: EmfPlusRecordType = 16413

public val EMF_PLUS_RECORD_TYPE_SET_TS_CLIP: EmfPlusRecordType = 16442

public val EMF_PLUS_RECORD_TYPE_SET_TS_GRAPHICS: EmfPlusRecordType = 16441

public val EMF_PLUS_RECORD_TYPE_SET_TEXT_CONTRAST: EmfPlusRecordType = 16416

public val EMF_PLUS_RECORD_TYPE_SET_TEXT_RENDERING_HINT: EmfPlusRecordType = 16415

public val EMF_PLUS_RECORD_TYPE_SET_WORLD_TRANSFORM: EmfPlusRecordType = 16426

public val EMF_PLUS_RECORD_TYPE_STROKE_FILL_PATH: EmfPlusRecordType = 16439

public val EMF_PLUS_RECORD_TYPE_TRANSLATE_WORLD_TRANSFORM: EmfPlusRecordType = 16429

public val EMF_RECORD_TYPE_ABORT_PATH: EmfPlusRecordType = 68

public val EMF_RECORD_TYPE_ALPHA_BLEND: EmfPlusRecordType = 114

public val EMF_RECORD_TYPE_ANGLE_ARC: EmfPlusRecordType = 41

public val EMF_RECORD_TYPE_ARC: EmfPlusRecordType = 45

public val EMF_RECORD_TYPE_ARC_TO: EmfPlusRecordType = 55

public val EMF_RECORD_TYPE_BEGIN_PATH: EmfPlusRecordType = 59

public val EMF_RECORD_TYPE_BIT_BLT: EmfPlusRecordType = 76

public val EMF_RECORD_TYPE_CHORD: EmfPlusRecordType = 46

public val EMF_RECORD_TYPE_CLOSE_FIGURE: EmfPlusRecordType = 61

public val EMF_RECORD_TYPE_COLOR_CORRECT_PALETTE: EmfPlusRecordType = 111

public val EMF_RECORD_TYPE_COLOR_MATCH_TO_TARGET_W: EmfPlusRecordType = 121

public val EMF_RECORD_TYPE_CREATE_BRUSH_INDIRECT: EmfPlusRecordType = 39

public val EMF_RECORD_TYPE_CREATE_COLOR_SPACE: EmfPlusRecordType = 99

public val EMF_RECORD_TYPE_CREATE_COLOR_SPACE_W: EmfPlusRecordType = 122

public val EMF_RECORD_TYPE_CREATE_DIB_PATTERN_BRUSH_PT: EmfPlusRecordType = 94

public val EMF_RECORD_TYPE_CREATE_MONO_BRUSH: EmfPlusRecordType = 93

public val EMF_RECORD_TYPE_CREATE_PALETTE: EmfPlusRecordType = 49

public val EMF_RECORD_TYPE_CREATE_PEN: EmfPlusRecordType = 38

public val EMF_RECORD_TYPE_DELETE_COLOR_SPACE: EmfPlusRecordType = 101

public val EMF_RECORD_TYPE_DELETE_OBJECT: EmfPlusRecordType = 40

public val EMF_RECORD_TYPE_DRAW_ESCAPE: EmfPlusRecordType = 105

public val EMF_RECORD_TYPE_EOF: EmfPlusRecordType = 14

public val EMF_RECORD_TYPE_ELLIPSE: EmfPlusRecordType = 42

public val EMF_RECORD_TYPE_END_PATH: EmfPlusRecordType = 60

public val EMF_RECORD_TYPE_EXCLUDE_CLIP_RECT: EmfPlusRecordType = 29

public val EMF_RECORD_TYPE_EXT_CREATE_FONT_INDIRECT: EmfPlusRecordType = 82

public val EMF_RECORD_TYPE_EXT_CREATE_PEN: EmfPlusRecordType = 95

public val EMF_RECORD_TYPE_EXT_ESCAPE: EmfPlusRecordType = 106

public val EMF_RECORD_TYPE_EXT_FLOOD_FILL: EmfPlusRecordType = 53

public val EMF_RECORD_TYPE_EXT_SELECT_CLIP_RGN: EmfPlusRecordType = 75

public val EMF_RECORD_TYPE_EXT_TEXT_OUT_A: EmfPlusRecordType = 83

public val EMF_RECORD_TYPE_EXT_TEXT_OUT_W: EmfPlusRecordType = 84

public val EMF_RECORD_TYPE_FILL_PATH: EmfPlusRecordType = 62

public val EMF_RECORD_TYPE_FILL_RGN: EmfPlusRecordType = 71

public val EMF_RECORD_TYPE_FLATTEN_PATH: EmfPlusRecordType = 65

public val EMF_RECORD_TYPE_FORCE_UFI_MAPPING: EmfPlusRecordType = 109

public val EMF_RECORD_TYPE_FRAME_RGN: EmfPlusRecordType = 72

public val EMF_RECORD_TYPE_GLS_BOUNDED_RECORD: EmfPlusRecordType = 103

public val EMF_RECORD_TYPE_GLS_RECORD: EmfPlusRecordType = 102

public val EMF_RECORD_TYPE_GDI_COMMENT: EmfPlusRecordType = 70

public val EMF_RECORD_TYPE_GRADIENT_FILL: EmfPlusRecordType = 118

public val EMF_RECORD_TYPE_HEADER: EmfPlusRecordType = 1

public val EMF_RECORD_TYPE_INTERSECT_CLIP_RECT: EmfPlusRecordType = 30

public val EMF_RECORD_TYPE_INVERT_RGN: EmfPlusRecordType = 73

public val EMF_RECORD_TYPE_LINE_TO: EmfPlusRecordType = 54

public val EMF_RECORD_TYPE_MASK_BLT: EmfPlusRecordType = 78

public val EMF_RECORD_TYPE_MAX: EmfPlusRecordType = 122

public val EMF_RECORD_TYPE_MIN: EmfPlusRecordType = 1

public val EMF_RECORD_TYPE_MODIFY_WORLD_TRANSFORM: EmfPlusRecordType = 36

public val EMF_RECORD_TYPE_MOVE_TO_EX: EmfPlusRecordType = 27

public val EMF_RECORD_TYPE_NAMED_ESCAPE: EmfPlusRecordType = 110

public val EMF_RECORD_TYPE_OFFSET_CLIP_RGN: EmfPlusRecordType = 26

public val EMF_RECORD_TYPE_PAINT_RGN: EmfPlusRecordType = 74

public val EMF_RECORD_TYPE_PIE: EmfPlusRecordType = 47

public val EMF_RECORD_TYPE_PIXEL_FORMAT: EmfPlusRecordType = 104

public val EMF_RECORD_TYPE_PLG_BLT: EmfPlusRecordType = 79

public val EMF_RECORD_TYPE_POLY_BEZIER: EmfPlusRecordType = 2

public val EMF_RECORD_TYPE_POLY_BEZIER16: EmfPlusRecordType = 85

public val EMF_RECORD_TYPE_POLY_BEZIER_TO: EmfPlusRecordType = 5

public val EMF_RECORD_TYPE_POLY_BEZIER_TO16: EmfPlusRecordType = 88

public val EMF_RECORD_TYPE_POLY_DRAW: EmfPlusRecordType = 56

public val EMF_RECORD_TYPE_POLY_DRAW16: EmfPlusRecordType = 92

public val EMF_RECORD_TYPE_POLY_LINE_TO: EmfPlusRecordType = 6

public val EMF_RECORD_TYPE_POLY_POLYGON: EmfPlusRecordType = 8

public val EMF_RECORD_TYPE_POLY_POLYGON16: EmfPlusRecordType = 91

public val EMF_RECORD_TYPE_POLY_POLYLINE: EmfPlusRecordType = 7

public val EMF_RECORD_TYPE_POLY_POLYLINE16: EmfPlusRecordType = 90

public val EMF_RECORD_TYPE_POLY_TEXT_OUT_A: EmfPlusRecordType = 96

public val EMF_RECORD_TYPE_POLY_TEXT_OUT_W: EmfPlusRecordType = 97

public val EMF_RECORD_TYPE_POLYGON: EmfPlusRecordType = 3

public val EMF_RECORD_TYPE_POLYGON16: EmfPlusRecordType = 86

public val EMF_RECORD_TYPE_POLYLINE: EmfPlusRecordType = 4

public val EMF_RECORD_TYPE_POLYLINE16: EmfPlusRecordType = 87

public val EMF_RECORD_TYPE_POLYLINE_TO16: EmfPlusRecordType = 89

public val EMF_RECORD_TYPE_REALIZE_PALETTE: EmfPlusRecordType = 52

public val EMF_RECORD_TYPE_RECTANGLE: EmfPlusRecordType = 43

public val EMF_RECORD_TYPE_RESERVED_069: EmfPlusRecordType = 69

public val EMF_RECORD_TYPE_RESERVED_117: EmfPlusRecordType = 117

public val EMF_RECORD_TYPE_RESIZE_PALETTE: EmfPlusRecordType = 51

public val EMF_RECORD_TYPE_RESTORE_DC: EmfPlusRecordType = 34

public val EMF_RECORD_TYPE_ROUND_RECT: EmfPlusRecordType = 44

public val EMF_RECORD_TYPE_SAVE_DC: EmfPlusRecordType = 33

public val EMF_RECORD_TYPE_SCALE_VIEWPORT_EXT_EX: EmfPlusRecordType = 31

public val EMF_RECORD_TYPE_SCALE_WINDOW_EXT_EX: EmfPlusRecordType = 32

public val EMF_RECORD_TYPE_SELECT_CLIP_PATH: EmfPlusRecordType = 67

public val EMF_RECORD_TYPE_SELECT_OBJECT: EmfPlusRecordType = 37

public val EMF_RECORD_TYPE_SELECT_PALETTE: EmfPlusRecordType = 48

public val EMF_RECORD_TYPE_SET_ARC_DIRECTION: EmfPlusRecordType = 57

public val EMF_RECORD_TYPE_SET_BK_COLOR: EmfPlusRecordType = 25

public val EMF_RECORD_TYPE_SET_BK_MODE: EmfPlusRecordType = 18

public val EMF_RECORD_TYPE_SET_BRUSH_ORG_EX: EmfPlusRecordType = 13

public val EMF_RECORD_TYPE_SET_COLOR_ADJUSTMENT: EmfPlusRecordType = 23

public val EMF_RECORD_TYPE_SET_COLOR_SPACE: EmfPlusRecordType = 100

public val EMF_RECORD_TYPE_SET_DI_BITS_TO_DEVICE: EmfPlusRecordType = 80

public val EMF_RECORD_TYPE_SET_ICM_MODE: EmfPlusRecordType = 98

public val EMF_RECORD_TYPE_SET_ICM_PROFILE_A: EmfPlusRecordType = 112

public val EMF_RECORD_TYPE_SET_ICM_PROFILE_W: EmfPlusRecordType = 113

public val EMF_RECORD_TYPE_SET_LAYOUT: EmfPlusRecordType = 115

public val EMF_RECORD_TYPE_SET_LINKED_UF_IS: EmfPlusRecordType = 119

public val EMF_RECORD_TYPE_SET_MAP_MODE: EmfPlusRecordType = 17

public val EMF_RECORD_TYPE_SET_MAPPER_FLAGS: EmfPlusRecordType = 16

public val EMF_RECORD_TYPE_SET_META_RGN: EmfPlusRecordType = 28

public val EMF_RECORD_TYPE_SET_MITER_LIMIT: EmfPlusRecordType = 58

public val EMF_RECORD_TYPE_SET_PALETTE_ENTRIES: EmfPlusRecordType = 50

public val EMF_RECORD_TYPE_SET_PIXEL_V: EmfPlusRecordType = 15

public val EMF_RECORD_TYPE_SET_POLY_FILL_MODE: EmfPlusRecordType = 19

public val EMF_RECORD_TYPE_SET_ROP2: EmfPlusRecordType = 20

public val EMF_RECORD_TYPE_SET_STRETCH_BLT_MODE: EmfPlusRecordType = 21

public val EMF_RECORD_TYPE_SET_TEXT_ALIGN: EmfPlusRecordType = 22

public val EMF_RECORD_TYPE_SET_TEXT_COLOR: EmfPlusRecordType = 24

public val EMF_RECORD_TYPE_SET_TEXT_JUSTIFICATION: EmfPlusRecordType = 120

public val EMF_RECORD_TYPE_SET_VIEWPORT_EXT_EX: EmfPlusRecordType = 11

public val EMF_RECORD_TYPE_SET_VIEWPORT_ORG_EX: EmfPlusRecordType = 12

public val EMF_RECORD_TYPE_SET_WINDOW_EXT_EX: EmfPlusRecordType = 9

public val EMF_RECORD_TYPE_SET_WINDOW_ORG_EX: EmfPlusRecordType = 10

public val EMF_RECORD_TYPE_SET_WORLD_TRANSFORM: EmfPlusRecordType = 35

public val EMF_RECORD_TYPE_SMALL_TEXT_OUT: EmfPlusRecordType = 108

public val EMF_RECORD_TYPE_START_DOC: EmfPlusRecordType = 107

public val EMF_RECORD_TYPE_STRETCH_BLT: EmfPlusRecordType = 77

public val EMF_RECORD_TYPE_STRETCH_DI_BITS: EmfPlusRecordType = 81

public val EMF_RECORD_TYPE_STROKE_AND_FILL_PATH: EmfPlusRecordType = 63

public val EMF_RECORD_TYPE_STROKE_PATH: EmfPlusRecordType = 64

public val EMF_RECORD_TYPE_TRANSPARENT_BLT: EmfPlusRecordType = 116

public val EMF_RECORD_TYPE_WIDEN_PATH: EmfPlusRecordType = 66

public val EMF_TO_WMF_BITS_FLAGS_DEFAULT: EmfToWmfBitsFlags = 0

public val EMF_TO_WMF_BITS_FLAGS_EMBED_EMF: EmfToWmfBitsFlags = 1

public val EMF_TO_WMF_BITS_FLAGS_INCLUDE_PLACEABLE: EmfToWmfBitsFlags = 2

public val EMF_TO_WMF_BITS_FLAGS_NO_XOR_CLIP: EmfToWmfBitsFlags = 4

public val EMF_TYPE_EMF_ONLY: EmfType = 3

public val EMF_TYPE_EMF_PLUS_DUAL: EmfType = 5

public val EMF_TYPE_EMF_PLUS_ONLY: EmfType = 4

public val ENCODER_PARAMETER_VALUE_TYPE_ASCII: EncoderParameterValueType = 2

public val ENCODER_PARAMETER_VALUE_TYPE_BYTE: EncoderParameterValueType = 1

public val ENCODER_PARAMETER_VALUE_TYPE_LONG: EncoderParameterValueType = 4

public val ENCODER_PARAMETER_VALUE_TYPE_LONG_RANGE: EncoderParameterValueType = 6

public val ENCODER_PARAMETER_VALUE_TYPE_POINTER: EncoderParameterValueType = 9

public val ENCODER_PARAMETER_VALUE_TYPE_RATIONAL: EncoderParameterValueType = 5

public val ENCODER_PARAMETER_VALUE_TYPE_RATIONAL_RANGE: EncoderParameterValueType = 8

public val ENCODER_PARAMETER_VALUE_TYPE_SHORT: EncoderParameterValueType = 3

public val ENCODER_PARAMETER_VALUE_TYPE_UNDEFINED: EncoderParameterValueType = 7

public val ENCODER_VALUE_COLOR_TYPE_CMYK: EncoderValue = 0

public val ENCODER_VALUE_COLOR_TYPE_GRAY: EncoderValue = 24

public val ENCODER_VALUE_COLOR_TYPE_RGB: EncoderValue = 25

public val ENCODER_VALUE_COLOR_TYPE_YCCK: EncoderValue = 1

public val ENCODER_VALUE_COMPRESSION_CCITT3: EncoderValue = 3

public val ENCODER_VALUE_COMPRESSION_CCITT4: EncoderValue = 4

public val ENCODER_VALUE_COMPRESSION_LZW: EncoderValue = 2

public val ENCODER_VALUE_COMPRESSION_NONE: EncoderValue = 6

public val ENCODER_VALUE_COMPRESSION_RLE: EncoderValue = 5

public val ENCODER_VALUE_FLUSH: EncoderValue = 20

public val ENCODER_VALUE_FRAME_DIMENSION_PAGE: EncoderValue = 23

public val ENCODER_VALUE_FRAME_DIMENSION_RESOLUTION: EncoderValue = 22

public val ENCODER_VALUE_FRAME_DIMENSION_TIME: EncoderValue = 21

public val ENCODER_VALUE_LAST_FRAME: EncoderValue = 19

public val ENCODER_VALUE_MULTI_FRAME: EncoderValue = 18

public val ENCODER_VALUE_RENDER_NON_PROGRESSIVE: EncoderValue = 12

public val ENCODER_VALUE_RENDER_PROGRESSIVE: EncoderValue = 11

public val ENCODER_VALUE_SCAN_METHOD_INTERLACED: EncoderValue = 7

public val ENCODER_VALUE_SCAN_METHOD_NON_INTERLACED: EncoderValue = 8

public val ENCODER_VALUE_TRANSFORM_FLIP_HORIZONTAL: EncoderValue = 16

public val ENCODER_VALUE_TRANSFORM_FLIP_VERTICAL: EncoderValue = 17

public val ENCODER_VALUE_TRANSFORM_ROTATE180: EncoderValue = 14

public val ENCODER_VALUE_TRANSFORM_ROTATE270: EncoderValue = 15

public val ENCODER_VALUE_TRANSFORM_ROTATE90: EncoderValue = 13

public val ENCODER_VALUE_VERSION_GIF87: EncoderValue = 9

public val ENCODER_VALUE_VERSION_GIF89: EncoderValue = 10

public val FILE_NOT_FOUND: Status = 10

public val FILL_MODE_ALTERNATE: FillMode = 0

public val FILL_MODE_WINDING: FillMode = 1

public val FLATNESS_DEFAULT: Float = 0.25f

public val FLUSH_INTENTION_FLUSH: FlushIntention = 0

public val FLUSH_INTENTION_SYNC: FlushIntention = 1

public val FONT_FAMILY_NOT_FOUND: Status = 14

public val FONT_STYLE_BOLD: FontStyle = 1

public val FONT_STYLE_BOLD_ITALIC: FontStyle = 3

public val FONT_STYLE_ITALIC: FontStyle = 2

public val FONT_STYLE_NOT_FOUND: Status = 15

public val FONT_STYLE_REGULAR: FontStyle = 0

public val FONT_STYLE_STRIKEOUT: FontStyle = 8

public val FONT_STYLE_UNDERLINE: FontStyle = 4

public val GDIP_EMFPLUSFLAGS_DISPLAY: UInt = 1u

public val GDIP_EMFPLUS_RECORD_BASE: UInt = 16384u

public val GDIP_WMF_RECORD_BASE: UInt = 65536u

public val GREEN_SHIFT: UInt = 8u

public val GDIPLUS_NOT_INITIALIZED: Status = 18

public val GDIPLUS_STARTUP_DEFAULT: GdiplusStartupParams = 0

public val GDIPLUS_STARTUP_NO_SET_ROUND: GdiplusStartupParams = 1

public val GDIPLUS_STARTUP_SET_PS_VALUE: GdiplusStartupParams = 2

public val GDIPLUS_STARTUP_TRANSPARENCY_MASK: GdiplusStartupParams = -16777216

public val GENERIC_ERROR: Status = 1

public val GENERIC_FONT_FAMILY_MONOSPACE: GenericFontFamily = 2

public val GENERIC_FONT_FAMILY_SANS_SERIF: GenericFontFamily = 1

public val GENERIC_FONT_FAMILY_SERIF: GenericFontFamily = 0

public val HATCH_STYLE05PERCENT: HatchStyle = 6

public val HATCH_STYLE10PERCENT: HatchStyle = 7

public val HATCH_STYLE20PERCENT: HatchStyle = 8

public val HATCH_STYLE25PERCENT: HatchStyle = 9

public val HATCH_STYLE30PERCENT: HatchStyle = 10

public val HATCH_STYLE40PERCENT: HatchStyle = 11

public val HATCH_STYLE50PERCENT: HatchStyle = 12

public val HATCH_STYLE60PERCENT: HatchStyle = 13

public val HATCH_STYLE70PERCENT: HatchStyle = 14

public val HATCH_STYLE75PERCENT: HatchStyle = 15

public val HATCH_STYLE80PERCENT: HatchStyle = 16

public val HATCH_STYLE90PERCENT: HatchStyle = 17

public val HATCH_STYLE_BACKWARD_DIAGONAL: HatchStyle = 3

public val HATCH_STYLE_CROSS: HatchStyle = 4

public val HATCH_STYLE_DARK_DOWNWARD_DIAGONAL: HatchStyle = 20

public val HATCH_STYLE_DARK_HORIZONTAL: HatchStyle = 29

public val HATCH_STYLE_DARK_UPWARD_DIAGONAL: HatchStyle = 21

public val HATCH_STYLE_DARK_VERTICAL: HatchStyle = 28

public val HATCH_STYLE_DASHED_DOWNWARD_DIAGONAL: HatchStyle = 30

public val HATCH_STYLE_DASHED_HORIZONTAL: HatchStyle = 32

public val HATCH_STYLE_DASHED_UPWARD_DIAGONAL: HatchStyle = 31

public val HATCH_STYLE_DASHED_VERTICAL: HatchStyle = 33

public val HATCH_STYLE_DIAGONAL_BRICK: HatchStyle = 38

public val HATCH_STYLE_DIAGONAL_CROSS: HatchStyle = 5

public val HATCH_STYLE_DIVOT: HatchStyle = 42

public val HATCH_STYLE_DOTTED_DIAMOND: HatchStyle = 44

public val HATCH_STYLE_DOTTED_GRID: HatchStyle = 43

public val HATCH_STYLE_FORWARD_DIAGONAL: HatchStyle = 2

public val HATCH_STYLE_HORIZONTAL: HatchStyle = 0

public val HATCH_STYLE_HORIZONTAL_BRICK: HatchStyle = 39

public val HATCH_STYLE_LARGE_CHECKER_BOARD: HatchStyle = 50

public val HATCH_STYLE_LARGE_CONFETTI: HatchStyle = 35

public val HATCH_STYLE_LARGE_GRID: HatchStyle = 4

public val HATCH_STYLE_LIGHT_DOWNWARD_DIAGONAL: HatchStyle = 18

public val HATCH_STYLE_LIGHT_HORIZONTAL: HatchStyle = 25

public val HATCH_STYLE_LIGHT_UPWARD_DIAGONAL: HatchStyle = 19

public val HATCH_STYLE_LIGHT_VERTICAL: HatchStyle = 24

public val HATCH_STYLE_MAX: HatchStyle = 52

public val HATCH_STYLE_MIN: HatchStyle = 0

public val HATCH_STYLE_NARROW_HORIZONTAL: HatchStyle = 27

public val HATCH_STYLE_NARROW_VERTICAL: HatchStyle = 26

public val HATCH_STYLE_OUTLINED_DIAMOND: HatchStyle = 51

public val HATCH_STYLE_PLAID: HatchStyle = 41

public val HATCH_STYLE_SHINGLE: HatchStyle = 45

public val HATCH_STYLE_SMALL_CHECKER_BOARD: HatchStyle = 49

public val HATCH_STYLE_SMALL_CONFETTI: HatchStyle = 34

public val HATCH_STYLE_SMALL_GRID: HatchStyle = 48

public val HATCH_STYLE_SOLID_DIAMOND: HatchStyle = 52

public val HATCH_STYLE_SPHERE: HatchStyle = 47

public val HATCH_STYLE_TOTAL: HatchStyle = 53

public val HATCH_STYLE_TRELLIS: HatchStyle = 46

public val HATCH_STYLE_VERTICAL: HatchStyle = 1

public val HATCH_STYLE_WAVE: HatchStyle = 37

public val HATCH_STYLE_WEAVE: HatchStyle = 40

public val HATCH_STYLE_WIDE_DOWNWARD_DIAGONAL: HatchStyle = 22

public val HATCH_STYLE_WIDE_UPWARD_DIAGONAL: HatchStyle = 23

public val HATCH_STYLE_ZIG_ZAG: HatchStyle = 36

public val HISTOGRAM_FORMAT_A: HistogramFormat = 7

public val HISTOGRAM_FORMAT_ARGB: HistogramFormat = 0

public val HISTOGRAM_FORMAT_B: HistogramFormat = 4

public val HISTOGRAM_FORMAT_G: HistogramFormat = 5

public val HISTOGRAM_FORMAT_GRAY: HistogramFormat = 3

public val HISTOGRAM_FORMAT_PARGB: HistogramFormat = 1

public val HISTOGRAM_FORMAT_R: HistogramFormat = 6

public val HISTOGRAM_FORMAT_RGB: HistogramFormat = 2

public val HOTKEY_PREFIX_HIDE: HotkeyPrefix = 2

public val HOTKEY_PREFIX_NONE: HotkeyPrefix = 0

public val HOTKEY_PREFIX_SHOW: HotkeyPrefix = 1

public val IMAGE_CODEC_FLAGS_BLOCKING_DECODE: ImageCodecFlags = 32

public val IMAGE_CODEC_FLAGS_BUILTIN: ImageCodecFlags = 65536

public val IMAGE_CODEC_FLAGS_DECODER: ImageCodecFlags = 2

public val IMAGE_CODEC_FLAGS_ENCODER: ImageCodecFlags = 1

public val IMAGE_CODEC_FLAGS_SEEKABLE_ENCODE: ImageCodecFlags = 16

public val IMAGE_CODEC_FLAGS_SUPPORT_BITMAP: ImageCodecFlags = 4

public val IMAGE_CODEC_FLAGS_SUPPORT_VECTOR: ImageCodecFlags = 8

public val IMAGE_CODEC_FLAGS_SYSTEM: ImageCodecFlags = 131072

public val IMAGE_CODEC_FLAGS_USER: ImageCodecFlags = 262144

public val IMAGE_FLAGS_CACHING: ImageFlags = 131072

public val IMAGE_FLAGS_COLOR_SPACE_CMYK: ImageFlags = 32

public val IMAGE_FLAGS_COLOR_SPACE_GRAY: ImageFlags = 64

public val IMAGE_FLAGS_COLOR_SPACE_RGB: ImageFlags = 16

public val IMAGE_FLAGS_COLOR_SPACE_YCBCR: ImageFlags = 128

public val IMAGE_FLAGS_COLOR_SPACE_YCCK: ImageFlags = 256

public val IMAGE_FLAGS_HAS_ALPHA: ImageFlags = 2

public val IMAGE_FLAGS_HAS_REAL_DPI: ImageFlags = 4096

public val IMAGE_FLAGS_HAS_REAL_PIXEL_SIZE: ImageFlags = 8192

public val IMAGE_FLAGS_HAS_TRANSLUCENT: ImageFlags = 4

public val IMAGE_FLAGS_NONE: ImageFlags = 0

public val IMAGE_FLAGS_PARTIALLY_SCALABLE: ImageFlags = 8

public val IMAGE_FLAGS_READ_ONLY: ImageFlags = 65536

public val IMAGE_FLAGS_SCALABLE: ImageFlags = 1

public val IMAGE_LOCK_MODE_READ: ImageLockMode = 1

public val IMAGE_LOCK_MODE_USER_INPUT_BUF: ImageLockMode = 4

public val IMAGE_LOCK_MODE_WRITE: ImageLockMode = 2

public val IMAGE_TYPE_BITMAP: ImageType = 1

public val IMAGE_TYPE_METAFILE: ImageType = 2

public val IMAGE_TYPE_UNKNOWN: ImageType = 0

public val INSUFFICIENT_BUFFER: Status = 5

public val INTERPOLATION_MODE_BICUBIC: InterpolationMode = 4

public val INTERPOLATION_MODE_BILINEAR: InterpolationMode = 3

public val INTERPOLATION_MODE_DEFAULT: InterpolationMode = 0

public val INTERPOLATION_MODE_HIGH_QUALITY: InterpolationMode = 2

public val INTERPOLATION_MODE_HIGH_QUALITY_BICUBIC: InterpolationMode = 7

public val INTERPOLATION_MODE_HIGH_QUALITY_BILINEAR: InterpolationMode = 6

public val INTERPOLATION_MODE_INVALID: InterpolationMode = -1

public val INTERPOLATION_MODE_LOW_QUALITY: InterpolationMode = 1

public val INTERPOLATION_MODE_NEAREST_NEIGHBOR: InterpolationMode = 5

public val INVALID_PARAMETER: Status = 2

public val ITEM_DATA_POSITION_AFTER_BITS: ItemDataPosition = 2

public val ITEM_DATA_POSITION_AFTER_HEADER: ItemDataPosition = 0

public val ITEM_DATA_POSITION_AFTER_PALETTE: ItemDataPosition = 1

public val LINE_CAP_ANCHOR_MASK: LineCap = 240

public val LINE_CAP_ARROW_ANCHOR: LineCap = 20

public val LINE_CAP_CUSTOM: LineCap = 255

public val LINE_CAP_DIAMOND_ANCHOR: LineCap = 19

public val LINE_CAP_FLAT: LineCap = 0

public val LINE_CAP_NO_ANCHOR: LineCap = 16

public val LINE_CAP_ROUND: LineCap = 2

public val LINE_CAP_ROUND_ANCHOR: LineCap = 18

public val LINE_CAP_SQUARE: LineCap = 1

public val LINE_CAP_SQUARE_ANCHOR: LineCap = 17

public val LINE_CAP_TRIANGLE: LineCap = 3

public val LINE_JOIN_BEVEL: LineJoin = 1

public val LINE_JOIN_MITER: LineJoin = 0

public val LINE_JOIN_MITER_CLIPPED: LineJoin = 3

public val LINE_JOIN_ROUND: LineJoin = 2

public val LINEAR_GRADIENT_MODE_BACKWARD_DIAGONAL: LinearGradientMode = 3

public val LINEAR_GRADIENT_MODE_FORWARD_DIAGONAL: LinearGradientMode = 2

public val LINEAR_GRADIENT_MODE_HORIZONTAL: LinearGradientMode = 0

public val LINEAR_GRADIENT_MODE_VERTICAL: LinearGradientMode = 1

public val MATRIX_ORDER_APPEND: MatrixOrder = 1

public val MATRIX_ORDER_PREPEND: MatrixOrder = 0

public val METAFILE_FRAME_UNIT_DOCUMENT: MetafileFrameUnit = 5

public val METAFILE_FRAME_UNIT_GDI: MetafileFrameUnit = 7

public val METAFILE_FRAME_UNIT_INCH: MetafileFrameUnit = 4

public val METAFILE_FRAME_UNIT_MILLIMETER: MetafileFrameUnit = 6

public val METAFILE_FRAME_UNIT_PIXEL: MetafileFrameUnit = 2

public val METAFILE_FRAME_UNIT_POINT: MetafileFrameUnit = 3

public val METAFILE_TYPE_EMF: MetafileType = 3

public val METAFILE_TYPE_EMF_PLUS_DUAL: MetafileType = 5

public val METAFILE_TYPE_EMF_PLUS_ONLY: MetafileType = 4

public val METAFILE_TYPE_INVALID: MetafileType = 0

public val METAFILE_TYPE_WMF: MetafileType = 1

public val METAFILE_TYPE_WMF_PLACEABLE: MetafileType = 2

public val UNSUPPORTED_CASE: Status = 6

public val NOT_TRUE_TYPE_FONT: Status = 16

public val OBJECT_BUSY: Status = 4

public val OBJECT_TYPE_BRUSH: ObjectType = 1

public val OBJECT_TYPE_CUSTOM_LINE_CAP: ObjectType = 9

public val OBJECT_TYPE_FONT: ObjectType = 6

public val OBJECT_TYPE_GRAPHICS: ObjectType = 10

public val OBJECT_TYPE_IMAGE: ObjectType = 5

public val OBJECT_TYPE_IMAGE_ATTRIBUTES: ObjectType = 8

public val OBJECT_TYPE_INVALID: ObjectType = 0

public val OBJECT_TYPE_MAX: ObjectType = 10

public val OBJECT_TYPE_MIN: ObjectType = 1

public val OBJECT_TYPE_PATH: ObjectType = 3

public val OBJECT_TYPE_PEN: ObjectType = 2

public val OBJECT_TYPE_REGION: ObjectType = 4

public val OBJECT_TYPE_STRING_FORMAT: ObjectType = 7

public val OK: Status = 0

public val OUT_OF_MEMORY: Status = 3

public val PALETTE_FLAGS_GRAY_SCALE: PaletteFlags = 2

public val PALETTE_FLAGS_HALFTONE: PaletteFlags = 4

public val PALETTE_FLAGS_HAS_ALPHA: PaletteFlags = 1

public val PALETTE_TYPE_CUSTOM: PaletteType = 0

public val PALETTE_TYPE_FIXED_BW: PaletteType = 2

public val PALETTE_TYPE_FIXED_HALFTONE125: PaletteType = 6

public val PALETTE_TYPE_FIXED_HALFTONE216: PaletteType = 7

public val PALETTE_TYPE_FIXED_HALFTONE252: PaletteType = 8

public val PALETTE_TYPE_FIXED_HALFTONE256: PaletteType = 9

public val PALETTE_TYPE_FIXED_HALFTONE27: PaletteType = 4

public val PALETTE_TYPE_FIXED_HALFTONE64: PaletteType = 5

public val PALETTE_TYPE_FIXED_HALFTONE8: PaletteType = 3

public val PALETTE_TYPE_OPTIMAL: PaletteType = 1

public val PATH_POINT_TYPE_BEZIER: PathPointType = 3

public val PATH_POINT_TYPE_BEZIER3: PathPointType = 3

public val PATH_POINT_TYPE_CLOSE_SUBPATH: PathPointType = 128

public val PATH_POINT_TYPE_DASH_MODE: PathPointType = 16

public val PATH_POINT_TYPE_LINE: PathPointType = 1

public val PATH_POINT_TYPE_PATH_MARKER: PathPointType = 32

public val PATH_POINT_TYPE_PATH_TYPE_MASK: PathPointType = 7

public val PATH_POINT_TYPE_START: PathPointType = 0

public val PEN_ALIGNMENT_CENTER: PenAlignment = 0

public val PEN_ALIGNMENT_INSET: PenAlignment = 1

public val PEN_TYPE_HATCH_FILL: PenType = 1

public val PEN_TYPE_LINEAR_GRADIENT: PenType = 4

public val PEN_TYPE_PATH_GRADIENT: PenType = 3

public val PEN_TYPE_SOLID_COLOR: PenType = 0

public val PEN_TYPE_TEXTURE_FILL: PenType = 2

public val PEN_TYPE_UNKNOWN: PenType = -1

public val PIXEL_FORMAT_ALPHA: UInt = 262144u

public val PIXEL_FORMAT_CANONICAL: UInt = 2097152u

public val PIXEL_FORMAT_DONT_CARE: UInt = 0u

public val PIXEL_FORMAT_EXTENDED: UInt = 1048576u

public val PIXEL_FORMAT_GDI: UInt = 131072u

public val PIXEL_FORMAT_INDEXED: UInt = 65536u

public val PIXEL_FORMAT_MAX: UInt = 16u

public val PIXEL_FORMAT_P_ALPHA: UInt = 524288u

public val PIXEL_FORMAT_UNDEFINED: UInt = 0u

public val PIXEL_OFFSET_MODE_DEFAULT: PixelOffsetMode = 0

public val PIXEL_OFFSET_MODE_HALF: PixelOffsetMode = 4

public val PIXEL_OFFSET_MODE_HIGH_QUALITY: PixelOffsetMode = 2

public val PIXEL_OFFSET_MODE_HIGH_SPEED: PixelOffsetMode = 1

public val PIXEL_OFFSET_MODE_INVALID: PixelOffsetMode = -1

public val PIXEL_OFFSET_MODE_NONE: PixelOffsetMode = 3

public val PROFILE_NOT_FOUND: Status = 21

public val PROPERTY_NOT_FOUND: Status = 19

public val PROPERTY_NOT_SUPPORTED: Status = 20

public val PROPERTY_TAG_ARTIST: UInt = 315u

public val PROPERTY_TAG_BITS_PER_SAMPLE: UInt = 258u

public val PROPERTY_TAG_CELL_HEIGHT: UInt = 265u

public val PROPERTY_TAG_CELL_WIDTH: UInt = 264u

public val PROPERTY_TAG_CHROMINANCE_TABLE: UInt = 20625u

public val PROPERTY_TAG_COLOR_MAP: UInt = 320u

public val PROPERTY_TAG_COLOR_TRANSFER_FUNCTION: UInt = 20506u

public val PROPERTY_TAG_COMPRESSION: UInt = 259u

public val PROPERTY_TAG_COPYRIGHT: UInt = 33432u

public val PROPERTY_TAG_DATE_TIME: UInt = 306u

public val PROPERTY_TAG_DOCUMENT_NAME: UInt = 269u

public val PROPERTY_TAG_DOT_RANGE: UInt = 336u

public val PROPERTY_TAG_EQUIP_MAKE: UInt = 271u

public val PROPERTY_TAG_EQUIP_MODEL: UInt = 272u

public val PROPERTY_TAG_EXIF_APERTURE: UInt = 37378u

public val PROPERTY_TAG_EXIF_BRIGHTNESS: UInt = 37379u

public val PROPERTY_TAG_EXIF_CFA_PATTERN: UInt = 41730u

public val PROPERTY_TAG_EXIF_COLOR_SPACE: UInt = 40961u

public val PROPERTY_TAG_EXIF_COMP_BPP: UInt = 37122u

public val PROPERTY_TAG_EXIF_COMP_CONFIG: UInt = 37121u

public val PROPERTY_TAG_EXIF_CONTRAST: UInt = 41992u

public val PROPERTY_TAG_EXIF_CUSTOM_RENDERED: UInt = 41985u

public val PROPERTY_TAG_EXIF_DT_DIG_SS: UInt = 37522u

public val PROPERTY_TAG_EXIF_DT_DIGITIZED: UInt = 36868u

public val PROPERTY_TAG_EXIF_DT_ORIG: UInt = 36867u

public val PROPERTY_TAG_EXIF_DT_ORIG_SS: UInt = 37521u

public val PROPERTY_TAG_EXIF_DT_SUBSEC: UInt = 37520u

public val PROPERTY_TAG_EXIF_DEVICE_SETTING_DESC: UInt = 41995u

public val PROPERTY_TAG_EXIF_DIGITAL_ZOOM_RATIO: UInt = 41988u

public val PROPERTY_TAG_EXIF_EXPOSURE_BIAS: UInt = 37380u

public val PROPERTY_TAG_EXIF_EXPOSURE_INDEX: UInt = 41493u

public val PROPERTY_TAG_EXIF_EXPOSURE_MODE: UInt = 41986u

public val PROPERTY_TAG_EXIF_EXPOSURE_PROG: UInt = 34850u

public val PROPERTY_TAG_EXIF_EXPOSURE_TIME: UInt = 33434u

public val PROPERTY_TAG_EXIF_F_NUMBER: UInt = 33437u

public val PROPERTY_TAG_EXIF_FPX_VER: UInt = 40960u

public val PROPERTY_TAG_EXIF_FILE_SOURCE: UInt = 41728u

public val PROPERTY_TAG_EXIF_FLASH: UInt = 37385u

public val PROPERTY_TAG_EXIF_FLASH_ENERGY: UInt = 41483u

public val PROPERTY_TAG_EXIF_FOCAL_LENGTH: UInt = 37386u

public val PROPERTY_TAG_EXIF_FOCAL_LENGTH_IN35MM_FILM: UInt = 41989u

public val PROPERTY_TAG_EXIF_FOCAL_RES_UNIT: UInt = 41488u

public val PROPERTY_TAG_EXIF_FOCAL_X_RES: UInt = 41486u

public val PROPERTY_TAG_EXIF_FOCAL_Y_RES: UInt = 41487u

public val PROPERTY_TAG_EXIF_GAIN_CONTROL: UInt = 41991u

public val PROPERTY_TAG_EXIF_IFD: UInt = 34665u

public val PROPERTY_TAG_EXIF_ISO_SPEED: UInt = 34855u

public val PROPERTY_TAG_EXIF_INTEROP: UInt = 40965u

public val PROPERTY_TAG_EXIF_LIGHT_SOURCE: UInt = 37384u

public val PROPERTY_TAG_EXIF_MAKER_NOTE: UInt = 37500u

public val PROPERTY_TAG_EXIF_MAX_APERTURE: UInt = 37381u

public val PROPERTY_TAG_EXIF_METERING_MODE: UInt = 37383u

public val PROPERTY_TAG_EXIF_OECF: UInt = 34856u

public val PROPERTY_TAG_EXIF_PIX_X_DIM: UInt = 40962u

public val PROPERTY_TAG_EXIF_PIX_Y_DIM: UInt = 40963u

public val PROPERTY_TAG_EXIF_RELATED_WAV: UInt = 40964u

public val PROPERTY_TAG_EXIF_SATURATION: UInt = 41993u

public val PROPERTY_TAG_EXIF_SCENE_CAPTURE_TYPE: UInt = 41990u

public val PROPERTY_TAG_EXIF_SCENE_TYPE: UInt = 41729u

public val PROPERTY_TAG_EXIF_SENSING_METHOD: UInt = 41495u

public val PROPERTY_TAG_EXIF_SHARPNESS: UInt = 41994u

public val PROPERTY_TAG_EXIF_SHUTTER_SPEED: UInt = 37377u

public val PROPERTY_TAG_EXIF_SPATIAL_FR: UInt = 41484u

public val PROPERTY_TAG_EXIF_SPECTRAL_SENSE: UInt = 34852u

public val PROPERTY_TAG_EXIF_SUBJECT_AREA: UInt = 37396u

public val PROPERTY_TAG_EXIF_SUBJECT_DIST: UInt = 37382u

public val PROPERTY_TAG_EXIF_SUBJECT_DISTANCE_RANGE: UInt = 41996u

public val PROPERTY_TAG_EXIF_SUBJECT_LOC: UInt = 41492u

public val PROPERTY_TAG_EXIF_UNIQUE_IMAGE_ID: UInt = 42016u

public val PROPERTY_TAG_EXIF_USER_COMMENT: UInt = 37510u

public val PROPERTY_TAG_EXIF_VER: UInt = 36864u

public val PROPERTY_TAG_EXIF_WHITE_BALANCE: UInt = 41987u

public val PROPERTY_TAG_EXTRA_SAMPLES: UInt = 338u

public val PROPERTY_TAG_FILL_ORDER: UInt = 266u

public val PROPERTY_TAG_FRAME_DELAY: UInt = 20736u

public val PROPERTY_TAG_FREE_BYTE_COUNTS: UInt = 289u

public val PROPERTY_TAG_FREE_OFFSET: UInt = 288u

public val PROPERTY_TAG_GAMMA: UInt = 769u

public val PROPERTY_TAG_GLOBAL_PALETTE: UInt = 20738u

public val PROPERTY_TAG_GPS_ALTITUDE: UInt = 6u

public val PROPERTY_TAG_GPS_ALTITUDE_REF: UInt = 5u

public val PROPERTY_TAG_GPS_AREA_INFORMATION: UInt = 28u

public val PROPERTY_TAG_GPS_DATE: UInt = 29u

public val PROPERTY_TAG_GPS_DEST_BEAR: UInt = 24u

public val PROPERTY_TAG_GPS_DEST_BEAR_REF: UInt = 23u

public val PROPERTY_TAG_GPS_DEST_DIST: UInt = 26u

public val PROPERTY_TAG_GPS_DEST_DIST_REF: UInt = 25u

public val PROPERTY_TAG_GPS_DEST_LAT: UInt = 20u

public val PROPERTY_TAG_GPS_DEST_LAT_REF: UInt = 19u

public val PROPERTY_TAG_GPS_DEST_LONG: UInt = 22u

public val PROPERTY_TAG_GPS_DEST_LONG_REF: UInt = 21u

public val PROPERTY_TAG_GPS_DIFFERENTIAL: UInt = 30u

public val PROPERTY_TAG_GPS_GPS_DOP: UInt = 11u

public val PROPERTY_TAG_GPS_GPS_MEASURE_MODE: UInt = 10u

public val PROPERTY_TAG_GPS_GPS_SATELLITES: UInt = 8u

public val PROPERTY_TAG_GPS_GPS_STATUS: UInt = 9u

public val PROPERTY_TAG_GPS_GPS_TIME: UInt = 7u

public val PROPERTY_TAG_GPS_IFD: UInt = 34853u

public val PROPERTY_TAG_GPS_IMG_DIR: UInt = 17u

public val PROPERTY_TAG_GPS_IMG_DIR_REF: UInt = 16u

public val PROPERTY_TAG_GPS_LATITUDE: UInt = 2u

public val PROPERTY_TAG_GPS_LATITUDE_REF: UInt = 1u

public val PROPERTY_TAG_GPS_LONGITUDE: UInt = 4u

public val PROPERTY_TAG_GPS_LONGITUDE_REF: UInt = 3u

public val PROPERTY_TAG_GPS_MAP_DATUM: UInt = 18u

public val PROPERTY_TAG_GPS_PROCESSING_METHOD: UInt = 27u

public val PROPERTY_TAG_GPS_SPEED: UInt = 13u

public val PROPERTY_TAG_GPS_SPEED_REF: UInt = 12u

public val PROPERTY_TAG_GPS_TRACK: UInt = 15u

public val PROPERTY_TAG_GPS_TRACK_REF: UInt = 14u

public val PROPERTY_TAG_GPS_VER: UInt = 0u

public val PROPERTY_TAG_GRAY_RESPONSE_CURVE: UInt = 291u

public val PROPERTY_TAG_GRAY_RESPONSE_UNIT: UInt = 290u

public val PROPERTY_TAG_GRID_SIZE: UInt = 20497u

public val PROPERTY_TAG_HALFTONE_DEGREE: UInt = 20492u

public val PROPERTY_TAG_HALFTONE_HINTS: UInt = 321u

public val PROPERTY_TAG_HALFTONE_LPI: UInt = 20490u

public val PROPERTY_TAG_HALFTONE_LPI_UNIT: UInt = 20491u

public val PROPERTY_TAG_HALFTONE_MISC: UInt = 20494u

public val PROPERTY_TAG_HALFTONE_SCREEN: UInt = 20495u

public val PROPERTY_TAG_HALFTONE_SHAPE: UInt = 20493u

public val PROPERTY_TAG_HOST_COMPUTER: UInt = 316u

public val PROPERTY_TAG_ICC_PROFILE: UInt = 34675u

public val PROPERTY_TAG_ICC_PROFILE_DESCRIPTOR: UInt = 770u

public val PROPERTY_TAG_IMAGE_DESCRIPTION: UInt = 270u

public val PROPERTY_TAG_IMAGE_HEIGHT: UInt = 257u

public val PROPERTY_TAG_IMAGE_TITLE: UInt = 800u

public val PROPERTY_TAG_IMAGE_WIDTH: UInt = 256u

public val PROPERTY_TAG_INDEX_BACKGROUND: UInt = 20739u

public val PROPERTY_TAG_INDEX_TRANSPARENT: UInt = 20740u

public val PROPERTY_TAG_INK_NAMES: UInt = 333u

public val PROPERTY_TAG_INK_SET: UInt = 332u

public val PROPERTY_TAG_JPEGAC_TABLES: UInt = 521u

public val PROPERTY_TAG_JPEGDC_TABLES: UInt = 520u

public val PROPERTY_TAG_JPEG_INTER_FORMAT: UInt = 513u

public val PROPERTY_TAG_JPEG_INTER_LENGTH: UInt = 514u

public val PROPERTY_TAG_JPEG_LOSSLESS_PREDICTORS: UInt = 517u

public val PROPERTY_TAG_JPEG_POINT_TRANSFORMS: UInt = 518u

public val PROPERTY_TAG_JPEG_PROC: UInt = 512u

public val PROPERTY_TAG_JPEGQ_TABLES: UInt = 519u

public val PROPERTY_TAG_JPEG_QUALITY: UInt = 20496u

public val PROPERTY_TAG_JPEG_RESTART_INTERVAL: UInt = 515u

public val PROPERTY_TAG_LOOP_COUNT: UInt = 20737u

public val PROPERTY_TAG_LUMINANCE_TABLE: UInt = 20624u

public val PROPERTY_TAG_MAX_SAMPLE_VALUE: UInt = 281u

public val PROPERTY_TAG_MIN_SAMPLE_VALUE: UInt = 280u

public val PROPERTY_TAG_NEW_SUBFILE_TYPE: UInt = 254u

public val PROPERTY_TAG_NUMBER_OF_INKS: UInt = 334u

public val PROPERTY_TAG_ORIENTATION: UInt = 274u

public val PROPERTY_TAG_PAGE_NAME: UInt = 285u

public val PROPERTY_TAG_PAGE_NUMBER: UInt = 297u

public val PROPERTY_TAG_PALETTE_HISTOGRAM: UInt = 20755u

public val PROPERTY_TAG_PHOTOMETRIC_INTERP: UInt = 262u

public val PROPERTY_TAG_PIXEL_PER_UNIT_X: UInt = 20753u

public val PROPERTY_TAG_PIXEL_PER_UNIT_Y: UInt = 20754u

public val PROPERTY_TAG_PIXEL_UNIT: UInt = 20752u

public val PROPERTY_TAG_PLANAR_CONFIG: UInt = 284u

public val PROPERTY_TAG_PREDICTOR: UInt = 317u

public val PROPERTY_TAG_PRIMARY_CHROMATICITIES: UInt = 319u

public val PROPERTY_TAG_PRINT_FLAGS: UInt = 20485u

public val PROPERTY_TAG_PRINT_FLAGS_BLEED_WIDTH: UInt = 20488u

public val PROPERTY_TAG_PRINT_FLAGS_BLEED_WIDTH_SCALE: UInt = 20489u

public val PROPERTY_TAG_PRINT_FLAGS_CROP: UInt = 20487u

public val PROPERTY_TAG_PRINT_FLAGS_VERSION: UInt = 20486u

public val PROPERTY_TAG_REF_BLACK_WHITE: UInt = 532u

public val PROPERTY_TAG_RESOLUTION_UNIT: UInt = 296u

public val PROPERTY_TAG_RESOLUTION_X_LENGTH_UNIT: UInt = 20483u

public val PROPERTY_TAG_RESOLUTION_X_UNIT: UInt = 20481u

public val PROPERTY_TAG_RESOLUTION_Y_LENGTH_UNIT: UInt = 20484u

public val PROPERTY_TAG_RESOLUTION_Y_UNIT: UInt = 20482u

public val PROPERTY_TAG_ROWS_PER_STRIP: UInt = 278u

public val PROPERTY_TAG_S_MAX_SAMPLE_VALUE: UInt = 341u

public val PROPERTY_TAG_S_MIN_SAMPLE_VALUE: UInt = 340u

public val PROPERTY_TAG_SRGB_RENDERING_INTENT: UInt = 771u

public val PROPERTY_TAG_SAMPLE_FORMAT: UInt = 339u

public val PROPERTY_TAG_SAMPLES_PER_PIXEL: UInt = 277u

public val PROPERTY_TAG_SOFTWARE_USED: UInt = 305u

public val PROPERTY_TAG_STRIP_BYTES_COUNT: UInt = 279u

public val PROPERTY_TAG_STRIP_OFFSETS: UInt = 273u

public val PROPERTY_TAG_SUBFILE_TYPE: UInt = 255u

public val PROPERTY_TAG_T4OPTION: UInt = 292u

public val PROPERTY_TAG_T6OPTION: UInt = 293u

public val PROPERTY_TAG_TARGET_PRINTER: UInt = 337u

public val PROPERTY_TAG_THRESH_HOLDING: UInt = 263u

public val PROPERTY_TAG_THUMBNAIL_ARTIST: UInt = 20532u

public val PROPERTY_TAG_THUMBNAIL_BITS_PER_SAMPLE: UInt = 20514u

public val PROPERTY_TAG_THUMBNAIL_COLOR_DEPTH: UInt = 20501u

public val PROPERTY_TAG_THUMBNAIL_COMPRESSED_SIZE: UInt = 20505u

public val PROPERTY_TAG_THUMBNAIL_COMPRESSION: UInt = 20515u

public val PROPERTY_TAG_THUMBNAIL_COPY_RIGHT: UInt = 20539u

public val PROPERTY_TAG_THUMBNAIL_DATA: UInt = 20507u

public val PROPERTY_TAG_THUMBNAIL_DATE_TIME: UInt = 20531u

public val PROPERTY_TAG_THUMBNAIL_EQUIP_MAKE: UInt = 20518u

public val PROPERTY_TAG_THUMBNAIL_EQUIP_MODEL: UInt = 20519u

public val PROPERTY_TAG_THUMBNAIL_FORMAT: UInt = 20498u

public val PROPERTY_TAG_THUMBNAIL_HEIGHT: UInt = 20500u

public val PROPERTY_TAG_THUMBNAIL_IMAGE_DESCRIPTION: UInt = 20517u

public val PROPERTY_TAG_THUMBNAIL_IMAGE_HEIGHT: UInt = 20513u

public val PROPERTY_TAG_THUMBNAIL_IMAGE_WIDTH: UInt = 20512u

public val PROPERTY_TAG_THUMBNAIL_ORIENTATION: UInt = 20521u

public val PROPERTY_TAG_THUMBNAIL_PHOTOMETRIC_INTERP: UInt = 20516u

public val PROPERTY_TAG_THUMBNAIL_PLANAR_CONFIG: UInt = 20527u

public val PROPERTY_TAG_THUMBNAIL_PLANES: UInt = 20502u

public val PROPERTY_TAG_THUMBNAIL_PRIMARY_CHROMATICITIES: UInt = 20534u

public val PROPERTY_TAG_THUMBNAIL_RAW_BYTES: UInt = 20503u

public val PROPERTY_TAG_THUMBNAIL_REF_BLACK_WHITE: UInt = 20538u

public val PROPERTY_TAG_THUMBNAIL_RESOLUTION_UNIT: UInt = 20528u

public val PROPERTY_TAG_THUMBNAIL_RESOLUTION_X: UInt = 20525u

public val PROPERTY_TAG_THUMBNAIL_RESOLUTION_Y: UInt = 20526u

public val PROPERTY_TAG_THUMBNAIL_ROWS_PER_STRIP: UInt = 20523u

public val PROPERTY_TAG_THUMBNAIL_SAMPLES_PER_PIXEL: UInt = 20522u

public val PROPERTY_TAG_THUMBNAIL_SIZE: UInt = 20504u

public val PROPERTY_TAG_THUMBNAIL_SOFTWARE_USED: UInt = 20530u

public val PROPERTY_TAG_THUMBNAIL_STRIP_BYTES_COUNT: UInt = 20524u

public val PROPERTY_TAG_THUMBNAIL_STRIP_OFFSETS: UInt = 20520u

public val PROPERTY_TAG_THUMBNAIL_TRANSFER_FUNCTION: UInt = 20529u

public val PROPERTY_TAG_THUMBNAIL_WHITE_POINT: UInt = 20533u

public val PROPERTY_TAG_THUMBNAIL_WIDTH: UInt = 20499u

public val PROPERTY_TAG_THUMBNAIL_Y_CB_CR_COEFFICIENTS: UInt = 20535u

public val PROPERTY_TAG_THUMBNAIL_Y_CB_CR_POSITIONING: UInt = 20537u

public val PROPERTY_TAG_THUMBNAIL_Y_CB_CR_SUBSAMPLING: UInt = 20536u

public val PROPERTY_TAG_TILE_BYTE_COUNTS: UInt = 325u

public val PROPERTY_TAG_TILE_LENGTH: UInt = 323u

public val PROPERTY_TAG_TILE_OFFSET: UInt = 324u

public val PROPERTY_TAG_TILE_WIDTH: UInt = 322u

public val PROPERTY_TAG_TRANSFER_FUNCITION: UInt = 301u

public val PROPERTY_TAG_TRANSFER_RANGE: UInt = 342u

public val PROPERTY_TAG_TYPE_ASCII: UInt = 2u

public val PROPERTY_TAG_TYPE_BYTE: UInt = 1u

public val PROPERTY_TAG_TYPE_LONG: UInt = 4u

public val PROPERTY_TAG_TYPE_RATIONAL: UInt = 5u

public val PROPERTY_TAG_TYPE_SLONG: UInt = 9u

public val PROPERTY_TAG_TYPE_S_RATIONAL: UInt = 10u

public val PROPERTY_TAG_TYPE_SHORT: UInt = 3u

public val PROPERTY_TAG_TYPE_UNDEFINED: UInt = 7u

public val PROPERTY_TAG_WHITE_POINT: UInt = 318u

public val PROPERTY_TAG_X_POSITION: UInt = 286u

public val PROPERTY_TAG_X_RESOLUTION: UInt = 282u

public val PROPERTY_TAG_Y_CB_CR_COEFFICIENTS: UInt = 529u

public val PROPERTY_TAG_Y_CB_CR_POSITIONING: UInt = 531u

public val PROPERTY_TAG_Y_CB_CR_SUBSAMPLING: UInt = 530u

public val PROPERTY_TAG_Y_POSITION: UInt = 287u

public val PROPERTY_TAG_Y_RESOLUTION: UInt = 283u

public val QUALITY_MODE_DEFAULT: QualityMode = 0

public val QUALITY_MODE_HIGH: QualityMode = 2

public val QUALITY_MODE_INVALID: QualityMode = -1

public val QUALITY_MODE_LOW: QualityMode = 1

public val RED_SHIFT: UInt = 16u

public val ROTATE180FLIP_NONE: RotateFlipType = 2

public val ROTATE180FLIP_X: RotateFlipType = 6

public val ROTATE180FLIP_XY: RotateFlipType = 0

public val ROTATE180FLIP_Y: RotateFlipType = 4

public val ROTATE270FLIP_NONE: RotateFlipType = 3

public val ROTATE270FLIP_X: RotateFlipType = 7

public val ROTATE270FLIP_XY: RotateFlipType = 1

public val ROTATE270FLIP_Y: RotateFlipType = 5

public val ROTATE90FLIP_NONE: RotateFlipType = 1

public val ROTATE90FLIP_X: RotateFlipType = 5

public val ROTATE90FLIP_XY: RotateFlipType = 3

public val ROTATE90FLIP_Y: RotateFlipType = 7

public val ROTATE_NONE_FLIP_NONE: RotateFlipType = 0

public val ROTATE_NONE_FLIP_X: RotateFlipType = 4

public val ROTATE_NONE_FLIP_XY: RotateFlipType = 2

public val ROTATE_NONE_FLIP_Y: RotateFlipType = 6

public val SMOOTHING_MODE_ANTI_ALIAS: SmoothingMode = 4

public val SMOOTHING_MODE_ANTI_ALIAS8X4: SmoothingMode = 4

public val SMOOTHING_MODE_ANTI_ALIAS8X8: SmoothingMode = 5

public val SMOOTHING_MODE_DEFAULT: SmoothingMode = 0

public val SMOOTHING_MODE_HIGH_QUALITY: SmoothingMode = 2

public val SMOOTHING_MODE_HIGH_SPEED: SmoothingMode = 1

public val SMOOTHING_MODE_INVALID: SmoothingMode = -1

public val SMOOTHING_MODE_NONE: SmoothingMode = 3

public val STRING_ALIGNMENT_CENTER: StringAlignment = 1

public val STRING_ALIGNMENT_FAR: StringAlignment = 2

public val STRING_ALIGNMENT_NEAR: StringAlignment = 0

public val STRING_DIGIT_SUBSTITUTE_NATIONAL: StringDigitSubstitute = 2

public val STRING_DIGIT_SUBSTITUTE_NONE: StringDigitSubstitute = 1

public val STRING_DIGIT_SUBSTITUTE_TRADITIONAL: StringDigitSubstitute = 3

public val STRING_DIGIT_SUBSTITUTE_USER: StringDigitSubstitute = 0

public val STRING_FORMAT_FLAGS_BYPASS_GDI: StringFormatFlags = -2147483648.toInt()

public val STRING_FORMAT_FLAGS_DIRECTION_RIGHT_TO_LEFT: StringFormatFlags = 1

public val STRING_FORMAT_FLAGS_DIRECTION_VERTICAL: StringFormatFlags = 2

public val STRING_FORMAT_FLAGS_DISPLAY_FORMAT_CONTROL: StringFormatFlags = 32

public val STRING_FORMAT_FLAGS_LINE_LIMIT: StringFormatFlags = 8192

public val STRING_FORMAT_FLAGS_MEASURE_TRAILING_SPACES: StringFormatFlags = 2048

public val STRING_FORMAT_FLAGS_NO_CLIP: StringFormatFlags = 16384

public val STRING_FORMAT_FLAGS_NO_FIT_BLACK_BOX: StringFormatFlags = 4

public val STRING_FORMAT_FLAGS_NO_FONT_FALLBACK: StringFormatFlags = 1024

public val STRING_FORMAT_FLAGS_NO_WRAP: StringFormatFlags = 4096

public val STRING_TRIMMING_CHARACTER: StringTrimming = 1

public val STRING_TRIMMING_ELLIPSIS_CHARACTER: StringTrimming = 3

public val STRING_TRIMMING_ELLIPSIS_PATH: StringTrimming = 5

public val STRING_TRIMMING_ELLIPSIS_WORD: StringTrimming = 4

public val STRING_TRIMMING_NONE: StringTrimming = 0

public val STRING_TRIMMING_WORD: StringTrimming = 2

public val TEST_CONTROL_FORCE_BILINEAR: GpTestControlEnum = 0

public val TEST_CONTROL_GET_BUILD_NUMBER: GpTestControlEnum = 2

public val TEST_CONTROL_NO_ICM: GpTestControlEnum = 1

public val TEXT_RENDERING_HINT_ANTI_ALIAS: TextRenderingHint = 4

public val TEXT_RENDERING_HINT_ANTI_ALIAS_GRID_FIT: TextRenderingHint = 3

public val TEXT_RENDERING_HINT_CLEAR_TYPE_GRID_FIT: TextRenderingHint = 5

public val TEXT_RENDERING_HINT_SINGLE_BIT_PER_PIXEL: TextRenderingHint = 2

public val TEXT_RENDERING_HINT_SINGLE_BIT_PER_PIXEL_GRID_FIT: TextRenderingHint = 1

public val TEXT_RENDERING_HINT_SYSTEM_DEFAULT: TextRenderingHint = 0

public val UNIT_DISPLAY: Unit = 1

public val UNIT_DOCUMENT: Unit = 5

public val UNIT_INCH: Unit = 4

public val UNIT_MILLIMETER: Unit = 6

public val UNIT_PIXEL: Unit = 2

public val UNIT_POINT: Unit = 3

public val UNIT_WORLD: Unit = 0

public val UNKNOWN_IMAGE_FORMAT: Status = 13

public val UNSUPPORTED_GDIPLUS_VERSION: Status = 17

public val VALUE_OVERFLOW: Status = 11

public val WARP_MODE_BILINEAR: WarpMode = 1

public val WARP_MODE_PERSPECTIVE: WarpMode = 0

public val WIN32ERROR: Status = 7

public val WMF_RECORD_TYPE_ABORT_DOC: EmfPlusRecordType = 65618

public val WMF_RECORD_TYPE_ANIMATE_PALETTE: EmfPlusRecordType = 66614

public val WMF_RECORD_TYPE_ARC: EmfPlusRecordType = 67607

public val WMF_RECORD_TYPE_BIT_BLT: EmfPlusRecordType = 67874

public val WMF_RECORD_TYPE_CHORD: EmfPlusRecordType = 67632

public val WMF_RECORD_TYPE_CREATE_BITMAP: EmfPlusRecordType = 67326

public val WMF_RECORD_TYPE_CREATE_BITMAP_INDIRECT: EmfPlusRecordType = 66301

public val WMF_RECORD_TYPE_CREATE_BRUSH: EmfPlusRecordType = 65784

public val WMF_RECORD_TYPE_CREATE_BRUSH_INDIRECT: EmfPlusRecordType = 66300

public val WMF_RECORD_TYPE_CREATE_FONT_INDIRECT: EmfPlusRecordType = 66299

public val WMF_RECORD_TYPE_CREATE_PALETTE: EmfPlusRecordType = 65783

public val WMF_RECORD_TYPE_CREATE_PATTERN_BRUSH: EmfPlusRecordType = 66041

public val WMF_RECORD_TYPE_CREATE_PEN_INDIRECT: EmfPlusRecordType = 66298

public val WMF_RECORD_TYPE_CREATE_REGION: EmfPlusRecordType = 67327

public val WMF_RECORD_TYPE_DIB_BIT_BLT: EmfPlusRecordType = 67904

public val WMF_RECORD_TYPE_DIB_CREATE_PATTERN_BRUSH: EmfPlusRecordType = 65858

public val WMF_RECORD_TYPE_DIB_STRETCH_BLT: EmfPlusRecordType = 68417

public val WMF_RECORD_TYPE_DELETE_OBJECT: EmfPlusRecordType = 66032

public val WMF_RECORD_TYPE_DRAW_TEXT: EmfPlusRecordType = 67119

public val WMF_RECORD_TYPE_ELLIPSE: EmfPlusRecordType = 66584

public val WMF_RECORD_TYPE_END_DOC: EmfPlusRecordType = 65630

public val WMF_RECORD_TYPE_END_PAGE: EmfPlusRecordType = 65616

public val WMF_RECORD_TYPE_ESCAPE: EmfPlusRecordType = 67110

public val WMF_RECORD_TYPE_EXCLUDE_CLIP_RECT: EmfPlusRecordType = 66581

public val WMF_RECORD_TYPE_EXT_FLOOD_FILL: EmfPlusRecordType = 66888

public val WMF_RECORD_TYPE_EXT_TEXT_OUT: EmfPlusRecordType = 68146

public val WMF_RECORD_TYPE_FILL_REGION: EmfPlusRecordType = 66088

public val WMF_RECORD_TYPE_FLOOD_FILL: EmfPlusRecordType = 66585

public val WMF_RECORD_TYPE_FRAME_REGION: EmfPlusRecordType = 66601

public val WMF_RECORD_TYPE_INTERSECT_CLIP_RECT: EmfPlusRecordType = 66582

public val WMF_RECORD_TYPE_INVERT_REGION: EmfPlusRecordType = 65834

public val WMF_RECORD_TYPE_LINE_TO: EmfPlusRecordType = 66067

public val WMF_RECORD_TYPE_MOVE_TO: EmfPlusRecordType = 66068

public val WMF_RECORD_TYPE_OFFSET_CLIP_RGN: EmfPlusRecordType = 66080

public val WMF_RECORD_TYPE_OFFSET_VIEWPORT_ORG: EmfPlusRecordType = 66065

public val WMF_RECORD_TYPE_OFFSET_WINDOW_ORG: EmfPlusRecordType = 66063

public val WMF_RECORD_TYPE_PAINT_REGION: EmfPlusRecordType = 65835

public val WMF_RECORD_TYPE_PAT_BLT: EmfPlusRecordType = 67101

public val WMF_RECORD_TYPE_PIE: EmfPlusRecordType = 67610

public val WMF_RECORD_TYPE_POLY_POLYGON: EmfPlusRecordType = 66872

public val WMF_RECORD_TYPE_POLYGON: EmfPlusRecordType = 66340

public val WMF_RECORD_TYPE_POLYLINE: EmfPlusRecordType = 66341

public val WMF_RECORD_TYPE_REALIZE_PALETTE: EmfPlusRecordType = 65589

public val WMF_RECORD_TYPE_RECTANGLE: EmfPlusRecordType = 66587

public val WMF_RECORD_TYPE_RESET_DC: EmfPlusRecordType = 65868

public val WMF_RECORD_TYPE_RESIZE_PALETTE: EmfPlusRecordType = 65849

public val WMF_RECORD_TYPE_RESTORE_DC: EmfPlusRecordType = 65831

public val WMF_RECORD_TYPE_ROUND_RECT: EmfPlusRecordType = 67100

public val WMF_RECORD_TYPE_SAVE_DC: EmfPlusRecordType = 65566

public val WMF_RECORD_TYPE_SCALE_VIEWPORT_EXT: EmfPlusRecordType = 66578

public val WMF_RECORD_TYPE_SCALE_WINDOW_EXT: EmfPlusRecordType = 66576

public val WMF_RECORD_TYPE_SELECT_CLIP_REGION: EmfPlusRecordType = 65836

public val WMF_RECORD_TYPE_SELECT_OBJECT: EmfPlusRecordType = 65837

public val WMF_RECORD_TYPE_SELECT_PALETTE: EmfPlusRecordType = 66100

public val WMF_RECORD_TYPE_SET_BK_COLOR: EmfPlusRecordType = 66049

public val WMF_RECORD_TYPE_SET_BK_MODE: EmfPlusRecordType = 65794

public val WMF_RECORD_TYPE_SET_DIB_TO_DEV: EmfPlusRecordType = 68915

public val WMF_RECORD_TYPE_SET_LAYOUT: EmfPlusRecordType = 65865

public val WMF_RECORD_TYPE_SET_MAP_MODE: EmfPlusRecordType = 65795

public val WMF_RECORD_TYPE_SET_MAPPER_FLAGS: EmfPlusRecordType = 66097

public val WMF_RECORD_TYPE_SET_PAL_ENTRIES: EmfPlusRecordType = 65591

public val WMF_RECORD_TYPE_SET_PIXEL: EmfPlusRecordType = 66591

public val WMF_RECORD_TYPE_SET_POLY_FILL_MODE: EmfPlusRecordType = 65798

public val WMF_RECORD_TYPE_SET_ROP2: EmfPlusRecordType = 65796

public val WMF_RECORD_TYPE_SET_REL_ABS: EmfPlusRecordType = 65797

public val WMF_RECORD_TYPE_SET_STRETCH_BLT_MODE: EmfPlusRecordType = 65799

public val WMF_RECORD_TYPE_SET_TEXT_ALIGN: EmfPlusRecordType = 65838

public val WMF_RECORD_TYPE_SET_TEXT_CHAR_EXTRA: EmfPlusRecordType = 65800

public val WMF_RECORD_TYPE_SET_TEXT_COLOR: EmfPlusRecordType = 66057

public val WMF_RECORD_TYPE_SET_TEXT_JUSTIFICATION: EmfPlusRecordType = 66058

public val WMF_RECORD_TYPE_SET_VIEWPORT_EXT: EmfPlusRecordType = 66062

public val WMF_RECORD_TYPE_SET_VIEWPORT_ORG: EmfPlusRecordType = 66061

public val WMF_RECORD_TYPE_SET_WINDOW_EXT: EmfPlusRecordType = 66060

public val WMF_RECORD_TYPE_SET_WINDOW_ORG: EmfPlusRecordType = 66059

public val WMF_RECORD_TYPE_START_DOC: EmfPlusRecordType = 65869

public val WMF_RECORD_TYPE_START_PAGE: EmfPlusRecordType = 65615

public val WMF_RECORD_TYPE_STRETCH_BLT: EmfPlusRecordType = 68387

public val WMF_RECORD_TYPE_STRETCH_DIB: EmfPlusRecordType = 69443

public val WMF_RECORD_TYPE_TEXT_OUT: EmfPlusRecordType = 66849

public val WRAP_MODE_CLAMP: WrapMode = 4

public val WRAP_MODE_TILE: WrapMode = 0

public val WRAP_MODE_TILE_FLIP_X: WrapMode = 1

public val WRAP_MODE_TILE_FLIP_XY: WrapMode = 3

public val WRAP_MODE_TILE_FLIP_Y: WrapMode = 2

public val WRONG_STATE: Status = 8

public val BLUR_EFFECT_GUID: Guid = Guid.fromU128(U128(0x633c80a41843482buL, 0x9ef2be2834c5fdd4uL))

public val BRIGHTNESS_CONTRAST_EFFECT_GUID: Guid = Guid.fromU128(U128(0xd3a1dbe18ec44c17uL, 0x9f4cea97ad1c343duL))

public val CODEC_I_IMAGE_BYTES: Guid = Guid.fromU128(U128(0x25d18236c7d447buL, 0xbbdba3cbc3dfa2fcuL))

public val COLOR_BALANCE_EFFECT_GUID: Guid = Guid.fromU128(U128(0x537e597d251e48dauL, 0x966429ca496b70f8uL))

public val COLOR_CURVE_EFFECT_GUID: Guid = Guid.fromU128(U128(0xdd6a002258e44a67uL, 0x9d9bd48eb881a53duL))

public val COLOR_LUT_EFFECT_GUID: Guid = Guid.fromU128(U128(0xa7ce72a90f7f40d7uL, 0xb3ccd0c02d5c3212uL))

public val COLOR_MATRIX_EFFECT_GUID: Guid = Guid.fromU128(U128(0x718f2615793340e3uL, 0xa5115f68fe14dd74uL))

public val ENCODER_CHROMINANCE_TABLE: Guid = Guid.fromU128(U128(0xf2e455dc09b34316uL, 0x8260676ada32481cuL))

public val ENCODER_COLOR_DEPTH: Guid = Guid.fromU128(U128(0x66087055ad664c7cuL, 0x9a1838a2310b8337uL))

public val ENCODER_COLOR_SPACE: Guid = Guid.fromU128(U128(0xae7a62a0ee2c49d8uL, 0x9d071ba8a927596euL))

public val ENCODER_COMPRESSION: Guid = Guid.fromU128(U128(0xe09d739dccd444eeuL, 0x8eba3fbf8be4fc58uL))

public val ENCODER_IMAGE_ITEMS: Guid = Guid.fromU128(U128(0x63875e131f1d45abuL, 0x9195a29b6066a650uL))

public val ENCODER_LUMINANCE_TABLE: Guid = Guid.fromU128(U128(0xedb33bce02664a77uL, 0xb90427216099e717uL))

public val ENCODER_QUALITY: Guid = Guid.fromU128(U128(0x1d5be4b5fa4a452duL, 0x9cdd5db35105e7ebuL))

public val ENCODER_RENDER_METHOD: Guid = Guid.fromU128(U128(0x6d42c53a229a4825uL, 0x8bb75c99e2b9a8b8uL))

public val ENCODER_SAVE_AS_CMYK: Guid = Guid.fromU128(U128(0xa219bbc90a9d4005uL, 0xa3ee3a421b8bb06cuL))

public val ENCODER_SAVE_FLAG: Guid = Guid.fromU128(U128(0x292266fcac4047bfuL, 0x8cfca85b89a655deuL))

public val ENCODER_SCAN_METHOD: Guid = Guid.fromU128(U128(0x3a4e266131094e56uL, 0x853642c156e7dcfauL))

public val ENCODER_TRANSFORMATION: Guid = Guid.fromU128(U128(0x8d0eb2d1a58e4ea8uL, 0xaa14108074b7b6f9uL))

public val ENCODER_VERSION: Guid = Guid.fromU128(U128(0x24d18c76814a41a4uL, 0xbf531c219cccf797uL))

public val FORMAT_ID_IMAGE_INFORMATION: Guid = Guid.fromU128(U128(0xe5836cbe5eef4f1duL, 0xacdeae4c43b608ceuL))

public val FORMAT_ID_JPEG_APP_HEADERS: Guid = Guid.fromU128(U128(0x1c4afdcd617743cfuL, 0xabc75f51af39ee85uL))

public val FRAME_DIMENSION_PAGE: Guid = Guid.fromU128(U128(0x7462dc8661804c7euL, 0x8e3fee7333a7a483uL))

public val FRAME_DIMENSION_RESOLUTION: Guid = Guid.fromU128(U128(0x84236f7b3bd3428fuL, 0x8dab4ea1439ca315uL))

public val FRAME_DIMENSION_TIME: Guid = Guid.fromU128(U128(0x6aedbd6d3fb5418auL, 0x83a67f45229dc872uL))

public val HUE_SATURATION_LIGHTNESS_EFFECT_GUID: Guid = Guid.fromU128(U128(0x8b2dd6c3eb074d87uL, 0xa5f07108e26a9c5fuL))

public val IMAGE_FORMAT_BMP: Guid = Guid.fromU128(U128(0xb96b3cab072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_EMF: Guid = Guid.fromU128(U128(0xb96b3cac072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_EXIF: Guid = Guid.fromU128(U128(0xb96b3cb2072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_GIF: Guid = Guid.fromU128(U128(0xb96b3cb0072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_HEIF: Guid = Guid.fromU128(U128(0xb96b3cb6072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_ICON: Guid = Guid.fromU128(U128(0xb96b3cb5072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_JPEG: Guid = Guid.fromU128(U128(0xb96b3cae072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_MEMORY_BMP: Guid = Guid.fromU128(U128(0xb96b3caa072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_PNG: Guid = Guid.fromU128(U128(0xb96b3caf072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_TIFF: Guid = Guid.fromU128(U128(0xb96b3cb1072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_UNDEFINED: Guid = Guid.fromU128(U128(0xb96b3ca9072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_WEBP: Guid = Guid.fromU128(U128(0xb96b3cb7072811d3uL, 0x9d7b0000f81ef32euL))

public val IMAGE_FORMAT_WMF: Guid = Guid.fromU128(U128(0xb96b3cad072811d3uL, 0x9d7b0000f81ef32euL))

public val LEVELS_EFFECT_GUID: Guid = Guid.fromU128(U128(0x99c354ec2a314f3auL, 0x8c3417a803b33a25uL))

public val RED_EYE_CORRECTION_EFFECT_GUID: Guid = Guid.fromU128(U128(0x74d29d0569a44266uL, 0x95493cc52836b632uL))

public val SHARPEN_EFFECT_GUID: Guid = Guid.fromU128(U128(0x63cbf3eec526402cuL, 0x8f7162c540bf5142uL))

public val TINT_EFFECT_GUID: Guid = Guid.fromU128(U128(0x1077af0028484441uL, 0x948944ad4c2d7a2cuL))
