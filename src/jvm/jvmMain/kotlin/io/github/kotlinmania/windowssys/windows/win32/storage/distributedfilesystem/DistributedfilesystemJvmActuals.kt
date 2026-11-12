@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private object WindowsWin32StorageDistributedfilesystemJniBridge {
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
        val stream = WindowsWin32StorageDistributedfilesystemJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsAdd(dfsentrypath: Long, servername: Long, sharename: Long, comment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddFtRoot(servername: Long, rootshare: Long, ftdfsname: Long, comment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddRootTarget(pdfspath: Long, ptargetpath: Long, majorversion: Int, pcomment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddStdRoot(servername: Long, rootshare: Long, comment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsEnum(dfsname: Long, level: Int, prefmaxlen: Int, buffer: Long, entriesread: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetClientInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetFtContainerSecurity(domainname: Long, securityinformation: Int, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSecurity(dfsentrypath: Long, securityinformation: Int, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetStdContainerSecurity(machinename: Long, securityinformation: Int, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSupportedNamespaceVersion(origin: Int, pname: Long, ppversioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsMove(olddfsentrypath: Long, newdfsentrypath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemove(dfsentrypath: Long, servername: Long, sharename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRoot(servername: Long, rootshare: Long, ftdfsname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRootForced(domainname: Long, servername: Long, rootshare: Long, ftdfsname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveRootTarget(pdfspath: Long, ptargetpath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveStdRoot(servername: Long, rootshare: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetClientInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetFtContainerSecurity(domainname: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetSecurity(dfsentrypath: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetStdContainerSecurity(machinename: Long, securityinformation: Int, psecuritydescriptor: Long): Int
}

public actual fun netDfsAdd(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAdd(dfsentrypath.rawAddress, servername.rawAddress, sharename.rawAddress, comment.rawAddress, flags.toInt()).toUInt()

public actual fun netDfsAddFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddFtRoot(servername.rawAddress, rootshare.rawAddress, ftdfsname.rawAddress, comment.rawAddress, flags.toInt()).toUInt()

public actual fun netDfsAddRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, majorversion: UInt, pcomment: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddRootTarget(pdfspath.rawAddress, ptargetpath.rawAddress, majorversion.toInt(), pcomment.rawAddress, flags.toInt()).toUInt()

public actual fun netDfsAddStdRoot(servername: Pcwstr, rootshare: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddStdRoot(servername.rawAddress, rootshare.rawAddress, comment.rawAddress, flags.toInt()).toUInt()

public actual fun netDfsEnum(dfsname: Pcwstr, level: UInt, prefmaxlen: UInt, buffer: MutPtr<MutPtr<UByte>>, entriesread: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsEnum(dfsname.rawAddress, level.toInt(), prefmaxlen.toInt(), buffer.rawAddress, entriesread.rawAddress, resumehandle.rawAddress).toUInt()

public actual fun netDfsGetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetClientInfo(dfsentrypath.rawAddress, servername.rawAddress, sharename.rawAddress, level.toInt(), buffer.rawAddress).toUInt()

public actual fun netDfsGetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, lpcbsecuritydescriptor: MutPtr<UInt>): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetFtContainerSecurity(domainname.rawAddress, securityinformation.toInt(), ppsecuritydescriptor.rawAddress, lpcbsecuritydescriptor.rawAddress).toUInt()

public actual fun netDfsGetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetInfo(dfsentrypath.rawAddress, servername.rawAddress, sharename.rawAddress, level.toInt(), buffer.rawAddress).toUInt()

public actual fun netDfsGetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, lpcbsecuritydescriptor: MutPtr<UInt>): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSecurity(dfsentrypath.rawAddress, securityinformation.toInt(), ppsecuritydescriptor.rawAddress, lpcbsecuritydescriptor.rawAddress).toUInt()

public actual fun netDfsGetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, lpcbsecuritydescriptor: MutPtr<UInt>): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetStdContainerSecurity(machinename.rawAddress, securityinformation.toInt(), ppsecuritydescriptor.rawAddress, lpcbsecuritydescriptor.rawAddress).toUInt()

public actual fun netDfsGetSupportedNamespaceVersion(origin: DfsNamespaceVersionOrigin, pname: Pcwstr, ppversioninfo: MutPtr<MutPtr<DfsSupportedNamespaceVersionInfo>>): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSupportedNamespaceVersion(origin, pname.rawAddress, ppversioninfo.rawAddress).toUInt()

public actual fun netDfsMove(olddfsentrypath: Pcwstr, newdfsentrypath: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsMove(olddfsentrypath.rawAddress, newdfsentrypath.rawAddress, flags.toInt()).toUInt()

public actual fun netDfsRemove(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemove(dfsentrypath.rawAddress, servername.rawAddress, sharename.rawAddress).toUInt()

public actual fun netDfsRemoveFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRoot(servername.rawAddress, rootshare.rawAddress, ftdfsname.rawAddress, flags.toInt()).toUInt()

public actual fun netDfsRemoveFtRootForced(domainname: Pcwstr, servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRootForced(domainname.rawAddress, servername.rawAddress, rootshare.rawAddress, ftdfsname.rawAddress, flags.toInt()).toUInt()

public actual fun netDfsRemoveRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveRootTarget(pdfspath.rawAddress, ptargetpath.rawAddress, flags.toInt()).toUInt()

public actual fun netDfsRemoveStdRoot(servername: Pcwstr, rootshare: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveStdRoot(servername.rawAddress, rootshare.rawAddress, flags.toInt()).toUInt()

public actual fun netDfsSetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: ConstPtr<UByte>): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetClientInfo(dfsentrypath.rawAddress, servername.rawAddress, sharename.rawAddress, level.toInt(), buffer.rawAddress).toUInt()

public actual fun netDfsSetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetFtContainerSecurity(domainname.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress).toUInt()

public actual fun netDfsSetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: ConstPtr<UByte>): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetInfo(dfsentrypath.rawAddress, servername.rawAddress, sharename.rawAddress, level.toInt(), buffer.rawAddress).toUInt()

public actual fun netDfsSetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetSecurity(dfsentrypath.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress).toUInt()

public actual fun netDfsSetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetStdContainerSecurity(machinename.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress).toUInt()
