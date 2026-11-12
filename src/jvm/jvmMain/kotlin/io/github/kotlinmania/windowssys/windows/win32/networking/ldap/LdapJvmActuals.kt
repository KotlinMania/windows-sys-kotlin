@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private object WindowsWin32NetworkingLdapJniBridge {
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
        val stream = WindowsWin32NetworkingLdapJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32NetworkingLdapLdapGetLastError(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32(ldaperror: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapUTF8ToUnicode(lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapUnicodeToUTF8(lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerAllocT(options: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerBvdup(pberval: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerBvecfree(pberval: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerBvfree(bv: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerFirstElement(pberelement: Long, plen: Long, ppopaque: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerFlatten(pberelement: Long, pberval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerFree(pberelement: Long, fbuf: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerInit(pberval: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerNextElement(pberelement: Long, plen: Long, opaque: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerPeekTag(pberelement: Long, plen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerPrintf(pberelement: Long, fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerScanf(pberelement: Long, fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapBerSkipTag(pberelement: Long, plen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapCldapOpen(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapCldapOpenA(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapCldapOpenW(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAbandon(ld: Long, msgid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAdd(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddA(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddW(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddExt(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddExtA(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddExtW(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddExtS(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddExtSA(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddExtSW(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddS(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddSA(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapAddSW(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapBind(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapBindA(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapBindW(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapBindS(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapBindSA(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapBindSW(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCheckFilterA(ld: Long, searchfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCheckFilterW(ld: Long, searchfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCleanup(hinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp(ld: Long, messagenumber: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompare(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareA(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareW(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareExt(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareExtA(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareExtW(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareExtS(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareExtSA(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareExtSW(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareS(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareSA(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCompareSW(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapConnFromMsg(primaryconn: Long, res: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapConnect(ld: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapControlFree(control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapControlFreeA(controls: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapControlFreeW(control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapControlsFree(controls: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapControlsFreeA(controls: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapControlsFreeW(control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCountEntries(ld: Long, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCountReferences(ld: Long, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCountValues(vals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCountValuesA(vals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCountValuesW(vals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCountValuesLen(vals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCreatePageControl(externalhandle: Long, pagesize: Int, cookie: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCreatePageControlA(externalhandle: Long, pagesize: Int, cookie: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCreatePageControlW(externalhandle: Long, pagesize: Int, cookie: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCreateSortControl(externalhandle: Long, sortkeys: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCreateSortControlA(externalhandle: Long, sortkeys: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCreateSortControlW(externalhandle: Long, sortkeys: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA(externalhandle: Long, vlvinfo: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW(externalhandle: Long, vlvinfo: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDelete(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteA(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteW(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteExt(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteExtA(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteExtW(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteExtS(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteExtSA(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteExtSW(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteS(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteSA(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDeleteSW(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDn2ufn(dn: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDn2ufnA(dn: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapDn2ufnW(dn: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlW(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapErr2string(err: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapErr2stringA(err: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapErr2stringW(err: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElement(sourcefilterelement: Long, sourcelength: Int, destfilterelement: Long, destlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementA(sourcefilterelement: Long, sourcelength: Int, destfilterelement: Long, destlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementW(sourcefilterelement: Long, sourcelength: Int, destfilterelement: Long, destlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapExplodeDn(dn: Long, notypes: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapExplodeDnA(dn: Long, notypes: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapExplodeDnW(dn: Long, notypes: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapExtendedOperation(ld: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapExtendedOperationA(ld: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapExtendedOperationW(ld: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA(externalhandle: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW(externalhandle: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapFirstAttribute(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapFirstAttributeA(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapFirstAttributeW(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapFirstEntry(ld: Long, res: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapFirstReference(ld: Long, res: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapFreeControls(controls: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapFreeControlsA(controls: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapFreeControlsW(controls: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetDn(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetDnA(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetDnW(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetNextPage(externalhandle: Long, searchhandle: Long, pagesize: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetNextPageS(externalhandle: Long, searchhandle: Long, timeout: Long, pagesize: Int, totalcount: Long, results: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetOption(ld: Long, option: Int, outvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetOptionW(ld: Long, option: Int, outvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetPagedCount(externalhandle: Long, searchblock: Long, totalcount: Long, results: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetValues(ld: Long, entry: Long, attr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetValuesA(ld: Long, entry: Long, attr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetValuesW(ld: Long, entry: Long, attr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetValuesLen(externalhandle: Long, message: Long, attr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetValuesLenA(externalhandle: Long, message: Long, attr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapGetValuesLenW(externalhandle: Long, message: Long, attr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapInit(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapInitA(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapInitW(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapMemfree(block: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapMemfreeA(block: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapMemfreeW(block: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModify(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifyA(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifyW(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifyExt(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifyExtA(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifyExtW(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifyExtS(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifyExtSA(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifyExtSW(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifyS(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifySA(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModifySW(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdn(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdn2(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdn2A(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdn2W(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdn2S(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdn2SA(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdn2SW(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdnA(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdnW(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdnS(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdnSA(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapModrdnSW(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapMsgfree(res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapNextAttribute(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapNextAttributeA(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapNextAttributeW(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapNextEntry(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapNextReference(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapOpen(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapOpenA(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapOpenW(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParsePageControl(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParsePageControlA(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParsePageControlW(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseReference(connection: Long, resultmessage: Long, referrals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseReferenceA(connection: Long, resultmessage: Long, referrals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseReferenceW(connection: Long, resultmessage: Long, referrals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseResult(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseResultA(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseResultW(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseSortControl(externalhandle: Long, control: Long, result: Long, attribute: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseSortControlA(externalhandle: Long, control: Long, result: Long, attribute: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseSortControlW(externalhandle: Long, control: Long, result: Long, attribute: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseVlvControlA(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapParseVlvControlW(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapPerror(ld: Long, msg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapRenameExt(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapRenameExtA(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapRenameExtW(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapRenameExtS(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapRenameExtSA(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapRenameExtSW(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapResult(ld: Long, msgid: Int, all: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapResult2error(ld: Long, res: Long, freeit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSaslBindA(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSaslBindW(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSaslBindSA(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSaslBindSW(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearch(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage(externalhandle: Long, searchblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchExt(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timelimit: Int, sizelimit: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchExtA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timelimit: Int, sizelimit: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchExtW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timelimit: Int, sizelimit: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchExtS(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: Int, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchExtSA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: Int, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchExtSW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: Int, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchInitPage(externalhandle: Long, distinguishedname: Long, scopeofsearch: Int, searchfilter: Long, attributelist: Long, attributesonly: Int, servercontrols: Long, clientcontrols: Long, pagetimelimit: Int, totalsizelimit: Int, sortkeys: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchInitPageA(externalhandle: Long, distinguishedname: Long, scopeofsearch: Int, searchfilter: Long, attributelist: Long, attributesonly: Int, servercontrols: Long, clientcontrols: Long, pagetimelimit: Int, totalsizelimit: Int, sortkeys: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchInitPageW(externalhandle: Long, distinguishedname: Long, scopeofsearch: Int, searchfilter: Long, attributelist: Long, attributesonly: Int, servercontrols: Long, clientcontrols: Long, pagetimelimit: Int, totalsizelimit: Int, sortkeys: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchS(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchSA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchSW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchSt(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchStA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSearchStW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(newflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine(debugprintroutine: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSetOption(ld: Long, option: Int, invalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSetOptionW(ld: Long, option: Int, invalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSimpleBind(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSimpleBindA(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSimpleBindW(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSimpleBindS(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSimpleBindSA(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSimpleBindSW(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSslinit(hostname: Long, portnumber: Int, secure: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSslinitA(hostname: Long, portnumber: Int, secure: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapSslinitW(hostname: Long, portnumber: Int, secure: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapStartTlsSA(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapStartTlsSW(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapStartup(version: Long, instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapStopTlsS(externalhandle: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapUfn2dn(ufn: Long, pdn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapUfn2dnA(ufn: Long, pdn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapUfn2dnW(ufn: Long, pdn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapUnbind(ld: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapUnbindS(ld: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapValueFree(vals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapValueFreeA(vals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapValueFreeW(vals: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingLdapLdapValueFreeLen(vals: Long): Int
}

public actual fun ldapGetLastError(): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetLastError().toUInt()

public actual fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32(ldaperror.toInt()).toUInt()

public actual fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapUTF8ToUnicode(lpsrcstr.rawAddress, cchsrc, lpdeststr.rawAddress, cchdest)

public actual fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapUnicodeToUTF8(lpsrcstr.rawAddress, cchsrc, lpdeststr.rawAddress, cchdest)

public actual fun berAllocT(options: Int): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerAllocT(options))

public actual fun berBvdup(pberval: MutPtr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerBvdup(pberval.rawAddress))

public actual fun berBvecfree(pberval: MutPtr) {
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerBvecfree(pberval.rawAddress)
}

public actual fun berBvfree(bv: MutPtr) {
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerBvfree(bv.rawAddress)
}

public actual fun berFirstElement(pberelement: MutPtr, plen: MutPtr, ppopaque: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerFirstElement(pberelement.rawAddress, plen.rawAddress, ppopaque.rawAddress).toUInt()

public actual fun berFlatten(pberelement: MutPtr, pberval: MutPtr): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerFlatten(pberelement.rawAddress, pberval.rawAddress)

public actual fun berFree(pberelement: MutPtr, fbuf: Int) {
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerFree(pberelement.rawAddress, fbuf)
}

public actual fun berInit(pberval: MutPtr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerInit(pberval.rawAddress))

public actual fun berNextElement(pberelement: MutPtr, plen: MutPtr, opaque: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerNextElement(pberelement.rawAddress, plen.rawAddress, opaque.rawAddress).toUInt()

public actual fun berPeekTag(pberelement: MutPtr, plen: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerPeekTag(pberelement.rawAddress, plen.rawAddress).toUInt()

public actual fun berPrintf(pberelement: MutPtr, fmt: Pcstr, vararg variadicArgs: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerPrintf(pberelement.rawAddress, fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun berScanf(pberelement: MutPtr, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerScanf(pberelement.rawAddress, fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun berSkipTag(pberelement: MutPtr, plen: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapBerSkipTag(pberelement.rawAddress, plen.rawAddress).toUInt()

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapCldapOpen(hostname.rawAddress, portnumber.toInt()))

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapCldapOpenA(hostname.rawAddress, portnumber.toInt()))

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapCldapOpenW(hostname.rawAddress, portnumber.toInt()))

public actual fun ldapAbandon(ld: MutPtr, msgid: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAbandon(ld.rawAddress, msgid.toInt()).toUInt()

public actual fun ldapAdd(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAdd(ld.rawAddress, dn.rawAddress, attrs.rawAddress).toUInt()

public actual fun ldapAddA(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddA(ld.rawAddress, dn.rawAddress, attrs.rawAddress).toUInt()

public actual fun ldapAddW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddW(ld.rawAddress, dn.rawAddress, attrs.rawAddress).toUInt()

public actual fun ldapAddExt(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddExt(ld.rawAddress, dn.rawAddress, attrs.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapAddExtA(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddExtA(ld.rawAddress, dn.rawAddress, attrs.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapAddExtW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddExtW(ld.rawAddress, dn.rawAddress, attrs.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapAddExtS(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddExtS(ld.rawAddress, dn.rawAddress, attrs.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapAddExtSA(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddExtSA(ld.rawAddress, dn.rawAddress, attrs.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapAddExtSW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddExtSW(ld.rawAddress, dn.rawAddress, attrs.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapAddS(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddS(ld.rawAddress, dn.rawAddress, attrs.rawAddress).toUInt()

public actual fun ldapAddSA(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddSA(ld.rawAddress, dn.rawAddress, attrs.rawAddress).toUInt()

public actual fun ldapAddSW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapAddSW(ld.rawAddress, dn.rawAddress, attrs.rawAddress).toUInt()

public actual fun ldapBind(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapBind(ld.rawAddress, dn.rawAddress, cred.rawAddress, method.toInt()).toUInt()

public actual fun ldapBindA(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapBindA(ld.rawAddress, dn.rawAddress, cred.rawAddress, method.toInt()).toUInt()

public actual fun ldapBindW(ld: MutPtr, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapBindW(ld.rawAddress, dn.rawAddress, cred.rawAddress, method.toInt()).toUInt()

public actual fun ldapBindS(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapBindS(ld.rawAddress, dn.rawAddress, cred.rawAddress, method.toInt()).toUInt()

public actual fun ldapBindSA(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapBindSA(ld.rawAddress, dn.rawAddress, cred.rawAddress, method.toInt()).toUInt()

public actual fun ldapBindSW(ld: MutPtr, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapBindSW(ld.rawAddress, dn.rawAddress, cred.rawAddress, method.toInt()).toUInt()

public actual fun ldapCheckFilterA(ld: MutPtr, searchfilter: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCheckFilterA(ld.rawAddress, searchfilter.rawAddress).toUInt()

public actual fun ldapCheckFilterW(ld: MutPtr, searchfilter: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCheckFilterW(ld.rawAddress, searchfilter.rawAddress).toUInt()

public actual fun ldapCleanup(hinstance: Handle): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCleanup(hinstance.rawAddress).toUInt()

public actual fun ldapCloseExtendedOp(ld: MutPtr, messagenumber: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp(ld.rawAddress, messagenumber.toInt()).toUInt()

public actual fun ldapCompare(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompare(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress).toUInt()

public actual fun ldapCompareA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareA(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress).toUInt()

public actual fun ldapCompareW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareW(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress).toUInt()

public actual fun ldapCompareExt(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareExt(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapCompareExtA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareExtA(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapCompareExtW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareExtW(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapCompareExtS(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareExtS(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapCompareExtSA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareExtSA(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapCompareExtSW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareExtSW(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapCompareS(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareS(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress).toUInt()

public actual fun ldapCompareSA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareSA(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress).toUInt()

public actual fun ldapCompareSW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCompareSW(ld.rawAddress, dn.rawAddress, attr.rawAddress, value.rawAddress).toUInt()

public actual fun ldapConnFromMsg(primaryconn: MutPtr, res: MutPtr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapConnFromMsg(primaryconn.rawAddress, res.rawAddress))

public actual fun ldapConnect(ld: MutPtr, timeout: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapConnect(ld.rawAddress, timeout.rawAddress).toUInt()

public actual fun ldapControlFree(control: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapControlFree(control.rawAddress).toUInt()

public actual fun ldapControlFreeA(controls: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapControlFreeA(controls.rawAddress).toUInt()

public actual fun ldapControlFreeW(control: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapControlFreeW(control.rawAddress).toUInt()

public actual fun ldapControlsFree(controls: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapControlsFree(controls.rawAddress).toUInt()

public actual fun ldapControlsFreeA(controls: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapControlsFreeA(controls.rawAddress).toUInt()

public actual fun ldapControlsFreeW(control: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapControlsFreeW(control.rawAddress).toUInt()

public actual fun ldapCountEntries(ld: MutPtr, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCountEntries(ld.rawAddress, res.rawAddress).toUInt()

public actual fun ldapCountReferences(ld: MutPtr, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCountReferences(ld.rawAddress, res.rawAddress).toUInt()

public actual fun ldapCountValues(vals: ConstPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCountValues(vals.rawAddress).toUInt()

public actual fun ldapCountValuesA(vals: ConstPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCountValuesA(vals.rawAddress).toUInt()

public actual fun ldapCountValuesW(vals: ConstPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCountValuesW(vals.rawAddress).toUInt()

public actual fun ldapCountValuesLen(vals: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCountValuesLen(vals.rawAddress).toUInt()

public actual fun ldapCreatePageControl(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCreatePageControl(externalhandle.rawAddress, pagesize.toInt(), cookie.rawAddress, iscritical.toByte(), control.rawAddress).toUInt()

public actual fun ldapCreatePageControlA(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCreatePageControlA(externalhandle.rawAddress, pagesize.toInt(), cookie.rawAddress, iscritical.toByte(), control.rawAddress).toUInt()

public actual fun ldapCreatePageControlW(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCreatePageControlW(externalhandle.rawAddress, pagesize.toInt(), cookie.rawAddress, iscritical.toByte(), control.rawAddress).toUInt()

public actual fun ldapCreateSortControl(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCreateSortControl(externalhandle.rawAddress, sortkeys.rawAddress, iscritical.toByte(), control.rawAddress).toUInt()

public actual fun ldapCreateSortControlA(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCreateSortControlA(externalhandle.rawAddress, sortkeys.rawAddress, iscritical.toByte(), control.rawAddress).toUInt()

public actual fun ldapCreateSortControlW(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCreateSortControlW(externalhandle.rawAddress, sortkeys.rawAddress, iscritical.toByte(), control.rawAddress).toUInt()

public actual fun ldapCreateVlvControlA(externalhandle: MutPtr, vlvinfo: MutPtr, iscritical: UByte, control: MutPtr): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA(externalhandle.rawAddress, vlvinfo.rawAddress, iscritical.toByte(), control.rawAddress)

public actual fun ldapCreateVlvControlW(externalhandle: MutPtr, vlvinfo: MutPtr, iscritical: UByte, control: MutPtr): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW(externalhandle.rawAddress, vlvinfo.rawAddress, iscritical.toByte(), control.rawAddress)

public actual fun ldapDelete(ld: MutPtr, dn: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDelete(ld.rawAddress, dn.rawAddress).toUInt()

public actual fun ldapDeleteA(ld: MutPtr, dn: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteA(ld.rawAddress, dn.rawAddress).toUInt()

public actual fun ldapDeleteW(ld: MutPtr, dn: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteW(ld.rawAddress, dn.rawAddress).toUInt()

public actual fun ldapDeleteExt(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteExt(ld.rawAddress, dn.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapDeleteExtA(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteExtA(ld.rawAddress, dn.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapDeleteExtW(ld: MutPtr, dn: Pcwstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteExtW(ld.rawAddress, dn.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapDeleteExtS(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteExtS(ld.rawAddress, dn.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapDeleteExtSA(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteExtSA(ld.rawAddress, dn.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapDeleteExtSW(ld: MutPtr, dn: Pcwstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteExtSW(ld.rawAddress, dn.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapDeleteS(ld: MutPtr, dn: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteS(ld.rawAddress, dn.rawAddress).toUInt()

public actual fun ldapDeleteSA(ld: MutPtr, dn: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteSA(ld.rawAddress, dn.rawAddress).toUInt()

public actual fun ldapDeleteSW(ld: MutPtr, dn: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDeleteSW(ld.rawAddress, dn.rawAddress).toUInt()

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDn2ufn(dn.rawAddress))

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDn2ufnA(dn.rawAddress))

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapDn2ufnW(dn.rawAddress))

public actual fun ldapEncodeSortControlA(externalhandle: MutPtr, sortkeys: MutPtr, control: MutPtr, criticality: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA(externalhandle.rawAddress, sortkeys.rawAddress, control.rawAddress, criticality).toUInt()

public actual fun ldapEncodeSortControlW(externalhandle: MutPtr, sortkeys: MutPtr, control: MutPtr, criticality: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlW(externalhandle.rawAddress, sortkeys.rawAddress, control.rawAddress, criticality).toUInt()

public actual fun ldapErr2string(err: UInt): Pstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapErr2string(err.toInt()))

public actual fun ldapErr2stringA(err: UInt): Pstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapErr2stringA(err.toInt()))

public actual fun ldapErr2stringW(err: UInt): Pwstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapErr2stringW(err.toInt()))

public actual fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElement(sourcefilterelement.rawAddress, sourcelength.toInt(), destfilterelement.rawAddress, destlength.toInt()).toUInt()

public actual fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementA(sourcefilterelement.rawAddress, sourcelength.toInt(), destfilterelement.rawAddress, destlength.toInt()).toUInt()

public actual fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementW(sourcefilterelement.rawAddress, sourcelength.toInt(), destfilterelement.rawAddress, destlength.toInt()).toUInt()

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapExplodeDn(dn.rawAddress, notypes.toInt()))

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapExplodeDnA(dn.rawAddress, notypes.toInt()))

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapExplodeDnW(dn.rawAddress, notypes.toInt()))

public actual fun ldapExtendedOperation(ld: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapExtendedOperation(ld.rawAddress, oid.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapExtendedOperationA(ld: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationA(ld.rawAddress, oid.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapExtendedOperationW(ld: MutPtr, oid: Pcwstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationW(ld.rawAddress, oid.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapExtendedOperationSA(externalhandle: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, returnedoid: MutPtr, returneddata: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA(externalhandle.rawAddress, oid.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, returnedoid.rawAddress, returneddata.rawAddress).toUInt()

public actual fun ldapExtendedOperationSW(externalhandle: MutPtr, oid: Pcwstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, returnedoid: MutPtr, returneddata: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW(externalhandle.rawAddress, oid.rawAddress, data.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, returnedoid.rawAddress, returneddata.rawAddress).toUInt()

public actual fun ldapFirstAttribute(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapFirstAttribute(ld.rawAddress, entry.rawAddress, ptr.rawAddress))

public actual fun ldapFirstAttributeA(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapFirstAttributeA(ld.rawAddress, entry.rawAddress, ptr.rawAddress))

public actual fun ldapFirstAttributeW(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pwstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapFirstAttributeW(ld.rawAddress, entry.rawAddress, ptr.rawAddress))

public actual fun ldapFirstEntry(ld: MutPtr, res: MutPtr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapFirstEntry(ld.rawAddress, res.rawAddress))

public actual fun ldapFirstReference(ld: MutPtr, res: MutPtr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapFirstReference(ld.rawAddress, res.rawAddress))

public actual fun ldapFreeControls(controls: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapFreeControls(controls.rawAddress).toUInt()

public actual fun ldapFreeControlsA(controls: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapFreeControlsA(controls.rawAddress).toUInt()

public actual fun ldapFreeControlsW(controls: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapFreeControlsW(controls.rawAddress).toUInt()

public actual fun ldapGetDn(ld: MutPtr, entry: MutPtr): Pstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetDn(ld.rawAddress, entry.rawAddress))

public actual fun ldapGetDnA(ld: MutPtr, entry: MutPtr): Pstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetDnA(ld.rawAddress, entry.rawAddress))

public actual fun ldapGetDnW(ld: MutPtr, entry: MutPtr): Pwstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetDnW(ld.rawAddress, entry.rawAddress))

public actual fun ldapGetNextPage(externalhandle: MutPtr, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetNextPage(externalhandle.rawAddress, searchhandle, pagesize.toInt(), messagenumber.rawAddress).toUInt()

public actual fun ldapGetNextPageS(externalhandle: MutPtr, searchhandle: PLDAPSearch, timeout: MutPtr, pagesize: UInt, totalcount: MutPtr, results: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetNextPageS(externalhandle.rawAddress, searchhandle, timeout.rawAddress, pagesize.toInt(), totalcount.rawAddress, results.rawAddress).toUInt()

public actual fun ldapGetOption(ld: MutPtr, option: Int, outvalue: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetOption(ld.rawAddress, option, outvalue.rawAddress).toUInt()

public actual fun ldapGetOptionW(ld: MutPtr, option: Int, outvalue: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetOptionW(ld.rawAddress, option, outvalue.rawAddress).toUInt()

public actual fun ldapGetPagedCount(externalhandle: MutPtr, searchblock: PLDAPSearch, totalcount: MutPtr, results: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetPagedCount(externalhandle.rawAddress, searchblock, totalcount.rawAddress, results.rawAddress).toUInt()

public actual fun ldapGetValues(ld: MutPtr, entry: MutPtr, attr: Pcstr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetValues(ld.rawAddress, entry.rawAddress, attr.rawAddress))

public actual fun ldapGetValuesA(ld: MutPtr, entry: MutPtr, attr: Pcstr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetValuesA(ld.rawAddress, entry.rawAddress, attr.rawAddress))

public actual fun ldapGetValuesW(ld: MutPtr, entry: MutPtr, attr: Pcwstr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetValuesW(ld.rawAddress, entry.rawAddress, attr.rawAddress))

public actual fun ldapGetValuesLen(externalhandle: MutPtr, message: MutPtr, attr: Pcstr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetValuesLen(externalhandle.rawAddress, message.rawAddress, attr.rawAddress))

public actual fun ldapGetValuesLenA(externalhandle: MutPtr, message: MutPtr, attr: Pcstr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetValuesLenA(externalhandle.rawAddress, message.rawAddress, attr.rawAddress))

public actual fun ldapGetValuesLenW(externalhandle: MutPtr, message: MutPtr, attr: Pcwstr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapGetValuesLenW(externalhandle.rawAddress, message.rawAddress, attr.rawAddress))

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapInit(hostname.rawAddress, portnumber.toInt()))

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapInitA(hostname.rawAddress, portnumber.toInt()))

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapInitW(hostname.rawAddress, portnumber.toInt()))

public actual fun ldapMemfree(block: Pcstr) {
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapMemfree(block.rawAddress)
}

public actual fun ldapMemfreeA(block: Pcstr) {
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapMemfreeA(block.rawAddress)
}

public actual fun ldapMemfreeW(block: Pcwstr) {
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapMemfreeW(block.rawAddress)
}

public actual fun ldapModify(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModify(ld.rawAddress, dn.rawAddress, mods.rawAddress).toUInt()

public actual fun ldapModifyA(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifyA(ld.rawAddress, dn.rawAddress, mods.rawAddress).toUInt()

public actual fun ldapModifyW(ld: MutPtr, dn: Pcwstr, mods: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifyW(ld.rawAddress, dn.rawAddress, mods.rawAddress).toUInt()

public actual fun ldapModifyExt(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifyExt(ld.rawAddress, dn.rawAddress, mods.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapModifyExtA(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifyExtA(ld.rawAddress, dn.rawAddress, mods.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapModifyExtW(ld: MutPtr, dn: Pcwstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifyExtW(ld.rawAddress, dn.rawAddress, mods.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapModifyExtS(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifyExtS(ld.rawAddress, dn.rawAddress, mods.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapModifyExtSA(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifyExtSA(ld.rawAddress, dn.rawAddress, mods.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapModifyExtSW(ld: MutPtr, dn: Pcwstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifyExtSW(ld.rawAddress, dn.rawAddress, mods.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapModifyS(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifyS(ld.rawAddress, dn.rawAddress, mods.rawAddress).toUInt()

public actual fun ldapModifySA(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifySA(ld.rawAddress, dn.rawAddress, mods.rawAddress).toUInt()

public actual fun ldapModifySW(ld: MutPtr, dn: Pcwstr, mods: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModifySW(ld.rawAddress, dn.rawAddress, mods.rawAddress).toUInt()

public actual fun ldapModrdn(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdn(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress).toUInt()

public actual fun ldapModrdn2(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdn2(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress, deleteoldrdn).toUInt()

public actual fun ldapModrdn2A(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdn2A(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress, deleteoldrdn).toUInt()

public actual fun ldapModrdn2W(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdn2W(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress, deleteoldrdn).toUInt()

public actual fun ldapModrdn2S(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdn2S(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress, deleteoldrdn).toUInt()

public actual fun ldapModrdn2SA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdn2SA(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress, deleteoldrdn).toUInt()

public actual fun ldapModrdn2SW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdn2SW(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress, deleteoldrdn).toUInt()

public actual fun ldapModrdnA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdnA(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress).toUInt()

public actual fun ldapModrdnW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdnW(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress).toUInt()

public actual fun ldapModrdnS(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdnS(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress).toUInt()

public actual fun ldapModrdnSA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdnSA(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress).toUInt()

public actual fun ldapModrdnSW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapModrdnSW(externalhandle.rawAddress, distinguishedname.rawAddress, newdistinguishedname.rawAddress).toUInt()

public actual fun ldapMsgfree(res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapMsgfree(res.rawAddress).toUInt()

public actual fun ldapNextAttribute(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapNextAttribute(ld.rawAddress, entry.rawAddress, ptr.rawAddress))

public actual fun ldapNextAttributeA(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapNextAttributeA(ld.rawAddress, entry.rawAddress, ptr.rawAddress))

public actual fun ldapNextAttributeW(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pwstr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapNextAttributeW(ld.rawAddress, entry.rawAddress, ptr.rawAddress))

public actual fun ldapNextEntry(ld: MutPtr, entry: MutPtr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapNextEntry(ld.rawAddress, entry.rawAddress))

public actual fun ldapNextReference(ld: MutPtr, entry: MutPtr): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapNextReference(ld.rawAddress, entry.rawAddress))

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapOpen(hostname.rawAddress, portnumber.toInt()))

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapOpenA(hostname.rawAddress, portnumber.toInt()))

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapOpenW(hostname.rawAddress, portnumber.toInt()))

public actual fun ldapParseExtendedResultA(connection: MutPtr, resultmessage: MutPtr, resultoid: MutPtr, resultdata: MutPtr, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA(connection.rawAddress, resultmessage.rawAddress, resultoid.rawAddress, resultdata.rawAddress, freeit).toUInt()

public actual fun ldapParseExtendedResultW(connection: MutPtr, resultmessage: MutPtr, resultoid: MutPtr, resultdata: MutPtr, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW(connection.rawAddress, resultmessage.rawAddress, resultoid.rawAddress, resultdata.rawAddress, freeit).toUInt()

public actual fun ldapParsePageControl(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParsePageControl(externalhandle.rawAddress, servercontrols.rawAddress, totalcount.rawAddress, cookie.rawAddress).toUInt()

public actual fun ldapParsePageControlA(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParsePageControlA(externalhandle.rawAddress, servercontrols.rawAddress, totalcount.rawAddress, cookie.rawAddress).toUInt()

public actual fun ldapParsePageControlW(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParsePageControlW(externalhandle.rawAddress, servercontrols.rawAddress, totalcount.rawAddress, cookie.rawAddress).toUInt()

public actual fun ldapParseReference(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseReference(connection.rawAddress, resultmessage.rawAddress, referrals.rawAddress).toUInt()

public actual fun ldapParseReferenceA(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseReferenceA(connection.rawAddress, resultmessage.rawAddress, referrals.rawAddress).toUInt()

public actual fun ldapParseReferenceW(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseReferenceW(connection.rawAddress, resultmessage.rawAddress, referrals.rawAddress).toUInt()

public actual fun ldapParseResult(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseResult(connection.rawAddress, resultmessage.rawAddress, returncode.rawAddress, matcheddns.rawAddress, errormessage.rawAddress, referrals.rawAddress, servercontrols.rawAddress, freeit).toUInt()

public actual fun ldapParseResultA(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseResultA(connection.rawAddress, resultmessage.rawAddress, returncode.rawAddress, matcheddns.rawAddress, errormessage.rawAddress, referrals.rawAddress, servercontrols.rawAddress, freeit).toUInt()

public actual fun ldapParseResultW(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseResultW(connection.rawAddress, resultmessage.rawAddress, returncode.rawAddress, matcheddns.rawAddress, errormessage.rawAddress, referrals.rawAddress, servercontrols.rawAddress, freeit).toUInt()

public actual fun ldapParseSortControl(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseSortControl(externalhandle.rawAddress, control.rawAddress, result.rawAddress, attribute.rawAddress).toUInt()

public actual fun ldapParseSortControlA(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseSortControlA(externalhandle.rawAddress, control.rawAddress, result.rawAddress, attribute.rawAddress).toUInt()

public actual fun ldapParseSortControlW(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseSortControlW(externalhandle.rawAddress, control.rawAddress, result.rawAddress, attribute.rawAddress).toUInt()

public actual fun ldapParseVlvControlA(externalhandle: MutPtr, control: MutPtr, targetpos: MutPtr, listcount: MutPtr, context: MutPtr, errcode: MutPtr): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseVlvControlA(externalhandle.rawAddress, control.rawAddress, targetpos.rawAddress, listcount.rawAddress, context.rawAddress, errcode.rawAddress)

public actual fun ldapParseVlvControlW(externalhandle: MutPtr, control: MutPtr, targetpos: MutPtr, listcount: MutPtr, context: MutPtr, errcode: MutPtr): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapParseVlvControlW(externalhandle.rawAddress, control.rawAddress, targetpos.rawAddress, listcount.rawAddress, context.rawAddress, errcode.rawAddress)

public actual fun ldapPerror(ld: MutPtr, msg: Pcstr) {
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapPerror(ld.rawAddress, msg.rawAddress)
}

public actual fun ldapRenameExt(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapRenameExt(ld.rawAddress, dn.rawAddress, newrdn.rawAddress, newparent.rawAddress, deleteoldrdn, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapRenameExtA(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapRenameExtA(ld.rawAddress, dn.rawAddress, newrdn.rawAddress, newparent.rawAddress, deleteoldrdn, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapRenameExtW(ld: MutPtr, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapRenameExtW(ld.rawAddress, dn.rawAddress, newrdn.rawAddress, newparent.rawAddress, deleteoldrdn, servercontrols.rawAddress, clientcontrols.rawAddress, messagenumber.rawAddress).toUInt()

public actual fun ldapRenameExtS(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapRenameExtS(ld.rawAddress, dn.rawAddress, newrdn.rawAddress, newparent.rawAddress, deleteoldrdn, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapRenameExtSA(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapRenameExtSA(ld.rawAddress, dn.rawAddress, newrdn.rawAddress, newparent.rawAddress, deleteoldrdn, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapRenameExtSW(ld: MutPtr, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapRenameExtSW(ld.rawAddress, dn.rawAddress, newrdn.rawAddress, newparent.rawAddress, deleteoldrdn, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapResult(ld: MutPtr, msgid: UInt, all: UInt, timeout: ConstPtr, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapResult(ld.rawAddress, msgid.toInt(), all.toInt(), timeout.rawAddress, res.rawAddress).toUInt()

public actual fun ldapResult2error(ld: MutPtr, res: MutPtr, freeit: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapResult2error(ld.rawAddress, res.rawAddress, freeit.toInt()).toUInt()

public actual fun ldapSaslBindA(externalhandle: MutPtr, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, messagenumber: MutPtr): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSaslBindA(externalhandle.rawAddress, distname.rawAddress, authmechanism.rawAddress, cred.rawAddress, serverctrls.rawAddress, clientctrls.rawAddress, messagenumber.rawAddress)

public actual fun ldapSaslBindW(externalhandle: MutPtr, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, messagenumber: MutPtr): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSaslBindW(externalhandle.rawAddress, distname.rawAddress, authmechanism.rawAddress, cred.rawAddress, serverctrls.rawAddress, clientctrls.rawAddress, messagenumber.rawAddress)

public actual fun ldapSaslBindSA(externalhandle: MutPtr, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, serverdata: MutPtr): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSaslBindSA(externalhandle.rawAddress, distname.rawAddress, authmechanism.rawAddress, cred.rawAddress, serverctrls.rawAddress, clientctrls.rawAddress, serverdata.rawAddress)

public actual fun ldapSaslBindSW(externalhandle: MutPtr, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, serverdata: MutPtr): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSaslBindSW(externalhandle.rawAddress, distname.rawAddress, authmechanism.rawAddress, cred.rawAddress, serverctrls.rawAddress, clientctrls.rawAddress, serverdata.rawAddress)

public actual fun ldapSearch(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearch(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt()).toUInt()

public actual fun ldapSearchA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchA(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt()).toUInt()

public actual fun ldapSearchW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchW(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt()).toUInt()

public actual fun ldapSearchAbandonPage(externalhandle: MutPtr, searchblock: PLDAPSearch): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage(externalhandle.rawAddress, searchblock).toUInt()

public actual fun ldapSearchExt(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchExt(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), servercontrols.rawAddress, clientcontrols.rawAddress, timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress).toUInt()

public actual fun ldapSearchExtA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchExtA(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), servercontrols.rawAddress, clientcontrols.rawAddress, timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress).toUInt()

public actual fun ldapSearchExtW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchExtW(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), servercontrols.rawAddress, clientcontrols.rawAddress, timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress).toUInt()

public actual fun ldapSearchExtS(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchExtS(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), servercontrols.rawAddress, clientcontrols.rawAddress, timeout.rawAddress, sizelimit.toInt(), res.rawAddress).toUInt()

public actual fun ldapSearchExtSA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchExtSA(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), servercontrols.rawAddress, clientcontrols.rawAddress, timeout.rawAddress, sizelimit.toInt(), res.rawAddress).toUInt()

public actual fun ldapSearchExtSW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchExtSW(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), servercontrols.rawAddress, clientcontrols.rawAddress, timeout.rawAddress, sizelimit.toInt(), res.rawAddress).toUInt()

public actual fun ldapSearchInitPage(externalhandle: MutPtr, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: MutPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchInitPage(externalhandle.rawAddress, distinguishedname.rawAddress, scopeofsearch.toInt(), searchfilter.rawAddress, attributelist.rawAddress, attributesonly.toInt(), servercontrols.rawAddress, clientcontrols.rawAddress, pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress)

public actual fun ldapSearchInitPageA(externalhandle: MutPtr, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: ConstPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchInitPageA(externalhandle.rawAddress, distinguishedname.rawAddress, scopeofsearch.toInt(), searchfilter.rawAddress, attributelist.rawAddress, attributesonly.toInt(), servercontrols.rawAddress, clientcontrols.rawAddress, pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress)

public actual fun ldapSearchInitPageW(externalhandle: MutPtr, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: ConstPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchInitPageW(externalhandle.rawAddress, distinguishedname.rawAddress, scopeofsearch.toInt(), searchfilter.rawAddress, attributelist.rawAddress, attributesonly.toInt(), servercontrols.rawAddress, clientcontrols.rawAddress, pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress)

public actual fun ldapSearchS(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchS(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), res.rawAddress).toUInt()

public actual fun ldapSearchSA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchSA(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), res.rawAddress).toUInt()

public actual fun ldapSearchSW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchSW(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), res.rawAddress).toUInt()

public actual fun ldapSearchSt(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchSt(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), timeout.rawAddress, res.rawAddress).toUInt()

public actual fun ldapSearchStA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchStA(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), timeout.rawAddress, res.rawAddress).toUInt()

public actual fun ldapSearchStW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSearchStW(ld.rawAddress, base.rawAddress, scope.toInt(), filter.rawAddress, attrs.rawAddress, attrsonly.toInt(), timeout.rawAddress, res.rawAddress).toUInt()

public actual fun ldapSetDbgFlags(newflags: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(newflags.toInt()).toUInt()

public actual fun ldapSetDbgRoutine(debugprintroutine: Dbgprint) {
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine(0L)
}

public actual fun ldapSetOption(ld: MutPtr, option: Int, invalue: ConstPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSetOption(ld.rawAddress, option, invalue.rawAddress).toUInt()

public actual fun ldapSetOptionW(ld: MutPtr, option: Int, invalue: ConstPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSetOptionW(ld.rawAddress, option, invalue.rawAddress).toUInt()

public actual fun ldapSimpleBind(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSimpleBind(ld.rawAddress, dn.rawAddress, passwd.rawAddress).toUInt()

public actual fun ldapSimpleBindA(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSimpleBindA(ld.rawAddress, dn.rawAddress, passwd.rawAddress).toUInt()

public actual fun ldapSimpleBindW(ld: MutPtr, dn: Pcwstr, passwd: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSimpleBindW(ld.rawAddress, dn.rawAddress, passwd.rawAddress).toUInt()

public actual fun ldapSimpleBindS(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSimpleBindS(ld.rawAddress, dn.rawAddress, passwd.rawAddress).toUInt()

public actual fun ldapSimpleBindSA(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSimpleBindSA(ld.rawAddress, dn.rawAddress, passwd.rawAddress).toUInt()

public actual fun ldapSimpleBindSW(ld: MutPtr, dn: Pcwstr, passwd: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSimpleBindSW(ld.rawAddress, dn.rawAddress, passwd.rawAddress).toUInt()

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSslinit(hostname.rawAddress, portnumber.toInt(), secure))

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSslinitA(hostname.rawAddress, portnumber.toInt(), secure))

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): MutPtr =
    MutPtr(WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapSslinitW(hostname.rawAddress, portnumber.toInt(), secure))

public actual fun ldapStartTlsSA(externalhandle: MutPtr, serverreturnvalue: MutPtr, result: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapStartTlsSA(externalhandle.rawAddress, serverreturnvalue.rawAddress, result.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapStartTlsSW(externalhandle: MutPtr, serverreturnvalue: MutPtr, result: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapStartTlsSW(externalhandle.rawAddress, serverreturnvalue.rawAddress, result.rawAddress, servercontrols.rawAddress, clientcontrols.rawAddress).toUInt()

public actual fun ldapStartup(version: MutPtr, instance: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapStartup(version.rawAddress, instance.rawAddress).toUInt()

public actual fun ldapStopTlsS(externalhandle: MutPtr): Boolean =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapStopTlsS(externalhandle.rawAddress)

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapUfn2dn(ufn.rawAddress, pdn.rawAddress).toUInt()

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapUfn2dnA(ufn.rawAddress, pdn.rawAddress).toUInt()

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapUfn2dnW(ufn.rawAddress, pdn.rawAddress).toUInt()

public actual fun ldapUnbind(ld: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapUnbind(ld.rawAddress).toUInt()

public actual fun ldapUnbindS(ld: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapUnbindS(ld.rawAddress).toUInt()

public actual fun ldapValueFree(vals: ConstPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapValueFree(vals.rawAddress).toUInt()

public actual fun ldapValueFreeA(vals: ConstPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapValueFreeA(vals.rawAddress).toUInt()

public actual fun ldapValueFreeW(vals: ConstPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapValueFreeW(vals.rawAddress).toUInt()

public actual fun ldapValueFreeLen(vals: MutPtr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssysWindowsWin32NetworkingLdapLdapValueFreeLen(vals.rawAddress).toUInt()
