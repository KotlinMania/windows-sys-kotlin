package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun GdipScaleTextureTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipScaleTextureTransform", 20, false, longArrayOf(brush, (sx.toRawBits().toLong() and 0xFFFF_FFFFL), (sy.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipScaleWorldTransform(graphics: Long, sx: Float, sy: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipScaleWorldTransform", 20, false, longArrayOf(graphics, (sx.toRawBits().toLong() and 0xFFFF_FFFFL), (sy.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipSetAdjustableArrowCapFillState(cap: Long, fillstate: BOOL): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetAdjustableArrowCapFillState", longArrayOf(cap, fillstate.toLong())).toInt()
}

public fun GdipSetAdjustableArrowCapHeight(cap: Long, height: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetAdjustableArrowCapHeight", 4, false, longArrayOf(cap, (height.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetAdjustableArrowCapMiddleInset", 4, false, longArrayOf(cap, (middleinset.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetAdjustableArrowCapWidth(cap: Long, width: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetAdjustableArrowCapWidth", 4, false, longArrayOf(cap, (width.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetClipGraphics(graphics: Long, srcgraphics: Long, combinemode: CombineMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetClipGraphics", longArrayOf(graphics, srcgraphics, combinemode.toLong())).toInt()
}

public fun GdipSetClipHrgn(graphics: Long, hrgn: Gdi.HRGN, combinemode: CombineMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetClipHrgn", longArrayOf(graphics, Win32DynamicFfi.objectSlot(hrgn), combinemode.toLong())).toInt()
}

public fun GdipSetClipPath(graphics: Long, path: Long, combinemode: CombineMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetClipPath", longArrayOf(graphics, path, combinemode.toLong())).toInt()
}

public fun GdipSetClipRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetClipRect", 340, false, longArrayOf(graphics, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), combinemode.toLong())).toLong().toInt()
}

public fun GdipSetClipRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetClipRectI", longArrayOf(graphics, x.toLong(), y.toLong(), width.toLong(), height.toLong(), combinemode.toLong())).toInt()
}

public fun GdipSetClipRegion(graphics: Long, region: Long, combinemode: CombineMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetClipRegion", longArrayOf(graphics, region, combinemode.toLong())).toInt()
}

public fun GdipSetCompositingMode(graphics: Long, compositingmode: CompositingMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetCompositingMode", longArrayOf(graphics, compositingmode.toLong())).toInt()
}

public fun GdipSetCompositingQuality(graphics: Long, compositingquality: CompositingQuality): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetCompositingQuality", longArrayOf(graphics, compositingquality.toLong())).toInt()
}

public fun GdipSetCustomLineCapBaseCap(customcap: Long, basecap: LineCap): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetCustomLineCapBaseCap", longArrayOf(customcap, basecap.toLong())).toInt()
}

public fun GdipSetCustomLineCapBaseInset(customcap: Long, inset: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetCustomLineCapBaseInset", 4, false, longArrayOf(customcap, (inset.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetCustomLineCapStrokeCaps(customcap: Long, startcap: LineCap, endcap: LineCap): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetCustomLineCapStrokeCaps", longArrayOf(customcap, startcap.toLong(), endcap.toLong())).toInt()
}

public fun GdipSetCustomLineCapStrokeJoin(customcap: Long, linejoin: LineJoin): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetCustomLineCapStrokeJoin", longArrayOf(customcap, linejoin.toLong())).toInt()
}

public fun GdipSetCustomLineCapWidthScale(customcap: Long, widthscale: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetCustomLineCapWidthScale", 4, false, longArrayOf(customcap, (widthscale.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetEffectParameters(effect: Long, params: Long, size: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetEffectParameters", longArrayOf(effect, params, size.toLong())).toInt()
}

public fun GdipSetEmpty(region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetEmpty", longArrayOf(region)).toInt()
}

public fun GdipSetImageAttributesCachedBackground(imageattr: Long, enableflag: BOOL): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetImageAttributesCachedBackground", longArrayOf(imageattr, enableflag.toLong())).toInt()
}

public fun GdipSetImageAttributesColorKeys(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorlow: UInt, colorhigh: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetImageAttributesColorKeys", longArrayOf(imageattr, type.toLong(), enableflag.toLong(), colorlow.toLong(), colorhigh.toLong())).toInt()
}

public fun GdipSetImageAttributesColorMatrix(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colormatrix: Long, graymatrix: Long, flags: ColorMatrixFlags): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetImageAttributesColorMatrix", longArrayOf(imageattr, type.toLong(), enableflag.toLong(), colormatrix, graymatrix, flags.toLong())).toInt()
}

public fun GdipSetImageAttributesGamma(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, gamma: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetImageAttributesGamma", 64, false, longArrayOf(imageattr, type.toLong(), enableflag.toLong(), (gamma.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetImageAttributesNoOp(imageattr: Long, type: ColorAdjustType, enableflag: BOOL): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetImageAttributesNoOp", longArrayOf(imageattr, type.toLong(), enableflag.toLong())).toInt()
}

public fun GdipSetImageAttributesOutputChannel(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, channelflags: ColorChannelFlags): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetImageAttributesOutputChannel", longArrayOf(imageattr, type.toLong(), enableflag.toLong(), channelflags.toLong())).toInt()
}

public fun GdipSetImageAttributesOutputChannelColorProfile(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorprofilefilename: PCWSTR): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetImageAttributesOutputChannelColorProfile", longArrayOf(imageattr, type.toLong(), enableflag.toLong(), colorprofilefilename)).toInt()
}

public fun GdipSetImageAttributesRemapTable(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, mapsize: UInt, map: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetImageAttributesRemapTable", longArrayOf(imageattr, type.toLong(), enableflag.toLong(), mapsize.toLong(), map)).toInt()
}

public fun GdipSetImageAttributesThreshold(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, threshold: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetImageAttributesThreshold", 64, false, longArrayOf(imageattr, type.toLong(), enableflag.toLong(), (threshold.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetImageAttributesToIdentity(imageattr: Long, type: ColorAdjustType): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetImageAttributesToIdentity", longArrayOf(imageattr, type.toLong())).toInt()
}

public fun GdipSetImageAttributesWrapMode(imageattr: Long, wrap: WrapMode, argb: UInt, clamp: BOOL): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetImageAttributesWrapMode", longArrayOf(imageattr, wrap.toLong(), argb.toLong(), clamp.toLong())).toInt()
}

public fun GdipSetImagePalette(image: Long, palette: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetImagePalette", longArrayOf(image, palette)).toInt()
}

public fun GdipSetInfinite(region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetInfinite", longArrayOf(region)).toInt()
}

public fun GdipSetInterpolationMode(graphics: Long, interpolationmode: InterpolationMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetInterpolationMode", longArrayOf(graphics, interpolationmode.toLong())).toInt()
}

public fun GdipSetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetLineBlend", longArrayOf(brush, blend, positions, count.toLong())).toInt()
}

public fun GdipSetLineColors(brush: Long, color1: UInt, color2: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetLineColors", longArrayOf(brush, color1.toLong(), color2.toLong())).toInt()
}

public fun GdipSetLineGammaCorrection(brush: Long, usegammacorrection: BOOL): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetLineGammaCorrection", longArrayOf(brush, usegammacorrection.toLong())).toInt()
}

public fun GdipSetLineLinearBlend(brush: Long, focus: Float, scale: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetLineLinearBlend", 20, false, longArrayOf(brush, (focus.toRawBits().toLong() and 0xFFFF_FFFFL), (scale.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetLinePresetBlend", longArrayOf(brush, blend, positions, count.toLong())).toInt()
}

public fun GdipSetLineSigmaBlend(brush: Long, focus: Float, scale: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetLineSigmaBlend", 20, false, longArrayOf(brush, (focus.toRawBits().toLong() and 0xFFFF_FFFFL), (scale.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetLineTransform(brush: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetLineTransform", longArrayOf(brush, matrix)).toInt()
}

public fun GdipSetLineWrapMode(brush: Long, wrapmode: WrapMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetLineWrapMode", longArrayOf(brush, wrapmode.toLong())).toInt()
}

public fun GdipSetMatrixElements(matrix: Long, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetMatrixElements", 5460, false, longArrayOf(matrix, (m11.toRawBits().toLong() and 0xFFFF_FFFFL), (m12.toRawBits().toLong() and 0xFFFF_FFFFL), (m21.toRawBits().toLong() and 0xFFFF_FFFFL), (m22.toRawBits().toLong() and 0xFFFF_FFFFL), (dx.toRawBits().toLong() and 0xFFFF_FFFFL), (dy.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetMetafileDownLevelRasterizationLimit", longArrayOf(metafile, metafilerasterizationlimitdpi.toLong())).toInt()
}

public fun GdipSetPageScale(graphics: Long, scale: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetPageScale", 4, false, longArrayOf(graphics, (scale.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetPageUnit(graphics: Long, unit: Unit): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPageUnit", longArrayOf(graphics, unit.toLong())).toInt()
}

public fun GdipSetPathFillMode(path: Long, fillmode: FillMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathFillMode", longArrayOf(path, fillmode.toLong())).toInt()
}

public fun GdipSetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathGradientBlend", longArrayOf(brush, blend, positions, count.toLong())).toInt()
}

public fun GdipSetPathGradientCenterColor(brush: Long, colors: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathGradientCenterColor", longArrayOf(brush, colors.toLong())).toInt()
}

public fun GdipSetPathGradientCenterPoint(brush: Long, points: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathGradientCenterPoint", longArrayOf(brush, points)).toInt()
}

public fun GdipSetPathGradientCenterPointI(brush: Long, points: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathGradientCenterPointI", longArrayOf(brush, points)).toInt()
}

public fun GdipSetPathGradientFocusScales(brush: Long, xscale: Float, yscale: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetPathGradientFocusScales", 20, false, longArrayOf(brush, (xscale.toRawBits().toLong() and 0xFFFF_FFFFL), (yscale.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetPathGradientGammaCorrection(brush: Long, usegammacorrection: BOOL): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathGradientGammaCorrection", longArrayOf(brush, usegammacorrection.toLong())).toInt()
}

public fun GdipSetPathGradientLinearBlend(brush: Long, focus: Float, scale: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetPathGradientLinearBlend", 20, false, longArrayOf(brush, (focus.toRawBits().toLong() and 0xFFFF_FFFFL), (scale.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetPathGradientPath(brush: Long, path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathGradientPath", longArrayOf(brush, path)).toInt()
}

public fun GdipSetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathGradientPresetBlend", longArrayOf(brush, blend, positions, count.toLong())).toInt()
}

public fun GdipSetPathGradientSigmaBlend(brush: Long, focus: Float, scale: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetPathGradientSigmaBlend", 20, false, longArrayOf(brush, (focus.toRawBits().toLong() and 0xFFFF_FFFFL), (scale.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathGradientSurroundColorsWithCount", longArrayOf(brush, color, count)).toInt()
}

public fun GdipSetPathGradientTransform(brush: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathGradientTransform", longArrayOf(brush, matrix)).toInt()
}

public fun GdipSetPathGradientWrapMode(brush: Long, wrapmode: WrapMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathGradientWrapMode", longArrayOf(brush, wrapmode.toLong())).toInt()
}

public fun GdipSetPathMarker(path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPathMarker", longArrayOf(path)).toInt()
}

public fun GdipSetPenBrushFill(pen: Long, brush: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenBrushFill", longArrayOf(pen, brush)).toInt()
}

public fun GdipSetPenColor(pen: Long, argb: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenColor", longArrayOf(pen, argb.toLong())).toInt()
}

public fun GdipSetPenCompoundArray(pen: Long, dash: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenCompoundArray", longArrayOf(pen, dash, count.toLong())).toInt()
}

public fun GdipSetPenCustomEndCap(pen: Long, customcap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenCustomEndCap", longArrayOf(pen, customcap)).toInt()
}

public fun GdipSetPenCustomStartCap(pen: Long, customcap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenCustomStartCap", longArrayOf(pen, customcap)).toInt()
}

public fun GdipSetPenDashArray(pen: Long, dash: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenDashArray", longArrayOf(pen, dash, count.toLong())).toInt()
}

public fun GdipSetPenDashCap197819(pen: Long, dashcap: DashCap): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenDashCap197819", longArrayOf(pen, dashcap.toLong())).toInt()
}

public fun GdipSetPenDashOffset(pen: Long, offset: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetPenDashOffset", 4, false, longArrayOf(pen, (offset.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetPenDashStyle(pen: Long, dashstyle: DashStyle): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenDashStyle", longArrayOf(pen, dashstyle.toLong())).toInt()
}

public fun GdipSetPenEndCap(pen: Long, endcap: LineCap): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenEndCap", longArrayOf(pen, endcap.toLong())).toInt()
}

public fun GdipSetPenLineCap197819(pen: Long, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenLineCap197819", longArrayOf(pen, startcap.toLong(), endcap.toLong(), dashcap.toLong())).toInt()
}

public fun GdipSetPenLineJoin(pen: Long, linejoin: LineJoin): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenLineJoin", longArrayOf(pen, linejoin.toLong())).toInt()
}

public fun GdipSetPenMiterLimit(pen: Long, miterlimit: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetPenMiterLimit", 4, false, longArrayOf(pen, (miterlimit.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetPenMode(pen: Long, penmode: PenAlignment): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenMode", longArrayOf(pen, penmode.toLong())).toInt()
}

public fun GdipSetPenStartCap(pen: Long, startcap: LineCap): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenStartCap", longArrayOf(pen, startcap.toLong())).toInt()
}

public fun GdipSetPenTransform(pen: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenTransform", longArrayOf(pen, matrix)).toInt()
}

public fun GdipSetPenUnit(pen: Long, unit: Unit): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPenUnit", longArrayOf(pen, unit.toLong())).toInt()
}

public fun GdipSetPenWidth(pen: Long, width: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetPenWidth", 4, false, longArrayOf(pen, (width.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipSetPixelOffsetMode(graphics: Long, pixeloffsetmode: PixelOffsetMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPixelOffsetMode", longArrayOf(graphics, pixeloffsetmode.toLong())).toInt()
}

public fun GdipSetPropertyItem(image: Long, item: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetPropertyItem", longArrayOf(image, item)).toInt()
}

public fun GdipSetRenderingOrigin(graphics: Long, x: Int, y: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetRenderingOrigin", longArrayOf(graphics, x.toLong(), y.toLong())).toInt()
}

public fun GdipSetSmoothingMode(graphics: Long, smoothingmode: SmoothingMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetSmoothingMode", longArrayOf(graphics, smoothingmode.toLong())).toInt()
}

public fun GdipSetSolidFillColor(brush: Long, color: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetSolidFillColor", longArrayOf(brush, color.toLong())).toInt()
}

public fun GdipSetStringFormatAlign(format: Long, align: StringAlignment): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetStringFormatAlign", longArrayOf(format, align.toLong())).toInt()
}

public fun GdipSetStringFormatDigitSubstitution(format: Long, language: UShort, substitute: StringDigitSubstitute): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetStringFormatDigitSubstitution", longArrayOf(format, language.toLong(), substitute.toLong())).toInt()
}

public fun GdipSetStringFormatFlags(format: Long, flags: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetStringFormatFlags", longArrayOf(format, flags.toLong())).toInt()
}

public fun GdipSetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetStringFormatHotkeyPrefix", longArrayOf(format, hotkeyprefix.toLong())).toInt()
}

public fun GdipSetStringFormatLineAlign(format: Long, align: StringAlignment): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetStringFormatLineAlign", longArrayOf(format, align.toLong())).toInt()
}

public fun GdipSetStringFormatMeasurableCharacterRanges(format: Long, rangecount: Int, ranges: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetStringFormatMeasurableCharacterRanges", longArrayOf(format, rangecount.toLong(), ranges)).toInt()
}

public fun GdipSetStringFormatTabStops(format: Long, firsttaboffset: Float, count: Int, tabstops: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipSetStringFormatTabStops", 4, false, longArrayOf(format, (firsttaboffset.toRawBits().toLong() and 0xFFFF_FFFFL), count.toLong(), tabstops)).toLong().toInt()
}

public fun GdipSetStringFormatTrimming(format: Long, trimming: StringTrimming): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetStringFormatTrimming", longArrayOf(format, trimming.toLong())).toInt()
}

public fun GdipSetTextContrast(graphics: Long, contrast: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetTextContrast", longArrayOf(graphics, contrast.toLong())).toInt()
}

public fun GdipSetTextRenderingHint(graphics: Long, mode: TextRenderingHint): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetTextRenderingHint", longArrayOf(graphics, mode.toLong())).toInt()
}

public fun GdipSetTextureTransform(brush: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetTextureTransform", longArrayOf(brush, matrix)).toInt()
}

public fun GdipSetTextureWrapMode(brush: Long, wrapmode: WrapMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetTextureWrapMode", longArrayOf(brush, wrapmode.toLong())).toInt()
}

public fun GdipSetWorldTransform(graphics: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSetWorldTransform", longArrayOf(graphics, matrix)).toInt()
}

public fun GdipShearMatrix(matrix: Long, shearx: Float, sheary: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipShearMatrix", 20, false, longArrayOf(matrix, (shearx.toRawBits().toLong() and 0xFFFF_FFFFL), (sheary.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipStartPathFigure(path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipStartPathFigure", longArrayOf(path)).toInt()
}

public fun GdipStringFormatGetGenericDefault(format: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipStringFormatGetGenericDefault", longArrayOf(format)).toInt()
}

public fun GdipStringFormatGetGenericTypographic(format: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipStringFormatGetGenericTypographic", longArrayOf(format)).toInt()
}

public fun GdipTestControl(control: GpTestControlEnum, param1: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipTestControl", longArrayOf(control.toLong(), param1)).toInt()
}

public fun GdipTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipTransformMatrixPoints", longArrayOf(matrix, pts, count.toLong())).toInt()
}

public fun GdipTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipTransformMatrixPointsI", longArrayOf(matrix, pts, count.toLong())).toInt()
}

public fun GdipTransformPath(path: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipTransformPath", longArrayOf(path, matrix)).toInt()
}

public fun GdipTransformPoints(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipTransformPoints", longArrayOf(graphics, destspace.toLong(), srcspace.toLong(), points, count.toLong())).toInt()
}

public fun GdipTransformPointsI(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipTransformPointsI", longArrayOf(graphics, destspace.toLong(), srcspace.toLong(), points, count.toLong())).toInt()
}

public fun GdipTransformRegion(region: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipTransformRegion", longArrayOf(region, matrix)).toInt()
}

public fun GdipTranslateClip(graphics: Long, dx: Float, dy: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipTranslateClip", 20, false, longArrayOf(graphics, (dx.toRawBits().toLong() and 0xFFFF_FFFFL), (dy.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipTranslateClipI(graphics: Long, dx: Int, dy: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipTranslateClipI", longArrayOf(graphics, dx.toLong(), dy.toLong())).toInt()
}

public fun GdipTranslateLineTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipTranslateLineTransform", 20, false, longArrayOf(brush, (dx.toRawBits().toLong() and 0xFFFF_FFFFL), (dy.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipTranslateMatrix(matrix: Long, offsetx: Float, offsety: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipTranslateMatrix", 20, false, longArrayOf(matrix, (offsetx.toRawBits().toLong() and 0xFFFF_FFFFL), (offsety.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipTranslatePathGradientTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipTranslatePathGradientTransform", 20, false, longArrayOf(brush, (dx.toRawBits().toLong() and 0xFFFF_FFFFL), (dy.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipTranslatePenTransform(pen: Long, dx: Float, dy: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipTranslatePenTransform", 20, false, longArrayOf(pen, (dx.toRawBits().toLong() and 0xFFFF_FFFFL), (dy.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipTranslateRegion(region: Long, dx: Float, dy: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipTranslateRegion", 20, false, longArrayOf(region, (dx.toRawBits().toLong() and 0xFFFF_FFFFL), (dy.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipTranslateRegionI(region: Long, dx: Int, dy: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipTranslateRegionI", longArrayOf(region, dx.toLong(), dy.toLong())).toInt()
}

public fun GdipTranslateTextureTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipTranslateTextureTransform", 20, false, longArrayOf(brush, (dx.toRawBits().toLong() and 0xFFFF_FFFFL), (dy.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipTranslateWorldTransform(graphics: Long, dx: Float, dy: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipTranslateWorldTransform", 20, false, longArrayOf(graphics, (dx.toRawBits().toLong() and 0xFFFF_FFFFL), (dy.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipVectorTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipVectorTransformMatrixPoints", longArrayOf(matrix, pts, count.toLong())).toInt()
}

public fun GdipVectorTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipVectorTransformMatrixPointsI", longArrayOf(matrix, pts, count.toLong())).toInt()
}

public fun GdipWarpPath(path: Long, matrix: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipWarpPath", 21760, false, longArrayOf(path, matrix, points, count.toLong(), (srcx.toRawBits().toLong() and 0xFFFF_FFFFL), (srcy.toRawBits().toLong() and 0xFFFF_FFFFL), (srcwidth.toRawBits().toLong() and 0xFFFF_FFFFL), (srcheight.toRawBits().toLong() and 0xFFFF_FFFFL), warpmode.toLong(), (flatness.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipWidenPath(nativepath: Long, pen: Long, matrix: Long, flatness: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipWidenPath", 64, false, longArrayOf(nativepath, pen, matrix, (flatness.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipWindingModeOutline(path: Long, matrix: Long, flatness: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipWindingModeOutline", 16, false, longArrayOf(path, matrix, (flatness.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdiplusNotificationHook(token: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdiplusNotificationHook", longArrayOf(token)).toInt()
}

public fun GdiplusNotificationUnhook(token: ULong) {
    Win32DynamicFfi.invoke("gdiplus.dll", "GdiplusNotificationUnhook", longArrayOf(token.toLong()))
}

public fun GdiplusShutdown(token: ULong) {
    Win32DynamicFfi.invoke("gdiplus.dll", "GdiplusShutdown", longArrayOf(token.toLong()))
}

public fun GdiplusStartup(token: Long, input: Long, output: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdiplusStartup", longArrayOf(token, input, output)).toInt()
}
