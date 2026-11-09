@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_API_PTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_TABLEID

private object WindowsWin32StorageJetJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetAddColumnA(sesid: Long, tableid: Long, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: Int, pcolumnid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetAddColumnW(sesid: Long, tableid: Long, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: Int, pcolumnid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetAttachDatabase2A(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetAttachDatabase2W(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetAttachDatabaseA(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetAttachDatabaseW(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBackupA(szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBackupInstanceA(instance: Long, szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBackupInstanceW(instance: Long, szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBackupW(szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBeginExternalBackup(grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBeginExternalBackupInstance(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBeginSessionA(instance: Long, psesid: Long, szusername: Long, szpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBeginSessionW(instance: Long, psesid: Long, szusername: Long, szpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBeginTransaction(sesid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBeginTransaction2(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetBeginTransaction3(sesid: Long, trxid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCloseDatabase(sesid: Long, dbid: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCloseFile(hffile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCloseFileInstance(instance: Long, hffile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCloseTable(sesid: Long, tableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCommitTransaction(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCommitTransaction2(sesid: Long, grbit: Int, cmsecdurablecommit: Int, pcommitid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCompactA(sesid: Long, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: Long, pconvert: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCompactW(sesid: Long, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: Long, pconvert: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetComputeStats(sesid: Long, tableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetConfigureProcessForCrashDump(grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateDatabase2A(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateDatabase2W(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateDatabaseA(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateDatabaseW(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateIndex2A(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateIndex2W(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateIndex3A(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateIndex3W(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateIndex4A(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateIndex4W(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateIndexA(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, szkey: Long, cbkey: Int, ldensity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateIndexW(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, szkey: Long, cbkey: Int, ldensity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateInstance2A(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateInstance2W(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateInstanceA(pinstance: Long, szinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateInstanceW(pinstance: Long, szinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateTableA(sesid: Long, dbid: Int, sztablename: Long, lpages: Int, ldensity: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2A(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2W(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3A(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3W(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4A(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4W(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexA(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexW(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetCreateTableW(sesid: Long, dbid: Int, sztablename: Long, lpages: Int, ldensity: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDefragment2A(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDefragment2W(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDefragment3A(sesid: Long, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, pvcontext: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDefragment3W(sesid: Long, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, pvcontext: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDefragmentA(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDefragmentW(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDelete(sesid: Long, tableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDeleteColumn2A(sesid: Long, tableid: Long, szcolumnname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDeleteColumn2W(sesid: Long, tableid: Long, szcolumnname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDeleteColumnA(sesid: Long, tableid: Long, szcolumnname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDeleteColumnW(sesid: Long, tableid: Long, szcolumnname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDeleteIndexA(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDeleteIndexW(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDeleteTableA(sesid: Long, dbid: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDeleteTableW(sesid: Long, dbid: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDetachDatabase2A(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDetachDatabase2W(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDetachDatabaseA(sesid: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDetachDatabaseW(sesid: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDupCursor(sesid: Long, tableid: Long, ptableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetDupSession(sesid: Long, psesid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetEnableMultiInstanceA(psetsysparam: Long, csetsysparam: Int, pcsetsucceed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetEnableMultiInstanceW(psetsysparam: Long, csetsysparam: Int, pcsetsucceed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetEndExternalBackup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance2(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetEndSession(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetEnumerateColumns(sesid: Long, tableid: Long, cenumcolumnid: Int, rgenumcolumnid: Long, pcenumcolumn: Long, prgenumcolumn: Long, pfnrealloc: Long, pvrealloccontext: Long, cbdatamost: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetEscrowUpdate(sesid: Long, tableid: Long, columnid: Int, pv: Long, cbmax: Int, pvold: Long, cboldmax: Int, pcboldactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetExternalRestore2A(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetExternalRestore2W(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetExternalRestoreA(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetExternalRestoreW(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetFreeBuffer(pbbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetAttachInfoA(szzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceA(instance: Long, szzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceW(instance: Long, szzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetAttachInfoW(wszzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetBookmark(sesid: Long, tableid: Long, pvbookmark: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetColumnInfoA(sesid: Long, dbid: Int, sztablename: Long, pcolumnnameorid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetColumnInfoW(sesid: Long, dbid: Int, sztablename: Long, pwcolumnnameorid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetCurrentIndexA(sesid: Long, tableid: Long, szindexname: Long, cbindexname: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetCurrentIndexW(sesid: Long, tableid: Long, szindexname: Long, cbindexname: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetCursorInfo(sesid: Long, tableid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoA(szdatabasename: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoW(szdatabasename: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetDatabaseInfoA(sesid: Long, dbid: Int, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetDatabaseInfoW(sesid: Long, dbid: Int, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetErrorInfoW(pvcontext: Long, pvresult: Long, cbmax: Int, infolevel: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetIndexInfoA(sesid: Long, dbid: Int, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetIndexInfoW(sesid: Long, dbid: Int, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetInstanceInfoA(pcinstanceinfo: Long, painstanceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetInstanceInfoW(pcinstanceinfo: Long, painstanceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetInstanceMiscInfo(instance: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetLS(sesid: Long, tableid: Long, pls: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetLock(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetLogInfoA(szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2A(instance: Long, szzlogs: Long, cbmax: Int, pcbactual: Long, ploginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2W(instance: Long, wszzlogs: Long, cbmax: Int, pcbactual: Long, ploginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceA(instance: Long, szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceW(instance: Long, wszzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetLogInfoW(szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetObjectInfoA(sesid: Long, dbid: Int, objtyp: Int, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetObjectInfoW(sesid: Long, dbid: Int, objtyp: Int, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetRecordPosition(sesid: Long, tableid: Long, precpos: Long, cbrecpos: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetRecordSize(sesid: Long, tableid: Long, precsize: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetRecordSize2(sesid: Long, tableid: Long, precsize: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetSecondaryIndexBookmark(sesid: Long, tableid: Long, pvsecondarykey: Long, cbsecondarykeymax: Int, pcbsecondarykeyactual: Long, pvprimarybookmark: Long, cbprimarybookmarkmax: Int, pcbprimarybookmarkactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetSessionParameter(sesid: Long, sesparamid: Int, pvparam: Long, cbparammax: Int, pcbparamactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetSystemParameterA(instance: Long, sesid: Long, paramid: Int, plparam: Long, szparam: Long, cbmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetSystemParameterW(instance: Long, sesid: Long, paramid: Int, plparam: Long, szparam: Long, cbmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetTableColumnInfoA(sesid: Long, tableid: Long, szcolumnname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetTableColumnInfoW(sesid: Long, tableid: Long, szcolumnname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetTableIndexInfoA(sesid: Long, tableid: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetTableIndexInfoW(sesid: Long, tableid: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetTableInfoA(sesid: Long, tableid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetTableInfoW(sesid: Long, tableid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetThreadStats(pvresult: Long, cbmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceA(instance: Long, szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceW(instance: Long, wszzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGetVersion(sesid: Long, pwversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGotoBookmark(sesid: Long, tableid: Long, pvbookmark: Long, cbbookmark: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGotoPosition(sesid: Long, tableid: Long, precpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGotoSecondaryIndexBookmark(sesid: Long, tableid: Long, pvsecondarykey: Long, cbsecondarykey: Int, pvprimarybookmark: Long, cbprimarybookmark: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetGrowDatabase(sesid: Long, dbid: Int, cpg: Int, pcpgreal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetIdle(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetIndexRecordCount(sesid: Long, tableid: Long, pcrec: Long, crecmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetInit(pinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetInit2(pinstance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetInit3A(pinstance: Long, prstinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetInit3W(pinstance: Long, prstinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetIntersectIndexes(sesid: Long, rgindexrange: Long, cindexrange: Int, precordlist: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetMakeKey(sesid: Long, tableid: Long, pvdata: Long, cbdata: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetMove(sesid: Long, tableid: Long, crow: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotAbort(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotEnd(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeA(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeW(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoA(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoW(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotPrepare(psnapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotPrepareInstance(snapid: Long, instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotThaw(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLog(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLogInstance(snapid: Long, instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenDatabaseA(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenDatabaseW(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenFileA(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenFileInstanceA(instance: Long, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenFileInstanceW(instance: Long, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenFileW(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenTableA(sesid: Long, dbid: Int, sztablename: Long, pvparameters: Long, cbparameters: Int, grbit: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenTableW(sesid: Long, dbid: Int, sztablename: Long, pvparameters: Long, cbparameters: Int, grbit: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenTempTable(sesid: Long, prgcolumndef: Long, ccolumn: Int, grbit: Int, ptableid: Long, prgcolumnid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenTempTable2(sesid: Long, prgcolumndef: Long, ccolumn: Int, lcid: Int, grbit: Int, ptableid: Long, prgcolumnid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenTempTable3(sesid: Long, prgcolumndef: Long, ccolumn: Int, pidxunicode: Long, grbit: Int, ptableid: Long, prgcolumnid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenTemporaryTable(sesid: Long, popentemporarytable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetOpenTemporaryTable2(sesid: Long, popentemporarytable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetPrepareUpdate(sesid: Long, tableid: Long, prep: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetPrereadIndexRanges(sesid: Long, tableid: Long, rgindexranges: Long, cindexranges: Int, pcrangespreread: Long, rgcolumnidpreread: Long, ccolumnidpreread: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetPrereadKeys(sesid: Long, tableid: Long, rgpvkeys: Long, rgcbkeys: Long, ckeys: Int, pckeyspreread: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetReadFile(hffile: Long, pv: Long, cb: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetReadFileInstance(instance: Long, hffile: Long, pv: Long, cb: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRegisterCallback(sesid: Long, tableid: Long, cbtyp: Int, pcallback: Long, pvcontext: Long, phcallbackid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRenameColumnA(sesid: Long, tableid: Long, szname: Long, sznamenew: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRenameColumnW(sesid: Long, tableid: Long, szname: Long, sznamenew: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRenameTableA(sesid: Long, dbid: Int, szname: Long, sznamenew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRenameTableW(sesid: Long, dbid: Int, szname: Long, sznamenew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetResetSessionContext(sesid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetResetTableSequential(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetResizeDatabase(sesid: Long, dbid: Int, cpgtarget: Int, pcpgactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRestore2A(sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRestore2W(sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRestoreA(szsource: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRestoreInstanceA(instance: Long, sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRestoreInstanceW(instance: Long, sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRestoreW(szsource: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRetrieveColumn(sesid: Long, tableid: Long, columnid: Int, pvdata: Long, cbdata: Int, pcbactual: Long, grbit: Int, pretinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRetrieveColumns(sesid: Long, tableid: Long, pretrievecolumn: Long, cretrievecolumn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRetrieveKey(sesid: Long, tableid: Long, pvkey: Long, cbmax: Int, pcbactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetRollback(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSeek(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetColumn(sesid: Long, tableid: Long, columnid: Int, pvdata: Long, cbdata: Int, grbit: Int, psetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueA(sesid: Long, dbid: Int, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueW(sesid: Long, dbid: Int, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetColumns(sesid: Long, tableid: Long, psetcolumn: Long, csetcolumn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetCurrentIndex2A(sesid: Long, tableid: Long, szindexname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetCurrentIndex2W(sesid: Long, tableid: Long, szindexname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetCurrentIndex3A(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetCurrentIndex3W(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetCurrentIndex4A(sesid: Long, tableid: Long, szindexname: Long, pindexid: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetCurrentIndex4W(sesid: Long, tableid: Long, szindexname: Long, pindexid: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetCurrentIndexA(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetCurrentIndexW(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetCursorFilter(sesid: Long, tableid: Long, rgcolumnfilters: Long, ccolumnfilters: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetDatabaseSizeA(sesid: Long, szdatabasename: Long, cpg: Int, pcpgreal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetDatabaseSizeW(sesid: Long, szdatabasename: Long, cpg: Int, pcpgreal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetIndexRange(sesid: Long, tableidsrc: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetLS(sesid: Long, tableid: Long, ls: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetSessionContext(sesid: Long, ulcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetSessionParameter(sesid: Long, sesparamid: Int, pvparam: Long, cbparam: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetSystemParameterA(pinstance: Long, sesid: Long, paramid: Int, lparam: Long, szparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetSystemParameterW(pinstance: Long, sesid: Long, paramid: Int, lparam: Long, szparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetSetTableSequential(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetStopBackup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetStopBackupInstance(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetStopService(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetStopServiceInstance(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetStopServiceInstance2(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetTerm(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetTerm2(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetTruncateLog(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetTruncateLogInstance(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetUnregisterCallback(sesid: Long, tableid: Long, cbtyp: Int, hcallbackid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetUpdate(sesid: Long, tableid: Long, pvbookmark: Long, cbbookmark: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_JetUpdate2(sesid: Long, tableid: Long, pvbookmark: Long, cbbookmark: Int, pcbactual: Long, grbit: Int): Int
}

public actual fun JetAddColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetAddColumnA(sesid.toLong(), tableid.toLong(), szcolumnname, pcolumndef, pvdefault, cbdefault.toInt(), pcolumnid)

public actual fun JetAddColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetAddColumnW(sesid.toLong(), tableid.toLong(), szcolumnname, pcolumndef, pvdefault, cbdefault.toInt(), pcolumnid)

public actual fun JetAttachDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetAttachDatabase2A(sesid.toLong(), szfilename, cpgdatabasesizemax.toInt(), grbit.toInt())

public actual fun JetAttachDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetAttachDatabase2W(sesid.toLong(), szfilename, cpgdatabasesizemax.toInt(), grbit.toInt())

public actual fun JetAttachDatabaseA(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetAttachDatabaseA(sesid.toLong(), szfilename, grbit.toInt())

public actual fun JetAttachDatabaseW(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetAttachDatabaseW(sesid.toLong(), szfilename, grbit.toInt())

public actual fun JetBackupA(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBackupA(szbackuppath, grbit.toInt(), pfnstatus.toLong())

public actual fun JetBackupInstanceA(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBackupInstanceA(instance.toLong(), szbackuppath, grbit.toInt(), pfnstatus.toLong())

public actual fun JetBackupInstanceW(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBackupInstanceW(instance.toLong(), szbackuppath, grbit.toInt(), pfnstatus.toLong())

public actual fun JetBackupW(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBackupW(szbackuppath, grbit.toInt(), pfnstatus.toLong())

public actual fun JetBeginExternalBackup(grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBeginExternalBackup(grbit.toInt())

public actual fun JetBeginExternalBackupInstance(instance: JET_INSTANCE, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBeginExternalBackupInstance(instance.toLong(), grbit.toInt())

public actual fun JetBeginSessionA(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBeginSessionA(instance.toLong(), psesid, szusername, szpassword)

public actual fun JetBeginSessionW(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBeginSessionW(instance.toLong(), psesid, szusername, szpassword)

public actual fun JetBeginTransaction(sesid: JET_SESID): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBeginTransaction(sesid.toLong())

public actual fun JetBeginTransaction2(sesid: JET_SESID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBeginTransaction2(sesid.toLong(), grbit.toInt())

public actual fun JetBeginTransaction3(sesid: JET_SESID, trxid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetBeginTransaction3(sesid.toLong(), trxid, grbit.toInt())

public actual fun JetCloseDatabase(sesid: JET_SESID, dbid: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCloseDatabase(sesid.toLong(), dbid.toInt(), grbit.toInt())

public actual fun JetCloseFile(hffile: JET_HANDLE): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCloseFile(hffile.toLong())

public actual fun JetCloseFileInstance(instance: JET_INSTANCE, hffile: JET_HANDLE): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCloseFileInstance(instance.toLong(), hffile.toLong())

public actual fun JetCloseTable(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCloseTable(sesid.toLong(), tableid.toLong())

public actual fun JetCommitTransaction(sesid: JET_SESID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCommitTransaction(sesid.toLong(), grbit.toInt())

public actual fun JetCommitTransaction2(sesid: JET_SESID, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCommitTransaction2(sesid.toLong(), grbit.toInt(), cmsecdurablecommit.toInt(), pcommitid)

public actual fun JetCompactA(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCompactA(sesid.toLong(), szdatabasesrc, szdatabasedest, pfnstatus.toLong(), pconvert, grbit.toInt())

public actual fun JetCompactW(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCompactW(sesid.toLong(), szdatabasesrc, szdatabasedest, pfnstatus.toLong(), pconvert, grbit.toInt())

public actual fun JetComputeStats(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetComputeStats(sesid.toLong(), tableid.toLong())

public actual fun JetConfigureProcessForCrashDump(grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetConfigureProcessForCrashDump(grbit.toInt())

public actual fun JetCreateDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateDatabase2A(sesid.toLong(), szfilename, cpgdatabasesizemax.toInt(), pdbid, grbit.toInt())

public actual fun JetCreateDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateDatabase2W(sesid.toLong(), szfilename, cpgdatabasesizemax.toInt(), pdbid, grbit.toInt())

public actual fun JetCreateDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateDatabaseA(sesid.toLong(), szfilename, szconnect, pdbid, grbit.toInt())

public actual fun JetCreateDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateDatabaseW(sesid.toLong(), szfilename, szconnect, pdbid, grbit.toInt())

public actual fun JetCreateIndex2A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateIndex2A(sesid.toLong(), tableid.toLong(), pindexcreate, cindexcreate.toInt())

public actual fun JetCreateIndex2W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateIndex2W(sesid.toLong(), tableid.toLong(), pindexcreate, cindexcreate.toInt())

public actual fun JetCreateIndex3A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateIndex3A(sesid.toLong(), tableid.toLong(), pindexcreate, cindexcreate.toInt())

public actual fun JetCreateIndex3W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateIndex3W(sesid.toLong(), tableid.toLong(), pindexcreate, cindexcreate.toInt())

public actual fun JetCreateIndex4A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateIndex4A(sesid.toLong(), tableid.toLong(), pindexcreate, cindexcreate.toInt())

public actual fun JetCreateIndex4W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateIndex4W(sesid.toLong(), tableid.toLong(), pindexcreate, cindexcreate.toInt())

public actual fun JetCreateIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCSTR, cbkey: UInt, ldensity: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateIndexA(sesid.toLong(), tableid.toLong(), szindexname, grbit.toInt(), szkey, cbkey.toInt(), ldensity.toInt())

public actual fun JetCreateIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCWSTR, cbkey: UInt, ldensity: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateIndexW(sesid.toLong(), tableid.toLong(), szindexname, grbit.toInt(), szkey, cbkey.toInt(), ldensity.toInt())

public actual fun JetCreateInstance2A(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateInstance2A(pinstance, szinstancename, szdisplayname, grbit.toInt())

public actual fun JetCreateInstance2W(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateInstance2W(pinstance, szinstancename, szdisplayname, grbit.toInt())

public actual fun JetCreateInstanceA(pinstance: Long, szinstancename: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateInstanceA(pinstance, szinstancename)

public actual fun JetCreateInstanceW(pinstance: Long, szinstancename: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateInstanceW(pinstance, szinstancename)

public actual fun JetCreateTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateTableA(sesid.toLong(), dbid.toInt(), sztablename, lpages.toInt(), ldensity.toInt(), ptableid)

public actual fun JetCreateTableColumnIndex2A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2A(sesid.toLong(), dbid.toInt(), ptablecreate)

public actual fun JetCreateTableColumnIndex2W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2W(sesid.toLong(), dbid.toInt(), ptablecreate)

public actual fun JetCreateTableColumnIndex3A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3A(sesid.toLong(), dbid.toInt(), ptablecreate)

public actual fun JetCreateTableColumnIndex3W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3W(sesid.toLong(), dbid.toInt(), ptablecreate)

public actual fun JetCreateTableColumnIndex4A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4A(sesid.toLong(), dbid.toInt(), ptablecreate)

public actual fun JetCreateTableColumnIndex4W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4W(sesid.toLong(), dbid.toInt(), ptablecreate)

public actual fun JetCreateTableColumnIndexA(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexA(sesid.toLong(), dbid.toInt(), ptablecreate)

public actual fun JetCreateTableColumnIndexW(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexW(sesid.toLong(), dbid.toInt(), ptablecreate)

public actual fun JetCreateTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetCreateTableW(sesid.toLong(), dbid.toInt(), sztablename, lpages.toInt(), ldensity.toInt(), ptableid)

public actual fun JetDefragment2A(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDefragment2A(sesid.toLong(), dbid.toInt(), sztablename, pcpasses, pcseconds, callback.toLong(), grbit.toInt())

public actual fun JetDefragment2W(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDefragment2W(sesid.toLong(), dbid.toInt(), sztablename, pcpasses, pcseconds, callback.toLong(), grbit.toInt())

public actual fun JetDefragment3A(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDefragment3A(sesid.toLong(), szdatabasename, sztablename, pcpasses, pcseconds, callback.toLong(), pvcontext, grbit.toInt())

public actual fun JetDefragment3W(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDefragment3W(sesid.toLong(), szdatabasename, sztablename, pcpasses, pcseconds, callback.toLong(), pvcontext, grbit.toInt())

public actual fun JetDefragmentA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDefragmentA(sesid.toLong(), dbid.toInt(), sztablename, pcpasses, pcseconds, grbit.toInt())

public actual fun JetDefragmentW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDefragmentW(sesid.toLong(), dbid.toInt(), sztablename, pcpasses, pcseconds, grbit.toInt())

public actual fun JetDelete(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDelete(sesid.toLong(), tableid.toLong())

public actual fun JetDeleteColumn2A(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDeleteColumn2A(sesid.toLong(), tableid.toLong(), szcolumnname, grbit.toInt())

public actual fun JetDeleteColumn2W(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDeleteColumn2W(sesid.toLong(), tableid.toLong(), szcolumnname, grbit.toInt())

public actual fun JetDeleteColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDeleteColumnA(sesid.toLong(), tableid.toLong(), szcolumnname)

public actual fun JetDeleteColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDeleteColumnW(sesid.toLong(), tableid.toLong(), szcolumnname)

public actual fun JetDeleteIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDeleteIndexA(sesid.toLong(), tableid.toLong(), szindexname)

public actual fun JetDeleteIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDeleteIndexW(sesid.toLong(), tableid.toLong(), szindexname)

public actual fun JetDeleteTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDeleteTableA(sesid.toLong(), dbid.toInt(), sztablename)

public actual fun JetDeleteTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDeleteTableW(sesid.toLong(), dbid.toInt(), sztablename)

public actual fun JetDetachDatabase2A(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDetachDatabase2A(sesid.toLong(), szfilename, grbit.toInt())

public actual fun JetDetachDatabase2W(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDetachDatabase2W(sesid.toLong(), szfilename, grbit.toInt())

public actual fun JetDetachDatabaseA(sesid: JET_SESID, szfilename: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDetachDatabaseA(sesid.toLong(), szfilename)

public actual fun JetDetachDatabaseW(sesid: JET_SESID, szfilename: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDetachDatabaseW(sesid.toLong(), szfilename)

public actual fun JetDupCursor(sesid: JET_SESID, tableid: JET_TABLEID, ptableid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDupCursor(sesid.toLong(), tableid.toLong(), ptableid, grbit.toInt())

public actual fun JetDupSession(sesid: JET_SESID, psesid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetDupSession(sesid.toLong(), psesid)

public actual fun JetEnableMultiInstanceA(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetEnableMultiInstanceA(psetsysparam, csetsysparam.toInt(), pcsetsucceed)

public actual fun JetEnableMultiInstanceW(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetEnableMultiInstanceW(psetsysparam, csetsysparam.toInt(), pcsetsucceed)

public actual fun JetEndExternalBackup(): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetEndExternalBackup()

public actual fun JetEndExternalBackupInstance(instance: JET_INSTANCE): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance(instance.toLong())

public actual fun JetEndExternalBackupInstance2(instance: JET_INSTANCE, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance2(instance.toLong(), grbit.toInt())

public actual fun JetEndSession(sesid: JET_SESID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetEndSession(sesid.toLong(), grbit.toInt())

public actual fun JetEnumerateColumns(sesid: JET_SESID, tableid: JET_TABLEID, cenumcolumnid: UInt, rgenumcolumnid: Long, pcenumcolumn: Long, prgenumcolumn: Long, pfnrealloc: JET_PFNREALLOC, pvrealloccontext: Long, cbdatamost: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetEnumerateColumns(sesid.toLong(), tableid.toLong(), cenumcolumnid.toInt(), rgenumcolumnid, pcenumcolumn, prgenumcolumn, pfnrealloc.toLong(), pvrealloccontext, cbdatamost.toInt(), grbit.toInt())

public actual fun JetEscrowUpdate(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pv: Long, cbmax: UInt, pvold: Long, cboldmax: UInt, pcboldactual: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetEscrowUpdate(sesid.toLong(), tableid.toLong(), columnid.toInt(), pv, cbmax.toInt(), pvold, cboldmax.toInt(), pcboldactual, grbit.toInt())

public actual fun JetExternalRestore2A(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetExternalRestore2A(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, ploginfo, sztargetinstancename, sztargetinstancelogpath, sztargetinstancecheckpointpath, pfn.toLong())

public actual fun JetExternalRestore2W(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetExternalRestore2W(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, ploginfo, sztargetinstancename, sztargetinstancelogpath, sztargetinstancecheckpointpath, pfn.toLong())

public actual fun JetExternalRestoreA(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetExternalRestoreA(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, genlow, genhigh, pfn.toLong())

public actual fun JetExternalRestoreW(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetExternalRestoreW(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, genlow, genhigh, pfn.toLong())

public actual fun JetFreeBuffer(pbbuf: PCSTR): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetFreeBuffer(pbbuf)

public actual fun JetGetAttachInfoA(szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetAttachInfoA(szzdatabases, cbmax.toInt(), pcbactual)

public actual fun JetGetAttachInfoInstanceA(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceA(instance.toLong(), szzdatabases, cbmax.toInt(), pcbactual)

public actual fun JetGetAttachInfoInstanceW(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceW(instance.toLong(), szzdatabases, cbmax.toInt(), pcbactual)

public actual fun JetGetAttachInfoW(wszzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetAttachInfoW(wszzdatabases, cbmax.toInt(), pcbactual)

public actual fun JetGetBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetBookmark(sesid.toLong(), tableid.toLong(), pvbookmark, cbmax.toInt(), pcbactual)

public actual fun JetGetColumnInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetColumnInfoA(sesid.toLong(), dbid.toInt(), sztablename, pcolumnnameorid, pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetColumnInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pwcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetColumnInfoW(sesid.toLong(), dbid.toInt(), sztablename, pwcolumnnameorid, pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetCurrentIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, cbindexname: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetCurrentIndexA(sesid.toLong(), tableid.toLong(), szindexname, cbindexname.toInt())

public actual fun JetGetCurrentIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, cbindexname: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetCurrentIndexW(sesid.toLong(), tableid.toLong(), szindexname, cbindexname.toInt())

public actual fun JetGetCursorInfo(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetCursorInfo(sesid.toLong(), tableid.toLong(), pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetDatabaseFileInfoA(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoA(szdatabasename, pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetDatabaseFileInfoW(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoW(szdatabasename, pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetDatabaseInfoA(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetDatabaseInfoA(sesid.toLong(), dbid.toInt(), pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetDatabaseInfoW(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetDatabaseInfoW(sesid.toLong(), dbid.toInt(), pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetErrorInfoW(pvcontext: Long, pvresult: Long, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetErrorInfoW(pvcontext, pvresult, cbmax.toInt(), infolevel.toInt(), grbit.toInt())

public actual fun JetGetIndexInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetIndexInfoA(sesid.toLong(), dbid.toInt(), sztablename, szindexname, pvresult, cbresult.toInt(), infolevel.toInt())

public actual fun JetGetIndexInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetIndexInfoW(sesid.toLong(), dbid.toInt(), sztablename, szindexname, pvresult, cbresult.toInt(), infolevel.toInt())

public actual fun JetGetInstanceInfoA(pcinstanceinfo: Long, painstanceinfo: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetInstanceInfoA(pcinstanceinfo, painstanceinfo)

public actual fun JetGetInstanceInfoW(pcinstanceinfo: Long, painstanceinfo: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetInstanceInfoW(pcinstanceinfo, painstanceinfo)

public actual fun JetGetInstanceMiscInfo(instance: JET_INSTANCE, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetInstanceMiscInfo(instance.toLong(), pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetLS(sesid: JET_SESID, tableid: JET_TABLEID, pls: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetLS(sesid.toLong(), tableid.toLong(), pls, grbit.toInt())

public actual fun JetGetLock(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetLock(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun JetGetLogInfoA(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetLogInfoA(szzlogs, cbmax.toInt(), pcbactual)

public actual fun JetGetLogInfoInstance2A(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2A(instance.toLong(), szzlogs, cbmax.toInt(), pcbactual, ploginfo)

public actual fun JetGetLogInfoInstance2W(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2W(instance.toLong(), wszzlogs, cbmax.toInt(), pcbactual, ploginfo)

public actual fun JetGetLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceA(instance.toLong(), szzlogs, cbmax.toInt(), pcbactual)

public actual fun JetGetLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceW(instance.toLong(), wszzlogs, cbmax.toInt(), pcbactual)

public actual fun JetGetLogInfoW(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetLogInfoW(szzlogs, cbmax.toInt(), pcbactual)

public actual fun JetGetObjectInfoA(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetObjectInfoA(sesid.toLong(), dbid.toInt(), objtyp.toInt(), szcontainername, szobjectname, pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetObjectInfoW(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetObjectInfoW(sesid.toLong(), dbid.toInt(), objtyp.toInt(), szcontainername, szobjectname, pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetRecordPosition(sesid: JET_SESID, tableid: JET_TABLEID, precpos: Long, cbrecpos: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetRecordPosition(sesid.toLong(), tableid.toLong(), precpos, cbrecpos.toInt())

public actual fun JetGetRecordSize(sesid: JET_SESID, tableid: JET_TABLEID, precsize: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetRecordSize(sesid.toLong(), tableid.toLong(), precsize, grbit.toInt())

public actual fun JetGetRecordSize2(sesid: JET_SESID, tableid: JET_TABLEID, precsize: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetRecordSize2(sesid.toLong(), tableid.toLong(), precsize, grbit.toInt())

public actual fun JetGetSecondaryIndexBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvsecondarykey: Long, cbsecondarykeymax: UInt, pcbsecondarykeyactual: Long, pvprimarybookmark: Long, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetSecondaryIndexBookmark(sesid.toLong(), tableid.toLong(), pvsecondarykey, cbsecondarykeymax.toInt(), pcbsecondarykeyactual, pvprimarybookmark, cbprimarybookmarkmax.toInt(), pcbprimarybookmarkactual, grbit.toInt())

public actual fun JetGetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparammax: UInt, pcbparamactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetSessionParameter(sesid.toLong(), sesparamid.toInt(), pvparam, cbparammax.toInt(), pcbparamactual)

public actual fun JetGetSystemParameterA(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetSystemParameterA(instance.toLong(), sesid.toLong(), paramid.toInt(), plparam, szparam, cbmax.toInt())

public actual fun JetGetSystemParameterW(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetSystemParameterW(instance.toLong(), sesid.toLong(), paramid.toInt(), plparam, szparam, cbmax.toInt())

public actual fun JetGetTableColumnInfoA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetTableColumnInfoA(sesid.toLong(), tableid.toLong(), szcolumnname, pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetTableColumnInfoW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetTableColumnInfoW(sesid.toLong(), tableid.toLong(), szcolumnname, pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetTableIndexInfoA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetTableIndexInfoA(sesid.toLong(), tableid.toLong(), szindexname, pvresult, cbresult.toInt(), infolevel.toInt())

public actual fun JetGetTableIndexInfoW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetTableIndexInfoW(sesid.toLong(), tableid.toLong(), szindexname, pvresult, cbresult.toInt(), infolevel.toInt())

public actual fun JetGetTableInfoA(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetTableInfoA(sesid.toLong(), tableid.toLong(), pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetTableInfoW(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetTableInfoW(sesid.toLong(), tableid.toLong(), pvresult, cbmax.toInt(), infolevel.toInt())

public actual fun JetGetThreadStats(pvresult: Long, cbmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetThreadStats(pvresult, cbmax.toInt())

public actual fun JetGetTruncateLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceA(instance.toLong(), szzlogs, cbmax.toInt(), pcbactual)

public actual fun JetGetTruncateLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceW(instance.toLong(), wszzlogs, cbmax.toInt(), pcbactual)

public actual fun JetGetVersion(sesid: JET_SESID, pwversion: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGetVersion(sesid.toLong(), pwversion)

public actual fun JetGotoBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGotoBookmark(sesid.toLong(), tableid.toLong(), pvbookmark, cbbookmark.toInt())

public actual fun JetGotoPosition(sesid: JET_SESID, tableid: JET_TABLEID, precpos: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGotoPosition(sesid.toLong(), tableid.toLong(), precpos)

public actual fun JetGotoSecondaryIndexBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvsecondarykey: Long, cbsecondarykey: UInt, pvprimarybookmark: Long, cbprimarybookmark: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGotoSecondaryIndexBookmark(sesid.toLong(), tableid.toLong(), pvsecondarykey, cbsecondarykey.toInt(), pvprimarybookmark, cbprimarybookmark.toInt(), grbit.toInt())

public actual fun JetGrowDatabase(sesid: JET_SESID, dbid: UInt, cpg: UInt, pcpgreal: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetGrowDatabase(sesid.toLong(), dbid.toInt(), cpg.toInt(), pcpgreal)

public actual fun JetIdle(sesid: JET_SESID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetIdle(sesid.toLong(), grbit.toInt())

public actual fun JetIndexRecordCount(sesid: JET_SESID, tableid: JET_TABLEID, pcrec: Long, crecmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetIndexRecordCount(sesid.toLong(), tableid.toLong(), pcrec, crecmax.toInt())

public actual fun JetInit(pinstance: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetInit(pinstance)

public actual fun JetInit2(pinstance: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetInit2(pinstance, grbit.toInt())

public actual fun JetInit3A(pinstance: Long, prstinfo: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetInit3A(pinstance, prstinfo, grbit.toInt())

public actual fun JetInit3W(pinstance: Long, prstinfo: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetInit3W(pinstance, prstinfo, grbit.toInt())

public actual fun JetIntersectIndexes(sesid: JET_SESID, rgindexrange: Long, cindexrange: UInt, precordlist: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetIntersectIndexes(sesid.toLong(), rgindexrange, cindexrange.toInt(), precordlist, grbit.toInt())

public actual fun JetMakeKey(sesid: JET_SESID, tableid: JET_TABLEID, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetMakeKey(sesid.toLong(), tableid.toLong(), pvdata, cbdata.toInt(), grbit.toInt())

public actual fun JetMove(sesid: JET_SESID, tableid: JET_TABLEID, crow: Int, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetMove(sesid.toLong(), tableid.toLong(), crow, grbit.toInt())

public actual fun JetOSSnapshotAbort(snapid: JET_OSSNAPID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotAbort(snapid.toLong(), grbit.toInt())

public actual fun JetOSSnapshotEnd(snapid: JET_OSSNAPID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotEnd(snapid.toLong(), grbit.toInt())

public actual fun JetOSSnapshotFreezeA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeA(snapid.toLong(), pcinstanceinfo, painstanceinfo, grbit.toInt())

public actual fun JetOSSnapshotFreezeW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeW(snapid.toLong(), pcinstanceinfo, painstanceinfo, grbit.toInt())

public actual fun JetOSSnapshotGetFreezeInfoA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoA(snapid.toLong(), pcinstanceinfo, painstanceinfo, grbit.toInt())

public actual fun JetOSSnapshotGetFreezeInfoW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoW(snapid.toLong(), pcinstanceinfo, painstanceinfo, grbit.toInt())

public actual fun JetOSSnapshotPrepare(psnapid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotPrepare(psnapid, grbit.toInt())

public actual fun JetOSSnapshotPrepareInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotPrepareInstance(snapid.toLong(), instance.toLong(), grbit.toInt())

public actual fun JetOSSnapshotThaw(snapid: JET_OSSNAPID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotThaw(snapid.toLong(), grbit.toInt())

public actual fun JetOSSnapshotTruncateLog(snapid: JET_OSSNAPID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLog(snapid.toLong(), grbit.toInt())

public actual fun JetOSSnapshotTruncateLogInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLogInstance(snapid.toLong(), instance.toLong(), grbit.toInt())

public actual fun JetOpenDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenDatabaseA(sesid.toLong(), szfilename, szconnect, pdbid, grbit.toInt())

public actual fun JetOpenDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenDatabaseW(sesid.toLong(), szfilename, szconnect, pdbid, grbit.toInt())

public actual fun JetOpenFileA(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenFileA(szfilename, phffile, pulfilesizelow, pulfilesizehigh)

public actual fun JetOpenFileInstanceA(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenFileInstanceA(instance.toLong(), szfilename, phffile, pulfilesizelow, pulfilesizehigh)

public actual fun JetOpenFileInstanceW(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenFileInstanceW(instance.toLong(), szfilename, phffile, pulfilesizelow, pulfilesizehigh)

public actual fun JetOpenFileW(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenFileW(szfilename, phffile, pulfilesizelow, pulfilesizehigh)

public actual fun JetOpenTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenTableA(sesid.toLong(), dbid.toInt(), sztablename, pvparameters, cbparameters.toInt(), grbit.toInt(), ptableid)

public actual fun JetOpenTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenTableW(sesid.toLong(), dbid.toInt(), sztablename, pvparameters, cbparameters.toInt(), grbit.toInt(), ptableid)

public actual fun JetOpenTempTable(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenTempTable(sesid.toLong(), prgcolumndef, ccolumn.toInt(), grbit.toInt(), ptableid, prgcolumnid)

public actual fun JetOpenTempTable2(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenTempTable2(sesid.toLong(), prgcolumndef, ccolumn.toInt(), lcid.toInt(), grbit.toInt(), ptableid, prgcolumnid)

public actual fun JetOpenTempTable3(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, pidxunicode: Long, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenTempTable3(sesid.toLong(), prgcolumndef, ccolumn.toInt(), pidxunicode, grbit.toInt(), ptableid, prgcolumnid)

public actual fun JetOpenTemporaryTable(sesid: JET_SESID, popentemporarytable: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenTemporaryTable(sesid.toLong(), popentemporarytable)

public actual fun JetOpenTemporaryTable2(sesid: JET_SESID, popentemporarytable: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetOpenTemporaryTable2(sesid.toLong(), popentemporarytable)

public actual fun JetPrepareUpdate(sesid: JET_SESID, tableid: JET_TABLEID, prep: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetPrepareUpdate(sesid.toLong(), tableid.toLong(), prep.toInt())

public actual fun JetPrereadIndexRanges(sesid: JET_SESID, tableid: JET_TABLEID, rgindexranges: Long, cindexranges: UInt, pcrangespreread: Long, rgcolumnidpreread: Long, ccolumnidpreread: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetPrereadIndexRanges(sesid.toLong(), tableid.toLong(), rgindexranges, cindexranges.toInt(), pcrangespreread, rgcolumnidpreread, ccolumnidpreread.toInt(), grbit.toInt())

public actual fun JetPrereadKeys(sesid: JET_SESID, tableid: JET_TABLEID, rgpvkeys: Long, rgcbkeys: Long, ckeys: Int, pckeyspreread: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetPrereadKeys(sesid.toLong(), tableid.toLong(), rgpvkeys, rgcbkeys, ckeys, pckeyspreread, grbit.toInt())

public actual fun JetReadFile(hffile: JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetReadFile(hffile.toLong(), pv, cb.toInt(), pcbactual)

public actual fun JetReadFileInstance(instance: JET_INSTANCE, hffile: JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetReadFileInstance(instance.toLong(), hffile.toLong(), pv, cb.toInt(), pcbactual)

public actual fun JetRegisterCallback(sesid: JET_SESID, tableid: JET_TABLEID, cbtyp: UInt, pcallback: JET_CALLBACK, pvcontext: Long, phcallbackid: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRegisterCallback(sesid.toLong(), tableid.toLong(), cbtyp.toInt(), pcallback.toLong(), pvcontext, phcallbackid)

public actual fun JetRenameColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRenameColumnA(sesid.toLong(), tableid.toLong(), szname, sznamenew, grbit.toInt())

public actual fun JetRenameColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRenameColumnW(sesid.toLong(), tableid.toLong(), szname, sznamenew, grbit.toInt())

public actual fun JetRenameTableA(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRenameTableA(sesid.toLong(), dbid.toInt(), szname, sznamenew)

public actual fun JetRenameTableW(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRenameTableW(sesid.toLong(), dbid.toInt(), szname, sznamenew)

public actual fun JetResetSessionContext(sesid: JET_SESID): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetResetSessionContext(sesid.toLong())

public actual fun JetResetTableSequential(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetResetTableSequential(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun JetResizeDatabase(sesid: JET_SESID, dbid: UInt, cpgtarget: UInt, pcpgactual: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetResizeDatabase(sesid.toLong(), dbid.toInt(), cpgtarget.toInt(), pcpgactual, grbit.toInt())

public actual fun JetRestore2A(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRestore2A(sz, szdest, pfn.toLong())

public actual fun JetRestore2W(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRestore2W(sz, szdest, pfn.toLong())

public actual fun JetRestoreA(szsource: Long, pfn: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRestoreA(szsource, pfn.toLong())

public actual fun JetRestoreInstanceA(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRestoreInstanceA(instance.toLong(), sz, szdest, pfn.toLong())

public actual fun JetRestoreInstanceW(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRestoreInstanceW(instance.toLong(), sz, szdest, pfn.toLong())

public actual fun JetRestoreW(szsource: Long, pfn: JET_PFNSTATUS): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRestoreW(szsource, pfn.toLong())

public actual fun JetRetrieveColumn(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, pcbactual: Long, grbit: UInt, pretinfo: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRetrieveColumn(sesid.toLong(), tableid.toLong(), columnid.toInt(), pvdata, cbdata.toInt(), pcbactual, grbit.toInt(), pretinfo)

public actual fun JetRetrieveColumns(sesid: JET_SESID, tableid: JET_TABLEID, pretrievecolumn: Long, cretrievecolumn: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRetrieveColumns(sesid.toLong(), tableid.toLong(), pretrievecolumn, cretrievecolumn.toInt())

public actual fun JetRetrieveKey(sesid: JET_SESID, tableid: JET_TABLEID, pvkey: Long, cbmax: UInt, pcbactual: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRetrieveKey(sesid.toLong(), tableid.toLong(), pvkey, cbmax.toInt(), pcbactual, grbit.toInt())

public actual fun JetRollback(sesid: JET_SESID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetRollback(sesid.toLong(), grbit.toInt())

public actual fun JetSeek(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSeek(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun JetSetColumn(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, grbit: UInt, psetinfo: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetColumn(sesid.toLong(), tableid.toLong(), columnid.toInt(), pvdata, cbdata.toInt(), grbit.toInt(), psetinfo)

public actual fun JetSetColumnDefaultValueA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueA(sesid.toLong(), dbid.toInt(), sztablename, szcolumnname, pvdata, cbdata.toInt(), grbit.toInt())

public actual fun JetSetColumnDefaultValueW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueW(sesid.toLong(), dbid.toInt(), sztablename, szcolumnname, pvdata, cbdata.toInt(), grbit.toInt())

public actual fun JetSetColumns(sesid: JET_SESID, tableid: JET_TABLEID, psetcolumn: Long, csetcolumn: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetColumns(sesid.toLong(), tableid.toLong(), psetcolumn, csetcolumn.toInt())

public actual fun JetSetCurrentIndex2A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetCurrentIndex2A(sesid.toLong(), tableid.toLong(), szindexname, grbit.toInt())

public actual fun JetSetCurrentIndex2W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetCurrentIndex2W(sesid.toLong(), tableid.toLong(), szindexname, grbit.toInt())

public actual fun JetSetCurrentIndex3A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetCurrentIndex3A(sesid.toLong(), tableid.toLong(), szindexname, grbit.toInt(), itagsequence.toInt())

public actual fun JetSetCurrentIndex3W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetCurrentIndex3W(sesid.toLong(), tableid.toLong(), szindexname, grbit.toInt(), itagsequence.toInt())

public actual fun JetSetCurrentIndex4A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetCurrentIndex4A(sesid.toLong(), tableid.toLong(), szindexname, pindexid, grbit.toInt(), itagsequence.toInt())

public actual fun JetSetCurrentIndex4W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetCurrentIndex4W(sesid.toLong(), tableid.toLong(), szindexname, pindexid, grbit.toInt(), itagsequence.toInt())

public actual fun JetSetCurrentIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetCurrentIndexA(sesid.toLong(), tableid.toLong(), szindexname)

public actual fun JetSetCurrentIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetCurrentIndexW(sesid.toLong(), tableid.toLong(), szindexname)

public actual fun JetSetCursorFilter(sesid: JET_SESID, tableid: JET_TABLEID, rgcolumnfilters: Long, ccolumnfilters: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetCursorFilter(sesid.toLong(), tableid.toLong(), rgcolumnfilters, ccolumnfilters.toInt(), grbit.toInt())

public actual fun JetSetDatabaseSizeA(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetDatabaseSizeA(sesid.toLong(), szdatabasename, cpg.toInt(), pcpgreal)

public actual fun JetSetDatabaseSizeW(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetDatabaseSizeW(sesid.toLong(), szdatabasename, cpg.toInt(), pcpgreal)

public actual fun JetSetIndexRange(sesid: JET_SESID, tableidsrc: JET_TABLEID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetIndexRange(sesid.toLong(), tableidsrc.toLong(), grbit.toInt())

public actual fun JetSetLS(sesid: JET_SESID, tableid: JET_TABLEID, ls: JET_LS, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetLS(sesid.toLong(), tableid.toLong(), ls.toLong(), grbit.toInt())

public actual fun JetSetSessionContext(sesid: JET_SESID, ulcontext: JET_API_PTR): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetSessionContext(sesid.toLong(), ulcontext.toLong())

public actual fun JetSetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparam: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetSessionParameter(sesid.toLong(), sesparamid.toInt(), pvparam, cbparam.toInt())

public actual fun JetSetSystemParameterA(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: JET_API_PTR, szparam: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetSystemParameterA(pinstance, sesid.toLong(), paramid.toInt(), lparam.toLong(), szparam)

public actual fun JetSetSystemParameterW(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: JET_API_PTR, szparam: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetSystemParameterW(pinstance, sesid.toLong(), paramid.toInt(), lparam.toLong(), szparam)

public actual fun JetSetTableSequential(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetSetTableSequential(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun JetStopBackup(): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetStopBackup()

public actual fun JetStopBackupInstance(instance: JET_INSTANCE): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetStopBackupInstance(instance.toLong())

public actual fun JetStopService(): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetStopService()

public actual fun JetStopServiceInstance(instance: JET_INSTANCE): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetStopServiceInstance(instance.toLong())

public actual fun JetStopServiceInstance2(instance: JET_INSTANCE, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetStopServiceInstance2(instance.toLong(), grbit.toInt())

public actual fun JetTerm(instance: JET_INSTANCE): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetTerm(instance.toLong())

public actual fun JetTerm2(instance: JET_INSTANCE, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetTerm2(instance.toLong(), grbit.toInt())

public actual fun JetTruncateLog(): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetTruncateLog()

public actual fun JetTruncateLogInstance(instance: JET_INSTANCE): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetTruncateLogInstance(instance.toLong())

public actual fun JetUnregisterCallback(sesid: JET_SESID, tableid: JET_TABLEID, cbtyp: UInt, hcallbackid: JET_HANDLE): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetUnregisterCallback(sesid.toLong(), tableid.toLong(), cbtyp.toInt(), hcallbackid.toLong())

public actual fun JetUpdate(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetUpdate(sesid.toLong(), tableid.toLong(), pvbookmark, cbbookmark.toInt(), pcbactual)

public actual fun JetUpdate2(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_JetUpdate2(sesid.toLong(), tableid.toLong(), pvbookmark, cbbookmark.toInt(), pcbactual, grbit.toInt())
