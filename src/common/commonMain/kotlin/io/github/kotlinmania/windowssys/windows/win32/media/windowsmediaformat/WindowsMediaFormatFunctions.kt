package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun wMCreateBackupRestorer(pcallback: MutPtr<CVoid>, ppbackup: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wMCreateEditor(ppeditor: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wMCreateIndexer(ppindexer: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wMCreateProfileManager(ppprofilemanager: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wMCreateReader(punkcert: MutPtr<CVoid>, dwrights: UInt, ppreader: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wMCreateSyncReader(punkcert: MutPtr<CVoid>, dwrights: UInt, ppsyncreader: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wMCreateWriter(punkcert: MutPtr<CVoid>, ppwriter: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wMCreateWriterFileSink(ppsink: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wMCreateWriterNetworkSink(ppsink: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wMCreateWriterPushSink(ppsink: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: MutPtr<Bool>): Hresult
