package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.EnumPageFileInformation
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.LIST_MODULES_32BIT
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.LIST_MODULES_64BIT
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.LIST_MODULES_ALL
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.LIST_MODULES_DEFAULT
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.Moduleinfo
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PSAPI_VERSION
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PenumPageFileCallbackaFn
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PenumPageFileCallbackwFn
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PerformanceInformation
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.ProcessMemoryCounters
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.ProcessMemoryCountersEx
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.ProcessMemoryCountersEx2
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PsapiWorkingSetBlock
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PsapiWorkingSetBlock0
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PsapiWorkingSetExBlock
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PsapiWorkingSetExBlock0
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PsapiWorkingSetExBlock00
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PsapiWorkingSetExBlock01
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PsapiWorkingSetExInformation
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PsapiWorkingSetInformation
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PsapiWsWatchInformation
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.PsapiWsWatchInformationEx
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class ProcessStatusTest {
    @Test
    fun testProcessStatusConstants() {
        assertEquals(0u, LIST_MODULES_DEFAULT)
        assertEquals(1u, LIST_MODULES_32BIT)
        assertEquals(2u, LIST_MODULES_64BIT)
        assertEquals(3u, LIST_MODULES_ALL)
        assertEquals(2u, PSAPI_VERSION)
    }

    @Test
    fun testEnumPageFileInformation() {
        val info =
            EnumPageFileInformation(
                cb = 24u,
                reserved = 0u,
                totalSize = 1024,
                totalInUse = 512,
                peakUsage = 768,
            )
        assertEquals(24u, info.cb)
        assertEquals(0u, info.reserved)
        assertEquals(1024, info.totalSize)
        assertEquals(512, info.totalInUse)
        assertEquals(768, info.peakUsage)
    }

    @Test
    fun testModuleInfo() {
        val modInfo =
            Moduleinfo(
                lpBaseOfDll = COpaquePointer(0x140000000L),
                sizeOfImage = 0x20000u,
                entryPoint = COpaquePointer(0x140001000L),
            )
        assertEquals(COpaquePointer(0x140000000L), modInfo.lpBaseOfDll)
        assertEquals(0x20000u, modInfo.sizeOfImage)
        assertEquals(COpaquePointer(0x140001000L), modInfo.entryPoint)
    }

    @Test
    fun testPerformanceInformation() {
        val perf =
            PerformanceInformation(
                cb = 56u,
                commitTotal = 4096,
                commitLimit = 8192,
                commitPeak = 6000,
                physicalTotal = 16384,
                physicalAvailable = 8192,
                systemCache = 2048,
                kernelTotal = 1024,
                kernelPaged = 512,
                kernelNonpaged = 512,
                pageSize = 4096,
                handleCount = 25000u,
                processCount = 120u,
                threadCount = 950u,
            )
        assertEquals(56u, perf.cb)
        assertEquals(4096, perf.commitTotal)
        assertEquals(8192, perf.commitLimit)
        assertEquals(6000, perf.commitPeak)
        assertEquals(16384, perf.physicalTotal)
        assertEquals(8192, perf.physicalAvailable)
        assertEquals(2048, perf.systemCache)
        assertEquals(1024, perf.kernelTotal)
        assertEquals(512, perf.kernelPaged)
        assertEquals(512, perf.kernelNonpaged)
        assertEquals(4096, perf.pageSize)
        assertEquals(25000u, perf.handleCount)
        assertEquals(120u, perf.processCount)
        assertEquals(950u, perf.threadCount)
    }

    @Test
    fun testProcessMemoryCounters() {
        val counters =
            ProcessMemoryCounters(
                cb = 44u,
                pageFaultCount = 100u,
                peakWorkingSetSize = 1048576,
                workingSetSize = 524288,
                quotaPeakPagedPoolUsage = 65536,
                quotaPagedPoolUsage = 32768,
                quotaPeakNonPagedPoolUsage = 16384,
                quotaNonPagedPoolUsage = 8192,
                pagefileUsage = 2097152,
                peakPagefileUsage = 3145728,
            )
        assertEquals(44u, counters.cb)
        assertEquals(100u, counters.pageFaultCount)
        assertEquals(1048576, counters.peakWorkingSetSize)
        assertEquals(524288, counters.workingSetSize)
        assertEquals(65536, counters.quotaPeakPagedPoolUsage)
        assertEquals(32768, counters.quotaPagedPoolUsage)
        assertEquals(16384, counters.quotaPeakNonPagedPoolUsage)
        assertEquals(8192, counters.quotaNonPagedPoolUsage)
        assertEquals(2097152, counters.pagefileUsage)
        assertEquals(3145728, counters.peakPagefileUsage)

        val countersEx =
            ProcessMemoryCountersEx(
                cb = 48u,
                privateUsage = 4194304,
            )
        assertEquals(48u, countersEx.cb)
        assertEquals(4194304, countersEx.privateUsage)

        val countersEx2 =
            ProcessMemoryCountersEx2(
                cb = 64u,
                privateUsage = 4194304,
                privateWorkingSetSize = 2097152,
                sharedCommitUsage = 1048576uL,
            )
        assertEquals(64u, countersEx2.cb)
        assertEquals(4194304, countersEx2.privateUsage)
        assertEquals(2097152, countersEx2.privateWorkingSetSize)
        assertEquals(1048576uL, countersEx2.sharedCommitUsage)
    }

    @Test
    fun testWorkingSetStructures() {
        val b0 = PsapiWorkingSetBlock0(bitfield = 0x1)
        val block = PsapiWorkingSetBlock(flags = 0x1, anonymous = b0)
        assertEquals(0x1, block.flags)
        assertEquals(0x1, block.anonymous.bitfield)

        val exB00 = PsapiWorkingSetExBlock00(bitfield = 0x2)
        val exB01 = PsapiWorkingSetExBlock01(bitfield = 0x3)
        val exB0 = PsapiWorkingSetExBlock0(anonymous = exB00, invalid = exB01)
        val exBlock = PsapiWorkingSetExBlock(flags = 0x2, anonymous = exB0)
        assertEquals(0x2, exBlock.flags)
        assertEquals(0x2, exBlock.anonymous.anonymous.bitfield)
        assertEquals(0x3, exBlock.anonymous.invalid.bitfield)

        val wsExInfo =
            PsapiWorkingSetExInformation(
                virtualAddress = COpaquePointer(0x10000000L),
                virtualAttributes = exBlock,
            )
        assertEquals(COpaquePointer(0x10000000L), wsExInfo.virtualAddress)
        assertEquals(0x2, wsExInfo.virtualAttributes.flags)

        val wsInfo =
            PsapiWorkingSetInformation(
                numberOfEntries = 1,
                workingSetInfo = listOf(block),
            )
        assertEquals(1, wsInfo.numberOfEntries)
        assertEquals(block, wsInfo.workingSetInfo[0])
        assertEquals(wsInfo, PsapiWorkingSetInformation(1, listOf(block)))
    }

    @Test
    fun testWatchInformation() {
        val watchInfo =
            PsapiWsWatchInformation(
                faultingPc = COpaquePointer(0x7FFF0001L),
                faultingVa = COpaquePointer(0x7FFF1000L),
            )
        assertEquals(COpaquePointer(0x7FFF0001L), watchInfo.faultingPc)
        assertEquals(COpaquePointer(0x7FFF1000L), watchInfo.faultingVa)

        val watchInfoEx =
            PsapiWsWatchInformationEx(
                basicInfo = watchInfo,
                faultingThreadId = 1234,
                flags = 0,
            )
        assertEquals(watchInfo, watchInfoEx.basicInfo)
        assertEquals(1234, watchInfoEx.faultingThreadId)
        assertEquals(0, watchInfoEx.flags)
    }

    @Test
    fun testPageFileCallbacks() {
        val callbackA =
            PenumPageFileCallbackaFn { _, ppagefileinfo, _ ->
                assertNotNull(ppagefileinfo)
                1
            }
        val infoPtr = COpaquePointer(0x2000L)
        val resultA = callbackA.invoke(null, infoPtr, null)
        assertEquals(1, resultA)

        val callbackW =
            PenumPageFileCallbackwFn { _, ppagefileinfo, _ ->
                assertNotNull(ppagefileinfo)
                1
            }
        val resultW = callbackW.invoke(null, infoPtr, null)
        assertEquals(1, resultW)
    }
}
