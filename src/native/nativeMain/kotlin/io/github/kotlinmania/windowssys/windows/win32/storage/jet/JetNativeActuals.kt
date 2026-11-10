@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pcolumndef: COpaquePointer?, pvdefault: COpaquePointer?, cbdefault: UInt, pcolumnid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetAddColumnA(sesid, tableid, szcolumnname?.value?.toCPointer<ByteVar>(), pcolumndef?.value?.toCPointer<ByteVar>(), pvdefault?.value?.toCPointer<ByteVar>(), cbdefault, pcolumnid?.value?.toCPointer<ByteVar>())

public actual fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pcolumndef: COpaquePointer?, pvdefault: COpaquePointer?, cbdefault: UInt, pcolumnid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetAddColumnW(sesid, tableid, szcolumnname?.value?.toCPointer<ByteVar>(), pcolumndef?.value?.toCPointer<ByteVar>(), pvdefault?.value?.toCPointer<ByteVar>(), cbdefault, pcolumnid?.value?.toCPointer<ByteVar>())

public actual fun jetAttachDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetAttachDatabase2A(sesid, szfilename?.value?.toCPointer<ByteVar>(), cpgdatabasesizemax, grbit)

public actual fun jetAttachDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetAttachDatabase2W(sesid, szfilename?.value?.toCPointer<ByteVar>(), cpgdatabasesizemax, grbit)

public actual fun jetAttachDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetAttachDatabaseA(sesid, szfilename?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetAttachDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetAttachDatabaseW(sesid, szfilename?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetBackupA(szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBackupA(szbackuppath?.value?.toCPointer<ByteVar>(), grbit, 0L.toCPointer<ByteVar>())

public actual fun jetBackupInstanceA(instance: JetInstance, szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBackupInstanceA(instance, szbackuppath?.value?.toCPointer<ByteVar>(), grbit, 0L.toCPointer<ByteVar>())

public actual fun jetBackupInstanceW(instance: JetInstance, szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBackupInstanceW(instance, szbackuppath?.value?.toCPointer<ByteVar>(), grbit, 0L.toCPointer<ByteVar>())

public actual fun jetBackupW(szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBackupW(szbackuppath?.value?.toCPointer<ByteVar>(), grbit, 0L.toCPointer<ByteVar>())

public actual fun jetBeginExternalBackup(grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBeginExternalBackup(grbit)

public actual fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBeginExternalBackupInstance(instance, grbit)

public actual fun jetBeginSessionA(instance: JetInstance, psesid: COpaquePointer?, szusername: COpaquePointer?, szpassword: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBeginSessionA(instance, psesid?.value?.toCPointer<ByteVar>(), szusername?.value?.toCPointer<ByteVar>(), szpassword?.value?.toCPointer<ByteVar>())

public actual fun jetBeginSessionW(instance: JetInstance, psesid: COpaquePointer?, szusername: COpaquePointer?, szpassword: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBeginSessionW(instance, psesid?.value?.toCPointer<ByteVar>(), szusername?.value?.toCPointer<ByteVar>(), szpassword?.value?.toCPointer<ByteVar>())

public actual fun jetBeginTransaction(sesid: JetSesid): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBeginTransaction(sesid)

public actual fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBeginTransaction2(sesid, grbit)

public actual fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetBeginTransaction3(sesid, trxid, grbit)

public actual fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCloseDatabase(sesid, dbid, grbit)

public actual fun jetCloseFile(hffile: JetHandle): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCloseFile(hffile)

public actual fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCloseFileInstance(instance, hffile)

public actual fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCloseTable(sesid, tableid)

public actual fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCommitTransaction(sesid, grbit)

public actual fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCommitTransaction2(sesid, grbit, cmsecdurablecommit, pcommitid?.value?.toCPointer<ByteVar>())

public actual fun jetCompactA(sesid: JetSesid, szdatabasesrc: COpaquePointer?, szdatabasedest: COpaquePointer?, pfnstatus: JetPfnstatus, pconvert: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCompactA(sesid, szdatabasesrc?.value?.toCPointer<ByteVar>(), szdatabasedest?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pconvert?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetCompactW(sesid: JetSesid, szdatabasesrc: COpaquePointer?, szdatabasedest: COpaquePointer?, pfnstatus: JetPfnstatus, pconvert: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCompactW(sesid, szdatabasesrc?.value?.toCPointer<ByteVar>(), szdatabasedest?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pconvert?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetComputeStats(sesid, tableid)

public actual fun jetConfigureProcessForCrashDump(grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetConfigureProcessForCrashDump(grbit)

public actual fun jetCreateDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, pdbid: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateDatabase2A(sesid, szfilename?.value?.toCPointer<ByteVar>(), cpgdatabasesizemax, pdbid?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, pdbid: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateDatabase2W(sesid, szfilename?.value?.toCPointer<ByteVar>(), cpgdatabasesizemax, pdbid?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateDatabaseA(sesid, szfilename?.value?.toCPointer<ByteVar>(), szconnect?.value?.toCPointer<ByteVar>(), pdbid?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateDatabaseW(sesid, szfilename?.value?.toCPointer<ByteVar>(), szconnect?.value?.toCPointer<ByteVar>(), pdbid?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateIndex2A(sesid, tableid, pindexcreate?.value?.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateIndex2W(sesid, tableid, pindexcreate?.value?.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateIndex3A(sesid, tableid, pindexcreate?.value?.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateIndex3W(sesid, tableid, pindexcreate?.value?.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateIndex4A(sesid, tableid, pindexcreate?.value?.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateIndex4W(sesid, tableid, pindexcreate?.value?.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateIndexA(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), grbit, szkey?.value?.toCPointer<ByteVar>(), cbkey, ldensity)

public actual fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateIndexW(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), grbit, szkey?.value?.toCPointer<ByteVar>(), cbkey, ldensity)

public actual fun jetCreateInstance2A(pinstance: COpaquePointer?, szinstancename: COpaquePointer?, szdisplayname: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateInstance2A(pinstance?.value?.toCPointer<ByteVar>(), szinstancename?.value?.toCPointer<ByteVar>(), szdisplayname?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateInstance2W(pinstance: COpaquePointer?, szinstancename: COpaquePointer?, szdisplayname: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateInstance2W(pinstance?.value?.toCPointer<ByteVar>(), szinstancename?.value?.toCPointer<ByteVar>(), szdisplayname?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateInstanceA(pinstance: COpaquePointer?, szinstancename: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateInstanceA(pinstance?.value?.toCPointer<ByteVar>(), szinstancename?.value?.toCPointer<ByteVar>())

public actual fun jetCreateInstanceW(pinstance: COpaquePointer?, szinstancename: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateInstanceW(pinstance?.value?.toCPointer<ByteVar>(), szinstancename?.value?.toCPointer<ByteVar>())

public actual fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, lpages: UInt, ldensity: UInt, ptableid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateTableA(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), lpages, ldensity, ptableid?.value?.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2A(sesid, dbid, ptablecreate?.value?.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2W(sesid, dbid, ptablecreate?.value?.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3A(sesid, dbid, ptablecreate?.value?.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3W(sesid, dbid, ptablecreate?.value?.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4A(sesid, dbid, ptablecreate?.value?.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4W(sesid, dbid, ptablecreate?.value?.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexA(sesid, dbid, ptablecreate?.value?.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexW(sesid, dbid, ptablecreate?.value?.toCPointer<ByteVar>())

public actual fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, lpages: UInt, ldensity: UInt, ptableid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetCreateTableW(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), lpages, ldensity, ptableid?.value?.toCPointer<ByteVar>())

public actual fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDefragment2A(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), pcpasses?.value?.toCPointer<ByteVar>(), pcseconds?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), grbit)

public actual fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDefragment2W(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), pcpasses?.value?.toCPointer<ByteVar>(), pcseconds?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), grbit)

public actual fun jetDefragment3A(sesid: JetSesid, szdatabasename: COpaquePointer?, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, pvcontext: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDefragment3A(sesid, szdatabasename?.value?.toCPointer<ByteVar>(), sztablename?.value?.toCPointer<ByteVar>(), pcpasses?.value?.toCPointer<ByteVar>(), pcseconds?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetDefragment3W(sesid: JetSesid, szdatabasename: COpaquePointer?, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, pvcontext: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDefragment3W(sesid, szdatabasename?.value?.toCPointer<ByteVar>(), sztablename?.value?.toCPointer<ByteVar>(), pcpasses?.value?.toCPointer<ByteVar>(), pcseconds?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDefragmentA(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), pcpasses?.value?.toCPointer<ByteVar>(), pcseconds?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDefragmentW(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), pcpasses?.value?.toCPointer<ByteVar>(), pcseconds?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDelete(sesid, tableid)

public actual fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDeleteColumn2A(sesid, tableid, szcolumnname?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDeleteColumn2W(sesid, tableid, szcolumnname?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDeleteColumnA(sesid, tableid, szcolumnname?.value?.toCPointer<ByteVar>())

public actual fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDeleteColumnW(sesid, tableid, szcolumnname?.value?.toCPointer<ByteVar>())

public actual fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDeleteIndexA(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>())

public actual fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDeleteIndexW(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>())

public actual fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDeleteTableA(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>())

public actual fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDeleteTableW(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>())

public actual fun jetDetachDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDetachDatabase2A(sesid, szfilename?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetDetachDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDetachDatabase2W(sesid, szfilename?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetDetachDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDetachDatabaseA(sesid, szfilename?.value?.toCPointer<ByteVar>())

public actual fun jetDetachDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDetachDatabaseW(sesid, szfilename?.value?.toCPointer<ByteVar>())

public actual fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDupCursor(sesid, tableid, ptableid?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetDupSession(sesid: JetSesid, psesid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetDupSession(sesid, psesid?.value?.toCPointer<ByteVar>())

public actual fun jetEnableMultiInstanceA(psetsysparam: COpaquePointer?, csetsysparam: UInt, pcsetsucceed: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetEnableMultiInstanceA(psetsysparam?.value?.toCPointer<ByteVar>(), csetsysparam, pcsetsucceed?.value?.toCPointer<ByteVar>())

public actual fun jetEnableMultiInstanceW(psetsysparam: COpaquePointer?, csetsysparam: UInt, pcsetsucceed: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetEnableMultiInstanceW(psetsysparam?.value?.toCPointer<ByteVar>(), csetsysparam, pcsetsucceed?.value?.toCPointer<ByteVar>())

public actual fun jetEndExternalBackup(): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetEndExternalBackup()

public actual fun jetEndExternalBackupInstance(instance: JetInstance): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance(instance)

public actual fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance2(instance, grbit)

public actual fun jetEndSession(sesid: JetSesid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetEndSession(sesid, grbit)

public actual fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: COpaquePointer?, pcenumcolumn: COpaquePointer?, prgenumcolumn: COpaquePointer?, pfnrealloc: JetPfnrealloc, pvrealloccontext: COpaquePointer?, cbdatamost: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetEnumerateColumns(sesid, tableid, cenumcolumnid, rgenumcolumnid?.value?.toCPointer<ByteVar>(), pcenumcolumn?.value?.toCPointer<ByteVar>(), prgenumcolumn?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvrealloccontext?.value?.toCPointer<ByteVar>(), cbdatamost, grbit)

public actual fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: COpaquePointer?, cbmax: UInt, pvold: COpaquePointer?, cboldmax: UInt, pcboldactual: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetEscrowUpdate(sesid, tableid, columnid, pv?.value?.toCPointer<ByteVar>(), cbmax, pvold?.value?.toCPointer<ByteVar>(), cboldmax, pcboldactual?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetExternalRestore2A(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, ploginfo: COpaquePointer?, sztargetinstancename: COpaquePointer?, sztargetinstancelogpath: COpaquePointer?, sztargetinstancecheckpointpath: COpaquePointer?, pfn: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetExternalRestore2A(szcheckpointfilepath?.value?.toCPointer<ByteVar>(), szlogpath?.value?.toCPointer<ByteVar>(), rgrstmap?.value?.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath?.value?.toCPointer<ByteVar>(), ploginfo?.value?.toCPointer<ByteVar>(), sztargetinstancename?.value?.toCPointer<ByteVar>(), sztargetinstancelogpath?.value?.toCPointer<ByteVar>(), sztargetinstancecheckpointpath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetExternalRestore2W(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, ploginfo: COpaquePointer?, sztargetinstancename: COpaquePointer?, sztargetinstancelogpath: COpaquePointer?, sztargetinstancecheckpointpath: COpaquePointer?, pfn: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetExternalRestore2W(szcheckpointfilepath?.value?.toCPointer<ByteVar>(), szlogpath?.value?.toCPointer<ByteVar>(), rgrstmap?.value?.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath?.value?.toCPointer<ByteVar>(), ploginfo?.value?.toCPointer<ByteVar>(), sztargetinstancename?.value?.toCPointer<ByteVar>(), sztargetinstancelogpath?.value?.toCPointer<ByteVar>(), sztargetinstancecheckpointpath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetExternalRestoreA(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetExternalRestoreA(szcheckpointfilepath?.value?.toCPointer<ByteVar>(), szlogpath?.value?.toCPointer<ByteVar>(), rgrstmap?.value?.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath?.value?.toCPointer<ByteVar>(), genlow, genhigh, 0L.toCPointer<ByteVar>())

public actual fun jetExternalRestoreW(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetExternalRestoreW(szcheckpointfilepath?.value?.toCPointer<ByteVar>(), szlogpath?.value?.toCPointer<ByteVar>(), rgrstmap?.value?.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath?.value?.toCPointer<ByteVar>(), genlow, genhigh, 0L.toCPointer<ByteVar>())

public actual fun jetFreeBuffer(pbbuf: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetFreeBuffer(pbbuf?.value?.toCPointer<ByteVar>())

public actual fun jetGetAttachInfoA(szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetAttachInfoA(szzdatabases?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceA(instance, szzdatabases?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceW(instance, szzdatabases?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetAttachInfoW(wszzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetAttachInfoW(wszzdatabases?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetBookmark(sesid, tableid, pvbookmark?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcolumnnameorid: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetColumnInfoA(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), pcolumnnameorid?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pwcolumnnameorid: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetColumnInfoW(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), pwcolumnnameorid?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, cbindexname: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetCurrentIndexA(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), cbindexname)

public actual fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, cbindexname: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetCurrentIndexW(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), cbindexname)

public actual fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetCursorInfo(sesid, tableid, pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetDatabaseFileInfoA(szdatabasename: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoA(szdatabasename?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetDatabaseFileInfoW(szdatabasename: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoW(szdatabasename?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetDatabaseInfoA(sesid, dbid, pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetDatabaseInfoW(sesid, dbid, pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetErrorInfoW(pvcontext: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetErrorInfoW(pvcontext?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel, grbit)

public actual fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetIndexInfoA(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), szindexname?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetIndexInfoW(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), szindexname?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun jetGetInstanceInfoA(pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetInstanceInfoA(pcinstanceinfo?.value?.toCPointer<ByteVar>(), painstanceinfo?.value?.toCPointer<ByteVar>())

public actual fun jetGetInstanceInfoW(pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetInstanceInfoW(pcinstanceinfo?.value?.toCPointer<ByteVar>(), painstanceinfo?.value?.toCPointer<ByteVar>())

public actual fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetInstanceMiscInfo(instance, pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetLS(sesid, tableid, pls?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetLock(sesid, tableid, grbit)

public actual fun jetGetLogInfoA(szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetLogInfoA(szzlogs?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, ploginfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2A(instance, szzlogs?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>(), ploginfo?.value?.toCPointer<ByteVar>())

public actual fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, ploginfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2W(instance, wszzlogs?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>(), ploginfo?.value?.toCPointer<ByteVar>())

public actual fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceA(instance, szzlogs?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceW(instance, wszzlogs?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetLogInfoW(szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetLogInfoW(szzlogs?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: COpaquePointer?, szobjectname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetObjectInfoA(sesid, dbid, objtyp, szcontainername?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: COpaquePointer?, szobjectname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetObjectInfoW(sesid, dbid, objtyp, szcontainername?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: COpaquePointer?, cbrecpos: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetRecordPosition(sesid, tableid, precpos?.value?.toCPointer<ByteVar>(), cbrecpos)

public actual fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetRecordSize(sesid, tableid, precsize?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetRecordSize2(sesid, tableid, precsize?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: COpaquePointer?, cbsecondarykeymax: UInt, pcbsecondarykeyactual: COpaquePointer?, pvprimarybookmark: COpaquePointer?, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetSecondaryIndexBookmark(sesid, tableid, pvsecondarykey?.value?.toCPointer<ByteVar>(), cbsecondarykeymax, pcbsecondarykeyactual?.value?.toCPointer<ByteVar>(), pvprimarybookmark?.value?.toCPointer<ByteVar>(), cbprimarybookmarkmax, pcbprimarybookmarkactual?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: COpaquePointer?, cbparammax: UInt, pcbparamactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetSessionParameter(sesid, sesparamid, pvparam?.value?.toCPointer<ByteVar>(), cbparammax, pcbparamactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: COpaquePointer?, szparam: COpaquePointer?, cbmax: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetSystemParameterA(instance, sesid, paramid, plparam?.value?.toCPointer<ByteVar>(), szparam?.value?.toCPointer<ByteVar>(), cbmax)

public actual fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: COpaquePointer?, szparam: COpaquePointer?, cbmax: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetSystemParameterW(instance, sesid, paramid, plparam?.value?.toCPointer<ByteVar>(), szparam?.value?.toCPointer<ByteVar>(), cbmax)

public actual fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetTableColumnInfoA(sesid, tableid, szcolumnname?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetTableColumnInfoW(sesid, tableid, szcolumnname?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetTableIndexInfoA(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetTableIndexInfoW(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), pvresult?.value?.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetTableInfoA(sesid, tableid, pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetTableInfoW(sesid, tableid, pvresult?.value?.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetThreadStats(pvresult: COpaquePointer?, cbmax: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetThreadStats(pvresult?.value?.toCPointer<ByteVar>(), cbmax)

public actual fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceA(instance, szzlogs?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceW(instance, wszzlogs?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetGetVersion(sesid: JetSesid, pwversion: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGetVersion(sesid, pwversion?.value?.toCPointer<ByteVar>())

public actual fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGotoBookmark(sesid, tableid, pvbookmark?.value?.toCPointer<ByteVar>(), cbbookmark)

public actual fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGotoPosition(sesid, tableid, precpos?.value?.toCPointer<ByteVar>())

public actual fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: COpaquePointer?, cbsecondarykey: UInt, pvprimarybookmark: COpaquePointer?, cbprimarybookmark: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGotoSecondaryIndexBookmark(sesid, tableid, pvsecondarykey?.value?.toCPointer<ByteVar>(), cbsecondarykey, pvprimarybookmark?.value?.toCPointer<ByteVar>(), cbprimarybookmark, grbit)

public actual fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetGrowDatabase(sesid, dbid, cpg, pcpgreal?.value?.toCPointer<ByteVar>())

public actual fun jetIdle(sesid: JetSesid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetIdle(sesid, grbit)

public actual fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: COpaquePointer?, crecmax: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetIndexRecordCount(sesid, tableid, pcrec?.value?.toCPointer<ByteVar>(), crecmax)

public actual fun jetInit(pinstance: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetInit(pinstance?.value?.toCPointer<ByteVar>())

public actual fun jetInit2(pinstance: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetInit2(pinstance?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetInit3A(pinstance: COpaquePointer?, prstinfo: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetInit3A(pinstance?.value?.toCPointer<ByteVar>(), prstinfo?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetInit3W(pinstance: COpaquePointer?, prstinfo: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetInit3W(pinstance?.value?.toCPointer<ByteVar>(), prstinfo?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: COpaquePointer?, cindexrange: UInt, precordlist: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetIntersectIndexes(sesid, rgindexrange?.value?.toCPointer<ByteVar>(), cindexrange, precordlist?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetMakeKey(sesid, tableid, pvdata?.value?.toCPointer<ByteVar>(), cbdata, grbit)

public actual fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetMove(sesid, tableid, crow, grbit)

public actual fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotAbort(snapid.toULong(), grbit)

public actual fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotEnd(snapid.toULong(), grbit)

public actual fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeA(snapid.toULong(), pcinstanceinfo?.value?.toCPointer<ByteVar>(), painstanceinfo?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeW(snapid.toULong(), pcinstanceinfo?.value?.toCPointer<ByteVar>(), painstanceinfo?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoA(snapid.toULong(), pcinstanceinfo?.value?.toCPointer<ByteVar>(), painstanceinfo?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoW(snapid.toULong(), pcinstanceinfo?.value?.toCPointer<ByteVar>(), painstanceinfo?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetOSSnapshotPrepare(psnapid: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotPrepare(psnapid?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotPrepareInstance(snapid.toULong(), instance, grbit)

public actual fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotThaw(snapid.toULong(), grbit)

public actual fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLog(snapid.toULong(), grbit)

public actual fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLogInstance(snapid.toULong(), instance, grbit)

public actual fun jetOpenDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenDatabaseA(sesid, szfilename?.value?.toCPointer<ByteVar>(), szconnect?.value?.toCPointer<ByteVar>(), pdbid?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetOpenDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenDatabaseW(sesid, szfilename?.value?.toCPointer<ByteVar>(), szconnect?.value?.toCPointer<ByteVar>(), pdbid?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetOpenFileA(szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenFileA(szfilename?.value?.toCPointer<ByteVar>(), phffile?.value?.toCPointer<ByteVar>(), pulfilesizelow?.value?.toCPointer<ByteVar>(), pulfilesizehigh?.value?.toCPointer<ByteVar>())

public actual fun jetOpenFileInstanceA(instance: JetInstance, szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenFileInstanceA(instance, szfilename?.value?.toCPointer<ByteVar>(), phffile?.value?.toCPointer<ByteVar>(), pulfilesizelow?.value?.toCPointer<ByteVar>(), pulfilesizehigh?.value?.toCPointer<ByteVar>())

public actual fun jetOpenFileInstanceW(instance: JetInstance, szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenFileInstanceW(instance, szfilename?.value?.toCPointer<ByteVar>(), phffile?.value?.toCPointer<ByteVar>(), pulfilesizelow?.value?.toCPointer<ByteVar>(), pulfilesizehigh?.value?.toCPointer<ByteVar>())

public actual fun jetOpenFileW(szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenFileW(szfilename?.value?.toCPointer<ByteVar>(), phffile?.value?.toCPointer<ByteVar>(), pulfilesizelow?.value?.toCPointer<ByteVar>(), pulfilesizehigh?.value?.toCPointer<ByteVar>())

public actual fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pvparameters: COpaquePointer?, cbparameters: UInt, grbit: UInt, ptableid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenTableA(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), pvparameters?.value?.toCPointer<ByteVar>(), cbparameters, grbit, ptableid?.value?.toCPointer<ByteVar>())

public actual fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pvparameters: COpaquePointer?, cbparameters: UInt, grbit: UInt, ptableid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenTableW(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), pvparameters?.value?.toCPointer<ByteVar>(), cbparameters, grbit, ptableid?.value?.toCPointer<ByteVar>())

public actual fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenTempTable(sesid, prgcolumndef?.value?.toCPointer<ByteVar>(), ccolumn, grbit, ptableid?.value?.toCPointer<ByteVar>(), prgcolumnid?.value?.toCPointer<ByteVar>())

public actual fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenTempTable2(sesid, prgcolumndef?.value?.toCPointer<ByteVar>(), ccolumn, lcid, grbit, ptableid?.value?.toCPointer<ByteVar>(), prgcolumnid?.value?.toCPointer<ByteVar>())

public actual fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, pidxunicode: COpaquePointer?, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenTempTable3(sesid, prgcolumndef?.value?.toCPointer<ByteVar>(), ccolumn, pidxunicode?.value?.toCPointer<ByteVar>(), grbit, ptableid?.value?.toCPointer<ByteVar>(), prgcolumnid?.value?.toCPointer<ByteVar>())

public actual fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenTemporaryTable(sesid, popentemporarytable?.value?.toCPointer<ByteVar>())

public actual fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetOpenTemporaryTable2(sesid, popentemporarytable?.value?.toCPointer<ByteVar>())

public actual fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetPrepareUpdate(sesid, tableid, prep)

public actual fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: COpaquePointer?, cindexranges: UInt, pcrangespreread: COpaquePointer?, rgcolumnidpreread: COpaquePointer?, ccolumnidpreread: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetPrereadIndexRanges(sesid, tableid, rgindexranges?.value?.toCPointer<ByteVar>(), cindexranges, pcrangespreread?.value?.toCPointer<ByteVar>(), rgcolumnidpreread?.value?.toCPointer<ByteVar>(), ccolumnidpreread, grbit)

public actual fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: COpaquePointer?, rgcbkeys: COpaquePointer?, ckeys: Int, pckeyspreread: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetPrereadKeys(sesid, tableid, rgpvkeys?.value?.toCPointer<ByteVar>(), rgcbkeys?.value?.toCPointer<ByteVar>(), ckeys, pckeyspreread?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetReadFile(hffile: JetHandle, pv: COpaquePointer?, cb: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetReadFile(hffile, pv?.value?.toCPointer<ByteVar>(), cb, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: COpaquePointer?, cb: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetReadFileInstance(instance, hffile, pv?.value?.toCPointer<ByteVar>(), cb, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: COpaquePointer?, phcallbackid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRegisterCallback(sesid, tableid, cbtyp, 0L.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>(), phcallbackid?.value?.toCPointer<ByteVar>())

public actual fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: COpaquePointer?, sznamenew: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRenameColumnA(sesid, tableid, szname?.value?.toCPointer<ByteVar>(), sznamenew?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: COpaquePointer?, sznamenew: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRenameColumnW(sesid, tableid, szname?.value?.toCPointer<ByteVar>(), sznamenew?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: COpaquePointer?, sznamenew: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRenameTableA(sesid, dbid, szname?.value?.toCPointer<ByteVar>(), sznamenew?.value?.toCPointer<ByteVar>())

public actual fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: COpaquePointer?, sznamenew: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRenameTableW(sesid, dbid, szname?.value?.toCPointer<ByteVar>(), sznamenew?.value?.toCPointer<ByteVar>())

public actual fun jetResetSessionContext(sesid: JetSesid): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetResetSessionContext(sesid)

public actual fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetResetTableSequential(sesid, tableid, grbit)

public actual fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetResizeDatabase(sesid, dbid, cpgtarget, pcpgactual?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetRestore2A(sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRestore2A(sz?.value?.toCPointer<ByteVar>(), szdest?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRestore2W(sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRestore2W(sz?.value?.toCPointer<ByteVar>(), szdest?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRestoreA(szsource: COpaquePointer?, pfn: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRestoreA(szsource?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRestoreInstanceA(instance: JetInstance, sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRestoreInstanceA(instance, sz?.value?.toCPointer<ByteVar>(), szdest?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRestoreInstanceW(instance: JetInstance, sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRestoreInstanceW(instance, sz?.value?.toCPointer<ByteVar>(), szdest?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRestoreW(szsource: COpaquePointer?, pfn: JetPfnstatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRestoreW(szsource?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: COpaquePointer?, cbdata: UInt, pcbactual: COpaquePointer?, grbit: UInt, pretinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRetrieveColumn(sesid, tableid, columnid, pvdata?.value?.toCPointer<ByteVar>(), cbdata, pcbactual?.value?.toCPointer<ByteVar>(), grbit, pretinfo?.value?.toCPointer<ByteVar>())

public actual fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: COpaquePointer?, cretrievecolumn: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRetrieveColumns(sesid, tableid, pretrievecolumn?.value?.toCPointer<ByteVar>(), cretrievecolumn)

public actual fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRetrieveKey(sesid, tableid, pvkey?.value?.toCPointer<ByteVar>(), cbmax, pcbactual?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetRollback(sesid: JetSesid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetRollback(sesid, grbit)

public actual fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSeek(sesid, tableid, grbit)

public actual fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt, psetinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetColumn(sesid, tableid, columnid, pvdata?.value?.toCPointer<ByteVar>(), cbdata, grbit, psetinfo?.value?.toCPointer<ByteVar>())

public actual fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szcolumnname: COpaquePointer?, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueA(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), szcolumnname?.value?.toCPointer<ByteVar>(), pvdata?.value?.toCPointer<ByteVar>(), cbdata, grbit)

public actual fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szcolumnname: COpaquePointer?, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueW(sesid, dbid, sztablename?.value?.toCPointer<ByteVar>(), szcolumnname?.value?.toCPointer<ByteVar>(), pvdata?.value?.toCPointer<ByteVar>(), cbdata, grbit)

public actual fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: COpaquePointer?, csetcolumn: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetColumns(sesid, tableid, psetcolumn?.value?.toCPointer<ByteVar>(), csetcolumn)

public actual fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetCurrentIndex2A(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetCurrentIndex2W(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), grbit)

public actual fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetCurrentIndex3A(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetCurrentIndex3W(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pindexid: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetCurrentIndex4A(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), pindexid?.value?.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pindexid: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetCurrentIndex4W(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>(), pindexid?.value?.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetCurrentIndexA(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>())

public actual fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetCurrentIndexW(sesid, tableid, szindexname?.value?.toCPointer<ByteVar>())

public actual fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: COpaquePointer?, ccolumnfilters: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetCursorFilter(sesid, tableid, rgcolumnfilters?.value?.toCPointer<ByteVar>(), ccolumnfilters, grbit)

public actual fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: COpaquePointer?, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetDatabaseSizeA(sesid, szdatabasename?.value?.toCPointer<ByteVar>(), cpg, pcpgreal?.value?.toCPointer<ByteVar>())

public actual fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: COpaquePointer?, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetDatabaseSizeW(sesid, szdatabasename?.value?.toCPointer<ByteVar>(), cpg, pcpgreal?.value?.toCPointer<ByteVar>())

public actual fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetIndexRange(sesid, tableidsrc, grbit)

public actual fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetLS(sesid, tableid, ls.toULong(), grbit)

public actual fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetSessionContext(sesid, ulcontext)

public actual fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: COpaquePointer?, cbparam: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetSessionParameter(sesid, sesparamid, pvparam?.value?.toCPointer<ByteVar>(), cbparam)

public actual fun jetSetSystemParameterA(pinstance: COpaquePointer?, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetSystemParameterA(pinstance?.value?.toCPointer<ByteVar>(), sesid, paramid, lparam, szparam?.value?.toCPointer<ByteVar>())

public actual fun jetSetSystemParameterW(pinstance: COpaquePointer?, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetSystemParameterW(pinstance?.value?.toCPointer<ByteVar>(), sesid, paramid, lparam, szparam?.value?.toCPointer<ByteVar>())

public actual fun jetSetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetSetTableSequential(sesid, tableid, grbit)

public actual fun jetStopBackup(): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetStopBackup()

public actual fun jetStopBackupInstance(instance: JetInstance): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetStopBackupInstance(instance)

public actual fun jetStopService(): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetStopService()

public actual fun jetStopServiceInstance(instance: JetInstance): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetStopServiceInstance(instance)

public actual fun jetStopServiceInstance2(instance: JetInstance, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetStopServiceInstance2(instance, grbit)

public actual fun jetTerm(instance: JetInstance): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetTerm(instance)

public actual fun jetTerm2(instance: JetInstance, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetTerm2(instance, grbit)

public actual fun jetTruncateLog(): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetTruncateLog()

public actual fun jetTruncateLogInstance(instance: JetInstance): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetTruncateLogInstance(instance)

public actual fun jetUnregisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, hcallbackid: JetHandle): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetUnregisterCallback(sesid, tableid, cbtyp, hcallbackid)

public actual fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt, pcbactual: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetUpdate(sesid, tableid, pvbookmark?.value?.toCPointer<ByteVar>(), cbbookmark, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt, pcbactual: COpaquePointer?, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_jetUpdate2(sesid, tableid, pvbookmark?.value?.toCPointer<ByteVar>(), cbbookmark, pcbactual?.value?.toCPointer<ByteVar>(), grbit)
