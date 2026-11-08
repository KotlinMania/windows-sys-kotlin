package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EXCEPTION_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EXCEPTION_ROUTINEFn
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MESSAGEBOX_STYLE

public fun interface FnCallback {
    public operator fun invoke(exceptioninfo: Long): Int
}

public fun interface FnCallback1 {
    public operator fun invoke(reason: IMAGEHLP_STATUS_REASON, imagename: PCSTR, dllname: PCSTR, va: ULong, parameter: ULong): BOOL
}

public fun interface FnCallback2 {
    public operator fun invoke(datatype: UInt, data: Long, datalength: Long, userdata: Long): BOOL
}

public fun interface FnCallback3 {
    public operator fun invoke(filepath: PCSTR, callerdata: Long): BOOL
}

public fun interface FnCallback4 {
    public operator fun invoke(filepath: PCWSTR, callerdata: Long): BOOL
}

public fun interface FnCallback5 {
    public operator fun invoke(modulename: PCSTR, modulebase: ULong, modulesize: UInt, usercontext: Long): BOOL
}

public fun interface FnCallback6 {
    public operator fun invoke(modulename: PCWSTR, modulebase: ULong, modulesize: UInt, usercontext: Long): BOOL
}

public fun interface FnCallback7 {
    public operator fun invoke(filehandle: HANDLE, filename: PCSTR, callerdata: Long): BOOL
}

public fun interface FnCallback8 {
    public operator fun invoke(filehandle: HANDLE, filename: PCWSTR, callerdata: Long): BOOL
}

public fun interface FnCallback9 {
    public operator fun invoke(refdata: Long, pdata: Long, dwlength: UInt): BOOL
}

public fun interface FnCallback10 {
    public operator fun invoke(wcthandle: Long, context: ULong, callbackstatus: UInt, nodecount: Long, nodeinfoarray: Long, iscycle: Long)
}

public fun interface FnCallback11 {
    public operator fun invoke(param0: Int, param1: Long): HRESULT
}

public fun interface FnCallback12 {
    public operator fun invoke(param0: GUID, param1: UInt, param2: Long): HRESULT
}

public fun interface FnCallback13 {
    public operator fun invoke(controlpc: ULong, context: Long): Long
}

public fun interface FnCallback14 {
    public operator fun invoke(): UInt
}

public fun interface FnCallback15 {
    public operator fun invoke(hprocess: HANDLE, qwbaseaddress: ULong, lpbuffer: Long, nsize: UInt, lpnumberofbytesread: Long): BOOL
}

public fun interface FnCallback16 {
    public operator fun invoke(ahprocess: HANDLE, addrbase: ULong): Long
}

public fun interface FnCallback17 {
    public operator fun invoke(hprocess: HANDLE, address: ULong): ULong
}

public fun interface FnCallback18 {
    public operator fun invoke(hprocess: HANDLE, hthread: HANDLE, lpaddr: Long): ULong
}

public fun interface FnCallback19 {
    public operator fun invoke(hprocess: HANDLE, attribute: UInt, attributedata: ULong, attributevalue: Long): BOOL
}

public fun interface FnCallback20 {
    public operator fun invoke(lineinfo: Long, usercontext: Long): BOOL
}

public fun interface FnCallback21 {
    public operator fun invoke(hprocess: HANDLE, usercontext: Long): BOOL
}

public fun interface FnCallback22 {
    public operator fun invoke(token: Long, size: ULong): BOOL
}

public fun interface FnCallback23 {
    public operator fun invoke(psyminfo: Long, symbolsize: UInt, usercontext: Long): BOOL
}

public fun interface FnCallback24 {
    public operator fun invoke(modulename: PCSTR, baseofdll: ULong, usercontext: Long): BOOL
}

public fun interface FnCallback25 {
    public operator fun invoke(modulename: PCWSTR, baseofdll: ULong, usercontext: Long): BOOL
}

public fun interface FnCallback26 {
    public operator fun invoke(hprocess: HANDLE, actioncode: UInt, callbackdata: ULong, usercontext: ULong): BOOL
}

public fun interface FnCallback27 {
    public operator fun invoke(hprocess: HANDLE, addrbase: ULong, usercontext: ULong): Long
}

public fun AddVectoredContinueHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddVectoredContinueHandler", longArrayOf(first.toLong(), Win32DynamicFfi.objectSlot(handler)))
}

public fun AddVectoredExceptionHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "AddVectoredExceptionHandler", longArrayOf(first.toLong(), Win32DynamicFfi.objectSlot(handler)))
}

public fun Beep(dwfreq: UInt, dwduration: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Beep", longArrayOf(dwfreq.toLong(), dwduration.toLong())).toInt()
}

public fun BindImage(imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "BindImage", longArrayOf(imagename, dllpath, symbolpath)).toInt()
}

public fun BindImageEx(flags: UInt, imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR, statusroutine: PIMAGEHLP_STATUS_ROUTINE): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "BindImageEx", longArrayOf(flags.toLong(), imagename, dllpath, symbolpath, Win32DynamicFfi.objectSlot(statusroutine))).toInt()
}

public fun CheckRemoteDebuggerPresent(hprocess: HANDLE, pbdebuggerpresent: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CheckRemoteDebuggerPresent", longArrayOf(hprocess, pbdebuggerpresent)).toInt()
}

public fun CheckSumMappedFile(baseaddress: Long, filelength: UInt, headersum: Long, checksum: Long): Long {
    return Win32DynamicFfi.invoke("imagehlp.dll", "CheckSumMappedFile", longArrayOf(baseaddress, filelength.toLong(), headersum, checksum))
}

public fun CloseThreadWaitChainSession(wcthandle: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "CloseThreadWaitChainSession", longArrayOf(wcthandle))
}

public fun ContinueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: NTSTATUS): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ContinueDebugEvent", longArrayOf(dwprocessid.toLong(), dwthreadid.toLong(), dwcontinuestatus.toLong())).toInt()
}

public fun CopyContext(destination: Long, contextflags: CONTEXT_FLAGS, source: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CopyContext", longArrayOf(destination, contextflags.toLong(), source)).toInt()
}

public fun DbgHelpCreateUserDump(filename: PCSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "DbgHelpCreateUserDump", longArrayOf(filename, Win32DynamicFfi.objectSlot(callback), userdata)).toInt()
}

public fun DbgHelpCreateUserDumpW(filename: PCWSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "DbgHelpCreateUserDumpW", longArrayOf(filename, Win32DynamicFfi.objectSlot(callback), userdata)).toInt()
}

public fun DebugActiveProcess(dwprocessid: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DebugActiveProcess", longArrayOf(dwprocessid.toLong())).toInt()
}

public fun DebugActiveProcessStop(dwprocessid: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DebugActiveProcessStop", longArrayOf(dwprocessid.toLong())).toInt()
}

public fun DebugBreak() {
    Win32DynamicFfi.invoke("kernel32.dll", "DebugBreak", longArrayOf())
}

public fun DebugBreakProcess(process: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DebugBreakProcess", longArrayOf(process)).toInt()
}

public fun DebugSetProcessKillOnExit(killonexit: BOOL): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DebugSetProcessKillOnExit", longArrayOf(killonexit.toLong())).toInt()
}

public fun DecodePointer(ptr: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "DecodePointer", longArrayOf(ptr))
}

public fun DecodeRemotePointer(processhandle: HANDLE, ptr: Long, decodedptr: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-util-l1-1-1.dll", "DecodeRemotePointer", longArrayOf(processhandle, ptr, decodedptr)).toInt()
}

public fun DecodeSystemPointer(ptr: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "DecodeSystemPointer", longArrayOf(ptr))
}

public fun EncodePointer(ptr: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "EncodePointer", longArrayOf(ptr))
}

public fun EncodeRemotePointer(processhandle: HANDLE, ptr: Long, encodedptr: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-core-util-l1-1-1.dll", "EncodeRemotePointer", longArrayOf(processhandle, ptr, encodedptr)).toInt()
}

public fun EncodeSystemPointer(ptr: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "EncodeSystemPointer", longArrayOf(ptr))
}

public fun EnumDirTree(hprocess: HANDLE, rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR, cb: PENUMDIRTREE_CALLBACK, data: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "EnumDirTree", longArrayOf(hprocess, rootpath, inputpathname, outputpathbuffer, Win32DynamicFfi.objectSlot(cb), data)).toInt()
}

public fun EnumDirTreeW(hprocess: HANDLE, rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR, cb: PENUMDIRTREE_CALLBACKW, data: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "EnumDirTreeW", longArrayOf(hprocess, rootpath, inputpathname, outputpathbuffer, Win32DynamicFfi.objectSlot(cb), data)).toInt()
}

public fun EnumerateLoadedModules64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "EnumerateLoadedModules64", longArrayOf(hprocess, Win32DynamicFfi.objectSlot(enumloadedmodulescallback), usercontext)).toInt()
}

public fun EnumerateLoadedModulesEx(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "EnumerateLoadedModulesEx", longArrayOf(hprocess, Win32DynamicFfi.objectSlot(enumloadedmodulescallback), usercontext)).toInt()
}

public fun EnumerateLoadedModulesExW(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "EnumerateLoadedModulesExW", longArrayOf(hprocess, Win32DynamicFfi.objectSlot(enumloadedmodulescallback), usercontext)).toInt()
}

public fun EnumerateLoadedModulesW64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "EnumerateLoadedModulesW64", longArrayOf(hprocess, Win32DynamicFfi.objectSlot(enumloadedmodulescallback), usercontext)).toInt()
}

public fun FatalAppExitA(uaction: UInt, lpmessagetext: PCSTR) {
    Win32DynamicFfi.invoke("kernel32.dll", "FatalAppExitA", longArrayOf(uaction.toLong(), lpmessagetext))
}

public fun FatalAppExitW(uaction: UInt, lpmessagetext: PCWSTR) {
    Win32DynamicFfi.invoke("kernel32.dll", "FatalAppExitW", longArrayOf(uaction.toLong(), lpmessagetext))
}

public fun FatalExit(exitcode: Int): Nothing {
    Win32DynamicFfi.invoke("kernel32.dll", "FatalExit", longArrayOf(exitcode.toLong()))
    error("unreachable")
}

public fun FindDebugInfoFile(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR): HANDLE {
    return Win32DynamicFfi.invoke("dbghelp.dll", "FindDebugInfoFile", longArrayOf(filename, symbolpath, debugfilepath))
}

public fun FindDebugInfoFileEx(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE {
    return Win32DynamicFfi.invoke("dbghelp.dll", "FindDebugInfoFileEx", longArrayOf(filename, symbolpath, debugfilepath, Win32DynamicFfi.objectSlot(callback), callerdata))
}

public fun FindDebugInfoFileExW(filename: PCWSTR, symbolpath: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE {
    return Win32DynamicFfi.invoke("dbghelp.dll", "FindDebugInfoFileExW", longArrayOf(filename, symbolpath, debugfilepath, Win32DynamicFfi.objectSlot(callback), callerdata))
}

public fun FindExecutableImage(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR): HANDLE {
    return Win32DynamicFfi.invoke("dbghelp.dll", "FindExecutableImage", longArrayOf(filename, symbolpath, imagefilepath))
}

public fun FindExecutableImageEx(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE {
    return Win32DynamicFfi.invoke("dbghelp.dll", "FindExecutableImageEx", longArrayOf(filename, symbolpath, imagefilepath, Win32DynamicFfi.objectSlot(callback), callerdata))
}

public fun FindExecutableImageExW(filename: PCWSTR, symbolpath: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE {
    return Win32DynamicFfi.invoke("dbghelp.dll", "FindExecutableImageExW", longArrayOf(filename, symbolpath, imagefilepath, Win32DynamicFfi.objectSlot(callback), callerdata))
}

public fun FindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: UInt, filepath: PSTR): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "FindFileInPath", longArrayOf(hprocess, searchpatha, filename, id, two.toLong(), three.toLong(), flags.toLong(), filepath)).toInt()
}

public fun FindFileInSearchPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, one: UInt, two: UInt, three: UInt, filepath: PSTR): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "FindFileInSearchPath", longArrayOf(hprocess, searchpatha, filename, one.toLong(), two.toLong(), three.toLong(), filepath)).toInt()
}

public fun FlushInstructionCache(hprocess: HANDLE, lpbaseaddress: Long, dwsize: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FlushInstructionCache", longArrayOf(hprocess, lpbaseaddress, dwsize.toLong())).toInt()
}

public fun FormatMessageA(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PSTR, nsize: UInt, arguments: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "FormatMessageA", longArrayOf(dwflags.toLong(), lpsource, dwmessageid.toLong(), dwlanguageid.toLong(), lpbuffer, nsize.toLong(), arguments)).toUInt()
}

public fun FormatMessageW(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PWSTR, nsize: UInt, arguments: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "FormatMessageW", longArrayOf(dwflags.toLong(), lpsource, dwmessageid.toLong(), dwlanguageid.toLong(), lpbuffer, nsize.toLong(), arguments)).toUInt()
}

public fun GetEnabledXStateFeatures(): ULong {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetEnabledXStateFeatures", longArrayOf()).toULong()
}

public fun GetErrorMode(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetErrorMode", longArrayOf()).toUInt()
}

public fun GetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "GetImageConfigInformation", longArrayOf(loadedimage, imageconfiginformation)).toInt()
}

public fun GetImageUnusedHeaderBytes(loadedimage: Long, sizeunusedheaderbytes: Long): UInt {
    return Win32DynamicFfi.invoke("imagehlp.dll", "GetImageUnusedHeaderBytes", longArrayOf(loadedimage, sizeunusedheaderbytes)).toUInt()
}

public fun GetSymLoadError(): UInt {
    return Win32DynamicFfi.invoke("dbghelp.dll", "GetSymLoadError", longArrayOf()).toUInt()
}

public fun GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadContext", longArrayOf(hthread, lpcontext)).toInt()
}

public fun GetThreadErrorMode(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadErrorMode", longArrayOf()).toUInt()
}

public fun GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetThreadSelectorEntry", longArrayOf(hthread, dwselector.toLong(), lpselectorentry)).toInt()
}

public fun GetThreadWaitChain(wcthandle: Long, context: ULong, flags: WAIT_CHAIN_THREAD_OPTIONS, threadid: UInt, nodecount: Long, nodeinfoarray: Long, iscycle: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetThreadWaitChain", longArrayOf(wcthandle, context.toLong(), flags.toLong(), threadid.toLong(), nodecount, nodeinfoarray, iscycle)).toInt()
}

public fun GetTimestampForLoadedLibrary(module: HMODULE): UInt {
    return Win32DynamicFfi.invoke("dbghelp.dll", "GetTimestampForLoadedLibrary", longArrayOf(module)).toUInt()
}

public fun GetXStateFeaturesMask(context: Long, featuremask: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetXStateFeaturesMask", longArrayOf(context, featuremask)).toInt()
}

public fun ImageAddCertificate(filehandle: HANDLE, certificate: Long, index: Long): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "ImageAddCertificate", longArrayOf(filehandle, certificate, index)).toInt()
}

public fun ImageDirectoryEntryToData(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long): Long {
    return Win32DynamicFfi.invoke("dbghelp.dll", "ImageDirectoryEntryToData", longArrayOf(base, if (mappedasimage) 1L else 0L, directoryentry.toLong(), size))
}

public fun ImageDirectoryEntryToDataEx(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long, foundheader: Long): Long {
    return Win32DynamicFfi.invoke("dbghelp.dll", "ImageDirectoryEntryToDataEx", longArrayOf(base, if (mappedasimage) 1L else 0L, directoryentry.toLong(), size, foundheader))
}

public fun ImageEnumerateCertificates(filehandle: HANDLE, typefilter: UShort, certificatecount: Long, indices: Long, indexcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "ImageEnumerateCertificates", longArrayOf(filehandle, typefilter.toLong(), certificatecount, indices, indexcount.toLong())).toInt()
}

public fun ImageGetCertificateData(filehandle: HANDLE, certificateindex: UInt, certificate: Long, requiredlength: Long): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "ImageGetCertificateData", longArrayOf(filehandle, certificateindex.toLong(), certificate, requiredlength)).toInt()
}

public fun ImageGetCertificateHeader(filehandle: HANDLE, certificateindex: UInt, certificateheader: Long): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "ImageGetCertificateHeader", longArrayOf(filehandle, certificateindex.toLong(), certificateheader)).toInt()
}

public fun ImageGetDigestStream(filehandle: HANDLE, digestlevel: UInt, digestfunction: DIGEST_FUNCTION, digesthandle: Long): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "ImageGetDigestStream", longArrayOf(filehandle, digestlevel.toLong(), Win32DynamicFfi.objectSlot(digestfunction), digesthandle)).toInt()
}

public fun ImageLoad(dllname: PCSTR, dllpath: PCSTR): Long {
    return Win32DynamicFfi.invoke("imagehlp.dll", "ImageLoad", longArrayOf(dllname, dllpath))
}

public fun ImageNtHeader(base: Long): Long {
    return Win32DynamicFfi.invoke("dbghelp.dll", "ImageNtHeader", longArrayOf(base))
}

public fun ImageRemoveCertificate(filehandle: HANDLE, index: UInt): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "ImageRemoveCertificate", longArrayOf(filehandle, index.toLong())).toInt()
}

public fun ImageRvaToSection(ntheaders: Long, base: Long, rva: UInt): Long {
    return Win32DynamicFfi.invoke("dbghelp.dll", "ImageRvaToSection", longArrayOf(ntheaders, base, rva.toLong()))
}

public fun ImageRvaToVa(ntheaders: Long, base: Long, rva: UInt, lastrvasection: Long): Long {
    return Win32DynamicFfi.invoke("dbghelp.dll", "ImageRvaToVa", longArrayOf(ntheaders, base, rva.toLong(), lastrvasection))
}

public fun ImageUnload(loadedimage: Long): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "ImageUnload", longArrayOf(loadedimage)).toInt()
}

public fun ImagehlpApiVersion(): Long {
    return Win32DynamicFfi.invoke("dbghelp.dll", "ImagehlpApiVersion", longArrayOf())
}

public fun ImagehlpApiVersionEx(appversion: Long): Long {
    return Win32DynamicFfi.invoke("dbghelp.dll", "ImagehlpApiVersionEx", longArrayOf(appversion))
}

public fun InitializeContext(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitializeContext", longArrayOf(buffer, contextflags.toLong(), context, contextlength)).toInt()
}

public fun InitializeContext2(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long, xstatecompactionmask: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "InitializeContext2", longArrayOf(buffer, contextflags.toLong(), context, contextlength, xstatecompactionmask.toLong())).toInt()
}

public fun IsDebuggerPresent(): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "IsDebuggerPresent", longArrayOf()).toInt()
}

public fun LocateXStateFeature(context: Long, featureid: UInt, length: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "LocateXStateFeature", longArrayOf(context, featureid.toLong(), length))
}

public fun MakeSureDirectoryPathExists(dirpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "MakeSureDirectoryPathExists", longArrayOf(dirpath)).toInt()
}

public fun MapAndLoad(imagename: PCSTR, dllpath: PCSTR, loadedimage: Long, dotdll: BOOL, readonly: BOOL): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "MapAndLoad", longArrayOf(imagename, dllpath, loadedimage, dotdll.toLong(), readonly.toLong())).toInt()
}

public fun MapFileAndCheckSumA(filename: PCSTR, headersum: Long, checksum: Long): UInt {
    return Win32DynamicFfi.invoke("imagehlp.dll", "MapFileAndCheckSumA", longArrayOf(filename, headersum, checksum)).toUInt()
}

public fun MapFileAndCheckSumW(filename: PCWSTR, headersum: Long, checksum: Long): UInt {
    return Win32DynamicFfi.invoke("imagehlp.dll", "MapFileAndCheckSumW", longArrayOf(filename, headersum, checksum)).toUInt()
}

public fun MessageBeep(utype: MESSAGEBOX_STYLE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "MessageBeep", longArrayOf(utype.toLong())).toInt()
}

public fun MiniDumpReadDumpStream(baseofdump: Long, streamnumber: UInt, dir: Long, streampointer: Long, streamsize: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "MiniDumpReadDumpStream", longArrayOf(baseofdump, streamnumber.toLong(), dir, streampointer, streamsize)).toInt()
}

public fun MiniDumpWriteDump(hprocess: HANDLE, processid: UInt, hfile: HANDLE, dumptype: MINIDUMP_TYPE, exceptionparam: Long, userstreamparam: Long, callbackparam: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "MiniDumpWriteDump", longArrayOf(hprocess, processid.toLong(), hfile, dumptype.toLong(), exceptionparam, userstreamparam, callbackparam)).toInt()
}

public fun OpenThreadWaitChainSession(flags: OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS, callback: PWAITCHAINCALLBACK): Long {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenThreadWaitChainSession", longArrayOf(flags.toLong(), Win32DynamicFfi.objectSlot(callback)))
}

public fun OutputDebugStringA(lpoutputstring: PCSTR) {
    Win32DynamicFfi.invoke("kernel32.dll", "OutputDebugStringA", longArrayOf(lpoutputstring))
}

public fun OutputDebugStringW(lpoutputstring: PCWSTR) {
    Win32DynamicFfi.invoke("kernel32.dll", "OutputDebugStringW", longArrayOf(lpoutputstring))
}

public fun RaiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "RaiseException", longArrayOf(dwexceptioncode.toLong(), dwexceptionflags.toLong(), nnumberofarguments.toLong(), lparguments))
}

public fun RaiseFailFastException(pexceptionrecord: Long, pcontextrecord: Long, dwflags: UInt) {
    Win32DynamicFfi.invoke("kernel32.dll", "RaiseFailFastException", longArrayOf(pexceptionrecord, pcontextrecord, dwflags.toLong()))
}

public fun RangeMapAddPeImageSections(rmaphandle: Long, imagename: PCWSTR, mappedimage: Long, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "RangeMapAddPeImageSections", longArrayOf(rmaphandle, imagename, mappedimage, mappingbytes.toLong(), imagebase.toLong(), usertag.toLong(), mappingflags.toLong())).toInt()
}

public fun RangeMapCreate(): Long {
    return Win32DynamicFfi.invoke("dbghelp.dll", "RangeMapCreate", longArrayOf())
}

public fun RangeMapFree(rmaphandle: Long) {
    Win32DynamicFfi.invoke("dbghelp.dll", "RangeMapFree", longArrayOf(rmaphandle))
}

public fun RangeMapRead(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "RangeMapRead", longArrayOf(rmaphandle, offset.toLong(), buffer, requestbytes.toLong(), flags.toLong(), donebytes)).toInt()
}

public fun RangeMapRemove(rmaphandle: Long, usertag: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "RangeMapRemove", longArrayOf(rmaphandle, usertag.toLong())).toInt()
}

public fun RangeMapWrite(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "RangeMapWrite", longArrayOf(rmaphandle, offset.toLong(), buffer, requestbytes.toLong(), flags.toLong(), donebytes)).toInt()
}

public fun ReBaseImage(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "ReBaseImage", longArrayOf(currentimagename, symbolpath, frebase.toLong(), frebasesysfileok.toLong(), fgoingdown.toLong(), checkimagesize.toLong(), oldimagesize, oldimagebase, newimagesize, newimagebase, timestamp.toLong())).toInt()
}

public fun ReBaseImage64(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "ReBaseImage64", longArrayOf(currentimagename, symbolpath, frebase.toLong(), frebasesysfileok.toLong(), fgoingdown.toLong(), checkimagesize.toLong(), oldimagesize, oldimagebase, newimagesize, newimagebase, timestamp.toLong())).toInt()
}

public fun ReadProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbytesread: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ReadProcessMemory", longArrayOf(hprocess, lpbaseaddress, lpbuffer, nsize.toLong(), lpnumberofbytesread)).toInt()
}

public fun RegisterWaitChainCOMCallback(callstatecallback: PCOGETCALLSTATE, activationstatecallback: PCOGETACTIVATIONSTATE) {
    Win32DynamicFfi.invoke("advapi32.dll", "RegisterWaitChainCOMCallback", longArrayOf(Win32DynamicFfi.objectSlot(callstatecallback), Win32DynamicFfi.objectSlot(activationstatecallback)))
}

public fun RemoveInvalidModuleList(hprocess: HANDLE) {
    Win32DynamicFfi.invoke("dbghelp.dll", "RemoveInvalidModuleList", longArrayOf(hprocess))
}

public fun RemoveVectoredContinueHandler(handle: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "RemoveVectoredContinueHandler", longArrayOf(handle)).toUInt()
}

public fun RemoveVectoredExceptionHandler(handle: Long): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "RemoveVectoredExceptionHandler", longArrayOf(handle)).toUInt()
}

public fun ReportSymbolLoadSummary(hprocess: HANDLE, ploadmodule: PCWSTR, psymboldata: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "ReportSymbolLoadSummary", longArrayOf(hprocess, ploadmodule, psymboldata)).toInt()
}

public fun RtlAddFunctionTable(functiontable: Long, entrycount: UInt, baseaddress: ULong): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "RtlAddFunctionTable", longArrayOf(functiontable, entrycount.toLong(), baseaddress.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlAddGrowableFunctionTable(dynamictable: Long, functiontable: Long, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlAddGrowableFunctionTable", longArrayOf(dynamictable, functiontable, entrycount.toLong(), maximumentrycount.toLong(), rangebase.toLong(), rangeend.toLong())).toUInt()
}

public fun RtlCaptureContext(contextrecord: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "RtlCaptureContext", longArrayOf(contextrecord))
}

public fun RtlCaptureContext2(contextrecord: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "RtlCaptureContext2", longArrayOf(contextrecord))
}

public fun RtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: Long, backtracehash: Long): UShort {
    return Win32DynamicFfi.invoke("kernel32.dll", "RtlCaptureStackBackTrace", longArrayOf(framestoskip.toLong(), framestocapture.toLong(), backtrace, backtracehash)).toUShort()
}

public fun RtlDeleteFunctionTable(functiontable: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "RtlDeleteFunctionTable", longArrayOf(functiontable))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlDeleteGrowableFunctionTable(dynamictable: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlDeleteGrowableFunctionTable", longArrayOf(dynamictable))
}

public fun RtlGrowFunctionTable(dynamictable: Long, newentrycount: UInt) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlGrowFunctionTable", longArrayOf(dynamictable, newentrycount.toLong()))
}

public fun RtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PGET_RUNTIME_FUNCTION_CALLBACK, context: Long, outofprocesscallbackdll: PCWSTR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "RtlInstallFunctionTableCallback", longArrayOf(tableidentifier.toLong(), baseaddress.toLong(), length.toLong(), Win32DynamicFfi.objectSlot(callback), context, outofprocesscallbackdll))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlLookupFunctionEntry(controlpc: ULong, imagebase: Long, historytable: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "RtlLookupFunctionEntry", longArrayOf(controlpc.toLong(), imagebase, historytable))
}

public fun RtlPcToFileHeader(pcvalue: Long, baseofimage: Long): Long {
    return Win32DynamicFfi.invoke("kernel32.dll", "RtlPcToFileHeader", longArrayOf(pcvalue, baseofimage))
}

public fun RtlRaiseException(exceptionrecord: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "RtlRaiseException", longArrayOf(exceptionrecord))
}

public fun RtlRestoreContext(contextrecord: Long, exceptionrecord: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "RtlRestoreContext", longArrayOf(contextrecord, exceptionrecord))
}

public fun RtlUnwind(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "RtlUnwind", longArrayOf(targetframe, targetip, exceptionrecord, returnvalue))
}

public fun RtlUnwindEx(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long, contextrecord: Long, historytable: Long) {
    Win32DynamicFfi.invoke("kernel32.dll", "RtlUnwindEx", longArrayOf(targetframe, targetip, exceptionrecord, returnvalue, contextrecord, historytable))
}

public fun RtlVirtualUnwind(handlertype: RTL_VIRTUAL_UNWIND_HANDLER_TYPE, imagebase: ULong, controlpc: ULong, functionentry: Long, contextrecord: Long, handlerdata: Long, establisherframe: Long, contextpointers: Long): EXCEPTION_ROUTINE {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "RtlVirtualUnwind", longArrayOf(handlertype.toLong(), imagebase.toLong(), controlpc.toLong(), functionentry, contextrecord, handlerdata, establisherframe, contextpointers))
    return if (rawRet == 0L) null else EXCEPTION_ROUTINEFn { p0, p1, p2, p3 -> Win32DynamicFfi.invokePtr(rawRet, longArrayOf(p0, p1, p2, p3)).toInt() }
}

public fun SearchTreeForFile(rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SearchTreeForFile", longArrayOf(rootpath, inputpathname, outputpathbuffer)).toInt()
}

public fun SearchTreeForFileW(rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SearchTreeForFileW", longArrayOf(rootpath, inputpathname, outputpathbuffer)).toInt()
}

public fun SetCheckUserInterruptShared(lpstartaddress: LPCALL_BACK_USER_INTERRUPT_ROUTINE) {
    Win32DynamicFfi.invoke("dbghelp.dll", "SetCheckUserInterruptShared", longArrayOf(Win32DynamicFfi.objectSlot(lpstartaddress)))
}

public fun SetErrorMode(umode: THREAD_ERROR_MODE): THREAD_ERROR_MODE {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetErrorMode", longArrayOf(umode.toLong())).toUInt()
}

public fun SetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "SetImageConfigInformation", longArrayOf(loadedimage, imageconfiginformation)).toInt()
}

public fun SetSymLoadError(error: UInt) {
    Win32DynamicFfi.invoke("dbghelp.dll", "SetSymLoadError", longArrayOf(error.toLong()))
}

public fun SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadContext", longArrayOf(hthread, lpcontext)).toInt()
}

public fun SetThreadErrorMode(dwnewmode: THREAD_ERROR_MODE, lpoldmode: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetThreadErrorMode", longArrayOf(dwnewmode.toLong(), lpoldmode)).toInt()
}

public fun SetUnhandledExceptionFilter(lptoplevelexceptionfilter: LPTOP_LEVEL_EXCEPTION_FILTER): LPTOP_LEVEL_EXCEPTION_FILTER {
    val rawRet = Win32DynamicFfi.invoke("kernel32.dll", "SetUnhandledExceptionFilter", longArrayOf(Win32DynamicFfi.objectSlot(lptoplevelexceptionfilter)))
    return if (rawRet == 0L) null else LPTOP_LEVEL_EXCEPTION_FILTERFn { p0 -> Win32DynamicFfi.invokePtr(rawRet, longArrayOf(p0)).toInt() }
}

public fun SetXStateFeaturesMask(context: Long, featuremask: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "SetXStateFeaturesMask", longArrayOf(context, featuremask.toLong())).toInt()
}

public fun StackWalk2(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, gettargetattributevalue: PGET_TARGET_ATTRIBUTE_VALUE64, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "StackWalk2", longArrayOf(machinetype.toLong(), hprocess, hthread, stackframe, contextrecord, Win32DynamicFfi.objectSlot(readmemoryroutine), Win32DynamicFfi.objectSlot(functiontableaccessroutine), Win32DynamicFfi.objectSlot(getmodulebaseroutine), Win32DynamicFfi.objectSlot(translateaddress), Win32DynamicFfi.objectSlot(gettargetattributevalue), flags.toLong())).toInt()
}

public fun StackWalk64(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "StackWalk64", longArrayOf(machinetype.toLong(), hprocess, hthread, stackframe, contextrecord, Win32DynamicFfi.objectSlot(readmemoryroutine), Win32DynamicFfi.objectSlot(functiontableaccessroutine), Win32DynamicFfi.objectSlot(getmodulebaseroutine), Win32DynamicFfi.objectSlot(translateaddress))).toInt()
}

public fun StackWalkEx(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "StackWalkEx", longArrayOf(machinetype.toLong(), hprocess, hthread, stackframe, contextrecord, Win32DynamicFfi.objectSlot(readmemoryroutine), Win32DynamicFfi.objectSlot(functiontableaccessroutine), Win32DynamicFfi.objectSlot(getmodulebaseroutine), Win32DynamicFfi.objectSlot(translateaddress), flags.toLong())).toInt()
}

public fun SymAddSourceStream(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymAddSourceStream", longArrayOf(hprocess, base.toLong(), streamfile, buffer, size.toLong())).toInt()
}

public fun SymAddSourceStreamA(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymAddSourceStreamA", longArrayOf(hprocess, base.toLong(), streamfile, buffer, size.toLong())).toInt()
}

public fun SymAddSourceStreamW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, buffer: Long, size: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymAddSourceStreamW", longArrayOf(hprocess, base.toLong(), filespec, buffer, size.toLong())).toInt()
}

public fun SymAddSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, size: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymAddSymbol", longArrayOf(hprocess, baseofdll.toLong(), name, address.toLong(), size.toLong(), flags.toLong())).toInt()
}

public fun SymAddSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, size: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymAddSymbolW", longArrayOf(hprocess, baseofdll.toLong(), name, address.toLong(), size.toLong(), flags.toLong())).toInt()
}

public fun SymAddrIncludeInlineTrace(hprocess: HANDLE, address: ULong): UInt {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymAddrIncludeInlineTrace", longArrayOf(hprocess, address.toLong())).toUInt()
}

public fun SymCleanup(hprocess: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymCleanup", longArrayOf(hprocess)).toInt()
}

public fun SymCompareInlineTrace(hprocess: HANDLE, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymCompareInlineTrace", longArrayOf(hprocess, address1.toLong(), inlinecontext1.toLong(), retaddress1.toLong(), address2.toLong(), retaddress2.toLong())).toUInt()
}

public fun SymDeleteSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymDeleteSymbol", longArrayOf(hprocess, baseofdll.toLong(), name, address.toLong(), flags.toLong())).toInt()
}

public fun SymDeleteSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymDeleteSymbolW", longArrayOf(hprocess, baseofdll.toLong(), name, address.toLong(), flags.toLong())).toInt()
}

public fun SymEnumLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumLines", longArrayOf(hprocess, base.toLong(), obj, file, Win32DynamicFfi.objectSlot(enumlinescallback), usercontext)).toInt()
}

public fun SymEnumLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumLinesW", longArrayOf(hprocess, base.toLong(), obj, file, Win32DynamicFfi.objectSlot(enumlinescallback), usercontext)).toInt()
}

public fun SymEnumProcesses(enumprocessescallback: PSYM_ENUMPROCESSES_CALLBACK, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumProcesses", longArrayOf(Win32DynamicFfi.objectSlot(enumprocessescallback), usercontext)).toInt()
}

public fun SymEnumSourceFileTokens(hprocess: HANDLE, base: ULong, callback: PENUMSOURCEFILETOKENSCALLBACK): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSourceFileTokens", longArrayOf(hprocess, base.toLong(), Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun SymEnumSourceFiles(hprocess: HANDLE, modbase: ULong, mask: PCSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACK, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSourceFiles", longArrayOf(hprocess, modbase.toLong(), mask, Win32DynamicFfi.objectSlot(cbsrcfiles), usercontext)).toInt()
}

public fun SymEnumSourceFilesW(hprocess: HANDLE, modbase: ULong, mask: PCWSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACKW, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSourceFilesW", longArrayOf(hprocess, modbase.toLong(), mask, Win32DynamicFfi.objectSlot(cbsrcfiles), usercontext)).toInt()
}

public fun SymEnumSourceLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSourceLines", longArrayOf(hprocess, base.toLong(), obj, file, line.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(enumlinescallback), usercontext)).toInt()
}

public fun SymEnumSourceLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSourceLinesW", longArrayOf(hprocess, base.toLong(), obj, file, line.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(enumlinescallback), usercontext)).toInt()
}

public fun SymEnumSym(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSym", longArrayOf(hprocess, baseofdll.toLong(), Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymEnumSymbols(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSymbols", longArrayOf(hprocess, baseofdll.toLong(), mask, Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymEnumSymbolsEx(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSymbolsEx", longArrayOf(hprocess, baseofdll.toLong(), mask, Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext, options.toLong())).toInt()
}

public fun SymEnumSymbolsExW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSymbolsExW", longArrayOf(hprocess, baseofdll.toLong(), mask, Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext, options.toLong())).toInt()
}

public fun SymEnumSymbolsForAddr(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSymbolsForAddr", longArrayOf(hprocess, address.toLong(), Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymEnumSymbolsForAddrW(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSymbolsForAddrW", longArrayOf(hprocess, address.toLong(), Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymEnumSymbolsW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumSymbolsW", longArrayOf(hprocess, baseofdll.toLong(), mask, Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymEnumTypes(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumTypes", longArrayOf(hprocess, baseofdll.toLong(), Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymEnumTypesByName(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumTypesByName", longArrayOf(hprocess, baseofdll.toLong(), mask, Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymEnumTypesByNameW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumTypesByNameW", longArrayOf(hprocess, baseofdll.toLong(), mask, Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymEnumTypesW(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumTypesW", longArrayOf(hprocess, baseofdll.toLong(), Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymEnumerateModules64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACK64, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumerateModules64", longArrayOf(hprocess, Win32DynamicFfi.objectSlot(enummodulescallback), usercontext)).toInt()
}

public fun SymEnumerateModulesW64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACKW64, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumerateModulesW64", longArrayOf(hprocess, Win32DynamicFfi.objectSlot(enummodulescallback), usercontext)).toInt()
}

public fun SymEnumerateSymbols64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumerateSymbols64", longArrayOf(hprocess, baseofdll.toLong(), Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymEnumerateSymbolsW64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64W, usercontext: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymEnumerateSymbolsW64", longArrayOf(hprocess, baseofdll.toLong(), Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext)).toInt()
}

public fun SymFindDebugInfoFile(hprocess: HANDLE, filename: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFindDebugInfoFile", longArrayOf(hprocess, filename, debugfilepath, Win32DynamicFfi.objectSlot(callback), callerdata))
}

public fun SymFindDebugInfoFileW(hprocess: HANDLE, filename: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFindDebugInfoFileW", longArrayOf(hprocess, filename, debugfilepath, Win32DynamicFfi.objectSlot(callback), callerdata))
}

public fun SymFindExecutableImage(hprocess: HANDLE, filename: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFindExecutableImage", longArrayOf(hprocess, filename, imagefilepath, Win32DynamicFfi.objectSlot(callback), callerdata))
}

public fun SymFindExecutableImageW(hprocess: HANDLE, filename: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFindExecutableImageW", longArrayOf(hprocess, filename, imagefilepath, Win32DynamicFfi.objectSlot(callback), callerdata))
}

public fun SymFindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PSTR, callback: PFINDFILEINPATHCALLBACK, context: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFindFileInPath", longArrayOf(hprocess, searchpatha, filename, id, two.toLong(), three.toLong(), flags.toLong(), foundfile, Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun SymFindFileInPathW(hprocess: HANDLE, searchpatha: PCWSTR, filename: PCWSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PWSTR, callback: PFINDFILEINPATHCALLBACKW, context: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFindFileInPathW", longArrayOf(hprocess, searchpatha, filename, id, two.toLong(), three.toLong(), flags.toLong(), foundfile, Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun SymFromAddr(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFromAddr", longArrayOf(hprocess, address.toLong(), displacement, symbol)).toInt()
}

public fun SymFromAddrW(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFromAddrW", longArrayOf(hprocess, address.toLong(), displacement, symbol)).toInt()
}

public fun SymFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFromIndex", longArrayOf(hprocess, baseofdll.toLong(), index.toLong(), symbol)).toInt()
}

public fun SymFromIndexW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFromIndexW", longArrayOf(hprocess, baseofdll.toLong(), index.toLong(), symbol)).toInt()
}

public fun SymFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFromInlineContext", longArrayOf(hprocess, address.toLong(), inlinecontext.toLong(), displacement, symbol)).toInt()
}

public fun SymFromInlineContextW(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFromInlineContextW", longArrayOf(hprocess, address.toLong(), inlinecontext.toLong(), displacement, symbol)).toInt()
}

public fun SymFromName(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFromName", longArrayOf(hprocess, name, symbol)).toInt()
}

public fun SymFromNameW(hprocess: HANDLE, name: PCWSTR, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFromNameW", longArrayOf(hprocess, name, symbol)).toInt()
}

public fun SymFromToken(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFromToken", longArrayOf(hprocess, base.toLong(), token.toLong(), symbol)).toInt()
}

public fun SymFromTokenW(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFromTokenW", longArrayOf(hprocess, base.toLong(), token.toLong(), symbol)).toInt()
}

public fun SymFunctionTableAccess64(hprocess: HANDLE, addrbase: ULong): Long {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFunctionTableAccess64", longArrayOf(hprocess, addrbase.toLong()))
}

public fun SymFunctionTableAccess64AccessRoutines(hprocess: HANDLE, addrbase: ULong, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64): Long {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymFunctionTableAccess64AccessRoutines", longArrayOf(hprocess, addrbase.toLong(), Win32DynamicFfi.objectSlot(readmemoryroutine), Win32DynamicFfi.objectSlot(getmodulebaseroutine)))
}

public fun SymGetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetExtendedOption", longArrayOf(option.toLong())).toInt()
}

public fun SymGetFileLineOffsets64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, buffer: Long, bufferlines: UInt): UInt {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetFileLineOffsets64", longArrayOf(hprocess, modulename, filename, buffer, bufferlines.toLong())).toUInt()
}

public fun SymGetHomeDirectory(type: UInt, dir: PSTR, size: ULong): PSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetHomeDirectory", longArrayOf(type.toLong(), dir, size.toLong()))
}

public fun SymGetHomeDirectoryW(type: UInt, dir: PWSTR, size: ULong): PWSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetHomeDirectoryW", longArrayOf(type.toLong(), dir, size.toLong()))
}

public fun SymGetLineFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, line64: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetLineFromAddr64", longArrayOf(hprocess, qwaddr.toLong(), pdwdisplacement, line64)).toInt()
}

public fun SymGetLineFromAddrW64(hprocess: HANDLE, dwaddr: ULong, pdwdisplacement: Long, line: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetLineFromAddrW64", longArrayOf(hprocess, dwaddr.toLong(), pdwdisplacement, line)).toInt()
}

public fun SymGetLineFromInlineContext(hprocess: HANDLE, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line64: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetLineFromInlineContext", longArrayOf(hprocess, qwaddr.toLong(), inlinecontext.toLong(), qwmodulebaseaddress.toLong(), pdwdisplacement, line64)).toInt()
}

public fun SymGetLineFromInlineContextW(hprocess: HANDLE, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetLineFromInlineContextW", longArrayOf(hprocess, dwaddr.toLong(), inlinecontext.toLong(), qwmodulebaseaddress.toLong(), pdwdisplacement, line)).toInt()
}

public fun SymGetLineFromName64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetLineFromName64", longArrayOf(hprocess, modulename, filename, dwlinenumber.toLong(), pldisplacement, line)).toInt()
}

public fun SymGetLineFromNameW64(hprocess: HANDLE, modulename: PCWSTR, filename: PCWSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetLineFromNameW64", longArrayOf(hprocess, modulename, filename, dwlinenumber.toLong(), pldisplacement, line)).toInt()
}

public fun SymGetLineNext64(hprocess: HANDLE, line: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetLineNext64", longArrayOf(hprocess, line)).toInt()
}

public fun SymGetLineNextW64(hprocess: HANDLE, line: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetLineNextW64", longArrayOf(hprocess, line)).toInt()
}

public fun SymGetLinePrev64(hprocess: HANDLE, line: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetLinePrev64", longArrayOf(hprocess, line)).toInt()
}

public fun SymGetLinePrevW64(hprocess: HANDLE, line: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetLinePrevW64", longArrayOf(hprocess, line)).toInt()
}

public fun SymGetModuleBase64(hprocess: HANDLE, qwaddr: ULong): ULong {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetModuleBase64", longArrayOf(hprocess, qwaddr.toLong())).toULong()
}

public fun SymGetModuleInfo64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetModuleInfo64", longArrayOf(hprocess, qwaddr.toLong(), moduleinfo)).toInt()
}

public fun SymGetModuleInfoW64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetModuleInfoW64", longArrayOf(hprocess, qwaddr.toLong(), moduleinfo)).toInt()
}

public fun SymGetOmaps(hprocess: HANDLE, baseofdll: ULong, omapto: Long, comapto: Long, omapfrom: Long, comapfrom: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetOmaps", longArrayOf(hprocess, baseofdll.toLong(), omapto, comapto, omapfrom, comapfrom)).toInt()
}

public fun SymGetOptions(): UInt {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetOptions", longArrayOf()).toUInt()
}

public fun SymGetScope(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetScope", longArrayOf(hprocess, baseofdll.toLong(), index.toLong(), symbol)).toInt()
}

public fun SymGetScopeW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetScopeW", longArrayOf(hprocess, baseofdll.toLong(), index.toLong(), symbol)).toInt()
}

public fun SymGetSearchPath(hprocess: HANDLE, searchpatha: PSTR, searchpathlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSearchPath", longArrayOf(hprocess, searchpatha, searchpathlength.toLong())).toInt()
}

public fun SymGetSearchPathW(hprocess: HANDLE, searchpatha: PWSTR, searchpathlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSearchPathW", longArrayOf(hprocess, searchpatha, searchpathlength.toLong())).toInt()
}

public fun SymGetSourceFile(hprocess: HANDLE, base: ULong, params: PCSTR, filespec: PCSTR, filepath: PSTR, size: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFile", longArrayOf(hprocess, base.toLong(), params, filespec, filepath, size.toLong())).toInt()
}

public fun SymGetSourceFileChecksum(hprocess: HANDLE, base: ULong, filespec: PCSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileChecksum", longArrayOf(hprocess, base.toLong(), filespec, pchecksumtype, pchecksum, checksumsize.toLong(), pactualbyteswritten)).toInt()
}

public fun SymGetSourceFileChecksumW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileChecksumW", longArrayOf(hprocess, base.toLong(), filespec, pchecksumtype, pchecksum, checksumsize.toLong(), pactualbyteswritten)).toInt()
}

public fun SymGetSourceFileFromToken(hprocess: HANDLE, token: Long, params: PCSTR, filepath: PSTR, size: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileFromToken", longArrayOf(hprocess, token, params, filepath, size.toLong())).toInt()
}

public fun SymGetSourceFileFromTokenByTokenName(hprocess: HANDLE, token: Long, tokenname: PCSTR, params: PCSTR, filepath: PSTR, size: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileFromTokenByTokenName", longArrayOf(hprocess, token, tokenname, params, filepath, size.toLong())).toInt()
}

public fun SymGetSourceFileFromTokenByTokenNameW(hprocess: HANDLE, token: Long, tokenname: PCWSTR, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileFromTokenByTokenNameW", longArrayOf(hprocess, token, tokenname, params, filepath, size.toLong())).toInt()
}

public fun SymGetSourceFileFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileFromTokenW", longArrayOf(hprocess, token, params, filepath, size.toLong())).toInt()
}

public fun SymGetSourceFileToken(hprocess: HANDLE, base: ULong, filespec: PCSTR, token: Long, size: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileToken", longArrayOf(hprocess, base.toLong(), filespec, token, size)).toInt()
}

public fun SymGetSourceFileTokenByTokenName(hprocess: HANDLE, base: ULong, filespec: PCSTR, tokenname: PCSTR, tokenparameters: PCSTR, token: Long, size: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileTokenByTokenName", longArrayOf(hprocess, base.toLong(), filespec, tokenname, tokenparameters, token, size)).toInt()
}

public fun SymGetSourceFileTokenByTokenNameW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, tokenname: PCWSTR, tokenparameters: PCWSTR, token: Long, size: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileTokenByTokenNameW", longArrayOf(hprocess, base.toLong(), filespec, tokenname, tokenparameters, token, size)).toInt()
}

public fun SymGetSourceFileTokenW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, token: Long, size: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileTokenW", longArrayOf(hprocess, base.toLong(), filespec, token, size)).toInt()
}

public fun SymGetSourceFileW(hprocess: HANDLE, base: ULong, params: PCWSTR, filespec: PCWSTR, filepath: PWSTR, size: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceFileW", longArrayOf(hprocess, base.toLong(), params, filespec, filepath, size.toLong())).toInt()
}

public fun SymGetSourceVarFromToken(hprocess: HANDLE, token: Long, params: PCSTR, varname: PCSTR, value: PSTR, size: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceVarFromToken", longArrayOf(hprocess, token, params, varname, value, size.toLong())).toInt()
}

public fun SymGetSourceVarFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, varname: PCWSTR, value: PWSTR, size: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSourceVarFromTokenW", longArrayOf(hprocess, token, params, varname, value, size.toLong())).toInt()
}

public fun SymGetSymFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSymFromAddr64", longArrayOf(hprocess, qwaddr.toLong(), pdwdisplacement, symbol)).toInt()
}

public fun SymGetSymFromName64(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSymFromName64", longArrayOf(hprocess, name, symbol)).toInt()
}

public fun SymGetSymNext64(hprocess: HANDLE, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSymNext64", longArrayOf(hprocess, symbol)).toInt()
}

public fun SymGetSymPrev64(hprocess: HANDLE, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSymPrev64", longArrayOf(hprocess, symbol)).toInt()
}

public fun SymGetSymbolFile(hprocess: HANDLE, sympath: PCSTR, imagefile: PCSTR, type: UInt, symbolfile: PSTR, csymbolfile: ULong, dbgfile: PSTR, cdbgfile: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSymbolFile", longArrayOf(hprocess, sympath, imagefile, type.toLong(), symbolfile, csymbolfile.toLong(), dbgfile, cdbgfile.toLong())).toInt()
}

public fun SymGetSymbolFileW(hprocess: HANDLE, sympath: PCWSTR, imagefile: PCWSTR, type: UInt, symbolfile: PWSTR, csymbolfile: ULong, dbgfile: PWSTR, cdbgfile: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetSymbolFileW", longArrayOf(hprocess, sympath, imagefile, type.toLong(), symbolfile, csymbolfile.toLong(), dbgfile, cdbgfile.toLong())).toInt()
}

public fun SymGetTypeFromName(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetTypeFromName", longArrayOf(hprocess, baseofdll.toLong(), name, symbol)).toInt()
}

public fun SymGetTypeFromNameW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, symbol: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetTypeFromNameW", longArrayOf(hprocess, baseofdll.toLong(), name, symbol)).toInt()
}

public fun SymGetTypeInfo(hprocess: HANDLE, modbase: ULong, typeid: UInt, gettype: IMAGEHLP_SYMBOL_TYPE_INFO, pinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetTypeInfo", longArrayOf(hprocess, modbase.toLong(), typeid.toLong(), gettype.toLong(), pinfo)).toInt()
}

public fun SymGetTypeInfoEx(hprocess: HANDLE, modbase: ULong, params: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetTypeInfoEx", longArrayOf(hprocess, modbase.toLong(), params)).toInt()
}

public fun SymGetUnwindInfo(hprocess: HANDLE, address: ULong, buffer: Long, size: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymGetUnwindInfo", longArrayOf(hprocess, address.toLong(), buffer, size)).toInt()
}

public fun SymInitialize(hprocess: HANDLE, usersearchpath: PCSTR, finvadeprocess: BOOL): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymInitialize", longArrayOf(hprocess, usersearchpath, finvadeprocess.toLong())).toInt()
}

public fun SymInitializeW(hprocess: HANDLE, usersearchpath: PCWSTR, finvadeprocess: BOOL): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymInitializeW", longArrayOf(hprocess, usersearchpath, finvadeprocess.toLong())).toInt()
}

public fun SymLoadModule64(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, sizeofdll: UInt): ULong {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymLoadModule64", longArrayOf(hprocess, hfile, imagename, modulename, baseofdll.toLong(), sizeofdll.toLong())).toULong()
}

public fun SymLoadModuleEx(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymLoadModuleEx", longArrayOf(hprocess, hfile, imagename, modulename, baseofdll.toLong(), dllsize.toLong(), data, flags.toLong())).toULong()
}

public fun SymLoadModuleExW(hprocess: HANDLE, hfile: HANDLE, imagename: PCWSTR, modulename: PCWSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymLoadModuleExW", longArrayOf(hprocess, hfile, imagename, modulename, baseofdll.toLong(), dllsize.toLong(), data, flags.toLong())).toULong()
}

public fun SymMatchFileName(filename: PCSTR, match: PCSTR, filenamestop: Long, matchstop: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymMatchFileName", longArrayOf(filename, match, filenamestop, matchstop)).toInt()
}

public fun SymMatchFileNameW(filename: PCWSTR, match: PCWSTR, filenamestop: Long, matchstop: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymMatchFileNameW", longArrayOf(filename, match, filenamestop, matchstop)).toInt()
}

public fun SymMatchString(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymMatchString", longArrayOf(string, expression, fcase.toLong())).toInt()
}

public fun SymMatchStringA(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymMatchStringA", longArrayOf(string, expression, fcase.toLong())).toInt()
}

public fun SymMatchStringW(string: PCWSTR, expression: PCWSTR, fcase: BOOL): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymMatchStringW", longArrayOf(string, expression, fcase.toLong())).toInt()
}

public fun SymNext(hprocess: HANDLE, si: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymNext", longArrayOf(hprocess, si)).toInt()
}

public fun SymNextW(hprocess: HANDLE, siw: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymNextW", longArrayOf(hprocess, siw)).toInt()
}

public fun SymPrev(hprocess: HANDLE, si: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymPrev", longArrayOf(hprocess, si)).toInt()
}

public fun SymPrevW(hprocess: HANDLE, siw: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymPrevW", longArrayOf(hprocess, siw)).toInt()
}

public fun SymQueryInlineTrace(hprocess: HANDLE, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: Long, curframeindex: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymQueryInlineTrace", longArrayOf(hprocess, startaddress.toLong(), startcontext.toLong(), startretaddress.toLong(), curaddress.toLong(), curcontext, curframeindex)).toInt()
}

public fun SymRefreshModuleList(hprocess: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymRefreshModuleList", longArrayOf(hprocess)).toInt()
}

public fun SymRegisterCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymRegisterCallback64", longArrayOf(hprocess, Win32DynamicFfi.objectSlot(callbackfunction), usercontext.toLong())).toInt()
}

public fun SymRegisterCallbackW64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymRegisterCallbackW64", longArrayOf(hprocess, Win32DynamicFfi.objectSlot(callbackfunction), usercontext.toLong())).toInt()
}

public fun SymRegisterFunctionEntryCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_FUNCENTRY_CALLBACK64, usercontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymRegisterFunctionEntryCallback64", longArrayOf(hprocess, Win32DynamicFfi.objectSlot(callbackfunction), usercontext.toLong())).toInt()
}

public fun SymSearch(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSearch", longArrayOf(hprocess, baseofdll.toLong(), index.toLong(), symtag.toLong(), mask, address.toLong(), Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext, options.toLong())).toInt()
}

public fun SymSearchW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCWSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSearchW", longArrayOf(hprocess, baseofdll.toLong(), index.toLong(), symtag.toLong(), mask, address.toLong(), Win32DynamicFfi.objectSlot(enumsymbolscallback), usercontext, options.toLong())).toInt()
}

public fun SymSetContext(hprocess: HANDLE, stackframe: Long, context: Long): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetContext", longArrayOf(hprocess, stackframe, context)).toInt()
}

public fun SymSetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS, value: BOOL): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetExtendedOption", longArrayOf(option.toLong(), value.toLong())).toInt()
}

public fun SymSetHomeDirectory(hprocess: HANDLE, dir: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetHomeDirectory", longArrayOf(hprocess, dir))
}

public fun SymSetHomeDirectoryW(hprocess: HANDLE, dir: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetHomeDirectoryW", longArrayOf(hprocess, dir))
}

public fun SymSetOptions(symoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetOptions", longArrayOf(symoptions.toLong())).toUInt()
}

public fun SymSetParentWindow(hwnd: HWND): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetParentWindow", longArrayOf(hwnd)).toInt()
}

public fun SymSetScopeFromAddr(hprocess: HANDLE, address: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetScopeFromAddr", longArrayOf(hprocess, address.toLong())).toInt()
}

public fun SymSetScopeFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetScopeFromIndex", longArrayOf(hprocess, baseofdll.toLong(), index.toLong())).toInt()
}

public fun SymSetScopeFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetScopeFromInlineContext", longArrayOf(hprocess, address.toLong(), inlinecontext.toLong())).toInt()
}

public fun SymSetSearchPath(hprocess: HANDLE, searchpatha: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetSearchPath", longArrayOf(hprocess, searchpatha)).toInt()
}

public fun SymSetSearchPathW(hprocess: HANDLE, searchpatha: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSetSearchPathW", longArrayOf(hprocess, searchpatha)).toInt()
}

public fun SymSrvDeltaName(hprocess: HANDLE, sympath: PCSTR, type: PCSTR, file1: PCSTR, file2: PCSTR): PCSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvDeltaName", longArrayOf(hprocess, sympath, type, file1, file2))
}

public fun SymSrvDeltaNameW(hprocess: HANDLE, sympath: PCWSTR, type: PCWSTR, file1: PCWSTR, file2: PCWSTR): PCWSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvDeltaNameW", longArrayOf(hprocess, sympath, type, file1, file2))
}

public fun SymSrvGetFileIndexInfo(file: PCSTR, info: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvGetFileIndexInfo", longArrayOf(file, info, flags.toLong())).toInt()
}

public fun SymSrvGetFileIndexInfoW(file: PCWSTR, info: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvGetFileIndexInfoW", longArrayOf(file, info, flags.toLong())).toInt()
}

public fun SymSrvGetFileIndexString(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, index: PSTR, size: ULong, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvGetFileIndexString", longArrayOf(hprocess, srvpath, file, index, size.toLong(), flags.toLong())).toInt()
}

public fun SymSrvGetFileIndexStringW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, index: PWSTR, size: ULong, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvGetFileIndexStringW", longArrayOf(hprocess, srvpath, file, index, size.toLong(), flags.toLong())).toInt()
}

public fun SymSrvGetFileIndexes(file: PCSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvGetFileIndexes", longArrayOf(file, id, val1, val2, flags.toLong())).toInt()
}

public fun SymSrvGetFileIndexesW(file: PCWSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvGetFileIndexesW", longArrayOf(file, id, val1, val2, flags.toLong())).toInt()
}

public fun SymSrvGetSupplement(hprocess: HANDLE, sympath: PCSTR, node: PCSTR, file: PCSTR): PCSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvGetSupplement", longArrayOf(hprocess, sympath, node, file))
}

public fun SymSrvGetSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR): PCWSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvGetSupplementW", longArrayOf(hprocess, sympath, node, file))
}

public fun SymSrvIsStore(hprocess: HANDLE, path: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvIsStore", longArrayOf(hprocess, path)).toInt()
}

public fun SymSrvIsStoreW(hprocess: HANDLE, path: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvIsStoreW", longArrayOf(hprocess, path)).toInt()
}

public fun SymSrvStoreFile(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvStoreFile", longArrayOf(hprocess, srvpath, file, flags.toLong()))
}

public fun SymSrvStoreFileW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCWSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvStoreFileW", longArrayOf(hprocess, srvpath, file, flags.toLong()))
}

public fun SymSrvStoreSupplement(hprocess: HANDLE, srvpath: PCSTR, node: PCSTR, file: PCSTR, flags: UInt): PCSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvStoreSupplement", longArrayOf(hprocess, srvpath, node, file, flags.toLong()))
}

public fun SymSrvStoreSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR, flags: UInt): PCWSTR {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymSrvStoreSupplementW", longArrayOf(hprocess, sympath, node, file, flags.toLong()))
}

public fun SymUnDName64(sym: Long, undecname: PSTR, undecnamelength: UInt): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymUnDName64", longArrayOf(sym, undecname, undecnamelength.toLong())).toInt()
}

public fun SymUnloadModule64(hprocess: HANDLE, baseofdll: ULong): BOOL {
    return Win32DynamicFfi.invoke("dbghelp.dll", "SymUnloadModule64", longArrayOf(hprocess, baseofdll.toLong())).toInt()
}

public fun TerminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
    Win32DynamicFfi.invoke("api-ms-win-core-errorhandling-l1-1-3.dll", "TerminateProcessOnMemoryExhaustion", longArrayOf(failedallocationsize.toLong()))
}

public fun TouchFileTimes(filehandle: HANDLE, psystemtime: Long): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "TouchFileTimes", longArrayOf(filehandle, psystemtime)).toInt()
}

public fun UnDecorateSymbolName(name: PCSTR, outputstring: PSTR, maxstringlength: UInt, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("dbghelp.dll", "UnDecorateSymbolName", longArrayOf(name, outputstring, maxstringlength.toLong(), flags.toLong())).toUInt()
}

public fun UnDecorateSymbolNameW(name: PCWSTR, outputstring: PWSTR, maxstringlength: UInt, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("dbghelp.dll", "UnDecorateSymbolNameW", longArrayOf(name, outputstring, maxstringlength.toLong(), flags.toLong())).toUInt()
}

public fun UnMapAndLoad(loadedimage: Long): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "UnMapAndLoad", longArrayOf(loadedimage)).toInt()
}

public fun UnhandledExceptionFilter(exceptioninfo: Long): Int {
    return Win32DynamicFfi.invoke("kernel32.dll", "UnhandledExceptionFilter", longArrayOf(exceptioninfo)).toInt()
}

public fun UpdateDebugInfoFile(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "UpdateDebugInfoFile", longArrayOf(imagefilename, symbolpath, debugfilepath, ntheaders)).toInt()
}

public fun UpdateDebugInfoFileEx(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long, oldchecksum: UInt): BOOL {
    return Win32DynamicFfi.invoke("imagehlp.dll", "UpdateDebugInfoFileEx", longArrayOf(imagefilename, symbolpath, debugfilepath, ntheaders, oldchecksum.toLong())).toInt()
}

public fun WaitForDebugEvent(lpdebugevent: Long, dwmilliseconds: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitForDebugEvent", longArrayOf(lpdebugevent, dwmilliseconds.toLong())).toInt()
}

public fun WaitForDebugEventEx(lpdebugevent: Long, dwmilliseconds: UInt): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WaitForDebugEventEx", longArrayOf(lpdebugevent, dwmilliseconds.toLong())).toInt()
}

public fun Wow64GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Wow64GetThreadContext", longArrayOf(hthread, lpcontext)).toInt()
}

public fun Wow64GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Wow64GetThreadSelectorEntry", longArrayOf(hthread, dwselector.toLong(), lpselectorentry)).toInt()
}

public fun Wow64SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "Wow64SetThreadContext", longArrayOf(hthread, lpcontext)).toInt()
}

public fun WriteProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbyteswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "WriteProcessMemory", longArrayOf(hprocess, lpbaseaddress, lpbuffer, nsize.toLong(), lpnumberofbyteswritten)).toInt()
}
