package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.Helpinfo

public typealias AccelVirtFlags = UByte

public typealias AnimateWindowFlags = UInt

public typealias CascadeWindowsHow = UInt

public typealias ChangeWindowMessageFilterFlags = UInt

public typealias CursorinfoFlags = UInt

public typealias CwpFlags = UInt

public typealias DevBroadcastHdrDeviceType = UInt

public typealias DevBroadcastVolumeFlags = UShort

public typealias DiFlags = UInt

public fun interface DlgprocFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Long
}

public typealias Dlgproc = DlgprocFn?

public typealias EditControlFeature = Int

public typealias FlashwinfoFlags = UInt

public typealias ForegroundWindowLockCode = UInt

public typealias GdiImageType = UInt

public typealias GetAncestorFlags = UInt

public typealias GetClassLongIndex = Int

public typealias GetMenuDefaultItemFlags = UInt

public typealias GetWindowCmd = UInt

public typealias GuithreadinfoFlags = UInt

public typealias Haccel = MutPtr<CVoid>

public typealias Handedness = Int

public typealias Hcursor = MutPtr<CVoid>

public typealias Hdevnotify = MutPtr<CVoid>

public typealias Hdwp = MutPtr<CVoid>

public typealias Hhook = MutPtr<CVoid>

public typealias Hicon = MutPtr<CVoid>

public typealias Hmenu = MutPtr<CVoid>

public fun interface HookprocFn {
    public operator fun invoke(code: Int, wparam: Wparam, lparam: Lparam): Lresult
}

public typealias Hookproc = HookprocFn?

public typealias ImageFlags = UInt

public typealias KbdllhookstructFlags = UInt

public typealias LayeredWindowAttributesFlags = UInt

public typealias MenugetobjectinfoFlags = UInt

public typealias MenuinfoMask = UInt

public typealias MenuinfoStyle = UInt

public typealias MenuItemFlags = UInt

public typealias MenuItemMask = UInt

public typealias MenuItemState = UInt

public typealias MenuItemType = UInt

public typealias MessageboxResult = Int

public typealias MessageboxStyle = UInt

public typealias MinimizedmetricsArrange = Int

public fun interface MsgboxcallbackFn {
    public operator fun invoke(lphelpinfo: MutPtr<Helpinfo>)
}

public typealias Msgboxcallback = MsgboxcallbackFn?

public typealias MsgfltinfoStatus = UInt

public typealias MsgWaitForMultipleObjectsExFlags = UInt

public typealias MrmDumpType = Int

public typealias MrmIndexerFlags = Int

public typealias MrmPackagingMode = Int

public typealias MrmPackagingOptions = Int

public typealias MrmPlatformVersion = Int

public typealias MrmResourceIndexerMessageSeverity = Int

public fun interface NameenumprocaFn {
    public operator fun invoke(param0: Pcstr, param1: Lparam): Bool
}

public typealias Nameenumproca = NameenumprocaFn?

public fun interface NameenumprocwFn {
    public operator fun invoke(param0: Pcwstr, param1: Lparam): Bool
}

public typealias Nameenumprocw = NameenumprocwFn?

public typealias ObjectIdentifier = Int

public typealias PeekMessageRemoveType = UInt

public typealias PointerInputType = Int

public fun interface PregisterclassnamewFn {
    public operator fun invoke(param0: Pcwstr): Boolean
}

public typealias Pregisterclassnamew = PregisterclassnamewFn?

public fun interface PropenumprocaFn {
    public operator fun invoke(param0: Hwnd, param1: Pcstr, param2: Handle): Bool
}

public typealias Propenumproca = PropenumprocaFn?

public fun interface PropenumprocexaFn {
    public operator fun invoke(param0: Hwnd, param1: Pcstr, param2: Handle, param3: ULong): Bool
}

public typealias Propenumprocexa = PropenumprocexaFn?

public fun interface PropenumprocexwFn {
    public operator fun invoke(param0: Hwnd, param1: Pcwstr, param2: Handle, param3: ULong): Bool
}

public typealias Propenumprocexw = PropenumprocexwFn?

public fun interface PropenumprocwFn {
    public operator fun invoke(param0: Hwnd, param1: Pcwstr, param2: Handle): Bool
}

public typealias Propenumprocw = PropenumprocwFn?

public typealias QueueStatusFlags = UInt

public typealias RegisterNotificationFlags = UInt

public typealias ScrollbarCommand = Int

public typealias ScrollbarConstants = Int

public typealias ScrollinfoMask = UInt

public typealias ScrollWindowFlags = UInt

public fun interface SendasyncprocFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: ULong, param3: Lresult)
}

public typealias Sendasyncproc = SendasyncprocFn?

public typealias SendMessageTimeoutFlags = UInt

public typealias SetWindowPosFlags = UInt

public typealias ShowWindowCmd = Int

public typealias ShowWindowStatus = UInt

public typealias SystemCursorId = UInt

public typealias SystemMetricsIndex = Int

public typealias SystemParametersInfoAction = UInt

public typealias SystemParametersInfoUpdateFlags = UInt

public typealias TileWindowsHow = UInt

public fun interface TimerprocFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: ULong, param3: UInt)
}

public typealias Timerproc = TimerprocFn?

public typealias TooltipDismissFlags = Int

public typealias TrackPopupMenuFlags = UInt

public typealias UpdateLayeredWindowFlags = UInt

public typealias WindowplacementFlags = UInt

public typealias WindowsHookId = Int

public typealias WindowDisplayAffinity = UInt

public typealias WindowExStyle = UInt

public typealias WindowLongPtrIndex = Int

public typealias WindowMessageFilterAction = UInt

public typealias WindowStyle = UInt

public typealias WndclassStyles = UInt

public fun interface WndenumprocFn {
    public operator fun invoke(param0: Hwnd, param1: Lparam): Bool
}

public typealias Wndenumproc = WndenumprocFn?

public fun interface WndprocFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Lresult
}

public typealias Wndproc = WndprocFn?
