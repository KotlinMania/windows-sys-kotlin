@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

private val windowsWin32StorageJetNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>, pcolumndef: ConstPtr<JetColumndef>, pvdefault: ConstPtr<CVoid>, cbdefault: UInt, pcolumnid: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetAddColumnA(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), pcolumndef.rawAddress.toString(), pvdefault.rawAddress.toString(), cbdefault.toInt(), pcolumnid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>, pcolumndef: ConstPtr<JetColumndef>, pvdefault: ConstPtr<CVoid>, cbdefault: UInt, pcolumnid: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetAddColumnW(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), pcolumndef.rawAddress.toString(), pvdefault.rawAddress.toString(), cbdefault.toInt(), pcolumnid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabase2A(sesid: JetSesid, szfilename: ConstPtr<Byte>, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetAttachDatabase2A(sesid.toString(), szfilename.rawAddress.toString(), cpgdatabasesizemax.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabase2W(sesid: JetSesid, szfilename: ConstPtr<UShort>, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetAttachDatabase2W(sesid.toString(), szfilename.rawAddress.toString(), cpgdatabasesizemax.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetAttachDatabaseA(sesid.toString(), szfilename.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetAttachDatabaseW(sesid.toString(), szfilename.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupA(szbackuppath: ConstPtr<Byte>, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBackupA(szbackuppath.rawAddress.toString(), grbit.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupInstanceA(instance: JetInstance, szbackuppath: ConstPtr<Byte>, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBackupInstanceA(instance.toString(), szbackuppath.rawAddress.toString(), grbit.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupInstanceW(instance: JetInstance, szbackuppath: ConstPtr<UShort>, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBackupInstanceW(instance.toString(), szbackuppath.rawAddress.toString(), grbit.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupW(szbackuppath: ConstPtr<UShort>, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBackupW(szbackuppath.rawAddress.toString(), grbit.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginExternalBackup(grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBeginExternalBackup(grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginSessionA(instance: JetInstance, psesid: MutPtr<JetSesid>, szusername: ConstPtr<Byte>, szpassword: ConstPtr<Byte>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBeginSessionA(instance.toString(), psesid.rawAddress.toString(), szusername.rawAddress.toString(), szpassword.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginSessionW(instance: JetInstance, psesid: MutPtr<JetSesid>, szusername: ConstPtr<UShort>, szpassword: ConstPtr<UShort>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBeginSessionW(instance.toString(), psesid.rawAddress.toString(), szusername.rawAddress.toString(), szpassword.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction(sesid: JetSesid): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBeginTransaction(sesid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBeginTransaction2(sesid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetBeginTransaction3(sesid.toString(), trxid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCloseDatabase(sesid.toString(), dbid.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseFile(hffile: JetHandle): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCloseFile(hffile.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCloseFileInstance(instance.toString(), hffile.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCloseTable(sesid.toString(), tableid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCommitTransaction(sesid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: MutPtr<JetCommitId>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCommitTransaction2(sesid.toString(), grbit.toInt(), cmsecdurablecommit.toInt(), pcommitid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCompactA(sesid: JetSesid, szdatabasesrc: ConstPtr<Byte>, szdatabasedest: ConstPtr<Byte>, pfnstatus: JetPfnstatus, pconvert: ConstPtr<JetConvertA>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCompactA(sesid.toString(), szdatabasesrc.rawAddress.toString(), szdatabasedest.rawAddress.toString(), 0L.toString(), pconvert.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCompactW(sesid: JetSesid, szdatabasesrc: ConstPtr<UShort>, szdatabasedest: ConstPtr<UShort>, pfnstatus: JetPfnstatus, pconvert: ConstPtr<JetConvertW>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCompactW(sesid.toString(), szdatabasesrc.rawAddress.toString(), szdatabasedest.rawAddress.toString(), 0L.toString(), pconvert.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetComputeStats(sesid.toString(), tableid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetConfigureProcessForCrashDump(grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabase2A(sesid: JetSesid, szfilename: ConstPtr<Byte>, cpgdatabasesizemax: UInt, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateDatabase2A(sesid.toString(), szfilename.rawAddress.toString(), cpgdatabasesizemax.toInt(), pdbid.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabase2W(sesid: JetSesid, szfilename: ConstPtr<UShort>, cpgdatabasesizemax: UInt, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateDatabase2W(sesid.toString(), szfilename.rawAddress.toString(), cpgdatabasesizemax.toInt(), pdbid.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>, szconnect: ConstPtr<Byte>, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateDatabaseA(sesid.toString(), szfilename.rawAddress.toString(), szconnect.rawAddress.toString(), pdbid.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>, szconnect: ConstPtr<UShort>, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateDatabaseW(sesid.toString(), szfilename.rawAddress.toString(), szconnect.rawAddress.toString(), pdbid.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreateA>, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateIndex2A(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreateW>, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateIndex2W(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate2A>, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateIndex3A(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate2W>, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateIndex3W(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate3A>, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateIndex4A(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate3W>, cindexcreate: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateIndex4W(sesid.toString(), tableid.toString(), pindexcreate.rawAddress.toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateIndexA(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt(), szkey.rawAddress.toString(), cbkey.toInt(), ldensity.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateIndexW(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt(), szkey.rawAddress.toString(), cbkey.toInt(), ldensity.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstance2A(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<Byte>, szdisplayname: ConstPtr<Byte>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateInstance2A(pinstance.rawAddress.toString(), szinstancename.rawAddress.toString(), szdisplayname.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstance2W(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<UShort>, szdisplayname: ConstPtr<UShort>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateInstance2W(pinstance.rawAddress.toString(), szinstancename.rawAddress.toString(), szdisplayname.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstanceA(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<Byte>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateInstanceA(pinstance.rawAddress.toString(), szinstancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstanceW(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<UShort>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateInstanceW(pinstance.rawAddress.toString(), szinstancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, lpages: UInt, ldensity: UInt, ptableid: MutPtr<JetTableid>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateTableA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), lpages.toInt(), ldensity.toInt(), ptableid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate2A>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate2W>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate3A>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate3W>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate4A>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate4W>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreateA>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreateW>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW(sesid.toString(), dbid.toInt(), ptablecreate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, lpages: UInt, ldensity: UInt, ptableid: MutPtr<JetTableid>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetCreateTableW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), lpages.toInt(), ldensity.toInt(), ptableid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDefragment2A(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), 0L.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDefragment2W(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), 0L.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment3A(sesid: JetSesid, szdatabasename: ConstPtr<Byte>, sztablename: ConstPtr<Byte>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, pvcontext: ConstPtr<CVoid>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDefragment3A(sesid.toString(), szdatabasename.rawAddress.toString(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), 0L.toString(), pvcontext.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment3W(sesid: JetSesid, szdatabasename: ConstPtr<UShort>, sztablename: ConstPtr<UShort>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, pvcontext: ConstPtr<CVoid>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDefragment3W(sesid.toString(), szdatabasename.rawAddress.toString(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), 0L.toString(), pvcontext.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDefragmentA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDefragmentW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pcpasses.rawAddress.toString(), pcseconds.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDelete(sesid.toString(), tableid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDeleteColumn2A(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDeleteColumn2W(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDeleteColumnA(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDeleteColumnW(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDeleteIndexA(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDeleteIndexW(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDeleteTableA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDeleteTableW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabase2A(sesid: JetSesid, szfilename: ConstPtr<Byte>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDetachDatabase2A(sesid.toString(), szfilename.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabase2W(sesid: JetSesid, szfilename: ConstPtr<UShort>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDetachDatabase2W(sesid.toString(), szfilename.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDetachDatabaseA(sesid.toString(), szfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDetachDatabaseW(sesid.toString(), szfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: MutPtr<JetTableid>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDupCursor(sesid.toString(), tableid.toString(), ptableid.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDupSession(sesid: JetSesid, psesid: MutPtr<JetSesid>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetDupSession(sesid.toString(), psesid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnableMultiInstanceA(psetsysparam: ConstPtr<JetSetsysparamA>, csetsysparam: UInt, pcsetsucceed: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetEnableMultiInstanceA(psetsysparam.rawAddress.toString(), csetsysparam.toInt(), pcsetsucceed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnableMultiInstanceW(psetsysparam: ConstPtr<JetSetsysparamW>, csetsysparam: UInt, pcsetsucceed: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetEnableMultiInstanceW(psetsysparam.rawAddress.toString(), csetsysparam.toInt(), pcsetsucceed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackup(): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetEndExternalBackup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackupInstance(instance: JetInstance): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetEndExternalBackupInstance(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndSession(sesid: JetSesid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetEndSession(sesid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: ConstPtr<JetEnumcolumnid>, pcenumcolumn: MutPtr<UInt>, prgenumcolumn: MutPtr<MutPtr<JetEnumcolumn>>, pfnrealloc: JetPfnrealloc, pvrealloccontext: ConstPtr<CVoid>, cbdatamost: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetEnumerateColumns(sesid.toString(), tableid.toString(), cenumcolumnid.toInt(), rgenumcolumnid.rawAddress.toString(), pcenumcolumn.rawAddress.toString(), prgenumcolumn.rawAddress.toString(), 0L.toString(), pvrealloccontext.rawAddress.toString(), cbdatamost.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: ConstPtr<CVoid>, cbmax: UInt, pvold: MutPtr<CVoid>, cboldmax: UInt, pcboldactual: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetEscrowUpdate(sesid.toString(), tableid.toString(), columnid.toInt(), pv.rawAddress.toString(), cbmax.toInt(), pvold.rawAddress.toString(), cboldmax.toInt(), pcboldactual.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestore2A(szcheckpointfilepath: ConstPtr<Byte>, szlogpath: ConstPtr<Byte>, rgrstmap: ConstPtr<JetRstmapA>, crstfilemap: Int, szbackuplogpath: ConstPtr<Byte>, ploginfo: MutPtr<JetLoginfoA>, sztargetinstancename: ConstPtr<Byte>, sztargetinstancelogpath: ConstPtr<Byte>, sztargetinstancecheckpointpath: ConstPtr<Byte>, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetExternalRestore2A(szcheckpointfilepath.rawAddress.toString(), szlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstfilemap, szbackuplogpath.rawAddress.toString(), ploginfo.rawAddress.toString(), sztargetinstancename.rawAddress.toString(), sztargetinstancelogpath.rawAddress.toString(), sztargetinstancecheckpointpath.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestore2W(szcheckpointfilepath: ConstPtr<UShort>, szlogpath: ConstPtr<UShort>, rgrstmap: ConstPtr<JetRstmapW>, crstfilemap: Int, szbackuplogpath: ConstPtr<UShort>, ploginfo: MutPtr<JetLoginfoW>, sztargetinstancename: ConstPtr<UShort>, sztargetinstancelogpath: ConstPtr<UShort>, sztargetinstancecheckpointpath: ConstPtr<UShort>, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetExternalRestore2W(szcheckpointfilepath.rawAddress.toString(), szlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstfilemap, szbackuplogpath.rawAddress.toString(), ploginfo.rawAddress.toString(), sztargetinstancename.rawAddress.toString(), sztargetinstancelogpath.rawAddress.toString(), sztargetinstancecheckpointpath.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestoreA(szcheckpointfilepath: ConstPtr<Byte>, szlogpath: ConstPtr<Byte>, rgrstmap: ConstPtr<JetRstmapA>, crstfilemap: Int, szbackuplogpath: ConstPtr<Byte>, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetExternalRestoreA(szcheckpointfilepath.rawAddress.toString(), szlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstfilemap, szbackuplogpath.rawAddress.toString(), genlow, genhigh, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestoreW(szcheckpointfilepath: ConstPtr<UShort>, szlogpath: ConstPtr<UShort>, rgrstmap: ConstPtr<JetRstmapW>, crstfilemap: Int, szbackuplogpath: ConstPtr<UShort>, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetExternalRestoreW(szcheckpointfilepath.rawAddress.toString(), szlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstfilemap, szbackuplogpath.rawAddress.toString(), genlow, genhigh, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetFreeBuffer(pbbuf: Pcstr): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetFreeBuffer(pbbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoA(szzdatabases: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetAttachInfoA(szzdatabases.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA(instance.toString(), szzdatabases.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW(instance.toString(), szzdatabases.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoW(wszzdatabases: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetAttachInfoW(wszzdatabases.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr<CVoid>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetBookmark(sesid.toString(), tableid.toString(), pvbookmark.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pcolumnnameorid: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetColumnInfoA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pcolumnnameorid.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pwcolumnnameorid: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetColumnInfoW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pwcolumnnameorid.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr<Byte>, cbindexname: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetCurrentIndexA(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), cbindexname.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr<UShort>, cbindexname: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetCurrentIndexW(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), cbindexname.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetCursorInfo(sesid.toString(), tableid.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseFileInfoA(szdatabasename: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA(szdatabasename.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseFileInfoW(szdatabasename: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW(szdatabasename.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetDatabaseInfoA(sesid.toString(), dbid.toInt(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetDatabaseInfoW(sesid.toString(), dbid.toInt(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetErrorInfoW(pvcontext: ConstPtr<CVoid>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetErrorInfoW(pvcontext.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, szindexname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetIndexInfoA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), szindexname.rawAddress.toString(), pvresult.rawAddress.toString(), cbresult.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, szindexname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetIndexInfoW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), szindexname.rawAddress.toString(), pvresult.rawAddress.toString(), cbresult.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceInfoA(pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoA>>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetInstanceInfoA(pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceInfoW(pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoW>>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetInstanceInfoW(pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo(instance.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: MutPtr<JetLs>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetLS(sesid.toString(), tableid.toString(), pls.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetLock(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoA(szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetLogInfoA(szzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>, ploginfo: MutPtr<JetLoginfoA>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A(instance.toString(), szzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString(), ploginfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>, ploginfo: MutPtr<JetLoginfoW>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W(instance.toString(), wszzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString(), ploginfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA(instance.toString(), szzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW(instance.toString(), wszzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoW(szzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetLogInfoW(szzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr<Byte>, szobjectname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetObjectInfoA(sesid.toString(), dbid.toInt(), objtyp.toInt(), szcontainername.rawAddress.toString(), szobjectname.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr<UShort>, szobjectname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetObjectInfoW(sesid.toString(), dbid.toInt(), objtyp.toInt(), szcontainername.rawAddress.toString(), szobjectname.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: MutPtr<JetRecpos>, cbrecpos: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetRecordPosition(sesid.toString(), tableid.toString(), precpos.rawAddress.toString(), cbrecpos.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr<JetRecsize>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetRecordSize(sesid.toString(), tableid.toString(), precsize.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr<JetRecsize2>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetRecordSize2(sesid.toString(), tableid.toString(), precsize.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: MutPtr<CVoid>, cbsecondarykeymax: UInt, pcbsecondarykeyactual: MutPtr<UInt>, pvprimarybookmark: MutPtr<CVoid>, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark(sesid.toString(), tableid.toString(), pvsecondarykey.rawAddress.toString(), cbsecondarykeymax.toInt(), pcbsecondarykeyactual.rawAddress.toString(), pvprimarybookmark.rawAddress.toString(), cbprimarybookmarkmax.toInt(), pcbprimarybookmarkactual.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: MutPtr<CVoid>, cbparammax: UInt, pcbparamactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetSessionParameter(sesid.toString(), sesparamid.toInt(), pvparam.rawAddress.toString(), cbparammax.toInt(), pcbparamactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr<JetApiPtr>, szparam: MutPtr<Byte>, cbmax: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetSystemParameterA(instance.toString(), sesid.toString(), paramid.toInt(), plparam.rawAddress.toString(), szparam.rawAddress.toString(), cbmax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr<JetApiPtr>, szparam: MutPtr<UShort>, cbmax: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetSystemParameterW(instance.toString(), sesid.toString(), paramid.toInt(), plparam.rawAddress.toString(), szparam.rawAddress.toString(), cbmax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetTableColumnInfoA(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetTableColumnInfoW(sesid.toString(), tableid.toString(), szcolumnname.rawAddress.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetTableIndexInfoA(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), pvresult.rawAddress.toString(), cbresult.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetTableIndexInfoW(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), pvresult.rawAddress.toString(), cbresult.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetTableInfoA(sesid.toString(), tableid.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetTableInfoW(sesid.toString(), tableid.toString(), pvresult.rawAddress.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetThreadStats(pvresult: MutPtr<CVoid>, cbmax: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetThreadStats(pvresult.rawAddress.toString(), cbmax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA(instance.toString(), szzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW(instance.toString(), wszzlogs.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetVersion(sesid: JetSesid, pwversion: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGetVersion(sesid.toString(), pwversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: ConstPtr<CVoid>, cbbookmark: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGotoBookmark(sesid.toString(), tableid.toString(), pvbookmark.rawAddress.toString(), cbbookmark.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: ConstPtr<JetRecpos>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGotoPosition(sesid.toString(), tableid.toString(), precpos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: ConstPtr<CVoid>, cbsecondarykey: UInt, pvprimarybookmark: ConstPtr<CVoid>, cbprimarybookmark: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark(sesid.toString(), tableid.toString(), pvsecondarykey.rawAddress.toString(), cbsecondarykey.toInt(), pvprimarybookmark.rawAddress.toString(), cbprimarybookmark.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: ConstPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetGrowDatabase(sesid.toString(), dbid.toInt(), cpg.toInt(), pcpgreal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIdle(sesid: JetSesid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetIdle(sesid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: MutPtr<UInt>, crecmax: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetIndexRecordCount(sesid.toString(), tableid.toString(), pcrec.rawAddress.toString(), crecmax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit(pinstance: MutPtr<JetInstance>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetInit(pinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit2(pinstance: MutPtr<JetInstance>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetInit2(pinstance.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit3A(pinstance: MutPtr<JetInstance>, prstinfo: ConstPtr<JetRstinfoA>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetInit3A(pinstance.rawAddress.toString(), prstinfo.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit3W(pinstance: MutPtr<JetInstance>, prstinfo: ConstPtr<JetRstinfoW>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetInit3W(pinstance.rawAddress.toString(), prstinfo.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: ConstPtr<JetIndexrange>, cindexrange: UInt, precordlist: MutPtr<JetRecordlist>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetIntersectIndexes(sesid.toString(), rgindexrange.rawAddress.toString(), cindexrange.toInt(), precordlist.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetMakeKey(sesid.toString(), tableid.toString(), pvdata.rawAddress.toString(), cbdata.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetMove(sesid.toString(), tableid.toString(), crow, grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotAbort(snapid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotEnd(snapid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoA>>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA(snapid.toString(), pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoW>>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW(snapid.toString(), pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoA>>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA(snapid.toString(), pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoW>>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW(snapid.toString(), pcinstanceinfo.rawAddress.toString(), painstanceinfo.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotPrepare(psnapid: MutPtr<JetOssnapid>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotPrepare(psnapid.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(snapid.toString(), instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotThaw(snapid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(snapid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(snapid.toString(), instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>, szconnect: ConstPtr<Byte>, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenDatabaseA(sesid.toString(), szfilename.rawAddress.toString(), szconnect.rawAddress.toString(), pdbid.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>, szconnect: ConstPtr<UShort>, pdbid: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenDatabaseW(sesid.toString(), szfilename.rawAddress.toString(), szconnect.rawAddress.toString(), pdbid.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileA(szfilename: ConstPtr<Byte>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenFileA(szfilename.rawAddress.toString(), phffile.rawAddress.toString(), pulfilesizelow.rawAddress.toString(), pulfilesizehigh.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileInstanceA(instance: JetInstance, szfilename: ConstPtr<Byte>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenFileInstanceA(instance.toString(), szfilename.rawAddress.toString(), phffile.rawAddress.toString(), pulfilesizelow.rawAddress.toString(), pulfilesizehigh.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileInstanceW(instance: JetInstance, szfilename: ConstPtr<UShort>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenFileInstanceW(instance.toString(), szfilename.rawAddress.toString(), phffile.rawAddress.toString(), pulfilesizelow.rawAddress.toString(), pulfilesizehigh.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileW(szfilename: ConstPtr<UShort>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenFileW(szfilename.rawAddress.toString(), phffile.rawAddress.toString(), pulfilesizelow.rawAddress.toString(), pulfilesizehigh.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pvparameters: ConstPtr<CVoid>, cbparameters: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenTableA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pvparameters.rawAddress.toString(), cbparameters.toInt(), grbit.toInt(), ptableid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pvparameters: ConstPtr<CVoid>, cbparameters: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenTableW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), pvparameters.rawAddress.toString(), cbparameters.toInt(), grbit.toInt(), ptableid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: ConstPtr<JetColumndef>, ccolumn: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>, prgcolumnid: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenTempTable(sesid.toString(), prgcolumndef.rawAddress.toString(), ccolumn.toInt(), grbit.toInt(), ptableid.rawAddress.toString(), prgcolumnid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: ConstPtr<JetColumndef>, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>, prgcolumnid: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenTempTable2(sesid.toString(), prgcolumndef.rawAddress.toString(), ccolumn.toInt(), lcid.toInt(), grbit.toInt(), ptableid.rawAddress.toString(), prgcolumnid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: ConstPtr<JetColumndef>, ccolumn: UInt, pidxunicode: ConstPtr<JetUnicodeindex>, grbit: UInt, ptableid: MutPtr<JetTableid>, prgcolumnid: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenTempTable3(sesid.toString(), prgcolumndef.rawAddress.toString(), ccolumn.toInt(), pidxunicode.rawAddress.toString(), grbit.toInt(), ptableid.rawAddress.toString(), prgcolumnid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: ConstPtr<JetOpentemporarytable>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenTemporaryTable(sesid.toString(), popentemporarytable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: ConstPtr<JetOpentemporarytable2>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetOpenTemporaryTable2(sesid.toString(), popentemporarytable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetPrepareUpdate(sesid.toString(), tableid.toString(), prep.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: ConstPtr<JetIndexRange>, cindexranges: UInt, pcrangespreread: MutPtr<UInt>, rgcolumnidpreread: ConstPtr<UInt>, ccolumnidpreread: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetPrereadIndexRanges(sesid.toString(), tableid.toString(), rgindexranges.rawAddress.toString(), cindexranges.toInt(), pcrangespreread.rawAddress.toString(), rgcolumnidpreread.rawAddress.toString(), ccolumnidpreread.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: ConstPtr<ConstPtr<CVoid>>, rgcbkeys: ConstPtr<UInt>, ckeys: Int, pckeyspreread: MutPtr<Int>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetPrereadKeys(sesid.toString(), tableid.toString(), rgpvkeys.rawAddress.toString(), rgcbkeys.rawAddress.toString(), ckeys, pckeyspreread.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetReadFile(hffile: JetHandle, pv: MutPtr<CVoid>, cb: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetReadFile(hffile.toString(), pv.rawAddress.toString(), cb.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: MutPtr<CVoid>, cb: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetReadFileInstance(instance.toString(), hffile.toString(), pv.rawAddress.toString(), cb.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: ConstPtr<CVoid>, phcallbackid: ConstPtr<JetHandle>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRegisterCallback(sesid.toString(), tableid.toString(), cbtyp.toInt(), 0L.toString(), pvcontext.rawAddress.toString(), phcallbackid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr<Byte>, sznamenew: ConstPtr<Byte>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRenameColumnA(sesid.toString(), tableid.toString(), szname.rawAddress.toString(), sznamenew.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr<UShort>, sznamenew: ConstPtr<UShort>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRenameColumnW(sesid.toString(), tableid.toString(), szname.rawAddress.toString(), sznamenew.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: ConstPtr<Byte>, sznamenew: ConstPtr<Byte>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRenameTableA(sesid.toString(), dbid.toInt(), szname.rawAddress.toString(), sznamenew.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: ConstPtr<UShort>, sznamenew: ConstPtr<UShort>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRenameTableW(sesid.toString(), dbid.toInt(), szname.rawAddress.toString(), sznamenew.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResetSessionContext(sesid: JetSesid): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetResetSessionContext(sesid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetResetTableSequential(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetResizeDatabase(sesid.toString(), dbid.toInt(), cpgtarget.toInt(), pcpgactual.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestore2A(sz: ConstPtr<Byte>, szdest: ConstPtr<Byte>, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRestore2A(sz.rawAddress.toString(), szdest.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestore2W(sz: ConstPtr<UShort>, szdest: ConstPtr<UShort>, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRestore2W(sz.rawAddress.toString(), szdest.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreA(szsource: ConstPtr<Byte>, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRestoreA(szsource.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreInstanceA(instance: JetInstance, sz: ConstPtr<Byte>, szdest: ConstPtr<Byte>, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRestoreInstanceA(instance.toString(), sz.rawAddress.toString(), szdest.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreInstanceW(instance: JetInstance, sz: ConstPtr<UShort>, szdest: ConstPtr<UShort>, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRestoreInstanceW(instance.toString(), sz.rawAddress.toString(), szdest.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreW(szsource: ConstPtr<UShort>, pfn: JetPfnstatus): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRestoreW(szsource.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: MutPtr<CVoid>, cbdata: UInt, pcbactual: MutPtr<UInt>, grbit: UInt, pretinfo: MutPtr<JetRetinfo>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRetrieveColumn(sesid.toString(), tableid.toString(), columnid.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), pcbactual.rawAddress.toString(), grbit.toInt(), pretinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: MutPtr<JetRetrievecolumn>, cretrievecolumn: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRetrieveColumns(sesid.toString(), tableid.toString(), pretrievecolumn.rawAddress.toString(), cretrievecolumn.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: MutPtr<CVoid>, cbmax: UInt, pcbactual: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRetrieveKey(sesid.toString(), tableid.toString(), pvkey.rawAddress.toString(), cbmax.toInt(), pcbactual.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRollback(sesid: JetSesid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetRollback(sesid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSeek(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt, psetinfo: ConstPtr<JetSetinfo>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetColumn(sesid.toString(), tableid.toString(), columnid.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), grbit.toInt(), psetinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, szcolumnname: ConstPtr<Byte>, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), szcolumnname.rawAddress.toString(), pvdata.rawAddress.toString(), cbdata.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, szcolumnname: ConstPtr<UShort>, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW(sesid.toString(), dbid.toInt(), sztablename.rawAddress.toString(), szcolumnname.rawAddress.toString(), pvdata.rawAddress.toString(), cbdata.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: ConstPtr<JetSetcolumn>, csetcolumn: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetColumns(sesid.toString(), tableid.toString(), psetcolumn.rawAddress.toString(), csetcolumn.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetCurrentIndex2A(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetCurrentIndex2W(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, grbit: UInt, itagsequence: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetCurrentIndex3A(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt(), itagsequence.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, grbit: UInt, itagsequence: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetCurrentIndex3W(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), grbit.toInt(), itagsequence.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, pindexid: ConstPtr<JetIndexid>, grbit: UInt, itagsequence: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetCurrentIndex4A(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), pindexid.rawAddress.toString(), grbit.toInt(), itagsequence.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, pindexid: ConstPtr<JetIndexid>, grbit: UInt, itagsequence: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetCurrentIndex4W(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString(), pindexid.rawAddress.toString(), grbit.toInt(), itagsequence.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetCurrentIndexA(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetCurrentIndexW(sesid.toString(), tableid.toString(), szindexname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: ConstPtr<JetIndexColumn>, ccolumnfilters: UInt, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetCursorFilter(sesid.toString(), tableid.toString(), rgcolumnfilters.rawAddress.toString(), ccolumnfilters.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: ConstPtr<Byte>, cpg: UInt, pcpgreal: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetDatabaseSizeA(sesid.toString(), szdatabasename.rawAddress.toString(), cpg.toInt(), pcpgreal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: ConstPtr<UShort>, cpg: UInt, pcpgreal: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetDatabaseSizeW(sesid.toString(), szdatabasename.rawAddress.toString(), cpg.toInt(), pcpgreal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetIndexRange(sesid.toString(), tableidsrc.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetLS(sesid.toString(), tableid.toString(), ls.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetSessionContext(sesid.toString(), ulcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: ConstPtr<CVoid>, cbparam: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetSessionParameter(sesid.toString(), sesparamid.toInt(), pvparam.rawAddress.toString(), cbparam.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSystemParameterA(pinstance: MutPtr<JetInstance>, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr<Byte>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetSystemParameterA(pinstance.rawAddress.toString(), sesid.toString(), paramid.toInt(), lparam.toString(), szparam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSystemParameterW(pinstance: MutPtr<JetInstance>, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr<UShort>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetSystemParameterW(pinstance.rawAddress.toString(), sesid.toString(), paramid.toInt(), lparam.toString(), szparam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetSetTableSequential(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopBackup(): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetStopBackup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopBackupInstance(instance: JetInstance): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetStopBackupInstance(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopService(): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetStopService() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopServiceInstance(instance: JetInstance): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetStopServiceInstance(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopServiceInstance2(instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetStopServiceInstance2(instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTerm(instance: JetInstance): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetTerm(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTerm2(instance: JetInstance, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetTerm2(instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTruncateLog(): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetTruncateLog() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTruncateLogInstance(instance: JetInstance): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetTruncateLogInstance(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUnregisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, hcallbackid: JetHandle): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetUnregisterCallback(sesid.toString(), tableid.toString(), cbtyp.toInt(), hcallbackid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr<CVoid>, cbbookmark: UInt, pcbactual: MutPtr<UInt>): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetUpdate(sesid.toString(), tableid.toString(), pvbookmark.rawAddress.toString(), cbbookmark.toInt(), pcbactual.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr<CVoid>, cbbookmark: UInt, pcbactual: MutPtr<UInt>, grbit: UInt): Int =
    if (windowsWin32StorageJetNapiAddon != null) (windowsWin32StorageJetNapiAddon.windowssysWindowsWin32StorageJetJetUpdate2(sesid.toString(), tableid.toString(), pvbookmark.rawAddress.toString(), cbbookmark.toInt(), pcbactual.rawAddress.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
