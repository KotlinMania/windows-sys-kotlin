package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HRGN

public expect fun GdipScaleTextureTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun GdipScaleWorldTransform(graphics: Long, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun GdipSetAdjustableArrowCapFillState(cap: Long, fillstate: BOOL): Status

public expect fun GdipSetAdjustableArrowCapHeight(cap: Long, height: Float): Status

public expect fun GdipSetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Float): Status

public expect fun GdipSetAdjustableArrowCapWidth(cap: Long, width: Float): Status

public expect fun GdipSetClipGraphics(graphics: Long, srcgraphics: Long, combinemode: CombineMode): Status

public expect fun GdipSetClipHrgn(graphics: Long, hrgn: HRGN, combinemode: CombineMode): Status

public expect fun GdipSetClipPath(graphics: Long, path: Long, combinemode: CombineMode): Status

public expect fun GdipSetClipRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status

public expect fun GdipSetClipRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status

public expect fun GdipSetClipRegion(graphics: Long, region: Long, combinemode: CombineMode): Status

public expect fun GdipSetCompositingMode(graphics: Long, compositingmode: CompositingMode): Status

public expect fun GdipSetCompositingQuality(graphics: Long, compositingquality: CompositingQuality): Status

public expect fun GdipSetCustomLineCapBaseCap(customcap: Long, basecap: LineCap): Status

public expect fun GdipSetCustomLineCapBaseInset(customcap: Long, inset: Float): Status

public expect fun GdipSetCustomLineCapStrokeCaps(customcap: Long, startcap: LineCap, endcap: LineCap): Status

public expect fun GdipSetCustomLineCapStrokeJoin(customcap: Long, linejoin: LineJoin): Status

public expect fun GdipSetCustomLineCapWidthScale(customcap: Long, widthscale: Float): Status

public expect fun GdipSetEffectParameters(effect: Long, params: Long, size: UInt): Status

public expect fun GdipSetEmpty(region: Long): Status

public expect fun GdipSetImageAttributesCachedBackground(imageattr: Long, enableflag: BOOL): Status

public expect fun GdipSetImageAttributesColorKeys(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorlow: UInt, colorhigh: UInt): Status

public expect fun GdipSetImageAttributesColorMatrix(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colormatrix: Long, graymatrix: Long, flags: ColorMatrixFlags): Status

public expect fun GdipSetImageAttributesGamma(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, gamma: Float): Status

public expect fun GdipSetImageAttributesNoOp(imageattr: Long, type: ColorAdjustType, enableflag: BOOL): Status

public expect fun GdipSetImageAttributesOutputChannel(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, channelflags: ColorChannelFlags): Status

public expect fun GdipSetImageAttributesOutputChannelColorProfile(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorprofilefilename: PCWSTR): Status

public expect fun GdipSetImageAttributesRemapTable(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, mapsize: UInt, map: Long): Status

public expect fun GdipSetImageAttributesThreshold(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, threshold: Float): Status

public expect fun GdipSetImageAttributesToIdentity(imageattr: Long, type: ColorAdjustType): Status

public expect fun GdipSetImageAttributesWrapMode(imageattr: Long, wrap: WrapMode, argb: UInt, clamp: BOOL): Status

public expect fun GdipSetImagePalette(image: Long, palette: Long): Status

public expect fun GdipSetInfinite(region: Long): Status

public expect fun GdipSetInterpolationMode(graphics: Long, interpolationmode: InterpolationMode): Status

public expect fun GdipSetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status

public expect fun GdipSetLineColors(brush: Long, color1: UInt, color2: UInt): Status

public expect fun GdipSetLineGammaCorrection(brush: Long, usegammacorrection: BOOL): Status

public expect fun GdipSetLineLinearBlend(brush: Long, focus: Float, scale: Float): Status

public expect fun GdipSetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status

public expect fun GdipSetLineSigmaBlend(brush: Long, focus: Float, scale: Float): Status

public expect fun GdipSetLineTransform(brush: Long, matrix: Long): Status

public expect fun GdipSetLineWrapMode(brush: Long, wrapmode: WrapMode): Status

public expect fun GdipSetMatrixElements(matrix: Long, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status

public expect fun GdipSetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: UInt): Status

public expect fun GdipSetPageScale(graphics: Long, scale: Float): Status

public expect fun GdipSetPageUnit(graphics: Long, unit: Unit): Status

public expect fun GdipSetPathFillMode(path: Long, fillmode: FillMode): Status

public expect fun GdipSetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status

public expect fun GdipSetPathGradientCenterColor(brush: Long, colors: UInt): Status

public expect fun GdipSetPathGradientCenterPoint(brush: Long, points: Long): Status

public expect fun GdipSetPathGradientCenterPointI(brush: Long, points: Long): Status

public expect fun GdipSetPathGradientFocusScales(brush: Long, xscale: Float, yscale: Float): Status

public expect fun GdipSetPathGradientGammaCorrection(brush: Long, usegammacorrection: BOOL): Status

public expect fun GdipSetPathGradientLinearBlend(brush: Long, focus: Float, scale: Float): Status

public expect fun GdipSetPathGradientPath(brush: Long, path: Long): Status

public expect fun GdipSetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status

public expect fun GdipSetPathGradientSigmaBlend(brush: Long, focus: Float, scale: Float): Status

public expect fun GdipSetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status

public expect fun GdipSetPathGradientTransform(brush: Long, matrix: Long): Status

public expect fun GdipSetPathGradientWrapMode(brush: Long, wrapmode: WrapMode): Status

public expect fun GdipSetPathMarker(path: Long): Status

public expect fun GdipSetPenBrushFill(pen: Long, brush: Long): Status

public expect fun GdipSetPenColor(pen: Long, argb: UInt): Status

public expect fun GdipSetPenCompoundArray(pen: Long, dash: Long, count: Int): Status

public expect fun GdipSetPenCustomEndCap(pen: Long, customcap: Long): Status

public expect fun GdipSetPenCustomStartCap(pen: Long, customcap: Long): Status

public expect fun GdipSetPenDashArray(pen: Long, dash: Long, count: Int): Status

public expect fun GdipSetPenDashCap197819(pen: Long, dashcap: DashCap): Status

public expect fun GdipSetPenDashOffset(pen: Long, offset: Float): Status

public expect fun GdipSetPenDashStyle(pen: Long, dashstyle: DashStyle): Status

public expect fun GdipSetPenEndCap(pen: Long, endcap: LineCap): Status

public expect fun GdipSetPenLineCap197819(pen: Long, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status

public expect fun GdipSetPenLineJoin(pen: Long, linejoin: LineJoin): Status

public expect fun GdipSetPenMiterLimit(pen: Long, miterlimit: Float): Status

public expect fun GdipSetPenMode(pen: Long, penmode: PenAlignment): Status

public expect fun GdipSetPenStartCap(pen: Long, startcap: LineCap): Status

public expect fun GdipSetPenTransform(pen: Long, matrix: Long): Status

public expect fun GdipSetPenUnit(pen: Long, unit: Unit): Status

public expect fun GdipSetPenWidth(pen: Long, width: Float): Status

public expect fun GdipSetPixelOffsetMode(graphics: Long, pixeloffsetmode: PixelOffsetMode): Status

public expect fun GdipSetPropertyItem(image: Long, item: Long): Status

public expect fun GdipSetRenderingOrigin(graphics: Long, x: Int, y: Int): Status

public expect fun GdipSetSmoothingMode(graphics: Long, smoothingmode: SmoothingMode): Status

public expect fun GdipSetSolidFillColor(brush: Long, color: UInt): Status

public expect fun GdipSetStringFormatAlign(format: Long, align: StringAlignment): Status

public expect fun GdipSetStringFormatDigitSubstitution(format: Long, language: UShort, substitute: StringDigitSubstitute): Status

public expect fun GdipSetStringFormatFlags(format: Long, flags: Int): Status

public expect fun GdipSetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Int): Status

public expect fun GdipSetStringFormatLineAlign(format: Long, align: StringAlignment): Status

public expect fun GdipSetStringFormatMeasurableCharacterRanges(format: Long, rangecount: Int, ranges: Long): Status

public expect fun GdipSetStringFormatTabStops(format: Long, firsttaboffset: Float, count: Int, tabstops: Long): Status

public expect fun GdipSetStringFormatTrimming(format: Long, trimming: StringTrimming): Status

public expect fun GdipSetTextContrast(graphics: Long, contrast: UInt): Status

public expect fun GdipSetTextRenderingHint(graphics: Long, mode: TextRenderingHint): Status

public expect fun GdipSetTextureTransform(brush: Long, matrix: Long): Status

public expect fun GdipSetTextureWrapMode(brush: Long, wrapmode: WrapMode): Status

public expect fun GdipSetWorldTransform(graphics: Long, matrix: Long): Status

public expect fun GdipShearMatrix(matrix: Long, shearx: Float, sheary: Float, order: MatrixOrder): Status

public expect fun GdipStartPathFigure(path: Long): Status

public expect fun GdipStringFormatGetGenericDefault(format: Long): Status

public expect fun GdipStringFormatGetGenericTypographic(format: Long): Status

public expect fun GdipTestControl(control: GpTestControlEnum, param1: Long): Status

public expect fun GdipTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status

public expect fun GdipTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status

public expect fun GdipTransformPath(path: Long, matrix: Long): Status

public expect fun GdipTransformPoints(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status

public expect fun GdipTransformPointsI(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status

public expect fun GdipTransformRegion(region: Long, matrix: Long): Status

public expect fun GdipTranslateClip(graphics: Long, dx: Float, dy: Float): Status

public expect fun GdipTranslateClipI(graphics: Long, dx: Int, dy: Int): Status

public expect fun GdipTranslateLineTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun GdipTranslateMatrix(matrix: Long, offsetx: Float, offsety: Float, order: MatrixOrder): Status

public expect fun GdipTranslatePathGradientTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun GdipTranslatePenTransform(pen: Long, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun GdipTranslateRegion(region: Long, dx: Float, dy: Float): Status

public expect fun GdipTranslateRegionI(region: Long, dx: Int, dy: Int): Status

public expect fun GdipTranslateTextureTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun GdipTranslateWorldTransform(graphics: Long, dx: Float, dy: Float, order: MatrixOrder): Status

public expect fun GdipVectorTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status

public expect fun GdipVectorTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status

public expect fun GdipWarpPath(path: Long, matrix: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status

public expect fun GdipWidenPath(nativepath: Long, pen: Long, matrix: Long, flatness: Float): Status

public expect fun GdipWindingModeOutline(path: Long, matrix: Long, flatness: Float): Status

public expect fun GdiplusNotificationHook(token: Long): Status

public expect fun GdiplusNotificationUnhook(token: ULong)

public expect fun GdiplusShutdown(token: ULong)

public expect fun GdiplusStartup(token: Long, input: Long, output: Long): Status
