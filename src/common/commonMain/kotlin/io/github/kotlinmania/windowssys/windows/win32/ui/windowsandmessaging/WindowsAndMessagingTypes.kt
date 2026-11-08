package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

public typealias ACCEL_VIRT_FLAGS = UByte

public typealias ANIMATE_WINDOW_FLAGS = UInt

public typealias CASCADE_WINDOWS_HOW = UInt

public typealias CHANGE_WINDOW_MESSAGE_FILTER_FLAGS = UInt

public typealias CURSORINFO_FLAGS = UInt

public typealias CWP_FLAGS = UInt

public typealias DEV_BROADCAST_HDR_DEVICE_TYPE = UInt

public typealias DEV_BROADCAST_VOLUME_FLAGS = UShort

public typealias DI_FLAGS = UInt

public fun interface DLGPROCFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): Long
}

public typealias DLGPROC = DLGPROCFn?

public typealias EDIT_CONTROL_FEATURE = Int

public typealias FLASHWINFO_FLAGS = UInt

public typealias FOREGROUND_WINDOW_LOCK_CODE = UInt

public typealias GDI_IMAGE_TYPE = UInt

public typealias GET_ANCESTOR_FLAGS = UInt

public typealias GET_CLASS_LONG_INDEX = Int

public typealias GET_MENU_DEFAULT_ITEM_FLAGS = UInt

public typealias GET_WINDOW_CMD = UInt

public typealias GUITHREADINFO_FLAGS = UInt

public typealias HACCEL = Long

public typealias HANDEDNESS = Int

public typealias HCURSOR = Long

public typealias HDEVNOTIFY = Long

public typealias HDWP = Long

public typealias HHOOK = Long

public typealias HICON = Long

public typealias HMENU = Long

public fun interface HOOKPROCFn {
    public operator fun invoke(code: Int, wparam: WPARAM, lparam: LPARAM): LRESULT
}

public typealias HOOKPROC = HOOKPROCFn?

public typealias IMAGE_FLAGS = UInt

public typealias KBDLLHOOKSTRUCT_FLAGS = UInt

public typealias LAYERED_WINDOW_ATTRIBUTES_FLAGS = UInt

public typealias MENUGETOBJECTINFO_FLAGS = UInt

public typealias MENUINFO_MASK = UInt

public typealias MENUINFO_STYLE = UInt

public typealias MENU_ITEM_FLAGS = UInt

public typealias MENU_ITEM_MASK = UInt

public typealias MENU_ITEM_STATE = UInt

public typealias MENU_ITEM_TYPE = UInt

public typealias MESSAGEBOX_RESULT = Int

public typealias MESSAGEBOX_STYLE = UInt

public typealias MINIMIZEDMETRICS_ARRANGE = Int

public fun interface MSGBOXCALLBACKFn {
    public operator fun invoke(lphelpinfo: Long)
}

public typealias MSGBOXCALLBACK = MSGBOXCALLBACKFn?

public typealias MSGFLTINFO_STATUS = UInt

public typealias MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS = UInt

public typealias MrmDumpType = Int

public typealias MrmIndexerFlags = Int

public typealias MrmPackagingMode = Int

public typealias MrmPackagingOptions = Int

public typealias MrmPlatformVersion = Int

public typealias MrmResourceIndexerMessageSeverity = Int

public fun interface NAMEENUMPROCAFn {
    public operator fun invoke(param0: PCSTR, param1: LPARAM): BOOL
}

public typealias NAMEENUMPROCA = NAMEENUMPROCAFn?

public fun interface NAMEENUMPROCWFn {
    public operator fun invoke(param0: PCWSTR, param1: LPARAM): BOOL
}

public typealias NAMEENUMPROCW = NAMEENUMPROCWFn?

public typealias OBJECT_IDENTIFIER = Int

public typealias PEEK_MESSAGE_REMOVE_TYPE = UInt

public typealias POINTER_INPUT_TYPE = Int

public fun interface PREGISTERCLASSNAMEWFn {
    public operator fun invoke(param0: PCWSTR): Boolean
}

public typealias PREGISTERCLASSNAMEW = PREGISTERCLASSNAMEWFn?

public fun interface PROPENUMPROCAFn {
    public operator fun invoke(param0: HWND, param1: PCSTR, param2: HANDLE): BOOL
}

public typealias PROPENUMPROCA = PROPENUMPROCAFn?

public fun interface PROPENUMPROCEXAFn {
    public operator fun invoke(param0: HWND, param1: PCSTR, param2: HANDLE, param3: ULong): BOOL
}

public typealias PROPENUMPROCEXA = PROPENUMPROCEXAFn?

public fun interface PROPENUMPROCEXWFn {
    public operator fun invoke(param0: HWND, param1: PCWSTR, param2: HANDLE, param3: ULong): BOOL
}

public typealias PROPENUMPROCEXW = PROPENUMPROCEXWFn?

public fun interface PROPENUMPROCWFn {
    public operator fun invoke(param0: HWND, param1: PCWSTR, param2: HANDLE): BOOL
}

public typealias PROPENUMPROCW = PROPENUMPROCWFn?

public typealias QUEUE_STATUS_FLAGS = UInt

public typealias REGISTER_NOTIFICATION_FLAGS = UInt

public typealias SCROLLBAR_COMMAND = Int

public typealias SCROLLBAR_CONSTANTS = Int

public typealias SCROLLINFO_MASK = UInt

public typealias SCROLL_WINDOW_FLAGS = UInt

public fun interface SENDASYNCPROCFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: ULong, param3: LRESULT)
}

public typealias SENDASYNCPROC = SENDASYNCPROCFn?

public typealias SEND_MESSAGE_TIMEOUT_FLAGS = UInt

public typealias SET_WINDOW_POS_FLAGS = UInt

public typealias SHOW_WINDOW_CMD = Int

public typealias SHOW_WINDOW_STATUS = UInt

public typealias SYSTEM_CURSOR_ID = UInt

public typealias SYSTEM_METRICS_INDEX = Int

public typealias SYSTEM_PARAMETERS_INFO_ACTION = UInt

public typealias SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS = UInt

public typealias TILE_WINDOWS_HOW = UInt

public fun interface TIMERPROCFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: ULong, param3: UInt)
}

public typealias TIMERPROC = TIMERPROCFn?

public typealias TOOLTIP_DISMISS_FLAGS = Int

public typealias TRACK_POPUP_MENU_FLAGS = UInt

public typealias UPDATE_LAYERED_WINDOW_FLAGS = UInt

public typealias WINDOWPLACEMENT_FLAGS = UInt

public typealias WINDOWS_HOOK_ID = Int

public typealias WINDOW_DISPLAY_AFFINITY = UInt

public typealias WINDOW_EX_STYLE = UInt

public typealias WINDOW_LONG_PTR_INDEX = Int

public typealias WINDOW_MESSAGE_FILTER_ACTION = UInt

public typealias WINDOW_STYLE = UInt

public typealias WNDCLASS_STYLES = UInt

public fun interface WNDENUMPROCFn {
    public operator fun invoke(param0: HWND, param1: LPARAM): BOOL
}

public typealias WNDENUMPROC = WNDENUMPROCFn?

public fun interface WNDPROCFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): LRESULT
}

public typealias WNDPROC = WNDPROCFn?
