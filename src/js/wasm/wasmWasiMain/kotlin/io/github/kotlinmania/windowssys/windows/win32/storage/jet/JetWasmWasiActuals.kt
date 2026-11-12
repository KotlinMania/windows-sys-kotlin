@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>, pcolumndef: ConstPtr<JetColumndef>, pvdefault: ConstPtr<CVoid>, cbdefault: UInt, pcolumnid: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetAddColumnA")

public actual fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>, pcolumndef: ConstPtr<JetColumndef>, pvdefault: ConstPtr<CVoid>, cbdefault: UInt, pcolumnid: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetAddColumnW")

public actual fun jetAttachDatabase2A(sesid: JetSesid, szfilename: ConstPtr<Byte>, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetAttachDatabase2A")

public actual fun jetAttachDatabase2W(sesid: JetSesid, szfilename: ConstPtr<UShort>, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetAttachDatabase2W")

public actual fun jetAttachDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetAttachDatabaseA")

public actual fun jetAttachDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetAttachDatabaseW")

public actual fun jetBackupA(szbackuppath: ConstPtr<Byte>, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetBackupA")

public actual fun jetBackupInstanceA(instance: JetInstance, szbackuppath: ConstPtr<Byte>, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetBackupInstanceA")

public actual fun jetBackupInstanceW(instance: JetInstance, szbackuppath: ConstPtr<UShort>, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetBackupInstanceW")

public actual fun jetBackupW(szbackuppath: ConstPtr<UShort>, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetBackupW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetBeginExternalBackup")
private external fun wasiWindowssysWindowsWin32StorageJetJetBeginExternalBackup(grbit: Int): Int

public actual fun jetBeginExternalBackup(grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetBeginExternalBackup(grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance")
private external fun wasiWindowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(instance: Long, grbit: Int): Int

public actual fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(instance.toLong(), grbit.toInt())

public actual fun jetBeginSessionA(instance: JetInstance, psesid: MutPtr<JetSesid>, szusername: ConstPtr<Byte>, szpassword: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetBeginSessionA")

public actual fun jetBeginSessionW(instance: JetInstance, psesid: MutPtr<JetSesid>, szusername: ConstPtr<UShort>, szpassword: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetBeginSessionW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetBeginTransaction")
private external fun wasiWindowssysWindowsWin32StorageJetJetBeginTransaction(sesid: Long): Int

public actual fun jetBeginTransaction(sesid: JetSesid): Int =
    wasiWindowssysWindowsWin32StorageJetJetBeginTransaction(sesid.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetBeginTransaction2")
private external fun wasiWindowssysWindowsWin32StorageJetJetBeginTransaction2(sesid: Long, grbit: Int): Int

public actual fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetBeginTransaction2(sesid.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetBeginTransaction3")
private external fun wasiWindowssysWindowsWin32StorageJetJetBeginTransaction3(sesid: Long, trxid: Long, grbit: Int): Int

public actual fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetBeginTransaction3(sesid.toLong(), trxid, grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetCloseDatabase")
private external fun wasiWindowssysWindowsWin32StorageJetJetCloseDatabase(sesid: Long, dbid: Int, grbit: Int): Int

public actual fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetCloseDatabase(sesid.toLong(), dbid.toInt(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetCloseFile")
private external fun wasiWindowssysWindowsWin32StorageJetJetCloseFile(hffile: Long): Int

public actual fun jetCloseFile(hffile: JetHandle): Int =
    wasiWindowssysWindowsWin32StorageJetJetCloseFile(hffile.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetCloseFileInstance")
private external fun wasiWindowssysWindowsWin32StorageJetJetCloseFileInstance(instance: Long, hffile: Long): Int

public actual fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int =
    wasiWindowssysWindowsWin32StorageJetJetCloseFileInstance(instance.toLong(), hffile.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetCloseTable")
private external fun wasiWindowssysWindowsWin32StorageJetJetCloseTable(sesid: Long, tableid: Long): Int

public actual fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int =
    wasiWindowssysWindowsWin32StorageJetJetCloseTable(sesid.toLong(), tableid.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetCommitTransaction")
private external fun wasiWindowssysWindowsWin32StorageJetJetCommitTransaction(sesid: Long, grbit: Int): Int

public actual fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetCommitTransaction(sesid.toLong(), grbit.toInt())

public actual fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: MutPtr<JetCommitId>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCommitTransaction2")

public actual fun jetCompactA(sesid: JetSesid, szdatabasesrc: ConstPtr<Byte>, szdatabasedest: ConstPtr<Byte>, pfnstatus: JetPfnstatus, pconvert: ConstPtr<JetConvertA>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCompactA")

public actual fun jetCompactW(sesid: JetSesid, szdatabasesrc: ConstPtr<UShort>, szdatabasedest: ConstPtr<UShort>, pfnstatus: JetPfnstatus, pconvert: ConstPtr<JetConvertW>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCompactW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetComputeStats")
private external fun wasiWindowssysWindowsWin32StorageJetJetComputeStats(sesid: Long, tableid: Long): Int

public actual fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int =
    wasiWindowssysWindowsWin32StorageJetJetComputeStats(sesid.toLong(), tableid.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump")
private external fun wasiWindowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(grbit: Int): Int

public actual fun jetConfigureProcessForCrashDump(grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(grbit.toInt())

public actual fun jetCreateDatabase2A(sesid: JetSesid, szfilename: ConstPtr<Byte>, cpgdatabasesizemax: UInt, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateDatabase2A")

public actual fun jetCreateDatabase2W(sesid: JetSesid, szfilename: ConstPtr<UShort>, cpgdatabasesizemax: UInt, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateDatabase2W")

public actual fun jetCreateDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>, szconnect: ConstPtr<Byte>, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateDatabaseA")

public actual fun jetCreateDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>, szconnect: ConstPtr<UShort>, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateDatabaseW")

public actual fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreateA>, cindexcreate: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateIndex2A")

public actual fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreateW>, cindexcreate: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateIndex2W")

public actual fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate2A>, cindexcreate: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateIndex3A")

public actual fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate2W>, cindexcreate: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateIndex3W")

public actual fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate3A>, cindexcreate: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateIndex4A")

public actual fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate3W>, cindexcreate: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateIndex4W")

public actual fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateIndexA")

public actual fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateIndexW")

public actual fun jetCreateInstance2A(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<Byte>, szdisplayname: ConstPtr<Byte>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateInstance2A")

public actual fun jetCreateInstance2W(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<UShort>, szdisplayname: ConstPtr<UShort>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateInstance2W")

public actual fun jetCreateInstanceA(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateInstanceA")

public actual fun jetCreateInstanceW(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateInstanceW")

public actual fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, lpages: UInt, ldensity: UInt, ptableid: MutPtr<JetTableid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateTableA")

public actual fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate2A>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A")

public actual fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate2W>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W")

public actual fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate3A>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A")

public actual fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate3W>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W")

public actual fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate4A>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A")

public actual fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate4W>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W")

public actual fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreateA>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA")

public actual fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreateW>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW")

public actual fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, lpages: UInt, ldensity: UInt, ptableid: MutPtr<JetTableid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetCreateTableW")

public actual fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDefragment2A")

public actual fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDefragment2W")

public actual fun jetDefragment3A(sesid: JetSesid, szdatabasename: ConstPtr<Byte>, sztablename: ConstPtr<Byte>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, pvcontext: ConstPtr<CVoid>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDefragment3A")

public actual fun jetDefragment3W(sesid: JetSesid, szdatabasename: ConstPtr<UShort>, sztablename: ConstPtr<UShort>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, pvcontext: ConstPtr<CVoid>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDefragment3W")

public actual fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDefragmentA")

public actual fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDefragmentW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetDelete")
private external fun wasiWindowssysWindowsWin32StorageJetJetDelete(sesid: Long, tableid: Long): Int

public actual fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int =
    wasiWindowssysWindowsWin32StorageJetJetDelete(sesid.toLong(), tableid.toLong())

public actual fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDeleteColumn2A")

public actual fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDeleteColumn2W")

public actual fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDeleteColumnA")

public actual fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDeleteColumnW")

public actual fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDeleteIndexA")

public actual fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDeleteIndexW")

public actual fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDeleteTableA")

public actual fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDeleteTableW")

public actual fun jetDetachDatabase2A(sesid: JetSesid, szfilename: ConstPtr<Byte>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDetachDatabase2A")

public actual fun jetDetachDatabase2W(sesid: JetSesid, szfilename: ConstPtr<UShort>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDetachDatabase2W")

public actual fun jetDetachDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDetachDatabaseA")

public actual fun jetDetachDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDetachDatabaseW")

public actual fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: MutPtr<JetTableid>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDupCursor")

public actual fun jetDupSession(sesid: JetSesid, psesid: MutPtr<JetSesid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetDupSession")

public actual fun jetEnableMultiInstanceA(psetsysparam: ConstPtr<JetSetsysparamA>, csetsysparam: UInt, pcsetsucceed: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetEnableMultiInstanceA")

public actual fun jetEnableMultiInstanceW(psetsysparam: ConstPtr<JetSetsysparamW>, csetsysparam: UInt, pcsetsucceed: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetEnableMultiInstanceW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetEndExternalBackup")
private external fun wasiWindowssysWindowsWin32StorageJetJetEndExternalBackup(): Int

public actual fun jetEndExternalBackup(): Int =
    wasiWindowssysWindowsWin32StorageJetJetEndExternalBackup()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetEndExternalBackupInstance")
private external fun wasiWindowssysWindowsWin32StorageJetJetEndExternalBackupInstance(instance: Long): Int

public actual fun jetEndExternalBackupInstance(instance: JetInstance): Int =
    wasiWindowssysWindowsWin32StorageJetJetEndExternalBackupInstance(instance.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2")
private external fun wasiWindowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(instance: Long, grbit: Int): Int

public actual fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(instance.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetEndSession")
private external fun wasiWindowssysWindowsWin32StorageJetJetEndSession(sesid: Long, grbit: Int): Int

public actual fun jetEndSession(sesid: JetSesid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetEndSession(sesid.toLong(), grbit.toInt())

public actual fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: ConstPtr<JetEnumcolumnid>, pcenumcolumn: MutPtr<UInt>, prgenumcolumn: MutPtr<MutPtr<JetEnumcolumn>>, pfnrealloc: JetPfnrealloc, pvrealloccontext: ConstPtr<CVoid>, cbdatamost: UInt, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetEnumerateColumns")

public actual fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: ConstPtr<CVoid>, cbmax: UInt, pvold: MutPtr<CVoid>, cboldmax: UInt, pcboldactual: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetEscrowUpdate")

public actual fun jetExternalRestore2A(szcheckpointfilepath: ConstPtr<Byte>, szlogpath: ConstPtr<Byte>, rgrstmap: ConstPtr<JetRstmapA>, crstfilemap: Int, szbackuplogpath: ConstPtr<Byte>, ploginfo: MutPtr<JetLoginfoA>, sztargetinstancename: ConstPtr<Byte>, sztargetinstancelogpath: ConstPtr<Byte>, sztargetinstancecheckpointpath: ConstPtr<Byte>, pfn: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetExternalRestore2A")

public actual fun jetExternalRestore2W(szcheckpointfilepath: ConstPtr<UShort>, szlogpath: ConstPtr<UShort>, rgrstmap: ConstPtr<JetRstmapW>, crstfilemap: Int, szbackuplogpath: ConstPtr<UShort>, ploginfo: MutPtr<JetLoginfoW>, sztargetinstancename: ConstPtr<UShort>, sztargetinstancelogpath: ConstPtr<UShort>, sztargetinstancecheckpointpath: ConstPtr<UShort>, pfn: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetExternalRestore2W")

public actual fun jetExternalRestoreA(szcheckpointfilepath: ConstPtr<Byte>, szlogpath: ConstPtr<Byte>, rgrstmap: ConstPtr<JetRstmapA>, crstfilemap: Int, szbackuplogpath: ConstPtr<Byte>, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetExternalRestoreA")

public actual fun jetExternalRestoreW(szcheckpointfilepath: ConstPtr<UShort>, szlogpath: ConstPtr<UShort>, rgrstmap: ConstPtr<JetRstmapW>, crstfilemap: Int, szbackuplogpath: ConstPtr<UShort>, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetExternalRestoreW")

public actual fun jetFreeBuffer(pbbuf: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetFreeBuffer")

public actual fun jetGetAttachInfoA(szzdatabases: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetAttachInfoA")

public actual fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA")

public actual fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW")

public actual fun jetGetAttachInfoW(wszzdatabases: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetAttachInfoW")

public actual fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr<CVoid>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetBookmark")

public actual fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pcolumnnameorid: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetColumnInfoA")

public actual fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pwcolumnnameorid: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetColumnInfoW")

public actual fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr<Byte>, cbindexname: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetCurrentIndexA")

public actual fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr<UShort>, cbindexname: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetCurrentIndexW")

public actual fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetCursorInfo")

public actual fun jetGetDatabaseFileInfoA(szdatabasename: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA")

public actual fun jetGetDatabaseFileInfoW(szdatabasename: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW")

public actual fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetDatabaseInfoA")

public actual fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetDatabaseInfoW")

public actual fun jetGetErrorInfoW(pvcontext: ConstPtr<CVoid>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetErrorInfoW")

public actual fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, szindexname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetIndexInfoA")

public actual fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, szindexname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetIndexInfoW")

public actual fun jetGetInstanceInfoA(pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoA>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetInstanceInfoA")

public actual fun jetGetInstanceInfoW(pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoW>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetInstanceInfoW")

public actual fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo")

public actual fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: MutPtr<JetLs>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetLS")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetGetLock")
private external fun wasiWindowssysWindowsWin32StorageJetJetGetLock(sesid: Long, tableid: Long, grbit: Int): Int

public actual fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetGetLock(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetGetLogInfoA(szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetLogInfoA")

public actual fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>, ploginfo: MutPtr<JetLoginfoA>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A")

public actual fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>, ploginfo: MutPtr<JetLoginfoW>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W")

public actual fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA")

public actual fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW")

public actual fun jetGetLogInfoW(szzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetLogInfoW")

public actual fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr<Byte>, szobjectname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetObjectInfoA")

public actual fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr<UShort>, szobjectname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetObjectInfoW")

public actual fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: MutPtr<JetRecpos>, cbrecpos: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetRecordPosition")

public actual fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr<JetRecsize>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetRecordSize")

public actual fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr<JetRecsize2>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetRecordSize2")

public actual fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: MutPtr<CVoid>, cbsecondarykeymax: UInt, pcbsecondarykeyactual: MutPtr<UInt>, pvprimarybookmark: MutPtr<CVoid>, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark")

public actual fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: MutPtr<CVoid>, cbparammax: UInt, pcbparamactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetSessionParameter")

public actual fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr<JetApiPtr>, szparam: MutPtr<Byte>, cbmax: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetSystemParameterA")

public actual fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr<JetApiPtr>, szparam: MutPtr<UShort>, cbmax: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetSystemParameterW")

public actual fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetTableColumnInfoA")

public actual fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetTableColumnInfoW")

public actual fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetTableIndexInfoA")

public actual fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetTableIndexInfoW")

public actual fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetTableInfoA")

public actual fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetTableInfoW")

public actual fun jetGetThreadStats(pvresult: MutPtr<CVoid>, cbmax: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetThreadStats")

public actual fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA")

public actual fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW")

public actual fun jetGetVersion(sesid: JetSesid, pwversion: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGetVersion")

public actual fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: ConstPtr<CVoid>, cbbookmark: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGotoBookmark")

public actual fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: ConstPtr<JetRecpos>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGotoPosition")

public actual fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: ConstPtr<CVoid>, cbsecondarykey: UInt, pvprimarybookmark: ConstPtr<CVoid>, cbprimarybookmark: UInt, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark")

public actual fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: ConstPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetGrowDatabase")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetIdle")
private external fun wasiWindowssysWindowsWin32StorageJetJetIdle(sesid: Long, grbit: Int): Int

public actual fun jetIdle(sesid: JetSesid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetIdle(sesid.toLong(), grbit.toInt())

public actual fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: MutPtr<UInt>, crecmax: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetIndexRecordCount")

public actual fun jetInit(pinstance: MutPtr<JetInstance>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetInit")

public actual fun jetInit2(pinstance: MutPtr<JetInstance>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetInit2")

public actual fun jetInit3A(pinstance: MutPtr<JetInstance>, prstinfo: ConstPtr<JetRstinfoA>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetInit3A")

public actual fun jetInit3W(pinstance: MutPtr<JetInstance>, prstinfo: ConstPtr<JetRstinfoW>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetInit3W")

public actual fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: ConstPtr<JetIndexrange>, cindexrange: UInt, precordlist: MutPtr<JetRecordlist>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetIntersectIndexes")

public actual fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetMakeKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetMove")
private external fun wasiWindowssysWindowsWin32StorageJetJetMove(sesid: Long, tableid: Long, crow: Int, grbit: Int): Int

public actual fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetMove(sesid.toLong(), tableid.toLong(), crow, grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetOSSnapshotAbort")
private external fun wasiWindowssysWindowsWin32StorageJetJetOSSnapshotAbort(snapid: Long, grbit: Int): Int

public actual fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetOSSnapshotAbort(snapid.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetOSSnapshotEnd")
private external fun wasiWindowssysWindowsWin32StorageJetJetOSSnapshotEnd(snapid: Long, grbit: Int): Int

public actual fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetOSSnapshotEnd(snapid.toLong(), grbit.toInt())

public actual fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoA>>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA")

public actual fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoW>>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW")

public actual fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoA>>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA")

public actual fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoW>>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW")

public actual fun jetOSSnapshotPrepare(psnapid: MutPtr<JetOssnapid>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOSSnapshotPrepare")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance")
private external fun wasiWindowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(snapid: Long, instance: Long, grbit: Int): Int

public actual fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(snapid.toLong(), instance.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetOSSnapshotThaw")
private external fun wasiWindowssysWindowsWin32StorageJetJetOSSnapshotThaw(snapid: Long, grbit: Int): Int

public actual fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetOSSnapshotThaw(snapid.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog")
private external fun wasiWindowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(snapid: Long, grbit: Int): Int

public actual fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(snapid.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance")
private external fun wasiWindowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(snapid: Long, instance: Long, grbit: Int): Int

public actual fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(snapid.toLong(), instance.toLong(), grbit.toInt())

public actual fun jetOpenDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>, szconnect: ConstPtr<Byte>, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenDatabaseA")

public actual fun jetOpenDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>, szconnect: ConstPtr<UShort>, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenDatabaseW")

public actual fun jetOpenFileA(szfilename: ConstPtr<Byte>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenFileA")

public actual fun jetOpenFileInstanceA(instance: JetInstance, szfilename: ConstPtr<Byte>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenFileInstanceA")

public actual fun jetOpenFileInstanceW(instance: JetInstance, szfilename: ConstPtr<UShort>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenFileInstanceW")

public actual fun jetOpenFileW(szfilename: ConstPtr<UShort>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenFileW")

public actual fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pvparameters: ConstPtr<CVoid>, cbparameters: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenTableA")

public actual fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pvparameters: ConstPtr<CVoid>, cbparameters: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenTableW")

public actual fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: ConstPtr<JetColumndef>, ccolumn: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>, prgcolumnid: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenTempTable")

public actual fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: ConstPtr<JetColumndef>, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>, prgcolumnid: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenTempTable2")

public actual fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: ConstPtr<JetColumndef>, ccolumn: UInt, pidxunicode: ConstPtr<JetUnicodeindex>, grbit: UInt, ptableid: MutPtr<JetTableid>, prgcolumnid: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenTempTable3")

public actual fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: ConstPtr<JetOpentemporarytable>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenTemporaryTable")

public actual fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: ConstPtr<JetOpentemporarytable2>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetOpenTemporaryTable2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetPrepareUpdate")
private external fun wasiWindowssysWindowsWin32StorageJetJetPrepareUpdate(sesid: Long, tableid: Long, prep: Int): Int

public actual fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetPrepareUpdate(sesid.toLong(), tableid.toLong(), prep.toInt())

public actual fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: ConstPtr<JetIndexRange>, cindexranges: UInt, pcrangespreread: MutPtr<UInt>, rgcolumnidpreread: ConstPtr<UInt>, ccolumnidpreread: UInt, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetPrereadIndexRanges")

public actual fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: ConstPtr<ConstPtr<CVoid>>, rgcbkeys: ConstPtr<UInt>, ckeys: Int, pckeyspreread: MutPtr<Int>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetPrereadKeys")

public actual fun jetReadFile(hffile: JetHandle, pv: MutPtr<CVoid>, cb: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetReadFile")

public actual fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: MutPtr<CVoid>, cb: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetReadFileInstance")

public actual fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: ConstPtr<CVoid>, phcallbackid: ConstPtr<JetHandle>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRegisterCallback")

public actual fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr<Byte>, sznamenew: ConstPtr<Byte>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRenameColumnA")

public actual fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr<UShort>, sznamenew: ConstPtr<UShort>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRenameColumnW")

public actual fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: ConstPtr<Byte>, sznamenew: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRenameTableA")

public actual fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: ConstPtr<UShort>, sznamenew: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRenameTableW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetResetSessionContext")
private external fun wasiWindowssysWindowsWin32StorageJetJetResetSessionContext(sesid: Long): Int

public actual fun jetResetSessionContext(sesid: JetSesid): Int =
    wasiWindowssysWindowsWin32StorageJetJetResetSessionContext(sesid.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetResetTableSequential")
private external fun wasiWindowssysWindowsWin32StorageJetJetResetTableSequential(sesid: Long, tableid: Long, grbit: Int): Int

public actual fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetResetTableSequential(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetResizeDatabase")

public actual fun jetRestore2A(sz: ConstPtr<Byte>, szdest: ConstPtr<Byte>, pfn: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRestore2A")

public actual fun jetRestore2W(sz: ConstPtr<UShort>, szdest: ConstPtr<UShort>, pfn: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRestore2W")

public actual fun jetRestoreA(szsource: ConstPtr<Byte>, pfn: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRestoreA")

public actual fun jetRestoreInstanceA(instance: JetInstance, sz: ConstPtr<Byte>, szdest: ConstPtr<Byte>, pfn: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRestoreInstanceA")

public actual fun jetRestoreInstanceW(instance: JetInstance, sz: ConstPtr<UShort>, szdest: ConstPtr<UShort>, pfn: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRestoreInstanceW")

public actual fun jetRestoreW(szsource: ConstPtr<UShort>, pfn: JetPfnstatus): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRestoreW")

public actual fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: MutPtr<CVoid>, cbdata: UInt, pcbactual: MutPtr<UInt>, grbit: UInt, pretinfo: MutPtr<JetRetinfo>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRetrieveColumn")

public actual fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: MutPtr<JetRetrievecolumn>, cretrievecolumn: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRetrieveColumns")

public actual fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: MutPtr<CVoid>, cbmax: UInt, pcbactual: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetRetrieveKey")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetRollback")
private external fun wasiWindowssysWindowsWin32StorageJetJetRollback(sesid: Long, grbit: Int): Int

public actual fun jetRollback(sesid: JetSesid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetRollback(sesid.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetSeek")
private external fun wasiWindowssysWindowsWin32StorageJetJetSeek(sesid: Long, tableid: Long, grbit: Int): Int

public actual fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetSeek(sesid.toLong(), tableid.toLong(), grbit.toInt())

public actual fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt, psetinfo: ConstPtr<JetSetinfo>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetColumn")

public actual fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, szcolumnname: ConstPtr<Byte>, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA")

public actual fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, szcolumnname: ConstPtr<UShort>, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW")

public actual fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: ConstPtr<JetSetcolumn>, csetcolumn: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetColumns")

public actual fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetCurrentIndex2A")

public actual fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetCurrentIndex2W")

public actual fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, grbit: UInt, itagsequence: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetCurrentIndex3A")

public actual fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, grbit: UInt, itagsequence: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetCurrentIndex3W")

public actual fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, pindexid: ConstPtr<JetIndexid>, grbit: UInt, itagsequence: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetCurrentIndex4A")

public actual fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, pindexid: ConstPtr<JetIndexid>, grbit: UInt, itagsequence: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetCurrentIndex4W")

public actual fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetCurrentIndexA")

public actual fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetCurrentIndexW")

public actual fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: ConstPtr<JetIndexColumn>, ccolumnfilters: UInt, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetCursorFilter")

public actual fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: ConstPtr<Byte>, cpg: UInt, pcpgreal: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetDatabaseSizeA")

public actual fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: ConstPtr<UShort>, cpg: UInt, pcpgreal: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetDatabaseSizeW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetSetIndexRange")
private external fun wasiWindowssysWindowsWin32StorageJetJetSetIndexRange(sesid: Long, tableidsrc: Long, grbit: Int): Int

public actual fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetSetIndexRange(sesid.toLong(), tableidsrc.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetSetLS")
private external fun wasiWindowssysWindowsWin32StorageJetJetSetLS(sesid: Long, tableid: Long, ls: Long, grbit: Int): Int

public actual fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetSetLS(sesid.toLong(), tableid.toLong(), ls.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetSetSessionContext")
private external fun wasiWindowssysWindowsWin32StorageJetJetSetSessionContext(sesid: Long, ulcontext: Long): Int

public actual fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int =
    wasiWindowssysWindowsWin32StorageJetJetSetSessionContext(sesid.toLong(), ulcontext.toLong())

public actual fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: ConstPtr<CVoid>, cbparam: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetSessionParameter")

public actual fun jetSetSystemParameterA(pinstance: MutPtr<JetInstance>, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr<Byte>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetSystemParameterA")

public actual fun jetSetSystemParameterW(pinstance: MutPtr<JetInstance>, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetSetSystemParameterW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetSetTableSequential")
private external fun wasiWindowssysWindowsWin32StorageJetJetSetTableSequential(sesid: Long, tableid: Long, grbit: Int): Int

public actual fun jetSetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetSetTableSequential(sesid.toLong(), tableid.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetStopBackup")
private external fun wasiWindowssysWindowsWin32StorageJetJetStopBackup(): Int

public actual fun jetStopBackup(): Int =
    wasiWindowssysWindowsWin32StorageJetJetStopBackup()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetStopBackupInstance")
private external fun wasiWindowssysWindowsWin32StorageJetJetStopBackupInstance(instance: Long): Int

public actual fun jetStopBackupInstance(instance: JetInstance): Int =
    wasiWindowssysWindowsWin32StorageJetJetStopBackupInstance(instance.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetStopService")
private external fun wasiWindowssysWindowsWin32StorageJetJetStopService(): Int

public actual fun jetStopService(): Int =
    wasiWindowssysWindowsWin32StorageJetJetStopService()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetStopServiceInstance")
private external fun wasiWindowssysWindowsWin32StorageJetJetStopServiceInstance(instance: Long): Int

public actual fun jetStopServiceInstance(instance: JetInstance): Int =
    wasiWindowssysWindowsWin32StorageJetJetStopServiceInstance(instance.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetStopServiceInstance2")
private external fun wasiWindowssysWindowsWin32StorageJetJetStopServiceInstance2(instance: Long, grbit: Int): Int

public actual fun jetStopServiceInstance2(instance: JetInstance, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetStopServiceInstance2(instance.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetTerm")
private external fun wasiWindowssysWindowsWin32StorageJetJetTerm(instance: Long): Int

public actual fun jetTerm(instance: JetInstance): Int =
    wasiWindowssysWindowsWin32StorageJetJetTerm(instance.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetTerm2")
private external fun wasiWindowssysWindowsWin32StorageJetJetTerm2(instance: Long, grbit: Int): Int

public actual fun jetTerm2(instance: JetInstance, grbit: UInt): Int =
    wasiWindowssysWindowsWin32StorageJetJetTerm2(instance.toLong(), grbit.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetTruncateLog")
private external fun wasiWindowssysWindowsWin32StorageJetJetTruncateLog(): Int

public actual fun jetTruncateLog(): Int =
    wasiWindowssysWindowsWin32StorageJetJetTruncateLog()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetTruncateLogInstance")
private external fun wasiWindowssysWindowsWin32StorageJetJetTruncateLogInstance(instance: Long): Int

public actual fun jetTruncateLogInstance(instance: JetInstance): Int =
    wasiWindowssysWindowsWin32StorageJetJetTruncateLogInstance(instance.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageJetJetUnregisterCallback")
private external fun wasiWindowssysWindowsWin32StorageJetJetUnregisterCallback(sesid: Long, tableid: Long, cbtyp: Int, hcallbackid: Long): Int

public actual fun jetUnregisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, hcallbackid: JetHandle): Int =
    wasiWindowssysWindowsWin32StorageJetJetUnregisterCallback(sesid.toLong(), tableid.toLong(), cbtyp.toInt(), hcallbackid.toLong())

public actual fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr<CVoid>, cbbookmark: UInt, pcbactual: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetUpdate")

public actual fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr<CVoid>, cbbookmark: UInt, pcbactual: MutPtr<UInt>, grbit: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageJetJetUpdate2")
