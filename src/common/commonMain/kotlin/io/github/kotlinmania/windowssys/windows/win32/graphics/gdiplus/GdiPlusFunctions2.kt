package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn

public expect fun gdipScaleTextureTransform(brush: MutPtr<GpTexture>, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipScaleWorldTransform(graphics: MutPtr<GpGraphics>, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipSetAdjustableArrowCapFillState(cap: MutPtr<GpAdjustableArrowCap>, fillstate: Bool): Status

public expect fun gdipSetAdjustableArrowCapHeight(cap: MutPtr<GpAdjustableArrowCap>, height: Float): Status

public expect fun gdipSetAdjustableArrowCapMiddleInset(cap: MutPtr<GpAdjustableArrowCap>, middleinset: Float): Status

public expect fun gdipSetAdjustableArrowCapWidth(cap: MutPtr<GpAdjustableArrowCap>, width: Float): Status

public expect fun gdipSetClipGraphics(graphics: MutPtr<GpGraphics>, srcgraphics: MutPtr<GpGraphics>, combinemode: CombineMode): Status

public expect fun gdipSetClipHrgn(graphics: MutPtr<GpGraphics>, hrgn: Hrgn, combinemode: CombineMode): Status

public expect fun gdipSetClipPath(graphics: MutPtr<GpGraphics>, path: MutPtr<GpPath>, combinemode: CombineMode): Status

public expect fun gdipSetClipRect(graphics: MutPtr<GpGraphics>, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status

public expect fun gdipSetClipRectI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status

public expect fun gdipSetClipRegion(graphics: MutPtr<GpGraphics>, region: MutPtr<GpRegion>, combinemode: CombineMode): Status

public expect fun gdipSetCompositingMode(graphics: MutPtr<GpGraphics>, compositingmode: CompositingMode): Status

public expect fun gdipSetCompositingQuality(graphics: MutPtr<GpGraphics>, compositingquality: CompositingQuality): Status

public expect fun gdipSetCustomLineCapBaseCap(customcap: MutPtr<GpCustomLineCap>, basecap: LineCap): Status

public expect fun gdipSetCustomLineCapBaseInset(customcap: MutPtr<GpCustomLineCap>, inset: Float): Status

public expect fun gdipSetCustomLineCapStrokeCaps(customcap: MutPtr<GpCustomLineCap>, startcap: LineCap, endcap: LineCap): Status

public expect fun gdipSetCustomLineCapStrokeJoin(customcap: MutPtr<GpCustomLineCap>, linejoin: LineJoin): Status

public expect fun gdipSetCustomLineCapWidthScale(customcap: MutPtr<GpCustomLineCap>, widthscale: Float): Status

public expect fun gdipSetEffectParameters(effect: MutPtr<CGpEffect>, params: ConstPtr<CVoid>, size: UInt): Status

public expect fun gdipSetEmpty(region: MutPtr<GpRegion>): Status

public expect fun gdipSetImageAttributesCachedBackground(imageattr: MutPtr<GpImageAttributes>, enableflag: Bool): Status

public expect fun gdipSetImageAttributesColorKeys(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status

public expect fun gdipSetImageAttributesColorMatrix(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colormatrix: ConstPtr<ColorMatrix>, graymatrix: ConstPtr<ColorMatrix>, flags: ColorMatrixFlags): Status

public expect fun gdipSetImageAttributesGamma(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status

public expect fun gdipSetImageAttributesNoOp(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool): Status

public expect fun gdipSetImageAttributesOutputChannel(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status

public expect fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status

public expect fun gdipSetImageAttributesRemapTable(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: ConstPtr<ColorMap>): Status

public expect fun gdipSetImageAttributesThreshold(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status

public expect fun gdipSetImageAttributesToIdentity(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType): Status

public expect fun gdipSetImageAttributesWrapMode(imageattr: MutPtr<GpImageAttributes>, wrap: WrapMode, argb: UInt, clamp: Bool): Status

public expect fun gdipSetImagePalette(image: MutPtr<GpImage>, palette: ConstPtr<ColorPalette>): Status

public expect fun gdipSetInfinite(region: MutPtr<GpRegion>): Status

public expect fun gdipSetInterpolationMode(graphics: MutPtr<GpGraphics>, interpolationmode: InterpolationMode): Status

public expect fun gdipSetLineBlend(brush: MutPtr<GpLineGradient>, blend: ConstPtr<Float>, positions: ConstPtr<Float>, count: Int): Status

public expect fun gdipSetLineColors(brush: MutPtr<GpLineGradient>, color1: UInt, color2: UInt): Status

public expect fun gdipSetLineGammaCorrection(brush: MutPtr<GpLineGradient>, usegammacorrection: Bool): Status

public expect fun gdipSetLineLinearBlend(brush: MutPtr<GpLineGradient>, focus: Float, scale: Float): Status

public expect fun gdipSetLinePresetBlend(brush: MutPtr<GpLineGradient>, blend: ConstPtr<UInt>, positions: ConstPtr<Float>, count: Int): Status

public expect fun gdipSetLineSigmaBlend(brush: MutPtr<GpLineGradient>, focus: Float, scale: Float): Status

public expect fun gdipSetLineTransform(brush: MutPtr<GpLineGradient>, matrix: ConstPtr<Matrix>): Status

public expect fun gdipSetLineWrapMode(brush: MutPtr<GpLineGradient>, wrapmode: WrapMode): Status

public expect fun gdipSetMatrixElements(matrix: MutPtr<Matrix>, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status

public expect fun gdipSetMetafileDownLevelRasterizationLimit(metafile: MutPtr<GpMetafile>, metafilerasterizationlimitdpi: UInt): Status

public expect fun gdipSetPageScale(graphics: MutPtr<GpGraphics>, scale: Float): Status

public expect fun gdipSetPageUnit(graphics: MutPtr<GpGraphics>, unit: Unit): Status

public expect fun gdipSetPathFillMode(path: MutPtr<GpPath>, fillmode: FillMode): Status

public expect fun gdipSetPathGradientBlend(brush: MutPtr<GpPathGradient>, blend: ConstPtr<Float>, positions: ConstPtr<Float>, count: Int): Status

public expect fun gdipSetPathGradientCenterColor(brush: MutPtr<GpPathGradient>, colors: UInt): Status

public expect fun gdipSetPathGradientCenterPoint(brush: MutPtr<GpPathGradient>, points: ConstPtr<PointF>): Status

public expect fun gdipSetPathGradientCenterPointI(brush: MutPtr<GpPathGradient>, points: ConstPtr<Point>): Status

public expect fun gdipSetPathGradientFocusScales(brush: MutPtr<GpPathGradient>, xscale: Float, yscale: Float): Status

public expect fun gdipSetPathGradientGammaCorrection(brush: MutPtr<GpPathGradient>, usegammacorrection: Bool): Status

public expect fun gdipSetPathGradientLinearBlend(brush: MutPtr<GpPathGradient>, focus: Float, scale: Float): Status

public expect fun gdipSetPathGradientPath(brush: MutPtr<GpPathGradient>, path: ConstPtr<GpPath>): Status

public expect fun gdipSetPathGradientPresetBlend(brush: MutPtr<GpPathGradient>, blend: ConstPtr<UInt>, positions: ConstPtr<Float>, count: Int): Status

public expect fun gdipSetPathGradientSigmaBlend(brush: MutPtr<GpPathGradient>, focus: Float, scale: Float): Status

public expect fun gdipSetPathGradientSurroundColorsWithCount(brush: MutPtr<GpPathGradient>, color: ConstPtr<UInt>, count: MutPtr<Int>): Status

public expect fun gdipSetPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: MutPtr<Matrix>): Status

public expect fun gdipSetPathGradientWrapMode(brush: MutPtr<GpPathGradient>, wrapmode: WrapMode): Status

public expect fun gdipSetPathMarker(path: MutPtr<GpPath>): Status

public expect fun gdipSetPenBrushFill(pen: MutPtr<GpPen>, brush: MutPtr<GpBrush>): Status

public expect fun gdipSetPenColor(pen: MutPtr<GpPen>, argb: UInt): Status

public expect fun gdipSetPenCompoundArray(pen: MutPtr<GpPen>, dash: ConstPtr<Float>, count: Int): Status

public expect fun gdipSetPenCustomEndCap(pen: MutPtr<GpPen>, customcap: MutPtr<GpCustomLineCap>): Status

public expect fun gdipSetPenCustomStartCap(pen: MutPtr<GpPen>, customcap: MutPtr<GpCustomLineCap>): Status

public expect fun gdipSetPenDashArray(pen: MutPtr<GpPen>, dash: ConstPtr<Float>, count: Int): Status

public expect fun gdipSetPenDashCap197819(pen: MutPtr<GpPen>, dashcap: DashCap): Status

public expect fun gdipSetPenDashOffset(pen: MutPtr<GpPen>, offset: Float): Status

public expect fun gdipSetPenDashStyle(pen: MutPtr<GpPen>, dashstyle: DashStyle): Status

public expect fun gdipSetPenEndCap(pen: MutPtr<GpPen>, endcap: LineCap): Status

public expect fun gdipSetPenLineCap197819(pen: MutPtr<GpPen>, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status

public expect fun gdipSetPenLineJoin(pen: MutPtr<GpPen>, linejoin: LineJoin): Status

public expect fun gdipSetPenMiterLimit(pen: MutPtr<GpPen>, miterlimit: Float): Status

public expect fun gdipSetPenMode(pen: MutPtr<GpPen>, penmode: PenAlignment): Status

public expect fun gdipSetPenStartCap(pen: MutPtr<GpPen>, startcap: LineCap): Status

public expect fun gdipSetPenTransform(pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>): Status

public expect fun gdipSetPenUnit(pen: MutPtr<GpPen>, unit: Unit): Status

public expect fun gdipSetPenWidth(pen: MutPtr<GpPen>, width: Float): Status

public expect fun gdipSetPixelOffsetMode(graphics: MutPtr<GpGraphics>, pixeloffsetmode: PixelOffsetMode): Status

public expect fun gdipSetPropertyItem(image: MutPtr<GpImage>, item: ConstPtr<PropertyItem>): Status

public expect fun gdipSetRenderingOrigin(graphics: MutPtr<GpGraphics>, x: Int, y: Int): Status

public expect fun gdipSetSmoothingMode(graphics: MutPtr<GpGraphics>, smoothingmode: SmoothingMode): Status

public expect fun gdipSetSolidFillColor(brush: MutPtr<GpSolidFill>, color: UInt): Status

public expect fun gdipSetStringFormatAlign(format: MutPtr<GpStringFormat>, align: StringAlignment): Status

public expect fun gdipSetStringFormatDigitSubstitution(format: MutPtr<GpStringFormat>, language: UShort, substitute: StringDigitSubstitute): Status

public expect fun gdipSetStringFormatFlags(format: MutPtr<GpStringFormat>, flags: Int): Status

public expect fun gdipSetStringFormatHotkeyPrefix(format: MutPtr<GpStringFormat>, hotkeyprefix: Int): Status

public expect fun gdipSetStringFormatLineAlign(format: MutPtr<GpStringFormat>, align: StringAlignment): Status

public expect fun gdipSetStringFormatMeasurableCharacterRanges(format: MutPtr<GpStringFormat>, rangecount: Int, ranges: ConstPtr<CharacterRange>): Status

public expect fun gdipSetStringFormatTabStops(format: MutPtr<GpStringFormat>, firsttaboffset: Float, count: Int, tabstops: ConstPtr<Float>): Status

public expect fun gdipSetStringFormatTrimming(format: MutPtr<GpStringFormat>, trimming: StringTrimming): Status

public expect fun gdipSetTextContrast(graphics: MutPtr<GpGraphics>, contrast: UInt): Status

public expect fun gdipSetTextRenderingHint(graphics: MutPtr<GpGraphics>, mode: TextRenderingHint): Status

public expect fun gdipSetTextureTransform(brush: MutPtr<GpTexture>, matrix: ConstPtr<Matrix>): Status

public expect fun gdipSetTextureWrapMode(brush: MutPtr<GpTexture>, wrapmode: WrapMode): Status

public expect fun gdipSetWorldTransform(graphics: MutPtr<GpGraphics>, matrix: MutPtr<Matrix>): Status

public expect fun gdipShearMatrix(matrix: MutPtr<Matrix>, shearx: Float, sheary: Float, order: MatrixOrder): Status

public expect fun gdipStartPathFigure(path: MutPtr<GpPath>): Status

public expect fun gdipStringFormatGetGenericDefault(format: MutPtr<MutPtr<GpStringFormat>>): Status

public expect fun gdipStringFormatGetGenericTypographic(format: MutPtr<MutPtr<GpStringFormat>>): Status

public expect fun gdipTestControl(control: GpTestControlEnum, param1: MutPtr<CVoid>): Status

public expect fun gdipTransformMatrixPoints(matrix: MutPtr<Matrix>, pts: MutPtr<PointF>, count: Int): Status

public expect fun gdipTransformMatrixPointsI(matrix: MutPtr<Matrix>, pts: MutPtr<Point>, count: Int): Status

public expect fun gdipTransformPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>): Status

public expect fun gdipTransformPoints(graphics: MutPtr<GpGraphics>, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr<PointF>, count: Int): Status

public expect fun gdipTransformPointsI(graphics: MutPtr<GpGraphics>, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr<Point>, count: Int): Status

public expect fun gdipTransformRegion(region: MutPtr<GpRegion>, matrix: MutPtr<Matrix>): Status

public expect fun gdipTranslateClip(graphics: MutPtr<GpGraphics>, dx: Float, dy: Float): Status

public expect fun gdipTranslateClipI(graphics: MutPtr<GpGraphics>, dx: Int, dy: Int): Status

public expect fun gdipTranslateLineTransform(brush: MutPtr<GpLineGradient>, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslateMatrix(matrix: MutPtr<Matrix>, offsetx: Float, offsety: Float, order: MatrixOrder): Status

public expect fun gdipTranslatePathGradientTransform(brush: MutPtr<GpPathGradient>, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslatePenTransform(pen: MutPtr<GpPen>, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslateRegion(region: MutPtr<GpRegion>, dx: Float, dy: Float): Status

public expect fun gdipTranslateRegionI(region: MutPtr<GpRegion>, dx: Int, dy: Int): Status

public expect fun gdipTranslateTextureTransform(brush: MutPtr<GpTexture>, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipTranslateWorldTransform(graphics: MutPtr<GpGraphics>, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun gdipVectorTransformMatrixPoints(matrix: MutPtr<Matrix>, pts: MutPtr<PointF>, count: Int): Status

public expect fun gdipVectorTransformMatrixPointsI(matrix: MutPtr<Matrix>, pts: MutPtr<Point>, count: Int): Status

public expect fun gdipWarpPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, points: ConstPtr<PointF>, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status

public expect fun gdipWidenPath(nativepath: MutPtr<GpPath>, pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>, flatness: Float): Status

public expect fun gdipWindingModeOutline(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, flatness: Float): Status

public expect fun gdiplusNotificationHook(token: MutPtr<ULong>): Status

public expect fun gdiplusNotificationUnhook(token: ULong)

public expect fun gdiplusShutdown(token: ULong)

public expect fun gdiplusStartup(token: MutPtr<ULong>, input: ConstPtr<GdiplusStartupInput>, output: MutPtr<GdiplusStartupOutput>): Status
