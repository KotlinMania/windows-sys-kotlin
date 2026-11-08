package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.foundation.SIZE
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP

public typealias AR_STATE = Int

public typealias BACKLIGHT_OPTIMIZATION_LEVEL = Int

public typealias BRIGHTNESS_INTERFACE_VERSION = Int

public typealias BlackScreenDiagnosticsCalloutParam = Int

public typealias COLORSPACE_TRANSFORM_DATA_TYPE = Int

public typealias COLORSPACE_TRANSFORM_STAGE_CONTROL = Int

public typealias COLORSPACE_TRANSFORM_TARGET_CAPS_VERSION = Int

public typealias COLORSPACE_TRANSFORM_TYPE = Int

public typealias DHPDEV = Long

public typealias DHSURF = Long

public typealias DISPLAYCONFIG_DEVICE_INFO_TYPE = Int

public typealias DISPLAYCONFIG_MODE_INFO_TYPE = Int

public typealias DISPLAYCONFIG_PIXELFORMAT = Int

public typealias DISPLAYCONFIG_ROTATION = Int

public typealias DISPLAYCONFIG_SCALING = Int

public typealias DISPLAYCONFIG_SCANLINE_ORDERING = Int

public typealias DISPLAYCONFIG_TOPOLOGY_ID = Int

public typealias DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY = Int

public typealias DSI_CONTROL_TRANSMISSION_MODE = Int

public typealias ENG_DEVICE_ATTRIBUTE = Int

public typealias ENG_SYSTEM_ATTRIBUTE = Int

public fun interface FREEOBJPROCFn {
    public operator fun invoke(pdriverobj: Long): BOOL
}

public typealias FREEOBJPROC = FREEOBJPROCFn?

public typealias HBM = Long

public typealias HDEV = Long

public typealias HDRVOBJ = Long

public typealias HFASTMUTEX = Long

public typealias HSEMAPHORE = Long

public typealias HSURF = Long

public typealias MC_COLOR_TEMPERATURE = Int

public typealias MC_DISPLAY_TECHNOLOGY_TYPE = Int

public typealias MC_DRIVE_TYPE = Int

public typealias MC_GAIN_TYPE = Int

public typealias MC_POSITION_TYPE = Int

public typealias MC_SIZE_TYPE = Int

public typealias MC_VCP_CODE_TYPE = Int

public typealias ORIENTATION_PREFERENCE = Int

public typealias OUTPUT_COLOR_ENCODING = Int

public typealias OUTPUT_WIRE_COLOR_SPACE_TYPE = Int

public fun interface PFNFn {
    public operator fun invoke(): Long
}

public typealias PFN = PFNFn?

public fun interface PFN_DrvAccumulateD3DDirtyRectFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias PFN_DrvAccumulateD3DDirtyRect = PFN_DrvAccumulateD3DDirtyRectFn?

public fun interface PFN_DrvAlphaBlendFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long, param6: Long): BOOL
}

public typealias PFN_DrvAlphaBlend = PFN_DrvAlphaBlendFn?

public fun interface PFN_DrvAssertModeFn {
    public operator fun invoke(param0: DHPDEV, param1: BOOL): BOOL
}

public typealias PFN_DrvAssertMode = PFN_DrvAssertModeFn?

public fun interface PFN_DrvAssociateSharedSurfaceFn {
    public operator fun invoke(param0: Long, param1: HANDLE, param2: HANDLE, param3: SIZE): BOOL
}

public typealias PFN_DrvAssociateSharedSurface = PFN_DrvAssociateSharedSurfaceFn?

public fun interface PFN_DrvBitBltFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long, param6: Long, param7: Long, param8: Long, param9: Long, param10: UInt): BOOL
}

public typealias PFN_DrvBitBlt = PFN_DrvBitBltFn?

public fun interface PFN_DrvCompletePDEVFn {
    public operator fun invoke(param0: DHPDEV, param1: HDEV)
}

public typealias PFN_DrvCompletePDEV = PFN_DrvCompletePDEVFn?

public fun interface PFN_DrvCopyBitsFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long): BOOL
}

public typealias PFN_DrvCopyBits = PFN_DrvCopyBitsFn?

public fun interface PFN_DrvCreateDeviceBitmapFn {
    public operator fun invoke(param0: DHPDEV, param1: SIZE, param2: UInt): HBITMAP
}

public typealias PFN_DrvCreateDeviceBitmap = PFN_DrvCreateDeviceBitmapFn?

public fun interface PFN_DrvCreateDeviceBitmapExFn {
    public operator fun invoke(param0: DHPDEV, param1: SIZE, param2: UInt, param3: UInt, param4: DHSURF, param5: UInt, param6: UInt, param7: Long): HBITMAP
}

public typealias PFN_DrvCreateDeviceBitmapEx = PFN_DrvCreateDeviceBitmapExFn?

public fun interface PFN_DrvDeleteDeviceBitmapFn {
    public operator fun invoke(param0: DHSURF)
}

public typealias PFN_DrvDeleteDeviceBitmap = PFN_DrvDeleteDeviceBitmapFn?

public fun interface PFN_DrvDeleteDeviceBitmapExFn {
    public operator fun invoke(param0: DHSURF)
}

public typealias PFN_DrvDeleteDeviceBitmapEx = PFN_DrvDeleteDeviceBitmapExFn?

public fun interface PFN_DrvDescribePixelFormatFn {
    public operator fun invoke(param0: DHPDEV, param1: Int, param2: UInt, param3: Long): Int
}

public typealias PFN_DrvDescribePixelFormat = PFN_DrvDescribePixelFormatFn?

public fun interface PFN_DrvDestroyFontFn {
    public operator fun invoke(param0: Long)
}

public typealias PFN_DrvDestroyFont = PFN_DrvDestroyFontFn?

public fun interface PFN_DrvDisableDirectDrawFn {
    public operator fun invoke(param0: DHPDEV)
}

public typealias PFN_DrvDisableDirectDraw = PFN_DrvDisableDirectDrawFn?

public fun interface PFN_DrvDisableDriverFn {
    public operator fun invoke()
}

public typealias PFN_DrvDisableDriver = PFN_DrvDisableDriverFn?

public fun interface PFN_DrvDisablePDEVFn {
    public operator fun invoke(param0: DHPDEV)
}

public typealias PFN_DrvDisablePDEV = PFN_DrvDisablePDEVFn?

public fun interface PFN_DrvDisableSurfaceFn {
    public operator fun invoke(param0: DHPDEV)
}

public typealias PFN_DrvDisableSurface = PFN_DrvDisableSurfaceFn?

public fun interface PFN_DrvDitherColorFn {
    public operator fun invoke(param0: DHPDEV, param1: UInt, param2: UInt, param3: Long): UInt
}

public typealias PFN_DrvDitherColor = PFN_DrvDitherColorFn?

public fun interface PFN_DrvDrawEscapeFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: Long, param4: UInt, param5: Long): UInt
}

public typealias PFN_DrvDrawEscape = PFN_DrvDrawEscapeFn?

public fun interface PFN_DrvEnableDriverFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: Long): BOOL
}

public typealias PFN_DrvEnableDriver = PFN_DrvEnableDriverFn?

public fun interface PFN_DrvEnablePDEVFn {
    public operator fun invoke(param0: Long, param1: PCWSTR, param2: UInt, param3: Long, param4: UInt, param5: Long, param6: UInt, param7: Long, param8: HDEV, param9: PCWSTR, param10: HANDLE): DHPDEV
}

public typealias PFN_DrvEnablePDEV = PFN_DrvEnablePDEVFn?

public fun interface PFN_DrvEnableSurfaceFn {
    public operator fun invoke(param0: DHPDEV): HSURF
}

public typealias PFN_DrvEnableSurface = PFN_DrvEnableSurfaceFn?

public fun interface PFN_DrvEndDocFn {
    public operator fun invoke(pso: Long, fl: UInt): BOOL
}

public typealias PFN_DrvEndDoc = PFN_DrvEndDocFn?

public fun interface PFN_DrvEndDxInteropFn {
    public operator fun invoke(param0: Long, param1: BOOL, param2: Long, kernelmodedevicehandle: Long): BOOL
}

public typealias PFN_DrvEndDxInterop = PFN_DrvEndDxInteropFn?

public fun interface PFN_DrvEscapeFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: UInt, param3: Long, param4: UInt, param5: Long): UInt
}

public typealias PFN_DrvEscape = PFN_DrvEscapeFn?

public fun interface PFN_DrvFillPathFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: UInt, param6: UInt): BOOL
}

public typealias PFN_DrvFillPath = PFN_DrvFillPathFn?

public fun interface PFN_DrvFontManagementFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt, param3: UInt, param4: Long, param5: UInt, param6: Long): UInt
}

public typealias PFN_DrvFontManagement = PFN_DrvFontManagementFn?

public fun interface PFN_DrvFreeFn {
    public operator fun invoke(param0: Long, param1: ULong)
}

public typealias PFN_DrvFree = PFN_DrvFreeFn?

public fun interface PFN_DrvGetGlyphModeFn {
    public operator fun invoke(dhpdev: DHPDEV, pfo: Long): UInt
}

public typealias PFN_DrvGetGlyphMode = PFN_DrvGetGlyphModeFn?

public fun interface PFN_DrvGetModesFn {
    public operator fun invoke(param0: HANDLE, param1: UInt, param2: Long): UInt
}

public typealias PFN_DrvGetModes = PFN_DrvGetModesFn?

public fun interface PFN_DrvGetTrueTypeFileFn {
    public operator fun invoke(param0: ULong, param1: Long): Long
}

public typealias PFN_DrvGetTrueTypeFile = PFN_DrvGetTrueTypeFileFn?

public fun interface PFN_DrvGradientFillFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: UInt, param5: Long, param6: UInt, param7: Long, param8: Long, param9: UInt): BOOL
}

public typealias PFN_DrvGradientFill = PFN_DrvGradientFillFn?

public fun interface PFN_DrvIcmCheckBitmapBitsFn {
    public operator fun invoke(param0: DHPDEV, param1: HANDLE, param2: Long, param3: Long): BOOL
}

public typealias PFN_DrvIcmCheckBitmapBits = PFN_DrvIcmCheckBitmapBitsFn?

public fun interface PFN_DrvIcmCreateColorTransformFn {
    public operator fun invoke(param0: DHPDEV, param1: Long, param2: Long, param3: UInt, param4: Long, param5: UInt, param6: Long, param7: UInt, param8: UInt): HANDLE
}

public typealias PFN_DrvIcmCreateColorTransform = PFN_DrvIcmCreateColorTransformFn?

public fun interface PFN_DrvIcmDeleteColorTransformFn {
    public operator fun invoke(param0: DHPDEV, param1: HANDLE): BOOL
}

public typealias PFN_DrvIcmDeleteColorTransform = PFN_DrvIcmDeleteColorTransformFn?

public fun interface PFN_DrvIcmSetDeviceGammaRampFn {
    public operator fun invoke(param0: DHPDEV, param1: UInt, param2: Long): BOOL
}

public typealias PFN_DrvIcmSetDeviceGammaRamp = PFN_DrvIcmSetDeviceGammaRampFn?

public fun interface PFN_DrvLineToFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Int, param4: Int, param5: Int, param6: Int, param7: Long, param8: UInt): BOOL
}

public typealias PFN_DrvLineTo = PFN_DrvLineToFn?

public fun interface PFN_DrvLoadFontFileFn {
    public operator fun invoke(param0: UInt, param1: Long, param2: Long, param3: Long, param4: Long, param5: UInt, param6: UInt): ULong
}

public typealias PFN_DrvLoadFontFile = PFN_DrvLoadFontFileFn?

public fun interface PFN_DrvLockDisplayAreaFn {
    public operator fun invoke(param0: DHPDEV, param1: Long)
}

public typealias PFN_DrvLockDisplayArea = PFN_DrvLockDisplayAreaFn?

public fun interface PFN_DrvMovePointerFn {
    public operator fun invoke(pso: Long, x: Int, y: Int, prcl: Long)
}

public typealias PFN_DrvMovePointer = PFN_DrvMovePointerFn?

public fun interface PFN_DrvNextBandFn {
    public operator fun invoke(param0: Long, ppointl: Long): BOOL
}

public typealias PFN_DrvNextBand = PFN_DrvNextBandFn?

public fun interface PFN_DrvNotifyFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long)
}

public typealias PFN_DrvNotify = PFN_DrvNotifyFn?

public fun interface PFN_DrvPaintFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: UInt): BOOL
}

public typealias PFN_DrvPaint = PFN_DrvPaintFn?

public fun interface PFN_DrvPlgBltFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long, param6: Long, param7: Long, param8: Long, param9: Long, param10: UInt): BOOL
}

public typealias PFN_DrvPlgBlt = PFN_DrvPlgBltFn?

public fun interface PFN_DrvQueryAdvanceWidthsFn {
    public operator fun invoke(param0: DHPDEV, param1: Long, param2: UInt, param3: Long, param4: Long, param5: UInt): BOOL
}

public typealias PFN_DrvQueryAdvanceWidths = PFN_DrvQueryAdvanceWidthsFn?

public fun interface PFN_DrvQueryDeviceSupportFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: UInt, param4: UInt, param5: Long, param6: UInt, param7: Long): BOOL
}

public typealias PFN_DrvQueryDeviceSupport = PFN_DrvQueryDeviceSupportFn?

public fun interface PFN_DrvQueryFontFn {
    public operator fun invoke(param0: DHPDEV, param1: ULong, param2: UInt, param3: Long): Long
}

public typealias PFN_DrvQueryFont = PFN_DrvQueryFontFn?

public fun interface PFN_DrvQueryFontCapsFn {
    public operator fun invoke(param0: UInt, param1: Long): Int
}

public typealias PFN_DrvQueryFontCaps = PFN_DrvQueryFontCapsFn?

public fun interface PFN_DrvQueryFontDataFn {
    public operator fun invoke(param0: DHPDEV, param1: Long, param2: UInt, param3: UInt, param4: Long, param5: Long, param6: UInt): Int
}

public typealias PFN_DrvQueryFontData = PFN_DrvQueryFontDataFn?

public fun interface PFN_DrvQueryFontFileFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: UInt, param3: Long): Int
}

public typealias PFN_DrvQueryFontFile = PFN_DrvQueryFontFileFn?

public fun interface PFN_DrvQueryFontTreeFn {
    public operator fun invoke(param0: DHPDEV, param1: ULong, param2: UInt, param3: UInt, param4: Long): Long
}

public typealias PFN_DrvQueryFontTree = PFN_DrvQueryFontTreeFn?

public fun interface PFN_DrvQueryGlyphAttrsFn {
    public operator fun invoke(param0: Long, param1: UInt): Long
}

public typealias PFN_DrvQueryGlyphAttrs = PFN_DrvQueryGlyphAttrsFn?

public fun interface PFN_DrvQueryPerBandInfoFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias PFN_DrvQueryPerBandInfo = PFN_DrvQueryPerBandInfoFn?

public fun interface PFN_DrvQuerySpoolTypeFn {
    public operator fun invoke(dhpdev: DHPDEV, pwchtype: PCWSTR): BOOL
}

public typealias PFN_DrvQuerySpoolType = PFN_DrvQuerySpoolTypeFn?

public fun interface PFN_DrvQueryTrueTypeOutlineFn {
    public operator fun invoke(param0: DHPDEV, param1: Long, param2: UInt, param3: BOOL, param4: Long, param5: UInt, param6: Long): Int
}

public typealias PFN_DrvQueryTrueTypeOutline = PFN_DrvQueryTrueTypeOutlineFn?

public fun interface PFN_DrvQueryTrueTypeSectionFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: UInt, param3: Long, param4: Long): Int
}

public typealias PFN_DrvQueryTrueTypeSection = PFN_DrvQueryTrueTypeSectionFn?

public fun interface PFN_DrvQueryTrueTypeTableFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: UInt, param3: Int, param4: UInt, param5: Long, param6: Long, param7: Long): Int
}

public typealias PFN_DrvQueryTrueTypeTable = PFN_DrvQueryTrueTypeTableFn?

public fun interface PFN_DrvRealizeBrushFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: UInt): BOOL
}

public typealias PFN_DrvRealizeBrush = PFN_DrvRealizeBrushFn?

public fun interface PFN_DrvRenderHintFn {
    public operator fun invoke(dhpdev: DHPDEV, notifycode: UInt, length: ULong, data: Long): Int
}

public typealias PFN_DrvRenderHint = PFN_DrvRenderHintFn?

public fun interface PFN_DrvResetDeviceFn {
    public operator fun invoke(param0: DHPDEV, param1: Long): UInt
}

public typealias PFN_DrvResetDevice = PFN_DrvResetDeviceFn?

public fun interface PFN_DrvResetPDEVFn {
    public operator fun invoke(dhpdevold: DHPDEV, dhpdevnew: DHPDEV): BOOL
}

public typealias PFN_DrvResetPDEV = PFN_DrvResetPDEVFn?

public fun interface PFN_DrvSaveScreenBitsFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: ULong, param3: Long): ULong
}

public typealias PFN_DrvSaveScreenBits = PFN_DrvSaveScreenBitsFn?

public fun interface PFN_DrvSendPageFn {
    public operator fun invoke(param0: Long): BOOL
}

public typealias PFN_DrvSendPage = PFN_DrvSendPageFn?

public fun interface PFN_DrvSetPaletteFn {
    public operator fun invoke(param0: DHPDEV, param1: Long, param2: UInt, param3: UInt, param4: UInt): BOOL
}

public typealias PFN_DrvSetPalette = PFN_DrvSetPaletteFn?

public fun interface PFN_DrvSetPixelFormatFn {
    public operator fun invoke(param0: Long, param1: Int, param2: HWND): BOOL
}

public typealias PFN_DrvSetPixelFormat = PFN_DrvSetPixelFormatFn?

public fun interface PFN_DrvSetPointerShapeFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Int, param5: Int, param6: Int, param7: Int, param8: Long, param9: UInt): UInt
}

public typealias PFN_DrvSetPointerShape = PFN_DrvSetPointerShapeFn?

public fun interface PFN_DrvStartBandingFn {
    public operator fun invoke(param0: Long, ppointl: Long): BOOL
}

public typealias PFN_DrvStartBanding = PFN_DrvStartBandingFn?

public fun interface PFN_DrvStartDocFn {
    public operator fun invoke(pso: Long, pwszdocname: PCWSTR, dwjobid: UInt): BOOL
}

public typealias PFN_DrvStartDoc = PFN_DrvStartDocFn?

public fun interface PFN_DrvStartDxInteropFn {
    public operator fun invoke(param0: Long, param1: BOOL, kernelmodedevicehandle: Long): BOOL
}

public typealias PFN_DrvStartDxInterop = PFN_DrvStartDxInteropFn?

public fun interface PFN_DrvStartPageFn {
    public operator fun invoke(pso: Long): BOOL
}

public typealias PFN_DrvStartPage = PFN_DrvStartPageFn?

public fun interface PFN_DrvStretchBltFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long, param6: Long, param7: Long, param8: Long, param9: Long, param10: UInt): BOOL
}

public typealias PFN_DrvStretchBlt = PFN_DrvStretchBltFn?

public fun interface PFN_DrvStretchBltROPFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long, param6: Long, param7: Long, param8: Long, param9: Long, param10: UInt, param11: Long, param12: UInt): BOOL
}

public typealias PFN_DrvStretchBltROP = PFN_DrvStretchBltROPFn?

public fun interface PFN_DrvStrokeAndFillPathFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long, param6: Long, param7: Long, param8: UInt, param9: UInt): BOOL
}

public typealias PFN_DrvStrokeAndFillPath = PFN_DrvStrokeAndFillPathFn?

public fun interface PFN_DrvStrokePathFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long, param6: Long, param7: UInt): BOOL
}

public typealias PFN_DrvStrokePath = PFN_DrvStrokePathFn?

public fun interface PFN_DrvSurfaceCompleteFn {
    public operator fun invoke(param0: DHPDEV, param1: HANDLE): BOOL
}

public typealias PFN_DrvSurfaceComplete = PFN_DrvSurfaceCompleteFn?

public fun interface PFN_DrvSwapBuffersFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias PFN_DrvSwapBuffers = PFN_DrvSwapBuffersFn?

public fun interface PFN_DrvSynchronizeFn {
    public operator fun invoke(param0: DHPDEV, param1: Long)
}

public typealias PFN_DrvSynchronize = PFN_DrvSynchronizeFn?

public fun interface PFN_DrvSynchronizeRedirectionBitmapsFn {
    public operator fun invoke(param0: DHPDEV, param1: Long): NTSTATUS
}

public typealias PFN_DrvSynchronizeRedirectionBitmaps = PFN_DrvSynchronizeRedirectionBitmapsFn?

public fun interface PFN_DrvSynchronizeSurfaceFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt)
}

public typealias PFN_DrvSynchronizeSurface = PFN_DrvSynchronizeSurfaceFn?

public fun interface PFN_DrvTextOutFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long, param6: Long, param7: Long, param8: Long, param9: UInt): BOOL
}

public typealias PFN_DrvTextOut = PFN_DrvTextOutFn?

public fun interface PFN_DrvTransparentBltFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long, param6: UInt, param7: UInt): BOOL
}

public typealias PFN_DrvTransparentBlt = PFN_DrvTransparentBltFn?

public fun interface PFN_DrvUnloadFontFileFn {
    public operator fun invoke(param0: ULong): BOOL
}

public typealias PFN_DrvUnloadFontFile = PFN_DrvUnloadFontFileFn?

public fun interface PFN_DrvUnlockDisplayAreaFn {
    public operator fun invoke(param0: DHPDEV, param1: Long)
}

public typealias PFN_DrvUnlockDisplayArea = PFN_DrvUnlockDisplayAreaFn?

public fun interface PFN_EngCombineRgnFn {
    public operator fun invoke(hrgntrg: HANDLE, hrgnsrc1: HANDLE, hrgnsrc2: HANDLE, imode: Int): Int
}

public typealias PFN_EngCombineRgn = PFN_EngCombineRgnFn?

public fun interface PFN_EngCopyRgnFn {
    public operator fun invoke(hrgndst: HANDLE, hrgnsrc: HANDLE): Int
}

public typealias PFN_EngCopyRgn = PFN_EngCopyRgnFn?

public fun interface PFN_EngCreateRectRgnFn {
    public operator fun invoke(left: Int, top: Int, right: Int, bottom: Int): HANDLE
}

public typealias PFN_EngCreateRectRgn = PFN_EngCreateRectRgnFn?

public fun interface PFN_EngDeleteRgnFn {
    public operator fun invoke(hrgn: HANDLE)
}

public typealias PFN_EngDeleteRgn = PFN_EngDeleteRgnFn?

public fun interface PFN_EngIntersectRgnFn {
    public operator fun invoke(hrgnresult: HANDLE, hrgna: HANDLE, hrgnb: HANDLE): Int
}

public typealias PFN_EngIntersectRgn = PFN_EngIntersectRgnFn?

public fun interface PFN_EngSubtractRgnFn {
    public operator fun invoke(hrgnresult: HANDLE, hrgna: HANDLE, hrgnb: HANDLE): Int
}

public typealias PFN_EngSubtractRgn = PFN_EngSubtractRgnFn?

public fun interface PFN_EngUnionRgnFn {
    public operator fun invoke(hrgnresult: HANDLE, hrgna: HANDLE, hrgnb: HANDLE): Int
}

public typealias PFN_EngUnionRgn = PFN_EngUnionRgnFn?

public fun interface PFN_EngXorRgnFn {
    public operator fun invoke(hrgnresult: HANDLE, hrgna: HANDLE, hrgnb: HANDLE): Int
}

public typealias PFN_EngXorRgn = PFN_EngXorRgnFn?

public fun interface PVIDEO_WIN32K_CALLOUTFn {
    public operator fun invoke(params: Long)
}

public typealias PVIDEO_WIN32K_CALLOUT = PVIDEO_WIN32K_CALLOUTFn?

public typealias QUERY_DISPLAY_CONFIG_FLAGS = UInt

public typealias SET_DISPLAY_CONFIG_FLAGS = UInt

public fun interface SORTCOMPFn {
    public operator fun invoke(pv1: Long, pv2: Long): Int
}

public typealias SORTCOMP = SORTCOMPFn?

public typealias VIDEO_BANK_TYPE = Int

public typealias VIDEO_POWER_STATE = Int

public typealias VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE = Int

public fun interface WNDOBJCHANGEPROCFn {
    public operator fun invoke(pwo: Long, fl: UInt)
}

public typealias WNDOBJCHANGEPROC = WNDOBJCHANGEPROCFn?
