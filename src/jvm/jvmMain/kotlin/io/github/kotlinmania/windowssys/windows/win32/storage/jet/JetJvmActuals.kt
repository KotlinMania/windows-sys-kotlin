@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

private object WindowsWin32StorageJetJniBridge {
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
        val stream = WindowsWin32StorageJetJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32StorageJetJetAddColumnA(sesid: Long, tableid: Long, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: Int, pcolumnid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetAddColumnW(sesid: Long, tableid: Long, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: Int, pcolumnid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetAttachDatabase2A(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetAttachDatabase2W(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetAttachDatabaseA(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetAttachDatabaseW(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBackupA(szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBackupInstanceA(instance: Long, szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBackupInstanceW(instance: Long, szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBackupW(szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBeginExternalBackup(grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBeginSessionA(instance: Long, psesid: Long, szusername: Long, szpassword: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBeginSessionW(instance: Long, psesid: Long, szusername: Long, szpassword: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBeginTransaction(sesid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBeginTransaction2(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetBeginTransaction3(sesid: Long, trxid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCloseDatabase(sesid: Long, dbid: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCloseFile(hffile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCloseFileInstance(instance: Long, hffile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCloseTable(sesid: Long, tableid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCommitTransaction(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCommitTransaction2(sesid: Long, grbit: Int, cmsecdurablecommit: Int, pcommitid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCompactA(sesid: Long, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: Long, pconvert: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCompactW(sesid: Long, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: Long, pconvert: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetComputeStats(sesid: Long, tableid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateDatabase2A(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateDatabase2W(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateDatabaseA(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateDatabaseW(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateIndex2A(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateIndex2W(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateIndex3A(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateIndex3W(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateIndex4A(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateIndex4W(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateIndexA(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, szkey: Long, cbkey: Int, ldensity: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateIndexW(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, szkey: Long, cbkey: Int, ldensity: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateInstance2A(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateInstance2W(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateInstanceA(pinstance: Long, szinstancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateInstanceW(pinstance: Long, szinstancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateTableA(sesid: Long, dbid: Int, sztablename: Long, lpages: Int, ldensity: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetCreateTableW(sesid: Long, dbid: Int, sztablename: Long, lpages: Int, ldensity: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDefragment2A(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDefragment2W(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDefragment3A(sesid: Long, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, pvcontext: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDefragment3W(sesid: Long, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, pvcontext: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDefragmentA(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDefragmentW(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDelete(sesid: Long, tableid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDeleteColumn2A(sesid: Long, tableid: Long, szcolumnname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDeleteColumn2W(sesid: Long, tableid: Long, szcolumnname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDeleteColumnA(sesid: Long, tableid: Long, szcolumnname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDeleteColumnW(sesid: Long, tableid: Long, szcolumnname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDeleteIndexA(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDeleteIndexW(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDeleteTableA(sesid: Long, dbid: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDeleteTableW(sesid: Long, dbid: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDetachDatabase2A(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDetachDatabase2W(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDetachDatabaseA(sesid: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDetachDatabaseW(sesid: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDupCursor(sesid: Long, tableid: Long, ptableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetDupSession(sesid: Long, psesid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetEnableMultiInstanceA(psetsysparam: Long, csetsysparam: Int, pcsetsucceed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetEnableMultiInstanceW(psetsysparam: Long, csetsysparam: Int, pcsetsucceed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetEndExternalBackup(): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetEndExternalBackupInstance(instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetEndSession(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetEnumerateColumns(sesid: Long, tableid: Long, cenumcolumnid: Int, rgenumcolumnid: Long, pcenumcolumn: Long, prgenumcolumn: Long, pfnrealloc: Long, pvrealloccontext: Long, cbdatamost: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetEscrowUpdate(sesid: Long, tableid: Long, columnid: Int, pv: Long, cbmax: Int, pvold: Long, cboldmax: Int, pcboldactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetExternalRestore2A(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetExternalRestore2W(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetExternalRestoreA(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetExternalRestoreW(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetFreeBuffer(pbbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetAttachInfoA(szzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA(instance: Long, szzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW(instance: Long, szzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetAttachInfoW(wszzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetBookmark(sesid: Long, tableid: Long, pvbookmark: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetColumnInfoA(sesid: Long, dbid: Int, sztablename: Long, pcolumnnameorid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetColumnInfoW(sesid: Long, dbid: Int, sztablename: Long, pwcolumnnameorid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetCurrentIndexA(sesid: Long, tableid: Long, szindexname: Long, cbindexname: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetCurrentIndexW(sesid: Long, tableid: Long, szindexname: Long, cbindexname: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetCursorInfo(sesid: Long, tableid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA(szdatabasename: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW(szdatabasename: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetDatabaseInfoA(sesid: Long, dbid: Int, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetDatabaseInfoW(sesid: Long, dbid: Int, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetErrorInfoW(pvcontext: Long, pvresult: Long, cbmax: Int, infolevel: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetIndexInfoA(sesid: Long, dbid: Int, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetIndexInfoW(sesid: Long, dbid: Int, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetInstanceInfoA(pcinstanceinfo: Long, painstanceinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetInstanceInfoW(pcinstanceinfo: Long, painstanceinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo(instance: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetLS(sesid: Long, tableid: Long, pls: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetLock(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetLogInfoA(szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A(instance: Long, szzlogs: Long, cbmax: Int, pcbactual: Long, ploginfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W(instance: Long, wszzlogs: Long, cbmax: Int, pcbactual: Long, ploginfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA(instance: Long, szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW(instance: Long, wszzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetLogInfoW(szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetObjectInfoA(sesid: Long, dbid: Int, objtyp: Int, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetObjectInfoW(sesid: Long, dbid: Int, objtyp: Int, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetRecordPosition(sesid: Long, tableid: Long, precpos: Long, cbrecpos: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetRecordSize(sesid: Long, tableid: Long, precsize: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetRecordSize2(sesid: Long, tableid: Long, precsize: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark(sesid: Long, tableid: Long, pvsecondarykey: Long, cbsecondarykeymax: Int, pcbsecondarykeyactual: Long, pvprimarybookmark: Long, cbprimarybookmarkmax: Int, pcbprimarybookmarkactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetSessionParameter(sesid: Long, sesparamid: Int, pvparam: Long, cbparammax: Int, pcbparamactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetSystemParameterA(instance: Long, sesid: Long, paramid: Int, plparam: Long, szparam: Long, cbmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetSystemParameterW(instance: Long, sesid: Long, paramid: Int, plparam: Long, szparam: Long, cbmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetTableColumnInfoA(sesid: Long, tableid: Long, szcolumnname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetTableColumnInfoW(sesid: Long, tableid: Long, szcolumnname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetTableIndexInfoA(sesid: Long, tableid: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetTableIndexInfoW(sesid: Long, tableid: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetTableInfoA(sesid: Long, tableid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetTableInfoW(sesid: Long, tableid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetThreadStats(pvresult: Long, cbmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA(instance: Long, szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW(instance: Long, wszzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGetVersion(sesid: Long, pwversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGotoBookmark(sesid: Long, tableid: Long, pvbookmark: Long, cbbookmark: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGotoPosition(sesid: Long, tableid: Long, precpos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark(sesid: Long, tableid: Long, pvsecondarykey: Long, cbsecondarykey: Int, pvprimarybookmark: Long, cbprimarybookmark: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetGrowDatabase(sesid: Long, dbid: Int, cpg: Int, pcpgreal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetIdle(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetIndexRecordCount(sesid: Long, tableid: Long, pcrec: Long, crecmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetInit(pinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetInit2(pinstance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetInit3A(pinstance: Long, prstinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetInit3W(pinstance: Long, prstinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetIntersectIndexes(sesid: Long, rgindexrange: Long, cindexrange: Int, precordlist: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetMakeKey(sesid: Long, tableid: Long, pvdata: Long, cbdata: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetMove(sesid: Long, tableid: Long, crow: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotAbort(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotEnd(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotPrepare(psnapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(snapid: Long, instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotThaw(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(snapid: Long, instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenDatabaseA(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenDatabaseW(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenFileA(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenFileInstanceA(instance: Long, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenFileInstanceW(instance: Long, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenFileW(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenTableA(sesid: Long, dbid: Int, sztablename: Long, pvparameters: Long, cbparameters: Int, grbit: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenTableW(sesid: Long, dbid: Int, sztablename: Long, pvparameters: Long, cbparameters: Int, grbit: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenTempTable(sesid: Long, prgcolumndef: Long, ccolumn: Int, grbit: Int, ptableid: Long, prgcolumnid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenTempTable2(sesid: Long, prgcolumndef: Long, ccolumn: Int, lcid: Int, grbit: Int, ptableid: Long, prgcolumnid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenTempTable3(sesid: Long, prgcolumndef: Long, ccolumn: Int, pidxunicode: Long, grbit: Int, ptableid: Long, prgcolumnid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenTemporaryTable(sesid: Long, popentemporarytable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetOpenTemporaryTable2(sesid: Long, popentemporarytable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetPrepareUpdate(sesid: Long, tableid: Long, prep: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetPrereadIndexRanges(sesid: Long, tableid: Long, rgindexranges: Long, cindexranges: Int, pcrangespreread: Long, rgcolumnidpreread: Long, ccolumnidpreread: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetPrereadKeys(sesid: Long, tableid: Long, rgpvkeys: Long, rgcbkeys: Long, ckeys: Int, pckeyspreread: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetReadFile(hffile: Long, pv: Long, cb: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetReadFileInstance(instance: Long, hffile: Long, pv: Long, cb: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRegisterCallback(sesid: Long, tableid: Long, cbtyp: Int, pcallback: Long, pvcontext: Long, phcallbackid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRenameColumnA(sesid: Long, tableid: Long, szname: Long, sznamenew: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRenameColumnW(sesid: Long, tableid: Long, szname: Long, sznamenew: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRenameTableA(sesid: Long, dbid: Int, szname: Long, sznamenew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRenameTableW(sesid: Long, dbid: Int, szname: Long, sznamenew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetResetSessionContext(sesid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetResetTableSequential(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetResizeDatabase(sesid: Long, dbid: Int, cpgtarget: Int, pcpgactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRestore2A(sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRestore2W(sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRestoreA(szsource: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRestoreInstanceA(instance: Long, sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRestoreInstanceW(instance: Long, sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRestoreW(szsource: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRetrieveColumn(sesid: Long, tableid: Long, columnid: Int, pvdata: Long, cbdata: Int, pcbactual: Long, grbit: Int, pretinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRetrieveColumns(sesid: Long, tableid: Long, pretrievecolumn: Long, cretrievecolumn: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRetrieveKey(sesid: Long, tableid: Long, pvkey: Long, cbmax: Int, pcbactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetRollback(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSeek(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetColumn(sesid: Long, tableid: Long, columnid: Int, pvdata: Long, cbdata: Int, grbit: Int, psetinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA(sesid: Long, dbid: Int, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW(sesid: Long, dbid: Int, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetColumns(sesid: Long, tableid: Long, psetcolumn: Long, csetcolumn: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetCurrentIndex2A(sesid: Long, tableid: Long, szindexname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetCurrentIndex2W(sesid: Long, tableid: Long, szindexname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetCurrentIndex3A(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetCurrentIndex3W(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetCurrentIndex4A(sesid: Long, tableid: Long, szindexname: Long, pindexid: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetCurrentIndex4W(sesid: Long, tableid: Long, szindexname: Long, pindexid: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetCurrentIndexA(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetCurrentIndexW(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetCursorFilter(sesid: Long, tableid: Long, rgcolumnfilters: Long, ccolumnfilters: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetDatabaseSizeA(sesid: Long, szdatabasename: Long, cpg: Int, pcpgreal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetDatabaseSizeW(sesid: Long, szdatabasename: Long, cpg: Int, pcpgreal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetIndexRange(sesid: Long, tableidsrc: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetLS(sesid: Long, tableid: Long, ls: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetSessionContext(sesid: Long, ulcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetSessionParameter(sesid: Long, sesparamid: Int, pvparam: Long, cbparam: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetSystemParameterA(pinstance: Long, sesid: Long, paramid: Int, lparam: Long, szparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetSystemParameterW(pinstance: Long, sesid: Long, paramid: Int, lparam: Long, szparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetSetTableSequential(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetStopBackup(): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetStopBackupInstance(instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetStopService(): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetStopServiceInstance(instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetStopServiceInstance2(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetTerm(instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetTerm2(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetTruncateLog(): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetTruncateLogInstance(instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetUnregisterCallback(sesid: Long, tableid: Long, cbtyp: Int, hcallbackid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetUpdate(sesid: Long, tableid: Long, pvbookmark: Long, cbbookmark: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageJetJetUpdate2(sesid: Long, tableid: Long, pvbookmark: Long, cbbookmark: Int, pcbactual: Long, grbit: Int): Int
}

public actual fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pcolumndef: ConstPtr, pvdefault: ConstPtr, cbdefault: UInt, pcolumnid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetAddColumnA(sesid.toLong(), tableid.toLong(), szcolumnname.rawAddress, pcolumndef.rawAddress, pvdefault.rawAddress, cbdefault.toInt(), pcolumnid.rawAddress)

public actual fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pcolumndef: ConstPtr, pvdefault: ConstPtr, cbdefault: UInt, pcolumnid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetAddColumnW(sesid.toLong(), tableid.toLong(), szcolumnname.rawAddress, pcolumndef.rawAddress, pvdefault.rawAddress, cbdefault.toInt(), pcolumnid.rawAddress)

public actual fun jetAttachDatabase2A(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetAttachDatabase2A(sesid.toLong(), szfilename.rawAddress, cpgdatabasesizemax.toInt(), grbit.toInt())

public actual fun jetAttachDatabase2W(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetAttachDatabase2W(sesid.toLong(), szfilename.rawAddress, cpgdatabasesizemax.toInt(), grbit.toInt())

public actual fun jetAttachDatabaseA(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetAttachDatabaseA(sesid.toLong(), szfilename.rawAddress, grbit.toInt())

public actual fun jetAttachDatabaseW(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetAttachDatabaseW(sesid.toLong(), szfilename.rawAddress, grbit.toInt())

public actual fun jetBackupA(szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBackupA(szbackuppath.rawAddress, grbit.toInt(), 0L)

public actual fun jetBackupInstanceA(instance: JetInstance, szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBackupInstanceA(instance.toLong(), szbackuppath.rawAddress, grbit.toInt(), 0L)

public actual fun jetBackupInstanceW(instance: JetInstance, szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBackupInstanceW(instance.toLong(), szbackuppath.rawAddress, grbit.toInt(), 0L)

public actual fun jetBackupW(szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBackupW(szbackuppath.rawAddress, grbit.toInt(), 0L)

public actual fun jetBeginExternalBackup(grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBeginExternalBackup(grbit.toInt())

public actual fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(instance.toLong(), grbit.toInt())

public actual fun jetBeginSessionA(instance: JetInstance, psesid: MutPtr, szusername: ConstPtr, szpassword: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBeginSessionA(instance.toLong(), psesid.rawAddress, szusername.rawAddress, szpassword.rawAddress)

public actual fun jetBeginSessionW(instance: JetInstance, psesid: MutPtr, szusername: ConstPtr, szpassword: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBeginSessionW(instance.toLong(), psesid.rawAddress, szusername.rawAddress, szpassword.rawAddress)

public actual fun jetBeginTransaction(sesid: JetSesid): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBeginTransaction(sesid.toLong())

public actual fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBeginTransaction2(sesid.toLong(), grbit.toInt())

public actual fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetBeginTransaction3(sesid.toLong(), trxid, grbit.toInt())

public actual fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCloseDatabase(sesid.toLong(), dbid.toInt(), grbit.toInt())

public actual fun jetCloseFile(hffile: JetHandle): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCloseFile(hffile.toLong())

public actual fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCloseFileInstance(instance.toLong(), hffile.toLong())

public actual fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCloseTable(sesid.toLong(), tableid.toLong())

public actual fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCommitTransaction(sesid.toLong(), grbit.toInt())

public actual fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCommitTransaction2(sesid.toLong(), grbit.toInt(), cmsecdurablecommit.toInt(), pcommitid.rawAddress)

public actual fun jetCompactA(sesid: JetSesid, szdatabasesrc: ConstPtr, szdatabasedest: ConstPtr, pfnstatus: JetPfnstatus, pconvert: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCompactA(sesid.toLong(), szdatabasesrc.rawAddress, szdatabasedest.rawAddress, 0L, pconvert.rawAddress, grbit.toInt())

public actual fun jetCompactW(sesid: JetSesid, szdatabasesrc: ConstPtr, szdatabasedest: ConstPtr, pfnstatus: JetPfnstatus, pconvert: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCompactW(sesid.toLong(), szdatabasesrc.rawAddress, szdatabasedest.rawAddress, 0L, pconvert.rawAddress, grbit.toInt())

public actual fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetComputeStats(sesid.toLong(), tableid.toLong())

public actual fun jetConfigureProcessForCrashDump(grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(grbit.toInt())

public actual fun jetCreateDatabase2A(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, pdbid: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateDatabase2A(sesid.toLong(), szfilename.rawAddress, cpgdatabasesizemax.toInt(), pdbid.rawAddress, grbit.toInt())

public actual fun jetCreateDatabase2W(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, pdbid: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateDatabase2W(sesid.toLong(), szfilename.rawAddress, cpgdatabasesizemax.toInt(), pdbid.rawAddress, grbit.toInt())

public actual fun jetCreateDatabaseA(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateDatabaseA(sesid.toLong(), szfilename.rawAddress, szconnect.rawAddress, pdbid.rawAddress, grbit.toInt())

public actual fun jetCreateDatabaseW(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateDatabaseW(sesid.toLong(), szfilename.rawAddress, szconnect.rawAddress, pdbid.rawAddress, grbit.toInt())

public actual fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateIndex2A(sesid.toLong(), tableid.toLong(), pindexcreate.rawAddress, cindexcreate.toInt())

public actual fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateIndex2W(sesid.toLong(), tableid.toLong(), pindexcreate.rawAddress, cindexcreate.toInt())

public actual fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateIndex3A(sesid.toLong(), tableid.toLong(), pindexcreate.rawAddress, cindexcreate.toInt())

public actual fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateIndex3W(sesid.toLong(), tableid.toLong(), pindexcreate.rawAddress, cindexcreate.toInt())

public actual fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateIndex4A(sesid.toLong(), tableid.toLong(), pindexcreate.rawAddress, cindexcreate.toInt())

public actual fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateIndex4W(sesid.toLong(), tableid.toLong(), pindexcreate.rawAddress, cindexcreate.toInt())

public actual fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateIndexA(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, grbit.toInt(), szkey.rawAddress, cbkey.toInt(), ldensity.toInt())

public actual fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateIndexW(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, grbit.toInt(), szkey.rawAddress, cbkey.toInt(), ldensity.toInt())

public actual fun jetCreateInstance2A(pinstance: MutPtr, szinstancename: ConstPtr, szdisplayname: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateInstance2A(pinstance.rawAddress, szinstancename.rawAddress, szdisplayname.rawAddress, grbit.toInt())

public actual fun jetCreateInstance2W(pinstance: MutPtr, szinstancename: ConstPtr, szdisplayname: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateInstance2W(pinstance.rawAddress, szinstancename.rawAddress, szdisplayname.rawAddress, grbit.toInt())

public actual fun jetCreateInstanceA(pinstance: MutPtr, szinstancename: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateInstanceA(pinstance.rawAddress, szinstancename.rawAddress)

public actual fun jetCreateInstanceW(pinstance: MutPtr, szinstancename: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateInstanceW(pinstance.rawAddress, szinstancename.rawAddress)

public actual fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, lpages: UInt, ldensity: UInt, ptableid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateTableA(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, lpages.toInt(), ldensity.toInt(), ptableid.rawAddress)

public actual fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A(sesid.toLong(), dbid.toInt(), ptablecreate.rawAddress)

public actual fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W(sesid.toLong(), dbid.toInt(), ptablecreate.rawAddress)

public actual fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A(sesid.toLong(), dbid.toInt(), ptablecreate.rawAddress)

public actual fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W(sesid.toLong(), dbid.toInt(), ptablecreate.rawAddress)

public actual fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A(sesid.toLong(), dbid.toInt(), ptablecreate.rawAddress)

public actual fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W(sesid.toLong(), dbid.toInt(), ptablecreate.rawAddress)

public actual fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA(sesid.toLong(), dbid.toInt(), ptablecreate.rawAddress)

public actual fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW(sesid.toLong(), dbid.toInt(), ptablecreate.rawAddress)

public actual fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, lpages: UInt, ldensity: UInt, ptableid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetCreateTableW(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, lpages.toInt(), ldensity.toInt(), ptableid.rawAddress)

public actual fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDefragment2A(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, pcpasses.rawAddress, pcseconds.rawAddress, 0L, grbit.toInt())

public actual fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDefragment2W(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, pcpasses.rawAddress, pcseconds.rawAddress, 0L, grbit.toInt())

public actual fun jetDefragment3A(sesid: JetSesid, szdatabasename: ConstPtr, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, pvcontext: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDefragment3A(sesid.toLong(), szdatabasename.rawAddress, sztablename.rawAddress, pcpasses.rawAddress, pcseconds.rawAddress, 0L, pvcontext.rawAddress, grbit.toInt())

public actual fun jetDefragment3W(sesid: JetSesid, szdatabasename: ConstPtr, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, pvcontext: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDefragment3W(sesid.toLong(), szdatabasename.rawAddress, sztablename.rawAddress, pcpasses.rawAddress, pcseconds.rawAddress, 0L, pvcontext.rawAddress, grbit.toInt())

public actual fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDefragmentA(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, pcpasses.rawAddress, pcseconds.rawAddress, grbit.toInt())

public actual fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDefragmentW(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, pcpasses.rawAddress, pcseconds.rawAddress, grbit.toInt())

public actual fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDelete(sesid.toLong(), tableid.toLong())

public actual fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDeleteColumn2A(sesid.toLong(), tableid.toLong(), szcolumnname.rawAddress, grbit.toInt())

public actual fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDeleteColumn2W(sesid.toLong(), tableid.toLong(), szcolumnname.rawAddress, grbit.toInt())

public actual fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDeleteColumnA(sesid.toLong(), tableid.toLong(), szcolumnname.rawAddress)

public actual fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDeleteColumnW(sesid.toLong(), tableid.toLong(), szcolumnname.rawAddress)

public actual fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDeleteIndexA(sesid.toLong(), tableid.toLong(), szindexname.rawAddress)

public actual fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDeleteIndexW(sesid.toLong(), tableid.toLong(), szindexname.rawAddress)

public actual fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDeleteTableA(sesid.toLong(), dbid.toInt(), sztablename.rawAddress)

public actual fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDeleteTableW(sesid.toLong(), dbid.toInt(), sztablename.rawAddress)

public actual fun jetDetachDatabase2A(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDetachDatabase2A(sesid.toLong(), szfilename.rawAddress, grbit.toInt())

public actual fun jetDetachDatabase2W(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDetachDatabase2W(sesid.toLong(), szfilename.rawAddress, grbit.toInt())

public actual fun jetDetachDatabaseA(sesid: JetSesid, szfilename: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDetachDatabaseA(sesid.toLong(), szfilename.rawAddress)

public actual fun jetDetachDatabaseW(sesid: JetSesid, szfilename: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDetachDatabaseW(sesid.toLong(), szfilename.rawAddress)

public actual fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDupCursor(sesid.toLong(), tableid.toLong(), ptableid.rawAddress, grbit.toInt())

public actual fun jetDupSession(sesid: JetSesid, psesid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetDupSession(sesid.toLong(), psesid.rawAddress)

public actual fun jetEnableMultiInstanceA(psetsysparam: ConstPtr, csetsysparam: UInt, pcsetsucceed: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetEnableMultiInstanceA(psetsysparam.rawAddress, csetsysparam.toInt(), pcsetsucceed.rawAddress)

public actual fun jetEnableMultiInstanceW(psetsysparam: ConstPtr, csetsysparam: UInt, pcsetsucceed: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetEnableMultiInstanceW(psetsysparam.rawAddress, csetsysparam.toInt(), pcsetsucceed.rawAddress)

public actual fun jetEndExternalBackup(): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetEndExternalBackup()

public actual fun jetEndExternalBackupInstance(instance: JetInstance): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetEndExternalBackupInstance(instance.toLong())

public actual fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(instance.toLong(), grbit.toInt())

public actual fun jetEndSession(sesid: JetSesid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetEndSession(sesid.toLong(), grbit.toInt())

public actual fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: ConstPtr, pcenumcolumn: MutPtr, prgenumcolumn: MutPtr, pfnrealloc: JetPfnrealloc, pvrealloccontext: ConstPtr, cbdatamost: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetEnumerateColumns(sesid.toLong(), tableid.toLong(), cenumcolumnid.toInt(), rgenumcolumnid.rawAddress, pcenumcolumn.rawAddress, prgenumcolumn.rawAddress, 0L, pvrealloccontext.rawAddress, cbdatamost.toInt(), grbit.toInt())

public actual fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: ConstPtr, cbmax: UInt, pvold: MutPtr, cboldmax: UInt, pcboldactual: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetEscrowUpdate(sesid.toLong(), tableid.toLong(), columnid.toInt(), pv.rawAddress, cbmax.toInt(), pvold.rawAddress, cboldmax.toInt(), pcboldactual.rawAddress, grbit.toInt())

public actual fun jetExternalRestore2A(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, ploginfo: MutPtr, sztargetinstancename: ConstPtr, sztargetinstancelogpath: ConstPtr, sztargetinstancecheckpointpath: ConstPtr, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetExternalRestore2A(szcheckpointfilepath.rawAddress, szlogpath.rawAddress, rgrstmap.rawAddress, crstfilemap, szbackuplogpath.rawAddress, ploginfo.rawAddress, sztargetinstancename.rawAddress, sztargetinstancelogpath.rawAddress, sztargetinstancecheckpointpath.rawAddress, 0L)

public actual fun jetExternalRestore2W(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, ploginfo: MutPtr, sztargetinstancename: ConstPtr, sztargetinstancelogpath: ConstPtr, sztargetinstancecheckpointpath: ConstPtr, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetExternalRestore2W(szcheckpointfilepath.rawAddress, szlogpath.rawAddress, rgrstmap.rawAddress, crstfilemap, szbackuplogpath.rawAddress, ploginfo.rawAddress, sztargetinstancename.rawAddress, sztargetinstancelogpath.rawAddress, sztargetinstancecheckpointpath.rawAddress, 0L)

public actual fun jetExternalRestoreA(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetExternalRestoreA(szcheckpointfilepath.rawAddress, szlogpath.rawAddress, rgrstmap.rawAddress, crstfilemap, szbackuplogpath.rawAddress, genlow, genhigh, 0L)

public actual fun jetExternalRestoreW(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetExternalRestoreW(szcheckpointfilepath.rawAddress, szlogpath.rawAddress, rgrstmap.rawAddress, crstfilemap, szbackuplogpath.rawAddress, genlow, genhigh, 0L)

public actual fun jetFreeBuffer(pbbuf: Pcstr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetFreeBuffer(pbbuf.rawAddress)

public actual fun jetGetAttachInfoA(szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetAttachInfoA(szzdatabases.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA(instance.toLong(), szzdatabases.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW(instance.toLong(), szzdatabases.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetAttachInfoW(wszzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetAttachInfoW(wszzdatabases.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetBookmark(sesid.toLong(), tableid.toLong(), pvbookmark.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcolumnnameorid: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetColumnInfoA(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, pcolumnnameorid.rawAddress, pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pwcolumnnameorid: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetColumnInfoW(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, pwcolumnnameorid.rawAddress, pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr, cbindexname: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetCurrentIndexA(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, cbindexname.toInt())

public actual fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr, cbindexname: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetCurrentIndexW(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, cbindexname.toInt())

public actual fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetCursorInfo(sesid.toLong(), tableid.toLong(), pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetDatabaseFileInfoA(szdatabasename: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA(szdatabasename.rawAddress, pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetDatabaseFileInfoW(szdatabasename: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW(szdatabasename.rawAddress, pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetDatabaseInfoA(sesid.toLong(), dbid.toInt(), pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetDatabaseInfoW(sesid.toLong(), dbid.toInt(), pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetErrorInfoW(pvcontext: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetErrorInfoW(pvcontext.rawAddress, pvresult.rawAddress, cbmax.toInt(), infolevel.toInt(), grbit.toInt())

public actual fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetIndexInfoA(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, szindexname.rawAddress, pvresult.rawAddress, cbresult.toInt(), infolevel.toInt())

public actual fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetIndexInfoW(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, szindexname.rawAddress, pvresult.rawAddress, cbresult.toInt(), infolevel.toInt())

public actual fun jetGetInstanceInfoA(pcinstanceinfo: MutPtr, painstanceinfo: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetInstanceInfoA(pcinstanceinfo.rawAddress, painstanceinfo.rawAddress)

public actual fun jetGetInstanceInfoW(pcinstanceinfo: MutPtr, painstanceinfo: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetInstanceInfoW(pcinstanceinfo.rawAddress, painstanceinfo.rawAddress)

public actual fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo(instance.toLong(), pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetLS(sesid.toLong(), tableid.toLong(), pls.rawAddress, grbit.toInt())

public actual fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetLock(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetGetLogInfoA(szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetLogInfoA(szzlogs.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr, ploginfo: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A(instance.toLong(), szzlogs.rawAddress, cbmax.toInt(), pcbactual.rawAddress, ploginfo.rawAddress)

public actual fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr, ploginfo: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W(instance.toLong(), wszzlogs.rawAddress, cbmax.toInt(), pcbactual.rawAddress, ploginfo.rawAddress)

public actual fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA(instance.toLong(), szzlogs.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW(instance.toLong(), wszzlogs.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetLogInfoW(szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetLogInfoW(szzlogs.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr, szobjectname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetObjectInfoA(sesid.toLong(), dbid.toInt(), objtyp.toInt(), szcontainername.rawAddress, szobjectname.rawAddress, pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr, szobjectname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetObjectInfoW(sesid.toLong(), dbid.toInt(), objtyp.toInt(), szcontainername.rawAddress, szobjectname.rawAddress, pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: MutPtr, cbrecpos: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetRecordPosition(sesid.toLong(), tableid.toLong(), precpos.rawAddress, cbrecpos.toInt())

public actual fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetRecordSize(sesid.toLong(), tableid.toLong(), precsize.rawAddress, grbit.toInt())

public actual fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetRecordSize2(sesid.toLong(), tableid.toLong(), precsize.rawAddress, grbit.toInt())

public actual fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: MutPtr, cbsecondarykeymax: UInt, pcbsecondarykeyactual: MutPtr, pvprimarybookmark: MutPtr, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark(sesid.toLong(), tableid.toLong(), pvsecondarykey.rawAddress, cbsecondarykeymax.toInt(), pcbsecondarykeyactual.rawAddress, pvprimarybookmark.rawAddress, cbprimarybookmarkmax.toInt(), pcbprimarybookmarkactual.rawAddress, grbit.toInt())

public actual fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: MutPtr, cbparammax: UInt, pcbparamactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetSessionParameter(sesid.toLong(), sesparamid.toInt(), pvparam.rawAddress, cbparammax.toInt(), pcbparamactual.rawAddress)

public actual fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr, szparam: MutPtr, cbmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetSystemParameterA(instance.toLong(), sesid.toLong(), paramid.toInt(), plparam.rawAddress, szparam.rawAddress, cbmax.toInt())

public actual fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr, szparam: MutPtr, cbmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetSystemParameterW(instance.toLong(), sesid.toLong(), paramid.toInt(), plparam.rawAddress, szparam.rawAddress, cbmax.toInt())

public actual fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetTableColumnInfoA(sesid.toLong(), tableid.toLong(), szcolumnname.rawAddress, pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetTableColumnInfoW(sesid.toLong(), tableid.toLong(), szcolumnname.rawAddress, pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetTableIndexInfoA(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, pvresult.rawAddress, cbresult.toInt(), infolevel.toInt())

public actual fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetTableIndexInfoW(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, pvresult.rawAddress, cbresult.toInt(), infolevel.toInt())

public actual fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetTableInfoA(sesid.toLong(), tableid.toLong(), pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetTableInfoW(sesid.toLong(), tableid.toLong(), pvresult.rawAddress, cbmax.toInt(), infolevel.toInt())

public actual fun jetGetThreadStats(pvresult: MutPtr, cbmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetThreadStats(pvresult.rawAddress, cbmax.toInt())

public actual fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA(instance.toLong(), szzlogs.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW(instance.toLong(), wszzlogs.rawAddress, cbmax.toInt(), pcbactual.rawAddress)

public actual fun jetGetVersion(sesid: JetSesid, pwversion: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGetVersion(sesid.toLong(), pwversion.rawAddress)

public actual fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: ConstPtr, cbbookmark: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGotoBookmark(sesid.toLong(), tableid.toLong(), pvbookmark.rawAddress, cbbookmark.toInt())

public actual fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGotoPosition(sesid.toLong(), tableid.toLong(), precpos.rawAddress)

public actual fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: ConstPtr, cbsecondarykey: UInt, pvprimarybookmark: ConstPtr, cbprimarybookmark: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark(sesid.toLong(), tableid.toLong(), pvsecondarykey.rawAddress, cbsecondarykey.toInt(), pvprimarybookmark.rawAddress, cbprimarybookmark.toInt(), grbit.toInt())

public actual fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetGrowDatabase(sesid.toLong(), dbid.toInt(), cpg.toInt(), pcpgreal.rawAddress)

public actual fun jetIdle(sesid: JetSesid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetIdle(sesid.toLong(), grbit.toInt())

public actual fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: MutPtr, crecmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetIndexRecordCount(sesid.toLong(), tableid.toLong(), pcrec.rawAddress, crecmax.toInt())

public actual fun jetInit(pinstance: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetInit(pinstance.rawAddress)

public actual fun jetInit2(pinstance: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetInit2(pinstance.rawAddress, grbit.toInt())

public actual fun jetInit3A(pinstance: MutPtr, prstinfo: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetInit3A(pinstance.rawAddress, prstinfo.rawAddress, grbit.toInt())

public actual fun jetInit3W(pinstance: MutPtr, prstinfo: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetInit3W(pinstance.rawAddress, prstinfo.rawAddress, grbit.toInt())

public actual fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: ConstPtr, cindexrange: UInt, precordlist: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetIntersectIndexes(sesid.toLong(), rgindexrange.rawAddress, cindexrange.toInt(), precordlist.rawAddress, grbit.toInt())

public actual fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetMakeKey(sesid.toLong(), tableid.toLong(), pvdata.rawAddress, cbdata.toInt(), grbit.toInt())

public actual fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetMove(sesid.toLong(), tableid.toLong(), crow, grbit.toInt())

public actual fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotAbort(snapid.toLong(), grbit.toInt())

public actual fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotEnd(snapid.toLong(), grbit.toInt())

public actual fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA(snapid.toLong(), pcinstanceinfo.rawAddress, painstanceinfo.rawAddress, grbit.toInt())

public actual fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW(snapid.toLong(), pcinstanceinfo.rawAddress, painstanceinfo.rawAddress, grbit.toInt())

public actual fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA(snapid.toLong(), pcinstanceinfo.rawAddress, painstanceinfo.rawAddress, grbit.toInt())

public actual fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW(snapid.toLong(), pcinstanceinfo.rawAddress, painstanceinfo.rawAddress, grbit.toInt())

public actual fun jetOSSnapshotPrepare(psnapid: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotPrepare(psnapid.rawAddress, grbit.toInt())

public actual fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(snapid.toLong(), instance.toLong(), grbit.toInt())

public actual fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotThaw(snapid.toLong(), grbit.toInt())

public actual fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(snapid.toLong(), grbit.toInt())

public actual fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(snapid.toLong(), instance.toLong(), grbit.toInt())

public actual fun jetOpenDatabaseA(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenDatabaseA(sesid.toLong(), szfilename.rawAddress, szconnect.rawAddress, pdbid.rawAddress, grbit.toInt())

public actual fun jetOpenDatabaseW(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenDatabaseW(sesid.toLong(), szfilename.rawAddress, szconnect.rawAddress, pdbid.rawAddress, grbit.toInt())

public actual fun jetOpenFileA(szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenFileA(szfilename.rawAddress, phffile.rawAddress, pulfilesizelow.rawAddress, pulfilesizehigh.rawAddress)

public actual fun jetOpenFileInstanceA(instance: JetInstance, szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenFileInstanceA(instance.toLong(), szfilename.rawAddress, phffile.rawAddress, pulfilesizelow.rawAddress, pulfilesizehigh.rawAddress)

public actual fun jetOpenFileInstanceW(instance: JetInstance, szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenFileInstanceW(instance.toLong(), szfilename.rawAddress, phffile.rawAddress, pulfilesizelow.rawAddress, pulfilesizehigh.rawAddress)

public actual fun jetOpenFileW(szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenFileW(szfilename.rawAddress, phffile.rawAddress, pulfilesizelow.rawAddress, pulfilesizehigh.rawAddress)

public actual fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pvparameters: ConstPtr, cbparameters: UInt, grbit: UInt, ptableid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenTableA(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, pvparameters.rawAddress, cbparameters.toInt(), grbit.toInt(), ptableid.rawAddress)

public actual fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pvparameters: ConstPtr, cbparameters: UInt, grbit: UInt, ptableid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenTableW(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, pvparameters.rawAddress, cbparameters.toInt(), grbit.toInt(), ptableid.rawAddress)

public actual fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenTempTable(sesid.toLong(), prgcolumndef.rawAddress, ccolumn.toInt(), grbit.toInt(), ptableid.rawAddress, prgcolumnid.rawAddress)

public actual fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenTempTable2(sesid.toLong(), prgcolumndef.rawAddress, ccolumn.toInt(), lcid.toInt(), grbit.toInt(), ptableid.rawAddress, prgcolumnid.rawAddress)

public actual fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, pidxunicode: ConstPtr, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenTempTable3(sesid.toLong(), prgcolumndef.rawAddress, ccolumn.toInt(), pidxunicode.rawAddress, grbit.toInt(), ptableid.rawAddress, prgcolumnid.rawAddress)

public actual fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenTemporaryTable(sesid.toLong(), popentemporarytable.rawAddress)

public actual fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetOpenTemporaryTable2(sesid.toLong(), popentemporarytable.rawAddress)

public actual fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetPrepareUpdate(sesid.toLong(), tableid.toLong(), prep.toInt())

public actual fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: ConstPtr, cindexranges: UInt, pcrangespreread: MutPtr, rgcolumnidpreread: ConstPtr, ccolumnidpreread: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetPrereadIndexRanges(sesid.toLong(), tableid.toLong(), rgindexranges.rawAddress, cindexranges.toInt(), pcrangespreread.rawAddress, rgcolumnidpreread.rawAddress, ccolumnidpreread.toInt(), grbit.toInt())

public actual fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: ConstPtr, rgcbkeys: ConstPtr, ckeys: Int, pckeyspreread: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetPrereadKeys(sesid.toLong(), tableid.toLong(), rgpvkeys.rawAddress, rgcbkeys.rawAddress, ckeys, pckeyspreread.rawAddress, grbit.toInt())

public actual fun jetReadFile(hffile: JetHandle, pv: MutPtr, cb: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetReadFile(hffile.toLong(), pv.rawAddress, cb.toInt(), pcbactual.rawAddress)

public actual fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: MutPtr, cb: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetReadFileInstance(instance.toLong(), hffile.toLong(), pv.rawAddress, cb.toInt(), pcbactual.rawAddress)

public actual fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: ConstPtr, phcallbackid: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRegisterCallback(sesid.toLong(), tableid.toLong(), cbtyp.toInt(), 0L, pvcontext.rawAddress, phcallbackid.rawAddress)

public actual fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr, sznamenew: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRenameColumnA(sesid.toLong(), tableid.toLong(), szname.rawAddress, sznamenew.rawAddress, grbit.toInt())

public actual fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr, sznamenew: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRenameColumnW(sesid.toLong(), tableid.toLong(), szname.rawAddress, sznamenew.rawAddress, grbit.toInt())

public actual fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: ConstPtr, sznamenew: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRenameTableA(sesid.toLong(), dbid.toInt(), szname.rawAddress, sznamenew.rawAddress)

public actual fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: ConstPtr, sznamenew: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRenameTableW(sesid.toLong(), dbid.toInt(), szname.rawAddress, sznamenew.rawAddress)

public actual fun jetResetSessionContext(sesid: JetSesid): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetResetSessionContext(sesid.toLong())

public actual fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetResetTableSequential(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetResizeDatabase(sesid.toLong(), dbid.toInt(), cpgtarget.toInt(), pcpgactual.rawAddress, grbit.toInt())

public actual fun jetRestore2A(sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRestore2A(sz.rawAddress, szdest.rawAddress, 0L)

public actual fun jetRestore2W(sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRestore2W(sz.rawAddress, szdest.rawAddress, 0L)

public actual fun jetRestoreA(szsource: ConstPtr, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRestoreA(szsource.rawAddress, 0L)

public actual fun jetRestoreInstanceA(instance: JetInstance, sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRestoreInstanceA(instance.toLong(), sz.rawAddress, szdest.rawAddress, 0L)

public actual fun jetRestoreInstanceW(instance: JetInstance, sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRestoreInstanceW(instance.toLong(), sz.rawAddress, szdest.rawAddress, 0L)

public actual fun jetRestoreW(szsource: ConstPtr, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRestoreW(szsource.rawAddress, 0L)

public actual fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: MutPtr, cbdata: UInt, pcbactual: MutPtr, grbit: UInt, pretinfo: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRetrieveColumn(sesid.toLong(), tableid.toLong(), columnid.toInt(), pvdata.rawAddress, cbdata.toInt(), pcbactual.rawAddress, grbit.toInt(), pretinfo.rawAddress)

public actual fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: MutPtr, cretrievecolumn: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRetrieveColumns(sesid.toLong(), tableid.toLong(), pretrievecolumn.rawAddress, cretrievecolumn.toInt())

public actual fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: MutPtr, cbmax: UInt, pcbactual: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRetrieveKey(sesid.toLong(), tableid.toLong(), pvkey.rawAddress, cbmax.toInt(), pcbactual.rawAddress, grbit.toInt())

public actual fun jetRollback(sesid: JetSesid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetRollback(sesid.toLong(), grbit.toInt())

public actual fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSeek(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: ConstPtr, cbdata: UInt, grbit: UInt, psetinfo: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetColumn(sesid.toLong(), tableid.toLong(), columnid.toInt(), pvdata.rawAddress, cbdata.toInt(), grbit.toInt(), psetinfo.rawAddress)

public actual fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szcolumnname: ConstPtr, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, szcolumnname.rawAddress, pvdata.rawAddress, cbdata.toInt(), grbit.toInt())

public actual fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szcolumnname: ConstPtr, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW(sesid.toLong(), dbid.toInt(), sztablename.rawAddress, szcolumnname.rawAddress, pvdata.rawAddress, cbdata.toInt(), grbit.toInt())

public actual fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: ConstPtr, csetcolumn: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetColumns(sesid.toLong(), tableid.toLong(), psetcolumn.rawAddress, csetcolumn.toInt())

public actual fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetCurrentIndex2A(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, grbit.toInt())

public actual fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetCurrentIndex2W(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, grbit.toInt())

public actual fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetCurrentIndex3A(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, grbit.toInt(), itagsequence.toInt())

public actual fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetCurrentIndex3W(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, grbit.toInt(), itagsequence.toInt())

public actual fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pindexid: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetCurrentIndex4A(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, pindexid.rawAddress, grbit.toInt(), itagsequence.toInt())

public actual fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pindexid: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetCurrentIndex4W(sesid.toLong(), tableid.toLong(), szindexname.rawAddress, pindexid.rawAddress, grbit.toInt(), itagsequence.toInt())

public actual fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetCurrentIndexA(sesid.toLong(), tableid.toLong(), szindexname.rawAddress)

public actual fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetCurrentIndexW(sesid.toLong(), tableid.toLong(), szindexname.rawAddress)

public actual fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: ConstPtr, ccolumnfilters: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetCursorFilter(sesid.toLong(), tableid.toLong(), rgcolumnfilters.rawAddress, ccolumnfilters.toInt(), grbit.toInt())

public actual fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: ConstPtr, cpg: UInt, pcpgreal: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetDatabaseSizeA(sesid.toLong(), szdatabasename.rawAddress, cpg.toInt(), pcpgreal.rawAddress)

public actual fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: ConstPtr, cpg: UInt, pcpgreal: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetDatabaseSizeW(sesid.toLong(), szdatabasename.rawAddress, cpg.toInt(), pcpgreal.rawAddress)

public actual fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetIndexRange(sesid.toLong(), tableidsrc.toLong(), grbit.toInt())

public actual fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetLS(sesid.toLong(), tableid.toLong(), ls.toLong(), grbit.toInt())

public actual fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetSessionContext(sesid.toLong(), ulcontext.toLong())

public actual fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: ConstPtr, cbparam: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetSessionParameter(sesid.toLong(), sesparamid.toInt(), pvparam.rawAddress, cbparam.toInt())

public actual fun jetSetSystemParameterA(pinstance: MutPtr, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetSystemParameterA(pinstance.rawAddress, sesid.toLong(), paramid.toInt(), lparam.toLong(), szparam.rawAddress)

public actual fun jetSetSystemParameterW(pinstance: MutPtr, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetSystemParameterW(pinstance.rawAddress, sesid.toLong(), paramid.toInt(), lparam.toLong(), szparam.rawAddress)

public actual fun jetSetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetSetTableSequential(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetStopBackup(): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetStopBackup()

public actual fun jetStopBackupInstance(instance: JetInstance): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetStopBackupInstance(instance.toLong())

public actual fun jetStopService(): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetStopService()

public actual fun jetStopServiceInstance(instance: JetInstance): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetStopServiceInstance(instance.toLong())

public actual fun jetStopServiceInstance2(instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetStopServiceInstance2(instance.toLong(), grbit.toInt())

public actual fun jetTerm(instance: JetInstance): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetTerm(instance.toLong())

public actual fun jetTerm2(instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetTerm2(instance.toLong(), grbit.toInt())

public actual fun jetTruncateLog(): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetTruncateLog()

public actual fun jetTruncateLogInstance(instance: JetInstance): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetTruncateLogInstance(instance.toLong())

public actual fun jetUnregisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, hcallbackid: JetHandle): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetUnregisterCallback(sesid.toLong(), tableid.toLong(), cbtyp.toInt(), hcallbackid.toLong())

public actual fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbbookmark: UInt, pcbactual: MutPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetUpdate(sesid.toLong(), tableid.toLong(), pvbookmark.rawAddress, cbbookmark.toInt(), pcbactual.rawAddress)

public actual fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbbookmark: UInt, pcbactual: MutPtr, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssysWindowsWin32StorageJetJetUpdate2(sesid.toLong(), tableid.toLong(), pvbookmark.rawAddress, cbbookmark.toInt(), pcbactual.rawAddress, grbit.toInt())
