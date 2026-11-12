@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfoheader
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Paletteentry
import io.github.kotlinmania.windowssys.windows.win32.media.Htask
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIBuildFilterA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIBuildFilterW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIClearClipboard
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileAddRef
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileEndRecord
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileExit
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileGetStream
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileInfoA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileInfoW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileInit
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileOpenA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileOpenW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileReadData
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileRelease
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIFileWriteData
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIGetFromClipboard
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIMakeCompressedStream
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIMakeFileFromStreams
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIMakeStreamFromClipboard
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIPutFileOnClipboard
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVISaveA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVISaveOptions
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVISaveOptionsFree
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVISaveVA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVISaveVW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVISaveW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamAddRef
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamBeginStreaming
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamCreate
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamEndStreaming
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamFindSample
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrame
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameClose
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameOpen
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamInfoA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamInfoW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamLength
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamRead
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamReadData
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamReadFormat
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamRelease
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamSampleToTime
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamSetFormat
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamStart
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamTimeToSample
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamWrite
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaAVIStreamWriteData
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaCloseDriver
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaCreateEditableStream
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDefDriverProc
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibBegin
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibChangePalette
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibClose
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibDraw
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibEnd
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibGetBuffer
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibGetPalette
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibOpen
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibProfileDisplay
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibRealize
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibSetPalette
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibStart
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibStop
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrawDibTime
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDriverCallback
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaDrvGetModuleHandle
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaEditStreamClone
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaEditStreamCopy
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaEditStreamCut
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaEditStreamPaste
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaEditStreamSetInfoA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaEditStreamSetInfoW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaEditStreamSetNameA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaEditStreamSetNameW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaGetDriverModuleHandle
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICClose
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICCompress
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICCompressorChoose
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICCompressorFree
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICDecompress
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICDraw
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICDrawBegin
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICGetDisplayFormat
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICGetInfo
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICImageCompress
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICImageDecompress
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICInfo
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICInstall
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICLocate
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICOpen
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICRemove
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICSendMessage
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICSeqCompressFrame
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICSeqCompressFrameEnd
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaICSeqCompressFrameStart
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaJoyGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaJoyGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaJoyGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaJoyGetPos
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaJoyGetPosEx
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaJoyGetThreshold
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaJoyReleaseCapture
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaJoySetCapture
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaJoySetThreshold
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMCIWndCreateA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMCIWndCreateW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMCIWndRegisterClass
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciDriverNotify
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciDriverYield
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciFreeCommandResource
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciGetCreatorTask
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciGetDriverData
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciGetErrorStringA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciGetErrorStringW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciLoadCommandResource
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciSendCommandA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciSendCommandW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciSendStringA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciSendStringW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciSetDriverData
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMciSetYieldProc
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmDrvInstall
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmGetCurrentTask
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmTaskBlock
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmTaskCreate
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmTaskSignal
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmTaskYield
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioAdvance
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioAscend
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioClose
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioCreateChunk
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioDescend
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioFlush
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioGetInfo
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioOpenA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioOpenW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioRead
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioRenameA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioRenameW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioSeek
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioSendMessage
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioSetBuffer
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioSetInfo
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCA
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCW
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaMmioWrite
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaOpenDriver
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaSendDriverMessage
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaSndOpenSound
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssysWindowsWin32MediaMultimediaVideoForWindowsVersion
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.Openfilenamea
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.Openfilenamew
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIBuildFilterA(lpszfilter.rawAddress.toCPointer<ByteVar>(), cbfilter, fsaving)

public actual fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIBuildFilterW(lpszfilter.rawAddress.toCPointer<ByteVar>(), cbfilter, fsaving)

public actual fun aVIClearClipboard(): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIClearClipboard()

public actual fun aVIFileAddRef(pfile: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32MediaMultimediaAVIFileAddRef(pfile.rawAddress.toCPointer<ByteVar>())

public actual fun aVIFileCreateStreamA(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, psi: ConstPtr<Avistreaminfoa>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamA(pfile.rawAddress.toCPointer<ByteVar>(), ppavi.rawAddress.toCPointer<ByteVar>(), psi.rawAddress.toCPointer<ByteVar>())

public actual fun aVIFileCreateStreamW(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, psi: ConstPtr<Avistreaminfow>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamW(pfile.rawAddress.toCPointer<ByteVar>(), ppavi.rawAddress.toCPointer<ByteVar>(), psi.rawAddress.toCPointer<ByteVar>())

public actual fun aVIFileEndRecord(pfile: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIFileEndRecord(pfile.rawAddress.toCPointer<ByteVar>())

public actual fun aVIFileExit() {
    windowssysWindowsWin32MediaMultimediaAVIFileExit()
}

public actual fun aVIFileGetStream(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, fcctype: UInt, lparam: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIFileGetStream(pfile.rawAddress.toCPointer<ByteVar>(), ppavi.rawAddress.toCPointer<ByteVar>(), fcctype, lparam)

public actual fun aVIFileInfoA(pfile: MutPtr<CVoid>, pfi: MutPtr<Avifileinfoa>, lsize: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIFileInfoA(pfile.rawAddress.toCPointer<ByteVar>(), pfi.rawAddress.toCPointer<ByteVar>(), lsize)

public actual fun aVIFileInfoW(pfile: MutPtr<CVoid>, pfi: MutPtr<Avifileinfow>, lsize: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIFileInfoW(pfile.rawAddress.toCPointer<ByteVar>(), pfi.rawAddress.toCPointer<ByteVar>(), lsize)

public actual fun aVIFileInit() {
    windowssysWindowsWin32MediaMultimediaAVIFileInit()
}

public actual fun aVIFileOpenA(ppfile: MutPtr<MutPtr<CVoid>>, szfile: Pcstr, umode: UInt, lphandler: ConstPtr<Guid>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIFileOpenA(ppfile.rawAddress.toCPointer<ByteVar>(), szfile.rawAddress.toCPointer<ByteVar>(), umode, lphandler.rawAddress.toCPointer<ByteVar>())

public actual fun aVIFileOpenW(ppfile: MutPtr<MutPtr<CVoid>>, szfile: Pcwstr, umode: UInt, lphandler: ConstPtr<Guid>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIFileOpenW(ppfile.rawAddress.toCPointer<ByteVar>(), szfile.rawAddress.toCPointer<ByteVar>(), umode, lphandler.rawAddress.toCPointer<ByteVar>())

public actual fun aVIFileReadData(pfile: MutPtr<CVoid>, ckid: UInt, lpdata: MutPtr<CVoid>, lpcbdata: MutPtr<Int>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIFileReadData(pfile.rawAddress.toCPointer<ByteVar>(), ckid, lpdata.rawAddress.toCPointer<ByteVar>(), lpcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun aVIFileRelease(pfile: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32MediaMultimediaAVIFileRelease(pfile.rawAddress.toCPointer<ByteVar>())

public actual fun aVIFileWriteData(pfile: MutPtr<CVoid>, ckid: UInt, lpdata: ConstPtr<CVoid>, cbdata: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIFileWriteData(pfile.rawAddress.toCPointer<ByteVar>(), ckid, lpdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun aVIGetFromClipboard(lppf: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIGetFromClipboard(lppf.rawAddress.toCPointer<ByteVar>())

public actual fun aVIMakeCompressedStream(ppscompressed: MutPtr<MutPtr<CVoid>>, ppssource: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, pclsidhandler: ConstPtr<Guid>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIMakeCompressedStream(ppscompressed.rawAddress.toCPointer<ByteVar>(), ppssource.rawAddress.toCPointer<ByteVar>(), lpoptions.rawAddress.toCPointer<ByteVar>(), pclsidhandler.rawAddress.toCPointer<ByteVar>())

public actual fun aVIMakeFileFromStreams(ppfile: MutPtr<MutPtr<CVoid>>, nstreams: Int, papstreams: ConstPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIMakeFileFromStreams(ppfile.rawAddress.toCPointer<ByteVar>(), nstreams, papstreams.rawAddress.toCPointer<ByteVar>())

public actual fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIMakeStreamFromClipboard(cfformat, hglobal.rawAddress.toCPointer<ByteVar>(), ppstream.rawAddress.toCPointer<ByteVar>())

public actual fun aVIPutFileOnClipboard(pf: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIPutFileOnClipboard(pf.rawAddress.toCPointer<ByteVar>())

public actual fun aVISaveA(szfile: Pcstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, vararg variadicArgs: Long): Hresult =
    windowssysWindowsWin32MediaMultimediaAVISaveA(szfile.rawAddress.toCPointer<ByteVar>(), pclsidhandler.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), nstreams, pfile.rawAddress.toCPointer<ByteVar>(), lpoptions.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: MutPtr<MutPtr<Avicompressoptions>>): Long =
    windowssysWindowsWin32MediaMultimediaAVISaveOptions(hwnd.rawAddress.toCPointer<ByteVar>(), uiflags, nstreams, ppavi.rawAddress.toCPointer<ByteVar>(), plpoptions.rawAddress.toCPointer<ByteVar>())

public actual fun aVISaveOptionsFree(nstreams: Int, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVISaveOptionsFree(nstreams, plpoptions.rawAddress.toCPointer<ByteVar>())

public actual fun aVISaveVA(szfile: Pcstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVISaveVA(szfile.rawAddress.toCPointer<ByteVar>(), pclsidhandler.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), nstreams, ppavi.rawAddress.toCPointer<ByteVar>(), plpoptions.rawAddress.toCPointer<ByteVar>())

public actual fun aVISaveVW(szfile: Pcwstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVISaveVW(szfile.rawAddress.toCPointer<ByteVar>(), pclsidhandler.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), nstreams, ppavi.rawAddress.toCPointer<ByteVar>(), plpoptions.rawAddress.toCPointer<ByteVar>())

public actual fun aVISaveW(szfile: Pcwstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, vararg variadicArgs: Long): Hresult =
    windowssysWindowsWin32MediaMultimediaAVISaveW(szfile.rawAddress.toCPointer<ByteVar>(), pclsidhandler.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), nstreams, pfile.rawAddress.toCPointer<ByteVar>(), lpoptions.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aVIStreamAddRef(pavi: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32MediaMultimediaAVIStreamAddRef(pavi.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamBeginStreaming(pavi: MutPtr<CVoid>, lstart: Int, lend: Int, lrate: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamBeginStreaming(pavi.rawAddress.toCPointer<ByteVar>(), lstart, lend, lrate)

public actual fun aVIStreamCreate(ppavi: MutPtr<MutPtr<CVoid>>, lparam1: Int, lparam2: Int, pclsidhandler: ConstPtr<Guid>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamCreate(ppavi.rawAddress.toCPointer<ByteVar>(), lparam1, lparam2, pclsidhandler.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamEndStreaming(pavi: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamEndStreaming(pavi.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamFindSample(pavi: MutPtr<CVoid>, lpos: Int, lflags: Int): Int =
    windowssysWindowsWin32MediaMultimediaAVIStreamFindSample(pavi.rawAddress.toCPointer<ByteVar>(), lpos, lflags)

public actual fun aVIStreamGetFrame(pg: MutPtr<CVoid>, lpos: Int): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32MediaMultimediaAVIStreamGetFrame(pg.rawAddress.toCPointer<ByteVar>(), lpos)?.toLong() ?: 0L)

public actual fun aVIStreamGetFrameClose(pg: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameClose(pg.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamGetFrameOpen(pavi: MutPtr<CVoid>, lpbiwanted: ConstPtr<Bitmapinfoheader>): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameOpen(pavi.rawAddress.toCPointer<ByteVar>(), lpbiwanted.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun aVIStreamInfoA(pavi: MutPtr<CVoid>, psi: MutPtr<Avistreaminfoa>, lsize: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamInfoA(pavi.rawAddress.toCPointer<ByteVar>(), psi.rawAddress.toCPointer<ByteVar>(), lsize)

public actual fun aVIStreamInfoW(pavi: MutPtr<CVoid>, psi: MutPtr<Avistreaminfow>, lsize: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamInfoW(pavi.rawAddress.toCPointer<ByteVar>(), psi.rawAddress.toCPointer<ByteVar>(), lsize)

public actual fun aVIStreamLength(pavi: MutPtr<CVoid>): Int =
    windowssysWindowsWin32MediaMultimediaAVIStreamLength(pavi.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamOpenFromFileA(ppavi: MutPtr<MutPtr<CVoid>>, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr<Guid>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileA(ppavi.rawAddress.toCPointer<ByteVar>(), szfile.rawAddress.toCPointer<ByteVar>(), fcctype, lparam, mode, pclsidhandler.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamOpenFromFileW(ppavi: MutPtr<MutPtr<CVoid>>, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr<Guid>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileW(ppavi.rawAddress.toCPointer<ByteVar>(), szfile.rawAddress.toCPointer<ByteVar>(), fcctype, lparam, mode, pclsidhandler.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamRead(pavi: MutPtr<CVoid>, lstart: Int, lsamples: Int, lpbuffer: MutPtr<CVoid>, cbbuffer: Int, plbytes: MutPtr<Int>, plsamples: MutPtr<Int>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamRead(pavi.rawAddress.toCPointer<ByteVar>(), lstart, lsamples, lpbuffer.rawAddress.toCPointer<ByteVar>(), cbbuffer, plbytes.rawAddress.toCPointer<ByteVar>(), plsamples.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamReadData(pavi: MutPtr<CVoid>, fcc: UInt, lp: MutPtr<CVoid>, lpcb: MutPtr<Int>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamReadData(pavi.rawAddress.toCPointer<ByteVar>(), fcc, lp.rawAddress.toCPointer<ByteVar>(), lpcb.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamReadFormat(pavi: MutPtr<CVoid>, lpos: Int, lpformat: MutPtr<CVoid>, lpcbformat: MutPtr<Int>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamReadFormat(pavi.rawAddress.toCPointer<ByteVar>(), lpos, lpformat.rawAddress.toCPointer<ByteVar>(), lpcbformat.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamRelease(pavi: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32MediaMultimediaAVIStreamRelease(pavi.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamSampleToTime(pavi: MutPtr<CVoid>, lsample: Int): Int =
    windowssysWindowsWin32MediaMultimediaAVIStreamSampleToTime(pavi.rawAddress.toCPointer<ByteVar>(), lsample)

public actual fun aVIStreamSetFormat(pavi: MutPtr<CVoid>, lpos: Int, lpformat: ConstPtr<CVoid>, cbformat: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamSetFormat(pavi.rawAddress.toCPointer<ByteVar>(), lpos, lpformat.rawAddress.toCPointer<ByteVar>(), cbformat)

public actual fun aVIStreamStart(pavi: MutPtr<CVoid>): Int =
    windowssysWindowsWin32MediaMultimediaAVIStreamStart(pavi.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamTimeToSample(pavi: MutPtr<CVoid>, ltime: Int): Int =
    windowssysWindowsWin32MediaMultimediaAVIStreamTimeToSample(pavi.rawAddress.toCPointer<ByteVar>(), ltime)

public actual fun aVIStreamWrite(pavi: MutPtr<CVoid>, lstart: Int, lsamples: Int, lpbuffer: ConstPtr<CVoid>, cbbuffer: Int, dwflags: UInt, plsampwritten: MutPtr<Int>, plbyteswritten: MutPtr<Int>): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamWrite(pavi.rawAddress.toCPointer<ByteVar>(), lstart, lsamples, lpbuffer.rawAddress.toCPointer<ByteVar>(), cbbuffer, dwflags, plsampwritten.rawAddress.toCPointer<ByteVar>(), plbyteswritten.rawAddress.toCPointer<ByteVar>())

public actual fun aVIStreamWriteData(pavi: MutPtr<CVoid>, fcc: UInt, lp: ConstPtr<CVoid>, cb: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaAVIStreamWriteData(pavi.rawAddress.toCPointer<ByteVar>(), fcc, lp.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult =
    windowssysWindowsWin32MediaMultimediaCloseDriver(hdriver.rawAddress.toCPointer<ByteVar>(), lparam1, lparam2)

public actual fun createEditableStream(ppseditable: MutPtr<MutPtr<CVoid>>, pssource: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32MediaMultimediaCreateEditableStream(ppseditable.rawAddress.toCPointer<ByteVar>(), pssource.rawAddress.toCPointer<ByteVar>())

public actual fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    windowssysWindowsWin32MediaMultimediaDefDriverProc(dwdriveridentifier, hdrvr.rawAddress.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaDrawDibBegin(hdd, hdc.rawAddress.toCPointer<ByteVar>(), dxdst, dydst, lpbi.rawAddress.toCPointer<ByteVar>(), dxsrc, dysrc, wflags)

public actual fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: ConstPtr<Paletteentry>): Bool =
    windowssysWindowsWin32MediaMultimediaDrawDibChangePalette(hdd, istart, ilen, lppe.rawAddress.toCPointer<ByteVar>())

public actual fun drawDibClose(hdd: Long): Bool =
    windowssysWindowsWin32MediaMultimediaDrawDibClose(hdd)

public actual fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, lpbits: ConstPtr<CVoid>, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaDrawDibDraw(hdd, hdc.rawAddress.toCPointer<ByteVar>(), xdst, ydst, dxdst, dydst, lpbi.rawAddress.toCPointer<ByteVar>(), lpbits.rawAddress.toCPointer<ByteVar>(), xsrc, ysrc, dxsrc, dysrc, wflags)

public actual fun drawDibEnd(hdd: Long): Bool =
    windowssysWindowsWin32MediaMultimediaDrawDibEnd(hdd)

public actual fun drawDibGetBuffer(hdd: Long, lpbi: MutPtr<Bitmapinfoheader>, dwsize: UInt, dwflags: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32MediaMultimediaDrawDibGetBuffer(hdd, lpbi.rawAddress.toCPointer<ByteVar>(), dwsize, dwflags)?.toLong() ?: 0L)

public actual fun drawDibGetPalette(hdd: Long): Hpalette =
    MutPtr(windowssysWindowsWin32MediaMultimediaDrawDibGetPalette(hdd)?.toLong() ?: 0L)

public actual fun drawDibOpen(): Long =
    windowssysWindowsWin32MediaMultimediaDrawDibOpen()

public actual fun drawDibProfileDisplay(lpbi: ConstPtr<Bitmapinfoheader>): Lresult =
    windowssysWindowsWin32MediaMultimediaDrawDibProfileDisplay(lpbi.rawAddress.toCPointer<ByteVar>())

public actual fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt =
    windowssysWindowsWin32MediaMultimediaDrawDibRealize(hdd, hdc.rawAddress.toCPointer<ByteVar>(), fbackground)

public actual fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool =
    windowssysWindowsWin32MediaMultimediaDrawDibSetPalette(hdd, hpal.rawAddress.toCPointer<ByteVar>())

public actual fun drawDibStart(hdd: Long, rate: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaDrawDibStart(hdd, rate)

public actual fun drawDibStop(hdd: Long): Bool =
    windowssysWindowsWin32MediaMultimediaDrawDibStop(hdd)

public actual fun drawDibTime(hdd: Long, lpddtime: MutPtr<Drawdibtime>): Bool =
    windowssysWindowsWin32MediaMultimediaDrawDibTime(hdd, lpddtime.rawAddress.toCPointer<ByteVar>())

public actual fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool =
    windowssysWindowsWin32MediaMultimediaDriverCallback(dwcallback, dwflags, hdevice.rawAddress.toCPointer<ByteVar>(), dwmsg, dwuser, dwparam1, dwparam2)

public actual fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule =
    MutPtr(windowssysWindowsWin32MediaMultimediaDrvGetModuleHandle(hdriver.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun editStreamClone(pavi: MutPtr<CVoid>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaMultimediaEditStreamClone(pavi.rawAddress.toCPointer<ByteVar>(), ppresult.rawAddress.toCPointer<ByteVar>())

public actual fun editStreamCopy(pavi: MutPtr<CVoid>, plstart: MutPtr<Int>, pllength: MutPtr<Int>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaMultimediaEditStreamCopy(pavi.rawAddress.toCPointer<ByteVar>(), plstart.rawAddress.toCPointer<ByteVar>(), pllength.rawAddress.toCPointer<ByteVar>(), ppresult.rawAddress.toCPointer<ByteVar>())

public actual fun editStreamCut(pavi: MutPtr<CVoid>, plstart: MutPtr<Int>, pllength: MutPtr<Int>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaMultimediaEditStreamCut(pavi.rawAddress.toCPointer<ByteVar>(), plstart.rawAddress.toCPointer<ByteVar>(), pllength.rawAddress.toCPointer<ByteVar>(), ppresult.rawAddress.toCPointer<ByteVar>())

public actual fun editStreamPaste(pavi: MutPtr<CVoid>, plpos: MutPtr<Int>, pllength: MutPtr<Int>, pstream: MutPtr<CVoid>, lstart: Int, lend: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaEditStreamPaste(pavi.rawAddress.toCPointer<ByteVar>(), plpos.rawAddress.toCPointer<ByteVar>(), pllength.rawAddress.toCPointer<ByteVar>(), pstream.rawAddress.toCPointer<ByteVar>(), lstart, lend)

public actual fun editStreamSetInfoA(pavi: MutPtr<CVoid>, lpinfo: ConstPtr<Avistreaminfoa>, cbinfo: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaEditStreamSetInfoA(pavi.rawAddress.toCPointer<ByteVar>(), lpinfo.rawAddress.toCPointer<ByteVar>(), cbinfo)

public actual fun editStreamSetInfoW(pavi: MutPtr<CVoid>, lpinfo: ConstPtr<Avistreaminfow>, cbinfo: Int): Hresult =
    windowssysWindowsWin32MediaMultimediaEditStreamSetInfoW(pavi.rawAddress.toCPointer<ByteVar>(), lpinfo.rawAddress.toCPointer<ByteVar>(), cbinfo)

public actual fun editStreamSetNameA(pavi: MutPtr<CVoid>, lpszname: Pcstr): Hresult =
    windowssysWindowsWin32MediaMultimediaEditStreamSetNameA(pavi.rawAddress.toCPointer<ByteVar>(), lpszname.rawAddress.toCPointer<ByteVar>())

public actual fun editStreamSetNameW(pavi: MutPtr<CVoid>, lpszname: Pcwstr): Hresult =
    windowssysWindowsWin32MediaMultimediaEditStreamSetNameW(pavi.rawAddress.toCPointer<ByteVar>(), lpszname.rawAddress.toCPointer<ByteVar>())

public actual fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule =
    MutPtr(windowssysWindowsWin32MediaMultimediaGetDriverModuleHandle(hdriver.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getOpenFileNamePreviewA(lpofn: MutPtr<Openfilenamea>): Bool =
    windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewA(lpofn.rawAddress.toCPointer<ByteVar>())

public actual fun getOpenFileNamePreviewW(lpofn: MutPtr<Openfilenamew>): Bool =
    windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewW(lpofn.rawAddress.toCPointer<ByteVar>())

public actual fun getSaveFileNamePreviewA(lpofn: MutPtr<Openfilenamea>): Bool =
    windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewA(lpofn.rawAddress.toCPointer<ByteVar>())

public actual fun getSaveFileNamePreviewW(lpofn: MutPtr<Openfilenamew>): Bool =
    windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewW(lpofn.rawAddress.toCPointer<ByteVar>())

public actual fun iCClose(hic: Hic): Lresult =
    windowssysWindowsWin32MediaMultimediaICClose(hic.rawAddress.toCPointer<ByteVar>())

public actual fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: ConstPtr<Bitmapinfoheader>, lpdata: MutPtr<CVoid>, lpbiinput: ConstPtr<Bitmapinfoheader>, lpbits: ConstPtr<CVoid>, lpckid: MutPtr<UInt>, lpdwflags: MutPtr<UInt>, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: ConstPtr<Bitmapinfoheader>, lpprev: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32MediaMultimediaICCompress(hic.rawAddress.toCPointer<ByteVar>(), dwflags, lpbioutput.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), lpbiinput.rawAddress.toCPointer<ByteVar>(), lpbits.rawAddress.toCPointer<ByteVar>(), lpckid.rawAddress.toCPointer<ByteVar>(), lpdwflags.rawAddress.toCPointer<ByteVar>(), lframenum, dwframesize, dwquality, lpbiprev.rawAddress.toCPointer<ByteVar>(), lpprev.rawAddress.toCPointer<ByteVar>())

public actual fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: ConstPtr<CVoid>, lpdata: ConstPtr<CVoid>, pc: MutPtr<Compvars>, lpsztitle: Pcstr): Bool =
    windowssysWindowsWin32MediaMultimediaICCompressorChoose(hwnd.rawAddress.toCPointer<ByteVar>(), uiflags, pvin.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), pc.rawAddress.toCPointer<ByteVar>(), lpsztitle.rawAddress.toCPointer<ByteVar>())

public actual fun iCCompressorFree(pc: ConstPtr<Compvars>) {
    windowssysWindowsWin32MediaMultimediaICCompressorFree(pc.rawAddress.toCPointer<ByteVar>())
}

public actual fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: ConstPtr<Bitmapinfoheader>, lpdata: ConstPtr<CVoid>, lpbi: ConstPtr<Bitmapinfoheader>, lpbits: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32MediaMultimediaICDecompress(hic.rawAddress.toCPointer<ByteVar>(), dwflags, lpbiformat.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), lpbi.rawAddress.toCPointer<ByteVar>(), lpbits.rawAddress.toCPointer<ByteVar>())

public actual fun iCDraw(hic: Hic, dwflags: UInt, lpformat: ConstPtr<CVoid>, lpdata: ConstPtr<CVoid>, cbdata: UInt, ltime: Int): UInt =
    windowssysWindowsWin32MediaMultimediaICDraw(hic.rawAddress.toCPointer<ByteVar>(), dwflags, lpformat.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), cbdata, ltime)

public actual fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaICDrawBegin(hic.rawAddress.toCPointer<ByteVar>(), dwflags, hpal.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), hdc.rawAddress.toCPointer<ByteVar>(), xdst, ydst, dxdst, dydst, lpbi.rawAddress.toCPointer<ByteVar>(), xsrc, ysrc, dxsrc, dysrc, dwrate, dwscale)

public actual fun iCGetDisplayFormat(hic: Hic, lpbiin: ConstPtr<Bitmapinfoheader>, lpbiout: MutPtr<Bitmapinfoheader>, bitdepth: Int, dx: Int, dy: Int): Hic =
    MutPtr(windowssysWindowsWin32MediaMultimediaICGetDisplayFormat(hic.rawAddress.toCPointer<ByteVar>(), lpbiin.rawAddress.toCPointer<ByteVar>(), lpbiout.rawAddress.toCPointer<ByteVar>(), bitdepth, dx, dy)?.toLong() ?: 0L)

public actual fun iCGetInfo(hic: Hic, picinfo: MutPtr<Icinfo>, cb: UInt): Lresult =
    windowssysWindowsWin32MediaMultimediaICGetInfo(hic.rawAddress.toCPointer<ByteVar>(), picinfo.rawAddress.toCPointer<ByteVar>(), cb)

public actual fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr<Bitmapinfo>, lpbits: ConstPtr<CVoid>, lpbiout: ConstPtr<Bitmapinfo>, lquality: Int, plsize: MutPtr<Int>): Handle =
    MutPtr(windowssysWindowsWin32MediaMultimediaICImageCompress(hic.rawAddress.toCPointer<ByteVar>(), uiflags, lpbiin.rawAddress.toCPointer<ByteVar>(), lpbits.rawAddress.toCPointer<ByteVar>(), lpbiout.rawAddress.toCPointer<ByteVar>(), lquality, plsize.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr<Bitmapinfo>, lpbits: ConstPtr<CVoid>, lpbiout: ConstPtr<Bitmapinfo>): Handle =
    MutPtr(windowssysWindowsWin32MediaMultimediaICImageDecompress(hic.rawAddress.toCPointer<ByteVar>(), uiflags, lpbiin.rawAddress.toCPointer<ByteVar>(), lpbits.rawAddress.toCPointer<ByteVar>(), lpbiout.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: MutPtr<Icinfo>): Bool =
    windowssysWindowsWin32MediaMultimediaICInfo(fcctype, fcchandler, lpicinfo.rawAddress.toCPointer<ByteVar>())

public actual fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaICInstall(fcctype, fcchandler, lparam, szdesc.rawAddress.toCPointer<ByteVar>(), wflags)

public actual fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: ConstPtr<Bitmapinfoheader>, lpbiout: ConstPtr<Bitmapinfoheader>, wflags: UShort): Hic =
    MutPtr(windowssysWindowsWin32MediaMultimediaICLocate(fcctype, fcchandler, lpbiin.rawAddress.toCPointer<ByteVar>(), lpbiout.rawAddress.toCPointer<ByteVar>(), wflags)?.toLong() ?: 0L)

public actual fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic =
    MutPtr(windowssysWindowsWin32MediaMultimediaICOpen(fcctype, fcchandler, wmode)?.toLong() ?: 0L)

public actual fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic =
    MutPtr(0L)

public actual fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaICRemove(fcctype, fcchandler, wflags)

public actual fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult =
    windowssysWindowsWin32MediaMultimediaICSendMessage(hic.rawAddress.toCPointer<ByteVar>(), msg, dw1, dw2)

public actual fun iCSeqCompressFrame(pc: ConstPtr<Compvars>, uiflags: UInt, lpbits: ConstPtr<CVoid>, pfkey: MutPtr<Bool>, plsize: MutPtr<Int>): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32MediaMultimediaICSeqCompressFrame(pc.rawAddress.toCPointer<ByteVar>(), uiflags, lpbits.rawAddress.toCPointer<ByteVar>(), pfkey.rawAddress.toCPointer<ByteVar>(), plsize.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iCSeqCompressFrameEnd(pc: ConstPtr<Compvars>) {
    windowssysWindowsWin32MediaMultimediaICSeqCompressFrameEnd(pc.rawAddress.toCPointer<ByteVar>())
}

public actual fun iCSeqCompressFrameStart(pc: ConstPtr<Compvars>, lpbiin: ConstPtr<Bitmapinfo>): Bool =
    windowssysWindowsWin32MediaMultimediaICSeqCompressFrameStart(pc.rawAddress.toCPointer<ByteVar>(), lpbiin.rawAddress.toCPointer<ByteVar>())

public actual fun mCIWndCreateA(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcstr): Hwnd =
    MutPtr(windowssysWindowsWin32MediaMultimediaMCIWndCreateA(hwndparent.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>(), dwstyle, szfile.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mCIWndCreateW(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcwstr): Hwnd =
    MutPtr(windowssysWindowsWin32MediaMultimediaMCIWndCreateW(hwndparent.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>(), dwstyle, szfile.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mCIWndRegisterClass(): Bool =
    windowssysWindowsWin32MediaMultimediaMCIWndRegisterClass()

public actual fun openDriver(szdrivername: Pcwstr, szsectionname: Pcwstr, lparam2: Lparam): Hdrvr =
    MutPtr(windowssysWindowsWin32MediaMultimediaOpenDriver(szdrivername.rawAddress.toCPointer<ByteVar>(), szsectionname.rawAddress.toCPointer<ByteVar>(), lparam2)?.toLong() ?: 0L)

public actual fun sendDriverMessage(hdriver: Hdrvr, message: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    windowssysWindowsWin32MediaMultimediaSendDriverMessage(hdriver.rawAddress.toCPointer<ByteVar>(), message, lparam1, lparam2)

public actual fun videoForWindowsVersion(): UInt =
    windowssysWindowsWin32MediaMultimediaVideoForWindowsVersion()

public actual fun capCreateCaptureWindowA(lpszwindowname: Pcstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    MutPtr(windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowA(lpszwindowname.rawAddress.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent.rawAddress.toCPointer<ByteVar>(), nid)?.toLong() ?: 0L)

public actual fun capCreateCaptureWindowW(lpszwindowname: Pcwstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    MutPtr(windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowW(lpszwindowname.rawAddress.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent.rawAddress.toCPointer<ByteVar>(), nid)?.toLong() ?: 0L)

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: Pstr, cbname: Int, lpszver: Pstr, cbver: Int): Bool =
    windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionA(wdriverindex, lpszname.rawAddress.toCPointer<ByteVar>(), cbname, lpszver.rawAddress.toCPointer<ByteVar>(), cbver)

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: Pwstr, cbname: Int, lpszver: Pwstr, cbver: Int): Bool =
    windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionW(wdriverindex, lpszname.rawAddress.toCPointer<ByteVar>(), cbname, lpszver.rawAddress.toCPointer<ByteVar>(), cbver)

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: MutPtr<Joycapsa>, cbjc: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaJoyGetDevCapsA(ujoyid, pjc.rawAddress.toCPointer<ByteVar>(), cbjc)

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: MutPtr<Joycapsw>, cbjc: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaJoyGetDevCapsW(ujoyid, pjc.rawAddress.toCPointer<ByteVar>(), cbjc)

public actual fun joyGetNumDevs(): UInt =
    windowssysWindowsWin32MediaMultimediaJoyGetNumDevs()

public actual fun joyGetPos(ujoyid: UInt, pji: MutPtr<Joyinfo>): UInt =
    windowssysWindowsWin32MediaMultimediaJoyGetPos(ujoyid, pji.rawAddress.toCPointer<ByteVar>())

public actual fun joyGetPosEx(ujoyid: UInt, pji: MutPtr<Joyinfoex>): UInt =
    windowssysWindowsWin32MediaMultimediaJoyGetPosEx(ujoyid, pji.rawAddress.toCPointer<ByteVar>())

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: MutPtr<UInt>): UInt =
    windowssysWindowsWin32MediaMultimediaJoyGetThreshold(ujoyid, puthreshold.rawAddress.toCPointer<ByteVar>())

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaJoyReleaseCapture(ujoyid)

public actual fun joySetCapture(hwnd: Hwnd, ujoyid: UInt, uperiod: UInt, fchanged: Bool): UInt =
    windowssysWindowsWin32MediaMultimediaJoySetCapture(hwnd.rawAddress.toCPointer<ByteVar>(), ujoyid, uperiod, fchanged)

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaJoySetThreshold(ujoyid, uthreshold)

public actual fun mciDriverNotify(hwndcallback: Handle, wdeviceid: UInt, ustatus: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaMciDriverNotify(hwndcallback.rawAddress.toCPointer<ByteVar>(), wdeviceid, ustatus)

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMciDriverYield(wdeviceid)

public actual fun mciFreeCommandResource(wtable: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaMciFreeCommandResource(wtable)

public actual fun mciGetCreatorTask(mciid: UInt): Htask =
    MutPtr(windowssysWindowsWin32MediaMultimediaMciGetCreatorTask(mciid)?.toLong() ?: 0L)

public actual fun mciGetDeviceIDA(pszdevice: Pcstr): UInt =
    windowssysWindowsWin32MediaMultimediaMciGetDeviceIDA(pszdevice.rawAddress.toCPointer<ByteVar>())

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: Pcstr): UInt =
    windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDA(dwelementid, lpstrtype.rawAddress.toCPointer<ByteVar>())

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: Pcwstr): UInt =
    windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDW(dwelementid, lpstrtype.rawAddress.toCPointer<ByteVar>())

public actual fun mciGetDeviceIDW(pszdevice: Pcwstr): UInt =
    windowssysWindowsWin32MediaMultimediaMciGetDeviceIDW(pszdevice.rawAddress.toCPointer<ByteVar>())

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    windowssysWindowsWin32MediaMultimediaMciGetDriverData(wdeviceid)

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: Pstr, cchtext: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaMciGetErrorStringA(mcierr, psztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: Pwstr, cchtext: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaMciGetErrorStringW(mcierr, psztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: ConstPtr<UInt>): Yieldproc =
    null

public actual fun mciLoadCommandResource(hinstance: Handle, lpresname: Pcwstr, wtype: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMciLoadCommandResource(hinstance.rawAddress.toCPointer<ByteVar>(), lpresname.rawAddress.toCPointer<ByteVar>(), wtype)

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    windowssysWindowsWin32MediaMultimediaMciSendCommandA(mciid, umsg, dwparam1, dwparam2)

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    windowssysWindowsWin32MediaMultimediaMciSendCommandW(mciid, umsg, dwparam1, dwparam2)

public actual fun mciSendStringA(lpstrcommand: Pcstr, lpstrreturnstring: Pstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    windowssysWindowsWin32MediaMultimediaMciSendStringA(lpstrcommand.rawAddress.toCPointer<ByteVar>(), lpstrreturnstring.rawAddress.toCPointer<ByteVar>(), ureturnlength, hwndcallback.rawAddress.toCPointer<ByteVar>())

public actual fun mciSendStringW(lpstrcommand: Pcwstr, lpstrreturnstring: Pwstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    windowssysWindowsWin32MediaMultimediaMciSendStringW(lpstrcommand.rawAddress.toCPointer<ByteVar>(), lpstrreturnstring.rawAddress.toCPointer<ByteVar>(), ureturnlength, hwndcallback.rawAddress.toCPointer<ByteVar>())

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): Bool =
    windowssysWindowsWin32MediaMultimediaMciSetDriverData(wdeviceid, dwdata)

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: Yieldproc, dwyielddata: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaMciSetYieldProc(mciid, 0L.toCPointer<ByteVar>(), dwyielddata)

public actual fun mmDrvInstall(hdriver: Hdrvr, wszdrventry: Pcwstr, drvmessage: Drivermsgproc, wflags: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmDrvInstall(hdriver.rawAddress.toCPointer<ByteVar>(), wszdrventry.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), wflags)

public actual fun mmGetCurrentTask(): UInt =
    windowssysWindowsWin32MediaMultimediaMmGetCurrentTask()

public actual fun mmTaskBlock(h: UInt) {
    windowssysWindowsWin32MediaMultimediaMmTaskBlock(h)
}

public actual fun mmTaskCreate(lpfn: Lptaskcallback, lph: MutPtr<Handle>, dwinst: ULong): UInt =
    windowssysWindowsWin32MediaMultimediaMmTaskCreate(0L.toCPointer<ByteVar>(), lph.rawAddress.toCPointer<ByteVar>(), dwinst)

public actual fun mmTaskSignal(h: UInt): Bool =
    windowssysWindowsWin32MediaMultimediaMmTaskSignal(h)

public actual fun mmTaskYield() {
    windowssysWindowsWin32MediaMultimediaMmTaskYield()
}

public actual fun mmioAdvance(hmmio: Hmmio, pmmioinfo: ConstPtr<Mmioinfo>, fuadvance: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioAdvance(hmmio.rawAddress.toCPointer<ByteVar>(), pmmioinfo.rawAddress.toCPointer<ByteVar>(), fuadvance)

public actual fun mmioAscend(hmmio: Hmmio, pmmcki: ConstPtr<Mmckinfo>, fuascend: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioAscend(hmmio.rawAddress.toCPointer<ByteVar>(), pmmcki.rawAddress.toCPointer<ByteVar>(), fuascend)

public actual fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioClose(hmmio.rawAddress.toCPointer<ByteVar>(), fuclose)

public actual fun mmioCreateChunk(hmmio: Hmmio, pmmcki: ConstPtr<Mmckinfo>, fucreate: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioCreateChunk(hmmio.rawAddress.toCPointer<ByteVar>(), pmmcki.rawAddress.toCPointer<ByteVar>(), fucreate)

public actual fun mmioDescend(hmmio: Hmmio, pmmcki: MutPtr<Mmckinfo>, pmmckiparent: ConstPtr<Mmckinfo>, fudescend: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioDescend(hmmio.rawAddress.toCPointer<ByteVar>(), pmmcki.rawAddress.toCPointer<ByteVar>(), pmmckiparent.rawAddress.toCPointer<ByteVar>(), fudescend)

public actual fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioFlush(hmmio.rawAddress.toCPointer<ByteVar>(), fuflush)

public actual fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: MutPtr<Mmioinfo>, fuinfo: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioGetInfo(hmmio.rawAddress.toCPointer<ByteVar>(), pmmioinfo.rawAddress.toCPointer<ByteVar>(), fuinfo)

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    null

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    null

public actual fun mmioOpenA(pszfilename: Pstr, pmmioinfo: MutPtr<Mmioinfo>, fdwopen: UInt): Hmmio =
    MutPtr(windowssysWindowsWin32MediaMultimediaMmioOpenA(pszfilename.rawAddress.toCPointer<ByteVar>(), pmmioinfo.rawAddress.toCPointer<ByteVar>(), fdwopen)?.toLong() ?: 0L)

public actual fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: MutPtr<Mmioinfo>, fdwopen: UInt): Hmmio =
    MutPtr(windowssysWindowsWin32MediaMultimediaMmioOpenW(pszfilename.rawAddress.toCPointer<ByteVar>(), pmmioinfo.rawAddress.toCPointer<ByteVar>(), fdwopen)?.toLong() ?: 0L)

public actual fun mmioRead(hmmio: Hmmio, pch: MutPtr<Byte>, cch: Int): Int =
    windowssysWindowsWin32MediaMultimediaMmioRead(hmmio.rawAddress.toCPointer<ByteVar>(), pch.rawAddress.toCPointer<ByteVar>(), cch)

public actual fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: ConstPtr<Mmioinfo>, fdwrename: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioRenameA(pszfilename.rawAddress.toCPointer<ByteVar>(), psznewfilename.rawAddress.toCPointer<ByteVar>(), pmmioinfo.rawAddress.toCPointer<ByteVar>(), fdwrename)

public actual fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: ConstPtr<Mmioinfo>, fdwrename: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioRenameW(pszfilename.rawAddress.toCPointer<ByteVar>(), psznewfilename.rawAddress.toCPointer<ByteVar>(), pmmioinfo.rawAddress.toCPointer<ByteVar>(), fdwrename)

public actual fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int =
    windowssysWindowsWin32MediaMultimediaMmioSeek(hmmio.rawAddress.toCPointer<ByteVar>(), loffset, iorigin)

public actual fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    windowssysWindowsWin32MediaMultimediaMmioSendMessage(hmmio.rawAddress.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioSetBuffer(hmmio.rawAddress.toCPointer<ByteVar>(), pchbuffer.rawAddress.toCPointer<ByteVar>(), cchbuffer, fubuffer)

public actual fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: ConstPtr<Mmioinfo>, fuinfo: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioSetInfo(hmmio.rawAddress.toCPointer<ByteVar>(), pmmioinfo.rawAddress.toCPointer<ByteVar>(), fuinfo)

public actual fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCA(sz.rawAddress.toCPointer<ByteVar>(), uflags)

public actual fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt =
    windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCW(sz.rawAddress.toCPointer<ByteVar>(), uflags)

public actual fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int =
    windowssysWindowsWin32MediaMultimediaMmioWrite(hmmio.rawAddress.toCPointer<ByteVar>(), pch.rawAddress.toCPointer<ByteVar>(), cch)

public actual fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: MutPtr<Handle>): Int =
    windowssysWindowsWin32MediaMultimediaSndOpenSound(eventname.rawAddress.toCPointer<ByteVar>(), appname.rawAddress.toCPointer<ByteVar>(), flags, filehandle.rawAddress.toCPointer<ByteVar>())
