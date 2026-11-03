package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.core.GUID

public val ALPHA_SHIFT: UInt = 24u

public val Aborted: Status = 9

public val AccessDenied: Status = 12

public val AdjustBlackSaturation: CurveAdjustments = 7

public val AdjustContrast: CurveAdjustments = 2

public val AdjustDensity: CurveAdjustments = 1

public val AdjustExposure: CurveAdjustments = 0

public val AdjustHighlight: CurveAdjustments = 3

public val AdjustMidtone: CurveAdjustments = 5

public val AdjustShadow: CurveAdjustments = 4

public val AdjustWhiteSaturation: CurveAdjustments = 6

public val BLUE_SHIFT: UInt = 0u

public val BlurEffectGuid: GUID = GUID.from_u128(0x633c80a41843482buL, 0x9ef2be2834c5fdd4uL)

public val BrightnessContrastEffectGuid: GUID = GUID.from_u128(0xd3a1dbe18ec44c17uL, 0x9f4cea97ad1c343duL)

public val BrushTypeHatchFill: BrushType = 1

public val BrushTypeLinearGradient: BrushType = 4

public val BrushTypePathGradient: BrushType = 3

public val BrushTypeSolidColor: BrushType = 0

public val BrushTypeTextureFill: BrushType = 2

public val CodecIImageBytes: GUID = GUID.from_u128(0x25d18236c7d447buL, 0xbbdba3cbc3dfa2fcuL)

public val ColorAdjustTypeAny: ColorAdjustType = 6

public val ColorAdjustTypeBitmap: ColorAdjustType = 1

public val ColorAdjustTypeBrush: ColorAdjustType = 2

public val ColorAdjustTypeCount: ColorAdjustType = 5

public val ColorAdjustTypeDefault: ColorAdjustType = 0

public val ColorAdjustTypePen: ColorAdjustType = 3

public val ColorAdjustTypeText: ColorAdjustType = 4

public val ColorBalanceEffectGuid: GUID = GUID.from_u128(0x537e597d251e48dauL, 0x966429ca496b70f8uL)

public val ColorChannelFlagsC: ColorChannelFlags = 0

public val ColorChannelFlagsK: ColorChannelFlags = 3

public val ColorChannelFlagsLast: ColorChannelFlags = 4

public val ColorChannelFlagsM: ColorChannelFlags = 1

public val ColorChannelFlagsY: ColorChannelFlags = 2

public val ColorCurveEffectGuid: GUID = GUID.from_u128(0xdd6a002258e44a67uL, 0x9d9bd48eb881a53duL)

public val ColorLUTEffectGuid: GUID = GUID.from_u128(0xa7ce72a90f7f40d7uL, 0xb3ccd0c02d5c3212uL)

public val ColorMatrixEffectGuid: GUID = GUID.from_u128(0x718f2615793340e3uL, 0xa5115f68fe14dd74uL)

public val ColorMatrixFlagsAltGray: ColorMatrixFlags = 2

public val ColorMatrixFlagsDefault: ColorMatrixFlags = 0

public val ColorMatrixFlagsSkipGrays: ColorMatrixFlags = 1

public val ColorModeARGB32: ColorMode = 0

public val ColorModeARGB64: ColorMode = 1

public val CombineModeComplement: CombineMode = 5

public val CombineModeExclude: CombineMode = 4

public val CombineModeIntersect: CombineMode = 1

public val CombineModeReplace: CombineMode = 0

public val CombineModeUnion: CombineMode = 2

public val CombineModeXor: CombineMode = 3

public val CompositingModeSourceCopy: CompositingMode = 1

public val CompositingModeSourceOver: CompositingMode = 0

public val CompositingQualityAssumeLinear: CompositingQuality = 4

public val CompositingQualityDefault: CompositingQuality = 0

public val CompositingQualityGammaCorrected: CompositingQuality = 3

public val CompositingQualityHighQuality: CompositingQuality = 2

public val CompositingQualityHighSpeed: CompositingQuality = 1

public val CompositingQualityInvalid: CompositingQuality = -1

public val ConvertToEmfPlusFlagsDefault: ConvertToEmfPlusFlags = 0

public val ConvertToEmfPlusFlagsInvalidRecord: ConvertToEmfPlusFlags = 4

public val ConvertToEmfPlusFlagsRopUsed: ConvertToEmfPlusFlags = 1

public val ConvertToEmfPlusFlagsText: ConvertToEmfPlusFlags = 2

public val CoordinateSpaceDevice: CoordinateSpace = 2

public val CoordinateSpacePage: CoordinateSpace = 1

public val CoordinateSpaceWorld: CoordinateSpace = 0

public val CurveChannelAll: CurveChannel = 0

public val CurveChannelBlue: CurveChannel = 3

public val CurveChannelGreen: CurveChannel = 2

public val CurveChannelRed: CurveChannel = 1

public val CustomLineCapTypeAdjustableArrow: CustomLineCapType = 1

public val CustomLineCapTypeDefault: CustomLineCapType = 0

public val DashCapFlat: DashCap = 0

public val DashCapRound: DashCap = 2

public val DashCapTriangle: DashCap = 3

public val DashStyleCustom: DashStyle = 5

public val DashStyleDash: DashStyle = 1

public val DashStyleDashDot: DashStyle = 3

public val DashStyleDashDotDot: DashStyle = 4

public val DashStyleDot: DashStyle = 2

public val DashStyleSolid: DashStyle = 0

public val DebugEventLevelFatal: DebugEventLevel = 0

public val DebugEventLevelWarning: DebugEventLevel = 1

public val DitherTypeDualSpiral4x4: DitherType = 7

public val DitherTypeDualSpiral8x8: DitherType = 8

public val DitherTypeErrorDiffusion: DitherType = 9

public val DitherTypeMax: DitherType = 10

public val DitherTypeNone: DitherType = 0

public val DitherTypeOrdered16x16: DitherType = 4

public val DitherTypeOrdered4x4: DitherType = 2

public val DitherTypeOrdered8x8: DitherType = 3

public val DitherTypeSolid: DitherType = 1

public val DitherTypeSpiral4x4: DitherType = 5

public val DitherTypeSpiral8x8: DitherType = 6

public val DriverStringOptionsCmapLookup: DriverStringOptions = 1

public val DriverStringOptionsLimitSubpixel: DriverStringOptions = 8

public val DriverStringOptionsRealizedAdvance: DriverStringOptions = 4

public val DriverStringOptionsVertical: DriverStringOptions = 2

public val EmfPlusRecordTotal: EmfPlusRecordType = 16443

public val EmfPlusRecordTypeBeginContainer: EmfPlusRecordType = 16423

public val EmfPlusRecordTypeBeginContainerNoParams: EmfPlusRecordType = 16424

public val EmfPlusRecordTypeClear: EmfPlusRecordType = 16393

public val EmfPlusRecordTypeComment: EmfPlusRecordType = 16387

public val EmfPlusRecordTypeDrawArc: EmfPlusRecordType = 16402

public val EmfPlusRecordTypeDrawBeziers: EmfPlusRecordType = 16409

public val EmfPlusRecordTypeDrawClosedCurve: EmfPlusRecordType = 16407

public val EmfPlusRecordTypeDrawCurve: EmfPlusRecordType = 16408

public val EmfPlusRecordTypeDrawDriverString: EmfPlusRecordType = 16438

public val EmfPlusRecordTypeDrawEllipse: EmfPlusRecordType = 16399

public val EmfPlusRecordTypeDrawImage: EmfPlusRecordType = 16410

public val EmfPlusRecordTypeDrawImagePoints: EmfPlusRecordType = 16411

public val EmfPlusRecordTypeDrawLines: EmfPlusRecordType = 16397

public val EmfPlusRecordTypeDrawPath: EmfPlusRecordType = 16405

public val EmfPlusRecordTypeDrawPie: EmfPlusRecordType = 16401

public val EmfPlusRecordTypeDrawRects: EmfPlusRecordType = 16395

public val EmfPlusRecordTypeDrawString: EmfPlusRecordType = 16412

public val EmfPlusRecordTypeEndContainer: EmfPlusRecordType = 16425

public val EmfPlusRecordTypeEndOfFile: EmfPlusRecordType = 16386

public val EmfPlusRecordTypeFillClosedCurve: EmfPlusRecordType = 16406

public val EmfPlusRecordTypeFillEllipse: EmfPlusRecordType = 16398

public val EmfPlusRecordTypeFillPath: EmfPlusRecordType = 16404

public val EmfPlusRecordTypeFillPie: EmfPlusRecordType = 16400

public val EmfPlusRecordTypeFillPolygon: EmfPlusRecordType = 16396

public val EmfPlusRecordTypeFillRects: EmfPlusRecordType = 16394

public val EmfPlusRecordTypeFillRegion: EmfPlusRecordType = 16403

public val EmfPlusRecordTypeGetDC: EmfPlusRecordType = 16388

public val EmfPlusRecordTypeHeader: EmfPlusRecordType = 16385

public val EmfPlusRecordTypeInvalid: EmfPlusRecordType = 16384

public val EmfPlusRecordTypeMax: EmfPlusRecordType = 16442

public val EmfPlusRecordTypeMin: EmfPlusRecordType = 16385

public val EmfPlusRecordTypeMultiFormatEnd: EmfPlusRecordType = 16391

public val EmfPlusRecordTypeMultiFormatSection: EmfPlusRecordType = 16390

public val EmfPlusRecordTypeMultiFormatStart: EmfPlusRecordType = 16389

public val EmfPlusRecordTypeMultiplyWorldTransform: EmfPlusRecordType = 16428

public val EmfPlusRecordTypeObject: EmfPlusRecordType = 16392

public val EmfPlusRecordTypeOffsetClip: EmfPlusRecordType = 16437

public val EmfPlusRecordTypeResetClip: EmfPlusRecordType = 16433

public val EmfPlusRecordTypeResetWorldTransform: EmfPlusRecordType = 16427

public val EmfPlusRecordTypeRestore: EmfPlusRecordType = 16422

public val EmfPlusRecordTypeRotateWorldTransform: EmfPlusRecordType = 16431

public val EmfPlusRecordTypeSave: EmfPlusRecordType = 16421

public val EmfPlusRecordTypeScaleWorldTransform: EmfPlusRecordType = 16430

public val EmfPlusRecordTypeSerializableObject: EmfPlusRecordType = 16440

public val EmfPlusRecordTypeSetAntiAliasMode: EmfPlusRecordType = 16414

public val EmfPlusRecordTypeSetClipPath: EmfPlusRecordType = 16435

public val EmfPlusRecordTypeSetClipRect: EmfPlusRecordType = 16434

public val EmfPlusRecordTypeSetClipRegion: EmfPlusRecordType = 16436

public val EmfPlusRecordTypeSetCompositingMode: EmfPlusRecordType = 16419

public val EmfPlusRecordTypeSetCompositingQuality: EmfPlusRecordType = 16420

public val EmfPlusRecordTypeSetInterpolationMode: EmfPlusRecordType = 16417

public val EmfPlusRecordTypeSetPageTransform: EmfPlusRecordType = 16432

public val EmfPlusRecordTypeSetPixelOffsetMode: EmfPlusRecordType = 16418

public val EmfPlusRecordTypeSetRenderingOrigin: EmfPlusRecordType = 16413

public val EmfPlusRecordTypeSetTSClip: EmfPlusRecordType = 16442

public val EmfPlusRecordTypeSetTSGraphics: EmfPlusRecordType = 16441

public val EmfPlusRecordTypeSetTextContrast: EmfPlusRecordType = 16416

public val EmfPlusRecordTypeSetTextRenderingHint: EmfPlusRecordType = 16415

public val EmfPlusRecordTypeSetWorldTransform: EmfPlusRecordType = 16426

public val EmfPlusRecordTypeStrokeFillPath: EmfPlusRecordType = 16439

public val EmfPlusRecordTypeTranslateWorldTransform: EmfPlusRecordType = 16429

public val EmfRecordTypeAbortPath: EmfPlusRecordType = 68

public val EmfRecordTypeAlphaBlend: EmfPlusRecordType = 114

public val EmfRecordTypeAngleArc: EmfPlusRecordType = 41

public val EmfRecordTypeArc: EmfPlusRecordType = 45

public val EmfRecordTypeArcTo: EmfPlusRecordType = 55

public val EmfRecordTypeBeginPath: EmfPlusRecordType = 59

public val EmfRecordTypeBitBlt: EmfPlusRecordType = 76

public val EmfRecordTypeChord: EmfPlusRecordType = 46

public val EmfRecordTypeCloseFigure: EmfPlusRecordType = 61

public val EmfRecordTypeColorCorrectPalette: EmfPlusRecordType = 111

public val EmfRecordTypeColorMatchToTargetW: EmfPlusRecordType = 121

public val EmfRecordTypeCreateBrushIndirect: EmfPlusRecordType = 39

public val EmfRecordTypeCreateColorSpace: EmfPlusRecordType = 99

public val EmfRecordTypeCreateColorSpaceW: EmfPlusRecordType = 122

public val EmfRecordTypeCreateDIBPatternBrushPt: EmfPlusRecordType = 94

public val EmfRecordTypeCreateMonoBrush: EmfPlusRecordType = 93

public val EmfRecordTypeCreatePalette: EmfPlusRecordType = 49

public val EmfRecordTypeCreatePen: EmfPlusRecordType = 38

public val EmfRecordTypeDeleteColorSpace: EmfPlusRecordType = 101

public val EmfRecordTypeDeleteObject: EmfPlusRecordType = 40

public val EmfRecordTypeDrawEscape: EmfPlusRecordType = 105

public val EmfRecordTypeEOF: EmfPlusRecordType = 14

public val EmfRecordTypeEllipse: EmfPlusRecordType = 42

public val EmfRecordTypeEndPath: EmfPlusRecordType = 60

public val EmfRecordTypeExcludeClipRect: EmfPlusRecordType = 29

public val EmfRecordTypeExtCreateFontIndirect: EmfPlusRecordType = 82

public val EmfRecordTypeExtCreatePen: EmfPlusRecordType = 95

public val EmfRecordTypeExtEscape: EmfPlusRecordType = 106

public val EmfRecordTypeExtFloodFill: EmfPlusRecordType = 53

public val EmfRecordTypeExtSelectClipRgn: EmfPlusRecordType = 75

public val EmfRecordTypeExtTextOutA: EmfPlusRecordType = 83

public val EmfRecordTypeExtTextOutW: EmfPlusRecordType = 84

public val EmfRecordTypeFillPath: EmfPlusRecordType = 62

public val EmfRecordTypeFillRgn: EmfPlusRecordType = 71

public val EmfRecordTypeFlattenPath: EmfPlusRecordType = 65

public val EmfRecordTypeForceUFIMapping: EmfPlusRecordType = 109

public val EmfRecordTypeFrameRgn: EmfPlusRecordType = 72

public val EmfRecordTypeGLSBoundedRecord: EmfPlusRecordType = 103

public val EmfRecordTypeGLSRecord: EmfPlusRecordType = 102

public val EmfRecordTypeGdiComment: EmfPlusRecordType = 70

public val EmfRecordTypeGradientFill: EmfPlusRecordType = 118

public val EmfRecordTypeHeader: EmfPlusRecordType = 1

public val EmfRecordTypeIntersectClipRect: EmfPlusRecordType = 30

public val EmfRecordTypeInvertRgn: EmfPlusRecordType = 73

public val EmfRecordTypeLineTo: EmfPlusRecordType = 54

public val EmfRecordTypeMaskBlt: EmfPlusRecordType = 78

public val EmfRecordTypeMax: EmfPlusRecordType = 122

public val EmfRecordTypeMin: EmfPlusRecordType = 1

public val EmfRecordTypeModifyWorldTransform: EmfPlusRecordType = 36

public val EmfRecordTypeMoveToEx: EmfPlusRecordType = 27

public val EmfRecordTypeNamedEscape: EmfPlusRecordType = 110

public val EmfRecordTypeOffsetClipRgn: EmfPlusRecordType = 26

public val EmfRecordTypePaintRgn: EmfPlusRecordType = 74

public val EmfRecordTypePie: EmfPlusRecordType = 47

public val EmfRecordTypePixelFormat: EmfPlusRecordType = 104

public val EmfRecordTypePlgBlt: EmfPlusRecordType = 79

public val EmfRecordTypePolyBezier: EmfPlusRecordType = 2

public val EmfRecordTypePolyBezier16: EmfPlusRecordType = 85

public val EmfRecordTypePolyBezierTo: EmfPlusRecordType = 5

public val EmfRecordTypePolyBezierTo16: EmfPlusRecordType = 88

public val EmfRecordTypePolyDraw: EmfPlusRecordType = 56

public val EmfRecordTypePolyDraw16: EmfPlusRecordType = 92

public val EmfRecordTypePolyLineTo: EmfPlusRecordType = 6

public val EmfRecordTypePolyPolygon: EmfPlusRecordType = 8

public val EmfRecordTypePolyPolygon16: EmfPlusRecordType = 91

public val EmfRecordTypePolyPolyline: EmfPlusRecordType = 7

public val EmfRecordTypePolyPolyline16: EmfPlusRecordType = 90

public val EmfRecordTypePolyTextOutA: EmfPlusRecordType = 96

public val EmfRecordTypePolyTextOutW: EmfPlusRecordType = 97

public val EmfRecordTypePolygon: EmfPlusRecordType = 3

public val EmfRecordTypePolygon16: EmfPlusRecordType = 86

public val EmfRecordTypePolyline: EmfPlusRecordType = 4

public val EmfRecordTypePolyline16: EmfPlusRecordType = 87

public val EmfRecordTypePolylineTo16: EmfPlusRecordType = 89

public val EmfRecordTypeRealizePalette: EmfPlusRecordType = 52

public val EmfRecordTypeRectangle: EmfPlusRecordType = 43

public val EmfRecordTypeReserved_069: EmfPlusRecordType = 69

public val EmfRecordTypeReserved_117: EmfPlusRecordType = 117

public val EmfRecordTypeResizePalette: EmfPlusRecordType = 51

public val EmfRecordTypeRestoreDC: EmfPlusRecordType = 34

public val EmfRecordTypeRoundRect: EmfPlusRecordType = 44

public val EmfRecordTypeSaveDC: EmfPlusRecordType = 33

public val EmfRecordTypeScaleViewportExtEx: EmfPlusRecordType = 31

public val EmfRecordTypeScaleWindowExtEx: EmfPlusRecordType = 32

public val EmfRecordTypeSelectClipPath: EmfPlusRecordType = 67

public val EmfRecordTypeSelectObject: EmfPlusRecordType = 37

public val EmfRecordTypeSelectPalette: EmfPlusRecordType = 48

public val EmfRecordTypeSetArcDirection: EmfPlusRecordType = 57

public val EmfRecordTypeSetBkColor: EmfPlusRecordType = 25

public val EmfRecordTypeSetBkMode: EmfPlusRecordType = 18

public val EmfRecordTypeSetBrushOrgEx: EmfPlusRecordType = 13

public val EmfRecordTypeSetColorAdjustment: EmfPlusRecordType = 23

public val EmfRecordTypeSetColorSpace: EmfPlusRecordType = 100

public val EmfRecordTypeSetDIBitsToDevice: EmfPlusRecordType = 80

public val EmfRecordTypeSetICMMode: EmfPlusRecordType = 98

public val EmfRecordTypeSetICMProfileA: EmfPlusRecordType = 112

public val EmfRecordTypeSetICMProfileW: EmfPlusRecordType = 113

public val EmfRecordTypeSetLayout: EmfPlusRecordType = 115

public val EmfRecordTypeSetLinkedUFIs: EmfPlusRecordType = 119

public val EmfRecordTypeSetMapMode: EmfPlusRecordType = 17

public val EmfRecordTypeSetMapperFlags: EmfPlusRecordType = 16

public val EmfRecordTypeSetMetaRgn: EmfPlusRecordType = 28

public val EmfRecordTypeSetMiterLimit: EmfPlusRecordType = 58

public val EmfRecordTypeSetPaletteEntries: EmfPlusRecordType = 50

public val EmfRecordTypeSetPixelV: EmfPlusRecordType = 15

public val EmfRecordTypeSetPolyFillMode: EmfPlusRecordType = 19

public val EmfRecordTypeSetROP2: EmfPlusRecordType = 20

public val EmfRecordTypeSetStretchBltMode: EmfPlusRecordType = 21

public val EmfRecordTypeSetTextAlign: EmfPlusRecordType = 22

public val EmfRecordTypeSetTextColor: EmfPlusRecordType = 24

public val EmfRecordTypeSetTextJustification: EmfPlusRecordType = 120

public val EmfRecordTypeSetViewportExtEx: EmfPlusRecordType = 11

public val EmfRecordTypeSetViewportOrgEx: EmfPlusRecordType = 12

public val EmfRecordTypeSetWindowExtEx: EmfPlusRecordType = 9

public val EmfRecordTypeSetWindowOrgEx: EmfPlusRecordType = 10

public val EmfRecordTypeSetWorldTransform: EmfPlusRecordType = 35

public val EmfRecordTypeSmallTextOut: EmfPlusRecordType = 108

public val EmfRecordTypeStartDoc: EmfPlusRecordType = 107

public val EmfRecordTypeStretchBlt: EmfPlusRecordType = 77

public val EmfRecordTypeStretchDIBits: EmfPlusRecordType = 81

public val EmfRecordTypeStrokeAndFillPath: EmfPlusRecordType = 63

public val EmfRecordTypeStrokePath: EmfPlusRecordType = 64

public val EmfRecordTypeTransparentBlt: EmfPlusRecordType = 116

public val EmfRecordTypeWidenPath: EmfPlusRecordType = 66

public val EmfToWmfBitsFlagsDefault: EmfToWmfBitsFlags = 0

public val EmfToWmfBitsFlagsEmbedEmf: EmfToWmfBitsFlags = 1

public val EmfToWmfBitsFlagsIncludePlaceable: EmfToWmfBitsFlags = 2

public val EmfToWmfBitsFlagsNoXORClip: EmfToWmfBitsFlags = 4

public val EmfTypeEmfOnly: EmfType = 3

public val EmfTypeEmfPlusDual: EmfType = 5

public val EmfTypeEmfPlusOnly: EmfType = 4

public val EncoderChrominanceTable: GUID = GUID.from_u128(0xf2e455dc09b34316uL, 0x8260676ada32481cuL)

public val EncoderColorDepth: GUID = GUID.from_u128(0x66087055ad664c7cuL, 0x9a1838a2310b8337uL)

public val EncoderColorSpace: GUID = GUID.from_u128(0xae7a62a0ee2c49d8uL, 0x9d071ba8a927596euL)

public val EncoderCompression: GUID = GUID.from_u128(0xe09d739dccd444eeuL, 0x8eba3fbf8be4fc58uL)

public val EncoderImageItems: GUID = GUID.from_u128(0x63875e131f1d45abuL, 0x9195a29b6066a650uL)

public val EncoderLuminanceTable: GUID = GUID.from_u128(0xedb33bce02664a77uL, 0xb90427216099e717uL)

public val EncoderParameterValueTypeASCII: EncoderParameterValueType = 2

public val EncoderParameterValueTypeByte: EncoderParameterValueType = 1

public val EncoderParameterValueTypeLong: EncoderParameterValueType = 4

public val EncoderParameterValueTypeLongRange: EncoderParameterValueType = 6

public val EncoderParameterValueTypePointer: EncoderParameterValueType = 9

public val EncoderParameterValueTypeRational: EncoderParameterValueType = 5

public val EncoderParameterValueTypeRationalRange: EncoderParameterValueType = 8

public val EncoderParameterValueTypeShort: EncoderParameterValueType = 3

public val EncoderParameterValueTypeUndefined: EncoderParameterValueType = 7

public val EncoderQuality: GUID = GUID.from_u128(0x1d5be4b5fa4a452duL, 0x9cdd5db35105e7ebuL)

public val EncoderRenderMethod: GUID = GUID.from_u128(0x6d42c53a229a4825uL, 0x8bb75c99e2b9a8b8uL)

public val EncoderSaveAsCMYK: GUID = GUID.from_u128(0xa219bbc90a9d4005uL, 0xa3ee3a421b8bb06cuL)

public val EncoderSaveFlag: GUID = GUID.from_u128(0x292266fcac4047bfuL, 0x8cfca85b89a655deuL)

public val EncoderScanMethod: GUID = GUID.from_u128(0x3a4e266131094e56uL, 0x853642c156e7dcfauL)

public val EncoderTransformation: GUID = GUID.from_u128(0x8d0eb2d1a58e4ea8uL, 0xaa14108074b7b6f9uL)

public val EncoderValueColorTypeCMYK: EncoderValue = 0

public val EncoderValueColorTypeGray: EncoderValue = 24

public val EncoderValueColorTypeRGB: EncoderValue = 25

public val EncoderValueColorTypeYCCK: EncoderValue = 1

public val EncoderValueCompressionCCITT3: EncoderValue = 3

public val EncoderValueCompressionCCITT4: EncoderValue = 4

public val EncoderValueCompressionLZW: EncoderValue = 2

public val EncoderValueCompressionNone: EncoderValue = 6

public val EncoderValueCompressionRle: EncoderValue = 5

public val EncoderValueFlush: EncoderValue = 20

public val EncoderValueFrameDimensionPage: EncoderValue = 23

public val EncoderValueFrameDimensionResolution: EncoderValue = 22

public val EncoderValueFrameDimensionTime: EncoderValue = 21

public val EncoderValueLastFrame: EncoderValue = 19

public val EncoderValueMultiFrame: EncoderValue = 18

public val EncoderValueRenderNonProgressive: EncoderValue = 12

public val EncoderValueRenderProgressive: EncoderValue = 11

public val EncoderValueScanMethodInterlaced: EncoderValue = 7

public val EncoderValueScanMethodNonInterlaced: EncoderValue = 8

public val EncoderValueTransformFlipHorizontal: EncoderValue = 16

public val EncoderValueTransformFlipVertical: EncoderValue = 17

public val EncoderValueTransformRotate180: EncoderValue = 14

public val EncoderValueTransformRotate270: EncoderValue = 15

public val EncoderValueTransformRotate90: EncoderValue = 13

public val EncoderValueVersionGif87: EncoderValue = 9

public val EncoderValueVersionGif89: EncoderValue = 10

public val EncoderVersion: GUID = GUID.from_u128(0x24d18c76814a41a4uL, 0xbf531c219cccf797uL)

public val FileNotFound: Status = 10

public val FillModeAlternate: FillMode = 0

public val FillModeWinding: FillMode = 1

public val FlatnessDefault: Float = 0.25f

public val FlushIntentionFlush: FlushIntention = 0

public val FlushIntentionSync: FlushIntention = 1

public val FontFamilyNotFound: Status = 14

public val FontStyleBold: FontStyle = 1

public val FontStyleBoldItalic: FontStyle = 3

public val FontStyleItalic: FontStyle = 2

public val FontStyleNotFound: Status = 15

public val FontStyleRegular: FontStyle = 0

public val FontStyleStrikeout: FontStyle = 8

public val FontStyleUnderline: FontStyle = 4

public val FormatIDImageInformation: GUID = GUID.from_u128(0xe5836cbe5eef4f1duL, 0xacdeae4c43b608ceuL)

public val FormatIDJpegAppHeaders: GUID = GUID.from_u128(0x1c4afdcd617743cfuL, 0xabc75f51af39ee85uL)

public val FrameDimensionPage: GUID = GUID.from_u128(0x7462dc8661804c7euL, 0x8e3fee7333a7a483uL)

public val FrameDimensionResolution: GUID = GUID.from_u128(0x84236f7b3bd3428fuL, 0x8dab4ea1439ca315uL)

public val FrameDimensionTime: GUID = GUID.from_u128(0x6aedbd6d3fb5418auL, 0x83a67f45229dc872uL)

public val GDIP_EMFPLUSFLAGS_DISPLAY: UInt = 1u

public val GDIP_EMFPLUS_RECORD_BASE: UInt = 16384u

public val GDIP_WMF_RECORD_BASE: UInt = 65536u

public val GREEN_SHIFT: UInt = 8u

public val GdiplusNotInitialized: Status = 18

public val GdiplusStartupDefault: GdiplusStartupParams = 0

public val GdiplusStartupNoSetRound: GdiplusStartupParams = 1

public val GdiplusStartupSetPSValue: GdiplusStartupParams = 2

public val GdiplusStartupTransparencyMask: GdiplusStartupParams = -16777216

public val GenericError: Status = 1

public val GenericFontFamilyMonospace: GenericFontFamily = 2

public val GenericFontFamilySansSerif: GenericFontFamily = 1

public val GenericFontFamilySerif: GenericFontFamily = 0

public val HatchStyle05Percent: HatchStyle = 6

public val HatchStyle10Percent: HatchStyle = 7

public val HatchStyle20Percent: HatchStyle = 8

public val HatchStyle25Percent: HatchStyle = 9

public val HatchStyle30Percent: HatchStyle = 10

public val HatchStyle40Percent: HatchStyle = 11

public val HatchStyle50Percent: HatchStyle = 12

public val HatchStyle60Percent: HatchStyle = 13

public val HatchStyle70Percent: HatchStyle = 14

public val HatchStyle75Percent: HatchStyle = 15

public val HatchStyle80Percent: HatchStyle = 16

public val HatchStyle90Percent: HatchStyle = 17

public val HatchStyleBackwardDiagonal: HatchStyle = 3

public val HatchStyleCross: HatchStyle = 4

public val HatchStyleDarkDownwardDiagonal: HatchStyle = 20

public val HatchStyleDarkHorizontal: HatchStyle = 29

public val HatchStyleDarkUpwardDiagonal: HatchStyle = 21

public val HatchStyleDarkVertical: HatchStyle = 28

public val HatchStyleDashedDownwardDiagonal: HatchStyle = 30

public val HatchStyleDashedHorizontal: HatchStyle = 32

public val HatchStyleDashedUpwardDiagonal: HatchStyle = 31

public val HatchStyleDashedVertical: HatchStyle = 33

public val HatchStyleDiagonalBrick: HatchStyle = 38

public val HatchStyleDiagonalCross: HatchStyle = 5

public val HatchStyleDivot: HatchStyle = 42

public val HatchStyleDottedDiamond: HatchStyle = 44

public val HatchStyleDottedGrid: HatchStyle = 43

public val HatchStyleForwardDiagonal: HatchStyle = 2

public val HatchStyleHorizontal: HatchStyle = 0

public val HatchStyleHorizontalBrick: HatchStyle = 39

public val HatchStyleLargeCheckerBoard: HatchStyle = 50

public val HatchStyleLargeConfetti: HatchStyle = 35

public val HatchStyleLargeGrid: HatchStyle = 4

public val HatchStyleLightDownwardDiagonal: HatchStyle = 18

public val HatchStyleLightHorizontal: HatchStyle = 25

public val HatchStyleLightUpwardDiagonal: HatchStyle = 19

public val HatchStyleLightVertical: HatchStyle = 24

public val HatchStyleMax: HatchStyle = 52

public val HatchStyleMin: HatchStyle = 0

public val HatchStyleNarrowHorizontal: HatchStyle = 27

public val HatchStyleNarrowVertical: HatchStyle = 26

public val HatchStyleOutlinedDiamond: HatchStyle = 51

public val HatchStylePlaid: HatchStyle = 41

public val HatchStyleShingle: HatchStyle = 45

public val HatchStyleSmallCheckerBoard: HatchStyle = 49

public val HatchStyleSmallConfetti: HatchStyle = 34

public val HatchStyleSmallGrid: HatchStyle = 48

public val HatchStyleSolidDiamond: HatchStyle = 52

public val HatchStyleSphere: HatchStyle = 47

public val HatchStyleTotal: HatchStyle = 53

public val HatchStyleTrellis: HatchStyle = 46

public val HatchStyleVertical: HatchStyle = 1

public val HatchStyleWave: HatchStyle = 37

public val HatchStyleWeave: HatchStyle = 40

public val HatchStyleWideDownwardDiagonal: HatchStyle = 22

public val HatchStyleWideUpwardDiagonal: HatchStyle = 23

public val HatchStyleZigZag: HatchStyle = 36

public val HistogramFormatA: HistogramFormat = 7

public val HistogramFormatARGB: HistogramFormat = 0

public val HistogramFormatB: HistogramFormat = 4

public val HistogramFormatG: HistogramFormat = 5

public val HistogramFormatGray: HistogramFormat = 3

public val HistogramFormatPARGB: HistogramFormat = 1

public val HistogramFormatR: HistogramFormat = 6

public val HistogramFormatRGB: HistogramFormat = 2

public val HotkeyPrefixHide: HotkeyPrefix = 2

public val HotkeyPrefixNone: HotkeyPrefix = 0

public val HotkeyPrefixShow: HotkeyPrefix = 1

public val HueSaturationLightnessEffectGuid: GUID = GUID.from_u128(0x8b2dd6c3eb074d87uL, 0xa5f07108e26a9c5fuL)

public val ImageCodecFlagsBlockingDecode: ImageCodecFlags = 32

public val ImageCodecFlagsBuiltin: ImageCodecFlags = 65536

public val ImageCodecFlagsDecoder: ImageCodecFlags = 2

public val ImageCodecFlagsEncoder: ImageCodecFlags = 1

public val ImageCodecFlagsSeekableEncode: ImageCodecFlags = 16

public val ImageCodecFlagsSupportBitmap: ImageCodecFlags = 4

public val ImageCodecFlagsSupportVector: ImageCodecFlags = 8

public val ImageCodecFlagsSystem: ImageCodecFlags = 131072

public val ImageCodecFlagsUser: ImageCodecFlags = 262144

public val ImageFlagsCaching: ImageFlags = 131072

public val ImageFlagsColorSpaceCMYK: ImageFlags = 32

public val ImageFlagsColorSpaceGRAY: ImageFlags = 64

public val ImageFlagsColorSpaceRGB: ImageFlags = 16

public val ImageFlagsColorSpaceYCBCR: ImageFlags = 128

public val ImageFlagsColorSpaceYCCK: ImageFlags = 256

public val ImageFlagsHasAlpha: ImageFlags = 2

public val ImageFlagsHasRealDPI: ImageFlags = 4096

public val ImageFlagsHasRealPixelSize: ImageFlags = 8192

public val ImageFlagsHasTranslucent: ImageFlags = 4

public val ImageFlagsNone: ImageFlags = 0

public val ImageFlagsPartiallyScalable: ImageFlags = 8

public val ImageFlagsReadOnly: ImageFlags = 65536

public val ImageFlagsScalable: ImageFlags = 1

public val ImageFormatBMP: GUID = GUID.from_u128(0xb96b3cab072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatEMF: GUID = GUID.from_u128(0xb96b3cac072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatEXIF: GUID = GUID.from_u128(0xb96b3cb2072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatGIF: GUID = GUID.from_u128(0xb96b3cb0072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatHEIF: GUID = GUID.from_u128(0xb96b3cb6072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatIcon: GUID = GUID.from_u128(0xb96b3cb5072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatJPEG: GUID = GUID.from_u128(0xb96b3cae072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatMemoryBMP: GUID = GUID.from_u128(0xb96b3caa072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatPNG: GUID = GUID.from_u128(0xb96b3caf072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatTIFF: GUID = GUID.from_u128(0xb96b3cb1072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatUndefined: GUID = GUID.from_u128(0xb96b3ca9072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatWEBP: GUID = GUID.from_u128(0xb96b3cb7072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageFormatWMF: GUID = GUID.from_u128(0xb96b3cad072811d3uL, 0x9d7b0000f81ef32euL)

public val ImageLockModeRead: ImageLockMode = 1

public val ImageLockModeUserInputBuf: ImageLockMode = 4

public val ImageLockModeWrite: ImageLockMode = 2

public val ImageTypeBitmap: ImageType = 1

public val ImageTypeMetafile: ImageType = 2

public val ImageTypeUnknown: ImageType = 0

public val InsufficientBuffer: Status = 5

public val InterpolationModeBicubic: InterpolationMode = 4

public val InterpolationModeBilinear: InterpolationMode = 3

public val InterpolationModeDefault: InterpolationMode = 0

public val InterpolationModeHighQuality: InterpolationMode = 2

public val InterpolationModeHighQualityBicubic: InterpolationMode = 7

public val InterpolationModeHighQualityBilinear: InterpolationMode = 6

public val InterpolationModeInvalid: InterpolationMode = -1

public val InterpolationModeLowQuality: InterpolationMode = 1

public val InterpolationModeNearestNeighbor: InterpolationMode = 5

public val InvalidParameter: Status = 2

public val ItemDataPositionAfterBits: ItemDataPosition = 2

public val ItemDataPositionAfterHeader: ItemDataPosition = 0

public val ItemDataPositionAfterPalette: ItemDataPosition = 1

public val LevelsEffectGuid: GUID = GUID.from_u128(0x99c354ec2a314f3auL, 0x8c3417a803b33a25uL)

public val LineCapAnchorMask: LineCap = 240

public val LineCapArrowAnchor: LineCap = 20

public val LineCapCustom: LineCap = 255

public val LineCapDiamondAnchor: LineCap = 19

public val LineCapFlat: LineCap = 0

public val LineCapNoAnchor: LineCap = 16

public val LineCapRound: LineCap = 2

public val LineCapRoundAnchor: LineCap = 18

public val LineCapSquare: LineCap = 1

public val LineCapSquareAnchor: LineCap = 17

public val LineCapTriangle: LineCap = 3

public val LineJoinBevel: LineJoin = 1

public val LineJoinMiter: LineJoin = 0

public val LineJoinMiterClipped: LineJoin = 3

public val LineJoinRound: LineJoin = 2

public val LinearGradientModeBackwardDiagonal: LinearGradientMode = 3

public val LinearGradientModeForwardDiagonal: LinearGradientMode = 2

public val LinearGradientModeHorizontal: LinearGradientMode = 0

public val LinearGradientModeVertical: LinearGradientMode = 1

public val MatrixOrderAppend: MatrixOrder = 1

public val MatrixOrderPrepend: MatrixOrder = 0

public val MetafileFrameUnitDocument: MetafileFrameUnit = 5

public val MetafileFrameUnitGdi: MetafileFrameUnit = 7

public val MetafileFrameUnitInch: MetafileFrameUnit = 4

public val MetafileFrameUnitMillimeter: MetafileFrameUnit = 6

public val MetafileFrameUnitPixel: MetafileFrameUnit = 2

public val MetafileFrameUnitPoint: MetafileFrameUnit = 3

public val MetafileTypeEmf: MetafileType = 3

public val MetafileTypeEmfPlusDual: MetafileType = 5

public val MetafileTypeEmfPlusOnly: MetafileType = 4

public val MetafileTypeInvalid: MetafileType = 0

public val MetafileTypeWmf: MetafileType = 1

public val MetafileTypeWmfPlaceable: MetafileType = 2

public val UNSUPPORTED_CASE: Status = 6

public val NotTrueTypeFont: Status = 16

public val ObjectBusy: Status = 4

public val ObjectTypeBrush: ObjectType = 1

public val ObjectTypeCustomLineCap: ObjectType = 9

public val ObjectTypeFont: ObjectType = 6

public val ObjectTypeGraphics: ObjectType = 10

public val ObjectTypeImage: ObjectType = 5

public val ObjectTypeImageAttributes: ObjectType = 8

public val ObjectTypeInvalid: ObjectType = 0

public val ObjectTypeMax: ObjectType = 10

public val ObjectTypeMin: ObjectType = 1

public val ObjectTypePath: ObjectType = 3

public val ObjectTypePen: ObjectType = 2

public val ObjectTypeRegion: ObjectType = 4

public val ObjectTypeStringFormat: ObjectType = 7

public val Ok: Status = 0

public val OutOfMemory: Status = 3

public val PaletteFlagsGrayScale: PaletteFlags = 2

public val PaletteFlagsHalftone: PaletteFlags = 4

public val PaletteFlagsHasAlpha: PaletteFlags = 1

public val PaletteTypeCustom: PaletteType = 0

public val PaletteTypeFixedBW: PaletteType = 2

public val PaletteTypeFixedHalftone125: PaletteType = 6

public val PaletteTypeFixedHalftone216: PaletteType = 7

public val PaletteTypeFixedHalftone252: PaletteType = 8

public val PaletteTypeFixedHalftone256: PaletteType = 9

public val PaletteTypeFixedHalftone27: PaletteType = 4

public val PaletteTypeFixedHalftone64: PaletteType = 5

public val PaletteTypeFixedHalftone8: PaletteType = 3

public val PaletteTypeOptimal: PaletteType = 1

public val PathPointTypeBezier: PathPointType = 3

public val PathPointTypeBezier3: PathPointType = 3

public val PathPointTypeCloseSubpath: PathPointType = 128

public val PathPointTypeDashMode: PathPointType = 16

public val PathPointTypeLine: PathPointType = 1

public val PathPointTypePathMarker: PathPointType = 32

public val PathPointTypePathTypeMask: PathPointType = 7

public val PathPointTypeStart: PathPointType = 0

public val PenAlignmentCenter: PenAlignment = 0

public val PenAlignmentInset: PenAlignment = 1

public val PenTypeHatchFill: PenType = 1

public val PenTypeLinearGradient: PenType = 4

public val PenTypePathGradient: PenType = 3

public val PenTypeSolidColor: PenType = 0

public val PenTypeTextureFill: PenType = 2

public val PenTypeUnknown: PenType = -1

public val PixelFormatAlpha: UInt = 262144u

public val PixelFormatCanonical: UInt = 2097152u

public val PixelFormatDontCare: UInt = 0u

public val PixelFormatExtended: UInt = 1048576u

public val PixelFormatGDI: UInt = 131072u

public val PixelFormatIndexed: UInt = 65536u

public val PixelFormatMax: UInt = 16u

public val PixelFormatPAlpha: UInt = 524288u

public val PixelFormatUndefined: UInt = 0u

public val PixelOffsetModeDefault: PixelOffsetMode = 0

public val PixelOffsetModeHalf: PixelOffsetMode = 4

public val PixelOffsetModeHighQuality: PixelOffsetMode = 2

public val PixelOffsetModeHighSpeed: PixelOffsetMode = 1

public val PixelOffsetModeInvalid: PixelOffsetMode = -1

public val PixelOffsetModeNone: PixelOffsetMode = 3

public val ProfileNotFound: Status = 21

public val PropertyNotFound: Status = 19

public val PropertyNotSupported: Status = 20

public val PropertyTagArtist: UInt = 315u

public val PropertyTagBitsPerSample: UInt = 258u

public val PropertyTagCellHeight: UInt = 265u

public val PropertyTagCellWidth: UInt = 264u

public val PropertyTagChrominanceTable: UInt = 20625u

public val PropertyTagColorMap: UInt = 320u

public val PropertyTagColorTransferFunction: UInt = 20506u

public val PropertyTagCompression: UInt = 259u

public val PropertyTagCopyright: UInt = 33432u

public val PropertyTagDateTime: UInt = 306u

public val PropertyTagDocumentName: UInt = 269u

public val PropertyTagDotRange: UInt = 336u

public val PropertyTagEquipMake: UInt = 271u

public val PropertyTagEquipModel: UInt = 272u

public val PropertyTagExifAperture: UInt = 37378u

public val PropertyTagExifBrightness: UInt = 37379u

public val PropertyTagExifCfaPattern: UInt = 41730u

public val PropertyTagExifColorSpace: UInt = 40961u

public val PropertyTagExifCompBPP: UInt = 37122u

public val PropertyTagExifCompConfig: UInt = 37121u

public val PropertyTagExifContrast: UInt = 41992u

public val PropertyTagExifCustomRendered: UInt = 41985u

public val PropertyTagExifDTDigSS: UInt = 37522u

public val PropertyTagExifDTDigitized: UInt = 36868u

public val PropertyTagExifDTOrig: UInt = 36867u

public val PropertyTagExifDTOrigSS: UInt = 37521u

public val PropertyTagExifDTSubsec: UInt = 37520u

public val PropertyTagExifDeviceSettingDesc: UInt = 41995u

public val PropertyTagExifDigitalZoomRatio: UInt = 41988u

public val PropertyTagExifExposureBias: UInt = 37380u

public val PropertyTagExifExposureIndex: UInt = 41493u

public val PropertyTagExifExposureMode: UInt = 41986u

public val PropertyTagExifExposureProg: UInt = 34850u

public val PropertyTagExifExposureTime: UInt = 33434u

public val PropertyTagExifFNumber: UInt = 33437u

public val PropertyTagExifFPXVer: UInt = 40960u

public val PropertyTagExifFileSource: UInt = 41728u

public val PropertyTagExifFlash: UInt = 37385u

public val PropertyTagExifFlashEnergy: UInt = 41483u

public val PropertyTagExifFocalLength: UInt = 37386u

public val PropertyTagExifFocalLengthIn35mmFilm: UInt = 41989u

public val PropertyTagExifFocalResUnit: UInt = 41488u

public val PropertyTagExifFocalXRes: UInt = 41486u

public val PropertyTagExifFocalYRes: UInt = 41487u

public val PropertyTagExifGainControl: UInt = 41991u

public val PropertyTagExifIFD: UInt = 34665u

public val PropertyTagExifISOSpeed: UInt = 34855u

public val PropertyTagExifInterop: UInt = 40965u

public val PropertyTagExifLightSource: UInt = 37384u

public val PropertyTagExifMakerNote: UInt = 37500u

public val PropertyTagExifMaxAperture: UInt = 37381u

public val PropertyTagExifMeteringMode: UInt = 37383u

public val PropertyTagExifOECF: UInt = 34856u

public val PropertyTagExifPixXDim: UInt = 40962u

public val PropertyTagExifPixYDim: UInt = 40963u

public val PropertyTagExifRelatedWav: UInt = 40964u

public val PropertyTagExifSaturation: UInt = 41993u

public val PropertyTagExifSceneCaptureType: UInt = 41990u

public val PropertyTagExifSceneType: UInt = 41729u

public val PropertyTagExifSensingMethod: UInt = 41495u

public val PropertyTagExifSharpness: UInt = 41994u

public val PropertyTagExifShutterSpeed: UInt = 37377u

public val PropertyTagExifSpatialFR: UInt = 41484u

public val PropertyTagExifSpectralSense: UInt = 34852u

public val PropertyTagExifSubjectArea: UInt = 37396u

public val PropertyTagExifSubjectDist: UInt = 37382u

public val PropertyTagExifSubjectDistanceRange: UInt = 41996u

public val PropertyTagExifSubjectLoc: UInt = 41492u

public val PropertyTagExifUniqueImageID: UInt = 42016u

public val PropertyTagExifUserComment: UInt = 37510u

public val PropertyTagExifVer: UInt = 36864u

public val PropertyTagExifWhiteBalance: UInt = 41987u

public val PropertyTagExtraSamples: UInt = 338u

public val PropertyTagFillOrder: UInt = 266u

public val PropertyTagFrameDelay: UInt = 20736u

public val PropertyTagFreeByteCounts: UInt = 289u

public val PropertyTagFreeOffset: UInt = 288u

public val PropertyTagGamma: UInt = 769u

public val PropertyTagGlobalPalette: UInt = 20738u

public val PropertyTagGpsAltitude: UInt = 6u

public val PropertyTagGpsAltitudeRef: UInt = 5u

public val PropertyTagGpsAreaInformation: UInt = 28u

public val PropertyTagGpsDate: UInt = 29u

public val PropertyTagGpsDestBear: UInt = 24u

public val PropertyTagGpsDestBearRef: UInt = 23u

public val PropertyTagGpsDestDist: UInt = 26u

public val PropertyTagGpsDestDistRef: UInt = 25u

public val PropertyTagGpsDestLat: UInt = 20u

public val PropertyTagGpsDestLatRef: UInt = 19u

public val PropertyTagGpsDestLong: UInt = 22u

public val PropertyTagGpsDestLongRef: UInt = 21u

public val PropertyTagGpsDifferential: UInt = 30u

public val PropertyTagGpsGpsDop: UInt = 11u

public val PropertyTagGpsGpsMeasureMode: UInt = 10u

public val PropertyTagGpsGpsSatellites: UInt = 8u

public val PropertyTagGpsGpsStatus: UInt = 9u

public val PropertyTagGpsGpsTime: UInt = 7u

public val PropertyTagGpsIFD: UInt = 34853u

public val PropertyTagGpsImgDir: UInt = 17u

public val PropertyTagGpsImgDirRef: UInt = 16u

public val PropertyTagGpsLatitude: UInt = 2u

public val PropertyTagGpsLatitudeRef: UInt = 1u

public val PropertyTagGpsLongitude: UInt = 4u

public val PropertyTagGpsLongitudeRef: UInt = 3u

public val PropertyTagGpsMapDatum: UInt = 18u

public val PropertyTagGpsProcessingMethod: UInt = 27u

public val PropertyTagGpsSpeed: UInt = 13u

public val PropertyTagGpsSpeedRef: UInt = 12u

public val PropertyTagGpsTrack: UInt = 15u

public val PropertyTagGpsTrackRef: UInt = 14u

public val PropertyTagGpsVer: UInt = 0u

public val PropertyTagGrayResponseCurve: UInt = 291u

public val PropertyTagGrayResponseUnit: UInt = 290u

public val PropertyTagGridSize: UInt = 20497u

public val PropertyTagHalftoneDegree: UInt = 20492u

public val PropertyTagHalftoneHints: UInt = 321u

public val PropertyTagHalftoneLPI: UInt = 20490u

public val PropertyTagHalftoneLPIUnit: UInt = 20491u

public val PropertyTagHalftoneMisc: UInt = 20494u

public val PropertyTagHalftoneScreen: UInt = 20495u

public val PropertyTagHalftoneShape: UInt = 20493u

public val PropertyTagHostComputer: UInt = 316u

public val PropertyTagICCProfile: UInt = 34675u

public val PropertyTagICCProfileDescriptor: UInt = 770u

public val PropertyTagImageDescription: UInt = 270u

public val PropertyTagImageHeight: UInt = 257u

public val PropertyTagImageTitle: UInt = 800u

public val PropertyTagImageWidth: UInt = 256u

public val PropertyTagIndexBackground: UInt = 20739u

public val PropertyTagIndexTransparent: UInt = 20740u

public val PropertyTagInkNames: UInt = 333u

public val PropertyTagInkSet: UInt = 332u

public val PropertyTagJPEGACTables: UInt = 521u

public val PropertyTagJPEGDCTables: UInt = 520u

public val PropertyTagJPEGInterFormat: UInt = 513u

public val PropertyTagJPEGInterLength: UInt = 514u

public val PropertyTagJPEGLosslessPredictors: UInt = 517u

public val PropertyTagJPEGPointTransforms: UInt = 518u

public val PropertyTagJPEGProc: UInt = 512u

public val PropertyTagJPEGQTables: UInt = 519u

public val PropertyTagJPEGQuality: UInt = 20496u

public val PropertyTagJPEGRestartInterval: UInt = 515u

public val PropertyTagLoopCount: UInt = 20737u

public val PropertyTagLuminanceTable: UInt = 20624u

public val PropertyTagMaxSampleValue: UInt = 281u

public val PropertyTagMinSampleValue: UInt = 280u

public val PropertyTagNewSubfileType: UInt = 254u

public val PropertyTagNumberOfInks: UInt = 334u

public val PropertyTagOrientation: UInt = 274u

public val PropertyTagPageName: UInt = 285u

public val PropertyTagPageNumber: UInt = 297u

public val PropertyTagPaletteHistogram: UInt = 20755u

public val PropertyTagPhotometricInterp: UInt = 262u

public val PropertyTagPixelPerUnitX: UInt = 20753u

public val PropertyTagPixelPerUnitY: UInt = 20754u

public val PropertyTagPixelUnit: UInt = 20752u

public val PropertyTagPlanarConfig: UInt = 284u

public val PropertyTagPredictor: UInt = 317u

public val PropertyTagPrimaryChromaticities: UInt = 319u

public val PropertyTagPrintFlags: UInt = 20485u

public val PropertyTagPrintFlagsBleedWidth: UInt = 20488u

public val PropertyTagPrintFlagsBleedWidthScale: UInt = 20489u

public val PropertyTagPrintFlagsCrop: UInt = 20487u

public val PropertyTagPrintFlagsVersion: UInt = 20486u

public val PropertyTagREFBlackWhite: UInt = 532u

public val PropertyTagResolutionUnit: UInt = 296u

public val PropertyTagResolutionXLengthUnit: UInt = 20483u

public val PropertyTagResolutionXUnit: UInt = 20481u

public val PropertyTagResolutionYLengthUnit: UInt = 20484u

public val PropertyTagResolutionYUnit: UInt = 20482u

public val PropertyTagRowsPerStrip: UInt = 278u

public val PropertyTagSMaxSampleValue: UInt = 341u

public val PropertyTagSMinSampleValue: UInt = 340u

public val PropertyTagSRGBRenderingIntent: UInt = 771u

public val PropertyTagSampleFormat: UInt = 339u

public val PropertyTagSamplesPerPixel: UInt = 277u

public val PropertyTagSoftwareUsed: UInt = 305u

public val PropertyTagStripBytesCount: UInt = 279u

public val PropertyTagStripOffsets: UInt = 273u

public val PropertyTagSubfileType: UInt = 255u

public val PropertyTagT4Option: UInt = 292u

public val PropertyTagT6Option: UInt = 293u

public val PropertyTagTargetPrinter: UInt = 337u

public val PropertyTagThreshHolding: UInt = 263u

public val PropertyTagThumbnailArtist: UInt = 20532u

public val PropertyTagThumbnailBitsPerSample: UInt = 20514u

public val PropertyTagThumbnailColorDepth: UInt = 20501u

public val PropertyTagThumbnailCompressedSize: UInt = 20505u

public val PropertyTagThumbnailCompression: UInt = 20515u

public val PropertyTagThumbnailCopyRight: UInt = 20539u

public val PropertyTagThumbnailData: UInt = 20507u

public val PropertyTagThumbnailDateTime: UInt = 20531u

public val PropertyTagThumbnailEquipMake: UInt = 20518u

public val PropertyTagThumbnailEquipModel: UInt = 20519u

public val PropertyTagThumbnailFormat: UInt = 20498u

public val PropertyTagThumbnailHeight: UInt = 20500u

public val PropertyTagThumbnailImageDescription: UInt = 20517u

public val PropertyTagThumbnailImageHeight: UInt = 20513u

public val PropertyTagThumbnailImageWidth: UInt = 20512u

public val PropertyTagThumbnailOrientation: UInt = 20521u

public val PropertyTagThumbnailPhotometricInterp: UInt = 20516u

public val PropertyTagThumbnailPlanarConfig: UInt = 20527u

public val PropertyTagThumbnailPlanes: UInt = 20502u

public val PropertyTagThumbnailPrimaryChromaticities: UInt = 20534u

public val PropertyTagThumbnailRawBytes: UInt = 20503u

public val PropertyTagThumbnailRefBlackWhite: UInt = 20538u

public val PropertyTagThumbnailResolutionUnit: UInt = 20528u

public val PropertyTagThumbnailResolutionX: UInt = 20525u

public val PropertyTagThumbnailResolutionY: UInt = 20526u

public val PropertyTagThumbnailRowsPerStrip: UInt = 20523u

public val PropertyTagThumbnailSamplesPerPixel: UInt = 20522u

public val PropertyTagThumbnailSize: UInt = 20504u

public val PropertyTagThumbnailSoftwareUsed: UInt = 20530u

public val PropertyTagThumbnailStripBytesCount: UInt = 20524u

public val PropertyTagThumbnailStripOffsets: UInt = 20520u

public val PropertyTagThumbnailTransferFunction: UInt = 20529u

public val PropertyTagThumbnailWhitePoint: UInt = 20533u

public val PropertyTagThumbnailWidth: UInt = 20499u

public val PropertyTagThumbnailYCbCrCoefficients: UInt = 20535u

public val PropertyTagThumbnailYCbCrPositioning: UInt = 20537u

public val PropertyTagThumbnailYCbCrSubsampling: UInt = 20536u

public val PropertyTagTileByteCounts: UInt = 325u

public val PropertyTagTileLength: UInt = 323u

public val PropertyTagTileOffset: UInt = 324u

public val PropertyTagTileWidth: UInt = 322u

public val PropertyTagTransferFuncition: UInt = 301u

public val PropertyTagTransferRange: UInt = 342u

public val PropertyTagTypeASCII: UInt = 2u

public val PropertyTagTypeByte: UInt = 1u

public val PropertyTagTypeLong: UInt = 4u

public val PropertyTagTypeRational: UInt = 5u

public val PropertyTagTypeSLONG: UInt = 9u

public val PropertyTagTypeSRational: UInt = 10u

public val PropertyTagTypeShort: UInt = 3u

public val PropertyTagTypeUndefined: UInt = 7u

public val PropertyTagWhitePoint: UInt = 318u

public val PropertyTagXPosition: UInt = 286u

public val PropertyTagXResolution: UInt = 282u

public val PropertyTagYCbCrCoefficients: UInt = 529u

public val PropertyTagYCbCrPositioning: UInt = 531u

public val PropertyTagYCbCrSubsampling: UInt = 530u

public val PropertyTagYPosition: UInt = 287u

public val PropertyTagYResolution: UInt = 283u

public val QualityModeDefault: QualityMode = 0

public val QualityModeHigh: QualityMode = 2

public val QualityModeInvalid: QualityMode = -1

public val QualityModeLow: QualityMode = 1

public val RED_SHIFT: UInt = 16u

public val RedEyeCorrectionEffectGuid: GUID = GUID.from_u128(0x74d29d0569a44266uL, 0x95493cc52836b632uL)

public val Rotate180FlipNone: RotateFlipType = 2

public val Rotate180FlipX: RotateFlipType = 6

public val Rotate180FlipXY: RotateFlipType = 0

public val Rotate180FlipY: RotateFlipType = 4

public val Rotate270FlipNone: RotateFlipType = 3

public val Rotate270FlipX: RotateFlipType = 7

public val Rotate270FlipXY: RotateFlipType = 1

public val Rotate270FlipY: RotateFlipType = 5

public val Rotate90FlipNone: RotateFlipType = 1

public val Rotate90FlipX: RotateFlipType = 5

public val Rotate90FlipXY: RotateFlipType = 3

public val Rotate90FlipY: RotateFlipType = 7

public val RotateNoneFlipNone: RotateFlipType = 0

public val RotateNoneFlipX: RotateFlipType = 4

public val RotateNoneFlipXY: RotateFlipType = 2

public val RotateNoneFlipY: RotateFlipType = 6

public val SharpenEffectGuid: GUID = GUID.from_u128(0x63cbf3eec526402cuL, 0x8f7162c540bf5142uL)

public val SmoothingModeAntiAlias: SmoothingMode = 4

public val SmoothingModeAntiAlias8x4: SmoothingMode = 4

public val SmoothingModeAntiAlias8x8: SmoothingMode = 5

public val SmoothingModeDefault: SmoothingMode = 0

public val SmoothingModeHighQuality: SmoothingMode = 2

public val SmoothingModeHighSpeed: SmoothingMode = 1

public val SmoothingModeInvalid: SmoothingMode = -1

public val SmoothingModeNone: SmoothingMode = 3

public val StringAlignmentCenter: StringAlignment = 1

public val StringAlignmentFar: StringAlignment = 2

public val StringAlignmentNear: StringAlignment = 0

public val StringDigitSubstituteNational: StringDigitSubstitute = 2

public val StringDigitSubstituteNone: StringDigitSubstitute = 1

public val StringDigitSubstituteTraditional: StringDigitSubstitute = 3

public val StringDigitSubstituteUser: StringDigitSubstitute = 0

public val StringFormatFlagsBypassGDI: StringFormatFlags = -2147483648

public val StringFormatFlagsDirectionRightToLeft: StringFormatFlags = 1

public val StringFormatFlagsDirectionVertical: StringFormatFlags = 2

public val StringFormatFlagsDisplayFormatControl: StringFormatFlags = 32

public val StringFormatFlagsLineLimit: StringFormatFlags = 8192

public val StringFormatFlagsMeasureTrailingSpaces: StringFormatFlags = 2048

public val StringFormatFlagsNoClip: StringFormatFlags = 16384

public val StringFormatFlagsNoFitBlackBox: StringFormatFlags = 4

public val StringFormatFlagsNoFontFallback: StringFormatFlags = 1024

public val StringFormatFlagsNoWrap: StringFormatFlags = 4096

public val StringTrimmingCharacter: StringTrimming = 1

public val StringTrimmingEllipsisCharacter: StringTrimming = 3

public val StringTrimmingEllipsisPath: StringTrimming = 5

public val StringTrimmingEllipsisWord: StringTrimming = 4

public val StringTrimmingNone: StringTrimming = 0

public val StringTrimmingWord: StringTrimming = 2

public val TestControlForceBilinear: GpTestControlEnum = 0

public val TestControlGetBuildNumber: GpTestControlEnum = 2

public val TestControlNoICM: GpTestControlEnum = 1

public val TextRenderingHintAntiAlias: TextRenderingHint = 4

public val TextRenderingHintAntiAliasGridFit: TextRenderingHint = 3

public val TextRenderingHintClearTypeGridFit: TextRenderingHint = 5

public val TextRenderingHintSingleBitPerPixel: TextRenderingHint = 2

public val TextRenderingHintSingleBitPerPixelGridFit: TextRenderingHint = 1

public val TextRenderingHintSystemDefault: TextRenderingHint = 0

public val TintEffectGuid: GUID = GUID.from_u128(0x1077af0028484441uL, 0x948944ad4c2d7a2cuL)

public val UnitDisplay: Unit = 1

public val UnitDocument: Unit = 5

public val UnitInch: Unit = 4

public val UnitMillimeter: Unit = 6

public val UnitPixel: Unit = 2

public val UnitPoint: Unit = 3

public val UnitWorld: Unit = 0

public val UnknownImageFormat: Status = 13

public val UnsupportedGdiplusVersion: Status = 17

public val ValueOverflow: Status = 11

public val WarpModeBilinear: WarpMode = 1

public val WarpModePerspective: WarpMode = 0

public val Win32Error: Status = 7

public val WmfRecordTypeAbortDoc: EmfPlusRecordType = 65618

public val WmfRecordTypeAnimatePalette: EmfPlusRecordType = 66614

public val WmfRecordTypeArc: EmfPlusRecordType = 67607

public val WmfRecordTypeBitBlt: EmfPlusRecordType = 67874

public val WmfRecordTypeChord: EmfPlusRecordType = 67632

public val WmfRecordTypeCreateBitmap: EmfPlusRecordType = 67326

public val WmfRecordTypeCreateBitmapIndirect: EmfPlusRecordType = 66301

public val WmfRecordTypeCreateBrush: EmfPlusRecordType = 65784

public val WmfRecordTypeCreateBrushIndirect: EmfPlusRecordType = 66300

public val WmfRecordTypeCreateFontIndirect: EmfPlusRecordType = 66299

public val WmfRecordTypeCreatePalette: EmfPlusRecordType = 65783

public val WmfRecordTypeCreatePatternBrush: EmfPlusRecordType = 66041

public val WmfRecordTypeCreatePenIndirect: EmfPlusRecordType = 66298

public val WmfRecordTypeCreateRegion: EmfPlusRecordType = 67327

public val WmfRecordTypeDIBBitBlt: EmfPlusRecordType = 67904

public val WmfRecordTypeDIBCreatePatternBrush: EmfPlusRecordType = 65858

public val WmfRecordTypeDIBStretchBlt: EmfPlusRecordType = 68417

public val WmfRecordTypeDeleteObject: EmfPlusRecordType = 66032

public val WmfRecordTypeDrawText: EmfPlusRecordType = 67119

public val WmfRecordTypeEllipse: EmfPlusRecordType = 66584

public val WmfRecordTypeEndDoc: EmfPlusRecordType = 65630

public val WmfRecordTypeEndPage: EmfPlusRecordType = 65616

public val WmfRecordTypeEscape: EmfPlusRecordType = 67110

public val WmfRecordTypeExcludeClipRect: EmfPlusRecordType = 66581

public val WmfRecordTypeExtFloodFill: EmfPlusRecordType = 66888

public val WmfRecordTypeExtTextOut: EmfPlusRecordType = 68146

public val WmfRecordTypeFillRegion: EmfPlusRecordType = 66088

public val WmfRecordTypeFloodFill: EmfPlusRecordType = 66585

public val WmfRecordTypeFrameRegion: EmfPlusRecordType = 66601

public val WmfRecordTypeIntersectClipRect: EmfPlusRecordType = 66582

public val WmfRecordTypeInvertRegion: EmfPlusRecordType = 65834

public val WmfRecordTypeLineTo: EmfPlusRecordType = 66067

public val WmfRecordTypeMoveTo: EmfPlusRecordType = 66068

public val WmfRecordTypeOffsetClipRgn: EmfPlusRecordType = 66080

public val WmfRecordTypeOffsetViewportOrg: EmfPlusRecordType = 66065

public val WmfRecordTypeOffsetWindowOrg: EmfPlusRecordType = 66063

public val WmfRecordTypePaintRegion: EmfPlusRecordType = 65835

public val WmfRecordTypePatBlt: EmfPlusRecordType = 67101

public val WmfRecordTypePie: EmfPlusRecordType = 67610

public val WmfRecordTypePolyPolygon: EmfPlusRecordType = 66872

public val WmfRecordTypePolygon: EmfPlusRecordType = 66340

public val WmfRecordTypePolyline: EmfPlusRecordType = 66341

public val WmfRecordTypeRealizePalette: EmfPlusRecordType = 65589

public val WmfRecordTypeRectangle: EmfPlusRecordType = 66587

public val WmfRecordTypeResetDC: EmfPlusRecordType = 65868

public val WmfRecordTypeResizePalette: EmfPlusRecordType = 65849

public val WmfRecordTypeRestoreDC: EmfPlusRecordType = 65831

public val WmfRecordTypeRoundRect: EmfPlusRecordType = 67100

public val WmfRecordTypeSaveDC: EmfPlusRecordType = 65566

public val WmfRecordTypeScaleViewportExt: EmfPlusRecordType = 66578

public val WmfRecordTypeScaleWindowExt: EmfPlusRecordType = 66576

public val WmfRecordTypeSelectClipRegion: EmfPlusRecordType = 65836

public val WmfRecordTypeSelectObject: EmfPlusRecordType = 65837

public val WmfRecordTypeSelectPalette: EmfPlusRecordType = 66100

public val WmfRecordTypeSetBkColor: EmfPlusRecordType = 66049

public val WmfRecordTypeSetBkMode: EmfPlusRecordType = 65794

public val WmfRecordTypeSetDIBToDev: EmfPlusRecordType = 68915

public val WmfRecordTypeSetLayout: EmfPlusRecordType = 65865

public val WmfRecordTypeSetMapMode: EmfPlusRecordType = 65795

public val WmfRecordTypeSetMapperFlags: EmfPlusRecordType = 66097

public val WmfRecordTypeSetPalEntries: EmfPlusRecordType = 65591

public val WmfRecordTypeSetPixel: EmfPlusRecordType = 66591

public val WmfRecordTypeSetPolyFillMode: EmfPlusRecordType = 65798

public val WmfRecordTypeSetROP2: EmfPlusRecordType = 65796

public val WmfRecordTypeSetRelAbs: EmfPlusRecordType = 65797

public val WmfRecordTypeSetStretchBltMode: EmfPlusRecordType = 65799

public val WmfRecordTypeSetTextAlign: EmfPlusRecordType = 65838

public val WmfRecordTypeSetTextCharExtra: EmfPlusRecordType = 65800

public val WmfRecordTypeSetTextColor: EmfPlusRecordType = 66057

public val WmfRecordTypeSetTextJustification: EmfPlusRecordType = 66058

public val WmfRecordTypeSetViewportExt: EmfPlusRecordType = 66062

public val WmfRecordTypeSetViewportOrg: EmfPlusRecordType = 66061

public val WmfRecordTypeSetWindowExt: EmfPlusRecordType = 66060

public val WmfRecordTypeSetWindowOrg: EmfPlusRecordType = 66059

public val WmfRecordTypeStartDoc: EmfPlusRecordType = 65869

public val WmfRecordTypeStartPage: EmfPlusRecordType = 65615

public val WmfRecordTypeStretchBlt: EmfPlusRecordType = 68387

public val WmfRecordTypeStretchDIB: EmfPlusRecordType = 69443

public val WmfRecordTypeTextOut: EmfPlusRecordType = 66849

public val WrapModeClamp: WrapMode = 4

public val WrapModeTile: WrapMode = 0

public val WrapModeTileFlipX: WrapMode = 1

public val WrapModeTileFlipXY: WrapMode = 3

public val WrapModeTileFlipY: WrapMode = 2

public val WrongState: Status = 8
