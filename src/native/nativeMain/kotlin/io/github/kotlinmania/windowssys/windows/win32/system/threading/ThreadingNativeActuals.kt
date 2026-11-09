@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AcquireSRWLockExclusive(srwlock: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AcquireSRWLockExclusive(srwlock.toCPointer<ByteVar>())
}

public actual fun AcquireSRWLockShared(srwlock: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AcquireSRWLockShared(srwlock.toCPointer<ByteVar>())
}

public actual fun AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor: Long, integritylabel: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AddIntegrityLabelToBoundaryDescriptor(boundarydescriptor.toCPointer<ByteVar>(), integritylabel.toCPointer<ByteVar>())

public actual fun AddSIDToBoundaryDescriptor(boundarydescriptor: Long, requiredsid: PSID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AddSIDToBoundaryDescriptor(boundarydescriptor.toCPointer<ByteVar>(), requiredsid.toCPointer<ByteVar>())

public actual fun AttachThreadInput(idattach: UInt, idattachto: UInt, fattach: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AttachThreadInput(idattach, idattachto, fattach)

public actual fun AvQuerySystemResponsiveness(avrthandle: HANDLE, systemresponsivenessvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvQuerySystemResponsiveness(avrthandle.toCPointer<ByteVar>(), systemresponsivenessvalue.toCPointer<ByteVar>())

public actual fun AvRevertMmThreadCharacteristics(avrthandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvRevertMmThreadCharacteristics(avrthandle.toCPointer<ByteVar>())

public actual fun AvRtCreateThreadOrderingGroup(context: Long, period: Long, threadorderingguid: Long, timeout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroup(context.toCPointer<ByteVar>(), period.toCPointer<ByteVar>(), threadorderingguid.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>())

public actual fun AvRtCreateThreadOrderingGroupExA(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExA(context.toCPointer<ByteVar>(), period.toCPointer<ByteVar>(), threadorderingguid.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), taskname.toCPointer<ByteVar>())

public actual fun AvRtCreateThreadOrderingGroupExW(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExW(context.toCPointer<ByteVar>(), period.toCPointer<ByteVar>(), threadorderingguid.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), taskname.toCPointer<ByteVar>())

public actual fun AvRtDeleteThreadOrderingGroup(context: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvRtDeleteThreadOrderingGroup(context.toCPointer<ByteVar>())

public actual fun AvRtJoinThreadOrderingGroup(context: Long, threadorderingguid: Long, before: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvRtJoinThreadOrderingGroup(context.toCPointer<ByteVar>(), threadorderingguid.toCPointer<ByteVar>(), before)

public actual fun AvRtLeaveThreadOrderingGroup(context: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvRtLeaveThreadOrderingGroup(context.toCPointer<ByteVar>())

public actual fun AvRtWaitOnThreadOrderingGroup(context: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvRtWaitOnThreadOrderingGroup(context.toCPointer<ByteVar>())

public actual fun AvSetMmMaxThreadCharacteristicsA(firsttask: PCSTR, secondtask: PCSTR, taskindex: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsA(firsttask.toCPointer<ByteVar>(), secondtask.toCPointer<ByteVar>(), taskindex.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AvSetMmMaxThreadCharacteristicsW(firsttask: PCWSTR, secondtask: PCWSTR, taskindex: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsW(firsttask.toCPointer<ByteVar>(), secondtask.toCPointer<ByteVar>(), taskindex.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AvSetMmThreadCharacteristicsA(taskname: PCSTR, taskindex: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsA(taskname.toCPointer<ByteVar>(), taskindex.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AvSetMmThreadCharacteristicsW(taskname: PCWSTR, taskindex: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsW(taskname.toCPointer<ByteVar>(), taskindex.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AvSetMmThreadPriority(avrthandle: HANDLE, priority: AVRT_PRIORITY): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_AvSetMmThreadPriority(avrthandle.toCPointer<ByteVar>(), priority)

public actual fun CallbackMayRunLong(pci: PTP_CALLBACK_INSTANCE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CallbackMayRunLong(pci)

public actual fun CancelThreadpoolIo(pio: PTP_IO) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CancelThreadpoolIo(pio)
}

public actual fun CancelTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CancelTimerQueueTimer(timerqueue.toCPointer<ByteVar>(), timer.toCPointer<ByteVar>())

public actual fun CancelWaitableTimer(htimer: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CancelWaitableTimer(htimer.toCPointer<ByteVar>())

public actual fun ChangeTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, duetime: UInt, period: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ChangeTimerQueueTimer(timerqueue.toCPointer<ByteVar>(), timer.toCPointer<ByteVar>(), duetime, period)

public actual fun ClosePrivateNamespace(handle: HANDLE, flags: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ClosePrivateNamespace(handle.toCPointer<ByteVar>(), flags)

public actual fun CloseThreadpool(ptpp: PTP_POOL) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CloseThreadpool(ptpp)
}

public actual fun CloseThreadpoolCleanupGroup(ptpcg: PTP_CLEANUP_GROUP) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroup(ptpcg)
}

public actual fun CloseThreadpoolCleanupGroupMembers(ptpcg: PTP_CLEANUP_GROUP, fcancelpendingcallbacks: BOOL, pvcleanupcontext: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroupMembers(ptpcg, fcancelpendingcallbacks, pvcleanupcontext.toCPointer<ByteVar>())
}

public actual fun CloseThreadpoolIo(pio: PTP_IO) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CloseThreadpoolIo(pio)
}

public actual fun CloseThreadpoolTimer(pti: PTP_TIMER) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CloseThreadpoolTimer(pti)
}

public actual fun CloseThreadpoolWait(pwa: PTP_WAIT) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CloseThreadpoolWait(pwa)
}

public actual fun CloseThreadpoolWork(pwk: PTP_WORK) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CloseThreadpoolWork(pwk)
}

public actual fun ConvertFiberToThread(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ConvertFiberToThread()

public actual fun ConvertThreadToFiber(lpparameter: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ConvertThreadToFiber(lpparameter.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ConvertThreadToFiberEx(lpparameter: Long, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ConvertThreadToFiberEx(lpparameter.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun CreateBoundaryDescriptorA(name: PCSTR, flags: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateBoundaryDescriptorA(name.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun CreateBoundaryDescriptorW(name: PCWSTR, flags: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateBoundaryDescriptorW(name.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun CreateEventA(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateEventA(lpeventattributes.toCPointer<ByteVar>(), bmanualreset, binitialstate, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateEventExA(lpeventattributes: Long, lpname: PCSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateEventExA(lpeventattributes.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.toLong() ?: 0L

public actual fun CreateEventExW(lpeventattributes: Long, lpname: PCWSTR, dwflags: CREATE_EVENT, dwdesiredaccess: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateEventExW(lpeventattributes.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.toLong() ?: 0L

public actual fun CreateEventW(lpeventattributes: Long, bmanualreset: BOOL, binitialstate: BOOL, lpname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateEventW(lpeventattributes.toCPointer<ByteVar>(), bmanualreset, binitialstate, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFiber(dwstacksize: ULong, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateFiber(dwstacksize, lpstartaddress.toLong().toCPointer<ByteVar>(), lpparameter.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LPFIBER_START_ROUTINE, lpparameter: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateFiberEx(dwstackcommitsize, dwstackreservesize, dwflags, lpstartaddress.toLong().toCPointer<ByteVar>(), lpparameter.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateMutexA(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateMutexA(lpmutexattributes.toCPointer<ByteVar>(), binitialowner, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateMutexExA(lpmutexattributes: Long, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateMutexExA(lpmutexattributes.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.toLong() ?: 0L

public actual fun CreateMutexExW(lpmutexattributes: Long, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateMutexExW(lpmutexattributes.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.toLong() ?: 0L

public actual fun CreateMutexW(lpmutexattributes: Long, binitialowner: BOOL, lpname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateMutexW(lpmutexattributes.toCPointer<ByteVar>(), binitialowner, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreatePrivateNamespaceA(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreatePrivateNamespaceA(lpprivatenamespaceattributes.toCPointer<ByteVar>(), lpboundarydescriptor.toCPointer<ByteVar>(), lpaliasprefix.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreatePrivateNamespaceW(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreatePrivateNamespaceW(lpprivatenamespaceattributes.toCPointer<ByteVar>(), lpboundarydescriptor.toCPointer<ByteVar>(), lpaliasprefix.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateProcessA(lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateProcessA(lpapplicationname.toCPointer<ByteVar>(), lpcommandline.toCPointer<ByteVar>(), lpprocessattributes.toCPointer<ByteVar>(), lpthreadattributes.toCPointer<ByteVar>(), binherithandles, dwcreationflags, lpenvironment.toCPointer<ByteVar>(), lpcurrentdirectory.toCPointer<ByteVar>(), lpstartupinfo.toCPointer<ByteVar>(), lpprocessinformation.toCPointer<ByteVar>())

public actual fun CreateProcessAsUserA(htoken: HANDLE, lpapplicationname: PCSTR, lpcommandline: PSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateProcessAsUserA(htoken.toCPointer<ByteVar>(), lpapplicationname.toCPointer<ByteVar>(), lpcommandline.toCPointer<ByteVar>(), lpprocessattributes.toCPointer<ByteVar>(), lpthreadattributes.toCPointer<ByteVar>(), binherithandles, dwcreationflags, lpenvironment.toCPointer<ByteVar>(), lpcurrentdirectory.toCPointer<ByteVar>(), lpstartupinfo.toCPointer<ByteVar>(), lpprocessinformation.toCPointer<ByteVar>())

public actual fun CreateProcessAsUserW(htoken: HANDLE, lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateProcessAsUserW(htoken.toCPointer<ByteVar>(), lpapplicationname.toCPointer<ByteVar>(), lpcommandline.toCPointer<ByteVar>(), lpprocessattributes.toCPointer<ByteVar>(), lpthreadattributes.toCPointer<ByteVar>(), binherithandles, dwcreationflags, lpenvironment.toCPointer<ByteVar>(), lpcurrentdirectory.toCPointer<ByteVar>(), lpstartupinfo.toCPointer<ByteVar>(), lpprocessinformation.toCPointer<ByteVar>())

public actual fun CreateProcessW(lpapplicationname: PCWSTR, lpcommandline: PWSTR, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: BOOL, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateProcessW(lpapplicationname.toCPointer<ByteVar>(), lpcommandline.toCPointer<ByteVar>(), lpprocessattributes.toCPointer<ByteVar>(), lpthreadattributes.toCPointer<ByteVar>(), binherithandles, dwcreationflags, lpenvironment.toCPointer<ByteVar>(), lpcurrentdirectory.toCPointer<ByteVar>(), lpstartupinfo.toCPointer<ByteVar>(), lpprocessinformation.toCPointer<ByteVar>())

public actual fun CreateProcessWithLogonW(lpusername: PCWSTR, lpdomain: PCWSTR, lppassword: PCWSTR, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateProcessWithLogonW(lpusername.toCPointer<ByteVar>(), lpdomain.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), dwlogonflags, lpapplicationname.toCPointer<ByteVar>(), lpcommandline.toCPointer<ByteVar>(), dwcreationflags, lpenvironment.toCPointer<ByteVar>(), lpcurrentdirectory.toCPointer<ByteVar>(), lpstartupinfo.toCPointer<ByteVar>(), lpprocessinformation.toCPointer<ByteVar>())

public actual fun CreateProcessWithTokenW(htoken: HANDLE, dwlogonflags: CREATE_PROCESS_LOGON_FLAGS, lpapplicationname: PCWSTR, lpcommandline: PWSTR, dwcreationflags: PROCESS_CREATION_FLAGS, lpenvironment: Long, lpcurrentdirectory: PCWSTR, lpstartupinfo: Long, lpprocessinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateProcessWithTokenW(htoken.toCPointer<ByteVar>(), dwlogonflags, lpapplicationname.toCPointer<ByteVar>(), lpcommandline.toCPointer<ByteVar>(), dwcreationflags, lpenvironment.toCPointer<ByteVar>(), lpcurrentdirectory.toCPointer<ByteVar>(), lpstartupinfo.toCPointer<ByteVar>(), lpprocessinformation.toCPointer<ByteVar>())

public actual fun CreateRemoteThread(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpthreadid: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateRemoteThread(hprocess.toCPointer<ByteVar>(), lpthreadattributes.toCPointer<ByteVar>(), dwstacksize, lpstartaddress.toLong().toCPointer<ByteVar>(), lpparameter.toCPointer<ByteVar>(), dwcreationflags, lpthreadid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateRemoteThreadEx(hprocess: HANDLE, lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: UInt, lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, lpthreadid: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateRemoteThreadEx(hprocess.toCPointer<ByteVar>(), lpthreadattributes.toCPointer<ByteVar>(), dwstacksize, lpstartaddress.toLong().toCPointer<ByteVar>(), lpparameter.toCPointer<ByteVar>(), dwcreationflags, lpattributelist.toCPointer<ByteVar>(), lpthreadid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateSemaphoreA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateSemaphoreA(lpsemaphoreattributes.toCPointer<ByteVar>(), linitialcount, lmaximumcount, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateSemaphoreExA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateSemaphoreExA(lpsemaphoreattributes.toCPointer<ByteVar>(), linitialcount, lmaximumcount, lpname.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.toLong() ?: 0L

public actual fun CreateSemaphoreExW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateSemaphoreExW(lpsemaphoreattributes.toCPointer<ByteVar>(), linitialcount, lmaximumcount, lpname.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.toLong() ?: 0L

public actual fun CreateSemaphoreW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateSemaphoreW(lpsemaphoreattributes.toCPointer<ByteVar>(), linitialcount, lmaximumcount, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateThread(lpthreadattributes: Long, dwstacksize: ULong, lpstartaddress: LPTHREAD_START_ROUTINE, lpparameter: Long, dwcreationflags: THREAD_CREATION_FLAGS, lpthreadid: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateThread(lpthreadattributes.toCPointer<ByteVar>(), dwstacksize, lpstartaddress.toLong().toCPointer<ByteVar>(), lpparameter.toCPointer<ByteVar>(), dwcreationflags, lpthreadid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateThreadpool(reserved: Long): PTP_POOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateThreadpool(reserved.toCPointer<ByteVar>())

public actual fun CreateThreadpoolCleanupGroup(): PTP_CLEANUP_GROUP =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateThreadpoolCleanupGroup()

public actual fun CreateThreadpoolIo(fl: HANDLE, pfnio: PTP_WIN32_IO_CALLBACK, pv: Long, pcbe: Long): PTP_IO =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateThreadpoolIo(fl.toCPointer<ByteVar>(), pfnio.toLong().toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), pcbe.toCPointer<ByteVar>())

public actual fun CreateThreadpoolTimer(pfnti: PTP_TIMER_CALLBACK, pv: Long, pcbe: Long): PTP_TIMER =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateThreadpoolTimer(pfnti.toLong().toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), pcbe.toCPointer<ByteVar>())

public actual fun CreateThreadpoolWait(pfnwa: PTP_WAIT_CALLBACK, pv: Long, pcbe: Long): PTP_WAIT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateThreadpoolWait(pfnwa.toLong().toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), pcbe.toCPointer<ByteVar>())

public actual fun CreateThreadpoolWork(pfnwk: PTP_WORK_CALLBACK, pv: Long, pcbe: Long): PTP_WORK =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateThreadpoolWork(pfnwk.toLong().toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), pcbe.toCPointer<ByteVar>())

public actual fun CreateTimerQueue(): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateTimerQueue()?.toLong() ?: 0L

public actual fun CreateTimerQueueTimer(phnewtimer: Long, timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, flags: WORKER_THREAD_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateTimerQueueTimer(phnewtimer.toCPointer<ByteVar>(), timerqueue.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), parameter.toCPointer<ByteVar>(), duetime, period, flags)

public actual fun CreateUmsCompletionList(umscompletionlist: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateUmsCompletionList(umscompletionlist.toCPointer<ByteVar>())

public actual fun CreateUmsThreadContext(lpumsthread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateUmsThreadContext(lpumsthread.toCPointer<ByteVar>())

public actual fun CreateWaitableTimerA(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateWaitableTimerA(lptimerattributes.toCPointer<ByteVar>(), bmanualreset, lptimername.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateWaitableTimerExA(lptimerattributes: Long, lptimername: PCSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateWaitableTimerExA(lptimerattributes.toCPointer<ByteVar>(), lptimername.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.toLong() ?: 0L

public actual fun CreateWaitableTimerExW(lptimerattributes: Long, lptimername: PCWSTR, dwflags: UInt, dwdesiredaccess: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateWaitableTimerExW(lptimerattributes.toCPointer<ByteVar>(), lptimername.toCPointer<ByteVar>(), dwflags, dwdesiredaccess)?.toLong() ?: 0L

public actual fun CreateWaitableTimerW(lptimerattributes: Long, bmanualreset: BOOL, lptimername: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_CreateWaitableTimerW(lptimerattributes.toCPointer<ByteVar>(), bmanualreset, lptimername.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DeleteBoundaryDescriptor(boundarydescriptor: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DeleteBoundaryDescriptor(boundarydescriptor.toCPointer<ByteVar>())
}

public actual fun DeleteCriticalSection(lpcriticalsection: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DeleteCriticalSection(lpcriticalsection.toCPointer<ByteVar>())
}

public actual fun DeleteFiber(lpfiber: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DeleteFiber(lpfiber.toCPointer<ByteVar>())
}

public actual fun DeleteProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DeleteProcThreadAttributeList(lpattributelist.toCPointer<ByteVar>())
}

public actual fun DeleteSynchronizationBarrier(lpbarrier: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DeleteSynchronizationBarrier(lpbarrier.toCPointer<ByteVar>())

public actual fun DeleteTimerQueue(timerqueue: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DeleteTimerQueue(timerqueue.toCPointer<ByteVar>())

public actual fun DeleteTimerQueueEx(timerqueue: HANDLE, completionevent: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DeleteTimerQueueEx(timerqueue.toCPointer<ByteVar>(), completionevent.toCPointer<ByteVar>())

public actual fun DeleteTimerQueueTimer(timerqueue: HANDLE, timer: HANDLE, completionevent: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DeleteTimerQueueTimer(timerqueue.toCPointer<ByteVar>(), timer.toCPointer<ByteVar>(), completionevent.toCPointer<ByteVar>())

public actual fun DeleteUmsCompletionList(umscompletionlist: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DeleteUmsCompletionList(umscompletionlist.toCPointer<ByteVar>())

public actual fun DeleteUmsThreadContext(umsthread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DeleteUmsThreadContext(umsthread.toCPointer<ByteVar>())

public actual fun DequeueUmsCompletionListItems(umscompletionlist: Long, waittimeout: UInt, umsthreadlist: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DequeueUmsCompletionListItems(umscompletionlist.toCPointer<ByteVar>(), waittimeout, umsthreadlist.toCPointer<ByteVar>())

public actual fun DisassociateCurrentThreadFromCallback(pci: PTP_CALLBACK_INSTANCE) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_DisassociateCurrentThreadFromCallback(pci)
}

public actual fun EnterCriticalSection(lpcriticalsection: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_EnterCriticalSection(lpcriticalsection.toCPointer<ByteVar>())
}

public actual fun EnterSynchronizationBarrier(lpbarrier: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_EnterSynchronizationBarrier(lpbarrier.toCPointer<ByteVar>(), dwflags)

public actual fun EnterUmsSchedulingMode(schedulerstartupinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_EnterUmsSchedulingMode(schedulerstartupinfo.toCPointer<ByteVar>())

public actual fun ExecuteUmsThread(umsthread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ExecuteUmsThread(umsthread.toCPointer<ByteVar>())

public actual fun ExitProcess(uexitcode: UInt): Nothing {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ExitProcess(uexitcode)
    error("Unreachable noreturn C function ExitProcess")
}

public actual fun ExitThread(dwexitcode: UInt): Nothing {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ExitThread(dwexitcode)
    error("Unreachable noreturn C function ExitThread")
}

public actual fun FlsAlloc(lpcallback: PFLS_CALLBACK_FUNCTION): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_FlsAlloc(lpcallback.toLong().toCPointer<ByteVar>())

public actual fun FlsFree(dwflsindex: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_FlsFree(dwflsindex)

public actual fun FlsGetValue(dwflsindex: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_FlsGetValue(dwflsindex)?.toLong() ?: 0L

public actual fun FlsSetValue(dwflsindex: UInt, lpflsdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_FlsSetValue(dwflsindex, lpflsdata.toCPointer<ByteVar>())

public actual fun FlushProcessWriteBuffers() {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_FlushProcessWriteBuffers()
}

public actual fun FreeLibraryWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mod: HMODULE) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_FreeLibraryWhenCallbackReturns(pci, mod.toCPointer<ByteVar>())
}

public actual fun GetActiveProcessorCount(groupnumber: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetActiveProcessorCount(groupnumber)

public actual fun GetActiveProcessorGroupCount(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetActiveProcessorGroupCount()

public actual fun GetCurrentProcess(): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetCurrentProcess()?.toLong() ?: 0L

public actual fun GetCurrentProcessId(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetCurrentProcessId()

public actual fun GetCurrentProcessorNumber(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetCurrentProcessorNumber()

public actual fun GetCurrentProcessorNumberEx(procnumber: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetCurrentProcessorNumberEx(procnumber.toCPointer<ByteVar>())
}

public actual fun GetCurrentThread(): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetCurrentThread()?.toLong() ?: 0L

public actual fun GetCurrentThreadId(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetCurrentThreadId()

public actual fun GetCurrentThreadStackLimits(lowlimit: Long, highlimit: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetCurrentThreadStackLimits(lowlimit.toCPointer<ByteVar>(), highlimit.toCPointer<ByteVar>())
}

public actual fun GetCurrentUmsThread(): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetCurrentUmsThread()?.toLong() ?: 0L

public actual fun GetExitCodeProcess(hprocess: HANDLE, lpexitcode: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetExitCodeProcess(hprocess.toCPointer<ByteVar>(), lpexitcode.toCPointer<ByteVar>())

public actual fun GetExitCodeThread(hthread: HANDLE, lpexitcode: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetExitCodeThread(hthread.toCPointer<ByteVar>(), lpexitcode.toCPointer<ByteVar>())

public actual fun GetGuiResources(hprocess: HANDLE, uiflags: GET_GUI_RESOURCES_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetGuiResources(hprocess.toCPointer<ByteVar>(), uiflags)

public actual fun GetMachineTypeAttributes(machine: UShort, machinetypeattributes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetMachineTypeAttributes(machine, machinetypeattributes.toCPointer<ByteVar>())

public actual fun GetMaximumProcessorCount(groupnumber: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetMaximumProcessorCount(groupnumber)

public actual fun GetMaximumProcessorGroupCount(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetMaximumProcessorGroupCount()

public actual fun GetNextUmsListItem(umscontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNextUmsListItem(umscontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetNumaAvailableMemoryNode(node: UByte, availablebytes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNode(node, availablebytes.toCPointer<ByteVar>())

public actual fun GetNumaAvailableMemoryNodeEx(node: UShort, availablebytes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNodeEx(node, availablebytes.toCPointer<ByteVar>())

public actual fun GetNumaHighestNodeNumber(highestnodenumber: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaHighestNodeNumber(highestnodenumber.toCPointer<ByteVar>())

public actual fun GetNumaNodeNumberFromHandle(hfile: HANDLE, nodenumber: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaNodeNumberFromHandle(hfile.toCPointer<ByteVar>(), nodenumber.toCPointer<ByteVar>())

public actual fun GetNumaNodeProcessorMask(node: UByte, processormask: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask(node, processormask.toCPointer<ByteVar>())

public actual fun GetNumaNodeProcessorMask2(nodenumber: UShort, processormasks: Long, processormaskcount: UShort, requiredmaskcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask2(nodenumber, processormasks.toCPointer<ByteVar>(), processormaskcount, requiredmaskcount.toCPointer<ByteVar>())

public actual fun GetNumaNodeProcessorMaskEx(node: UShort, processormask: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaNodeProcessorMaskEx(node, processormask.toCPointer<ByteVar>())

public actual fun GetNumaProcessorNode(processor: UByte, nodenumber: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaProcessorNode(processor, nodenumber.toCPointer<ByteVar>())

public actual fun GetNumaProcessorNodeEx(processor: Long, nodenumber: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaProcessorNodeEx(processor.toCPointer<ByteVar>(), nodenumber.toCPointer<ByteVar>())

public actual fun GetNumaProximityNode(proximityid: UInt, nodenumber: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaProximityNode(proximityid, nodenumber.toCPointer<ByteVar>())

public actual fun GetNumaProximityNodeEx(proximityid: UInt, nodenumber: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetNumaProximityNodeEx(proximityid, nodenumber.toCPointer<ByteVar>())

public actual fun GetPriorityClass(hprocess: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetPriorityClass(hprocess.toCPointer<ByteVar>())

public actual fun GetProcessAffinityMask(hprocess: HANDLE, lpprocessaffinitymask: Long, lpsystemaffinitymask: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessAffinityMask(hprocess.toCPointer<ByteVar>(), lpprocessaffinitymask.toCPointer<ByteVar>(), lpsystemaffinitymask.toCPointer<ByteVar>())

public actual fun GetProcessDEPPolicy(hprocess: HANDLE, lpflags: Long, lppermanent: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessDEPPolicy(hprocess.toCPointer<ByteVar>(), lpflags.toCPointer<ByteVar>(), lppermanent.toCPointer<ByteVar>())

public actual fun GetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessDefaultCpuSetMasks(process.toCPointer<ByteVar>(), cpusetmasks.toCPointer<ByteVar>(), cpusetmaskcount, requiredmaskcount.toCPointer<ByteVar>())

public actual fun GetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessDefaultCpuSets(process.toCPointer<ByteVar>(), cpusetids.toCPointer<ByteVar>(), cpusetidcount, requiredidcount.toCPointer<ByteVar>())

public actual fun GetProcessGroupAffinity(hprocess: HANDLE, groupcount: Long, grouparray: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessGroupAffinity(hprocess.toCPointer<ByteVar>(), groupcount.toCPointer<ByteVar>(), grouparray.toCPointer<ByteVar>())

public actual fun GetProcessHandleCount(hprocess: HANDLE, pdwhandlecount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessHandleCount(hprocess.toCPointer<ByteVar>(), pdwhandlecount.toCPointer<ByteVar>())

public actual fun GetProcessHandleFromHwnd(hwnd: HWND): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessHandleFromHwnd(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetProcessId(process: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessId(process.toCPointer<ByteVar>())

public actual fun GetProcessIdOfThread(thread: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessIdOfThread(thread.toCPointer<ByteVar>())

public actual fun GetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessInformation(hprocess.toCPointer<ByteVar>(), processinformationclass, processinformation.toCPointer<ByteVar>(), processinformationsize)

public actual fun GetProcessIoCounters(hprocess: HANDLE, lpiocounters: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessIoCounters(hprocess.toCPointer<ByteVar>(), lpiocounters.toCPointer<ByteVar>())

public actual fun GetProcessMitigationPolicy(hprocess: HANDLE, mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessMitigationPolicy(hprocess.toCPointer<ByteVar>(), mitigationpolicy, lpbuffer.toCPointer<ByteVar>(), dwlength)

public actual fun GetProcessPriorityBoost(hprocess: HANDLE, pdisablepriorityboost: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessPriorityBoost(hprocess.toCPointer<ByteVar>(), pdisablepriorityboost.toCPointer<ByteVar>())

public actual fun GetProcessShutdownParameters(lpdwlevel: Long, lpdwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessShutdownParameters(lpdwlevel.toCPointer<ByteVar>(), lpdwflags.toCPointer<ByteVar>())

public actual fun GetProcessTimes(hprocess: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessTimes(hprocess.toCPointer<ByteVar>(), lpcreationtime.toCPointer<ByteVar>(), lpexittime.toCPointer<ByteVar>(), lpkerneltime.toCPointer<ByteVar>(), lpusertime.toCPointer<ByteVar>())

public actual fun GetProcessVersion(processid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessVersion(processid)

public actual fun GetProcessWorkingSetSize(hprocess: HANDLE, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetProcessWorkingSetSize(hprocess.toCPointer<ByteVar>(), lpminimumworkingsetsize.toCPointer<ByteVar>(), lpmaximumworkingsetsize.toCPointer<ByteVar>())

public actual fun GetStartupInfoA(lpstartupinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetStartupInfoA(lpstartupinfo.toCPointer<ByteVar>())
}

public actual fun GetStartupInfoW(lpstartupinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetStartupInfoW(lpstartupinfo.toCPointer<ByteVar>())
}

public actual fun GetSystemTimes(lpidletime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetSystemTimes(lpidletime.toCPointer<ByteVar>(), lpkerneltime.toCPointer<ByteVar>(), lpusertime.toCPointer<ByteVar>())

public actual fun GetThreadDescription(hthread: HANDLE, ppszthreaddescription: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadDescription(hthread.toCPointer<ByteVar>(), ppszthreaddescription.toCPointer<ByteVar>())

public actual fun GetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadGroupAffinity(hthread.toCPointer<ByteVar>(), groupaffinity.toCPointer<ByteVar>())

public actual fun GetThreadIOPendingFlag(hthread: HANDLE, lpioispending: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadIOPendingFlag(hthread.toCPointer<ByteVar>(), lpioispending.toCPointer<ByteVar>())

public actual fun GetThreadId(thread: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadId(thread.toCPointer<ByteVar>())

public actual fun GetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadIdealProcessorEx(hthread.toCPointer<ByteVar>(), lpidealprocessor.toCPointer<ByteVar>())

public actual fun GetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadInformation(hthread.toCPointer<ByteVar>(), threadinformationclass, threadinformation.toCPointer<ByteVar>(), threadinformationsize)

public actual fun GetThreadPriority(hthread: HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadPriority(hthread.toCPointer<ByteVar>())

public actual fun GetThreadPriorityBoost(hthread: HANDLE, pdisablepriorityboost: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadPriorityBoost(hthread.toCPointer<ByteVar>(), pdisablepriorityboost.toCPointer<ByteVar>())

public actual fun GetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort, requiredmaskcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadSelectedCpuSetMasks(thread.toCPointer<ByteVar>(), cpusetmasks.toCPointer<ByteVar>(), cpusetmaskcount, requiredmaskcount.toCPointer<ByteVar>())

public actual fun GetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt, requiredidcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadSelectedCpuSets(thread.toCPointer<ByteVar>(), cpusetids.toCPointer<ByteVar>(), cpusetidcount, requiredidcount.toCPointer<ByteVar>())

public actual fun GetThreadTimes(hthread: HANDLE, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetThreadTimes(hthread.toCPointer<ByteVar>(), lpcreationtime.toCPointer<ByteVar>(), lpexittime.toCPointer<ByteVar>(), lpkerneltime.toCPointer<ByteVar>(), lpusertime.toCPointer<ByteVar>())

public actual fun GetUmsCompletionListEvent(umscompletionlist: Long, umscompletionevent: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetUmsCompletionListEvent(umscompletionlist.toCPointer<ByteVar>(), umscompletionevent.toCPointer<ByteVar>())

public actual fun GetUmsSystemThreadInformation(threadhandle: HANDLE, systemthreadinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_GetUmsSystemThreadInformation(threadhandle.toCPointer<ByteVar>(), systemthreadinfo.toCPointer<ByteVar>())

public actual fun InitOnceBeginInitialize(lpinitonce: Long, dwflags: UInt, fpending: Long, lpcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitOnceBeginInitialize(lpinitonce.toCPointer<ByteVar>(), dwflags, fpending.toCPointer<ByteVar>(), lpcontext.toCPointer<ByteVar>())

public actual fun InitOnceComplete(lpinitonce: Long, dwflags: UInt, lpcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitOnceComplete(lpinitonce.toCPointer<ByteVar>(), dwflags, lpcontext.toCPointer<ByteVar>())

public actual fun InitOnceExecuteOnce(initonce: Long, initfn: PINIT_ONCE_FN, parameter: Long, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitOnceExecuteOnce(initonce.toCPointer<ByteVar>(), initfn.toLong().toCPointer<ByteVar>(), parameter.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun InitOnceInitialize(initonce: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitOnceInitialize(initonce.toCPointer<ByteVar>())
}

public actual fun InitializeConditionVariable(conditionvariable: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitializeConditionVariable(conditionvariable.toCPointer<ByteVar>())
}

public actual fun InitializeCriticalSection(lpcriticalsection: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitializeCriticalSection(lpcriticalsection.toCPointer<ByteVar>())
}

public actual fun InitializeCriticalSectionAndSpinCount(lpcriticalsection: Long, dwspincount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitializeCriticalSectionAndSpinCount(lpcriticalsection.toCPointer<ByteVar>(), dwspincount)

public actual fun InitializeCriticalSectionEx(lpcriticalsection: Long, dwspincount: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitializeCriticalSectionEx(lpcriticalsection.toCPointer<ByteVar>(), dwspincount, flags)

public actual fun InitializeProcThreadAttributeList(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwattributecount: UInt, dwflags: UInt, lpsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitializeProcThreadAttributeList(lpattributelist.toCPointer<ByteVar>(), dwattributecount, dwflags, lpsize.toCPointer<ByteVar>())

public actual fun InitializeSListHead(listhead: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitializeSListHead(listhead.toCPointer<ByteVar>())
}

public actual fun InitializeSRWLock(srwlock: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitializeSRWLock(srwlock.toCPointer<ByteVar>())
}

public actual fun InitializeSynchronizationBarrier(lpbarrier: Long, ltotalthreads: Int, lspincount: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InitializeSynchronizationBarrier(lpbarrier.toCPointer<ByteVar>(), ltotalthreads, lspincount)

public actual fun InterlockedFlushSList(listhead: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InterlockedFlushSList(listhead.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun InterlockedPopEntrySList(listhead: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InterlockedPopEntrySList(listhead.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun InterlockedPushEntrySList(listhead: Long, listentry: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InterlockedPushEntrySList(listhead.toCPointer<ByteVar>(), listentry.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun InterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_InterlockedPushListSListEx(listhead.toCPointer<ByteVar>(), list.toCPointer<ByteVar>(), listend.toCPointer<ByteVar>(), count)?.toLong() ?: 0L

public actual fun IsImmersiveProcess(hprocess: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_IsImmersiveProcess(hprocess.toCPointer<ByteVar>())

public actual fun IsProcessCritical(hprocess: HANDLE, critical: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_IsProcessCritical(hprocess.toCPointer<ByteVar>(), critical.toCPointer<ByteVar>())

public actual fun IsProcessorFeaturePresent(processorfeature: PROCESSOR_FEATURE_ID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_IsProcessorFeaturePresent(processorfeature)

public actual fun IsThreadAFiber(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_IsThreadAFiber()

public actual fun IsThreadpoolTimerSet(pti: PTP_TIMER): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_IsThreadpoolTimerSet(pti)

public actual fun IsWow64Process(hprocess: HANDLE, wow64process: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_IsWow64Process(hprocess.toCPointer<ByteVar>(), wow64process.toCPointer<ByteVar>())

public actual fun IsWow64Process2(hprocess: HANDLE, pprocessmachine: Long, pnativemachine: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_IsWow64Process2(hprocess.toCPointer<ByteVar>(), pprocessmachine.toCPointer<ByteVar>(), pnativemachine.toCPointer<ByteVar>())

public actual fun LeaveCriticalSection(lpcriticalsection: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_LeaveCriticalSection(lpcriticalsection.toCPointer<ByteVar>())
}

public actual fun LeaveCriticalSectionWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, pcs: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_LeaveCriticalSectionWhenCallbackReturns(pci, pcs.toCPointer<ByteVar>())
}

public actual fun OpenEventA(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenEventA(dwdesiredaccess, binherithandle, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenEventW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenEventW(dwdesiredaccess, binherithandle, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenMutexW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenMutexW(dwdesiredaccess, binherithandle, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenPrivateNamespaceA(lpboundarydescriptor: Long, lpaliasprefix: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenPrivateNamespaceA(lpboundarydescriptor.toCPointer<ByteVar>(), lpaliasprefix.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenPrivateNamespaceW(lpboundarydescriptor: Long, lpaliasprefix: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenPrivateNamespaceW(lpboundarydescriptor.toCPointer<ByteVar>(), lpaliasprefix.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenProcess(dwdesiredaccess: PROCESS_ACCESS_RIGHTS, binherithandle: BOOL, dwprocessid: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenProcess(dwdesiredaccess, binherithandle, dwprocessid)?.toLong() ?: 0L

public actual fun OpenProcessToken(processhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, tokenhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenProcessToken(processhandle.toCPointer<ByteVar>(), desiredaccess, tokenhandle.toCPointer<ByteVar>())

public actual fun OpenSemaphoreW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenSemaphoreW(dwdesiredaccess, binherithandle, lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenThread(dwdesiredaccess: THREAD_ACCESS_RIGHTS, binherithandle: BOOL, dwthreadid: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenThread(dwdesiredaccess, binherithandle, dwthreadid)?.toLong() ?: 0L

public actual fun OpenThreadToken(threadhandle: HANDLE, desiredaccess: TOKEN_ACCESS_MASK, openasself: BOOL, tokenhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenThreadToken(threadhandle.toCPointer<ByteVar>(), desiredaccess, openasself, tokenhandle.toCPointer<ByteVar>())

public actual fun OpenWaitableTimerA(dwdesiredaccess: UInt, binherithandle: BOOL, lptimername: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenWaitableTimerA(dwdesiredaccess, binherithandle, lptimername.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenWaitableTimerW(dwdesiredaccess: SYNCHRONIZATION_ACCESS_RIGHTS, binherithandle: BOOL, lptimername: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_OpenWaitableTimerW(dwdesiredaccess, binherithandle, lptimername.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PulseEvent(hevent: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_PulseEvent(hevent.toCPointer<ByteVar>())

public actual fun QueryDepthSList(listhead: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_QueryDepthSList(listhead.toCPointer<ByteVar>())

public actual fun QueryFullProcessImageNameA(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PSTR, lpdwsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_QueryFullProcessImageNameA(hprocess.toCPointer<ByteVar>(), dwflags, lpexename.toCPointer<ByteVar>(), lpdwsize.toCPointer<ByteVar>())

public actual fun QueryFullProcessImageNameW(hprocess: HANDLE, dwflags: PROCESS_NAME_FORMAT, lpexename: PWSTR, lpdwsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_QueryFullProcessImageNameW(hprocess.toCPointer<ByteVar>(), dwflags, lpexename.toCPointer<ByteVar>(), lpdwsize.toCPointer<ByteVar>())

public actual fun QueryProcessAffinityUpdateMode(hprocess: HANDLE, lpdwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_QueryProcessAffinityUpdateMode(hprocess.toCPointer<ByteVar>(), lpdwflags.toCPointer<ByteVar>())

public actual fun QueryProtectedPolicy(policyguid: Long, policyvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_QueryProtectedPolicy(policyguid.toCPointer<ByteVar>(), policyvalue.toCPointer<ByteVar>())

public actual fun QueryThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_QueryThreadpoolStackInformation(ptpp, ptpsi.toCPointer<ByteVar>())

public actual fun QueryUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt, returnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_QueryUmsThreadInformation(umsthread.toCPointer<ByteVar>(), umsthreadinfoclass, umsthreadinformation.toCPointer<ByteVar>(), umsthreadinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun QueueUserAPC(pfnapc: PAPCFUNC, hthread: HANDLE, dwdata: ULong): UInt =
    0u

public actual fun QueueUserAPC2(apcroutine: PAPCFUNC, thread: HANDLE, data: ULong, flags: QUEUE_USER_APC_FLAGS): BOOL =
    0

public actual fun QueueUserWorkItem(function: LPTHREAD_START_ROUTINE, context: Long, flags: WORKER_THREAD_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_QueueUserWorkItem(function.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), flags)

public actual fun RegisterWaitForSingleObject(phnewwaitobject: Long, hobject: HANDLE, callback: WAITORTIMERCALLBACK, context: Long, dwmilliseconds: UInt, dwflags: WORKER_THREAD_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RegisterWaitForSingleObject(phnewwaitobject.toCPointer<ByteVar>(), hobject.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), dwmilliseconds, dwflags)

public actual fun ReleaseMutex(hmutex: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ReleaseMutex(hmutex.toCPointer<ByteVar>())

public actual fun ReleaseMutexWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, mut: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ReleaseMutexWhenCallbackReturns(pci, mut.toCPointer<ByteVar>())
}

public actual fun ReleaseSRWLockExclusive(srwlock: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ReleaseSRWLockExclusive(srwlock.toCPointer<ByteVar>())
}

public actual fun ReleaseSRWLockShared(srwlock: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ReleaseSRWLockShared(srwlock.toCPointer<ByteVar>())
}

public actual fun ReleaseSemaphore(hsemaphore: HANDLE, lreleasecount: Int, lppreviouscount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ReleaseSemaphore(hsemaphore.toCPointer<ByteVar>(), lreleasecount, lppreviouscount.toCPointer<ByteVar>())

public actual fun ReleaseSemaphoreWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, sem: HANDLE, crel: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ReleaseSemaphoreWhenCallbackReturns(pci, sem.toCPointer<ByteVar>(), crel)
}

public actual fun ResetEvent(hevent: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ResetEvent(hevent.toCPointer<ByteVar>())

public actual fun ResumeThread(hthread: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_ResumeThread(hthread.toCPointer<ByteVar>())

public actual fun RtwqAddPeriodicCallback(callback: RTWQPERIODICCALLBACK, context: Long, key: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqAddPeriodicCallback(callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), key.toCPointer<ByteVar>())

public actual fun RtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqAllocateSerialWorkQueue(workqueueidin, workqueueidout.toCPointer<ByteVar>())

public actual fun RtwqAllocateWorkQueue(workqueuetype: RTWQ_WORKQUEUE_TYPE, workqueueid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqAllocateWorkQueue(workqueuetype, workqueueid.toCPointer<ByteVar>())

public actual fun RtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: PCWSTR, dwtaskid: UInt, lpriority: Int, donecallback: Long, donestate: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqBeginRegisterWorkQueueWithMMCSS(workqueueid, usageclass.toCPointer<ByteVar>(), dwtaskid, lpriority, donecallback.toCPointer<ByteVar>(), donestate.toCPointer<ByteVar>())

public actual fun RtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: Long, donestate: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid, donecallback.toCPointer<ByteVar>(), donestate.toCPointer<ByteVar>())

public actual fun RtwqCancelDeadline(prequest: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqCancelDeadline(prequest.toCPointer<ByteVar>())

public actual fun RtwqCancelWorkItem(key: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqCancelWorkItem(key)

public actual fun RtwqCreateAsyncResult(appobject: Long, callback: Long, appstate: Long, asyncresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqCreateAsyncResult(appobject.toCPointer<ByteVar>(), callback.toCPointer<ByteVar>(), appstate.toCPointer<ByteVar>(), asyncresult.toCPointer<ByteVar>())

public actual fun RtwqEndRegisterWorkQueueWithMMCSS(result: Long, taskid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqEndRegisterWorkQueueWithMMCSS(result.toCPointer<ByteVar>(), taskid.toCPointer<ByteVar>())

public actual fun RtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: PWSTR, usageclasslength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSClass(workqueueid, usageclass.toCPointer<ByteVar>(), usageclasslength.toCPointer<ByteVar>())

public actual fun RtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSPriority(workqueueid, priority.toCPointer<ByteVar>())

public actual fun RtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSTaskId(workqueueid, taskid.toCPointer<ByteVar>())

public actual fun RtwqInvokeCallback(result: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqInvokeCallback(result.toCPointer<ByteVar>())

public actual fun RtwqJoinWorkQueue(workqueueid: UInt, hfile: HANDLE, out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqJoinWorkQueue(workqueueid, hfile.toCPointer<ByteVar>(), out.toCPointer<ByteVar>())

public actual fun RtwqLockPlatform(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqLockPlatform()

public actual fun RtwqLockSharedWorkQueue(usageclass: PCWSTR, basepriority: Int, taskid: Long, id: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqLockSharedWorkQueue(usageclass.toCPointer<ByteVar>(), basepriority, taskid.toCPointer<ByteVar>(), id.toCPointer<ByteVar>())

public actual fun RtwqLockWorkQueue(workqueueid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqLockWorkQueue(workqueueid)

public actual fun RtwqPutWaitingWorkItem(hevent: HANDLE, lpriority: Int, result: Long, key: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqPutWaitingWorkItem(hevent.toCPointer<ByteVar>(), lpriority, result.toCPointer<ByteVar>(), key.toCPointer<ByteVar>())

public actual fun RtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqPutWorkItem(dwqueue, lpriority, result.toCPointer<ByteVar>())

public actual fun RtwqRegisterPlatformEvents(platformevents: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqRegisterPlatformEvents(platformevents.toCPointer<ByteVar>())

public actual fun RtwqRegisterPlatformWithMMCSS(usageclass: PCWSTR, taskid: Long, lpriority: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqRegisterPlatformWithMMCSS(usageclass.toCPointer<ByteVar>(), taskid.toCPointer<ByteVar>(), lpriority)

public actual fun RtwqRemovePeriodicCallback(dwkey: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqRemovePeriodicCallback(dwkey)

public actual fun RtwqScheduleWorkItem(result: Long, timeout: Long, key: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqScheduleWorkItem(result.toCPointer<ByteVar>(), timeout, key.toCPointer<ByteVar>())

public actual fun RtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqSetDeadline(workqueueid, deadlineinhns, prequest.toCPointer<ByteVar>())

public actual fun RtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqSetDeadline2(workqueueid, deadlineinhns, predeadlineinhns, prequest.toCPointer<ByteVar>())

public actual fun RtwqSetLongRunning(workqueueid: UInt, enable: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqSetLongRunning(workqueueid, enable)

public actual fun RtwqShutdown(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqShutdown()

public actual fun RtwqStartup(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqStartup()

public actual fun RtwqUnjoinWorkQueue(workqueueid: UInt, hfile: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqUnjoinWorkQueue(workqueueid, hfile.toCPointer<ByteVar>())

public actual fun RtwqUnlockPlatform(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqUnlockPlatform()

public actual fun RtwqUnlockWorkQueue(workqueueid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqUnlockWorkQueue(workqueueid)

public actual fun RtwqUnregisterPlatformEvents(platformevents: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqUnregisterPlatformEvents(platformevents.toCPointer<ByteVar>())

public actual fun RtwqUnregisterPlatformFromMMCSS(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_RtwqUnregisterPlatformFromMMCSS()

public actual fun SetCriticalSectionSpinCount(lpcriticalsection: Long, dwspincount: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetCriticalSectionSpinCount(lpcriticalsection.toCPointer<ByteVar>(), dwspincount)

public actual fun SetEvent(hevent: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetEvent(hevent.toCPointer<ByteVar>())

public actual fun SetEventWhenCallbackReturns(pci: PTP_CALLBACK_INSTANCE, evt: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetEventWhenCallbackReturns(pci, evt.toCPointer<ByteVar>())
}

public actual fun SetPriorityClass(hprocess: HANDLE, dwpriorityclass: PROCESS_CREATION_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetPriorityClass(hprocess.toCPointer<ByteVar>(), dwpriorityclass)

public actual fun SetProcessAffinityMask(hprocess: HANDLE, dwprocessaffinitymask: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessAffinityMask(hprocess.toCPointer<ByteVar>(), dwprocessaffinitymask)

public actual fun SetProcessAffinityUpdateMode(hprocess: HANDLE, dwflags: PROCESS_AFFINITY_AUTO_UPDATE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessAffinityUpdateMode(hprocess.toCPointer<ByteVar>(), dwflags)

public actual fun SetProcessDEPPolicy(dwflags: PROCESS_DEP_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessDEPPolicy(dwflags)

public actual fun SetProcessDefaultCpuSetMasks(process: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessDefaultCpuSetMasks(process.toCPointer<ByteVar>(), cpusetmasks.toCPointer<ByteVar>(), cpusetmaskcount)

public actual fun SetProcessDefaultCpuSets(process: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessDefaultCpuSets(process.toCPointer<ByteVar>(), cpusetids.toCPointer<ByteVar>(), cpusetidcount)

public actual fun SetProcessDynamicEHContinuationTargets(process: HANDLE, numberoftargets: UShort, targets: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessDynamicEHContinuationTargets(process.toCPointer<ByteVar>(), numberoftargets, targets.toCPointer<ByteVar>())

public actual fun SetProcessDynamicEnforcedCetCompatibleRanges(process: HANDLE, numberofranges: UShort, ranges: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessDynamicEnforcedCetCompatibleRanges(process.toCPointer<ByteVar>(), numberofranges, ranges.toCPointer<ByteVar>())

public actual fun SetProcessInformation(hprocess: HANDLE, processinformationclass: PROCESS_INFORMATION_CLASS, processinformation: Long, processinformationsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessInformation(hprocess.toCPointer<ByteVar>(), processinformationclass, processinformation.toCPointer<ByteVar>(), processinformationsize)

public actual fun SetProcessMitigationPolicy(mitigationpolicy: PROCESS_MITIGATION_POLICY, lpbuffer: Long, dwlength: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessMitigationPolicy(mitigationpolicy, lpbuffer.toCPointer<ByteVar>(), dwlength)

public actual fun SetProcessPriorityBoost(hprocess: HANDLE, bdisablepriorityboost: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessPriorityBoost(hprocess.toCPointer<ByteVar>(), bdisablepriorityboost)

public actual fun SetProcessRestrictionExemption(fenableexemption: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessRestrictionExemption(fenableexemption)

public actual fun SetProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessShutdownParameters(dwlevel, dwflags)

public actual fun SetProcessWorkingSetSize(hprocess: HANDLE, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProcessWorkingSetSize(hprocess.toCPointer<ByteVar>(), dwminimumworkingsetsize, dwmaximumworkingsetsize)

public actual fun SetProtectedPolicy(policyguid: Long, policyvalue: ULong, oldpolicyvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetProtectedPolicy(policyguid.toCPointer<ByteVar>(), policyvalue, oldpolicyvalue.toCPointer<ByteVar>())

public actual fun SetThreadAffinityMask(hthread: HANDLE, dwthreadaffinitymask: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadAffinityMask(hthread.toCPointer<ByteVar>(), dwthreadaffinitymask)

public actual fun SetThreadDescription(hthread: HANDLE, lpthreaddescription: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadDescription(hthread.toCPointer<ByteVar>(), lpthreaddescription.toCPointer<ByteVar>())

public actual fun SetThreadGroupAffinity(hthread: HANDLE, groupaffinity: Long, previousgroupaffinity: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadGroupAffinity(hthread.toCPointer<ByteVar>(), groupaffinity.toCPointer<ByteVar>(), previousgroupaffinity.toCPointer<ByteVar>())

public actual fun SetThreadIdealProcessor(hthread: HANDLE, dwidealprocessor: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadIdealProcessor(hthread.toCPointer<ByteVar>(), dwidealprocessor)

public actual fun SetThreadIdealProcessorEx(hthread: HANDLE, lpidealprocessor: Long, lppreviousidealprocessor: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadIdealProcessorEx(hthread.toCPointer<ByteVar>(), lpidealprocessor.toCPointer<ByteVar>(), lppreviousidealprocessor.toCPointer<ByteVar>())

public actual fun SetThreadInformation(hthread: HANDLE, threadinformationclass: THREAD_INFORMATION_CLASS, threadinformation: Long, threadinformationsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadInformation(hthread.toCPointer<ByteVar>(), threadinformationclass, threadinformation.toCPointer<ByteVar>(), threadinformationsize)

public actual fun SetThreadPriority(hthread: HANDLE, npriority: THREAD_PRIORITY): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadPriority(hthread.toCPointer<ByteVar>(), npriority)

public actual fun SetThreadPriorityBoost(hthread: HANDLE, bdisablepriorityboost: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadPriorityBoost(hthread.toCPointer<ByteVar>(), bdisablepriorityboost)

public actual fun SetThreadSelectedCpuSetMasks(thread: HANDLE, cpusetmasks: Long, cpusetmaskcount: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadSelectedCpuSetMasks(thread.toCPointer<ByteVar>(), cpusetmasks.toCPointer<ByteVar>(), cpusetmaskcount)

public actual fun SetThreadSelectedCpuSets(thread: HANDLE, cpusetids: Long, cpusetidcount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadSelectedCpuSets(thread.toCPointer<ByteVar>(), cpusetids.toCPointer<ByteVar>(), cpusetidcount)

public actual fun SetThreadStackGuarantee(stacksizeinbytes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadStackGuarantee(stacksizeinbytes.toCPointer<ByteVar>())

public actual fun SetThreadToken(thread: Long, token: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadToken(thread.toCPointer<ByteVar>(), token.toCPointer<ByteVar>())

public actual fun SetThreadpoolStackInformation(ptpp: PTP_POOL, ptpsi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadpoolStackInformation(ptpp, ptpsi.toCPointer<ByteVar>())

public actual fun SetThreadpoolThreadMaximum(ptpp: PTP_POOL, cthrdmost: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadpoolThreadMaximum(ptpp, cthrdmost)
}

public actual fun SetThreadpoolThreadMinimum(ptpp: PTP_POOL, cthrdmic: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadpoolThreadMinimum(ptpp, cthrdmic)

public actual fun SetThreadpoolTimer(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadpoolTimer(pti, pftduetime.toCPointer<ByteVar>(), msperiod, mswindowlength)
}

public actual fun SetThreadpoolTimerEx(pti: PTP_TIMER, pftduetime: Long, msperiod: UInt, mswindowlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadpoolTimerEx(pti, pftduetime.toCPointer<ByteVar>(), msperiod, mswindowlength)

public actual fun SetThreadpoolWait(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadpoolWait(pwa, h.toCPointer<ByteVar>(), pfttimeout.toCPointer<ByteVar>())
}

public actual fun SetThreadpoolWaitEx(pwa: PTP_WAIT, h: HANDLE, pfttimeout: Long, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetThreadpoolWaitEx(pwa, h.toCPointer<ByteVar>(), pfttimeout.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetTimerQueueTimer(timerqueue: HANDLE, callback: WAITORTIMERCALLBACK, parameter: Long, duetime: UInt, period: UInt, preferio: BOOL): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetTimerQueueTimer(timerqueue.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), parameter.toCPointer<ByteVar>(), duetime, period, preferio)?.toLong() ?: 0L

public actual fun SetUmsThreadInformation(umsthread: Long, umsthreadinfoclass: UMS_THREAD_INFO_CLASS, umsthreadinformation: Long, umsthreadinformationlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetUmsThreadInformation(umsthread.toCPointer<ByteVar>(), umsthreadinfoclass, umsthreadinformation.toCPointer<ByteVar>(), umsthreadinformationlength)

public actual fun SetWaitableTimer(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, fresume: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetWaitableTimer(htimer.toCPointer<ByteVar>(), lpduetime.toCPointer<ByteVar>(), lperiod, pfncompletionroutine.toLong().toCPointer<ByteVar>(), lpargtocompletionroutine.toCPointer<ByteVar>(), fresume)

public actual fun SetWaitableTimerEx(htimer: HANDLE, lpduetime: Long, lperiod: Int, pfncompletionroutine: PTIMERAPCROUTINE, lpargtocompletionroutine: Long, wakecontext: Long, tolerabledelay: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SetWaitableTimerEx(htimer.toCPointer<ByteVar>(), lpduetime.toCPointer<ByteVar>(), lperiod, pfncompletionroutine.toLong().toCPointer<ByteVar>(), lpargtocompletionroutine.toCPointer<ByteVar>(), wakecontext.toCPointer<ByteVar>(), tolerabledelay)

public actual fun SignalObjectAndWait(hobjecttosignal: HANDLE, hobjecttowaiton: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SignalObjectAndWait(hobjecttosignal.toCPointer<ByteVar>(), hobjecttowaiton.toCPointer<ByteVar>(), dwmilliseconds, balertable)

public actual fun Sleep(dwmilliseconds: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_Sleep(dwmilliseconds)
}

public actual fun SleepConditionVariableCS(conditionvariable: Long, criticalsection: Long, dwmilliseconds: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SleepConditionVariableCS(conditionvariable.toCPointer<ByteVar>(), criticalsection.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun SleepConditionVariableSRW(conditionvariable: Long, srwlock: Long, dwmilliseconds: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SleepConditionVariableSRW(conditionvariable.toCPointer<ByteVar>(), srwlock.toCPointer<ByteVar>(), dwmilliseconds, flags)

public actual fun SleepEx(dwmilliseconds: UInt, balertable: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SleepEx(dwmilliseconds, balertable)

public actual fun StartThreadpoolIo(pio: PTP_IO) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_StartThreadpoolIo(pio)
}

public actual fun SubmitThreadpoolWork(pwk: PTP_WORK) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SubmitThreadpoolWork(pwk)
}

public actual fun SuspendThread(hthread: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SuspendThread(hthread.toCPointer<ByteVar>())

public actual fun SwitchToFiber(lpfiber: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SwitchToFiber(lpfiber.toCPointer<ByteVar>())
}

public actual fun SwitchToThread(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_SwitchToThread()

public actual fun TerminateProcess(hprocess: HANDLE, uexitcode: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_TerminateProcess(hprocess.toCPointer<ByteVar>(), uexitcode)

public actual fun TerminateThread(hthread: HANDLE, dwexitcode: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_TerminateThread(hthread.toCPointer<ByteVar>(), dwexitcode)

public actual fun TlsAlloc(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_TlsAlloc()

public actual fun TlsFree(dwtlsindex: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_TlsFree(dwtlsindex)

public actual fun TlsGetValue(dwtlsindex: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_TlsGetValue(dwtlsindex)?.toLong() ?: 0L

public actual fun TlsSetValue(dwtlsindex: UInt, lptlsvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_TlsSetValue(dwtlsindex, lptlsvalue.toCPointer<ByteVar>())

public actual fun TryAcquireSRWLockExclusive(srwlock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_TryAcquireSRWLockExclusive(srwlock.toCPointer<ByteVar>())

public actual fun TryAcquireSRWLockShared(srwlock: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_TryAcquireSRWLockShared(srwlock.toCPointer<ByteVar>())

public actual fun TryEnterCriticalSection(lpcriticalsection: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_TryEnterCriticalSection(lpcriticalsection.toCPointer<ByteVar>())

public actual fun TrySubmitThreadpoolCallback(pfns: PTP_SIMPLE_CALLBACK, pv: Long, pcbe: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_TrySubmitThreadpoolCallback(pfns.toLong().toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), pcbe.toCPointer<ByteVar>())

public actual fun UmsThreadYield(schedulerparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_UmsThreadYield(schedulerparam.toCPointer<ByteVar>())

public actual fun UnregisterWait(waithandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_UnregisterWait(waithandle.toCPointer<ByteVar>())

public actual fun UnregisterWaitEx(waithandle: HANDLE, completionevent: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_UnregisterWaitEx(waithandle.toCPointer<ByteVar>(), completionevent.toCPointer<ByteVar>())

public actual fun UpdateProcThreadAttribute(lpattributelist: LPPROC_THREAD_ATTRIBUTE_LIST, dwflags: UInt, attribute: ULong, lpvalue: Long, cbsize: ULong, lppreviousvalue: Long, lpreturnsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_UpdateProcThreadAttribute(lpattributelist.toCPointer<ByteVar>(), dwflags, attribute, lpvalue.toCPointer<ByteVar>(), cbsize, lppreviousvalue.toCPointer<ByteVar>(), lpreturnsize.toCPointer<ByteVar>())

public actual fun WaitForInputIdle(hprocess: HANDLE, dwmilliseconds: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WaitForInputIdle(hprocess.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun WaitForMultipleObjects(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt): WAIT_EVENT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WaitForMultipleObjects(ncount, lphandles.toCPointer<ByteVar>(), bwaitall, dwmilliseconds)

public actual fun WaitForMultipleObjectsEx(ncount: UInt, lphandles: Long, bwaitall: BOOL, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WaitForMultipleObjectsEx(ncount, lphandles.toCPointer<ByteVar>(), bwaitall, dwmilliseconds, balertable)

public actual fun WaitForSingleObject(hhandle: HANDLE, dwmilliseconds: UInt): WAIT_EVENT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WaitForSingleObject(hhandle.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun WaitForSingleObjectEx(hhandle: HANDLE, dwmilliseconds: UInt, balertable: BOOL): WAIT_EVENT =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WaitForSingleObjectEx(hhandle.toCPointer<ByteVar>(), dwmilliseconds, balertable)

public actual fun WaitForThreadpoolIoCallbacks(pio: PTP_IO, fcancelpendingcallbacks: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WaitForThreadpoolIoCallbacks(pio, fcancelpendingcallbacks)
}

public actual fun WaitForThreadpoolTimerCallbacks(pti: PTP_TIMER, fcancelpendingcallbacks: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WaitForThreadpoolTimerCallbacks(pti, fcancelpendingcallbacks)
}

public actual fun WaitForThreadpoolWaitCallbacks(pwa: PTP_WAIT, fcancelpendingcallbacks: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WaitForThreadpoolWaitCallbacks(pwa, fcancelpendingcallbacks)
}

public actual fun WaitForThreadpoolWorkCallbacks(pwk: PTP_WORK, fcancelpendingcallbacks: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WaitForThreadpoolWorkCallbacks(pwk, fcancelpendingcallbacks)
}

public actual fun WaitOnAddress(address: Long, compareaddress: Long, addresssize: ULong, dwmilliseconds: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WaitOnAddress(address.toCPointer<ByteVar>(), compareaddress.toCPointer<ByteVar>(), addresssize, dwmilliseconds)

public actual fun WakeAllConditionVariable(conditionvariable: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WakeAllConditionVariable(conditionvariable.toCPointer<ByteVar>())
}

public actual fun WakeByAddressAll(address: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WakeByAddressAll(address.toCPointer<ByteVar>())
}

public actual fun WakeByAddressSingle(address: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WakeByAddressSingle(address.toCPointer<ByteVar>())
}

public actual fun WakeConditionVariable(conditionvariable: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WakeConditionVariable(conditionvariable.toCPointer<ByteVar>())
}

public actual fun WinExec(lpcmdline: PCSTR, ucmdshow: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_WinExec(lpcmdline.toCPointer<ByteVar>(), ucmdshow)

public actual fun Wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_Wow64SetThreadDefaultGuestMachine(machine)

public actual fun Wow64SuspendThread(hthread: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.threading.cinterop.windowssys_windows_win32_system_threading_Wow64SuspendThread(hthread.toCPointer<ByteVar>())
