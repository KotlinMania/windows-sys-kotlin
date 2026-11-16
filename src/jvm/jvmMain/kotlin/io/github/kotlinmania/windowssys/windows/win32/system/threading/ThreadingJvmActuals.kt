@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemThreadingJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemThreadingJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAcquireSRWLockExclusive(srwlock: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAcquireSRWLockShared(srwlock: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAddIntegrityLabelToBoundaryDescriptor(boundarydescriptor: Long, integritylabel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAddSIDToBoundaryDescriptor(boundarydescriptor: Long, requiredsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAttachThreadInput(idattach: Int, idattachto: Int, fattach: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvQuerySystemResponsiveness(avrthandle: Long, systemresponsivenessvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvRevertMmThreadCharacteristics(avrthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroup(context: Long, period: Long, threadorderingguid: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExA(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExW(context: Long, period: Long, threadorderingguid: Long, timeout: Long, taskname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvRtDeleteThreadOrderingGroup(context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvRtJoinThreadOrderingGroup(context: Long, threadorderingguid: Long, before: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvRtLeaveThreadOrderingGroup(context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvRtWaitOnThreadOrderingGroup(context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsA(firsttask: Long, secondtask: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsW(firsttask: Long, secondtask: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsA(taskname: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsW(taskname: Long, taskindex: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingAvSetMmThreadPriority(avrthandle: Long, priority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCallbackMayRunLong(pci: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCancelThreadpoolIo(pio: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCancelTimerQueueTimer(timerqueue: Long, timer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCancelWaitableTimer(htimer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingChangeTimerQueueTimer(timerqueue: Long, timer: Long, duetime: Int, period: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingClosePrivateNamespace(handle: Long, flags: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCloseThreadpool(ptpp: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup(ptpcg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroupMembers(ptpcg: Long, fcancelpendingcallbacks: Int, pvcleanupcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCloseThreadpoolIo(pio: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCloseThreadpoolTimer(pti: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCloseThreadpoolWait(pwa: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCloseThreadpoolWork(pwk: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingConvertFiberToThread(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingConvertThreadToFiber(lpparameter: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingConvertThreadToFiberEx(lpparameter: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorA(name: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorW(name: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateEventA(lpeventattributes: Long, bmanualreset: Int, binitialstate: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateEventExA(lpeventattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateEventExW(lpeventattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateEventW(lpeventattributes: Long, bmanualreset: Int, binitialstate: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateFiber(dwstacksize: Long, lpstartaddress: Long, lpparameter: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateFiberEx(dwstackcommitsize: Long, dwstackreservesize: Long, dwflags: Int, lpstartaddress: Long, lpparameter: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateMutexA(lpmutexattributes: Long, binitialowner: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateMutexExA(lpmutexattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateMutexExW(lpmutexattributes: Long, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateMutexW(lpmutexattributes: Long, binitialowner: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceA(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceW(lpprivatenamespaceattributes: Long, lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateProcessA(lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateProcessAsUserA(htoken: Long, lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateProcessAsUserW(htoken: Long, lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateProcessW(lpapplicationname: Long, lpcommandline: Long, lpprocessattributes: Long, lpthreadattributes: Long, binherithandles: Int, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateProcessWithLogonW(lpusername: Long, lpdomain: Long, lppassword: Long, dwlogonflags: Int, lpapplicationname: Long, lpcommandline: Long, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateProcessWithTokenW(htoken: Long, dwlogonflags: Int, lpapplicationname: Long, lpcommandline: Long, dwcreationflags: Int, lpenvironment: Long, lpcurrentdirectory: Long, lpstartupinfo: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateRemoteThread(hprocess: Long, lpthreadattributes: Long, dwstacksize: Long, lpstartaddress: Long, lpparameter: Long, dwcreationflags: Int, lpthreadid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateRemoteThreadEx(hprocess: Long, lpthreadattributes: Long, dwstacksize: Long, lpstartaddress: Long, lpparameter: Long, dwcreationflags: Int, lpattributelist: Long, lpthreadid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateSemaphoreA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateSemaphoreExA(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateSemaphoreExW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateSemaphoreW(lpsemaphoreattributes: Long, linitialcount: Int, lmaximumcount: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateThread(lpthreadattributes: Long, dwstacksize: Long, lpstartaddress: Long, lpparameter: Long, dwcreationflags: Int, lpthreadid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateThreadpool(reserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateThreadpoolIo(fl: Long, pfnio: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateThreadpoolTimer(pfnti: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateThreadpoolWait(pfnwa: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateThreadpoolWork(pfnwk: Long, pv: Long, pcbe: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateTimerQueue(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateTimerQueueTimer(phnewtimer: Long, timerqueue: Long, callback: Long, parameter: Long, duetime: Int, period: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateUmsCompletionList(umscompletionlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateUmsThreadContext(lpumsthread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateWaitableTimerA(lptimerattributes: Long, bmanualreset: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateWaitableTimerExA(lptimerattributes: Long, lptimername: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateWaitableTimerExW(lptimerattributes: Long, lptimername: Long, dwflags: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingCreateWaitableTimerW(lptimerattributes: Long, bmanualreset: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDeleteBoundaryDescriptor(boundarydescriptor: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDeleteCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDeleteFiber(lpfiber: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDeleteProcThreadAttributeList(lpattributelist: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDeleteSynchronizationBarrier(lpbarrier: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDeleteTimerQueue(timerqueue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDeleteTimerQueueEx(timerqueue: Long, completionevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDeleteTimerQueueTimer(timerqueue: Long, timer: Long, completionevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDeleteUmsCompletionList(umscompletionlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDeleteUmsThreadContext(umsthread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDequeueUmsCompletionListItems(umscompletionlist: Long, waittimeout: Int, umsthreadlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback(pci: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingEnterCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingEnterSynchronizationBarrier(lpbarrier: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingEnterUmsSchedulingMode(schedulerstartupinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingExecuteUmsThread(umsthread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingExitProcess(uexitcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingExitThread(dwexitcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingFlsAlloc(lpcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingFlsFree(dwflsindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingFlsGetValue(dwflsindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingFlsSetValue(dwflsindex: Int, lpflsdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers()

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingFreeLibraryWhenCallbackReturns(pci: Long, mod: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetActiveProcessorCount(groupnumber: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount(): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetCurrentProcess(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetCurrentProcessId(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumberEx(procnumber: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetCurrentThread(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetCurrentThreadId(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetCurrentThreadStackLimits(lowlimit: Long, highlimit: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetCurrentUmsThread(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetExitCodeProcess(hprocess: Long, lpexitcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetExitCodeThread(hthread: Long, lpexitcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetGuiResources(hprocess: Long, uiflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetMachineTypeAttributes(machine: Short, machinetypeattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetMaximumProcessorCount(groupnumber: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount(): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNextUmsListItem(umscontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNode(node: Byte, availablebytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNodeEx(node: Short, availablebytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaHighestNodeNumber(highestnodenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaNodeNumberFromHandle(hfile: Long, nodenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask(node: Byte, processormask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask2(nodenumber: Short, processormasks: Long, processormaskcount: Short, requiredmaskcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMaskEx(node: Short, processormask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaProcessorNode(processor: Byte, nodenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaProcessorNodeEx(processor: Long, nodenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaProximityNode(proximityid: Int, nodenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetNumaProximityNodeEx(proximityid: Int, nodenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetPriorityClass(hprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessAffinityMask(hprocess: Long, lpprocessaffinitymask: Long, lpsystemaffinitymask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessDEPPolicy(hprocess: Long, lpflags: Long, lppermanent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSetMasks(process: Long, cpusetmasks: Long, cpusetmaskcount: Short, requiredmaskcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSets(process: Long, cpusetids: Long, cpusetidcount: Int, requiredidcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessGroupAffinity(hprocess: Long, groupcount: Long, grouparray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessHandleCount(hprocess: Long, pdwhandlecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessHandleFromHwnd(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessId(process: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessIdOfThread(thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessInformation(hprocess: Long, processinformationclass: Int, processinformation: Long, processinformationsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessIoCounters(hprocess: Long, lpiocounters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessMitigationPolicy(hprocess: Long, mitigationpolicy: Int, lpbuffer: Long, dwlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessPriorityBoost(hprocess: Long, pdisablepriorityboost: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessShutdownParameters(lpdwlevel: Long, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessTimes(hprocess: Long, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessVersion(processid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetProcessWorkingSetSize(hprocess: Long, lpminimumworkingsetsize: Long, lpmaximumworkingsetsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetStartupInfoA(lpstartupinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetStartupInfoW(lpstartupinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetSystemTimes(lpidletime: Long, lpkerneltime: Long, lpusertime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadDescription(hthread: Long, ppszthreaddescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadGroupAffinity(hthread: Long, groupaffinity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadIOPendingFlag(hthread: Long, lpioispending: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadId(thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadIdealProcessorEx(hthread: Long, lpidealprocessor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadInformation(hthread: Long, threadinformationclass: Int, threadinformation: Long, threadinformationsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadPriority(hthread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadPriorityBoost(hthread: Long, pdisablepriorityboost: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSetMasks(thread: Long, cpusetmasks: Long, cpusetmaskcount: Short, requiredmaskcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSets(thread: Long, cpusetids: Long, cpusetidcount: Int, requiredidcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetThreadTimes(hthread: Long, lpcreationtime: Long, lpexittime: Long, lpkerneltime: Long, lpusertime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetUmsCompletionListEvent(umscompletionlist: Long, umscompletionevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingGetUmsSystemThreadInformation(threadhandle: Long, systemthreadinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitOnceBeginInitialize(lpinitonce: Long, dwflags: Int, fpending: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitOnceComplete(lpinitonce: Long, dwflags: Int, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitOnceExecuteOnce(initonce: Long, initfn: Long, parameter: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitOnceInitialize(initonce: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitializeConditionVariable(conditionvariable: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitializeCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitializeCriticalSectionAndSpinCount(lpcriticalsection: Long, dwspincount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitializeCriticalSectionEx(lpcriticalsection: Long, dwspincount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitializeProcThreadAttributeList(lpattributelist: Long, dwattributecount: Int, dwflags: Int, lpsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitializeSListHead(listhead: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitializeSRWLock(srwlock: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInitializeSynchronizationBarrier(lpbarrier: Long, ltotalthreads: Int, lspincount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInterlockedFlushSList(listhead: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInterlockedPopEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInterlockedPushEntrySList(listhead: Long, listentry: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingIsImmersiveProcess(hprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingIsProcessCritical(hprocess: Long, critical: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent(processorfeature: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingIsThreadAFiber(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet(pti: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingIsWow64Process(hprocess: Long, wow64process: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingIsWow64Process2(hprocess: Long, pprocessmachine: Long, pnativemachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingLeaveCriticalSection(lpcriticalsection: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingLeaveCriticalSectionWhenCallbackReturns(pci: Long, pcs: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenEventA(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenEventW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenMutexW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceA(lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceW(lpboundarydescriptor: Long, lpaliasprefix: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenProcess(dwdesiredaccess: Int, binherithandle: Int, dwprocessid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenProcessToken(processhandle: Long, desiredaccess: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenSemaphoreW(dwdesiredaccess: Int, binherithandle: Int, lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenThread(dwdesiredaccess: Int, binherithandle: Int, dwthreadid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenThreadToken(threadhandle: Long, desiredaccess: Int, openasself: Int, tokenhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenWaitableTimerA(dwdesiredaccess: Int, binherithandle: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingOpenWaitableTimerW(dwdesiredaccess: Int, binherithandle: Int, lptimername: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingPulseEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingQueryDepthSList(listhead: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameA(hprocess: Long, dwflags: Int, lpexename: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameW(hprocess: Long, dwflags: Int, lpexename: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingQueryProcessAffinityUpdateMode(hprocess: Long, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingQueryProtectedPolicy(policyguid: Long, policyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingQueryThreadpoolStackInformation(ptpp: Long, ptpsi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingQueryUmsThreadInformation(umsthread: Long, umsthreadinfoclass: Int, umsthreadinformation: Long, umsthreadinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingQueueUserWorkItem(function: Long, context: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRegisterWaitForSingleObject(phnewwaitobject: Long, hobject: Long, callback: Long, context: Long, dwmilliseconds: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingReleaseMutex(hmutex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingReleaseMutexWhenCallbackReturns(pci: Long, mut: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingReleaseSRWLockExclusive(srwlock: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingReleaseSRWLockShared(srwlock: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingReleaseSemaphore(hsemaphore: Long, lreleasecount: Int, lppreviouscount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingReleaseSemaphoreWhenCallbackReturns(pci: Long, sem: Long, crel: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingResetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingResumeThread(hthread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqAddPeriodicCallback(callback: Long, context: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqAllocateSerialWorkQueue(workqueueidin: Int, workqueueidout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqAllocateWorkQueue(workqueuetype: Int, workqueueid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: Int, usageclass: Long, dwtaskid: Int, lpriority: Int, donecallback: Long, donestate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: Int, donecallback: Long, donestate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqCancelDeadline(prequest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqCancelWorkItem(key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqCreateAsyncResult(appobject: Long, callback: Long, appstate: Long, asyncresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqEndRegisterWorkQueueWithMMCSS(result: Long, taskid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSClass(workqueueid: Int, usageclass: Long, usageclasslength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSPriority(workqueueid: Int, priority: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSTaskId(workqueueid: Int, taskid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqInvokeCallback(result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqJoinWorkQueue(workqueueid: Int, hfile: Long, out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqLockPlatform(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqLockSharedWorkQueue(usageclass: Long, basepriority: Int, taskid: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqLockWorkQueue(workqueueid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqPutWaitingWorkItem(hevent: Long, lpriority: Int, result: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqPutWorkItem(dwqueue: Int, lpriority: Int, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformEvents(platformevents: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformWithMMCSS(usageclass: Long, taskid: Long, lpriority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback(dwkey: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqScheduleWorkItem(result: Long, timeout: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqSetDeadline(workqueueid: Int, deadlineinhns: Long, prequest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqSetDeadline2(workqueueid: Int, deadlineinhns: Long, predeadlineinhns: Long, prequest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqSetLongRunning(workqueueid: Int, enable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqShutdown(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqStartup(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqUnjoinWorkQueue(workqueueid: Int, hfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqUnlockPlatform(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue(workqueueid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformEvents(platformevents: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetCriticalSectionSpinCount(lpcriticalsection: Long, dwspincount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetEventWhenCallbackReturns(pci: Long, evt: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetPriorityClass(hprocess: Long, dwpriorityclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessAffinityMask(hprocess: Long, dwprocessaffinitymask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessAffinityUpdateMode(hprocess: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessDEPPolicy(dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSetMasks(process: Long, cpusetmasks: Long, cpusetmaskcount: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSets(process: Long, cpusetids: Long, cpusetidcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessDynamicEHContinuationTargets(process: Long, numberoftargets: Short, targets: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessDynamicEnforcedCetCompatibleRanges(process: Long, numberofranges: Short, ranges: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessInformation(hprocess: Long, processinformationclass: Int, processinformation: Long, processinformationsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessMitigationPolicy(mitigationpolicy: Int, lpbuffer: Long, dwlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessPriorityBoost(hprocess: Long, bdisablepriorityboost: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption(fenableexemption: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessShutdownParameters(dwlevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProcessWorkingSetSize(hprocess: Long, dwminimumworkingsetsize: Long, dwmaximumworkingsetsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetProtectedPolicy(policyguid: Long, policyvalue: Long, oldpolicyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadAffinityMask(hthread: Long, dwthreadaffinitymask: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadDescription(hthread: Long, lpthreaddescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadGroupAffinity(hthread: Long, groupaffinity: Long, previousgroupaffinity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadIdealProcessor(hthread: Long, dwidealprocessor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadIdealProcessorEx(hthread: Long, lpidealprocessor: Long, lppreviousidealprocessor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadInformation(hthread: Long, threadinformationclass: Int, threadinformation: Long, threadinformationsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadPriority(hthread: Long, npriority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadPriorityBoost(hthread: Long, bdisablepriorityboost: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSetMasks(thread: Long, cpusetmasks: Long, cpusetmaskcount: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSets(thread: Long, cpusetids: Long, cpusetidcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadStackGuarantee(stacksizeinbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadToken(thread: Long, token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadpoolStackInformation(ptpp: Long, ptpsi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum(ptpp: Long, cthrdmost: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum(ptpp: Long, cthrdmic: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadpoolTimer(pti: Long, pftduetime: Long, msperiod: Int, mswindowlength: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadpoolTimerEx(pti: Long, pftduetime: Long, msperiod: Int, mswindowlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadpoolWait(pwa: Long, h: Long, pfttimeout: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetThreadpoolWaitEx(pwa: Long, h: Long, pfttimeout: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetTimerQueueTimer(timerqueue: Long, callback: Long, parameter: Long, duetime: Int, period: Int, preferio: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetUmsThreadInformation(umsthread: Long, umsthreadinfoclass: Int, umsthreadinformation: Long, umsthreadinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetWaitableTimer(htimer: Long, lpduetime: Long, lperiod: Int, pfncompletionroutine: Long, lpargtocompletionroutine: Long, fresume: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSetWaitableTimerEx(htimer: Long, lpduetime: Long, lperiod: Int, pfncompletionroutine: Long, lpargtocompletionroutine: Long, wakecontext: Long, tolerabledelay: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSignalObjectAndWait(hobjecttosignal: Long, hobjecttowaiton: Long, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSleep(dwmilliseconds: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSleepConditionVariableCS(conditionvariable: Long, criticalsection: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSleepConditionVariableSRW(conditionvariable: Long, srwlock: Long, dwmilliseconds: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSleepEx(dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingStartThreadpoolIo(pio: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSubmitThreadpoolWork(pwk: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSuspendThread(hthread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSwitchToFiber(lpfiber: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingSwitchToThread(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingTerminateProcess(hprocess: Long, uexitcode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingTerminateThread(hthread: Long, dwexitcode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingTlsAlloc(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingTlsFree(dwtlsindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingTlsGetValue(dwtlsindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingTlsSetValue(dwtlsindex: Int, lptlsvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingTryAcquireSRWLockExclusive(srwlock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingTryAcquireSRWLockShared(srwlock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingTryEnterCriticalSection(lpcriticalsection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingTrySubmitThreadpoolCallback(pfns: Long, pv: Long, pcbe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingUmsThreadYield(schedulerparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingUnregisterWait(waithandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingUnregisterWaitEx(waithandle: Long, completionevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingUpdateProcThreadAttribute(lpattributelist: Long, dwflags: Int, attribute: Long, lpvalue: Long, cbsize: Long, lppreviousvalue: Long, lpreturnsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWaitForInputIdle(hprocess: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWaitForMultipleObjects(ncount: Int, lphandles: Long, bwaitall: Int, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWaitForMultipleObjectsEx(ncount: Int, lphandles: Long, bwaitall: Int, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWaitForSingleObject(hhandle: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWaitForSingleObjectEx(hhandle: Long, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks(pio: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks(pti: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks(pwa: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks(pwk: Long, fcancelpendingcallbacks: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWaitOnAddress(address: Long, compareaddress: Long, addresssize: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWakeAllConditionVariable(conditionvariable: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWakeByAddressAll(address: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWakeByAddressSingle(address: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWakeConditionVariable(conditionvariable: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWinExec(lpcmdline: Long, ucmdshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine(machine: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemThreadingWow64SuspendThread(hthread: Long): Int
}

public actual fun acquireSRWLockExclusive(srwlock: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAcquireSRWLockExclusive(srwlock.rawAddress)
}

public actual fun acquireSRWLockShared(srwlock: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAcquireSRWLockShared(srwlock.rawAddress)
}

public actual fun addIntegrityLabelToBoundaryDescriptor(boundarydescriptor: MutPtr, integritylabel: Psid): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAddIntegrityLabelToBoundaryDescriptor(boundarydescriptor.rawAddress, integritylabel.rawAddress)

public actual fun addSIDToBoundaryDescriptor(boundarydescriptor: MutPtr, requiredsid: Psid): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAddSIDToBoundaryDescriptor(boundarydescriptor.rawAddress, requiredsid.rawAddress)

public actual fun attachThreadInput(idattach: UInt, idattachto: UInt, fattach: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAttachThreadInput(idattach.toInt(), idattachto.toInt(), fattach)

public actual fun avQuerySystemResponsiveness(avrthandle: Handle, systemresponsivenessvalue: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvQuerySystemResponsiveness(avrthandle.rawAddress, systemresponsivenessvalue.rawAddress)

public actual fun avRevertMmThreadCharacteristics(avrthandle: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvRevertMmThreadCharacteristics(avrthandle.rawAddress)

public actual fun avRtCreateThreadOrderingGroup(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroup(context.rawAddress, period.rawAddress, threadorderingguid.rawAddress, timeout.rawAddress)

public actual fun avRtCreateThreadOrderingGroupExA(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr, taskname: Pcstr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExA(context.rawAddress, period.rawAddress, threadorderingguid.rawAddress, timeout.rawAddress, taskname.rawAddress)

public actual fun avRtCreateThreadOrderingGroupExW(context: MutPtr, period: ConstPtr, threadorderingguid: MutPtr, timeout: ConstPtr, taskname: Pcwstr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvRtCreateThreadOrderingGroupExW(context.rawAddress, period.rawAddress, threadorderingguid.rawAddress, timeout.rawAddress, taskname.rawAddress)

public actual fun avRtDeleteThreadOrderingGroup(context: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvRtDeleteThreadOrderingGroup(context.rawAddress)

public actual fun avRtJoinThreadOrderingGroup(context: MutPtr, threadorderingguid: ConstPtr, before: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvRtJoinThreadOrderingGroup(context.rawAddress, threadorderingguid.rawAddress, before)

public actual fun avRtLeaveThreadOrderingGroup(context: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvRtLeaveThreadOrderingGroup(context.rawAddress)

public actual fun avRtWaitOnThreadOrderingGroup(context: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvRtWaitOnThreadOrderingGroup(context.rawAddress)

public actual fun avSetMmMaxThreadCharacteristicsA(firsttask: Pcstr, secondtask: Pcstr, taskindex: MutPtr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsA(firsttask.rawAddress, secondtask.rawAddress, taskindex.rawAddress))

public actual fun avSetMmMaxThreadCharacteristicsW(firsttask: Pcwstr, secondtask: Pcwstr, taskindex: MutPtr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvSetMmMaxThreadCharacteristicsW(firsttask.rawAddress, secondtask.rawAddress, taskindex.rawAddress))

public actual fun avSetMmThreadCharacteristicsA(taskname: Pcstr, taskindex: MutPtr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsA(taskname.rawAddress, taskindex.rawAddress))

public actual fun avSetMmThreadCharacteristicsW(taskname: Pcwstr, taskindex: MutPtr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvSetMmThreadCharacteristicsW(taskname.rawAddress, taskindex.rawAddress))

public actual fun avSetMmThreadPriority(avrthandle: Handle, priority: AvrtPriority): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingAvSetMmThreadPriority(avrthandle.rawAddress, priority)

public actual fun callbackMayRunLong(pci: PtpCallbackInstance): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCallbackMayRunLong(pci)

public actual fun cancelThreadpoolIo(pio: PtpIo) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCancelThreadpoolIo(pio)
}

public actual fun cancelTimerQueueTimer(timerqueue: Handle, timer: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCancelTimerQueueTimer(timerqueue.rawAddress, timer.rawAddress)

public actual fun cancelWaitableTimer(htimer: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCancelWaitableTimer(htimer.rawAddress)

public actual fun changeTimerQueueTimer(timerqueue: Handle, timer: Handle, duetime: UInt, period: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingChangeTimerQueueTimer(timerqueue.rawAddress, timer.rawAddress, duetime.toInt(), period.toInt())

public actual fun closePrivateNamespace(handle: Handle, flags: UInt): Boolean =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingClosePrivateNamespace(handle.rawAddress, flags.toInt())

public actual fun closeThreadpool(ptpp: PtpPool) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCloseThreadpool(ptpp)
}

public actual fun closeThreadpoolCleanupGroup(ptpcg: PtpCleanupGroup) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroup(ptpcg)
}

public actual fun closeThreadpoolCleanupGroupMembers(ptpcg: PtpCleanupGroup, fcancelpendingcallbacks: Bool, pvcleanupcontext: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCloseThreadpoolCleanupGroupMembers(ptpcg, fcancelpendingcallbacks, pvcleanupcontext.rawAddress)
}

public actual fun closeThreadpoolIo(pio: PtpIo) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCloseThreadpoolIo(pio)
}

public actual fun closeThreadpoolTimer(pti: PtpTimer) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCloseThreadpoolTimer(pti)
}

public actual fun closeThreadpoolWait(pwa: PtpWait) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCloseThreadpoolWait(pwa)
}

public actual fun closeThreadpoolWork(pwk: PtpWork) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCloseThreadpoolWork(pwk)
}

public actual fun convertFiberToThread(): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingConvertFiberToThread()

public actual fun convertThreadToFiber(lpparameter: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingConvertThreadToFiber(lpparameter.rawAddress))

public actual fun convertThreadToFiberEx(lpparameter: ConstPtr, dwflags: UInt): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingConvertThreadToFiberEx(lpparameter.rawAddress, dwflags.toInt()))

public actual fun createBoundaryDescriptorA(name: Pcstr, flags: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorA(name.rawAddress, flags.toInt()))

public actual fun createBoundaryDescriptorW(name: Pcwstr, flags: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateBoundaryDescriptorW(name.rawAddress, flags.toInt()))

public actual fun createEventA(lpeventattributes: ConstPtr, bmanualreset: Bool, binitialstate: Bool, lpname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateEventA(lpeventattributes.rawAddress, bmanualreset, binitialstate, lpname.rawAddress))

public actual fun createEventExA(lpeventattributes: ConstPtr, lpname: Pcstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateEventExA(lpeventattributes.rawAddress, lpname.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt()))

public actual fun createEventExW(lpeventattributes: ConstPtr, lpname: Pcwstr, dwflags: CreateEvent, dwdesiredaccess: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateEventExW(lpeventattributes.rawAddress, lpname.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt()))

public actual fun createEventW(lpeventattributes: ConstPtr, bmanualreset: Bool, binitialstate: Bool, lpname: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateEventW(lpeventattributes.rawAddress, bmanualreset, binitialstate, lpname.rawAddress))

public actual fun createFiber(dwstacksize: ULong, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateFiber(dwstacksize.toLong(), 0L, lpparameter.rawAddress))

public actual fun createFiberEx(dwstackcommitsize: ULong, dwstackreservesize: ULong, dwflags: UInt, lpstartaddress: LpfiberStartRoutine, lpparameter: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateFiberEx(dwstackcommitsize.toLong(), dwstackreservesize.toLong(), dwflags.toInt(), 0L, lpparameter.rawAddress))

public actual fun createMutexA(lpmutexattributes: ConstPtr, binitialowner: Bool, lpname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateMutexA(lpmutexattributes.rawAddress, binitialowner, lpname.rawAddress))

public actual fun createMutexExA(lpmutexattributes: ConstPtr, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateMutexExA(lpmutexattributes.rawAddress, lpname.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt()))

public actual fun createMutexExW(lpmutexattributes: ConstPtr, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateMutexExW(lpmutexattributes.rawAddress, lpname.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt()))

public actual fun createMutexW(lpmutexattributes: ConstPtr, binitialowner: Bool, lpname: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateMutexW(lpmutexattributes.rawAddress, binitialowner, lpname.rawAddress))

public actual fun createPrivateNamespaceA(lpprivatenamespaceattributes: ConstPtr, lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceA(lpprivatenamespaceattributes.rawAddress, lpboundarydescriptor.rawAddress, lpaliasprefix.rawAddress))

public actual fun createPrivateNamespaceW(lpprivatenamespaceattributes: ConstPtr, lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreatePrivateNamespaceW(lpprivatenamespaceattributes.rawAddress, lpboundarydescriptor.rawAddress, lpaliasprefix.rawAddress))

public actual fun createProcessA(lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateProcessA(lpapplicationname.rawAddress, lpcommandline.rawAddress, lpprocessattributes.rawAddress, lpthreadattributes.rawAddress, binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress, lpcurrentdirectory.rawAddress, lpstartupinfo.rawAddress, lpprocessinformation.rawAddress)

public actual fun createProcessAsUserA(htoken: Handle, lpapplicationname: Pcstr, lpcommandline: Pstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateProcessAsUserA(htoken.rawAddress, lpapplicationname.rawAddress, lpcommandline.rawAddress, lpprocessattributes.rawAddress, lpthreadattributes.rawAddress, binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress, lpcurrentdirectory.rawAddress, lpstartupinfo.rawAddress, lpprocessinformation.rawAddress)

public actual fun createProcessAsUserW(htoken: Handle, lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateProcessAsUserW(htoken.rawAddress, lpapplicationname.rawAddress, lpcommandline.rawAddress, lpprocessattributes.rawAddress, lpthreadattributes.rawAddress, binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress, lpcurrentdirectory.rawAddress, lpstartupinfo.rawAddress, lpprocessinformation.rawAddress)

public actual fun createProcessW(lpapplicationname: Pcwstr, lpcommandline: Pwstr, lpprocessattributes: ConstPtr, lpthreadattributes: ConstPtr, binherithandles: Bool, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateProcessW(lpapplicationname.rawAddress, lpcommandline.rawAddress, lpprocessattributes.rawAddress, lpthreadattributes.rawAddress, binherithandles, dwcreationflags.toInt(), lpenvironment.rawAddress, lpcurrentdirectory.rawAddress, lpstartupinfo.rawAddress, lpprocessinformation.rawAddress)

public actual fun createProcessWithLogonW(lpusername: Pcwstr, lpdomain: Pcwstr, lppassword: Pcwstr, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateProcessWithLogonW(lpusername.rawAddress, lpdomain.rawAddress, lppassword.rawAddress, dwlogonflags.toInt(), lpapplicationname.rawAddress, lpcommandline.rawAddress, dwcreationflags.toInt(), lpenvironment.rawAddress, lpcurrentdirectory.rawAddress, lpstartupinfo.rawAddress, lpprocessinformation.rawAddress)

public actual fun createProcessWithTokenW(htoken: Handle, dwlogonflags: CreateProcessLogonFlags, lpapplicationname: Pcwstr, lpcommandline: Pwstr, dwcreationflags: ProcessCreationFlags, lpenvironment: ConstPtr, lpcurrentdirectory: Pcwstr, lpstartupinfo: ConstPtr, lpprocessinformation: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateProcessWithTokenW(htoken.rawAddress, dwlogonflags.toInt(), lpapplicationname.rawAddress, lpcommandline.rawAddress, dwcreationflags.toInt(), lpenvironment.rawAddress, lpcurrentdirectory.rawAddress, lpstartupinfo.rawAddress, lpprocessinformation.rawAddress)

public actual fun createRemoteThread(hprocess: Handle, lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: UInt, lpthreadid: MutPtr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateRemoteThread(hprocess.rawAddress, lpthreadattributes.rawAddress, dwstacksize.toLong(), 0L, lpparameter.rawAddress, dwcreationflags.toInt(), lpthreadid.rawAddress))

public actual fun createRemoteThreadEx(hprocess: Handle, lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: UInt, lpattributelist: LpprocThreadAttributeList, lpthreadid: MutPtr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateRemoteThreadEx(hprocess.rawAddress, lpthreadattributes.rawAddress, dwstacksize.toLong(), 0L, lpparameter.rawAddress, dwcreationflags.toInt(), lpattributelist.rawAddress, lpthreadid.rawAddress))

public actual fun createSemaphoreA(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateSemaphoreA(lpsemaphoreattributes.rawAddress, linitialcount, lmaximumcount, lpname.rawAddress))

public actual fun createSemaphoreExA(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateSemaphoreExA(lpsemaphoreattributes.rawAddress, linitialcount, lmaximumcount, lpname.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt()))

public actual fun createSemaphoreExW(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateSemaphoreExW(lpsemaphoreattributes.rawAddress, linitialcount, lmaximumcount, lpname.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt()))

public actual fun createSemaphoreW(lpsemaphoreattributes: ConstPtr, linitialcount: Int, lmaximumcount: Int, lpname: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateSemaphoreW(lpsemaphoreattributes.rawAddress, linitialcount, lmaximumcount, lpname.rawAddress))

public actual fun createThread(lpthreadattributes: ConstPtr, dwstacksize: ULong, lpstartaddress: LpthreadStartRoutine, lpparameter: ConstPtr, dwcreationflags: ThreadCreationFlags, lpthreadid: MutPtr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateThread(lpthreadattributes.rawAddress, dwstacksize.toLong(), 0L, lpparameter.rawAddress, dwcreationflags.toInt(), lpthreadid.rawAddress))

public actual fun createThreadpool(reserved: ConstPtr): PtpPool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateThreadpool(reserved.rawAddress)

public actual fun createThreadpoolCleanupGroup(): PtpCleanupGroup =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateThreadpoolCleanupGroup()

public actual fun createThreadpoolIo(fl: Handle, pfnio: PtpWin32IoCallback, pv: MutPtr, pcbe: ConstPtr): PtpIo =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateThreadpoolIo(fl.rawAddress, 0L, pv.rawAddress, pcbe.rawAddress)

public actual fun createThreadpoolTimer(pfnti: PtpTimerCallback, pv: MutPtr, pcbe: ConstPtr): PtpTimer =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateThreadpoolTimer(0L, pv.rawAddress, pcbe.rawAddress)

public actual fun createThreadpoolWait(pfnwa: PtpWaitCallback, pv: MutPtr, pcbe: ConstPtr): PtpWait =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateThreadpoolWait(0L, pv.rawAddress, pcbe.rawAddress)

public actual fun createThreadpoolWork(pfnwk: PtpWorkCallback, pv: MutPtr, pcbe: ConstPtr): PtpWork =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateThreadpoolWork(0L, pv.rawAddress, pcbe.rawAddress)

public actual fun createTimerQueue(): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateTimerQueue())

public actual fun createTimerQueueTimer(phnewtimer: MutPtr, timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr, duetime: UInt, period: UInt, flags: WorkerThreadFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateTimerQueueTimer(phnewtimer.rawAddress, timerqueue.rawAddress, 0L, parameter.rawAddress, duetime.toInt(), period.toInt(), flags.toInt())

public actual fun createUmsCompletionList(umscompletionlist: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateUmsCompletionList(umscompletionlist.rawAddress)

public actual fun createUmsThreadContext(lpumsthread: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateUmsThreadContext(lpumsthread.rawAddress)

public actual fun createWaitableTimerA(lptimerattributes: ConstPtr, bmanualreset: Bool, lptimername: Pcstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateWaitableTimerA(lptimerattributes.rawAddress, bmanualreset, lptimername.rawAddress))

public actual fun createWaitableTimerExA(lptimerattributes: ConstPtr, lptimername: Pcstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateWaitableTimerExA(lptimerattributes.rawAddress, lptimername.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt()))

public actual fun createWaitableTimerExW(lptimerattributes: ConstPtr, lptimername: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateWaitableTimerExW(lptimerattributes.rawAddress, lptimername.rawAddress, dwflags.toInt(), dwdesiredaccess.toInt()))

public actual fun createWaitableTimerW(lptimerattributes: ConstPtr, bmanualreset: Bool, lptimername: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingCreateWaitableTimerW(lptimerattributes.rawAddress, bmanualreset, lptimername.rawAddress))

public actual fun deleteBoundaryDescriptor(boundarydescriptor: Handle) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDeleteBoundaryDescriptor(boundarydescriptor.rawAddress)
}

public actual fun deleteCriticalSection(lpcriticalsection: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDeleteCriticalSection(lpcriticalsection.rawAddress)
}

public actual fun deleteFiber(lpfiber: ConstPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDeleteFiber(lpfiber.rawAddress)
}

public actual fun deleteProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDeleteProcThreadAttributeList(lpattributelist.rawAddress)
}

public actual fun deleteSynchronizationBarrier(lpbarrier: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDeleteSynchronizationBarrier(lpbarrier.rawAddress)

public actual fun deleteTimerQueue(timerqueue: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDeleteTimerQueue(timerqueue.rawAddress)

public actual fun deleteTimerQueueEx(timerqueue: Handle, completionevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDeleteTimerQueueEx(timerqueue.rawAddress, completionevent.rawAddress)

public actual fun deleteTimerQueueTimer(timerqueue: Handle, timer: Handle, completionevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDeleteTimerQueueTimer(timerqueue.rawAddress, timer.rawAddress, completionevent.rawAddress)

public actual fun deleteUmsCompletionList(umscompletionlist: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDeleteUmsCompletionList(umscompletionlist.rawAddress)

public actual fun deleteUmsThreadContext(umsthread: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDeleteUmsThreadContext(umsthread.rawAddress)

public actual fun dequeueUmsCompletionListItems(umscompletionlist: ConstPtr, waittimeout: UInt, umsthreadlist: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDequeueUmsCompletionListItems(umscompletionlist.rawAddress, waittimeout.toInt(), umsthreadlist.rawAddress)

public actual fun disassociateCurrentThreadFromCallback(pci: PtpCallbackInstance) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingDisassociateCurrentThreadFromCallback(pci)
}

public actual fun enterCriticalSection(lpcriticalsection: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingEnterCriticalSection(lpcriticalsection.rawAddress)
}

public actual fun enterSynchronizationBarrier(lpbarrier: MutPtr, dwflags: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingEnterSynchronizationBarrier(lpbarrier.rawAddress, dwflags.toInt())

public actual fun enterUmsSchedulingMode(schedulerstartupinfo: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingEnterUmsSchedulingMode(schedulerstartupinfo.rawAddress)

public actual fun executeUmsThread(umsthread: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingExecuteUmsThread(umsthread.rawAddress)

public actual fun exitProcess(uexitcode: UInt): Nothing {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingExitProcess(uexitcode.toInt())
    error("Unreachable noreturn C function exitProcess")
}

public actual fun exitThread(dwexitcode: UInt): Nothing {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingExitThread(dwexitcode.toInt())
    error("Unreachable noreturn C function exitThread")
}

public actual fun flsAlloc(lpcallback: PflsCallbackFunction): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingFlsAlloc(0L).toUInt()

public actual fun flsFree(dwflsindex: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingFlsFree(dwflsindex.toInt())

public actual fun flsGetValue(dwflsindex: UInt): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingFlsGetValue(dwflsindex.toInt()))

public actual fun flsSetValue(dwflsindex: UInt, lpflsdata: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingFlsSetValue(dwflsindex.toInt(), lpflsdata.rawAddress)

public actual fun flushProcessWriteBuffers() {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingFlushProcessWriteBuffers()
}

public actual fun freeLibraryWhenCallbackReturns(pci: PtpCallbackInstance, mod: Hmodule) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingFreeLibraryWhenCallbackReturns(pci, mod.rawAddress)
}

public actual fun getActiveProcessorCount(groupnumber: UShort): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetActiveProcessorCount(groupnumber.toShort()).toUInt()

public actual fun getActiveProcessorGroupCount(): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetActiveProcessorGroupCount().toUShort()

public actual fun getCurrentProcess(): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetCurrentProcess())

public actual fun getCurrentProcessId(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetCurrentProcessId().toUInt()

public actual fun getCurrentProcessorNumber(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumber().toUInt()

public actual fun getCurrentProcessorNumberEx(procnumber: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetCurrentProcessorNumberEx(procnumber.rawAddress)
}

public actual fun getCurrentThread(): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetCurrentThread())

public actual fun getCurrentThreadId(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetCurrentThreadId().toUInt()

public actual fun getCurrentThreadStackLimits(lowlimit: MutPtr, highlimit: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetCurrentThreadStackLimits(lowlimit.rawAddress, highlimit.rawAddress)
}

public actual fun getCurrentUmsThread(): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetCurrentUmsThread())

public actual fun getExitCodeProcess(hprocess: Handle, lpexitcode: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetExitCodeProcess(hprocess.rawAddress, lpexitcode.rawAddress)

public actual fun getExitCodeThread(hthread: Handle, lpexitcode: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetExitCodeThread(hthread.rawAddress, lpexitcode.rawAddress)

public actual fun getGuiResources(hprocess: Handle, uiflags: GetGuiResourcesFlags): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetGuiResources(hprocess.rawAddress, uiflags.toInt()).toUInt()

public actual fun getMachineTypeAttributes(machine: UShort, machinetypeattributes: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetMachineTypeAttributes(machine.toShort(), machinetypeattributes.rawAddress)

public actual fun getMaximumProcessorCount(groupnumber: UShort): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetMaximumProcessorCount(groupnumber.toShort()).toUInt()

public actual fun getMaximumProcessorGroupCount(): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetMaximumProcessorGroupCount().toUShort()

public actual fun getNextUmsListItem(umscontext: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNextUmsListItem(umscontext.rawAddress))

public actual fun getNumaAvailableMemoryNode(node: UByte, availablebytes: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNode(node.toByte(), availablebytes.rawAddress)

public actual fun getNumaAvailableMemoryNodeEx(node: UShort, availablebytes: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaAvailableMemoryNodeEx(node.toShort(), availablebytes.rawAddress)

public actual fun getNumaHighestNodeNumber(highestnodenumber: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaHighestNodeNumber(highestnodenumber.rawAddress)

public actual fun getNumaNodeNumberFromHandle(hfile: Handle, nodenumber: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaNodeNumberFromHandle(hfile.rawAddress, nodenumber.rawAddress)

public actual fun getNumaNodeProcessorMask(node: UByte, processormask: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask(node.toByte(), processormask.rawAddress)

public actual fun getNumaNodeProcessorMask2(nodenumber: UShort, processormasks: MutPtr, processormaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMask2(nodenumber.toShort(), processormasks.rawAddress, processormaskcount.toShort(), requiredmaskcount.rawAddress)

public actual fun getNumaNodeProcessorMaskEx(node: UShort, processormask: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaNodeProcessorMaskEx(node.toShort(), processormask.rawAddress)

public actual fun getNumaProcessorNode(processor: UByte, nodenumber: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaProcessorNode(processor.toByte(), nodenumber.rawAddress)

public actual fun getNumaProcessorNodeEx(processor: ConstPtr, nodenumber: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaProcessorNodeEx(processor.rawAddress, nodenumber.rawAddress)

public actual fun getNumaProximityNode(proximityid: UInt, nodenumber: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaProximityNode(proximityid.toInt(), nodenumber.rawAddress)

public actual fun getNumaProximityNodeEx(proximityid: UInt, nodenumber: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetNumaProximityNodeEx(proximityid.toInt(), nodenumber.rawAddress)

public actual fun getPriorityClass(hprocess: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetPriorityClass(hprocess.rawAddress).toUInt()

public actual fun getProcessAffinityMask(hprocess: Handle, lpprocessaffinitymask: MutPtr, lpsystemaffinitymask: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessAffinityMask(hprocess.rawAddress, lpprocessaffinitymask.rawAddress, lpsystemaffinitymask.rawAddress)

public actual fun getProcessDEPPolicy(hprocess: Handle, lpflags: MutPtr, lppermanent: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessDEPPolicy(hprocess.rawAddress, lpflags.rawAddress, lppermanent.rawAddress)

public actual fun getProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: MutPtr, cpusetmaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSetMasks(process.rawAddress, cpusetmasks.rawAddress, cpusetmaskcount.toShort(), requiredmaskcount.rawAddress)

public actual fun getProcessDefaultCpuSets(process: Handle, cpusetids: MutPtr, cpusetidcount: UInt, requiredidcount: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessDefaultCpuSets(process.rawAddress, cpusetids.rawAddress, cpusetidcount.toInt(), requiredidcount.rawAddress)

public actual fun getProcessGroupAffinity(hprocess: Handle, groupcount: MutPtr, grouparray: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessGroupAffinity(hprocess.rawAddress, groupcount.rawAddress, grouparray.rawAddress)

public actual fun getProcessHandleCount(hprocess: Handle, pdwhandlecount: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessHandleCount(hprocess.rawAddress, pdwhandlecount.rawAddress)

public actual fun getProcessHandleFromHwnd(hwnd: Hwnd): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessHandleFromHwnd(hwnd.rawAddress))

public actual fun getProcessId(process: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessId(process.rawAddress).toUInt()

public actual fun getProcessIdOfThread(thread: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessIdOfThread(thread.rawAddress).toUInt()

public actual fun getProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: MutPtr, processinformationsize: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessInformation(hprocess.rawAddress, processinformationclass, processinformation.rawAddress, processinformationsize.toInt())

public actual fun getProcessIoCounters(hprocess: Handle, lpiocounters: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessIoCounters(hprocess.rawAddress, lpiocounters.rawAddress)

public actual fun getProcessMitigationPolicy(hprocess: Handle, mitigationpolicy: ProcessMitigationPolicy, lpbuffer: MutPtr, dwlength: ULong): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessMitigationPolicy(hprocess.rawAddress, mitigationpolicy, lpbuffer.rawAddress, dwlength.toLong())

public actual fun getProcessPriorityBoost(hprocess: Handle, pdisablepriorityboost: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessPriorityBoost(hprocess.rawAddress, pdisablepriorityboost.rawAddress)

public actual fun getProcessShutdownParameters(lpdwlevel: MutPtr, lpdwflags: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessShutdownParameters(lpdwlevel.rawAddress, lpdwflags.rawAddress)

public actual fun getProcessTimes(hprocess: Handle, lpcreationtime: MutPtr, lpexittime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessTimes(hprocess.rawAddress, lpcreationtime.rawAddress, lpexittime.rawAddress, lpkerneltime.rawAddress, lpusertime.rawAddress)

public actual fun getProcessVersion(processid: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessVersion(processid.toInt()).toUInt()

public actual fun getProcessWorkingSetSize(hprocess: Handle, lpminimumworkingsetsize: MutPtr, lpmaximumworkingsetsize: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetProcessWorkingSetSize(hprocess.rawAddress, lpminimumworkingsetsize.rawAddress, lpmaximumworkingsetsize.rawAddress)

public actual fun getStartupInfoA(lpstartupinfo: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetStartupInfoA(lpstartupinfo.rawAddress)
}

public actual fun getStartupInfoW(lpstartupinfo: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetStartupInfoW(lpstartupinfo.rawAddress)
}

public actual fun getSystemTimes(lpidletime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetSystemTimes(lpidletime.rawAddress, lpkerneltime.rawAddress, lpusertime.rawAddress)

public actual fun getThreadDescription(hthread: Handle, ppszthreaddescription: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadDescription(hthread.rawAddress, ppszthreaddescription.rawAddress)

public actual fun getThreadGroupAffinity(hthread: Handle, groupaffinity: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadGroupAffinity(hthread.rawAddress, groupaffinity.rawAddress)

public actual fun getThreadIOPendingFlag(hthread: Handle, lpioispending: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadIOPendingFlag(hthread.rawAddress, lpioispending.rawAddress)

public actual fun getThreadId(thread: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadId(thread.rawAddress).toUInt()

public actual fun getThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadIdealProcessorEx(hthread.rawAddress, lpidealprocessor.rawAddress)

public actual fun getThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: MutPtr, threadinformationsize: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadInformation(hthread.rawAddress, threadinformationclass, threadinformation.rawAddress, threadinformationsize.toInt())

public actual fun getThreadPriority(hthread: Handle): Int =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadPriority(hthread.rawAddress)

public actual fun getThreadPriorityBoost(hthread: Handle, pdisablepriorityboost: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadPriorityBoost(hthread.rawAddress, pdisablepriorityboost.rawAddress)

public actual fun getThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: MutPtr, cpusetmaskcount: UShort, requiredmaskcount: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSetMasks(thread.rawAddress, cpusetmasks.rawAddress, cpusetmaskcount.toShort(), requiredmaskcount.rawAddress)

public actual fun getThreadSelectedCpuSets(thread: Handle, cpusetids: MutPtr, cpusetidcount: UInt, requiredidcount: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadSelectedCpuSets(thread.rawAddress, cpusetids.rawAddress, cpusetidcount.toInt(), requiredidcount.rawAddress)

public actual fun getThreadTimes(hthread: Handle, lpcreationtime: MutPtr, lpexittime: MutPtr, lpkerneltime: MutPtr, lpusertime: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetThreadTimes(hthread.rawAddress, lpcreationtime.rawAddress, lpexittime.rawAddress, lpkerneltime.rawAddress, lpusertime.rawAddress)

public actual fun getUmsCompletionListEvent(umscompletionlist: ConstPtr, umscompletionevent: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetUmsCompletionListEvent(umscompletionlist.rawAddress, umscompletionevent.rawAddress)

public actual fun getUmsSystemThreadInformation(threadhandle: Handle, systemthreadinfo: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingGetUmsSystemThreadInformation(threadhandle.rawAddress, systemthreadinfo.rawAddress)

public actual fun initOnceBeginInitialize(lpinitonce: MutPtr, dwflags: UInt, fpending: MutPtr, lpcontext: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitOnceBeginInitialize(lpinitonce.rawAddress, dwflags.toInt(), fpending.rawAddress, lpcontext.rawAddress)

public actual fun initOnceComplete(lpinitonce: MutPtr, dwflags: UInt, lpcontext: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitOnceComplete(lpinitonce.rawAddress, dwflags.toInt(), lpcontext.rawAddress)

public actual fun initOnceExecuteOnce(initonce: MutPtr, initfn: PinitOnceFn, parameter: MutPtr, context: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitOnceExecuteOnce(initonce.rawAddress, 0L, parameter.rawAddress, context.rawAddress)

public actual fun initOnceInitialize(initonce: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitOnceInitialize(initonce.rawAddress)
}

public actual fun initializeConditionVariable(conditionvariable: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitializeConditionVariable(conditionvariable.rawAddress)
}

public actual fun initializeCriticalSection(lpcriticalsection: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitializeCriticalSection(lpcriticalsection.rawAddress)
}

public actual fun initializeCriticalSectionAndSpinCount(lpcriticalsection: MutPtr, dwspincount: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitializeCriticalSectionAndSpinCount(lpcriticalsection.rawAddress, dwspincount.toInt())

public actual fun initializeCriticalSectionEx(lpcriticalsection: MutPtr, dwspincount: UInt, flags: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitializeCriticalSectionEx(lpcriticalsection.rawAddress, dwspincount.toInt(), flags.toInt())

public actual fun initializeProcThreadAttributeList(lpattributelist: LpprocThreadAttributeList, dwattributecount: UInt, dwflags: UInt, lpsize: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitializeProcThreadAttributeList(lpattributelist.rawAddress, dwattributecount.toInt(), dwflags.toInt(), lpsize.rawAddress)

public actual fun initializeSListHead(listhead: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitializeSListHead(listhead.rawAddress)
}

public actual fun initializeSRWLock(srwlock: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitializeSRWLock(srwlock.rawAddress)
}

public actual fun initializeSynchronizationBarrier(lpbarrier: MutPtr, ltotalthreads: Int, lspincount: Int): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInitializeSynchronizationBarrier(lpbarrier.rawAddress, ltotalthreads, lspincount)

public actual fun interlockedFlushSList(listhead: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInterlockedFlushSList(listhead.rawAddress))

public actual fun interlockedPopEntrySList(listhead: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInterlockedPopEntrySList(listhead.rawAddress))

public actual fun interlockedPushEntrySList(listhead: MutPtr, listentry: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInterlockedPushEntrySList(listhead.rawAddress, listentry.rawAddress))

public actual fun interlockedPushListSListEx(listhead: MutPtr, list: MutPtr, listend: MutPtr, count: UInt): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingInterlockedPushListSListEx(listhead.rawAddress, list.rawAddress, listend.rawAddress, count.toInt()))

public actual fun isImmersiveProcess(hprocess: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingIsImmersiveProcess(hprocess.rawAddress)

public actual fun isProcessCritical(hprocess: Handle, critical: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingIsProcessCritical(hprocess.rawAddress, critical.rawAddress)

public actual fun isProcessorFeaturePresent(processorfeature: ProcessorFeatureId): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingIsProcessorFeaturePresent(processorfeature.toInt())

public actual fun isThreadAFiber(): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingIsThreadAFiber()

public actual fun isThreadpoolTimerSet(pti: PtpTimer): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingIsThreadpoolTimerSet(pti)

public actual fun isWow64Process(hprocess: Handle, wow64process: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingIsWow64Process(hprocess.rawAddress, wow64process.rawAddress)

public actual fun isWow64Process2(hprocess: Handle, pprocessmachine: MutPtr, pnativemachine: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingIsWow64Process2(hprocess.rawAddress, pprocessmachine.rawAddress, pnativemachine.rawAddress)

public actual fun leaveCriticalSection(lpcriticalsection: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingLeaveCriticalSection(lpcriticalsection.rawAddress)
}

public actual fun leaveCriticalSectionWhenCallbackReturns(pci: PtpCallbackInstance, pcs: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingLeaveCriticalSectionWhenCallbackReturns(pci, pcs.rawAddress)
}

public actual fun openEventA(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenEventA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress))

public actual fun openEventW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenEventW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress))

public actual fun openMutexW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenMutexW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress))

public actual fun openPrivateNamespaceA(lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceA(lpboundarydescriptor.rawAddress, lpaliasprefix.rawAddress))

public actual fun openPrivateNamespaceW(lpboundarydescriptor: ConstPtr, lpaliasprefix: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenPrivateNamespaceW(lpboundarydescriptor.rawAddress, lpaliasprefix.rawAddress))

public actual fun openProcess(dwdesiredaccess: ProcessAccessRights, binherithandle: Bool, dwprocessid: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenProcess(dwdesiredaccess.toInt(), binherithandle, dwprocessid.toInt()))

public actual fun openProcessToken(processhandle: Handle, desiredaccess: TokenAccessMask, tokenhandle: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenProcessToken(processhandle.rawAddress, desiredaccess.toInt(), tokenhandle.rawAddress)

public actual fun openSemaphoreW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lpname: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenSemaphoreW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress))

public actual fun openThread(dwdesiredaccess: ThreadAccessRights, binherithandle: Bool, dwthreadid: UInt): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenThread(dwdesiredaccess.toInt(), binherithandle, dwthreadid.toInt()))

public actual fun openThreadToken(threadhandle: Handle, desiredaccess: TokenAccessMask, openasself: Bool, tokenhandle: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenThreadToken(threadhandle.rawAddress, desiredaccess.toInt(), openasself, tokenhandle.rawAddress)

public actual fun openWaitableTimerA(dwdesiredaccess: UInt, binherithandle: Bool, lptimername: Pcstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenWaitableTimerA(dwdesiredaccess.toInt(), binherithandle, lptimername.rawAddress))

public actual fun openWaitableTimerW(dwdesiredaccess: SynchronizationAccessRights, binherithandle: Bool, lptimername: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingOpenWaitableTimerW(dwdesiredaccess.toInt(), binherithandle, lptimername.rawAddress))

public actual fun pulseEvent(hevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingPulseEvent(hevent.rawAddress)

public actual fun queryDepthSList(listhead: ConstPtr): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingQueryDepthSList(listhead.rawAddress).toUShort()

public actual fun queryFullProcessImageNameA(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pstr, lpdwsize: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameA(hprocess.rawAddress, dwflags.toInt(), lpexename.rawAddress, lpdwsize.rawAddress)

public actual fun queryFullProcessImageNameW(hprocess: Handle, dwflags: ProcessNameFormat, lpexename: Pwstr, lpdwsize: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingQueryFullProcessImageNameW(hprocess.rawAddress, dwflags.toInt(), lpexename.rawAddress, lpdwsize.rawAddress)

public actual fun queryProcessAffinityUpdateMode(hprocess: Handle, lpdwflags: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingQueryProcessAffinityUpdateMode(hprocess.rawAddress, lpdwflags.rawAddress)

public actual fun queryProtectedPolicy(policyguid: ConstPtr, policyvalue: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingQueryProtectedPolicy(policyguid.rawAddress, policyvalue.rawAddress)

public actual fun queryThreadpoolStackInformation(ptpp: PtpPool, ptpsi: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingQueryThreadpoolStackInformation(ptpp, ptpsi.rawAddress)

public actual fun queryUmsThreadInformation(umsthread: ConstPtr, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: MutPtr, umsthreadinformationlength: UInt, returnlength: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingQueryUmsThreadInformation(umsthread.rawAddress, umsthreadinfoclass, umsthreadinformation.rawAddress, umsthreadinformationlength.toInt(), returnlength.rawAddress)

public actual fun queueUserAPC(pfnapc: Papcfunc, hthread: Handle, dwdata: ULong): UInt =
    0u

public actual fun queueUserAPC2(apcroutine: Papcfunc, thread: Handle, data: ULong, flags: QueueUserApcFlags): Bool =
    0

public actual fun queueUserWorkItem(function: LpthreadStartRoutine, context: ConstPtr, flags: WorkerThreadFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingQueueUserWorkItem(0L, context.rawAddress, flags.toInt())

public actual fun registerWaitForSingleObject(phnewwaitobject: MutPtr, hobject: Handle, callback: Waitortimercallback, context: ConstPtr, dwmilliseconds: UInt, dwflags: WorkerThreadFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRegisterWaitForSingleObject(phnewwaitobject.rawAddress, hobject.rawAddress, 0L, context.rawAddress, dwmilliseconds.toInt(), dwflags.toInt())

public actual fun releaseMutex(hmutex: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingReleaseMutex(hmutex.rawAddress)

public actual fun releaseMutexWhenCallbackReturns(pci: PtpCallbackInstance, mut: Handle) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingReleaseMutexWhenCallbackReturns(pci, mut.rawAddress)
}

public actual fun releaseSRWLockExclusive(srwlock: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingReleaseSRWLockExclusive(srwlock.rawAddress)
}

public actual fun releaseSRWLockShared(srwlock: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingReleaseSRWLockShared(srwlock.rawAddress)
}

public actual fun releaseSemaphore(hsemaphore: Handle, lreleasecount: Int, lppreviouscount: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingReleaseSemaphore(hsemaphore.rawAddress, lreleasecount, lppreviouscount.rawAddress)

public actual fun releaseSemaphoreWhenCallbackReturns(pci: PtpCallbackInstance, sem: Handle, crel: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingReleaseSemaphoreWhenCallbackReturns(pci, sem.rawAddress, crel.toInt())
}

public actual fun resetEvent(hevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingResetEvent(hevent.rawAddress)

public actual fun resumeThread(hthread: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingResumeThread(hthread.rawAddress).toUInt()

public actual fun rtwqAddPeriodicCallback(callback: Rtwqperiodiccallback, context: MutPtr, key: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqAddPeriodicCallback(0L, context.rawAddress, key.rawAddress)

public actual fun rtwqAllocateSerialWorkQueue(workqueueidin: UInt, workqueueidout: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqAllocateSerialWorkQueue(workqueueidin.toInt(), workqueueidout.rawAddress)

public actual fun rtwqAllocateWorkQueue(workqueuetype: RtwqWorkqueueType, workqueueid: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqAllocateWorkQueue(workqueuetype, workqueueid.rawAddress)

public actual fun rtwqBeginRegisterWorkQueueWithMMCSS(workqueueid: UInt, usageclass: Pcwstr, dwtaskid: UInt, lpriority: Int, donecallback: MutPtr, donestate: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqBeginRegisterWorkQueueWithMMCSS(workqueueid.toInt(), usageclass.rawAddress, dwtaskid.toInt(), lpriority, donecallback.rawAddress, donestate.rawAddress)

public actual fun rtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid: UInt, donecallback: MutPtr, donestate: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqBeginUnregisterWorkQueueWithMMCSS(workqueueid.toInt(), donecallback.rawAddress, donestate.rawAddress)

public actual fun rtwqCancelDeadline(prequest: Handle): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqCancelDeadline(prequest.rawAddress)

public actual fun rtwqCancelWorkItem(key: ULong): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqCancelWorkItem(key.toLong())

public actual fun rtwqCreateAsyncResult(appobject: MutPtr, callback: MutPtr, appstate: MutPtr, asyncresult: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqCreateAsyncResult(appobject.rawAddress, callback.rawAddress, appstate.rawAddress, asyncresult.rawAddress)

public actual fun rtwqEndRegisterWorkQueueWithMMCSS(result: MutPtr, taskid: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqEndRegisterWorkQueueWithMMCSS(result.rawAddress, taskid.rawAddress)

public actual fun rtwqGetWorkQueueMMCSSClass(workqueueid: UInt, usageclass: Pwstr, usageclasslength: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSClass(workqueueid.toInt(), usageclass.rawAddress, usageclasslength.rawAddress)

public actual fun rtwqGetWorkQueueMMCSSPriority(workqueueid: UInt, priority: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSPriority(workqueueid.toInt(), priority.rawAddress)

public actual fun rtwqGetWorkQueueMMCSSTaskId(workqueueid: UInt, taskid: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqGetWorkQueueMMCSSTaskId(workqueueid.toInt(), taskid.rawAddress)

public actual fun rtwqInvokeCallback(result: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqInvokeCallback(result.rawAddress)

public actual fun rtwqJoinWorkQueue(workqueueid: UInt, hfile: Handle, out: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqJoinWorkQueue(workqueueid.toInt(), hfile.rawAddress, out.rawAddress)

public actual fun rtwqLockPlatform(): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqLockPlatform()

public actual fun rtwqLockSharedWorkQueue(usageclass: Pcwstr, basepriority: Int, taskid: MutPtr, id: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqLockSharedWorkQueue(usageclass.rawAddress, basepriority, taskid.rawAddress, id.rawAddress)

public actual fun rtwqLockWorkQueue(workqueueid: UInt): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqLockWorkQueue(workqueueid.toInt())

public actual fun rtwqPutWaitingWorkItem(hevent: Handle, lpriority: Int, result: MutPtr, key: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqPutWaitingWorkItem(hevent.rawAddress, lpriority, result.rawAddress, key.rawAddress)

public actual fun rtwqPutWorkItem(dwqueue: UInt, lpriority: Int, result: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqPutWorkItem(dwqueue.toInt(), lpriority, result.rawAddress)

public actual fun rtwqRegisterPlatformEvents(platformevents: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformEvents(platformevents.rawAddress)

public actual fun rtwqRegisterPlatformWithMMCSS(usageclass: Pcwstr, taskid: MutPtr, lpriority: Int): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqRegisterPlatformWithMMCSS(usageclass.rawAddress, taskid.rawAddress, lpriority)

public actual fun rtwqRemovePeriodicCallback(dwkey: UInt): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqRemovePeriodicCallback(dwkey.toInt())

public actual fun rtwqScheduleWorkItem(result: MutPtr, timeout: Long, key: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqScheduleWorkItem(result.rawAddress, timeout, key.rawAddress)

public actual fun rtwqSetDeadline(workqueueid: UInt, deadlineinhns: Long, prequest: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqSetDeadline(workqueueid.toInt(), deadlineinhns, prequest.rawAddress)

public actual fun rtwqSetDeadline2(workqueueid: UInt, deadlineinhns: Long, predeadlineinhns: Long, prequest: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqSetDeadline2(workqueueid.toInt(), deadlineinhns, predeadlineinhns, prequest.rawAddress)

public actual fun rtwqSetLongRunning(workqueueid: UInt, enable: Bool): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqSetLongRunning(workqueueid.toInt(), enable)

public actual fun rtwqShutdown(): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqShutdown()

public actual fun rtwqStartup(): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqStartup()

public actual fun rtwqUnjoinWorkQueue(workqueueid: UInt, hfile: Handle): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqUnjoinWorkQueue(workqueueid.toInt(), hfile.rawAddress)

public actual fun rtwqUnlockPlatform(): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqUnlockPlatform()

public actual fun rtwqUnlockWorkQueue(workqueueid: UInt): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqUnlockWorkQueue(workqueueid.toInt())

public actual fun rtwqUnregisterPlatformEvents(platformevents: MutPtr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformEvents(platformevents.rawAddress)

public actual fun rtwqUnregisterPlatformFromMMCSS(): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingRtwqUnregisterPlatformFromMMCSS()

public actual fun setCriticalSectionSpinCount(lpcriticalsection: MutPtr, dwspincount: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetCriticalSectionSpinCount(lpcriticalsection.rawAddress, dwspincount.toInt()).toUInt()

public actual fun setEvent(hevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetEvent(hevent.rawAddress)

public actual fun setEventWhenCallbackReturns(pci: PtpCallbackInstance, evt: Handle) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetEventWhenCallbackReturns(pci, evt.rawAddress)
}

public actual fun setPriorityClass(hprocess: Handle, dwpriorityclass: ProcessCreationFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetPriorityClass(hprocess.rawAddress, dwpriorityclass.toInt())

public actual fun setProcessAffinityMask(hprocess: Handle, dwprocessaffinitymask: ULong): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessAffinityMask(hprocess.rawAddress, dwprocessaffinitymask.toLong())

public actual fun setProcessAffinityUpdateMode(hprocess: Handle, dwflags: ProcessAffinityAutoUpdateFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessAffinityUpdateMode(hprocess.rawAddress, dwflags.toInt())

public actual fun setProcessDEPPolicy(dwflags: ProcessDepFlags): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessDEPPolicy(dwflags.toInt())

public actual fun setProcessDefaultCpuSetMasks(process: Handle, cpusetmasks: ConstPtr, cpusetmaskcount: UShort): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSetMasks(process.rawAddress, cpusetmasks.rawAddress, cpusetmaskcount.toShort())

public actual fun setProcessDefaultCpuSets(process: Handle, cpusetids: ConstPtr, cpusetidcount: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessDefaultCpuSets(process.rawAddress, cpusetids.rawAddress, cpusetidcount.toInt())

public actual fun setProcessDynamicEHContinuationTargets(process: Handle, numberoftargets: UShort, targets: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessDynamicEHContinuationTargets(process.rawAddress, numberoftargets.toShort(), targets.rawAddress)

public actual fun setProcessDynamicEnforcedCetCompatibleRanges(process: Handle, numberofranges: UShort, ranges: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessDynamicEnforcedCetCompatibleRanges(process.rawAddress, numberofranges.toShort(), ranges.rawAddress)

public actual fun setProcessInformation(hprocess: Handle, processinformationclass: ProcessInformationClass, processinformation: ConstPtr, processinformationsize: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessInformation(hprocess.rawAddress, processinformationclass, processinformation.rawAddress, processinformationsize.toInt())

public actual fun setProcessMitigationPolicy(mitigationpolicy: ProcessMitigationPolicy, lpbuffer: ConstPtr, dwlength: ULong): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessMitigationPolicy(mitigationpolicy, lpbuffer.rawAddress, dwlength.toLong())

public actual fun setProcessPriorityBoost(hprocess: Handle, bdisablepriorityboost: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessPriorityBoost(hprocess.rawAddress, bdisablepriorityboost)

public actual fun setProcessRestrictionExemption(fenableexemption: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessRestrictionExemption(fenableexemption)

public actual fun setProcessShutdownParameters(dwlevel: UInt, dwflags: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessShutdownParameters(dwlevel.toInt(), dwflags.toInt())

public actual fun setProcessWorkingSetSize(hprocess: Handle, dwminimumworkingsetsize: ULong, dwmaximumworkingsetsize: ULong): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProcessWorkingSetSize(hprocess.rawAddress, dwminimumworkingsetsize.toLong(), dwmaximumworkingsetsize.toLong())

public actual fun setProtectedPolicy(policyguid: ConstPtr, policyvalue: ULong, oldpolicyvalue: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetProtectedPolicy(policyguid.rawAddress, policyvalue.toLong(), oldpolicyvalue.rawAddress)

public actual fun setThreadAffinityMask(hthread: Handle, dwthreadaffinitymask: ULong): ULong =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadAffinityMask(hthread.rawAddress, dwthreadaffinitymask.toLong()).toULong()

public actual fun setThreadDescription(hthread: Handle, lpthreaddescription: Pcwstr): Hresult =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadDescription(hthread.rawAddress, lpthreaddescription.rawAddress)

public actual fun setThreadGroupAffinity(hthread: Handle, groupaffinity: ConstPtr, previousgroupaffinity: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadGroupAffinity(hthread.rawAddress, groupaffinity.rawAddress, previousgroupaffinity.rawAddress)

public actual fun setThreadIdealProcessor(hthread: Handle, dwidealprocessor: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadIdealProcessor(hthread.rawAddress, dwidealprocessor.toInt()).toUInt()

public actual fun setThreadIdealProcessorEx(hthread: Handle, lpidealprocessor: ConstPtr, lppreviousidealprocessor: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadIdealProcessorEx(hthread.rawAddress, lpidealprocessor.rawAddress, lppreviousidealprocessor.rawAddress)

public actual fun setThreadInformation(hthread: Handle, threadinformationclass: ThreadInformationClass, threadinformation: ConstPtr, threadinformationsize: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadInformation(hthread.rawAddress, threadinformationclass, threadinformation.rawAddress, threadinformationsize.toInt())

public actual fun setThreadPriority(hthread: Handle, npriority: ThreadPriority): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadPriority(hthread.rawAddress, npriority)

public actual fun setThreadPriorityBoost(hthread: Handle, bdisablepriorityboost: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadPriorityBoost(hthread.rawAddress, bdisablepriorityboost)

public actual fun setThreadSelectedCpuSetMasks(thread: Handle, cpusetmasks: ConstPtr, cpusetmaskcount: UShort): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSetMasks(thread.rawAddress, cpusetmasks.rawAddress, cpusetmaskcount.toShort())

public actual fun setThreadSelectedCpuSets(thread: Handle, cpusetids: ConstPtr, cpusetidcount: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadSelectedCpuSets(thread.rawAddress, cpusetids.rawAddress, cpusetidcount.toInt())

public actual fun setThreadStackGuarantee(stacksizeinbytes: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadStackGuarantee(stacksizeinbytes.rawAddress)

public actual fun setThreadToken(thread: ConstPtr, token: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadToken(thread.rawAddress, token.rawAddress)

public actual fun setThreadpoolStackInformation(ptpp: PtpPool, ptpsi: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadpoolStackInformation(ptpp, ptpsi.rawAddress)

public actual fun setThreadpoolThreadMaximum(ptpp: PtpPool, cthrdmost: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMaximum(ptpp, cthrdmost.toInt())
}

public actual fun setThreadpoolThreadMinimum(ptpp: PtpPool, cthrdmic: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadpoolThreadMinimum(ptpp, cthrdmic.toInt())

public actual fun setThreadpoolTimer(pti: PtpTimer, pftduetime: ConstPtr, msperiod: UInt, mswindowlength: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadpoolTimer(pti, pftduetime.rawAddress, msperiod.toInt(), mswindowlength.toInt())
}

public actual fun setThreadpoolTimerEx(pti: PtpTimer, pftduetime: ConstPtr, msperiod: UInt, mswindowlength: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadpoolTimerEx(pti, pftduetime.rawAddress, msperiod.toInt(), mswindowlength.toInt())

public actual fun setThreadpoolWait(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadpoolWait(pwa, h.rawAddress, pfttimeout.rawAddress)
}

public actual fun setThreadpoolWaitEx(pwa: PtpWait, h: Handle, pfttimeout: ConstPtr, reserved: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetThreadpoolWaitEx(pwa, h.rawAddress, pfttimeout.rawAddress, reserved.rawAddress)

public actual fun setTimerQueueTimer(timerqueue: Handle, callback: Waitortimercallback, parameter: ConstPtr, duetime: UInt, period: UInt, preferio: Bool): Handle =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetTimerQueueTimer(timerqueue.rawAddress, 0L, parameter.rawAddress, duetime.toInt(), period.toInt(), preferio))

public actual fun setUmsThreadInformation(umsthread: ConstPtr, umsthreadinfoclass: UmsThreadInfoClass, umsthreadinformation: ConstPtr, umsthreadinformationlength: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetUmsThreadInformation(umsthread.rawAddress, umsthreadinfoclass, umsthreadinformation.rawAddress, umsthreadinformationlength.toInt())

public actual fun setWaitableTimer(htimer: Handle, lpduetime: ConstPtr, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr, fresume: Bool): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetWaitableTimer(htimer.rawAddress, lpduetime.rawAddress, lperiod, 0L, lpargtocompletionroutine.rawAddress, fresume)

public actual fun setWaitableTimerEx(htimer: Handle, lpduetime: ConstPtr, lperiod: Int, pfncompletionroutine: Ptimerapcroutine, lpargtocompletionroutine: ConstPtr, wakecontext: ConstPtr, tolerabledelay: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSetWaitableTimerEx(htimer.rawAddress, lpduetime.rawAddress, lperiod, 0L, lpargtocompletionroutine.rawAddress, wakecontext.rawAddress, tolerabledelay.toInt())

public actual fun signalObjectAndWait(hobjecttosignal: Handle, hobjecttowaiton: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSignalObjectAndWait(hobjecttosignal.rawAddress, hobjecttowaiton.rawAddress, dwmilliseconds.toInt(), balertable).toUInt()

public actual fun sleep(dwmilliseconds: UInt) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSleep(dwmilliseconds.toInt())
}

public actual fun sleepConditionVariableCS(conditionvariable: MutPtr, criticalsection: MutPtr, dwmilliseconds: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSleepConditionVariableCS(conditionvariable.rawAddress, criticalsection.rawAddress, dwmilliseconds.toInt())

public actual fun sleepConditionVariableSRW(conditionvariable: MutPtr, srwlock: MutPtr, dwmilliseconds: UInt, flags: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSleepConditionVariableSRW(conditionvariable.rawAddress, srwlock.rawAddress, dwmilliseconds.toInt(), flags.toInt())

public actual fun sleepEx(dwmilliseconds: UInt, balertable: Bool): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSleepEx(dwmilliseconds.toInt(), balertable).toUInt()

public actual fun startThreadpoolIo(pio: PtpIo) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingStartThreadpoolIo(pio)
}

public actual fun submitThreadpoolWork(pwk: PtpWork) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSubmitThreadpoolWork(pwk)
}

public actual fun suspendThread(hthread: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSuspendThread(hthread.rawAddress).toUInt()

public actual fun switchToFiber(lpfiber: ConstPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSwitchToFiber(lpfiber.rawAddress)
}

public actual fun switchToThread(): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingSwitchToThread()

public actual fun terminateProcess(hprocess: Handle, uexitcode: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingTerminateProcess(hprocess.rawAddress, uexitcode.toInt())

public actual fun terminateThread(hthread: Handle, dwexitcode: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingTerminateThread(hthread.rawAddress, dwexitcode.toInt())

public actual fun tlsAlloc(): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingTlsAlloc().toUInt()

public actual fun tlsFree(dwtlsindex: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingTlsFree(dwtlsindex.toInt())

public actual fun tlsGetValue(dwtlsindex: UInt): MutPtr =
    MutPtr(WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingTlsGetValue(dwtlsindex.toInt()))

public actual fun tlsSetValue(dwtlsindex: UInt, lptlsvalue: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingTlsSetValue(dwtlsindex.toInt(), lptlsvalue.rawAddress)

public actual fun tryAcquireSRWLockExclusive(srwlock: MutPtr): Boolean =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingTryAcquireSRWLockExclusive(srwlock.rawAddress)

public actual fun tryAcquireSRWLockShared(srwlock: MutPtr): Boolean =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingTryAcquireSRWLockShared(srwlock.rawAddress)

public actual fun tryEnterCriticalSection(lpcriticalsection: MutPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingTryEnterCriticalSection(lpcriticalsection.rawAddress)

public actual fun trySubmitThreadpoolCallback(pfns: PtpSimpleCallback, pv: MutPtr, pcbe: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingTrySubmitThreadpoolCallback(0L, pv.rawAddress, pcbe.rawAddress)

public actual fun umsThreadYield(schedulerparam: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingUmsThreadYield(schedulerparam.rawAddress)

public actual fun unregisterWait(waithandle: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingUnregisterWait(waithandle.rawAddress)

public actual fun unregisterWaitEx(waithandle: Handle, completionevent: Handle): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingUnregisterWaitEx(waithandle.rawAddress, completionevent.rawAddress)

public actual fun updateProcThreadAttribute(lpattributelist: LpprocThreadAttributeList, dwflags: UInt, attribute: ULong, lpvalue: ConstPtr, cbsize: ULong, lppreviousvalue: MutPtr, lpreturnsize: ConstPtr): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingUpdateProcThreadAttribute(lpattributelist.rawAddress, dwflags.toInt(), attribute.toLong(), lpvalue.rawAddress, cbsize.toLong(), lppreviousvalue.rawAddress, lpreturnsize.rawAddress)

public actual fun waitForInputIdle(hprocess: Handle, dwmilliseconds: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWaitForInputIdle(hprocess.rawAddress, dwmilliseconds.toInt()).toUInt()

public actual fun waitForMultipleObjects(ncount: UInt, lphandles: ConstPtr, bwaitall: Bool, dwmilliseconds: UInt): WaitEvent =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWaitForMultipleObjects(ncount.toInt(), lphandles.rawAddress, bwaitall, dwmilliseconds.toInt()).toUInt()

public actual fun waitForMultipleObjectsEx(ncount: UInt, lphandles: ConstPtr, bwaitall: Bool, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWaitForMultipleObjectsEx(ncount.toInt(), lphandles.rawAddress, bwaitall, dwmilliseconds.toInt(), balertable).toUInt()

public actual fun waitForSingleObject(hhandle: Handle, dwmilliseconds: UInt): WaitEvent =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWaitForSingleObject(hhandle.rawAddress, dwmilliseconds.toInt()).toUInt()

public actual fun waitForSingleObjectEx(hhandle: Handle, dwmilliseconds: UInt, balertable: Bool): WaitEvent =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWaitForSingleObjectEx(hhandle.rawAddress, dwmilliseconds.toInt(), balertable).toUInt()

public actual fun waitForThreadpoolIoCallbacks(pio: PtpIo, fcancelpendingcallbacks: Bool) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWaitForThreadpoolIoCallbacks(pio, fcancelpendingcallbacks)
}

public actual fun waitForThreadpoolTimerCallbacks(pti: PtpTimer, fcancelpendingcallbacks: Bool) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWaitForThreadpoolTimerCallbacks(pti, fcancelpendingcallbacks)
}

public actual fun waitForThreadpoolWaitCallbacks(pwa: PtpWait, fcancelpendingcallbacks: Bool) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWaitForThreadpoolWaitCallbacks(pwa, fcancelpendingcallbacks)
}

public actual fun waitForThreadpoolWorkCallbacks(pwk: PtpWork, fcancelpendingcallbacks: Bool) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWaitForThreadpoolWorkCallbacks(pwk, fcancelpendingcallbacks)
}

public actual fun waitOnAddress(address: ConstPtr, compareaddress: ConstPtr, addresssize: ULong, dwmilliseconds: UInt): Bool =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWaitOnAddress(address.rawAddress, compareaddress.rawAddress, addresssize.toLong(), dwmilliseconds.toInt())

public actual fun wakeAllConditionVariable(conditionvariable: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWakeAllConditionVariable(conditionvariable.rawAddress)
}

public actual fun wakeByAddressAll(address: ConstPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWakeByAddressAll(address.rawAddress)
}

public actual fun wakeByAddressSingle(address: ConstPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWakeByAddressSingle(address.rawAddress)
}

public actual fun wakeConditionVariable(conditionvariable: MutPtr) {
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWakeConditionVariable(conditionvariable.rawAddress)
}

public actual fun winExec(lpcmdline: Pcstr, ucmdshow: UInt): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWinExec(lpcmdline.rawAddress, ucmdshow.toInt()).toUInt()

public actual fun wow64SetThreadDefaultGuestMachine(machine: UShort): UShort =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWow64SetThreadDefaultGuestMachine(machine.toShort()).toUShort()

public actual fun wow64SuspendThread(hthread: Handle): UInt =
    WindowsWin32SystemThreadingJniBridge.windowssysWindowsWin32SystemThreadingWow64SuspendThread(hthread.rawAddress).toUInt()
