@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.PAPCFUNC
import io.github.kotlinmania.windowssys.windows.win32.foundation.WAIT_EVENT
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_ACCESS_MASK

private val _windowsWin32SystemThreadingNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AcquireSRWLockExclusive(srwlock: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AcquireSRWLockExclusive(srwlock.toString())
    }
}

public actual fun AcquireSRWLockShared(srwlock: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AcquireSRWLockShared(srwlock.toString())
    }
}

public actual fun AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor: Long, integritylabel: PSID): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor.toString(), integritylabel.toString()) as Int) else 0

public actual fun AddSIDToBoundaryDescriptor(boundarydescriptor: Long, requiredsid: PSID): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AddSIDToBoundaryDescriptor(boundarydescriptor.toString(), requiredsid.toString()) as Int) else 0

public actual fun AttachThreadInput(idattach: UInt, idattachto: UInt, fattach: BOOL): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AttachThreadInput(idattach.toInt(), idattachto.toInt(), fattach) as Int) else 0

public actual fun AvQuerySystemResponsiveness(avrthandle: HANDLE, systemresponsivenessvalue: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvQuerySystemResponsiveness(avrthandle.toString(), systemresponsivenessvalue.toString()) as Int) else 0

public actual fun AvRevertMmThreadCharacteristics(avrthandle: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvRevertMmThreadCharacteristics(avrthandle.toString()) as Int) else 0

public actual fun AvRtCreateThreadOrderingGroup(context: Long, period: Long, threadorderingguid: Long, timeout: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroup(context.toString(), period.toString(), threadorderingguid.toString(), timeout.toString()) as Int) else 0

public actual fun AvRtCreateThreadOrderingGroupExA(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCSTR): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExA(context.toString(), period.toString(), threadorderingguid.toString(), timeout.toString(), taskname.toString()) as Int) else 0

public actual fun AvRtCreateThreadOrderingGroupExW(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCWSTR): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExW(context.toString(), period.toString(), threadorderingguid.toString(), timeout.toString(), taskname.toString()) as Int) else 0

public actual fun AvRtDeleteThreadOrderingGroup(context: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvRtDeleteThreadOrderingGroup(context.toString()) as Int) else 0

public actual fun AvRtJoinThreadOrderingGroup(context: Long, threadorderingguid: Long, before: BOOL): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvRtJoinThreadOrderingGroup(context.toString(), threadorderingguid.toString(), before) as Int) else 0

public actual fun AvRtLeaveThreadOrderingGroup(context: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvRtLeaveThreadOrderingGroup(context.toString()) as Int) else 0

public actual fun AvRtWaitOnThreadOrderingGroup(context: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvRtWaitOnThreadOrderingGroup(context.toString()) as Int) else 0

public actual fun AvSetMmMaxThreadCharacteristicsA(firsttask: PCSTR, secondtask: PCSTR, taskindex: Long): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsA(firsttask.toString(), secondtask.toString(), taskindex.toString()) as String).toLong() else 0L

public actual fun AvSetMmMaxThreadCharacteristicsW(firsttask: PCWSTR, secondtask: PCWSTR, taskindex: Long): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsW(firsttask.toString(), secondtask.toString(), taskindex.toString()) as String).toLong() else 0L

public actual fun AvSetMmThreadCharacteristicsA(taskname: PCSTR, taskindex: Long): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsA(taskname.toString(), taskindex.toString()) as String).toLong() else 0L

public actual fun AvSetMmThreadCharacteristicsW(taskname: PCWSTR, taskindex: Long): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsW(taskname.toString(), taskindex.toString()) as String).toLong() else 0L

public actual fun AvSetMmThreadPriority(avrthandle: HANDLE, priority: AVRT_PRIORITY): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_AvSetMmThreadPriority(avrthandle.toString(), priority) as Int) else 0

public actual fun CallbackMayRunLong(pci: PTP_CALLBACK_INSTANCE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CallbackMayRunLong(pci.toString()) as Int) else 0

public actual fun CancelThreadpoolIo(pio: PTP_IO) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CancelThreadpoolIo(pio.toString())
    }
}

public actual fun CancelTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CancelTimerQueueTimer(timerqueue.toString(), timer.toString()) as Int) else 0

public actual fun CancelWaitableTimer(htimer: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CancelWaitableTimer(htimer.toString()) as Int) else 0

public actual fun ChangeTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, duetime: UInt, period: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ChangeTimerQueueTimer(timerqueue.toString(), timer.toString(), duetime.toInt(), period.toInt()) as Int) else 0

public actual fun ClosePrivateNamespace(handle: HANDLE, flags: UInt): Boolean =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ClosePrivateNamespace(handle.toString(), flags.toInt()) as Boolean) else false

public actual fun CloseThreadpool(ptpp: PTP_POOL) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CloseThreadpool(ptpp.toString())
    }
}

public actual fun CloseThreadpoolCleanupGroup(ptpcg: PTP_CLEANUP_GROUP) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroup(ptpcg.toString())
    }
}

public actual fun CloseThreadpoolCleanupGroupMembers(ptpcg: PTP_CLEANUP_GROUP, fcancelpendingcallbacks: BOOL, pvcleanupcontext: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroupMembers(ptpcg.toString(), fcancelpendingcallbacks, pvcleanupcontext.toString())
    }
}

public actual fun CloseThreadpoolIo(pio: PTP_IO) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CloseThreadpoolIo(pio.toString())
    }
}

public actual fun CloseThreadpoolTimer(pti: PTP_TIMER) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CloseThreadpoolTimer(pti.toString())
    }
}

public actual fun CloseThreadpoolWait(pwa: PTP_WAIT) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CloseThreadpoolWait(pwa.toString())
    }
}

public actual fun CloseThreadpoolWork(pwk: PTP_WORK) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CloseThreadpoolWork(pwk.toString())
    }
}

public actual fun ConvertFiberToThread(): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ConvertFiberToThread() as Int) else 0

public actual fun ConvertThreadToFiber(lpparameter: Long): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ConvertThreadToFiber(lpparameter.toString()) as String).toLong() else 0L

public actual fun ConvertThreadToFiberEx(lpparameter: Long, dwflags: UInt): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ConvertThreadToFiberEx(lpparameter.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CreateBoundaryDescriptorA(name: PCSTR, flags: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateBoundaryDescriptorA(name.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun CreateBoundaryDescriptorW(name: PCWSTR, flags: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateBoundaryDescriptorW(name.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun CreateEventA(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateEventA(lpeventattributes.toString(), bmanualreset, binitialstate, lpname.toString()) as String).toLong() else 0L

public actual fun CreateEventExA(lpeventattributes: Long, lpname: PCSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateEventExA(lpeventattributes.toString(), lpname.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun CreateEventExW(lpeventattributes: Long, lpname: PCWSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateEventExW(lpeventattributes.toString(), lpname.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun CreateEventW(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCWSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateEventW(lpeventattributes.toString(), bmanualreset, binitialstate, lpname.toString()) as String).toLong() else 0L

public actual fun CreateFiber(dwstacksize: ULong, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateFiber(dwstacksize.toString(), lpstartaddress.toLong().toString(), lpparameter.toString()) as String).toLong() else 0L

public actual fun CreateFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateFiberEx(dwstackcommitsize.toString(), dwstackreservesize.toString(), dwflags.toInt(), lpstartaddress.toLong().toString(), lpparameter.toString()) as String).toLong() else 0L

public actual fun CreateMutexA(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateMutexA(lpmutexattributes.toString(), binitialowner, lpname.toString()) as String).toLong() else 0L

public actual fun CreateMutexExA(lpmutexattributes: Long, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateMutexExA(lpmutexattributes.toString(), lpname.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun CreateMutexExW(lpmutexattributes: Long, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateMutexExW(lpmutexattributes.toString(), lpname.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun CreateMutexW(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCWSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateMutexW(lpmutexattributes.toString(), binitialowner, lpname.toString()) as String).toLong() else 0L

public actual fun CreatePrivateNamespaceA(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreatePrivateNamespaceA(lpprivatenamespaceattributes.toString(), lpboundarydescriptor.toString(), lpaliasprefix.toString()) as String).toLong() else 0L

public actual fun CreatePrivateNamespaceW(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreatePrivateNamespaceW(lpprivatenamespaceattributes.toString(), lpboundarydescriptor.toString(), lpaliasprefix.toString()) as String).toLong() else 0L

public actual fun CreateProcessA(lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateProcessA(lpapplicationname.toString(), lpcommandline.toString(), lpprocessattributes.toString(), lpthreadattributes.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.toString(), lpcurrentdirectory.toString(), lpstartupinfo.toString(), lpprocessinformation.toString()) as Int) else 0

public actual fun CreateProcessAsUserA(htoken: HANDLE, lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateProcessAsUserA(htoken.toString(), lpapplicationname.toString(), lpcommandline.toString(), lpprocessattributes.toString(), lpthreadattributes.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.toString(), lpcurrentdirectory.toString(), lpstartupinfo.toString(), lpprocessinformation.toString()) as Int) else 0

public actual fun CreateProcessAsUserW(htoken: HANDLE, lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateProcessAsUserW(htoken.toString(), lpapplicationname.toString(), lpcommandline.toString(), lpprocessattributes.toString(), lpthreadattributes.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.toString(), lpcurrentdirectory.toString(), lpstartupinfo.toString(), lpprocessinformation.toString()) as Int) else 0

public actual fun CreateProcessW(lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateProcessW(lpapplicationname.toString(), lpcommandline.toString(), lpprocessattributes.toString(), lpthreadattributes.toString(), binherithandles, dwcreationflags.toInt(), lpenvironment.toString(), lpcurrentdirectory.toString(), lpstartupinfo.toString(), lpprocessinformation.toString()) as Int) else 0

public actual fun CreateProcessWithLogonW(lpusername: PCWSTR, lpdomain: PCWSTR, lppassword: PCWSTR, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateProcessWithLogonW(lpusername.toString(), lpdomain.toString(), lppassword.toString(), dwlogonflags.toInt(), lpapplicationname.toString(), lpcommandline.toString(), dwcreationflags.toInt(), lpenvironment.toString(), lpcurrentdirectory.toString(), lpstartupinfo.toString(), lpprocessinformation.toString()) as Int) else 0

public actual fun CreateProcessWithTokenW(htoken: HANDLE, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateProcessWithTokenW(htoken.toString(), dwlogonflags.toInt(), lpapplicationname.toString(), lpcommandline.toString(), dwcreationflags.toInt(), lpenvironment.toString(), lpcurrentdirectory.toString(), lpstartupinfo.toString(), lpprocessinformation.toString()) as Int) else 0

public actual fun CreateRemoteThread(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpthreadid: Long): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateRemoteThread(hprocess.toString(), lpthreadattributes.toString(), dwstacksize.toString(), lpstartaddress.toLong().toString(), lpparameter.toString(), dwcreationflags.toInt(), lpthreadid.toString()) as String).toLong() else 0L

public actual fun CreateRemoteThreadEx(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, lpthreadid: Long): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateRemoteThreadEx(hprocess.toString(), lpthreadattributes.toString(), dwstacksize.toString(), lpstartaddress.toLong().toString(), lpparameter.toString(), dwcreationflags.toInt(), lpattributelist.toString(), lpthreadid.toString()) as String).toLong() else 0L

public actual fun CreateSemaphoreA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateSemaphoreA(lpsemaphoreattributes.toString(), linitialcount, lmaximumcount, lpname.toString()) as String).toLong() else 0L

public actual fun CreateSemaphoreExA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateSemaphoreExA(lpsemaphoreattributes.toString(), linitialcount, lmaximumcount, lpname.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun CreateSemaphoreExW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateSemaphoreExW(lpsemaphoreattributes.toString(), linitialcount, lmaximumcount, lpname.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun CreateSemaphoreW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateSemaphoreW(lpsemaphoreattributes.toString(), linitialcount, lmaximumcount, lpname.toString()) as String).toLong() else 0L

public actual fun CreateThread(lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: THREAD_CREATION_FLAGS, lpthreadid: Long): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateThread(lpthreadattributes.toString(), dwstacksize.toString(), lpstartaddress.toLong().toString(), lpparameter.toString(), dwcreationflags.toInt(), lpthreadid.toString()) as String).toLong() else 0L

public actual fun CreateThreadpool(reserved: Long): PTP_POOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateThreadpool(reserved.toString()) as String).toLong() else 0L

public actual fun CreateThreadpoolCleanupGroup(): PTP_CLEANUP_GROUP =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateThreadpoolCleanupGroup() as String).toLong() else 0L

public actual fun CreateThreadpoolIo(fl: HANDLE, pfnio: PTP_WIN32_IO_CALLBACK, pv: Long, pcbe: Long): PTP_IO =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateThreadpoolIo(fl.toString(), pfnio.toLong().toString(), pv.toString(), pcbe.toString()) as String).toLong() else 0L

public actual fun CreateThreadpoolTimer(pfnti: PTP_TIMER_CALLBACK, pv: Long, pcbe: Long): PTP_TIMER =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateThreadpoolTimer(pfnti.toLong().toString(), pv.toString(), pcbe.toString()) as String).toLong() else 0L

public actual fun CreateThreadpoolWait(pfnwa: PTP_WAIT_CALLBACK, pv: Long, pcbe: Long): PTP_WAIT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateThreadpoolWait(pfnwa.toLong().toString(), pv.toString(), pcbe.toString()) as String).toLong() else 0L

public actual fun CreateThreadpoolWork(pfnwk: PTP_WORK_CALLBACK, pv: Long, pcbe: Long): PTP_WORK =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateThreadpoolWork(pfnwk.toLong().toString(), pv.toString(), pcbe.toString()) as String).toLong() else 0L

public actual fun CreateTimerQueue(): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateTimerQueue() as String).toLong() else 0L

public actual fun CreateTimerQueueTimer(phnewtimer: Long, timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, flags: WORKER_THREAD_FLAGS): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateTimerQueueTimer(phnewtimer.toString(), timerqueue.toString(), callback.toLong().toString(), parameter.toString(), duetime.toInt(), period.toInt(), flags.toInt()) as Int) else 0

public actual fun CreateUmsCompletionList(umscompletionlist: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateUmsCompletionList(umscompletionlist.toString()) as Int) else 0

public actual fun CreateUmsThreadContext(lpumsthread: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateUmsThreadContext(lpumsthread.toString()) as Int) else 0

public actual fun CreateWaitableTimerA(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateWaitableTimerA(lptimerattributes.toString(), bmanualreset, lptimername.toString()) as String).toLong() else 0L

public actual fun CreateWaitableTimerExA(lptimerattributes: Long, lptimername: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateWaitableTimerExA(lptimerattributes.toString(), lptimername.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun CreateWaitableTimerExW(lptimerattributes: Long, lptimername: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateWaitableTimerExW(lptimerattributes.toString(), lptimername.toString(), dwflags.toInt(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun CreateWaitableTimerW(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCWSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_CreateWaitableTimerW(lptimerattributes.toString(), bmanualreset, lptimername.toString()) as String).toLong() else 0L

public actual fun DeleteBoundaryDescriptor(boundarydescriptor: HANDLE) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DeleteBoundaryDescriptor(boundarydescriptor.toString())
    }
}

public actual fun DeleteCriticalSection(lpcriticalsection: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DeleteCriticalSection(lpcriticalsection.toString())
    }
}

public actual fun DeleteFiber(lpfiber: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DeleteFiber(lpfiber.toString())
    }
}

public actual fun DeleteProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DeleteProcThreadAttributeList(lpattributelist.toString())
    }
}

public actual fun DeleteSynchronizationBarrier(lpbarrier: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DeleteSynchronizationBarrier(lpbarrier.toString()) as Int) else 0

public actual fun DeleteTimerQueue(timerqueue: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DeleteTimerQueue(timerqueue.toString()) as Int) else 0

public actual fun DeleteTimerQueueEx(timerqueue: HANDLE, completionevent: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DeleteTimerQueueEx(timerqueue.toString(), completionevent.toString()) as Int) else 0

public actual fun DeleteTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, completionevent: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DeleteTimerQueueTimer(timerqueue.toString(), timer.toString(), completionevent.toString()) as Int) else 0

public actual fun DeleteUmsCompletionList(umscompletionlist: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DeleteUmsCompletionList(umscompletionlist.toString()) as Int) else 0

public actual fun DeleteUmsThreadContext(umsthread: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DeleteUmsThreadContext(umsthread.toString()) as Int) else 0

public actual fun DequeueUmsCompletionListItems(umscompletionlist: Long, waittimeout: UInt, umsthreadlist: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DequeueUmsCompletionListItems(umscompletionlist.toString(), waittimeout.toInt(), umsthreadlist.toString()) as Int) else 0

public actual fun DisassociateCurrentThreadFromCallback(pci: PTP_CALLBACK_INSTANCE) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_DisassociateCurrentThreadFromCallback(pci.toString())
    }
}

public actual fun EnterCriticalSection(lpcriticalsection: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_EnterCriticalSection(lpcriticalsection.toString())
    }
}

public actual fun EnterSynchronizationBarrier(lpbarrier: Long, dwflags: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_EnterSynchronizationBarrier(lpbarrier.toString(), dwflags.toInt()) as Int) else 0

public actual fun EnterUmsSchedulingMode(schedulerstartupinfo: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_EnterUmsSchedulingMode(schedulerstartupinfo.toString()) as Int) else 0

public actual fun ExecuteUmsThread(umsthread: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ExecuteUmsThread(umsthread.toString()) as Int) else 0

public actual fun ExitProcess(uexitcode: UInt): Nothing {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ExitProcess(uexitcode.toInt())
    }
    error("Unreachable noreturn C function ExitProcess")
}

public actual fun ExitThread(dwexitcode: UInt): Nothing {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ExitThread(dwexitcode.toInt())
    }
    error("Unreachable noreturn C function ExitThread")
}

public actual fun FlsAlloc(lpcallback: PFLS_CALLBACK_FUNCTION): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_FlsAlloc(lpcallback.toLong().toString()) as Int).toUInt() else 0u

public actual fun FlsFree(dwflsindex: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_FlsFree(dwflsindex.toInt()) as Int) else 0

public actual fun FlsGetValue(dwflsindex: UInt): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_FlsGetValue(dwflsindex.toInt()) as String).toLong() else 0L

public actual fun FlsSetValue(dwflsindex: UInt, lpflsdata: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_FlsSetValue(dwflsindex.toInt(), lpflsdata.toString()) as Int) else 0

public actual fun FlushProcessWriteBuffers() {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_FlushProcessWriteBuffers()
    }
}

public actual fun FreeLibraryWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mod: HMODULE) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_FreeLibraryWhenCallbackReturns(pci.toString(), mod.toString())
    }
}

public actual fun GetActiveProcessorCount(groupnumber: UShort): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetActiveProcessorCount(groupnumber.toInt()) as Int).toUInt() else 0u

public actual fun GetActiveProcessorGroupCount(): UShort =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetActiveProcessorGroupCount() as Int).toUShort() else 0u

public actual fun GetCurrentProcess(): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetCurrentProcess() as String).toLong() else 0L

public actual fun GetCurrentProcessId(): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetCurrentProcessId() as Int).toUInt() else 0u

public actual fun GetCurrentProcessorNumber(): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetCurrentProcessorNumber() as Int).toUInt() else 0u

public actual fun GetCurrentProcessorNumberEx(procnumber: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetCurrentProcessorNumberEx(procnumber.toString())
    }
}

public actual fun GetCurrentThread(): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetCurrentThread() as String).toLong() else 0L

public actual fun GetCurrentThreadId(): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetCurrentThreadId() as Int).toUInt() else 0u

public actual fun GetCurrentThreadStackLimits(lowlimit: Long, highlimit: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetCurrentThreadStackLimits(lowlimit.toString(), highlimit.toString())
    }
}

public actual fun GetCurrentUmsThread(): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetCurrentUmsThread() as String).toLong() else 0L

public actual fun GetExitCodeProcess(hprocess: HANDLE, lpexitcode: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetExitCodeProcess(hprocess.toString(), lpexitcode.toString()) as Int) else 0

public actual fun GetExitCodeThread(hthread: HANDLE, lpexitcode: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetExitCodeThread(hthread.toString(), lpexitcode.toString()) as Int) else 0

public actual fun GetGuiResources(hprocess: HANDLE, uiflags: GET_GUI_RESOURCES_FLAGS): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetGuiResources(hprocess.toString(), uiflags.toInt()) as Int).toUInt() else 0u

public actual fun GetMachineTypeAttributes(machine: UShort, machinetypeattributes: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetMachineTypeAttributes(machine.toInt(), machinetypeattributes.toString()) as Int) else 0

public actual fun GetMaximumProcessorCount(groupnumber: UShort): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetMaximumProcessorCount(groupnumber.toInt()) as Int).toUInt() else 0u

public actual fun GetMaximumProcessorGroupCount(): UShort =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetMaximumProcessorGroupCount() as Int).toUShort() else 0u

public actual fun GetNextUmsListItem(umscontext: Long): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNextUmsListItem(umscontext.toString()) as String).toLong() else 0L

public actual fun GetNumaAvailableMemoryNode(node: UByte, availablebytes: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNode(node.toInt(), availablebytes.toString()) as Int) else 0

public actual fun GetNumaAvailableMemoryNodeEx(node: UShort, availablebytes: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNodeEx(node.toInt(), availablebytes.toString()) as Int) else 0

public actual fun GetNumaHighestNodeNumber(highestnodenumber: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaHighestNodeNumber(highestnodenumber.toString()) as Int) else 0

public actual fun GetNumaNodeNumberFromHandle(hfile: HANDLE, nodenumber: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaNodeNumberFromHandle(hfile.toString(), nodenumber.toString()) as Int) else 0

public actual fun GetNumaNodeProcessorMask(node: UByte, processormask: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask(node.toInt(), processormask.toString()) as Int) else 0

public actual fun GetNumaNodeProcessorMask2(nodenumber: UShort, processormasks: Long, processormaskcount: UShort, requiredmaskcount: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask2(nodenumber.toInt(), processormasks.toString(), processormaskcount.toInt(), requiredmaskcount.toString()) as Int) else 0

public actual fun GetNumaNodeProcessorMaskEx(node: UShort, processormask: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaNodeProcessorMaskEx(node.toInt(), processormask.toString()) as Int) else 0

public actual fun GetNumaProcessorNode(processor: UByte, nodenumber: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaProcessorNode(processor.toInt(), nodenumber.toString()) as Int) else 0

public actual fun GetNumaProcessorNodeEx(processor: Long, nodenumber: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaProcessorNodeEx(processor.toString(), nodenumber.toString()) as Int) else 0

public actual fun GetNumaProximityNode(proximityid: UInt, nodenumber: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaProximityNode(proximityid.toInt(), nodenumber.toString()) as Int) else 0

public actual fun GetNumaProximityNodeEx(proximityid: UInt, nodenumber: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetNumaProximityNodeEx(proximityid.toInt(), nodenumber.toString()) as Int) else 0

public actual fun GetPriorityClass(hprocess: HANDLE): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetPriorityClass(hprocess.toString()) as Int).toUInt() else 0u

public actual fun GetProcessAffinityMask(hprocess: HANDLE, lpprocessaffinitymask: Long, lpsystemaffinitymask: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessAffinityMask(hprocess.toString(), lpprocessaffinitymask.toString(), lpsystemaffinitymask.toString()) as Int) else 0

public actual fun GetProcessDEPPolicy(hprocess: HANDLE, lpflags: Long, lppermanent: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessDEPPolicy(hprocess.toString(), lpflags.toString(), lppermanent.toString()) as Int) else 0

public actual fun GetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessDefaultCpuSetMasks(process.toString(), cpusetmasks.toString(), cpusetmaskcount.toInt(), requiredmaskcount.toString()) as Int) else 0

public actual fun GetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessDefaultCpuSets(process.toString(), cpusetids.toString(), cpusetidcount.toInt(), requiredidcount.toString()) as Int) else 0

public actual fun GetProcessGroupAffinity(hprocess: HANDLE, groupcount: Long, grouparray: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessGroupAffinity(hprocess.toString(), groupcount.toString(), grouparray.toString()) as Int) else 0

public actual fun GetProcessHandleCount(hprocess: HANDLE, pdwhandlecount: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessHandleCount(hprocess.toString(), pdwhandlecount.toString()) as Int) else 0

public actual fun GetProcessHandleFromHwnd(hwnd: HWND): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessHandleFromHwnd(hwnd.toString()) as String).toLong() else 0L

public actual fun GetProcessId(process: HANDLE): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessId(process.toString()) as Int).toUInt() else 0u

public actual fun GetProcessIdOfThread(thread: HANDLE): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessIdOfThread(thread.toString()) as Int).toUInt() else 0u

public actual fun GetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessInformation(hprocess.toString(), processinformationclass, processinformation.toString(), processinformationsize.toInt()) as Int) else 0

public actual fun GetProcessIoCounters(hprocess: HANDLE, lpiocounters: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessIoCounters(hprocess.toString(), lpiocounters.toString()) as Int) else 0

public actual fun GetProcessMitigationPolicy(hprocess: HANDLE, mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessMitigationPolicy(hprocess.toString(), mitigationpolicy, lpbuffer.toString(), dwlength.toString()) as Int) else 0

public actual fun GetProcessPriorityBoost(hprocess: HANDLE, pdisablepriorityboost: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessPriorityBoost(hprocess.toString(), pdisablepriorityboost.toString()) as Int) else 0

public actual fun GetProcessShutdownParameters(lpdwlevel: Long, lpdwflags: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessShutdownParameters(lpdwlevel.toString(), lpdwflags.toString()) as Int) else 0

public actual fun GetProcessTimes(hprocess: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessTimes(hprocess.toString(), lpcreationtime.toString(), lpexittime.toString(), lpkerneltime.toString(), lpusertime.toString()) as Int) else 0

public actual fun GetProcessVersion(processid: UInt): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessVersion(processid.toInt()) as Int).toUInt() else 0u

public actual fun GetProcessWorkingSetSize(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetProcessWorkingSetSize(hprocess.toString(), lpminimumworkingsetsize.toString(), lpmaximumworkingsetsize.toString()) as Int) else 0

public actual fun GetStartupInfoA(lpstartupinfo: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetStartupInfoA(lpstartupinfo.toString())
    }
}

public actual fun GetStartupInfoW(lpstartupinfo: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetStartupInfoW(lpstartupinfo.toString())
    }
}

public actual fun GetSystemTimes(lpidletime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetSystemTimes(lpidletime.toString(), lpkerneltime.toString(), lpusertime.toString()) as Int) else 0

public actual fun GetThreadDescription(hthread: HANDLE, ppszthreaddescription: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadDescription(hthread.toString(), ppszthreaddescription.toString()) as Int) else 0

public actual fun GetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadGroupAffinity(hthread.toString(), groupaffinity.toString()) as Int) else 0

public actual fun GetThreadIOPendingFlag(hthread: HANDLE, lpioispending: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadIOPendingFlag(hthread.toString(), lpioispending.toString()) as Int) else 0

public actual fun GetThreadId(thread: HANDLE): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadId(thread.toString()) as Int).toUInt() else 0u

public actual fun GetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadIdealProcessorEx(hthread.toString(), lpidealprocessor.toString()) as Int) else 0

public actual fun GetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadInformation(hthread.toString(), threadinformationclass, threadinformation.toString(), threadinformationsize.toInt()) as Int) else 0

public actual fun GetThreadPriority(hthread: HANDLE): Int =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadPriority(hthread.toString()) as Int) else 0

public actual fun GetThreadPriorityBoost(hthread: HANDLE, pdisablepriorityboost: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadPriorityBoost(hthread.toString(), pdisablepriorityboost.toString()) as Int) else 0

public actual fun GetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadSelectedCpuSetMasks(thread.toString(), cpusetmasks.toString(), cpusetmaskcount.toInt(), requiredmaskcount.toString()) as Int) else 0

public actual fun GetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadSelectedCpuSets(thread.toString(), cpusetids.toString(), cpusetidcount.toInt(), requiredidcount.toString()) as Int) else 0

public actual fun GetThreadTimes(hthread: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetThreadTimes(hthread.toString(), lpcreationtime.toString(), lpexittime.toString(), lpkerneltime.toString(), lpusertime.toString()) as Int) else 0

public actual fun GetUmsCompletionListEvent(umscompletionlist: Long, umscompletionevent: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetUmsCompletionListEvent(umscompletionlist.toString(), umscompletionevent.toString()) as Int) else 0

public actual fun GetUmsSystemThreadInformation(threadhandle: HANDLE, systemthreadinfo: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_GetUmsSystemThreadInformation(threadhandle.toString(), systemthreadinfo.toString()) as Int) else 0

public actual fun InitOnceBeginInitialize(lpinitonce: Long, dwflags: UInt, fpending: Long, lpcontext: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitOnceBeginInitialize(lpinitonce.toString(), dwflags.toInt(), fpending.toString(), lpcontext.toString()) as Int) else 0

public actual fun InitOnceComplete(lpinitonce: Long, dwflags: UInt, lpcontext: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitOnceComplete(lpinitonce.toString(), dwflags.toInt(), lpcontext.toString()) as Int) else 0

public actual fun InitOnceExecuteOnce(initonce: Long, initfn: PINIT_ONCE_FN, parameter: Long, context: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitOnceExecuteOnce(initonce.toString(), initfn.toLong().toString(), parameter.toString(), context.toString()) as Int) else 0

public actual fun InitOnceInitialize(initonce: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitOnceInitialize(initonce.toString())
    }
}

public actual fun InitializeConditionVariable(conditionvariable: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitializeConditionVariable(conditionvariable.toString())
    }
}

public actual fun InitializeCriticalSection(lpcriticalsection: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitializeCriticalSection(lpcriticalsection.toString())
    }
}

public actual fun InitializeCriticalSectionAndSpinCount(lpcriticalsection: Long, dwspincount: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitializeCriticalSectionAndSpinCount(lpcriticalsection.toString(), dwspincount.toInt()) as Int) else 0

public actual fun InitializeCriticalSectionEx(lpcriticalsection: Long, dwspincount: UInt, flags: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitializeCriticalSectionEx(lpcriticalsection.toString(), dwspincount.toInt(), flags.toInt()) as Int) else 0

public actual fun InitializeProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwattributecount: UInt, dwflags: UInt, lpsize: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitializeProcThreadAttributeList(lpattributelist.toString(), dwattributecount.toInt(), dwflags.toInt(), lpsize.toString()) as Int) else 0

public actual fun InitializeSListHead(listhead: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitializeSListHead(listhead.toString())
    }
}

public actual fun InitializeSRWLock(srwlock: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitializeSRWLock(srwlock.toString())
    }
}

public actual fun InitializeSynchronizationBarrier(lpbarrier: Long, ltotalthreads: Int, lspincount: Int): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InitializeSynchronizationBarrier(lpbarrier.toString(), ltotalthreads, lspincount) as Int) else 0

public actual fun InterlockedFlushSList(listhead: Long): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InterlockedFlushSList(listhead.toString()) as String).toLong() else 0L

public actual fun InterlockedPopEntrySList(listhead: Long): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InterlockedPopEntrySList(listhead.toString()) as String).toLong() else 0L

public actual fun InterlockedPushEntrySList(listhead: Long, listentry: Long): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InterlockedPushEntrySList(listhead.toString(), listentry.toString()) as String).toLong() else 0L

public actual fun InterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_InterlockedPushListSListEx(listhead.toString(), list.toString(), listend.toString(), count.toInt()) as String).toLong() else 0L

public actual fun IsImmersiveProcess(hprocess: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_IsImmersiveProcess(hprocess.toString()) as Int) else 0

public actual fun IsProcessCritical(hprocess: HANDLE, critical: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_IsProcessCritical(hprocess.toString(), critical.toString()) as Int) else 0

public actual fun IsProcessorFeaturePresent(processorfeature: PROCESSOR_FEATURE_ID): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_IsProcessorFeaturePresent(processorfeature.toInt()) as Int) else 0

public actual fun IsThreadAFiber(): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_IsThreadAFiber() as Int) else 0

public actual fun IsThreadpoolTimerSet(pti: PTP_TIMER): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_IsThreadpoolTimerSet(pti.toString()) as Int) else 0

public actual fun IsWow64Process(hprocess: HANDLE, wow64process: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_IsWow64Process(hprocess.toString(), wow64process.toString()) as Int) else 0

public actual fun IsWow64Process2(hprocess: HANDLE, pprocessmachine: Long, pnativemachine: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_IsWow64Process2(hprocess.toString(), pprocessmachine.toString(), pnativemachine.toString()) as Int) else 0

public actual fun LeaveCriticalSection(lpcriticalsection: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_LeaveCriticalSection(lpcriticalsection.toString())
    }
}

public actual fun LeaveCriticalSectionWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, pcs: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_LeaveCriticalSectionWhenCallbackReturns(pci.toString(), pcs.toString())
    }
}

public actual fun OpenEventA(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenEventA(dwdesiredaccess.toInt(), binherithandle, lpname.toString()) as String).toLong() else 0L

public actual fun OpenEventW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenEventW(dwdesiredaccess.toInt(), binherithandle, lpname.toString()) as String).toLong() else 0L

public actual fun OpenMutexW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenMutexW(dwdesiredaccess.toInt(), binherithandle, lpname.toString()) as String).toLong() else 0L

public actual fun OpenPrivateNamespaceA(lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenPrivateNamespaceA(lpboundarydescriptor.toString(), lpaliasprefix.toString()) as String).toLong() else 0L

public actual fun OpenPrivateNamespaceW(lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenPrivateNamespaceW(lpboundarydescriptor.toString(), lpaliasprefix.toString()) as String).toLong() else 0L

public actual fun OpenProcess(dwdesiredaccess: PROCESS_ACCESS_RIGHTS, binherithandle: BOOL, dwprocessid: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenProcess(dwdesiredaccess.toInt(), binherithandle, dwprocessid.toInt()) as String).toLong() else 0L

public actual fun OpenProcessToken(processhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, tokenhandle: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenProcessToken(processhandle.toString(), desiredaccess.toInt(), tokenhandle.toString()) as Int) else 0

public actual fun OpenSemaphoreW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenSemaphoreW(dwdesiredaccess.toInt(), binherithandle, lpname.toString()) as String).toLong() else 0L

public actual fun OpenThread(dwdesiredaccess: THREAD_ACCESS_RIGHTS, binherithandle: BOOL, dwthreadid: UInt): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenThread(dwdesiredaccess.toInt(), binherithandle, dwthreadid.toInt()) as String).toLong() else 0L

public actual fun OpenThreadToken(threadhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, openasself: BOOL, tokenhandle: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenThreadToken(threadhandle.toString(), desiredaccess.toInt(), openasself, tokenhandle.toString()) as Int) else 0

public actual fun OpenWaitableTimerA(dwdesiredaccess: UInt, binherithandle: BOOL, lptimername: PCSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenWaitableTimerA(dwdesiredaccess.toInt(), binherithandle, lptimername.toString()) as String).toLong() else 0L

public actual fun OpenWaitableTimerW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lptimername: PCWSTR): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_OpenWaitableTimerW(dwdesiredaccess.toInt(), binherithandle, lptimername.toString()) as String).toLong() else 0L

public actual fun PulseEvent(hevent: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_PulseEvent(hevent.toString()) as Int) else 0

public actual fun QueryDepthSList(listhead: Long): UShort =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_QueryDepthSList(listhead.toString()) as Int).toUShort() else 0u

public actual fun QueryFullProcessImageNameA(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PSTR, lpdwsize: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_QueryFullProcessImageNameA(hprocess.toString(), dwflags.toInt(), lpexename.toString(), lpdwsize.toString()) as Int) else 0

public actual fun QueryFullProcessImageNameW(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PWSTR, lpdwsize: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_QueryFullProcessImageNameW(hprocess.toString(), dwflags.toInt(), lpexename.toString(), lpdwsize.toString()) as Int) else 0

public actual fun QueryProcessAffinityUpdateMode(hprocess: HANDLE, lpdwflags: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_QueryProcessAffinityUpdateMode(hprocess.toString(), lpdwflags.toString()) as Int) else 0

public actual fun QueryProtectedPolicy(policyguid: Long, policyvalue: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_QueryProtectedPolicy(policyguid.toString(), policyvalue.toString()) as Int) else 0

public actual fun QueryThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_QueryThreadpoolStackInformation(ptpp.toString(), ptpsi.toString()) as Int) else 0

public actual fun QueryUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt, returnlength: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_QueryUmsThreadInformation(umsthread.toString(), umsthreadinfoclass, umsthreadinformation.toString(), umsthreadinformationlength.toInt(), returnlength.toString()) as Int) else 0

public actual fun QueueUserAPC(pfnapc: PAPCFUNC, hthread: HANDLE, dwdata: ULong): UInt =
    0u

public actual fun QueueUserAPC2(apcroutine: PAPCFUNC, thread: HANDLE, data: ULong, flags: QUEUE_USER_APC_FLAGS): BOOL =
    0

public actual fun QueueUserWorkItem(function: LPTHREAD_START_ROUTINE, context: Long, flags: WORKER_THREAD_FLAGS): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_QueueUserWorkItem(function.toLong().toString(), context.toString(), flags.toInt()) as Int) else 0

public actual fun RegisterWaitForSingleObject(phnewwaitobject: Long, hobject: HANDLE, callback: WAITORTIMERCALLBACK, context: Long, dwmilliseconds: UInt, dwflags: WORKER_THREAD_FLAGS): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RegisterWaitForSingleObject(phnewwaitobject.toString(), hobject.toString(), callback.toLong().toString(), context.toString(), dwmilliseconds.toInt(), dwflags.toInt()) as Int) else 0

public actual fun ReleaseMutex(hmutex: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ReleaseMutex(hmutex.toString()) as Int) else 0

public actual fun ReleaseMutexWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mut: HANDLE) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ReleaseMutexWhenCallbackReturns(pci.toString(), mut.toString())
    }
}

public actual fun ReleaseSRWLockExclusive(srwlock: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ReleaseSRWLockExclusive(srwlock.toString())
    }
}

public actual fun ReleaseSRWLockShared(srwlock: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ReleaseSRWLockShared(srwlock.toString())
    }
}

public actual fun ReleaseSemaphore(hsemaphore: HANDLE, lreleasecount: Int, lppreviouscount: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ReleaseSemaphore(hsemaphore.toString(), lreleasecount, lppreviouscount.toString()) as Int) else 0

public actual fun ReleaseSemaphoreWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, sem: HANDLE, crel: UInt) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ReleaseSemaphoreWhenCallbackReturns(pci.toString(), sem.toString(), crel.toInt())
    }
}

public actual fun ResetEvent(hevent: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ResetEvent(hevent.toString()) as Int) else 0

public actual fun ResumeThread(hthread: HANDLE): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_ResumeThread(hthread.toString()) as Int).toUInt() else 0u

public actual fun RtwqAddPeriodicCallback(callback: RTWQPERIODICCALLBACK, context: Long, key: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqAddPeriodicCallback(callback.toLong().toString(), context.toString(), key.toString()) as Int) else 0

public actual fun RtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqAllocateSerialWorkQueue(workqueueidin.toInt(), workqueueidout.toString()) as Int) else 0

public actual fun RtwqAllocateWorkQueue(workqueuetype: RTWQ_WORKQUEUE_TYPE, workqueueid: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqAllocateWorkQueue(workqueuetype, workqueueid.toString()) as Int) else 0

public actual fun RtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: PCWSTR, dwtaskid: UInt, lpriority: Int, donecallback: Long, donestate: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqBeginRegisterWorkQueueWithMMCSS(workqueueid.toInt(), usageclass.toString(), dwtaskid.toInt(), lpriority, donecallback.toString(), donestate.toString()) as Int) else 0

public actual fun RtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: Long, donestate: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid.toInt(), donecallback.toString(), donestate.toString()) as Int) else 0

public actual fun RtwqCancelDeadline(prequest: HANDLE): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqCancelDeadline(prequest.toString()) as Int) else 0

public actual fun RtwqCancelWorkItem(key: ULong): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqCancelWorkItem(key.toString()) as Int) else 0

public actual fun RtwqCreateAsyncResult(appobject: Long, callback: Long, appstate: Long, asyncresult: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqCreateAsyncResult(appobject.toString(), callback.toString(), appstate.toString(), asyncresult.toString()) as Int) else 0

public actual fun RtwqEndRegisterWorkQueueWithMMCSS(result: Long, taskid: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqEndRegisterWorkQueueWithMMCSS(result.toString(), taskid.toString()) as Int) else 0

public actual fun RtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: PWSTR, usageclasslength: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSClass(workqueueid.toInt(), usageclass.toString(), usageclasslength.toString()) as Int) else 0

public actual fun RtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSPriority(workqueueid.toInt(), priority.toString()) as Int) else 0

public actual fun RtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSTaskId(workqueueid.toInt(), taskid.toString()) as Int) else 0

public actual fun RtwqInvokeCallback(result: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqInvokeCallback(result.toString()) as Int) else 0

public actual fun RtwqJoinWorkQueue(workqueueid: UInt, hfile: HANDLE, out: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqJoinWorkQueue(workqueueid.toInt(), hfile.toString(), out.toString()) as Int) else 0

public actual fun RtwqLockPlatform(): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqLockPlatform() as Int) else 0

public actual fun RtwqLockSharedWorkQueue(usageclass: PCWSTR, basepriority: Int, taskid: Long, id: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqLockSharedWorkQueue(usageclass.toString(), basepriority, taskid.toString(), id.toString()) as Int) else 0

public actual fun RtwqLockWorkQueue(workqueueid: UInt): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqLockWorkQueue(workqueueid.toInt()) as Int) else 0

public actual fun RtwqPutWaitingWorkItem(hevent: HANDLE, lpriority: Int, result: Long, key: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqPutWaitingWorkItem(hevent.toString(), lpriority, result.toString(), key.toString()) as Int) else 0

public actual fun RtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqPutWorkItem(dwqueue.toInt(), lpriority, result.toString()) as Int) else 0

public actual fun RtwqRegisterPlatformEvents(platformevents: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqRegisterPlatformEvents(platformevents.toString()) as Int) else 0

public actual fun RtwqRegisterPlatformWithMMCSS(usageclass: PCWSTR, taskid: Long, lpriority: Int): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqRegisterPlatformWithMMCSS(usageclass.toString(), taskid.toString(), lpriority) as Int) else 0

public actual fun RtwqRemovePeriodicCallback(dwkey: UInt): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqRemovePeriodicCallback(dwkey.toInt()) as Int) else 0

public actual fun RtwqScheduleWorkItem(result: Long, timeout: Long, key: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqScheduleWorkItem(result.toString(), timeout.toString(), key.toString()) as Int) else 0

public actual fun RtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqSetDeadline(workqueueid.toInt(), deadlineinhns.toString(), prequest.toString()) as Int) else 0

public actual fun RtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqSetDeadline2(workqueueid.toInt(), deadlineinhns.toString(), predeadlineinhns.toString(), prequest.toString()) as Int) else 0

public actual fun RtwqSetLongRunning(workqueueid: UInt, enable: BOOL): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqSetLongRunning(workqueueid.toInt(), enable) as Int) else 0

public actual fun RtwqShutdown(): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqShutdown() as Int) else 0

public actual fun RtwqStartup(): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqStartup() as Int) else 0

public actual fun RtwqUnjoinWorkQueue(workqueueid: UInt, hfile: HANDLE): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqUnjoinWorkQueue(workqueueid.toInt(), hfile.toString()) as Int) else 0

public actual fun RtwqUnlockPlatform(): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqUnlockPlatform() as Int) else 0

public actual fun RtwqUnlockWorkQueue(workqueueid: UInt): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqUnlockWorkQueue(workqueueid.toInt()) as Int) else 0

public actual fun RtwqUnregisterPlatformEvents(platformevents: Long): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqUnregisterPlatformEvents(platformevents.toString()) as Int) else 0

public actual fun RtwqUnregisterPlatformFromMMCSS(): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_RtwqUnregisterPlatformFromMMCSS() as Int) else 0

public actual fun SetCriticalSectionSpinCount(lpcriticalsection: Long, dwspincount: UInt): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetCriticalSectionSpinCount(lpcriticalsection.toString(), dwspincount.toInt()) as Int).toUInt() else 0u

public actual fun SetEvent(hevent: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetEvent(hevent.toString()) as Int) else 0

public actual fun SetEventWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, evt: HANDLE) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetEventWhenCallbackReturns(pci.toString(), evt.toString())
    }
}

public actual fun SetPriorityClass(hprocess: HANDLE, dwpriorityclass: PROCESS_CREATION_FLAGS): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetPriorityClass(hprocess.toString(), dwpriorityclass.toInt()) as Int) else 0

public actual fun SetProcessAffinityMask(hprocess: HANDLE, dwprocessaffinitymask: ULong): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessAffinityMask(hprocess.toString(), dwprocessaffinitymask.toString()) as Int) else 0

public actual fun SetProcessAffinityUpdateMode(hprocess: HANDLE, dwflags: PROCESS_AFFINITY_AUTO_UPDATE_FLAGS): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessAffinityUpdateMode(hprocess.toString(), dwflags.toInt()) as Int) else 0

public actual fun SetProcessDEPPolicy(dwflags: PROCESS_DEP_FLAGS): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessDEPPolicy(dwflags.toInt()) as Int) else 0

public actual fun SetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessDefaultCpuSetMasks(process.toString(), cpusetmasks.toString(), cpusetmaskcount.toInt()) as Int) else 0

public actual fun SetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessDefaultCpuSets(process.toString(), cpusetids.toString(), cpusetidcount.toInt()) as Int) else 0

public actual fun SetProcessDynamicEHContinuationTargets(process: HANDLE, numberoftargets: UShort, targets: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessDynamicEHContinuationTargets(process.toString(), numberoftargets.toInt(), targets.toString()) as Int) else 0

public actual fun SetProcessDynamicEnforcedCetCompatibleRanges(process: HANDLE, numberofranges: UShort, ranges: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessDynamicEnforcedCetCompatibleRanges(process.toString(), numberofranges.toInt(), ranges.toString()) as Int) else 0

public actual fun SetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessInformation(hprocess.toString(), processinformationclass, processinformation.toString(), processinformationsize.toInt()) as Int) else 0

public actual fun SetProcessMitigationPolicy(mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessMitigationPolicy(mitigationpolicy, lpbuffer.toString(), dwlength.toString()) as Int) else 0

public actual fun SetProcessPriorityBoost(hprocess: HANDLE, bdisablepriorityboost: BOOL): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessPriorityBoost(hprocess.toString(), bdisablepriorityboost) as Int) else 0

public actual fun SetProcessRestrictionExemption(fenableexemption: BOOL): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessRestrictionExemption(fenableexemption) as Int) else 0

public actual fun SetProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessShutdownParameters(dwlevel.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SetProcessWorkingSetSize(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProcessWorkingSetSize(hprocess.toString(), dwminimumworkingsetsize.toString(), dwmaximumworkingsetsize.toString()) as Int) else 0

public actual fun SetProtectedPolicy(policyguid: Long, policyvalue: ULong, oldpolicyvalue: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetProtectedPolicy(policyguid.toString(), policyvalue.toString(), oldpolicyvalue.toString()) as Int) else 0

public actual fun SetThreadAffinityMask(hthread: HANDLE, dwthreadaffinitymask: ULong): ULong =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadAffinityMask(hthread.toString(), dwthreadaffinitymask.toString()) as String).toULong() else 0uL

public actual fun SetThreadDescription(hthread: HANDLE, lpthreaddescription: PCWSTR): HRESULT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadDescription(hthread.toString(), lpthreaddescription.toString()) as Int) else 0

public actual fun SetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long, previousgroupaffinity: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadGroupAffinity(hthread.toString(), groupaffinity.toString(), previousgroupaffinity.toString()) as Int) else 0

public actual fun SetThreadIdealProcessor(hthread: HANDLE, dwidealprocessor: UInt): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadIdealProcessor(hthread.toString(), dwidealprocessor.toInt()) as Int).toUInt() else 0u

public actual fun SetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long, lppreviousidealprocessor: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadIdealProcessorEx(hthread.toString(), lpidealprocessor.toString(), lppreviousidealprocessor.toString()) as Int) else 0

public actual fun SetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadInformation(hthread.toString(), threadinformationclass, threadinformation.toString(), threadinformationsize.toInt()) as Int) else 0

public actual fun SetThreadPriority(hthread: HANDLE, npriority: THREAD_PRIORITY): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadPriority(hthread.toString(), npriority) as Int) else 0

public actual fun SetThreadPriorityBoost(hthread: HANDLE, bdisablepriorityboost: BOOL): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadPriorityBoost(hthread.toString(), bdisablepriorityboost) as Int) else 0

public actual fun SetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadSelectedCpuSetMasks(thread.toString(), cpusetmasks.toString(), cpusetmaskcount.toInt()) as Int) else 0

public actual fun SetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadSelectedCpuSets(thread.toString(), cpusetids.toString(), cpusetidcount.toInt()) as Int) else 0

public actual fun SetThreadStackGuarantee(stacksizeinbytes: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadStackGuarantee(stacksizeinbytes.toString()) as Int) else 0

public actual fun SetThreadToken(thread: Long, token: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadToken(thread.toString(), token.toString()) as Int) else 0

public actual fun SetThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadpoolStackInformation(ptpp.toString(), ptpsi.toString()) as Int) else 0

public actual fun SetThreadpoolThreadMaximum(ptpp: PTP_POOL, cthrdmost: UInt) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadpoolThreadMaximum(ptpp.toString(), cthrdmost.toInt())
    }
}

public actual fun SetThreadpoolThreadMinimum(ptpp: PTP_POOL, cthrdmic: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadpoolThreadMinimum(ptpp.toString(), cthrdmic.toInt()) as Int) else 0

public actual fun SetThreadpoolTimer(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadpoolTimer(pti.toString(), pftduetime.toString(), msperiod.toInt(), mswindowlength.toInt())
    }
}

public actual fun SetThreadpoolTimerEx(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadpoolTimerEx(pti.toString(), pftduetime.toString(), msperiod.toInt(), mswindowlength.toInt()) as Int) else 0

public actual fun SetThreadpoolWait(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadpoolWait(pwa.toString(), h.toString(), pfttimeout.toString())
    }
}

public actual fun SetThreadpoolWaitEx(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long, reserved: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetThreadpoolWaitEx(pwa.toString(), h.toString(), pfttimeout.toString(), reserved.toString()) as Int) else 0

public actual fun SetTimerQueueTimer(timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, preferio: BOOL): HANDLE =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetTimerQueueTimer(timerqueue.toString(), callback.toLong().toString(), parameter.toString(), duetime.toInt(), period.toInt(), preferio) as String).toLong() else 0L

public actual fun SetUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetUmsThreadInformation(umsthread.toString(), umsthreadinfoclass, umsthreadinformation.toString(), umsthreadinformationlength.toInt()) as Int) else 0

public actual fun SetWaitableTimer(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, fresume: BOOL): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetWaitableTimer(htimer.toString(), lpduetime.toString(), lperiod, pfncompletionroutine.toLong().toString(), lpargtocompletionroutine.toString(), fresume) as Int) else 0

public actual fun SetWaitableTimerEx(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, wakecontext: Long, tolerabledelay: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SetWaitableTimerEx(htimer.toString(), lpduetime.toString(), lperiod, pfncompletionroutine.toLong().toString(), lpargtocompletionroutine.toString(), wakecontext.toString(), tolerabledelay.toInt()) as Int) else 0

public actual fun SignalObjectAndWait(hobjecttosignal: HANDLE, hobjecttowaiton: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SignalObjectAndWait(hobjecttosignal.toString(), hobjecttowaiton.toString(), dwmilliseconds.toInt(), balertable) as Int).toUInt() else 0u

public actual fun Sleep(dwmilliseconds: UInt) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_Sleep(dwmilliseconds.toInt())
    }
}

public actual fun SleepConditionVariableCS(conditionvariable: Long, criticalsection: Long, dwmilliseconds: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SleepConditionVariableCS(conditionvariable.toString(), criticalsection.toString(), dwmilliseconds.toInt()) as Int) else 0

public actual fun SleepConditionVariableSRW(conditionvariable: Long, srwlock: Long, dwmilliseconds: UInt, flags: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SleepConditionVariableSRW(conditionvariable.toString(), srwlock.toString(), dwmilliseconds.toInt(), flags.toInt()) as Int) else 0

public actual fun SleepEx(dwmilliseconds: UInt, balertable: BOOL): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SleepEx(dwmilliseconds.toInt(), balertable) as Int).toUInt() else 0u

public actual fun StartThreadpoolIo(pio: PTP_IO) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_StartThreadpoolIo(pio.toString())
    }
}

public actual fun SubmitThreadpoolWork(pwk: PTP_WORK) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SubmitThreadpoolWork(pwk.toString())
    }
}

public actual fun SuspendThread(hthread: HANDLE): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SuspendThread(hthread.toString()) as Int).toUInt() else 0u

public actual fun SwitchToFiber(lpfiber: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SwitchToFiber(lpfiber.toString())
    }
}

public actual fun SwitchToThread(): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_SwitchToThread() as Int) else 0

public actual fun TerminateProcess(hprocess: HANDLE, uexitcode: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_TerminateProcess(hprocess.toString(), uexitcode.toInt()) as Int) else 0

public actual fun TerminateThread(hthread: HANDLE, dwexitcode: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_TerminateThread(hthread.toString(), dwexitcode.toInt()) as Int) else 0

public actual fun TlsAlloc(): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_TlsAlloc() as Int).toUInt() else 0u

public actual fun TlsFree(dwtlsindex: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_TlsFree(dwtlsindex.toInt()) as Int) else 0

public actual fun TlsGetValue(dwtlsindex: UInt): Long =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_TlsGetValue(dwtlsindex.toInt()) as String).toLong() else 0L

public actual fun TlsSetValue(dwtlsindex: UInt, lptlsvalue: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_TlsSetValue(dwtlsindex.toInt(), lptlsvalue.toString()) as Int) else 0

public actual fun TryAcquireSRWLockExclusive(srwlock: Long): Boolean =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_TryAcquireSRWLockExclusive(srwlock.toString()) as Boolean) else false

public actual fun TryAcquireSRWLockShared(srwlock: Long): Boolean =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_TryAcquireSRWLockShared(srwlock.toString()) as Boolean) else false

public actual fun TryEnterCriticalSection(lpcriticalsection: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_TryEnterCriticalSection(lpcriticalsection.toString()) as Int) else 0

public actual fun TrySubmitThreadpoolCallback(pfns: PTP_SIMPLE_CALLBACK, pv: Long, pcbe: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_TrySubmitThreadpoolCallback(pfns.toLong().toString(), pv.toString(), pcbe.toString()) as Int) else 0

public actual fun UmsThreadYield(schedulerparam: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_UmsThreadYield(schedulerparam.toString()) as Int) else 0

public actual fun UnregisterWait(waithandle: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_UnregisterWait(waithandle.toString()) as Int) else 0

public actual fun UnregisterWaitEx(waithandle: HANDLE, completionevent: HANDLE): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_UnregisterWaitEx(waithandle.toString(), completionevent.toString()) as Int) else 0

public actual fun UpdateProcThreadAttribute(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwflags: UInt, attribute: ULong, lpvalue: Long, cbsize: ULong, lppreviousvalue: Long, lpreturnsize: Long): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_UpdateProcThreadAttribute(lpattributelist.toString(), dwflags.toInt(), attribute.toString(), lpvalue.toString(), cbsize.toString(), lppreviousvalue.toString(), lpreturnsize.toString()) as Int) else 0

public actual fun WaitForInputIdle(hprocess: HANDLE, dwmilliseconds: UInt): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WaitForInputIdle(hprocess.toString(), dwmilliseconds.toInt()) as Int).toUInt() else 0u

public actual fun WaitForMultipleObjects(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt): WAIT_EVENT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WaitForMultipleObjects(ncount.toInt(), lphandles.toString(), bwaitall, dwmilliseconds.toInt()) as Int).toUInt() else 0u

public actual fun WaitForMultipleObjectsEx(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WaitForMultipleObjectsEx(ncount.toInt(), lphandles.toString(), bwaitall, dwmilliseconds.toInt(), balertable) as Int).toUInt() else 0u

public actual fun WaitForSingleObject(hhandle: HANDLE, dwmilliseconds: UInt): WAIT_EVENT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WaitForSingleObject(hhandle.toString(), dwmilliseconds.toInt()) as Int).toUInt() else 0u

public actual fun WaitForSingleObjectEx(hhandle: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WaitForSingleObjectEx(hhandle.toString(), dwmilliseconds.toInt(), balertable) as Int).toUInt() else 0u

public actual fun WaitForThreadpoolIoCallbacks(pio: PTP_IO, fcancelpendingcallbacks: BOOL) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WaitForThreadpoolIoCallbacks(pio.toString(), fcancelpendingcallbacks)
    }
}

public actual fun WaitForThreadpoolTimerCallbacks(pti: PTP_TIMER, fcancelpendingcallbacks: BOOL) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WaitForThreadpoolTimerCallbacks(pti.toString(), fcancelpendingcallbacks)
    }
}

public actual fun WaitForThreadpoolWaitCallbacks(pwa: PTP_WAIT, fcancelpendingcallbacks: BOOL) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WaitForThreadpoolWaitCallbacks(pwa.toString(), fcancelpendingcallbacks)
    }
}

public actual fun WaitForThreadpoolWorkCallbacks(pwk: PTP_WORK, fcancelpendingcallbacks: BOOL) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WaitForThreadpoolWorkCallbacks(pwk.toString(), fcancelpendingcallbacks)
    }
}

public actual fun WaitOnAddress(address: Long, compareaddress: Long, addresssize: ULong, dwmilliseconds: UInt): BOOL =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WaitOnAddress(address.toString(), compareaddress.toString(), addresssize.toString(), dwmilliseconds.toInt()) as Int) else 0

public actual fun WakeAllConditionVariable(conditionvariable: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WakeAllConditionVariable(conditionvariable.toString())
    }
}

public actual fun WakeByAddressAll(address: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WakeByAddressAll(address.toString())
    }
}

public actual fun WakeByAddressSingle(address: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WakeByAddressSingle(address.toString())
    }
}

public actual fun WakeConditionVariable(conditionvariable: Long) {
    if (_windowsWin32SystemThreadingNapiAddon != null) {
        _windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WakeConditionVariable(conditionvariable.toString())
    }
}

public actual fun WinExec(lpcmdline: PCSTR, ucmdshow: UInt): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_WinExec(lpcmdline.toString(), ucmdshow.toInt()) as Int).toUInt() else 0u

public actual fun Wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_Wow64SetThreadDefaultGuestMachine(machine.toInt()) as Int).toUShort() else 0u

public actual fun Wow64SuspendThread(hthread: HANDLE): UInt =
    if (_windowsWin32SystemThreadingNapiAddon != null) (_windowsWin32SystemThreadingNapiAddon.windowssys_windows_win32_system_threading_Wow64SuspendThread(hthread.toString()) as Int).toUInt() else 0u
