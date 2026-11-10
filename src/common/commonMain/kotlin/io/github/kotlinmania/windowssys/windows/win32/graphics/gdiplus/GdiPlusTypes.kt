package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

public typealias Bitmap = Long

public typealias BrushType = Int

public typealias CGpEffect = Long

public typealias CachedBitmap = Long

public typealias ColorAdjustType = Int

public typealias ColorChannelFlags = Int

public typealias ColorMatrixFlags = Int

public typealias ColorMode = Int

public typealias CombineMode = Int

public typealias CompositingMode = Int

public typealias CompositingQuality = Int

public typealias ConvertToEmfPlusFlags = Int

public typealias CoordinateSpace = Int

public typealias CurveAdjustments = Int

public typealias CurveChannel = Int

public typealias CustomLineCap = Long

public typealias CustomLineCapType = Int

public typealias DashCap = Int

public typealias DashStyle = Int

public typealias DebugEventLevel = Int

public fun interface DebugEventProcFn {
    public operator fun invoke(level: DebugEventLevel, message: Pcstr)
}

public typealias DebugEventProc = DebugEventProcFn?

public typealias DitherType = Int

public fun interface DrawImageAbortFn {
    public operator fun invoke(): Bool
}

public typealias DrawImageAbort = DrawImageAbortFn?

public typealias DriverStringOptions = Int

public typealias EmfPlusRecordType = Int

public typealias EmfToWmfBitsFlags = Int

public typealias EmfType = Int

public typealias EncoderParameterValueType = Int

public typealias EncoderValue = Int

public fun interface EnumerateMetafileProcFn {
    public operator fun invoke(param0: EmfPlusRecordType, param1: UInt, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?): Bool
}

public typealias EnumerateMetafileProc = EnumerateMetafileProcFn?

public typealias FillMode = Int

public typealias FlushIntention = Int

public typealias Font = Long

public typealias FontCollection = Long

public typealias FontFamily = Long

public typealias FontStyle = Int

public typealias GdiplusStartupParams = Int

public typealias GenericFontFamily = Int

public fun interface GetThumbnailImageAbortFn {
    public operator fun invoke(): Bool
}

public typealias GetThumbnailImageAbort = GetThumbnailImageAbortFn?

public typealias GpTestControlEnum = Int

public typealias HatchStyle = Int

public typealias HistogramFormat = Int

public typealias HotkeyPrefix = Int

public typealias Image = Long

public fun interface ImageAbortFn {
    public operator fun invoke(param0: COpaquePointer?): Bool
}

public typealias ImageAbort = ImageAbortFn?

public typealias ImageCodecFlags = Int

public typealias ImageFlags = Int

public typealias ImageLockMode = Int

public typealias ImageType = Int

public typealias InstalledFontCollection = Long

public typealias InterpolationMode = Int

public typealias ItemDataPosition = Int

public typealias LineCap = Int

public typealias LineJoin = Int

public typealias LinearGradientMode = Int

public typealias Matrix = Long

public typealias MatrixOrder = Int

public typealias Metafile = Long

public typealias MetafileFrameUnit = Int

public typealias MetafileType = Int

public fun interface NotificationHookProcFn {
    public operator fun invoke(token: COpaquePointer?): Status
}

public typealias NotificationHookProc = NotificationHookProcFn?

public fun interface NotificationUnhookProcFn {
    public operator fun invoke(token: ULong)
}

public typealias NotificationUnhookProc = NotificationUnhookProcFn?

public typealias ObjectType = Int

public typealias PaletteFlags = Int

public typealias PaletteType = Int

public typealias PathData = Long

public typealias PathPointType = Int

public typealias PenAlignment = Int

public typealias PenType = Int

public typealias PixelOffsetMode = Int

public typealias PrivateFontCollection = Long

public typealias QualityMode = Int

public typealias Region = Long

public typealias RotateFlipType = Int

public typealias SmoothingMode = Int

public typealias Status = Int

public typealias StringAlignment = Int

public typealias StringDigitSubstitute = Int

public typealias StringFormatFlags = Int

public typealias StringTrimming = Int

public typealias TextRenderingHint = Int

public typealias Unit = Int

public typealias WarpMode = Int

public typealias WrapMode = Int
