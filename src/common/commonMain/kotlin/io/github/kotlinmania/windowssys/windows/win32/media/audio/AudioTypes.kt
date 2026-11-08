package io.github.kotlinmania.windowssys.windows.win32.media.audio

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.HDRVR

public fun interface ACMDRIVERENUMCBFn {
    public operator fun invoke(hadid: HACMDRIVERID, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public typealias ACMDRIVERENUMCB = ACMDRIVERENUMCBFn?

public fun interface ACMFILTERCHOOSEHOOKPROCAFn {
    public operator fun invoke(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): UInt
}

public typealias ACMFILTERCHOOSEHOOKPROCA = ACMFILTERCHOOSEHOOKPROCAFn?

public fun interface ACMFILTERCHOOSEHOOKPROCWFn {
    public operator fun invoke(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): UInt
}

public typealias ACMFILTERCHOOSEHOOKPROCW = ACMFILTERCHOOSEHOOKPROCWFn?

public fun interface ACMFILTERENUMCBAFn {
    public operator fun invoke(hadid: HACMDRIVERID, pafd: Long, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public typealias ACMFILTERENUMCBA = ACMFILTERENUMCBAFn?

public fun interface ACMFILTERENUMCBWFn {
    public operator fun invoke(hadid: HACMDRIVERID, pafd: Long, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public typealias ACMFILTERENUMCBW = ACMFILTERENUMCBWFn?

public fun interface ACMFILTERTAGENUMCBAFn {
    public operator fun invoke(hadid: HACMDRIVERID, paftd: Long, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public typealias ACMFILTERTAGENUMCBA = ACMFILTERTAGENUMCBAFn?

public fun interface ACMFILTERTAGENUMCBWFn {
    public operator fun invoke(hadid: HACMDRIVERID, paftd: Long, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public typealias ACMFILTERTAGENUMCBW = ACMFILTERTAGENUMCBWFn?

public fun interface ACMFORMATCHOOSEHOOKPROCAFn {
    public operator fun invoke(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): UInt
}

public typealias ACMFORMATCHOOSEHOOKPROCA = ACMFORMATCHOOSEHOOKPROCAFn?

public fun interface ACMFORMATCHOOSEHOOKPROCWFn {
    public operator fun invoke(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): UInt
}

public typealias ACMFORMATCHOOSEHOOKPROCW = ACMFORMATCHOOSEHOOKPROCWFn?

public fun interface ACMFORMATENUMCBAFn {
    public operator fun invoke(hadid: HACMDRIVERID, pafd: Long, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public typealias ACMFORMATENUMCBA = ACMFORMATENUMCBAFn?

public fun interface ACMFORMATENUMCBWFn {
    public operator fun invoke(hadid: HACMDRIVERID, pafd: Long, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public typealias ACMFORMATENUMCBW = ACMFORMATENUMCBWFn?

public fun interface ACMFORMATTAGENUMCBAFn {
    public operator fun invoke(hadid: HACMDRIVERID, paftd: Long, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public typealias ACMFORMATTAGENUMCBA = ACMFORMATTAGENUMCBAFn?

public fun interface ACMFORMATTAGENUMCBWFn {
    public operator fun invoke(hadid: HACMDRIVERID, paftd: Long, dwinstance: ULong, fdwsupport: UInt): BOOL
}

public typealias ACMFORMATTAGENUMCBW = ACMFORMATTAGENUMCBWFn?

public typealias AMBISONICS_CHANNEL_ORDERING = Int

public typealias AMBISONICS_NORMALIZATION = Int

public typealias AMBISONICS_TYPE = Int

public typealias AUDCLNT_SHAREMODE = Int

public typealias AUDCLNT_STREAMOPTIONS = Int

public typealias AUDIOCLIENT_ACTIVATION_TYPE = Int

public typealias AUDIO_DUCKING_OPTIONS = Int

public typealias AUDIO_EFFECT_STATE = Int

public typealias AUDIO_STREAM_CATEGORY = Int

public typealias AUDIO_SYSTEMEFFECTS_PROPERTYSTORE_TYPE = Int

public typealias AudioObjectType = Int

public typealias AudioSessionDisconnectReason = Int

public typealias AudioSessionState = Int

public typealias AudioStateMonitorSoundLevel = Int

public typealias DEVICE_STATE = UInt

public typealias DataFlow = Int

public typealias EDataFlow = Int

public typealias ERole = Int

public typealias EndpointFormFactor = Int

public typealias HACMDRIVER = Long

public typealias HACMDRIVERID = Long

public typealias HACMOBJ = Long

public typealias HACMSTREAM = Long

public typealias HMIDI = Long

public typealias HMIDIIN = Long

public typealias HMIDIOUT = Long

public typealias HMIDISTRM = Long

public typealias HMIXER = Long

public typealias HMIXEROBJ = Long

public typealias HWAVE = Long

public typealias HWAVEIN = Long

public typealias HWAVEOUT = Long

public fun interface LPACMDRIVERPROCFn {
    public operator fun invoke(param0: ULong, param1: HACMDRIVERID, param2: UInt, param3: LPARAM, param4: LPARAM): LRESULT
}

public typealias LPACMDRIVERPROC = LPACMDRIVERPROCFn?

public fun interface LPMIDICALLBACKFn {
    public operator fun invoke(hdrvr: HDRVR, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public typealias LPMIDICALLBACK = LPMIDICALLBACKFn?

public fun interface LPWAVECALLBACKFn {
    public operator fun invoke(hdrvr: HDRVR, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public typealias LPWAVECALLBACK = LPWAVECALLBACKFn?

public typealias MIDI_WAVE_OPEN_TYPE = UInt

public typealias MIXERLINE_COMPONENTTYPE = UInt

public fun interface PAudioStateMonitorCallbackFn {
    public operator fun invoke(audiostatemonitor: Long, context: Long)
}

public typealias PAudioStateMonitorCallback = PAudioStateMonitorCallbackFn?

public typealias PROCESS_LOOPBACK_MODE = Int

public typealias PartType = Int

public typealias SND_FLAGS = UInt

public typealias SPATIAL_AUDIO_STREAM_OPTIONS = Int

public typealias SpatialAudioHrtfDirectivityType = Int

public typealias SpatialAudioHrtfDistanceDecayType = Int

public typealias SpatialAudioHrtfEnvironmentType = Int

public typealias SpatialAudioMetadataCopyMode = Int

public typealias SpatialAudioMetadataWriterOverflowMode = Int

public typealias _AUDCLNT_BUFFERFLAGS = Int
