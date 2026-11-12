package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public expect fun buildCommDCBA(lpdef: Pcstr, lpdcb: MutPtr<Dcb>): Bool

public expect fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: MutPtr<Dcb>, lpcommtimeouts: MutPtr<Commtimeouts>): Bool

public expect fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: MutPtr<Dcb>, lpcommtimeouts: MutPtr<Commtimeouts>): Bool

public expect fun buildCommDCBW(lpdef: Pcwstr, lpdcb: MutPtr<Dcb>): Bool

public expect fun clearCommBreak(hfile: Handle): Bool

public expect fun clearCommError(hfile: Handle, lperrors: MutPtr<ClearCommErrorFlags>, lpstat: MutPtr<Comstat>): Bool

public expect fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: MutPtr<Commconfig>): Bool

public expect fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: MutPtr<Commconfig>): Bool

public expect fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool

public expect fun getCommConfig(hcommdev: Handle, lpcc: MutPtr<Commconfig>, lpdwsize: MutPtr<UInt>): Bool

public expect fun getCommMask(hfile: Handle, lpevtmask: MutPtr<CommEventMask>): Bool

public expect fun getCommModemStatus(hfile: Handle, lpmodemstat: MutPtr<ModemStatusFlags>): Bool

public expect fun getCommPorts(lpportnumbers: MutPtr<UInt>, uportnumberscount: UInt, puportnumbersfound: MutPtr<UInt>): UInt

public expect fun getCommProperties(hfile: Handle, lpcommprop: MutPtr<Commprop>): Bool

public expect fun getCommState(hfile: Handle, lpdcb: MutPtr<Dcb>): Bool

public expect fun getCommTimeouts(hfile: Handle, lpcommtimeouts: MutPtr<Commtimeouts>): Bool

public expect fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: MutPtr<Commconfig>, lpdwsize: MutPtr<UInt>): Bool

public expect fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: MutPtr<Commconfig>, lpdwsize: MutPtr<UInt>): Bool

public expect fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle

public expect fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool

public expect fun setCommBreak(hfile: Handle): Bool

public expect fun setCommConfig(hcommdev: Handle, lpcc: ConstPtr<Commconfig>, dwsize: UInt): Bool

public expect fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool

public expect fun setCommState(hfile: Handle, lpdcb: ConstPtr<Dcb>): Bool

public expect fun setCommTimeouts(hfile: Handle, lpcommtimeouts: ConstPtr<Commtimeouts>): Bool

public expect fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: ConstPtr<Commconfig>, dwsize: UInt): Bool

public expect fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: ConstPtr<Commconfig>, dwsize: UInt): Bool

public expect fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool

public expect fun transmitCommChar(hfile: Handle, cchar: Byte): Bool

public expect fun waitCommEvent(hfile: Handle, lpevtmask: MutPtr<CommEventMask>, lpoverlapped: MutPtr<Overlapped>): Bool
