@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge {
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
        val stream = WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot(processhandle: Long, captureflags: Int, threadcontextflags: Int, snapshothandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot(sourceprocesshandle: Long, snapshothandle: Long, targetprocesshandle: Long, targetsnapshothandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot(processhandle: Long, snapshothandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot(snapshothandle: Long, informationclass: Int, buffer: Long, bufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate(allocator: Long, walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree(walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition(walkmarkerhandle: Long, position: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning(walkmarkerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition(walkmarkerhandle: Long, position: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot(snapshothandle: Long, informationclass: Int, walkmarkerhandle: Long, buffer: Long, bufferlength: Int): Int
}

public actual fun pssCaptureSnapshot(processhandle: Handle, captureflags: PssCaptureFlags, threadcontextflags: UInt, snapshothandle: MutPtr<Hpss>): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssCaptureSnapshot(processhandle.rawAddress, captureflags.toInt(), threadcontextflags.toInt(), snapshothandle.rawAddress).toUInt()

public actual fun pssDuplicateSnapshot(sourceprocesshandle: Handle, snapshothandle: Hpss, targetprocesshandle: Handle, targetsnapshothandle: MutPtr<Hpss>, flags: PssDuplicateFlags): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssDuplicateSnapshot(sourceprocesshandle.rawAddress, snapshothandle.rawAddress, targetprocesshandle.rawAddress, targetsnapshothandle.rawAddress, flags).toUInt()

public actual fun pssFreeSnapshot(processhandle: Handle, snapshothandle: Hpss): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssFreeSnapshot(processhandle.rawAddress, snapshothandle.rawAddress).toUInt()

public actual fun pssQuerySnapshot(snapshothandle: Hpss, informationclass: PssQueryInformationClass, buffer: MutPtr<CVoid>, bufferlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssQuerySnapshot(snapshothandle.rawAddress, informationclass, buffer.rawAddress, bufferlength.toInt()).toUInt()

public actual fun pssWalkMarkerCreate(allocator: ConstPtr<PssAllocator>, walkmarkerhandle: MutPtr<Hpsswalk>): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerCreate(allocator.rawAddress, walkmarkerhandle.rawAddress).toUInt()

public actual fun pssWalkMarkerFree(walkmarkerhandle: Hpsswalk): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerFree(walkmarkerhandle.rawAddress).toUInt()

public actual fun pssWalkMarkerGetPosition(walkmarkerhandle: Hpsswalk, position: MutPtr<ULong>): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerGetPosition(walkmarkerhandle.rawAddress, position.rawAddress).toUInt()

public actual fun pssWalkMarkerSeekToBeginning(walkmarkerhandle: Hpsswalk): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSeekToBeginning(walkmarkerhandle.rawAddress).toUInt()

public actual fun pssWalkMarkerSetPosition(walkmarkerhandle: Hpsswalk, position: ULong): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkMarkerSetPosition(walkmarkerhandle.rawAddress, position.toLong()).toUInt()

public actual fun pssWalkSnapshot(snapshothandle: Hpss, informationclass: PssWalkInformationClass, walkmarkerhandle: Hpsswalk, buffer: MutPtr<CVoid>, bufferlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsProcesssnapshottingJniBridge.windowssysWindowsWin32SystemDiagnosticsProcesssnapshottingPssWalkSnapshot(snapshothandle.rawAddress, informationclass, walkmarkerhandle.rawAddress, buffer.rawAddress, bufferlength.toInt()).toUInt()
