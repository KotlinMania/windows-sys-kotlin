package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun wMCreateBackupRestorer(pcallback: MutPtr, ppbackup: MutPtr): Hresult

public expect fun wMCreateEditor(ppeditor: MutPtr): Hresult

public expect fun wMCreateIndexer(ppindexer: MutPtr): Hresult

public expect fun wMCreateProfileManager(ppprofilemanager: MutPtr): Hresult

public expect fun wMCreateReader(punkcert: MutPtr, dwrights: UInt, ppreader: MutPtr): Hresult

public expect fun wMCreateSyncReader(punkcert: MutPtr, dwrights: UInt, ppsyncreader: MutPtr): Hresult

public expect fun wMCreateWriter(punkcert: MutPtr, ppwriter: MutPtr): Hresult

public expect fun wMCreateWriterFileSink(ppsink: MutPtr): Hresult

public expect fun wMCreateWriterNetworkSink(ppsink: MutPtr): Hresult

public expect fun wMCreateWriterPushSink(ppsink: MutPtr): Hresult

public expect fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: MutPtr): Hresult
