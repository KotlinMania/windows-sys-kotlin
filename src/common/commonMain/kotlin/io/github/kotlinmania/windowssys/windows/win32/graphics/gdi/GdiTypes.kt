package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public typealias ArcDirection = Int

public typealias BackgroundMode = UInt

public typealias BiCompression = UInt

public typealias BrushStyle = UInt

public typealias CdsType = UInt

public fun interface CfpAllocprocFn {
    public operator fun invoke(param0: ULong): MutPtr
}

public typealias CfpAllocproc = CfpAllocprocFn?

public fun interface CfpFreeprocFn {
    public operator fun invoke(param0: MutPtr)
}

public typealias CfpFreeproc = CfpFreeprocFn?

public fun interface CfpReallocprocFn {
    public operator fun invoke(param0: MutPtr, param1: ULong): MutPtr
}

public typealias CfpReallocproc = CfpReallocprocFn?

public typealias CreateFontPackageSubsetEncoding = Short

public typealias CreateFontPackageSubsetPlatform = Short

public typealias CreatePolygonRgnMode = Int

public typealias DcLayout = UInt

public typealias DevmodeCollate = Short

public typealias DevmodeColor = Short

public typealias DevmodeDisplayFixedOutput = UInt

public typealias DevmodeDisplayOrientation = UInt

public typealias DevmodeDuplex = Short

public typealias DevmodeFieldFlags = UInt

public typealias DevmodeTruetypeOption = Short

public typealias DfcsState = UInt

public typealias DfcType = UInt

public typealias DibUsage = UInt

public typealias DisplayconfigColorEncoding = Int

public typealias DisplayDeviceStateFlags = UInt

public typealias DispChange = Int

public typealias DrawedgeFlags = UInt

public fun interface DrawstateprocFn {
    public operator fun invoke(hdc: Hdc, ldata: Lparam, wdata: Wparam, cx: Int, cy: Int): Bool
}

public typealias Drawstateproc = DrawstateprocFn?

public typealias DrawstateFlags = UInt

public typealias DrawCaptionFlags = UInt

public typealias DrawEdgeFlags = UInt

public typealias DrawTextFormat = UInt

public typealias EmbeddedFontPrivStatus = UInt

public typealias EmbedFontCharset = UInt

public typealias EnhancedMetafileRecordType = UInt

public fun interface EnhmfenumprocFn {
    public operator fun invoke(hdc: Hdc, lpht: ConstPtr, lpmr: ConstPtr, nhandles: Int, data: Lparam): Int
}

public typealias Enhmfenumproc = EnhmfenumprocFn?

public typealias EnumDisplaySettingsFlags = UInt

public typealias EnumDisplaySettingsMode = UInt

public typealias EtoOptions = UInt

public typealias ExtFloodFillType = UInt

public fun interface FontenumprocaFn {
    public operator fun invoke(param0: ConstPtr, param1: ConstPtr, param2: UInt, param3: Lparam): Int
}

public typealias Fontenumproca = FontenumprocaFn?

public fun interface FontenumprocwFn {
    public operator fun invoke(param0: ConstPtr, param1: ConstPtr, param2: UInt, param3: Lparam): Int
}

public typealias Fontenumprocw = FontenumprocwFn?

public typealias FontCharset = UByte

public typealias FontClipPrecision = UByte

public typealias FontFamily = UByte

public typealias FontLicensePrivs = UInt

public typealias FontOutputPrecision = UByte

public typealias FontPitch = UByte

public typealias FontQuality = UByte

public typealias FontResourceCharacteristics = UInt

public typealias FontWeight = UInt

public typealias GdiRegionType = Int

public typealias GetCharacterPlacementFlags = UInt

public typealias GetDcxFlags = UInt

public typealias GetDeviceCapsIndex = UInt

public typealias GetGlyphOutlineFormat = UInt

public typealias GetStockObjectFlags = Int

public fun interface GobjenumprocFn {
    public operator fun invoke(param0: MutPtr, param1: Lparam): Int
}

public typealias Gobjenumproc = GobjenumprocFn?

public typealias GradientFill = UInt

public typealias GraphicsMode = Int

public fun interface GraystringprocFn {
    public operator fun invoke(param0: Hdc, param1: Lparam, param2: Int): Bool
}

public typealias Graystringproc = GraystringprocFn?

public typealias HatchBrushStyle = Int

public typealias Hbitmap = MutPtr

public typealias Hbrush = MutPtr

public typealias Hdc = MutPtr

public typealias HdcMapMode = Int

public typealias Henhmetafile = MutPtr

public typealias Hfont = MutPtr

public typealias Hgdiobj = MutPtr

public typealias Hmetafile = MutPtr

public typealias Hmonitor = MutPtr

public typealias Hpalette = MutPtr

public typealias Hpen = MutPtr

public typealias Hrgn = MutPtr

public fun interface LineddaprocFn {
    public operator fun invoke(param0: Int, param1: Int, param2: Lparam)
}

public typealias Lineddaproc = LineddaprocFn?

public fun interface LpfndevcapsFn {
    public operator fun invoke(param0: Pcstr, param1: Pcstr, param2: UInt, param3: Pcstr, param4: MutPtr): UInt
}

public typealias Lpfndevcaps = LpfndevcapsFn?

public fun interface LpfndevmodeFn {
    public operator fun invoke(param0: Hwnd, param1: Hmodule, param2: MutPtr, param3: Pcstr, param4: Pcstr, param5: MutPtr, param6: Pcstr, param7: UInt): UInt
}

public typealias Lpfndevmode = LpfndevmodeFn?

public fun interface MfenumprocFn {
    public operator fun invoke(hdc: Hdc, lpht: ConstPtr, lpmr: ConstPtr, nobj: Int, param4: Lparam): Int
}

public typealias Mfenumproc = MfenumprocFn?

public typealias ModifyWorldTransformMode = UInt

public fun interface MonitorenumprocFn {
    public operator fun invoke(param0: Hmonitor, param1: Hdc, param2: MutPtr, param3: Lparam): Bool
}

public typealias Monitorenumproc = MonitorenumprocFn?

public typealias MonitorFromFlags = UInt

public typealias ObjType = Int

public typealias PanArmStyle = UByte

public typealias PanContrast = UByte

public typealias PanFamilyType = UByte

public typealias PanLettForm = UByte

public typealias PanMidline = UByte

public typealias PanProportion = UByte

public typealias PanSerifStyle = UByte

public typealias PanStrokeVariation = UByte

public typealias PanWeight = UByte

public typealias PanXheight = UByte

public typealias PenStyle = Int

public typealias R2Mode = Int

public fun interface ReadembedprocFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: UInt): UInt
}

public typealias Readembedproc = ReadembedprocFn?

public typealias RedrawWindowFlags = UInt

public typealias RgnCombineMode = Int

public typealias RopCode = UInt

public typealias SetBoundsRectFlags = UInt

public typealias StretchBltMode = Int

public typealias SystemPaletteUse = UInt

public typealias SysColorIndex = Int

public typealias TextAlignOptions = UInt

public typealias TmpfFlags = UByte

public typealias TtembedFlags = UInt

public typealias TtloadEmbeddedFontStatus = UInt

public fun interface WriteembedprocFn {
    public operator fun invoke(param0: MutPtr, param1: ConstPtr, param2: UInt): UInt
}

public typealias Writeembedproc = WriteembedprocFn?
