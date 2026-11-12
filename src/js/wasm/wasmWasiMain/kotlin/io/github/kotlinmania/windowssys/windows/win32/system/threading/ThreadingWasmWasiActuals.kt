@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Papcfunc
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.TokenAccessMask

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun acquireSRWLockExclusive(srwlock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAcquireSRWLockExclusive")

public actual fun acquireSRWLockShared(srwlock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAcquireSRWLockShared")

public actual fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: MutPtr, integritylabel: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAddIntegrityLabelToBoundaryDescriptor")

public actual fun addSIDToBoundaryDescriptor(boundarydescriptor: MutPtr, requiredsid: Psid): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAddSIDToBoundaryDescriptor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingAttachThreadInput")
private external fun wasiWindowssysWindowsWin32SystemThreadingAttachThreadInput(idattach: Int, idattachto: Int, fattach: Int): Int

public actual fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool =
    wasiWindowssysWindowsWin32SystemThreadingAttachThreadInput(idattach.toInt(), idattachto.toInt(), fattach)

public actual fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvQuerySystemResponsiveness")

public actual fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRevertMmThreadCharacteristics")

public actual fun avRtCreateThreadOrderingGroup(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroup")

public actual fun avRtCreateThreadOrderingGroupExA(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr, taskname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExA")

public actual fun avRtCreateThreadOrderingGroupExW(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr, taskname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExW")

public actual fun avRtDeleteThreadOrderingGroup(context: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtDeleteThreadOrderingGroup")

public actual fun avRtJoinThreadOrderingGroup(context: MutPtr, threadorderingguid: ConstPtr, before: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtJoinThreadOrderingGroup")

public actual fun avRtLeaveThreadOrderingGroup(context: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtLeaveThreadOrderingGroup")

public actual fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvRtWaitOnThreadOrderingGroup")

public actual fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsA")

public actual fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsW")

public actual fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsA")

public actual fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsW")

public actual fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingAvSetMmThreadPriority")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCallbackMayRunLong")
private external fun wasiWindowssysWindowsWin32SystemThreadingCallbackMayRunLong(pci: Long): Int

public actual fun callbackMayRunLong(pci: PtpCallbackInstance): Bool =
    wasiWindowssysWindowsWin32SystemThreadingCallbackMayRunLong(pci)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCancelThreadpoolIo")
private external fun wasiWindowssysWindowsWin32SystemThreadingCancelThreadpoolIo(pio: Long): Unit

public actual fun cancelThreadpoolIo(pio: PtpIo): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCancelThreadpoolIo(pio)

public actual fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCancelTimerQueueTimer")

public actual fun cancelWaitableTimer(htimer: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCancelWaitableTimer")

public actual fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingChangeTimerQueueTimer")

public actual fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingClosePrivateNamespace")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpool")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpool(ptpp: Long): Unit

public actual fun closeThreadpool(ptpp: PtpPool): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpool(ptpp)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup(ptpcg: Long): Unit

public actual fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup(ptpcg)

public actual fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroupMembers")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpoolIo")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolIo(pio: Long): Unit

public actual fun closeThreadpoolIo(pio: PtpIo): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolIo(pio)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpoolTimer")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolTimer(pti: Long): Unit

public actual fun closeThreadpoolTimer(pti: PtpTimer): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolTimer(pti)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpoolWait")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolWait(pwa: Long): Unit

public actual fun closeThreadpoolWait(pwa: PtpWait): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolWait(pwa)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCloseThreadpoolWork")
private external fun wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolWork(pwk: Long): Unit

public actual fun closeThreadpoolWork(pwk: PtpWork): Unit =
    wasiWindowssysWindowsWin32SystemThreadingCloseThreadpoolWork(pwk)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingConvertFiberToThread")
private external fun wasiWindowssysWindowsWin32SystemThreadingConvertFiberToThread(): Int

public actual fun convertFiberToThread(): Bool =
    wasiWindowssysWindowsWin32SystemThreadingConvertFiberToThread()

public actual fun convertThreadToFiber(lpparameter: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingConvertThreadToFiber")

public actual fun convertThreadToFiberEx(lpparameter: ConstPtr, dwflags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingConvertThreadToFiberEx")

public actual fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorA")

public actual fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorW")

public actual fun createEventA(lpeventattributes: ConstPtr, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateEventA")

public actual fun createEventExA(lpeventattributes: ConstPtr, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateEventExA")

public actual fun createEventExW(lpeventattributes: ConstPtr, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateEventExW")

public actual fun createEventW(lpeventattributes: ConstPtr, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateEventW")

public actual fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateFiber")

public actual fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateFiberEx")

public actual fun createMutexA(lpmutexattributes: ConstPtr, binitialowner: Bool, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateMutexA")

public actual fun createMutexExA(lpmutexattributes: ConstPtr, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateMutexExA")

public actual fun createMutexExW(lpmutexattributes: ConstPtr, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateMutexExW")

public actual fun createMutexW(lpmutexattributes: ConstPtr, binitialowner: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateMutexW")

public actual fun createPrivateNamespaceA(lpprivatenamespaceattributes: ConstPtr, lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceA")

public actual fun createPrivateNamespaceW(lpprivatenamespaceattributes: ConstPtr, lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceW")

public actual fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessA")

public actual fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessAsUserA")

public actual fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessAsUserW")

public actual fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessW")

public actual fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessWithLogonW")

public actual fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateProcessWithTokenW")

public actual fun createRemoteThread(hprocess: Handle, lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: UInt, lpthreadid: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateRemoteThread")

public actual fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateRemoteThreadEx")

public actual fun createSemaphoreA(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateSemaphoreA")

public actual fun createSemaphoreExA(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateSemaphoreExA")

public actual fun createSemaphoreExW(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateSemaphoreExW")

public actual fun createSemaphoreW(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateSemaphoreW")

public actual fun createThread(lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: ThreadCreationFlags, lpthreadid: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThread")

public actual fun createThreadpool(reserved: ConstPtr): PtpPool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThreadpool")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup")
private external fun wasiWindowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup(): Long

public actual fun createThreadpoolCleanupGroup(): PtpCleanupGroup =
    wasiWindowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup()

public actual fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: MutPtr, pcbe: ConstPtr): PtpIo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThreadpoolIo")

public actual fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: MutPtr, pcbe: ConstPtr): PtpTimer =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThreadpoolTimer")

public actual fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: MutPtr, pcbe: ConstPtr): PtpWait =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThreadpoolWait")

public actual fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: MutPtr, pcbe: ConstPtr): PtpWork =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateThreadpoolWork")

public actual fun createTimerQueue(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateTimerQueue")

public actual fun createTimerQueueTimer(phnewtimer: MutPtr, timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateTimerQueueTimer")

public actual fun createUmsCompletionList(umscompletionlist: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateUmsCompletionList")

public actual fun createUmsThreadContext(lpumsthread: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateUmsThreadContext")

public actual fun createWaitableTimerA(lptimerattributes: ConstPtr, bmanualreset: Bool, lptimername: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateWaitableTimerA")

public actual fun createWaitableTimerExA(lptimerattributes: ConstPtr, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateWaitableTimerExA")

public actual fun createWaitableTimerExW(lptimerattributes: ConstPtr, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateWaitableTimerExW")

public actual fun createWaitableTimerW(lptimerattributes: ConstPtr, bmanualreset: Bool, lptimername: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingCreateWaitableTimerW")

public actual fun deleteBoundaryDescriptor(boundarydescriptor: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteBoundaryDescriptor")

public actual fun deleteCriticalSection(lpcriticalsection: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteCriticalSection")

public actual fun deleteFiber(lpfiber: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteFiber")

public actual fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteProcThreadAttributeList")

public actual fun deleteSynchronizationBarrier(lpbarrier: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteSynchronizationBarrier")

public actual fun deleteTimerQueue(timerqueue: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteTimerQueue")

public actual fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteTimerQueueEx")

public actual fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteTimerQueueTimer")

public actual fun deleteUmsCompletionList(umscompletionlist: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteUmsCompletionList")

public actual fun deleteUmsThreadContext(umsthread: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDeleteUmsThreadContext")

public actual fun dequeueUmsCompletionListItems(umscompletionlist: ConstPtr, waittimeout: UInt, umsthreadlist: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingDequeueUmsCompletionListItems")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback")
private external fun wasiWindowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback(pci: Long): Unit

public actual fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance): Unit =
    wasiWindowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback(pci)

public actual fun enterCriticalSection(lpcriticalsection: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingEnterCriticalSection")

public actual fun enterSynchronizationBarrier(lpbarrier: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingEnterSynchronizationBarrier")

public actual fun enterUmsSchedulingMode(schedulerstartupinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingEnterUmsSchedulingMode")

public actual fun executeUmsThread(umsthread: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingExecuteUmsThread")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingExitProcess")
private external fun wasiWindowssysWindowsWin32SystemThreadingExitProcess(uexitcode: Int): Unit

public actual fun exitProcess(uexitcode: UInt): Nothing {
    wasiWindowssysWindowsWin32SystemThreadingExitProcess(uexitcode.toInt())
    error("C noreturn function windowssysWindowsWin32SystemThreadingExitProcess returned")
}

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingExitThread")
private external fun wasiWindowssysWindowsWin32SystemThreadingExitThread(dwexitcode: Int): Unit

public actual fun exitThread(dwexitcode: UInt): Nothing {
    wasiWindowssysWindowsWin32SystemThreadingExitThread(dwexitcode.toInt())
    error("C noreturn function windowssysWindowsWin32SystemThreadingExitThread returned")
}

public actual fun flsAlloc(lpcallback: PflsCallbackFunction): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingFlsAlloc")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingFlsFree")
private external fun wasiWindowssysWindowsWin32SystemThreadingFlsFree(dwflsindex: Int): Int

public actual fun flsFree(dwflsindex: UInt): Bool =
    wasiWindowssysWindowsWin32SystemThreadingFlsFree(dwflsindex.toInt())

public actual fun flsGetValue(dwflsindex: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingFlsGetValue")

public actual fun flsSetValue(dwflsindex: UInt, lpflsdata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingFlsSetValue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers")
private external fun wasiWindowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers(): Unit

public actual fun flushProcessWriteBuffers(): Unit =
    wasiWindowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers()

public actual fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingFreeLibraryWhenCallbackReturns")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetActiveProcessorCount")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetActiveProcessorCount(groupnumber: Int): Int

public actual fun getActiveProcessorCount(groupnumber: UShort): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetActiveProcessorCount(groupnumber.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount(): Int

public actual fun getActiveProcessorGroupCount(): UShort =
    wasiWindowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount().toUShort()

public actual fun getCurrentProcess(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetCurrentProcess")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetCurrentProcessId")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetCurrentProcessId(): Int

public actual fun getCurrentProcessId(): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetCurrentProcessId().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber(): Int

public actual fun getCurrentProcessorNumber(): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber().toUInt()

public actual fun getCurrentProcessorNumberEx(procnumber: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumberEx")

public actual fun getCurrentThread(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetCurrentThread")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetCurrentThreadId")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetCurrentThreadId(): Int

public actual fun getCurrentThreadId(): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetCurrentThreadId().toUInt()

public actual fun getCurrentThreadStackLimits(lowlimit: MutPtr, highlimit: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetCurrentThreadStackLimits")

public actual fun getCurrentUmsThread(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetCurrentUmsThread")

public actual fun getExitCodeProcess(hprocess: Handle, lpexitcode: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetExitCodeProcess")

public actual fun getExitCodeThread(hthread: Handle, lpexitcode: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetExitCodeThread")

public actual fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetGuiResources")

public actual fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetMachineTypeAttributes")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetMaximumProcessorCount")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetMaximumProcessorCount(groupnumber: Int): Int

public actual fun getMaximumProcessorCount(groupnumber: UShort): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetMaximumProcessorCount(groupnumber.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount(): Int

public actual fun getMaximumProcessorGroupCount(): UShort =
    wasiWindowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount().toUShort()

public actual fun getNextUmsListItem(umscontext: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNextUmsListItem")

public actual fun getNumaAvailableMemoryNode(node: UByte, availablebytes: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNode")

public actual fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNodeEx")

public actual fun getNumaHighestNodeNumber(highestnodenumber: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaHighestNodeNumber")

public actual fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaNodeNumberFromHandle")

public actual fun getNumaNodeProcessorMask(node: UByte, processormask: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask")

public actual fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: MutPtr, processormaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask2")

public actual fun getNumaNodeProcessorMaskEx(node: UShort, processormask: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMaskEx")

public actual fun getNumaProcessorNode(processor: UByte, nodenumber: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaProcessorNode")

public actual fun getNumaProcessorNodeEx(processor: ConstPtr, nodenumber: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaProcessorNodeEx")

public actual fun getNumaProximityNode(proximityid: UInt, nodenumber: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaProximityNode")

public actual fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetNumaProximityNodeEx")

public actual fun getPriorityClass(hprocess: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetPriorityClass")

public actual fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: MutPtr, lpsystemaffinitymask: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessAffinityMask")

public actual fun getProcessDEPPolicy(hprocess: Handle, lpflags: MutPtr, lppermanent: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessDEPPolicy")

public actual fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: MutPtr, cpusetmaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSetMasks")

public actual fun getProcessDefaultCpuSets(process: Handle, cpusetids: MutPtr, cpusetidcount: UInt, requiredidcount: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSets")

public actual fun getProcessGroupAffinity(hprocess: Handle, groupcount: MutPtr, grouparray: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessGroupAffinity")

public actual fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessHandleCount")

public actual fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessHandleFromHwnd")

public actual fun getProcessId(process: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessId")

public actual fun getProcessIdOfThread(thread: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessIdOfThread")

public actual fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: MutPtr, processinformationsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessInformation")

public actual fun getProcessIoCounters(hprocess: Handle, lpiocounters: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessIoCounters")

public actual fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: MutPtr, dwlength: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessMitigationPolicy")

public actual fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessPriorityBoost")

public actual fun getProcessShutdownParameters(lpdwlevel: MutPtr, lpdwflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessShutdownParameters")

public actual fun getProcessTimes(hprocess: Handle, lpcreationtime: MutPtr, lpexittime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessTimes")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingGetProcessVersion")
private external fun wasiWindowssysWindowsWin32SystemThreadingGetProcessVersion(processid: Int): Int

public actual fun getProcessVersion(processid: UInt): UInt =
    wasiWindowssysWindowsWin32SystemThreadingGetProcessVersion(processid.toInt()).toUInt()

public actual fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: MutPtr, lpmaximumworkingsetsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetProcessWorkingSetSize")

public actual fun getStartupInfoA(lpstartupinfo: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetStartupInfoA")

public actual fun getStartupInfoW(lpstartupinfo: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetStartupInfoW")

public actual fun getSystemTimes(lpidletime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetSystemTimes")

public actual fun getThreadDescription(hthread: Handle, ppszthreaddescription: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadDescription")

public actual fun getThreadGroupAffinity(hthread: Handle, groupaffinity: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadGroupAffinity")

public actual fun getThreadIOPendingFlag(hthread: Handle, lpioispending: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadIOPendingFlag")

public actual fun getThreadId(thread: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadId")

public actual fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadIdealProcessorEx")

public actual fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: MutPtr, threadinformationsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadInformation")

public actual fun getThreadPriority(hthread: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadPriority")

public actual fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadPriorityBoost")

public actual fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: MutPtr, cpusetmaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSetMasks")

public actual fun getThreadSelectedCpuSets(thread: Handle, cpusetids: MutPtr, cpusetidcount: UInt, requiredidcount: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSets")

public actual fun getThreadTimes(hthread: Handle, lpcreationtime: MutPtr, lpexittime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetThreadTimes")

public actual fun getUmsCompletionListEvent(umscompletionlist: ConstPtr, umscompletionevent: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetUmsCompletionListEvent")

public actual fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingGetUmsSystemThreadInformation")

public actual fun initOnceBeginInitialize(lpinitonce: MutPtr, dwflags: UInt, fpending: MutPtr, lpcontext: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitOnceBeginInitialize")

public actual fun initOnceComplete(lpinitonce: MutPtr, dwflags: UInt, lpcontext: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitOnceComplete")

public actual fun initOnceExecuteOnce(initonce: MutPtr, initfn: PinitOnceFn, parameter: MutPtr, context: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitOnceExecuteOnce")

public actual fun initOnceInitialize(initonce: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitOnceInitialize")

public actual fun initializeConditionVariable(conditionvariable: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeConditionVariable")

public actual fun initializeCriticalSection(lpcriticalsection: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeCriticalSection")

public actual fun initializeCriticalSectionAndSpinCount(lpcriticalsection: MutPtr, dwspincount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeCriticalSectionAndSpinCount")

public actual fun initializeCriticalSectionEx(lpcriticalsection: MutPtr, dwspincount: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeCriticalSectionEx")

public actual fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeProcThreadAttributeList")

public actual fun initializeSListHead(listhead: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeSListHead")

public actual fun initializeSRWLock(srwlock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeSRWLock")

public actual fun initializeSynchronizationBarrier(lpbarrier: MutPtr, ltotalthreads: Int, lspincount: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInitializeSynchronizationBarrier")

public actual fun interlockedFlushSList(listhead: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInterlockedFlushSList")

public actual fun interlockedPopEntrySList(listhead: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInterlockedPopEntrySList")

public actual fun interlockedPushEntrySList(listhead: MutPtr, listentry: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInterlockedPushEntrySList")

public actual fun interlockedPushListSListEx(listhead: MutPtr, list: MutPtr, listend: MutPtr, count: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingInterlockedPushListSListEx")

public actual fun isImmersiveProcess(hprocess: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingIsImmersiveProcess")

public actual fun isProcessCritical(hprocess: Handle, critical: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingIsProcessCritical")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent")
private external fun wasiWindowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent(processorfeature: Int): Int

public actual fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool =
    wasiWindowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent(processorfeature.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingIsThreadAFiber")
private external fun wasiWindowssysWindowsWin32SystemThreadingIsThreadAFiber(): Int

public actual fun isThreadAFiber(): Bool =
    wasiWindowssysWindowsWin32SystemThreadingIsThreadAFiber()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet")
private external fun wasiWindowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet(pti: Long): Int

public actual fun isThreadpoolTimerSet(pti: PtpTimer): Bool =
    wasiWindowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet(pti)

public actual fun isWow64Process(hprocess: Handle, wow64process: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingIsWow64Process")

public actual fun isWow64Process2(hprocess: Handle, pprocessmachine: MutPtr, pnativemachine: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingIsWow64Process2")

public actual fun leaveCriticalSection(lpcriticalsection: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingLeaveCriticalSection")

public actual fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingLeaveCriticalSectionWhenCallbackReturns")

public actual fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenEventA")

public actual fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenEventW")

public actual fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenMutexW")

public actual fun openPrivateNamespaceA(lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceA")

public actual fun openPrivateNamespaceW(lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceW")

public actual fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenProcess")

public actual fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenProcessToken")

public actual fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenSemaphoreW")

public actual fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenThread")

public actual fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenThreadToken")

public actual fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenWaitableTimerA")

public actual fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingOpenWaitableTimerW")

public actual fun pulseEvent(hevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingPulseEvent")

public actual fun queryDepthSList(listhead: ConstPtr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryDepthSList")

public actual fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameA")

public actual fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameW")

public actual fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryProcessAffinityUpdateMode")

public actual fun queryProtectedPolicy(policyguid: ConstPtr, policyvalue: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryProtectedPolicy")

public actual fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryThreadpoolStackInformation")

public actual fun queryUmsThreadInformation(umsthread: ConstPtr, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: MutPtr, umsthreadinformationlength: UInt, returnlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueryUmsThreadInformation")

public actual fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueueUserAPC")

public actual fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueueUserAPC2")

public actual fun queueUserWorkItem(function: LpthreadStartRoutine, context: ConstPtr, flags: WorkerThreadFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingQueueUserWorkItem")

public actual fun registerWaitForSingleObject(phnewwaitobject: MutPtr, hobject: Handle, callback: Waitortimercallback, context: ConstPtr, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRegisterWaitForSingleObject")

public actual fun releaseMutex(hmutex: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseMutex")

public actual fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseMutexWhenCallbackReturns")

public actual fun releaseSRWLockExclusive(srwlock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseSRWLockExclusive")

public actual fun releaseSRWLockShared(srwlock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseSRWLockShared")

public actual fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseSemaphore")

public actual fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingReleaseSemaphoreWhenCallbackReturns")

public actual fun resetEvent(hevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingResetEvent")

public actual fun resumeThread(hthread: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingResumeThread")

public actual fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: MutPtr, key: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqAddPeriodicCallback")

public actual fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqAllocateSerialWorkQueue")

public actual fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqAllocateWorkQueue")

public actual fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: MutPtr, donestate: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqBeginRegisterWorkQueueWithMMCSS")

public actual fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: MutPtr, donestate: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqBeginUnregisterWorkQueueWithMMCSS")

public actual fun rtwqCancelDeadline(prequest: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqCancelDeadline")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqCancelWorkItem")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqCancelWorkItem(key: Long): Int

public actual fun rtwqCancelWorkItem(key: ULong): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqCancelWorkItem(key.toLong())

public actual fun rtwqCreateAsyncResult(appobject: MutPtr, callback: MutPtr, appstate: MutPtr, asyncresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqCreateAsyncResult")

public actual fun rtwqEndRegisterWorkQueueWithMMCSS(result: MutPtr, taskid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqEndRegisterWorkQueueWithMMCSS")

public actual fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSClass")

public actual fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSPriority")

public actual fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSTaskId")

public actual fun rtwqInvokeCallback(result: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqInvokeCallback")

public actual fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqJoinWorkQueue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqLockPlatform")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqLockPlatform(): Int

public actual fun rtwqLockPlatform(): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqLockPlatform()

public actual fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: MutPtr, id: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqLockSharedWorkQueue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqLockWorkQueue")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqLockWorkQueue(workqueueid: Int): Int

public actual fun rtwqLockWorkQueue(workqueueid: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqLockWorkQueue(workqueueid.toInt())

public actual fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: MutPtr, key: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqPutWaitingWorkItem")

public actual fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqPutWorkItem")

public actual fun rtwqRegisterPlatformEvents(platformevents: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformEvents")

public actual fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: MutPtr, lpriority: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformWithMMCSS")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback(dwkey: Int): Int

public actual fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback(dwkey.toInt())

public actual fun rtwqScheduleWorkItem(result: MutPtr, timeout: Long, key: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqScheduleWorkItem")

public actual fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqSetDeadline")

public actual fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqSetDeadline2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqSetLongRunning")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqSetLongRunning(workqueueid: Int, enable: Int): Int

public actual fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqSetLongRunning(workqueueid.toInt(), enable)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqShutdown")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqShutdown(): Int

public actual fun rtwqShutdown(): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqShutdown()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqStartup")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqStartup(): Int

public actual fun rtwqStartup(): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqStartup()

public actual fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqUnjoinWorkQueue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqUnlockPlatform")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqUnlockPlatform(): Int

public actual fun rtwqUnlockPlatform(): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqUnlockPlatform()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue(workqueueid: Int): Int

public actual fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue(workqueueid.toInt())

public actual fun rtwqUnregisterPlatformEvents(platformevents: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformEvents")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS")
private external fun wasiWindowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS(): Int

public actual fun rtwqUnregisterPlatformFromMMCSS(): Hresult =
    wasiWindowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS()

public actual fun setCriticalSectionSpinCount(lpcriticalsection: MutPtr, dwspincount: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetCriticalSectionSpinCount")

public actual fun setEvent(hevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetEvent")

public actual fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetEventWhenCallbackReturns")

public actual fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetPriorityClass")

public actual fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessAffinityMask")

public actual fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessAffinityUpdateMode")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSetProcessDEPPolicy")
private external fun wasiWindowssysWindowsWin32SystemThreadingSetProcessDEPPolicy(dwflags: Int): Int

public actual fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool =
    wasiWindowssysWindowsWin32SystemThreadingSetProcessDEPPolicy(dwflags.toInt())

public actual fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: ConstPtr, cpusetmaskcount: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSetMasks")

public actual fun setProcessDefaultCpuSets(process: Handle, cpusetids: ConstPtr, cpusetidcount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSets")

public actual fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessDynamicEHContinuationTargets")

public actual fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessDynamicEnforcedCetCompatibleRanges")

public actual fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: ConstPtr, processinformationsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessInformation")

public actual fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: ConstPtr, dwlength: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessMitigationPolicy")

public actual fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessPriorityBoost")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption")
private external fun wasiWindowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption(fenableexemption: Int): Int

public actual fun setProcessRestrictionExemption(fenableexemption: Bool): Bool =
    wasiWindowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption(fenableexemption)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSetProcessShutdownParameters")
private external fun wasiWindowssysWindowsWin32SystemThreadingSetProcessShutdownParameters(dwlevel: Int, dwflags: Int): Int

public actual fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool =
    wasiWindowssysWindowsWin32SystemThreadingSetProcessShutdownParameters(dwlevel.toInt(), dwflags.toInt())

public actual fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProcessWorkingSetSize")

public actual fun setProtectedPolicy(policyguid: ConstPtr, policyvalue: ULong, oldpolicyvalue: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetProtectedPolicy")

public actual fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadAffinityMask")

public actual fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadDescription")

public actual fun setThreadGroupAffinity(hthread: Handle, groupaffinity: ConstPtr, previousgroupaffinity: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadGroupAffinity")

public actual fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadIdealProcessor")

public actual fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: ConstPtr, lppreviousidealprocessor: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadIdealProcessorEx")

public actual fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: ConstPtr, threadinformationsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadInformation")

public actual fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadPriority")

public actual fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadPriorityBoost")

public actual fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: ConstPtr, cpusetmaskcount: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSetMasks")

public actual fun setThreadSelectedCpuSets(thread: Handle, cpusetids: ConstPtr, cpusetidcount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSets")

public actual fun setThreadStackGuarantee(stacksizeinbytes: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadStackGuarantee")

public actual fun setThreadToken(thread: ConstPtr, token: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadToken")

public actual fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadpoolStackInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum")
private external fun wasiWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum(ptpp: Long, cthrdmost: Int): Unit

public actual fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt): Unit =
    wasiWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum(ptpp, cthrdmost.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum")
private external fun wasiWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum(ptpp: Long, cthrdmic: Int): Int

public actual fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool =
    wasiWindowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum(ptpp, cthrdmic.toInt())

public actual fun setThreadpoolTimer(pti: PtpTimer, pftduetime: ConstPtr, msperiod: UInt, mswindowlength: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadpoolTimer")

public actual fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: ConstPtr, msperiod: UInt, mswindowlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadpoolTimerEx")

public actual fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadpoolWait")

public actual fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr, reserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetThreadpoolWaitEx")

public actual fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr, duetime: UInt, period: UInt, preferio: Bool): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetTimerQueueTimer")

public actual fun setUmsThreadInformation(umsthread: ConstPtr, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: ConstPtr, umsthreadinformationlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetUmsThreadInformation")

public actual fun setWaitableTimer(htimer: Handle, lpduetime: ConstPtr, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr, fresume: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetWaitableTimer")

public actual fun setWaitableTimerEx(htimer: Handle, lpduetime: ConstPtr, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr, wakecontext: ConstPtr, tolerabledelay: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSetWaitableTimerEx")

public actual fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSignalObjectAndWait")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSleep")
private external fun wasiWindowssysWindowsWin32SystemThreadingSleep(dwmilliseconds: Int): Unit

public actual fun sleep(dwmilliseconds: UInt): Unit =
    wasiWindowssysWindowsWin32SystemThreadingSleep(dwmilliseconds.toInt())

public actual fun sleepConditionVariableCS(conditionvariable: MutPtr, criticalsection: MutPtr, dwmilliseconds: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSleepConditionVariableCS")

public actual fun sleepConditionVariableSRW(conditionvariable: MutPtr, srwlock: MutPtr, dwmilliseconds: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSleepConditionVariableSRW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSleepEx")
private external fun wasiWindowssysWindowsWin32SystemThreadingSleepEx(dwmilliseconds: Int, balertable: Int): Int

public actual fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt =
    wasiWindowssysWindowsWin32SystemThreadingSleepEx(dwmilliseconds.toInt(), balertable).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingStartThreadpoolIo")
private external fun wasiWindowssysWindowsWin32SystemThreadingStartThreadpoolIo(pio: Long): Unit

public actual fun startThreadpoolIo(pio: PtpIo): Unit =
    wasiWindowssysWindowsWin32SystemThreadingStartThreadpoolIo(pio)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSubmitThreadpoolWork")
private external fun wasiWindowssysWindowsWin32SystemThreadingSubmitThreadpoolWork(pwk: Long): Unit

public actual fun submitThreadpoolWork(pwk: PtpWork): Unit =
    wasiWindowssysWindowsWin32SystemThreadingSubmitThreadpoolWork(pwk)

public actual fun suspendThread(hthread: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSuspendThread")

public actual fun switchToFiber(lpfiber: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingSwitchToFiber")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingSwitchToThread")
private external fun wasiWindowssysWindowsWin32SystemThreadingSwitchToThread(): Int

public actual fun switchToThread(): Bool =
    wasiWindowssysWindowsWin32SystemThreadingSwitchToThread()

public actual fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTerminateProcess")

public actual fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTerminateThread")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingTlsAlloc")
private external fun wasiWindowssysWindowsWin32SystemThreadingTlsAlloc(): Int

public actual fun tlsAlloc(): UInt =
    wasiWindowssysWindowsWin32SystemThreadingTlsAlloc().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingTlsFree")
private external fun wasiWindowssysWindowsWin32SystemThreadingTlsFree(dwtlsindex: Int): Int

public actual fun tlsFree(dwtlsindex: UInt): Bool =
    wasiWindowssysWindowsWin32SystemThreadingTlsFree(dwtlsindex.toInt())

public actual fun tlsGetValue(dwtlsindex: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTlsGetValue")

public actual fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTlsSetValue")

public actual fun tryAcquireSRWLockExclusive(srwlock: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTryAcquireSRWLockExclusive")

public actual fun tryAcquireSRWLockShared(srwlock: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTryAcquireSRWLockShared")

public actual fun tryEnterCriticalSection(lpcriticalsection: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTryEnterCriticalSection")

public actual fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: MutPtr, pcbe: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingTrySubmitThreadpoolCallback")

public actual fun umsThreadYield(schedulerparam: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingUmsThreadYield")

public actual fun unregisterWait(waithandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingUnregisterWait")

public actual fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingUnregisterWaitEx")

public actual fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: ConstPtr, cbsize: ULong, lppreviousvalue: MutPtr, lpreturnsize: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingUpdateProcThreadAttribute")

public actual fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitForInputIdle")

public actual fun waitForMultipleObjects(ncount: UInt, lphandles: ConstPtr, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitForMultipleObjects")

public actual fun waitForMultipleObjectsEx(ncount: UInt, lphandles: ConstPtr, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitForMultipleObjectsEx")

public actual fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitForSingleObject")

public actual fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitForSingleObjectEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks")
private external fun wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks(pio: Long, fcancelpendingcallbacks: Int): Unit

public actual fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool): Unit =
    wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks(pio, fcancelpendingcallbacks)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks")
private external fun wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks(pti: Long, fcancelpendingcallbacks: Int): Unit

public actual fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool): Unit =
    wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks(pti, fcancelpendingcallbacks)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks")
private external fun wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks(pwa: Long, fcancelpendingcallbacks: Int): Unit

public actual fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool): Unit =
    wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks(pwa, fcancelpendingcallbacks)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks")
private external fun wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks(pwk: Long, fcancelpendingcallbacks: Int): Unit

public actual fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool): Unit =
    wasiWindowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks(pwk, fcancelpendingcallbacks)

public actual fun waitOnAddress(address: ConstPtr, compareaddress: ConstPtr, addresssize: ULong, dwmilliseconds: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWaitOnAddress")

public actual fun wakeAllConditionVariable(conditionvariable: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWakeAllConditionVariable")

public actual fun wakeByAddressAll(address: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWakeByAddressAll")

public actual fun wakeByAddressSingle(address: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWakeByAddressSingle")

public actual fun wakeConditionVariable(conditionvariable: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWakeConditionVariable")

public actual fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWinExec")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine")
private external fun wasiWindowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine(machine: Int): Int

public actual fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    wasiWindowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine(machine.toInt()).toUShort()

public actual fun wow64SuspendThread(hthread: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemThreadingWow64SuspendThread")
