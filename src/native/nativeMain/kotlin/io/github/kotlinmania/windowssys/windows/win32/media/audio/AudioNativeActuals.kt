@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.audio

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.media.Mmtime
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverAddA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverAddW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverEnum
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverPriority
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmDriverRemove
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFilterChooseA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFilterChooseW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFilterDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFilterDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFilterEnumA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFilterEnumW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFilterTagDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFilterTagDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFilterTagEnumA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFilterTagEnumW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatChooseA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatChooseW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatEnumA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatEnumW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatSuggest
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatTagDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatTagDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatTagEnumA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmFormatTagEnumW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmGetVersion
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmMetrics
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmStreamClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmStreamConvert
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmStreamMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmStreamOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmStreamPrepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmStreamReset
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmStreamSize
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAuxGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAuxGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAuxGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAuxGetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAuxOutMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioAuxSetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioCoRegisterMessageFilter
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiConnect
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiDisconnect
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInAddBuffer
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInGetErrorTextA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInGetErrorTextW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInGetID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInPrepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInReset
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInStart
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInStop
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiInUnprepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutCachePatches
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutGetErrorTextA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutGetErrorTextW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutGetID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutGetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutLongMsg
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutPrepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutReset
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutSetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutShortMsg
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiOutUnprepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiStreamClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiStreamOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiStreamOut
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiStreamPause
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiStreamPosition
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiStreamProperty
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiStreamRestart
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMidiStreamStop
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerGetControlDetailsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerGetControlDetailsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerGetID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerGetLineControlsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerGetLineControlsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerGetLineInfoA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerGetLineInfoW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioMixerSetControlDetails
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioPlaySoundA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioPlaySoundW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioSndPlaySoundA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioSndPlaySoundW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInAddBuffer
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInGetErrorTextA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInGetErrorTextW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInGetID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInGetPosition
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInPrepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInReset
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInStart
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInStop
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveInUnprepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutBreakLoop
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutClose
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutGetDevCapsA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutGetDevCapsW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutGetErrorTextA
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutGetErrorTextW
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutGetID
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutGetNumDevs
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutGetPitch
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutGetPosition
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutGetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutMessage
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutOpen
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutPause
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutPrepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutReset
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutRestart
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutSetPitch
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutSetVolume
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutUnprepareHeader
import io.github.kotlinmania.windowssys.windows.win32.media.audio.cinterop.windowssysWindowsWin32MediaAudioWaveOutWrite
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun activateAudioInterfaceAsync(deviceinterfacepath: Pcwstr, riid: ConstPtr<Guid>, activationparams: ConstPtr<Propvariant>, completionhandler: MutPtr<CVoid>, activationoperation: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync(deviceinterfacepath.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), activationparams.rawAddress.toCPointer<ByteVar>(), completionhandler.rawAddress.toCPointer<ByteVar>(), activationoperation.rawAddress.toCPointer<ByteVar>())

public actual fun coRegisterMessageFilter(lpmessagefilter: MutPtr<CVoid>, lplpmessagefilter: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaAudioCoRegisterMessageFilter(lpmessagefilter.rawAddress.toCPointer<ByteVar>(), lplpmessagefilter.rawAddress.toCPointer<ByteVar>())

public actual fun createCaptureAudioStateMonitor(audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor(audiostatemonitor.rawAddress.toCPointer<ByteVar>())

public actual fun createCaptureAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory(category, audiostatemonitor.rawAddress.toCPointer<ByteVar>())

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId(category, deviceid.rawAddress.toCPointer<ByteVar>(), audiostatemonitor.rawAddress.toCPointer<ByteVar>())

public actual fun createCaptureAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.rawAddress.toCPointer<ByteVar>())

public actual fun createRenderAudioStateMonitor(audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor(audiostatemonitor.rawAddress.toCPointer<ByteVar>())

public actual fun createRenderAudioStateMonitorForCategory(category: AudioStreamCategory, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory(category, audiostatemonitor.rawAddress.toCPointer<ByteVar>())

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceId(category: AudioStreamCategory, deviceid: Pcwstr, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId(category, deviceid.rawAddress.toCPointer<ByteVar>(), audiostatemonitor.rawAddress.toCPointer<ByteVar>())

public actual fun createRenderAudioStateMonitorForCategoryAndDeviceRole(category: AudioStreamCategory, role: ERole, audiostatemonitor: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole(category, role, audiostatemonitor.rawAddress.toCPointer<ByteVar>())

public actual fun playSoundA(pszsound: Pcstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    windowssysWindowsWin32MediaAudioPlaySoundA(pszsound.rawAddress.toCPointer<ByteVar>(), hmod.rawAddress.toCPointer<ByteVar>(), fdwsound)

public actual fun playSoundW(pszsound: Pcwstr, hmod: Hmodule, fdwsound: SndFlags): Bool =
    windowssysWindowsWin32MediaAudioPlaySoundW(pszsound.rawAddress.toCPointer<ByteVar>(), hmod.rawAddress.toCPointer<ByteVar>(), fdwsound)

public actual fun acmDriverAddA(phadid: MutPtr<Hacmdriverid>, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmDriverAddA(phadid.rawAddress.toCPointer<ByteVar>(), hinstmodule.rawAddress.toCPointer<ByteVar>(), lparam, dwpriority, fdwadd)

public actual fun acmDriverAddW(phadid: MutPtr<Hacmdriverid>, hinstmodule: Hinstance, lparam: Lparam, dwpriority: UInt, fdwadd: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmDriverAddW(phadid.rawAddress.toCPointer<ByteVar>(), hinstmodule.rawAddress.toCPointer<ByteVar>(), lparam, dwpriority, fdwadd)

public actual fun acmDriverClose(had: Hacmdriver, fdwclose: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmDriverClose(had.rawAddress.toCPointer<ByteVar>(), fdwclose)

public actual fun acmDriverDetailsA(hadid: Hacmdriverid, padd: MutPtr<Acmdriverdetailsa>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmDriverDetailsA(hadid.rawAddress.toCPointer<ByteVar>(), padd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmDriverDetailsW(hadid: Hacmdriverid, padd: MutPtr<Acmdriverdetailsw>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmDriverDetailsW(hadid.rawAddress.toCPointer<ByteVar>(), padd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmDriverEnum(fncallback: Acmdriverenumcb, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmDriverEnum(0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmDriverID(hao: Hacmobj, phadid: MutPtr<Hacmdriverid>, fdwdriverid: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmDriverID(hao.rawAddress.toCPointer<ByteVar>(), phadid.rawAddress.toCPointer<ByteVar>(), fdwdriverid)

public actual fun acmDriverMessage(had: Hacmdriver, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    windowssysWindowsWin32MediaAudioAcmDriverMessage(had.rawAddress.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun acmDriverOpen(phad: MutPtr<Hacmdriver>, hadid: Hacmdriverid, fdwopen: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmDriverOpen(phad.rawAddress.toCPointer<ByteVar>(), hadid.rawAddress.toCPointer<ByteVar>(), fdwopen)

public actual fun acmDriverPriority(hadid: Hacmdriverid, dwpriority: UInt, fdwpriority: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmDriverPriority(hadid.rawAddress.toCPointer<ByteVar>(), dwpriority, fdwpriority)

public actual fun acmDriverRemove(hadid: Hacmdriverid, fdwremove: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmDriverRemove(hadid.rawAddress.toCPointer<ByteVar>(), fdwremove)

public actual fun acmFilterChooseA(pafltrc: MutPtr<Acmfilterchoosea>): UInt =
    windowssysWindowsWin32MediaAudioAcmFilterChooseA(pafltrc.rawAddress.toCPointer<ByteVar>())

public actual fun acmFilterChooseW(pafltrc: MutPtr<Acmfilterchoosew>): UInt =
    windowssysWindowsWin32MediaAudioAcmFilterChooseW(pafltrc.rawAddress.toCPointer<ByteVar>())

public actual fun acmFilterDetailsA(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsa>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFilterDetailsA(had.rawAddress.toCPointer<ByteVar>(), pafd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterDetailsW(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsw>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFilterDetailsW(had.rawAddress.toCPointer<ByteVar>(), pafd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterEnumA(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsa>, fncallback: Acmfilterenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFilterEnumA(had.rawAddress.toCPointer<ByteVar>(), pafd.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFilterEnumW(had: Hacmdriver, pafd: MutPtr<Acmfilterdetailsw>, fncallback: Acmfilterenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFilterEnumW(had.rawAddress.toCPointer<ByteVar>(), pafd.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFilterTagDetailsA(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsa>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFilterTagDetailsA(had.rawAddress.toCPointer<ByteVar>(), paftd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterTagDetailsW(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsw>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFilterTagDetailsW(had.rawAddress.toCPointer<ByteVar>(), paftd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFilterTagEnumA(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsa>, fncallback: Acmfiltertagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFilterTagEnumA(had.rawAddress.toCPointer<ByteVar>(), paftd.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFilterTagEnumW(had: Hacmdriver, paftd: MutPtr<Acmfiltertagdetailsw>, fncallback: Acmfiltertagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFilterTagEnumW(had.rawAddress.toCPointer<ByteVar>(), paftd.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatChooseA(pafmtc: MutPtr<Acmformatchoosea>): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatChooseA(pafmtc.rawAddress.toCPointer<ByteVar>())

public actual fun acmFormatChooseW(pafmtc: MutPtr<Acmformatchoosew>): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatChooseW(pafmtc.rawAddress.toCPointer<ByteVar>())

public actual fun acmFormatDetailsA(had: Hacmdriver, pafd: MutPtr<Acmformatdetailsa>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatDetailsA(had.rawAddress.toCPointer<ByteVar>(), pafd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatDetailsW(had: Hacmdriver, pafd: MutPtr<TAcmformatdetailsw>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatDetailsW(had.rawAddress.toCPointer<ByteVar>(), pafd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatEnumA(had: Hacmdriver, pafd: MutPtr<Acmformatdetailsa>, fncallback: Acmformatenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatEnumA(had.rawAddress.toCPointer<ByteVar>(), pafd.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatEnumW(had: Hacmdriver, pafd: MutPtr<TAcmformatdetailsw>, fncallback: Acmformatenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatEnumW(had.rawAddress.toCPointer<ByteVar>(), pafd.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatSuggest(had: Hacmdriver, pwfxsrc: MutPtr<Waveformatex>, pwfxdst: MutPtr<Waveformatex>, cbwfxdst: UInt, fdwsuggest: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatSuggest(had.rawAddress.toCPointer<ByteVar>(), pwfxsrc.rawAddress.toCPointer<ByteVar>(), pwfxdst.rawAddress.toCPointer<ByteVar>(), cbwfxdst, fdwsuggest)

public actual fun acmFormatTagDetailsA(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsa>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatTagDetailsA(had.rawAddress.toCPointer<ByteVar>(), paftd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatTagDetailsW(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsw>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatTagDetailsW(had.rawAddress.toCPointer<ByteVar>(), paftd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun acmFormatTagEnumA(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsa>, fncallback: Acmformattagenumcba, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatTagEnumA(had.rawAddress.toCPointer<ByteVar>(), paftd.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmFormatTagEnumW(had: Hacmdriver, paftd: MutPtr<Acmformattagdetailsw>, fncallback: Acmformattagenumcbw, dwinstance: ULong, fdwenum: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmFormatTagEnumW(had.rawAddress.toCPointer<ByteVar>(), paftd.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinstance, fdwenum)

public actual fun acmGetVersion(): UInt =
    windowssysWindowsWin32MediaAudioAcmGetVersion()

public actual fun acmMetrics(hao: Hacmobj, umetric: UInt, pmetric: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32MediaAudioAcmMetrics(hao.rawAddress.toCPointer<ByteVar>(), umetric, pmetric.rawAddress.toCPointer<ByteVar>())

public actual fun acmStreamClose(has: Hacmstream, fdwclose: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmStreamClose(has.rawAddress.toCPointer<ByteVar>(), fdwclose)

public actual fun acmStreamConvert(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwconvert: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmStreamConvert(has.rawAddress.toCPointer<ByteVar>(), pash.rawAddress.toCPointer<ByteVar>(), fdwconvert)

public actual fun acmStreamMessage(has: Hacmstream, umsg: UInt, lparam1: Lparam, lparam2: Lparam): UInt =
    windowssysWindowsWin32MediaAudioAcmStreamMessage(has.rawAddress.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun acmStreamOpen(phas: MutPtr<Hacmstream>, had: Hacmdriver, pwfxsrc: MutPtr<Waveformatex>, pwfxdst: MutPtr<Waveformatex>, pwfltr: MutPtr<Wavefilter>, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmStreamOpen(phas.rawAddress.toCPointer<ByteVar>(), had.rawAddress.toCPointer<ByteVar>(), pwfxsrc.rawAddress.toCPointer<ByteVar>(), pwfxdst.rawAddress.toCPointer<ByteVar>(), pwfltr.rawAddress.toCPointer<ByteVar>(), dwcallback, dwinstance, fdwopen)

public actual fun acmStreamPrepareHeader(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwprepare: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmStreamPrepareHeader(has.rawAddress.toCPointer<ByteVar>(), pash.rawAddress.toCPointer<ByteVar>(), fdwprepare)

public actual fun acmStreamReset(has: Hacmstream, fdwreset: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmStreamReset(has.rawAddress.toCPointer<ByteVar>(), fdwreset)

public actual fun acmStreamSize(has: Hacmstream, cbinput: UInt, pdwoutputbytes: MutPtr<UInt>, fdwsize: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmStreamSize(has.rawAddress.toCPointer<ByteVar>(), cbinput, pdwoutputbytes.rawAddress.toCPointer<ByteVar>(), fdwsize)

public actual fun acmStreamUnprepareHeader(has: Hacmstream, pash: MutPtr<Acmstreamheader>, fdwunprepare: UInt): UInt =
    windowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader(has.rawAddress.toCPointer<ByteVar>(), pash.rawAddress.toCPointer<ByteVar>(), fdwunprepare)

public actual fun auxGetDevCapsA(udeviceid: ULong, pac: MutPtr<Auxcapsa>, cbac: UInt): UInt =
    windowssysWindowsWin32MediaAudioAuxGetDevCapsA(udeviceid, pac.rawAddress.toCPointer<ByteVar>(), cbac)

public actual fun auxGetDevCapsW(udeviceid: ULong, pac: MutPtr<Auxcapsw>, cbac: UInt): UInt =
    windowssysWindowsWin32MediaAudioAuxGetDevCapsW(udeviceid, pac.rawAddress.toCPointer<ByteVar>(), cbac)

public actual fun auxGetNumDevs(): UInt =
    windowssysWindowsWin32MediaAudioAuxGetNumDevs()

public actual fun auxGetVolume(udeviceid: UInt, pdwvolume: MutPtr<UInt>): UInt =
    windowssysWindowsWin32MediaAudioAuxGetVolume(udeviceid, pdwvolume.rawAddress.toCPointer<ByteVar>())

public actual fun auxOutMessage(udeviceid: UInt, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    windowssysWindowsWin32MediaAudioAuxOutMessage(udeviceid, umsg, dw1, dw2)

public actual fun auxSetVolume(udeviceid: UInt, dwvolume: UInt): UInt =
    windowssysWindowsWin32MediaAudioAuxSetVolume(udeviceid, dwvolume)

public actual fun midiConnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32MediaAudioMidiConnect(hmi.rawAddress.toCPointer<ByteVar>(), hmo.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun midiDisconnect(hmi: Hmidi, hmo: Hmidiout, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32MediaAudioMidiDisconnect(hmi.rawAddress.toCPointer<ByteVar>(), hmo.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun midiInAddBuffer(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiInAddBuffer(hmi.rawAddress.toCPointer<ByteVar>(), pmh.rawAddress.toCPointer<ByteVar>(), cbmh)

public actual fun midiInClose(hmi: Hmidiin): UInt =
    windowssysWindowsWin32MediaAudioMidiInClose(hmi.rawAddress.toCPointer<ByteVar>())

public actual fun midiInGetDevCapsA(udeviceid: ULong, pmic: MutPtr<Midiincapsa>, cbmic: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiInGetDevCapsA(udeviceid, pmic.rawAddress.toCPointer<ByteVar>(), cbmic)

public actual fun midiInGetDevCapsW(udeviceid: ULong, pmic: MutPtr<Midiincapsw>, cbmic: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiInGetDevCapsW(udeviceid, pmic.rawAddress.toCPointer<ByteVar>(), cbmic)

public actual fun midiInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiInGetErrorTextA(mmrerror, psztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun midiInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiInGetErrorTextW(mmrerror, psztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun midiInGetID(hmi: Hmidiin, pudeviceid: MutPtr<UInt>): UInt =
    windowssysWindowsWin32MediaAudioMidiInGetID(hmi.rawAddress.toCPointer<ByteVar>(), pudeviceid.rawAddress.toCPointer<ByteVar>())

public actual fun midiInGetNumDevs(): UInt =
    windowssysWindowsWin32MediaAudioMidiInGetNumDevs()

public actual fun midiInMessage(hmi: Hmidiin, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    windowssysWindowsWin32MediaAudioMidiInMessage(hmi.rawAddress.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun midiInOpen(phmi: MutPtr<Hmidiin>, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    windowssysWindowsWin32MediaAudioMidiInOpen(phmi.rawAddress.toCPointer<ByteVar>(), udeviceid, dwcallback, dwinstance, fdwopen)

public actual fun midiInPrepareHeader(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiInPrepareHeader(hmi.rawAddress.toCPointer<ByteVar>(), pmh.rawAddress.toCPointer<ByteVar>(), cbmh)

public actual fun midiInReset(hmi: Hmidiin): UInt =
    windowssysWindowsWin32MediaAudioMidiInReset(hmi.rawAddress.toCPointer<ByteVar>())

public actual fun midiInStart(hmi: Hmidiin): UInt =
    windowssysWindowsWin32MediaAudioMidiInStart(hmi.rawAddress.toCPointer<ByteVar>())

public actual fun midiInStop(hmi: Hmidiin): UInt =
    windowssysWindowsWin32MediaAudioMidiInStop(hmi.rawAddress.toCPointer<ByteVar>())

public actual fun midiInUnprepareHeader(hmi: Hmidiin, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiInUnprepareHeader(hmi.rawAddress.toCPointer<ByteVar>(), pmh.rawAddress.toCPointer<ByteVar>(), cbmh)

public actual fun midiOutCacheDrumPatches(hmo: Hmidiout, upatch: UInt, pwkya: ConstPtr<UShort>, fucache: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches(hmo.rawAddress.toCPointer<ByteVar>(), upatch, pwkya.rawAddress.toCPointer<ByteVar>(), fucache)

public actual fun midiOutCachePatches(hmo: Hmidiout, ubank: UInt, pwpa: ConstPtr<UShort>, fucache: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutCachePatches(hmo.rawAddress.toCPointer<ByteVar>(), ubank, pwpa.rawAddress.toCPointer<ByteVar>(), fucache)

public actual fun midiOutClose(hmo: Hmidiout): UInt =
    windowssysWindowsWin32MediaAudioMidiOutClose(hmo.rawAddress.toCPointer<ByteVar>())

public actual fun midiOutGetDevCapsA(udeviceid: ULong, pmoc: MutPtr<Midioutcapsa>, cbmoc: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutGetDevCapsA(udeviceid, pmoc.rawAddress.toCPointer<ByteVar>(), cbmoc)

public actual fun midiOutGetDevCapsW(udeviceid: ULong, pmoc: MutPtr<Midioutcapsw>, cbmoc: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutGetDevCapsW(udeviceid, pmoc.rawAddress.toCPointer<ByteVar>(), cbmoc)

public actual fun midiOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutGetErrorTextA(mmrerror, psztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun midiOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutGetErrorTextW(mmrerror, psztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun midiOutGetID(hmo: Hmidiout, pudeviceid: MutPtr<UInt>): UInt =
    windowssysWindowsWin32MediaAudioMidiOutGetID(hmo.rawAddress.toCPointer<ByteVar>(), pudeviceid.rawAddress.toCPointer<ByteVar>())

public actual fun midiOutGetNumDevs(): UInt =
    windowssysWindowsWin32MediaAudioMidiOutGetNumDevs()

public actual fun midiOutGetVolume(hmo: Hmidiout, pdwvolume: MutPtr<UInt>): UInt =
    windowssysWindowsWin32MediaAudioMidiOutGetVolume(hmo.rawAddress.toCPointer<ByteVar>(), pdwvolume.rawAddress.toCPointer<ByteVar>())

public actual fun midiOutLongMsg(hmo: Hmidiout, pmh: ConstPtr<Midihdr>, cbmh: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutLongMsg(hmo.rawAddress.toCPointer<ByteVar>(), pmh.rawAddress.toCPointer<ByteVar>(), cbmh)

public actual fun midiOutMessage(hmo: Hmidiout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    windowssysWindowsWin32MediaAudioMidiOutMessage(hmo.rawAddress.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun midiOutOpen(phmo: MutPtr<Hmidiout>, udeviceid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    windowssysWindowsWin32MediaAudioMidiOutOpen(phmo.rawAddress.toCPointer<ByteVar>(), udeviceid, dwcallback, dwinstance, fdwopen)

public actual fun midiOutPrepareHeader(hmo: Hmidiout, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutPrepareHeader(hmo.rawAddress.toCPointer<ByteVar>(), pmh.rawAddress.toCPointer<ByteVar>(), cbmh)

public actual fun midiOutReset(hmo: Hmidiout): UInt =
    windowssysWindowsWin32MediaAudioMidiOutReset(hmo.rawAddress.toCPointer<ByteVar>())

public actual fun midiOutSetVolume(hmo: Hmidiout, dwvolume: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutSetVolume(hmo.rawAddress.toCPointer<ByteVar>(), dwvolume)

public actual fun midiOutShortMsg(hmo: Hmidiout, dwmsg: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutShortMsg(hmo.rawAddress.toCPointer<ByteVar>(), dwmsg)

public actual fun midiOutUnprepareHeader(hmo: Hmidiout, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiOutUnprepareHeader(hmo.rawAddress.toCPointer<ByteVar>(), pmh.rawAddress.toCPointer<ByteVar>(), cbmh)

public actual fun midiStreamClose(hms: Hmidistrm): UInt =
    windowssysWindowsWin32MediaAudioMidiStreamClose(hms.rawAddress.toCPointer<ByteVar>())

public actual fun midiStreamOpen(phms: MutPtr<Hmidistrm>, pudeviceid: MutPtr<UInt>, cmidi: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiStreamOpen(phms.rawAddress.toCPointer<ByteVar>(), pudeviceid.rawAddress.toCPointer<ByteVar>(), cmidi, dwcallback, dwinstance, fdwopen)

public actual fun midiStreamOut(hms: Hmidistrm, pmh: MutPtr<Midihdr>, cbmh: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiStreamOut(hms.rawAddress.toCPointer<ByteVar>(), pmh.rawAddress.toCPointer<ByteVar>(), cbmh)

public actual fun midiStreamPause(hms: Hmidistrm): UInt =
    windowssysWindowsWin32MediaAudioMidiStreamPause(hms.rawAddress.toCPointer<ByteVar>())

public actual fun midiStreamPosition(hms: Hmidistrm, lpmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiStreamPosition(hms.rawAddress.toCPointer<ByteVar>(), lpmmt.rawAddress.toCPointer<ByteVar>(), cbmmt)

public actual fun midiStreamProperty(hms: Hmidistrm, lppropdata: MutPtr<UByte>, dwproperty: UInt): UInt =
    windowssysWindowsWin32MediaAudioMidiStreamProperty(hms.rawAddress.toCPointer<ByteVar>(), lppropdata.rawAddress.toCPointer<ByteVar>(), dwproperty)

public actual fun midiStreamRestart(hms: Hmidistrm): UInt =
    windowssysWindowsWin32MediaAudioMidiStreamRestart(hms.rawAddress.toCPointer<ByteVar>())

public actual fun midiStreamStop(hms: Hmidistrm): UInt =
    windowssysWindowsWin32MediaAudioMidiStreamStop(hms.rawAddress.toCPointer<ByteVar>())

public actual fun mixerClose(hmx: Hmixer): UInt =
    windowssysWindowsWin32MediaAudioMixerClose(hmx.rawAddress.toCPointer<ByteVar>())

public actual fun mixerGetControlDetailsA(hmxobj: Hmixerobj, pmxcd: MutPtr<Mixercontroldetails>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerGetControlDetailsA(hmxobj.rawAddress.toCPointer<ByteVar>(), pmxcd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun mixerGetControlDetailsW(hmxobj: Hmixerobj, pmxcd: MutPtr<Mixercontroldetails>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerGetControlDetailsW(hmxobj.rawAddress.toCPointer<ByteVar>(), pmxcd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun mixerGetDevCapsA(umxid: ULong, pmxcaps: MutPtr<Mixercapsa>, cbmxcaps: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerGetDevCapsA(umxid, pmxcaps.rawAddress.toCPointer<ByteVar>(), cbmxcaps)

public actual fun mixerGetDevCapsW(umxid: ULong, pmxcaps: MutPtr<Mixercapsw>, cbmxcaps: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerGetDevCapsW(umxid, pmxcaps.rawAddress.toCPointer<ByteVar>(), cbmxcaps)

public actual fun mixerGetID(hmxobj: Hmixerobj, pumxid: MutPtr<UInt>, fdwid: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerGetID(hmxobj.rawAddress.toCPointer<ByteVar>(), pumxid.rawAddress.toCPointer<ByteVar>(), fdwid)

public actual fun mixerGetLineControlsA(hmxobj: Hmixerobj, pmxlc: MutPtr<Mixerlinecontrolsa>, fdwcontrols: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerGetLineControlsA(hmxobj.rawAddress.toCPointer<ByteVar>(), pmxlc.rawAddress.toCPointer<ByteVar>(), fdwcontrols)

public actual fun mixerGetLineControlsW(hmxobj: Hmixerobj, pmxlc: MutPtr<Mixerlinecontrolsw>, fdwcontrols: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerGetLineControlsW(hmxobj.rawAddress.toCPointer<ByteVar>(), pmxlc.rawAddress.toCPointer<ByteVar>(), fdwcontrols)

public actual fun mixerGetLineInfoA(hmxobj: Hmixerobj, pmxl: MutPtr<Mixerlinea>, fdwinfo: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerGetLineInfoA(hmxobj.rawAddress.toCPointer<ByteVar>(), pmxl.rawAddress.toCPointer<ByteVar>(), fdwinfo)

public actual fun mixerGetLineInfoW(hmxobj: Hmixerobj, pmxl: MutPtr<Mixerlinew>, fdwinfo: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerGetLineInfoW(hmxobj.rawAddress.toCPointer<ByteVar>(), pmxl.rawAddress.toCPointer<ByteVar>(), fdwinfo)

public actual fun mixerGetNumDevs(): UInt =
    windowssysWindowsWin32MediaAudioMixerGetNumDevs()

public actual fun mixerMessage(hmx: Hmixer, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    windowssysWindowsWin32MediaAudioMixerMessage(hmx.rawAddress.toCPointer<ByteVar>(), umsg, dwparam1, dwparam2)

public actual fun mixerOpen(phmx: MutPtr<Hmixer>, umxid: UInt, dwcallback: ULong, dwinstance: ULong, fdwopen: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerOpen(phmx.rawAddress.toCPointer<ByteVar>(), umxid, dwcallback, dwinstance, fdwopen)

public actual fun mixerSetControlDetails(hmxobj: Hmixerobj, pmxcd: ConstPtr<Mixercontroldetails>, fdwdetails: UInt): UInt =
    windowssysWindowsWin32MediaAudioMixerSetControlDetails(hmxobj.rawAddress.toCPointer<ByteVar>(), pmxcd.rawAddress.toCPointer<ByteVar>(), fdwdetails)

public actual fun sndPlaySoundA(pszsound: Pcstr, fusound: UInt): Bool =
    windowssysWindowsWin32MediaAudioSndPlaySoundA(pszsound.rawAddress.toCPointer<ByteVar>(), fusound)

public actual fun sndPlaySoundW(pszsound: Pcwstr, fusound: UInt): Bool =
    windowssysWindowsWin32MediaAudioSndPlaySoundW(pszsound.rawAddress.toCPointer<ByteVar>(), fusound)

public actual fun waveInAddBuffer(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveInAddBuffer(hwi.rawAddress.toCPointer<ByteVar>(), pwh.rawAddress.toCPointer<ByteVar>(), cbwh)

public actual fun waveInClose(hwi: Hwavein): UInt =
    windowssysWindowsWin32MediaAudioWaveInClose(hwi.rawAddress.toCPointer<ByteVar>())

public actual fun waveInGetDevCapsA(udeviceid: ULong, pwic: MutPtr<Waveincapsa>, cbwic: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveInGetDevCapsA(udeviceid, pwic.rawAddress.toCPointer<ByteVar>(), cbwic)

public actual fun waveInGetDevCapsW(udeviceid: ULong, pwic: MutPtr<Waveincapsw>, cbwic: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveInGetDevCapsW(udeviceid, pwic.rawAddress.toCPointer<ByteVar>(), cbwic)

public actual fun waveInGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveInGetErrorTextA(mmrerror, psztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun waveInGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveInGetErrorTextW(mmrerror, psztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun waveInGetID(hwi: Hwavein, pudeviceid: ConstPtr<UInt>): UInt =
    windowssysWindowsWin32MediaAudioWaveInGetID(hwi.rawAddress.toCPointer<ByteVar>(), pudeviceid.rawAddress.toCPointer<ByteVar>())

public actual fun waveInGetNumDevs(): UInt =
    windowssysWindowsWin32MediaAudioWaveInGetNumDevs()

public actual fun waveInGetPosition(hwi: Hwavein, pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveInGetPosition(hwi.rawAddress.toCPointer<ByteVar>(), pmmt.rawAddress.toCPointer<ByteVar>(), cbmmt)

public actual fun waveInMessage(hwi: Hwavein, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    windowssysWindowsWin32MediaAudioWaveInMessage(hwi.rawAddress.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun waveInOpen(phwi: MutPtr<Hwavein>, udeviceid: UInt, pwfx: ConstPtr<Waveformatex>, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    windowssysWindowsWin32MediaAudioWaveInOpen(phwi.rawAddress.toCPointer<ByteVar>(), udeviceid, pwfx.rawAddress.toCPointer<ByteVar>(), dwcallback, dwinstance, fdwopen)

public actual fun waveInPrepareHeader(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveInPrepareHeader(hwi.rawAddress.toCPointer<ByteVar>(), pwh.rawAddress.toCPointer<ByteVar>(), cbwh)

public actual fun waveInReset(hwi: Hwavein): UInt =
    windowssysWindowsWin32MediaAudioWaveInReset(hwi.rawAddress.toCPointer<ByteVar>())

public actual fun waveInStart(hwi: Hwavein): UInt =
    windowssysWindowsWin32MediaAudioWaveInStart(hwi.rawAddress.toCPointer<ByteVar>())

public actual fun waveInStop(hwi: Hwavein): UInt =
    windowssysWindowsWin32MediaAudioWaveInStop(hwi.rawAddress.toCPointer<ByteVar>())

public actual fun waveInUnprepareHeader(hwi: Hwavein, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveInUnprepareHeader(hwi.rawAddress.toCPointer<ByteVar>(), pwh.rawAddress.toCPointer<ByteVar>(), cbwh)

public actual fun waveOutBreakLoop(hwo: Hwaveout): UInt =
    windowssysWindowsWin32MediaAudioWaveOutBreakLoop(hwo.rawAddress.toCPointer<ByteVar>())

public actual fun waveOutClose(hwo: Hwaveout): UInt =
    windowssysWindowsWin32MediaAudioWaveOutClose(hwo.rawAddress.toCPointer<ByteVar>())

public actual fun waveOutGetDevCapsA(udeviceid: ULong, pwoc: MutPtr<Waveoutcapsa>, cbwoc: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutGetDevCapsA(udeviceid, pwoc.rawAddress.toCPointer<ByteVar>(), cbwoc)

public actual fun waveOutGetDevCapsW(udeviceid: ULong, pwoc: MutPtr<Waveoutcapsw>, cbwoc: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutGetDevCapsW(udeviceid, pwoc.rawAddress.toCPointer<ByteVar>(), cbwoc)

public actual fun waveOutGetErrorTextA(mmrerror: UInt, psztext: Pstr, cchtext: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutGetErrorTextA(mmrerror, psztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun waveOutGetErrorTextW(mmrerror: UInt, psztext: Pwstr, cchtext: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutGetErrorTextW(mmrerror, psztext.rawAddress.toCPointer<ByteVar>(), cchtext)

public actual fun waveOutGetID(hwo: Hwaveout, pudeviceid: MutPtr<UInt>): UInt =
    windowssysWindowsWin32MediaAudioWaveOutGetID(hwo.rawAddress.toCPointer<ByteVar>(), pudeviceid.rawAddress.toCPointer<ByteVar>())

public actual fun waveOutGetNumDevs(): UInt =
    windowssysWindowsWin32MediaAudioWaveOutGetNumDevs()

public actual fun waveOutGetPitch(hwo: Hwaveout, pdwpitch: MutPtr<UInt>): UInt =
    windowssysWindowsWin32MediaAudioWaveOutGetPitch(hwo.rawAddress.toCPointer<ByteVar>(), pdwpitch.rawAddress.toCPointer<ByteVar>())

public actual fun waveOutGetPlaybackRate(hwo: Hwaveout, pdwrate: MutPtr<UInt>): UInt =
    windowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate(hwo.rawAddress.toCPointer<ByteVar>(), pdwrate.rawAddress.toCPointer<ByteVar>())

public actual fun waveOutGetPosition(hwo: Hwaveout, pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutGetPosition(hwo.rawAddress.toCPointer<ByteVar>(), pmmt.rawAddress.toCPointer<ByteVar>(), cbmmt)

public actual fun waveOutGetVolume(hwo: Hwaveout, pdwvolume: MutPtr<UInt>): UInt =
    windowssysWindowsWin32MediaAudioWaveOutGetVolume(hwo.rawAddress.toCPointer<ByteVar>(), pdwvolume.rawAddress.toCPointer<ByteVar>())

public actual fun waveOutMessage(hwo: Hwaveout, umsg: UInt, dw1: ULong, dw2: ULong): UInt =
    windowssysWindowsWin32MediaAudioWaveOutMessage(hwo.rawAddress.toCPointer<ByteVar>(), umsg, dw1, dw2)

public actual fun waveOutOpen(phwo: MutPtr<Hwaveout>, udeviceid: UInt, pwfx: ConstPtr<Waveformatex>, dwcallback: ULong, dwinstance: ULong, fdwopen: MidiWaveOpenType): UInt =
    windowssysWindowsWin32MediaAudioWaveOutOpen(phwo.rawAddress.toCPointer<ByteVar>(), udeviceid, pwfx.rawAddress.toCPointer<ByteVar>(), dwcallback, dwinstance, fdwopen)

public actual fun waveOutPause(hwo: Hwaveout): UInt =
    windowssysWindowsWin32MediaAudioWaveOutPause(hwo.rawAddress.toCPointer<ByteVar>())

public actual fun waveOutPrepareHeader(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutPrepareHeader(hwo.rawAddress.toCPointer<ByteVar>(), pwh.rawAddress.toCPointer<ByteVar>(), cbwh)

public actual fun waveOutReset(hwo: Hwaveout): UInt =
    windowssysWindowsWin32MediaAudioWaveOutReset(hwo.rawAddress.toCPointer<ByteVar>())

public actual fun waveOutRestart(hwo: Hwaveout): UInt =
    windowssysWindowsWin32MediaAudioWaveOutRestart(hwo.rawAddress.toCPointer<ByteVar>())

public actual fun waveOutSetPitch(hwo: Hwaveout, dwpitch: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutSetPitch(hwo.rawAddress.toCPointer<ByteVar>(), dwpitch)

public actual fun waveOutSetPlaybackRate(hwo: Hwaveout, dwrate: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate(hwo.rawAddress.toCPointer<ByteVar>(), dwrate)

public actual fun waveOutSetVolume(hwo: Hwaveout, dwvolume: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutSetVolume(hwo.rawAddress.toCPointer<ByteVar>(), dwvolume)

public actual fun waveOutUnprepareHeader(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutUnprepareHeader(hwo.rawAddress.toCPointer<ByteVar>(), pwh.rawAddress.toCPointer<ByteVar>(), cbwh)

public actual fun waveOutWrite(hwo: Hwaveout, pwh: MutPtr<Wavehdr>, cbwh: UInt): UInt =
    windowssysWindowsWin32MediaAudioWaveOutWrite(hwo.rawAddress.toCPointer<ByteVar>(), pwh.rawAddress.toCPointer<ByteVar>(), cbwh)
