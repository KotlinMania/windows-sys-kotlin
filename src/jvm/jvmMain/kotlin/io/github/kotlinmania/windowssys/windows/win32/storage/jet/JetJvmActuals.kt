@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

private object WindowsWin32StorageJetJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetAddColumnA(sesid: Long, tableid: Long, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: Int, pcolumnid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetAddColumnW(sesid: Long, tableid: Long, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: Int, pcolumnid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetAttachDatabase2A(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetAttachDatabase2W(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetAttachDatabaseA(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetAttachDatabaseW(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBackupA(szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBackupInstanceA(instance: Long, szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBackupInstanceW(instance: Long, szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBackupW(szbackuppath: Long, grbit: Int, pfnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBeginExternalBackup(grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBeginExternalBackupInstance(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBeginSessionA(instance: Long, psesid: Long, szusername: Long, szpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBeginSessionW(instance: Long, psesid: Long, szusername: Long, szpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBeginTransaction(sesid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBeginTransaction2(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetBeginTransaction3(sesid: Long, trxid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCloseDatabase(sesid: Long, dbid: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCloseFile(hffile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCloseFileInstance(instance: Long, hffile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCloseTable(sesid: Long, tableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCommitTransaction(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCommitTransaction2(sesid: Long, grbit: Int, cmsecdurablecommit: Int, pcommitid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCompactA(sesid: Long, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: Long, pconvert: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCompactW(sesid: Long, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: Long, pconvert: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetComputeStats(sesid: Long, tableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetConfigureProcessForCrashDump(grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateDatabase2A(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateDatabase2W(sesid: Long, szfilename: Long, cpgdatabasesizemax: Int, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateDatabaseA(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateDatabaseW(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateIndex2A(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateIndex2W(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateIndex3A(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateIndex3W(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateIndex4A(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateIndex4W(sesid: Long, tableid: Long, pindexcreate: Long, cindexcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateIndexA(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, szkey: Long, cbkey: Int, ldensity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateIndexW(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, szkey: Long, cbkey: Int, ldensity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateInstance2A(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateInstance2W(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateInstanceA(pinstance: Long, szinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateInstanceW(pinstance: Long, szinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateTableA(sesid: Long, dbid: Int, sztablename: Long, lpages: Int, ldensity: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2A(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2W(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3A(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3W(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4A(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4W(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexA(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexW(sesid: Long, dbid: Int, ptablecreate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetCreateTableW(sesid: Long, dbid: Int, sztablename: Long, lpages: Int, ldensity: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDefragment2A(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDefragment2W(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDefragment3A(sesid: Long, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, pvcontext: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDefragment3W(sesid: Long, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: Long, pvcontext: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDefragmentA(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDefragmentW(sesid: Long, dbid: Int, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDelete(sesid: Long, tableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDeleteColumn2A(sesid: Long, tableid: Long, szcolumnname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDeleteColumn2W(sesid: Long, tableid: Long, szcolumnname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDeleteColumnA(sesid: Long, tableid: Long, szcolumnname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDeleteColumnW(sesid: Long, tableid: Long, szcolumnname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDeleteIndexA(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDeleteIndexW(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDeleteTableA(sesid: Long, dbid: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDeleteTableW(sesid: Long, dbid: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDetachDatabase2A(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDetachDatabase2W(sesid: Long, szfilename: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDetachDatabaseA(sesid: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDetachDatabaseW(sesid: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDupCursor(sesid: Long, tableid: Long, ptableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetDupSession(sesid: Long, psesid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetEnableMultiInstanceA(psetsysparam: Long, csetsysparam: Int, pcsetsucceed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetEnableMultiInstanceW(psetsysparam: Long, csetsysparam: Int, pcsetsucceed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetEndExternalBackup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance2(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetEndSession(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetEnumerateColumns(sesid: Long, tableid: Long, cenumcolumnid: Int, rgenumcolumnid: Long, pcenumcolumn: Long, prgenumcolumn: Long, pfnrealloc: Long, pvrealloccontext: Long, cbdatamost: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetEscrowUpdate(sesid: Long, tableid: Long, columnid: Int, pv: Long, cbmax: Int, pvold: Long, cboldmax: Int, pcboldactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetExternalRestore2A(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetExternalRestore2W(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetExternalRestoreA(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetExternalRestoreW(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetFreeBuffer(pbbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetAttachInfoA(szzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceA(instance: Long, szzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceW(instance: Long, szzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetAttachInfoW(wszzdatabases: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetBookmark(sesid: Long, tableid: Long, pvbookmark: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetColumnInfoA(sesid: Long, dbid: Int, sztablename: Long, pcolumnnameorid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetColumnInfoW(sesid: Long, dbid: Int, sztablename: Long, pwcolumnnameorid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetCurrentIndexA(sesid: Long, tableid: Long, szindexname: Long, cbindexname: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetCurrentIndexW(sesid: Long, tableid: Long, szindexname: Long, cbindexname: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetCursorInfo(sesid: Long, tableid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoA(szdatabasename: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoW(szdatabasename: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetDatabaseInfoA(sesid: Long, dbid: Int, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetDatabaseInfoW(sesid: Long, dbid: Int, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetErrorInfoW(pvcontext: Long, pvresult: Long, cbmax: Int, infolevel: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetIndexInfoA(sesid: Long, dbid: Int, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetIndexInfoW(sesid: Long, dbid: Int, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetInstanceInfoA(pcinstanceinfo: Long, painstanceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetInstanceInfoW(pcinstanceinfo: Long, painstanceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetInstanceMiscInfo(instance: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetLS(sesid: Long, tableid: Long, pls: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetLock(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetLogInfoA(szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2A(instance: Long, szzlogs: Long, cbmax: Int, pcbactual: Long, ploginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2W(instance: Long, wszzlogs: Long, cbmax: Int, pcbactual: Long, ploginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceA(instance: Long, szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceW(instance: Long, wszzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetLogInfoW(szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetObjectInfoA(sesid: Long, dbid: Int, objtyp: Int, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetObjectInfoW(sesid: Long, dbid: Int, objtyp: Int, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetRecordPosition(sesid: Long, tableid: Long, precpos: Long, cbrecpos: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetRecordSize(sesid: Long, tableid: Long, precsize: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetRecordSize2(sesid: Long, tableid: Long, precsize: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetSecondaryIndexBookmark(sesid: Long, tableid: Long, pvsecondarykey: Long, cbsecondarykeymax: Int, pcbsecondarykeyactual: Long, pvprimarybookmark: Long, cbprimarybookmarkmax: Int, pcbprimarybookmarkactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetSessionParameter(sesid: Long, sesparamid: Int, pvparam: Long, cbparammax: Int, pcbparamactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetSystemParameterA(instance: Long, sesid: Long, paramid: Int, plparam: Long, szparam: Long, cbmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetSystemParameterW(instance: Long, sesid: Long, paramid: Int, plparam: Long, szparam: Long, cbmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetTableColumnInfoA(sesid: Long, tableid: Long, szcolumnname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetTableColumnInfoW(sesid: Long, tableid: Long, szcolumnname: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetTableIndexInfoA(sesid: Long, tableid: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetTableIndexInfoW(sesid: Long, tableid: Long, szindexname: Long, pvresult: Long, cbresult: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetTableInfoA(sesid: Long, tableid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetTableInfoW(sesid: Long, tableid: Long, pvresult: Long, cbmax: Int, infolevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetThreadStats(pvresult: Long, cbmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceA(instance: Long, szzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceW(instance: Long, wszzlogs: Long, cbmax: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGetVersion(sesid: Long, pwversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGotoBookmark(sesid: Long, tableid: Long, pvbookmark: Long, cbbookmark: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGotoPosition(sesid: Long, tableid: Long, precpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGotoSecondaryIndexBookmark(sesid: Long, tableid: Long, pvsecondarykey: Long, cbsecondarykey: Int, pvprimarybookmark: Long, cbprimarybookmark: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetGrowDatabase(sesid: Long, dbid: Int, cpg: Int, pcpgreal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetIdle(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetIndexRecordCount(sesid: Long, tableid: Long, pcrec: Long, crecmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetInit(pinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetInit2(pinstance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetInit3A(pinstance: Long, prstinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetInit3W(pinstance: Long, prstinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetIntersectIndexes(sesid: Long, rgindexrange: Long, cindexrange: Int, precordlist: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetMakeKey(sesid: Long, tableid: Long, pvdata: Long, cbdata: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetMove(sesid: Long, tableid: Long, crow: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotAbort(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotEnd(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeA(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeW(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoA(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoW(snapid: Long, pcinstanceinfo: Long, painstanceinfo: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotPrepare(psnapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotPrepareInstance(snapid: Long, instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotThaw(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLog(snapid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLogInstance(snapid: Long, instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenDatabaseA(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenDatabaseW(sesid: Long, szfilename: Long, szconnect: Long, pdbid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenFileA(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenFileInstanceA(instance: Long, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenFileInstanceW(instance: Long, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenFileW(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenTableA(sesid: Long, dbid: Int, sztablename: Long, pvparameters: Long, cbparameters: Int, grbit: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenTableW(sesid: Long, dbid: Int, sztablename: Long, pvparameters: Long, cbparameters: Int, grbit: Int, ptableid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenTempTable(sesid: Long, prgcolumndef: Long, ccolumn: Int, grbit: Int, ptableid: Long, prgcolumnid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenTempTable2(sesid: Long, prgcolumndef: Long, ccolumn: Int, lcid: Int, grbit: Int, ptableid: Long, prgcolumnid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenTempTable3(sesid: Long, prgcolumndef: Long, ccolumn: Int, pidxunicode: Long, grbit: Int, ptableid: Long, prgcolumnid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenTemporaryTable(sesid: Long, popentemporarytable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetOpenTemporaryTable2(sesid: Long, popentemporarytable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetPrepareUpdate(sesid: Long, tableid: Long, prep: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetPrereadIndexRanges(sesid: Long, tableid: Long, rgindexranges: Long, cindexranges: Int, pcrangespreread: Long, rgcolumnidpreread: Long, ccolumnidpreread: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetPrereadKeys(sesid: Long, tableid: Long, rgpvkeys: Long, rgcbkeys: Long, ckeys: Int, pckeyspreread: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetReadFile(hffile: Long, pv: Long, cb: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetReadFileInstance(instance: Long, hffile: Long, pv: Long, cb: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRegisterCallback(sesid: Long, tableid: Long, cbtyp: Int, pcallback: Long, pvcontext: Long, phcallbackid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRenameColumnA(sesid: Long, tableid: Long, szname: Long, sznamenew: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRenameColumnW(sesid: Long, tableid: Long, szname: Long, sznamenew: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRenameTableA(sesid: Long, dbid: Int, szname: Long, sznamenew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRenameTableW(sesid: Long, dbid: Int, szname: Long, sznamenew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetResetSessionContext(sesid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetResetTableSequential(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetResizeDatabase(sesid: Long, dbid: Int, cpgtarget: Int, pcpgactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRestore2A(sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRestore2W(sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRestoreA(szsource: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRestoreInstanceA(instance: Long, sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRestoreInstanceW(instance: Long, sz: Long, szdest: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRestoreW(szsource: Long, pfn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRetrieveColumn(sesid: Long, tableid: Long, columnid: Int, pvdata: Long, cbdata: Int, pcbactual: Long, grbit: Int, pretinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRetrieveColumns(sesid: Long, tableid: Long, pretrievecolumn: Long, cretrievecolumn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRetrieveKey(sesid: Long, tableid: Long, pvkey: Long, cbmax: Int, pcbactual: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetRollback(sesid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSeek(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetColumn(sesid: Long, tableid: Long, columnid: Int, pvdata: Long, cbdata: Int, grbit: Int, psetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueA(sesid: Long, dbid: Int, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueW(sesid: Long, dbid: Int, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetColumns(sesid: Long, tableid: Long, psetcolumn: Long, csetcolumn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetCurrentIndex2A(sesid: Long, tableid: Long, szindexname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetCurrentIndex2W(sesid: Long, tableid: Long, szindexname: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetCurrentIndex3A(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetCurrentIndex3W(sesid: Long, tableid: Long, szindexname: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetCurrentIndex4A(sesid: Long, tableid: Long, szindexname: Long, pindexid: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetCurrentIndex4W(sesid: Long, tableid: Long, szindexname: Long, pindexid: Long, grbit: Int, itagsequence: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetCurrentIndexA(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetCurrentIndexW(sesid: Long, tableid: Long, szindexname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetCursorFilter(sesid: Long, tableid: Long, rgcolumnfilters: Long, ccolumnfilters: Int, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetDatabaseSizeA(sesid: Long, szdatabasename: Long, cpg: Int, pcpgreal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetDatabaseSizeW(sesid: Long, szdatabasename: Long, cpg: Int, pcpgreal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetIndexRange(sesid: Long, tableidsrc: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetLS(sesid: Long, tableid: Long, ls: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetSessionContext(sesid: Long, ulcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetSessionParameter(sesid: Long, sesparamid: Int, pvparam: Long, cbparam: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetSystemParameterA(pinstance: Long, sesid: Long, paramid: Int, lparam: Long, szparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetSystemParameterW(pinstance: Long, sesid: Long, paramid: Int, lparam: Long, szparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetSetTableSequential(sesid: Long, tableid: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetStopBackup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetStopBackupInstance(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetStopService(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetStopServiceInstance(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetStopServiceInstance2(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetTerm(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetTerm2(instance: Long, grbit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetTruncateLog(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetTruncateLogInstance(instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetUnregisterCallback(sesid: Long, tableid: Long, cbtyp: Int, hcallbackid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetUpdate(sesid: Long, tableid: Long, pvbookmark: Long, cbbookmark: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_jet_jetUpdate2(sesid: Long, tableid: Long, pvbookmark: Long, cbbookmark: Int, pcbactual: Long, grbit: Int): Int
}

public actual fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pcolumndef: COpaquePointer?, pvdefault: COpaquePointer?, cbdefault: UInt, pcolumnid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetAddColumnA(sesid.toLong(), tableid.toLong(), (szcolumnname?.value ?: 0L), (pcolumndef?.value ?: 0L), (pvdefault?.value ?: 0L), cbdefault.toInt(), (pcolumnid?.value ?: 0L))

public actual fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pcolumndef: COpaquePointer?, pvdefault: COpaquePointer?, cbdefault: UInt, pcolumnid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetAddColumnW(sesid.toLong(), tableid.toLong(), (szcolumnname?.value ?: 0L), (pcolumndef?.value ?: 0L), (pvdefault?.value ?: 0L), cbdefault.toInt(), (pcolumnid?.value ?: 0L))

public actual fun jetAttachDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetAttachDatabase2A(sesid.toLong(), (szfilename?.value ?: 0L), cpgdatabasesizemax.toInt(), grbit.toInt())

public actual fun jetAttachDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetAttachDatabase2W(sesid.toLong(), (szfilename?.value ?: 0L), cpgdatabasesizemax.toInt(), grbit.toInt())

public actual fun jetAttachDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetAttachDatabaseA(sesid.toLong(), (szfilename?.value ?: 0L), grbit.toInt())

public actual fun jetAttachDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetAttachDatabaseW(sesid.toLong(), (szfilename?.value ?: 0L), grbit.toInt())

public actual fun jetBackupA(szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBackupA((szbackuppath?.value ?: 0L), grbit.toInt(), 0L)

public actual fun jetBackupInstanceA(instance: JetInstance, szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBackupInstanceA(instance.toLong(), (szbackuppath?.value ?: 0L), grbit.toInt(), 0L)

public actual fun jetBackupInstanceW(instance: JetInstance, szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBackupInstanceW(instance.toLong(), (szbackuppath?.value ?: 0L), grbit.toInt(), 0L)

public actual fun jetBackupW(szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBackupW((szbackuppath?.value ?: 0L), grbit.toInt(), 0L)

public actual fun jetBeginExternalBackup(grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBeginExternalBackup(grbit.toInt())

public actual fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBeginExternalBackupInstance(instance.toLong(), grbit.toInt())

public actual fun jetBeginSessionA(instance: JetInstance, psesid: COpaquePointer?, szusername: COpaquePointer?, szpassword: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBeginSessionA(instance.toLong(), (psesid?.value ?: 0L), (szusername?.value ?: 0L), (szpassword?.value ?: 0L))

public actual fun jetBeginSessionW(instance: JetInstance, psesid: COpaquePointer?, szusername: COpaquePointer?, szpassword: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBeginSessionW(instance.toLong(), (psesid?.value ?: 0L), (szusername?.value ?: 0L), (szpassword?.value ?: 0L))

public actual fun jetBeginTransaction(sesid: JetSesid): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBeginTransaction(sesid.toLong())

public actual fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBeginTransaction2(sesid.toLong(), grbit.toInt())

public actual fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetBeginTransaction3(sesid.toLong(), trxid, grbit.toInt())

public actual fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCloseDatabase(sesid.toLong(), dbid.toInt(), grbit.toInt())

public actual fun jetCloseFile(hffile: JetHandle): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCloseFile(hffile.toLong())

public actual fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCloseFileInstance(instance.toLong(), hffile.toLong())

public actual fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCloseTable(sesid.toLong(), tableid.toLong())

public actual fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCommitTransaction(sesid.toLong(), grbit.toInt())

public actual fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCommitTransaction2(sesid.toLong(), grbit.toInt(), cmsecdurablecommit.toInt(), (pcommitid?.value ?: 0L))

public actual fun jetCompactA(sesid: JetSesid, szdatabasesrc: COpaquePointer?, szdatabasedest: COpaquePointer?, pfnstatus: JetPfnstatus, pconvert: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCompactA(sesid.toLong(), (szdatabasesrc?.value ?: 0L), (szdatabasedest?.value ?: 0L), 0L, (pconvert?.value ?: 0L), grbit.toInt())

public actual fun jetCompactW(sesid: JetSesid, szdatabasesrc: COpaquePointer?, szdatabasedest: COpaquePointer?, pfnstatus: JetPfnstatus, pconvert: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCompactW(sesid.toLong(), (szdatabasesrc?.value ?: 0L), (szdatabasedest?.value ?: 0L), 0L, (pconvert?.value ?: 0L), grbit.toInt())

public actual fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetComputeStats(sesid.toLong(), tableid.toLong())

public actual fun jetConfigureProcessForCrashDump(grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetConfigureProcessForCrashDump(grbit.toInt())

public actual fun jetCreateDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, pdbid: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateDatabase2A(sesid.toLong(), (szfilename?.value ?: 0L), cpgdatabasesizemax.toInt(), (pdbid?.value ?: 0L), grbit.toInt())

public actual fun jetCreateDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, pdbid: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateDatabase2W(sesid.toLong(), (szfilename?.value ?: 0L), cpgdatabasesizemax.toInt(), (pdbid?.value ?: 0L), grbit.toInt())

public actual fun jetCreateDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateDatabaseA(sesid.toLong(), (szfilename?.value ?: 0L), (szconnect?.value ?: 0L), (pdbid?.value ?: 0L), grbit.toInt())

public actual fun jetCreateDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateDatabaseW(sesid.toLong(), (szfilename?.value ?: 0L), (szconnect?.value ?: 0L), (pdbid?.value ?: 0L), grbit.toInt())

public actual fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateIndex2A(sesid.toLong(), tableid.toLong(), (pindexcreate?.value ?: 0L), cindexcreate.toInt())

public actual fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateIndex2W(sesid.toLong(), tableid.toLong(), (pindexcreate?.value ?: 0L), cindexcreate.toInt())

public actual fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateIndex3A(sesid.toLong(), tableid.toLong(), (pindexcreate?.value ?: 0L), cindexcreate.toInt())

public actual fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateIndex3W(sesid.toLong(), tableid.toLong(), (pindexcreate?.value ?: 0L), cindexcreate.toInt())

public actual fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateIndex4A(sesid.toLong(), tableid.toLong(), (pindexcreate?.value ?: 0L), cindexcreate.toInt())

public actual fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateIndex4W(sesid.toLong(), tableid.toLong(), (pindexcreate?.value ?: 0L), cindexcreate.toInt())

public actual fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateIndexA(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), grbit.toInt(), (szkey?.value ?: 0L), cbkey.toInt(), ldensity.toInt())

public actual fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateIndexW(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), grbit.toInt(), (szkey?.value ?: 0L), cbkey.toInt(), ldensity.toInt())

public actual fun jetCreateInstance2A(pinstance: COpaquePointer?, szinstancename: COpaquePointer?, szdisplayname: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateInstance2A((pinstance?.value ?: 0L), (szinstancename?.value ?: 0L), (szdisplayname?.value ?: 0L), grbit.toInt())

public actual fun jetCreateInstance2W(pinstance: COpaquePointer?, szinstancename: COpaquePointer?, szdisplayname: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateInstance2W((pinstance?.value ?: 0L), (szinstancename?.value ?: 0L), (szdisplayname?.value ?: 0L), grbit.toInt())

public actual fun jetCreateInstanceA(pinstance: COpaquePointer?, szinstancename: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateInstanceA((pinstance?.value ?: 0L), (szinstancename?.value ?: 0L))

public actual fun jetCreateInstanceW(pinstance: COpaquePointer?, szinstancename: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateInstanceW((pinstance?.value ?: 0L), (szinstancename?.value ?: 0L))

public actual fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, lpages: UInt, ldensity: UInt, ptableid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateTableA(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), lpages.toInt(), ldensity.toInt(), (ptableid?.value ?: 0L))

public actual fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2A(sesid.toLong(), dbid.toInt(), (ptablecreate?.value ?: 0L))

public actual fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2W(sesid.toLong(), dbid.toInt(), (ptablecreate?.value ?: 0L))

public actual fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3A(sesid.toLong(), dbid.toInt(), (ptablecreate?.value ?: 0L))

public actual fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3W(sesid.toLong(), dbid.toInt(), (ptablecreate?.value ?: 0L))

public actual fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4A(sesid.toLong(), dbid.toInt(), (ptablecreate?.value ?: 0L))

public actual fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4W(sesid.toLong(), dbid.toInt(), (ptablecreate?.value ?: 0L))

public actual fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexA(sesid.toLong(), dbid.toInt(), (ptablecreate?.value ?: 0L))

public actual fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexW(sesid.toLong(), dbid.toInt(), (ptablecreate?.value ?: 0L))

public actual fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, lpages: UInt, ldensity: UInt, ptableid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetCreateTableW(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), lpages.toInt(), ldensity.toInt(), (ptableid?.value ?: 0L))

public actual fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDefragment2A(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (pcpasses?.value ?: 0L), (pcseconds?.value ?: 0L), 0L, grbit.toInt())

public actual fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDefragment2W(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (pcpasses?.value ?: 0L), (pcseconds?.value ?: 0L), 0L, grbit.toInt())

public actual fun jetDefragment3A(sesid: JetSesid, szdatabasename: COpaquePointer?, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, pvcontext: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDefragment3A(sesid.toLong(), (szdatabasename?.value ?: 0L), (sztablename?.value ?: 0L), (pcpasses?.value ?: 0L), (pcseconds?.value ?: 0L), 0L, (pvcontext?.value ?: 0L), grbit.toInt())

public actual fun jetDefragment3W(sesid: JetSesid, szdatabasename: COpaquePointer?, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, pvcontext: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDefragment3W(sesid.toLong(), (szdatabasename?.value ?: 0L), (sztablename?.value ?: 0L), (pcpasses?.value ?: 0L), (pcseconds?.value ?: 0L), 0L, (pvcontext?.value ?: 0L), grbit.toInt())

public actual fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDefragmentA(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (pcpasses?.value ?: 0L), (pcseconds?.value ?: 0L), grbit.toInt())

public actual fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDefragmentW(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (pcpasses?.value ?: 0L), (pcseconds?.value ?: 0L), grbit.toInt())

public actual fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDelete(sesid.toLong(), tableid.toLong())

public actual fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDeleteColumn2A(sesid.toLong(), tableid.toLong(), (szcolumnname?.value ?: 0L), grbit.toInt())

public actual fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDeleteColumn2W(sesid.toLong(), tableid.toLong(), (szcolumnname?.value ?: 0L), grbit.toInt())

public actual fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDeleteColumnA(sesid.toLong(), tableid.toLong(), (szcolumnname?.value ?: 0L))

public actual fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDeleteColumnW(sesid.toLong(), tableid.toLong(), (szcolumnname?.value ?: 0L))

public actual fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDeleteIndexA(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L))

public actual fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDeleteIndexW(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L))

public actual fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDeleteTableA(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L))

public actual fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDeleteTableW(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L))

public actual fun jetDetachDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDetachDatabase2A(sesid.toLong(), (szfilename?.value ?: 0L), grbit.toInt())

public actual fun jetDetachDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDetachDatabase2W(sesid.toLong(), (szfilename?.value ?: 0L), grbit.toInt())

public actual fun jetDetachDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDetachDatabaseA(sesid.toLong(), (szfilename?.value ?: 0L))

public actual fun jetDetachDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDetachDatabaseW(sesid.toLong(), (szfilename?.value ?: 0L))

public actual fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDupCursor(sesid.toLong(), tableid.toLong(), (ptableid?.value ?: 0L), grbit.toInt())

public actual fun jetDupSession(sesid: JetSesid, psesid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetDupSession(sesid.toLong(), (psesid?.value ?: 0L))

public actual fun jetEnableMultiInstanceA(psetsysparam: COpaquePointer?, csetsysparam: UInt, pcsetsucceed: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetEnableMultiInstanceA((psetsysparam?.value ?: 0L), csetsysparam.toInt(), (pcsetsucceed?.value ?: 0L))

public actual fun jetEnableMultiInstanceW(psetsysparam: COpaquePointer?, csetsysparam: UInt, pcsetsucceed: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetEnableMultiInstanceW((psetsysparam?.value ?: 0L), csetsysparam.toInt(), (pcsetsucceed?.value ?: 0L))

public actual fun jetEndExternalBackup(): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetEndExternalBackup()

public actual fun jetEndExternalBackupInstance(instance: JetInstance): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance(instance.toLong())

public actual fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance2(instance.toLong(), grbit.toInt())

public actual fun jetEndSession(sesid: JetSesid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetEndSession(sesid.toLong(), grbit.toInt())

public actual fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: COpaquePointer?, pcenumcolumn: COpaquePointer?, prgenumcolumn: COpaquePointer?, pfnrealloc: JetPfnrealloc, pvrealloccontext: COpaquePointer?, cbdatamost: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetEnumerateColumns(sesid.toLong(), tableid.toLong(), cenumcolumnid.toInt(), (rgenumcolumnid?.value ?: 0L), (pcenumcolumn?.value ?: 0L), (prgenumcolumn?.value ?: 0L), 0L, (pvrealloccontext?.value ?: 0L), cbdatamost.toInt(), grbit.toInt())

public actual fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: COpaquePointer?, cbmax: UInt, pvold: COpaquePointer?, cboldmax: UInt, pcboldactual: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetEscrowUpdate(sesid.toLong(), tableid.toLong(), columnid.toInt(), (pv?.value ?: 0L), cbmax.toInt(), (pvold?.value ?: 0L), cboldmax.toInt(), (pcboldactual?.value ?: 0L), grbit.toInt())

public actual fun jetExternalRestore2A(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, ploginfo: COpaquePointer?, sztargetinstancename: COpaquePointer?, sztargetinstancelogpath: COpaquePointer?, sztargetinstancecheckpointpath: COpaquePointer?, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetExternalRestore2A((szcheckpointfilepath?.value ?: 0L), (szlogpath?.value ?: 0L), (rgrstmap?.value ?: 0L), crstfilemap, (szbackuplogpath?.value ?: 0L), (ploginfo?.value ?: 0L), (sztargetinstancename?.value ?: 0L), (sztargetinstancelogpath?.value ?: 0L), (sztargetinstancecheckpointpath?.value ?: 0L), 0L)

public actual fun jetExternalRestore2W(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, ploginfo: COpaquePointer?, sztargetinstancename: COpaquePointer?, sztargetinstancelogpath: COpaquePointer?, sztargetinstancecheckpointpath: COpaquePointer?, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetExternalRestore2W((szcheckpointfilepath?.value ?: 0L), (szlogpath?.value ?: 0L), (rgrstmap?.value ?: 0L), crstfilemap, (szbackuplogpath?.value ?: 0L), (ploginfo?.value ?: 0L), (sztargetinstancename?.value ?: 0L), (sztargetinstancelogpath?.value ?: 0L), (sztargetinstancecheckpointpath?.value ?: 0L), 0L)

public actual fun jetExternalRestoreA(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetExternalRestoreA((szcheckpointfilepath?.value ?: 0L), (szlogpath?.value ?: 0L), (rgrstmap?.value ?: 0L), crstfilemap, (szbackuplogpath?.value ?: 0L), genlow, genhigh, 0L)

public actual fun jetExternalRestoreW(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetExternalRestoreW((szcheckpointfilepath?.value ?: 0L), (szlogpath?.value ?: 0L), (rgrstmap?.value ?: 0L), crstfilemap, (szbackuplogpath?.value ?: 0L), genlow, genhigh, 0L)

public actual fun jetFreeBuffer(pbbuf: Pcstr): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetFreeBuffer((pbbuf?.value ?: 0L))

public actual fun jetGetAttachInfoA(szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetAttachInfoA((szzdatabases?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceA(instance.toLong(), (szzdatabases?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceW(instance.toLong(), (szzdatabases?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetAttachInfoW(wszzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetAttachInfoW((wszzdatabases?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetBookmark(sesid.toLong(), tableid.toLong(), (pvbookmark?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcolumnnameorid: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetColumnInfoA(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (pcolumnnameorid?.value ?: 0L), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pwcolumnnameorid: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetColumnInfoW(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (pwcolumnnameorid?.value ?: 0L), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, cbindexname: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetCurrentIndexA(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), cbindexname.toInt())

public actual fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, cbindexname: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetCurrentIndexW(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), cbindexname.toInt())

public actual fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetCursorInfo(sesid.toLong(), tableid.toLong(), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetDatabaseFileInfoA(szdatabasename: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoA((szdatabasename?.value ?: 0L), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetDatabaseFileInfoW(szdatabasename: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoW((szdatabasename?.value ?: 0L), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetDatabaseInfoA(sesid.toLong(), dbid.toInt(), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetDatabaseInfoW(sesid.toLong(), dbid.toInt(), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetErrorInfoW(pvcontext: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetErrorInfoW((pvcontext?.value ?: 0L), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt(), grbit.toInt())

public actual fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetIndexInfoA(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (szindexname?.value ?: 0L), (pvresult?.value ?: 0L), cbresult.toInt(), infolevel.toInt())

public actual fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetIndexInfoW(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (szindexname?.value ?: 0L), (pvresult?.value ?: 0L), cbresult.toInt(), infolevel.toInt())

public actual fun jetGetInstanceInfoA(pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetInstanceInfoA((pcinstanceinfo?.value ?: 0L), (painstanceinfo?.value ?: 0L))

public actual fun jetGetInstanceInfoW(pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetInstanceInfoW((pcinstanceinfo?.value ?: 0L), (painstanceinfo?.value ?: 0L))

public actual fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetInstanceMiscInfo(instance.toLong(), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetLS(sesid.toLong(), tableid.toLong(), (pls?.value ?: 0L), grbit.toInt())

public actual fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetLock(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetGetLogInfoA(szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetLogInfoA((szzlogs?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, ploginfo: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2A(instance.toLong(), (szzlogs?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L), (ploginfo?.value ?: 0L))

public actual fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, ploginfo: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2W(instance.toLong(), (wszzlogs?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L), (ploginfo?.value ?: 0L))

public actual fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceA(instance.toLong(), (szzlogs?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceW(instance.toLong(), (wszzlogs?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetLogInfoW(szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetLogInfoW((szzlogs?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: COpaquePointer?, szobjectname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetObjectInfoA(sesid.toLong(), dbid.toInt(), objtyp.toInt(), (szcontainername?.value ?: 0L), (szobjectname?.value ?: 0L), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: COpaquePointer?, szobjectname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetObjectInfoW(sesid.toLong(), dbid.toInt(), objtyp.toInt(), (szcontainername?.value ?: 0L), (szobjectname?.value ?: 0L), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: COpaquePointer?, cbrecpos: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetRecordPosition(sesid.toLong(), tableid.toLong(), (precpos?.value ?: 0L), cbrecpos.toInt())

public actual fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetRecordSize(sesid.toLong(), tableid.toLong(), (precsize?.value ?: 0L), grbit.toInt())

public actual fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetRecordSize2(sesid.toLong(), tableid.toLong(), (precsize?.value ?: 0L), grbit.toInt())

public actual fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: COpaquePointer?, cbsecondarykeymax: UInt, pcbsecondarykeyactual: COpaquePointer?, pvprimarybookmark: COpaquePointer?, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetSecondaryIndexBookmark(sesid.toLong(), tableid.toLong(), (pvsecondarykey?.value ?: 0L), cbsecondarykeymax.toInt(), (pcbsecondarykeyactual?.value ?: 0L), (pvprimarybookmark?.value ?: 0L), cbprimarybookmarkmax.toInt(), (pcbprimarybookmarkactual?.value ?: 0L), grbit.toInt())

public actual fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: COpaquePointer?, cbparammax: UInt, pcbparamactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetSessionParameter(sesid.toLong(), sesparamid.toInt(), (pvparam?.value ?: 0L), cbparammax.toInt(), (pcbparamactual?.value ?: 0L))

public actual fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: COpaquePointer?, szparam: COpaquePointer?, cbmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetSystemParameterA(instance.toLong(), sesid.toLong(), paramid.toInt(), (plparam?.value ?: 0L), (szparam?.value ?: 0L), cbmax.toInt())

public actual fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: COpaquePointer?, szparam: COpaquePointer?, cbmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetSystemParameterW(instance.toLong(), sesid.toLong(), paramid.toInt(), (plparam?.value ?: 0L), (szparam?.value ?: 0L), cbmax.toInt())

public actual fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetTableColumnInfoA(sesid.toLong(), tableid.toLong(), (szcolumnname?.value ?: 0L), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetTableColumnInfoW(sesid.toLong(), tableid.toLong(), (szcolumnname?.value ?: 0L), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetTableIndexInfoA(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), (pvresult?.value ?: 0L), cbresult.toInt(), infolevel.toInt())

public actual fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetTableIndexInfoW(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), (pvresult?.value ?: 0L), cbresult.toInt(), infolevel.toInt())

public actual fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetTableInfoA(sesid.toLong(), tableid.toLong(), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetTableInfoW(sesid.toLong(), tableid.toLong(), (pvresult?.value ?: 0L), cbmax.toInt(), infolevel.toInt())

public actual fun jetGetThreadStats(pvresult: COpaquePointer?, cbmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetThreadStats((pvresult?.value ?: 0L), cbmax.toInt())

public actual fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceA(instance.toLong(), (szzlogs?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceW(instance.toLong(), (wszzlogs?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetGetVersion(sesid: JetSesid, pwversion: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGetVersion(sesid.toLong(), (pwversion?.value ?: 0L))

public actual fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGotoBookmark(sesid.toLong(), tableid.toLong(), (pvbookmark?.value ?: 0L), cbbookmark.toInt())

public actual fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGotoPosition(sesid.toLong(), tableid.toLong(), (precpos?.value ?: 0L))

public actual fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: COpaquePointer?, cbsecondarykey: UInt, pvprimarybookmark: COpaquePointer?, cbprimarybookmark: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGotoSecondaryIndexBookmark(sesid.toLong(), tableid.toLong(), (pvsecondarykey?.value ?: 0L), cbsecondarykey.toInt(), (pvprimarybookmark?.value ?: 0L), cbprimarybookmark.toInt(), grbit.toInt())

public actual fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetGrowDatabase(sesid.toLong(), dbid.toInt(), cpg.toInt(), (pcpgreal?.value ?: 0L))

public actual fun jetIdle(sesid: JetSesid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetIdle(sesid.toLong(), grbit.toInt())

public actual fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: COpaquePointer?, crecmax: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetIndexRecordCount(sesid.toLong(), tableid.toLong(), (pcrec?.value ?: 0L), crecmax.toInt())

public actual fun jetInit(pinstance: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetInit((pinstance?.value ?: 0L))

public actual fun jetInit2(pinstance: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetInit2((pinstance?.value ?: 0L), grbit.toInt())

public actual fun jetInit3A(pinstance: COpaquePointer?, prstinfo: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetInit3A((pinstance?.value ?: 0L), (prstinfo?.value ?: 0L), grbit.toInt())

public actual fun jetInit3W(pinstance: COpaquePointer?, prstinfo: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetInit3W((pinstance?.value ?: 0L), (prstinfo?.value ?: 0L), grbit.toInt())

public actual fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: COpaquePointer?, cindexrange: UInt, precordlist: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetIntersectIndexes(sesid.toLong(), (rgindexrange?.value ?: 0L), cindexrange.toInt(), (precordlist?.value ?: 0L), grbit.toInt())

public actual fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetMakeKey(sesid.toLong(), tableid.toLong(), (pvdata?.value ?: 0L), cbdata.toInt(), grbit.toInt())

public actual fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetMove(sesid.toLong(), tableid.toLong(), crow, grbit.toInt())

public actual fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotAbort(snapid.toLong(), grbit.toInt())

public actual fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotEnd(snapid.toLong(), grbit.toInt())

public actual fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeA(snapid.toLong(), (pcinstanceinfo?.value ?: 0L), (painstanceinfo?.value ?: 0L), grbit.toInt())

public actual fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeW(snapid.toLong(), (pcinstanceinfo?.value ?: 0L), (painstanceinfo?.value ?: 0L), grbit.toInt())

public actual fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoA(snapid.toLong(), (pcinstanceinfo?.value ?: 0L), (painstanceinfo?.value ?: 0L), grbit.toInt())

public actual fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoW(snapid.toLong(), (pcinstanceinfo?.value ?: 0L), (painstanceinfo?.value ?: 0L), grbit.toInt())

public actual fun jetOSSnapshotPrepare(psnapid: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotPrepare((psnapid?.value ?: 0L), grbit.toInt())

public actual fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotPrepareInstance(snapid.toLong(), instance.toLong(), grbit.toInt())

public actual fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotThaw(snapid.toLong(), grbit.toInt())

public actual fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLog(snapid.toLong(), grbit.toInt())

public actual fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLogInstance(snapid.toLong(), instance.toLong(), grbit.toInt())

public actual fun jetOpenDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenDatabaseA(sesid.toLong(), (szfilename?.value ?: 0L), (szconnect?.value ?: 0L), (pdbid?.value ?: 0L), grbit.toInt())

public actual fun jetOpenDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenDatabaseW(sesid.toLong(), (szfilename?.value ?: 0L), (szconnect?.value ?: 0L), (pdbid?.value ?: 0L), grbit.toInt())

public actual fun jetOpenFileA(szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenFileA((szfilename?.value ?: 0L), (phffile?.value ?: 0L), (pulfilesizelow?.value ?: 0L), (pulfilesizehigh?.value ?: 0L))

public actual fun jetOpenFileInstanceA(instance: JetInstance, szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenFileInstanceA(instance.toLong(), (szfilename?.value ?: 0L), (phffile?.value ?: 0L), (pulfilesizelow?.value ?: 0L), (pulfilesizehigh?.value ?: 0L))

public actual fun jetOpenFileInstanceW(instance: JetInstance, szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenFileInstanceW(instance.toLong(), (szfilename?.value ?: 0L), (phffile?.value ?: 0L), (pulfilesizelow?.value ?: 0L), (pulfilesizehigh?.value ?: 0L))

public actual fun jetOpenFileW(szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenFileW((szfilename?.value ?: 0L), (phffile?.value ?: 0L), (pulfilesizelow?.value ?: 0L), (pulfilesizehigh?.value ?: 0L))

public actual fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pvparameters: COpaquePointer?, cbparameters: UInt, grbit: UInt, ptableid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenTableA(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (pvparameters?.value ?: 0L), cbparameters.toInt(), grbit.toInt(), (ptableid?.value ?: 0L))

public actual fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pvparameters: COpaquePointer?, cbparameters: UInt, grbit: UInt, ptableid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenTableW(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (pvparameters?.value ?: 0L), cbparameters.toInt(), grbit.toInt(), (ptableid?.value ?: 0L))

public actual fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenTempTable(sesid.toLong(), (prgcolumndef?.value ?: 0L), ccolumn.toInt(), grbit.toInt(), (ptableid?.value ?: 0L), (prgcolumnid?.value ?: 0L))

public actual fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenTempTable2(sesid.toLong(), (prgcolumndef?.value ?: 0L), ccolumn.toInt(), lcid.toInt(), grbit.toInt(), (ptableid?.value ?: 0L), (prgcolumnid?.value ?: 0L))

public actual fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, pidxunicode: COpaquePointer?, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenTempTable3(sesid.toLong(), (prgcolumndef?.value ?: 0L), ccolumn.toInt(), (pidxunicode?.value ?: 0L), grbit.toInt(), (ptableid?.value ?: 0L), (prgcolumnid?.value ?: 0L))

public actual fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenTemporaryTable(sesid.toLong(), (popentemporarytable?.value ?: 0L))

public actual fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetOpenTemporaryTable2(sesid.toLong(), (popentemporarytable?.value ?: 0L))

public actual fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetPrepareUpdate(sesid.toLong(), tableid.toLong(), prep.toInt())

public actual fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: COpaquePointer?, cindexranges: UInt, pcrangespreread: COpaquePointer?, rgcolumnidpreread: COpaquePointer?, ccolumnidpreread: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetPrereadIndexRanges(sesid.toLong(), tableid.toLong(), (rgindexranges?.value ?: 0L), cindexranges.toInt(), (pcrangespreread?.value ?: 0L), (rgcolumnidpreread?.value ?: 0L), ccolumnidpreread.toInt(), grbit.toInt())

public actual fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: COpaquePointer?, rgcbkeys: COpaquePointer?, ckeys: Int, pckeyspreread: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetPrereadKeys(sesid.toLong(), tableid.toLong(), (rgpvkeys?.value ?: 0L), (rgcbkeys?.value ?: 0L), ckeys, (pckeyspreread?.value ?: 0L), grbit.toInt())

public actual fun jetReadFile(hffile: JetHandle, pv: COpaquePointer?, cb: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetReadFile(hffile.toLong(), (pv?.value ?: 0L), cb.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: COpaquePointer?, cb: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetReadFileInstance(instance.toLong(), hffile.toLong(), (pv?.value ?: 0L), cb.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: COpaquePointer?, phcallbackid: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRegisterCallback(sesid.toLong(), tableid.toLong(), cbtyp.toInt(), 0L, (pvcontext?.value ?: 0L), (phcallbackid?.value ?: 0L))

public actual fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: COpaquePointer?, sznamenew: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRenameColumnA(sesid.toLong(), tableid.toLong(), (szname?.value ?: 0L), (sznamenew?.value ?: 0L), grbit.toInt())

public actual fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: COpaquePointer?, sznamenew: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRenameColumnW(sesid.toLong(), tableid.toLong(), (szname?.value ?: 0L), (sznamenew?.value ?: 0L), grbit.toInt())

public actual fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: COpaquePointer?, sznamenew: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRenameTableA(sesid.toLong(), dbid.toInt(), (szname?.value ?: 0L), (sznamenew?.value ?: 0L))

public actual fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: COpaquePointer?, sznamenew: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRenameTableW(sesid.toLong(), dbid.toInt(), (szname?.value ?: 0L), (sznamenew?.value ?: 0L))

public actual fun jetResetSessionContext(sesid: JetSesid): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetResetSessionContext(sesid.toLong())

public actual fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetResetTableSequential(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetResizeDatabase(sesid.toLong(), dbid.toInt(), cpgtarget.toInt(), (pcpgactual?.value ?: 0L), grbit.toInt())

public actual fun jetRestore2A(sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRestore2A((sz?.value ?: 0L), (szdest?.value ?: 0L), 0L)

public actual fun jetRestore2W(sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRestore2W((sz?.value ?: 0L), (szdest?.value ?: 0L), 0L)

public actual fun jetRestoreA(szsource: COpaquePointer?, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRestoreA((szsource?.value ?: 0L), 0L)

public actual fun jetRestoreInstanceA(instance: JetInstance, sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRestoreInstanceA(instance.toLong(), (sz?.value ?: 0L), (szdest?.value ?: 0L), 0L)

public actual fun jetRestoreInstanceW(instance: JetInstance, sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRestoreInstanceW(instance.toLong(), (sz?.value ?: 0L), (szdest?.value ?: 0L), 0L)

public actual fun jetRestoreW(szsource: COpaquePointer?, pfn: JetPfnstatus): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRestoreW((szsource?.value ?: 0L), 0L)

public actual fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: COpaquePointer?, cbdata: UInt, pcbactual: COpaquePointer?, grbit: UInt, pretinfo: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRetrieveColumn(sesid.toLong(), tableid.toLong(), columnid.toInt(), (pvdata?.value ?: 0L), cbdata.toInt(), (pcbactual?.value ?: 0L), grbit.toInt(), (pretinfo?.value ?: 0L))

public actual fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: COpaquePointer?, cretrievecolumn: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRetrieveColumns(sesid.toLong(), tableid.toLong(), (pretrievecolumn?.value ?: 0L), cretrievecolumn.toInt())

public actual fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRetrieveKey(sesid.toLong(), tableid.toLong(), (pvkey?.value ?: 0L), cbmax.toInt(), (pcbactual?.value ?: 0L), grbit.toInt())

public actual fun jetRollback(sesid: JetSesid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetRollback(sesid.toLong(), grbit.toInt())

public actual fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSeek(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt, psetinfo: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetColumn(sesid.toLong(), tableid.toLong(), columnid.toInt(), (pvdata?.value ?: 0L), cbdata.toInt(), grbit.toInt(), (psetinfo?.value ?: 0L))

public actual fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szcolumnname: COpaquePointer?, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueA(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (szcolumnname?.value ?: 0L), (pvdata?.value ?: 0L), cbdata.toInt(), grbit.toInt())

public actual fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szcolumnname: COpaquePointer?, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueW(sesid.toLong(), dbid.toInt(), (sztablename?.value ?: 0L), (szcolumnname?.value ?: 0L), (pvdata?.value ?: 0L), cbdata.toInt(), grbit.toInt())

public actual fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: COpaquePointer?, csetcolumn: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetColumns(sesid.toLong(), tableid.toLong(), (psetcolumn?.value ?: 0L), csetcolumn.toInt())

public actual fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetCurrentIndex2A(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), grbit.toInt())

public actual fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetCurrentIndex2W(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), grbit.toInt())

public actual fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetCurrentIndex3A(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), grbit.toInt(), itagsequence.toInt())

public actual fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetCurrentIndex3W(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), grbit.toInt(), itagsequence.toInt())

public actual fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pindexid: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetCurrentIndex4A(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), (pindexid?.value ?: 0L), grbit.toInt(), itagsequence.toInt())

public actual fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pindexid: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetCurrentIndex4W(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L), (pindexid?.value ?: 0L), grbit.toInt(), itagsequence.toInt())

public actual fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetCurrentIndexA(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L))

public actual fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetCurrentIndexW(sesid.toLong(), tableid.toLong(), (szindexname?.value ?: 0L))

public actual fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: COpaquePointer?, ccolumnfilters: UInt, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetCursorFilter(sesid.toLong(), tableid.toLong(), (rgcolumnfilters?.value ?: 0L), ccolumnfilters.toInt(), grbit.toInt())

public actual fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: COpaquePointer?, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetDatabaseSizeA(sesid.toLong(), (szdatabasename?.value ?: 0L), cpg.toInt(), (pcpgreal?.value ?: 0L))

public actual fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: COpaquePointer?, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetDatabaseSizeW(sesid.toLong(), (szdatabasename?.value ?: 0L), cpg.toInt(), (pcpgreal?.value ?: 0L))

public actual fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetIndexRange(sesid.toLong(), tableidsrc.toLong(), grbit.toInt())

public actual fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetLS(sesid.toLong(), tableid.toLong(), ls.toLong(), grbit.toInt())

public actual fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetSessionContext(sesid.toLong(), ulcontext.toLong())

public actual fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: COpaquePointer?, cbparam: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetSessionParameter(sesid.toLong(), sesparamid.toInt(), (pvparam?.value ?: 0L), cbparam.toInt())

public actual fun jetSetSystemParameterA(pinstance: COpaquePointer?, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetSystemParameterA((pinstance?.value ?: 0L), sesid.toLong(), paramid.toInt(), lparam.toLong(), (szparam?.value ?: 0L))

public actual fun jetSetSystemParameterW(pinstance: COpaquePointer?, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetSystemParameterW((pinstance?.value ?: 0L), sesid.toLong(), paramid.toInt(), lparam.toLong(), (szparam?.value ?: 0L))

public actual fun jetSetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetSetTableSequential(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetStopBackup(): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetStopBackup()

public actual fun jetStopBackupInstance(instance: JetInstance): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetStopBackupInstance(instance.toLong())

public actual fun jetStopService(): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetStopService()

public actual fun jetStopServiceInstance(instance: JetInstance): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetStopServiceInstance(instance.toLong())

public actual fun jetStopServiceInstance2(instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetStopServiceInstance2(instance.toLong(), grbit.toInt())

public actual fun jetTerm(instance: JetInstance): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetTerm(instance.toLong())

public actual fun jetTerm2(instance: JetInstance, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetTerm2(instance.toLong(), grbit.toInt())

public actual fun jetTruncateLog(): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetTruncateLog()

public actual fun jetTruncateLogInstance(instance: JetInstance): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetTruncateLogInstance(instance.toLong())

public actual fun jetUnregisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, hcallbackid: JetHandle): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetUnregisterCallback(sesid.toLong(), tableid.toLong(), cbtyp.toInt(), hcallbackid.toLong())

public actual fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt, pcbactual: COpaquePointer?): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetUpdate(sesid.toLong(), tableid.toLong(), (pvbookmark?.value ?: 0L), cbbookmark.toInt(), (pcbactual?.value ?: 0L))

public actual fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt, pcbactual: COpaquePointer?, grbit: UInt): Int =
    WindowsWin32StorageJetJniBridge.windowssys_windows_win32_storage_jet_jetUpdate2(sesid.toLong(), tableid.toLong(), (pvbookmark?.value ?: 0L), cbbookmark.toInt(), (pcbactual?.value ?: 0L), grbit.toInt())
