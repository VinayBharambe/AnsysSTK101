stk.v.12.0
WrittenBy    STK_v12.10.0
BEGIN Scenario
    Name		 STK_Cert_VinayBharambe_V12_Task2

    BEGIN Epoch

        Epoch		 1 May 2024 06:00:00.000000000
        SmartEpoch		
        BEGIN EVENT
            Epoch		 1 May 2024 06:00:00.000000000
            EventEpoch		
            BEGIN EVENT
                Type		 EVENT_LINKTO
                Name		 AnalysisStartTime
            END EVENT
            EpochState		 Implicit
        END EVENT


    END Epoch

    BEGIN Interval

        Start		 1 May 2024 06:00:00.000000000
        Stop		 4 May 2024 06:00:00.000000000
        SmartInterval		
        BEGIN EVENTINTERVAL
            BEGIN Interval
                Start		 1 May 2024 06:00:00.000000000
                Stop		 4 May 2024 06:00:00.000000000
            END Interval
            IntervalState		 Explicit
        END EVENTINTERVAL

        EpochUsesAnalStart		 No
        AnimStartUsesAnalStart		 Yes
        AnimStopUsesAnalStop		 Yes

    END Interval

    BEGIN EOPFile

        EOPFilename		 EOP-v1.1.txt

    END EOPFile

    BEGIN GlobalPrefs
        SatelliteNoOrbWarning		 No
        MissilePerigeeWarning		 No
        MissileStopTimeWarning		 No
        AircraftWGS84Warning		 Always
    END GlobalPrefs

    BEGIN CentralBody

        PrimaryBody		 Earth

    END CentralBody

    BEGIN CentralBodyTerrain

        BEGIN CentralBody
            Name		 Earth
            UseTerrainCache		 Yes
            TotalCacheSize		 402653184

            BEGIN StreamingTerrain
                UseCurrentStreamingTerrainServer		 Yes
                CurrentStreamingTerrainServerName		 https://gcs.agi.com/
                StreamingTerrainTilesetName		 world
                StreamingTerrainServerName		 assets.agi.com/stk-terrain/
                StreamingTerrainAzimuthElevationMaskEnabled		 No
                StreamingTerrainObscurationEnabled		 No
                StreamingTerrainCoverageGridObscurationEnabled		 No
            END StreamingTerrain

            BEGIN TerrainSource
                Type		 PDTT
                FileName		 C:\Program Files\AGI\STK 12\Data\Resources\stktraining\imagery\RaistingStation.pdtt
                UseTerrain		 Yes
                MaxCacheSize		 134217728
                MaxRegionSize		 1048576
                RegionCache		 Yes
                HeaderCache		 Yes
                FileCache		 Yes
                CollectStats		 No
            END TerrainSource
        END CentralBody

    END CentralBodyTerrain

    BEGIN StarCollection

        Name		 Hipparcos 2 Mag 8

    END StarCollection

    BEGIN ScenarioLicenses
        Module		 stk_mission_air
        Module		 stk_mission_level1
        Module		 stk_mission_level2
        Module		 stk_mission_space
    END ScenarioLicenses

    BEGIN QuickReports

        BEGIN Report
            Name		 Segment Summary
            Type		 Report
            BaseDir		 Install
            Style		 Segment Summary
            AGIViewer		 Yes
            Instance		 Satellite/CommSat
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 0
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 No
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 425
            WindowRectTop		 187
            WindowRectRight		 1785
            WindowRectBottom		 651
        END Report

        BEGIN Report
            Name		 AER
            Type		 Report
            BaseDir		 Install
            Style		 AER
            AGIViewer		 Yes
            Instance		 Place/Raisting/Receiver/DLRx
            BEGIN InstanceList
                Instance		 Satellite/CommSat/Transmitter/DLTx
            END InstanceList
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 2
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    Step		 60
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 Yes
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 350
            WindowRectTop		 83
            WindowRectRight		 1924
            WindowRectBottom		 790
        END Report

        BEGIN Report
            Name		 Link Budget
            Type		 Report
            BaseDir		 Install
            Style		 Link Budget
            AGIViewer		 Yes
            Instance		 Place/Raisting/Receiver/DLRx
            BEGIN InstanceList
                Instance		 Satellite/CommSat/Transmitter/DLTx
            END InstanceList
            BEGIN TimeData
                BEGIN Section
                    SectionNumber		 1
                    SectionType		 2
                    ShowIntervals		 No
                    TimeType		 Availability
                    SamplingType		 Default
                    TimeBound		 0
                END Section
            END TimeData
            DisplayOnLoad		 Yes
            FrameType		 0
            DockCircleID		 0
            DockID		 0
            WindowRectLeft		 455
            WindowRectTop		 217
            WindowRectRight		 1819
            WindowRectBottom		 685
        END Report
    END QuickReports

    BEGIN Extensions

        BEGIN ClsApp
            RangeConstraint		 5000
            ApoPeriPad		 30000
            OrbitPathPad		 100000
            TimeDistPad		 30000
            OutOfDate		 2592000
            MaxApoPeriStep		 900
            ApoPeriAngle		 0.7853981633974483
            UseApogeePerigeeFilter		 Yes
            UsePathFilter		 No
            UseTimeFilter		 No
            UseOutOfDate		 Yes
            CreateSats		 No
            MaxSatsToCreate		 500
            UseModelScale		 No
            ModelScale		 0
            UseCrossRefDb		 Yes
            CollisionDB		 stkAllTLE.tce
            CollisionCrossRefDB		 stkAllTLE.sd
            ShowLine		 Yes
            AnimHighlight		 Yes
            StaticHighlight		 Yes
            UseLaunchWindow		 No
            LaunchWindowUseEntireTraj		 Yes
            LaunchWindowTrajMETStart		 0
            LaunchWindowTrajMETStop		 900
            LaunchWindowStart		 0
            LaunchWindowStop		 0
            LaunchMETOffset		 0
            LaunchWindowUseSecEphem		 No 
            LaunchWindowUseScenFolderForSecEphem		 Yes
            LaunchWindowUsePrimEphem		 No 
            LaunchWindowUseScenFolderForPrimEphem		 Yes
            LaunchWindowIntervalPtr		
            BEGIN EVENTINTERVAL
                BEGIN Interval
                    Start		 2 Apr 2025 06:30:00.000000000
                    Stop		 3 Apr 2025 06:30:00.000000000
                END Interval
                IntervalState		 Explicit
            END EVENTINTERVAL

            LaunchWindowUsePrimMTO		 No 
            GroupLaunches		 No 
            LWTimeConvergence		 0.001
            LWRelValueConvergence		 1e-08
            LWTSRTimeConvergence		 0.0001
            LWTSRRelValueConvergence		 1e-10
            LaunchWindowStep		 300
            MaxTSRStep		  1.8000000000000000e+02
            MaxTSRRelMotion		  2.0000000000000000e+01
            UseLaunchArea		 No 
            LaunchAreaOrientation		 North
            LaunchAreaAzimuth		 0
            LaunchAreaXLimits		 -10000 10000
            LaunchAreaYLimits		 -10000 10000
            LaunchAreaNumXIntrPnts		 1
            LaunchAreaNumYIntrPnts		 1
            LaunchAreaAltReference		 Ellipsoid
            TargetSameStop		 No 
            SkipSurfaceMetric		 No 
            LWAreaTSRRelValueConvergence		 1e-10
            AreaLaunchWindowStep		 300
            AreaMaxTSRStep		  3.0000000000000000e+01
            AreaMaxTSRRelMotion		 1
            ShowLaunchArea		 No 
            ShowBlackoutTracks		 No 
            ShowClearedTracks		 No 
            UseObjectForClearedColor		 No 
            BlackoutColor		 #ff0000
            ClearedColor		 #ffffff
            ShowTracksSegments		 No 
            ShowMinRangeTracks		 No 
            MinRangeTrackTimeStep		 0.5
            UsePrimStepForTracks		 Yes
            GfxTracksTimeStep		 30
            GfxAreaNumXIntrPnts		 1
            GfxAreaNumYIntrPnts		 1
            CreateLaunchMTO		 No 
            CovarianceSigmaScale		 3
            CovarianceMode		 None 
        END ClsApp

        BEGIN Units
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            AviatorDistanceUnit		 NauticalMiles
            AviatorTimeUnit		 Hours
            AviatorAltitudeUnit		 Feet
            AviatorFuelQuantityUnit		 Pounds
            AviatorRunwayLengthUnit		 Kilofeet
            AviatorBearingAngleUnit		 Degrees
            AviatorAngleOfAttackUnit		 Degrees
            AviatorAttitudeAngleUnit		 Degrees
            AviatorGUnit		 StandardSeaLevelG
            SolidAngle		 Steradians
            AviatorTSFCUnit		 TSFCLbmHrLbf
            AviatorPSFCUnit		 PSFCLbmHrHp
            AviatorForceUnit		 Pounds
            AviatorPowerUnit		 Horsepower
            MicroDistanceUnit		 Microns
            SpectralBandwidthUnit		 Hertz
            AviatorAltTimeUnit		 Minutes
            AviatorSmallTimeUnit		 Seconds
            AviatorEnergyUnit		 kilowatt-hours
            BitsUnit		 MegaBits
            PowerLinearUnit		 Watts
            RatioLinearUnit		 Units
            RcsLinearUnit		 SquareMeters
            RadiationDose		 Rads
            MagneticFieldUnit		 nanoTesla
            VoltageUnit		 Volts
            RadiationShieldThickness		 Mils
            ParticleEnergy		 MeV
        END Units

        BEGIN ReportUnits
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            AviatorDistanceUnit		 NauticalMiles
            AviatorTimeUnit		 Hours
            AviatorAltitudeUnit		 Feet
            AviatorFuelQuantityUnit		 Pounds
            AviatorRunwayLengthUnit		 Kilofeet
            AviatorBearingAngleUnit		 Degrees
            AviatorAngleOfAttackUnit		 Degrees
            AviatorAttitudeAngleUnit		 Degrees
            AviatorGUnit		 StandardSeaLevelG
            SolidAngle		 Steradians
            AviatorTSFCUnit		 TSFCLbmHrLbf
            AviatorPSFCUnit		 PSFCLbmHrHp
            AviatorForceUnit		 Pounds
            AviatorPowerUnit		 Horsepower
            MicroDistanceUnit		 Microns
            SpectralBandwidthUnit		 Hertz
            AviatorAltTimeUnit		 Minutes
            AviatorSmallTimeUnit		 Seconds
            AviatorEnergyUnit		 kilowatt-hours
            BitsUnit		 MegaBits
            PowerLinearUnit		 Watts
            RatioLinearUnit		 Units
            RcsLinearUnit		 SquareMeters
            RadiationDose		 Rads
            MagneticFieldUnit		 nanoTesla
            VoltageUnit		 Volts
            RadiationShieldThickness		 Mils
            ParticleEnergy		 MeV
        END ReportUnits

        BEGIN ConnectReportUnits
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            AviatorDistanceUnit		 NauticalMiles
            AviatorTimeUnit		 Hours
            AviatorAltitudeUnit		 Feet
            AviatorFuelQuantityUnit		 Pounds
            AviatorRunwayLengthUnit		 Kilofeet
            AviatorBearingAngleUnit		 Degrees
            AviatorAngleOfAttackUnit		 Degrees
            AviatorAttitudeAngleUnit		 Degrees
            AviatorGUnit		 StandardSeaLevelG
            SolidAngle		 Steradians
            AviatorTSFCUnit		 TSFCLbmHrLbf
            AviatorPSFCUnit		 PSFCLbmHrHp
            AviatorForceUnit		 Pounds
            AviatorPowerUnit		 Horsepower
            MicroDistanceUnit		 Microns
            SpectralBandwidthUnit		 Hertz
            AviatorAltTimeUnit		 Minutes
            AviatorSmallTimeUnit		 Seconds
            AviatorEnergyUnit		 kilowatt-hours
            BitsUnit		 MegaBits
            PowerLinearUnit		 Watts
            RatioLinearUnit		 Units
            RcsLinearUnit		 SquareMeters
            RadiationDose		 Rads
            MagneticFieldUnit		 nanoTesla
            VoltageUnit		 Volts
            RadiationShieldThickness		 Mils
            ParticleEnergy		 MeV
        END ConnectReportUnits

        BEGIN ReportFavorites
        END ReportFavorites

        BEGIN ADFFileData
        END ADFFileData

        BEGIN GenDb

            BEGIN Database
                DbType		 Satellite
                DefDb		 stkAllTLE.sd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                    BEGIN Field
                        Name		 "SSC Number"
                        Default		 "*"
                    END Field

                    BEGIN Field
                        Name		 "Common Name"
                        Default		 "*"
                    END Field

                END FieldDefaults

            END Database

            BEGIN Database
                DbType		 City
                DefDb		 stkCityDb.cd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                    BEGIN Field
                        Name		 "City Name"
                        Default		 "*"
                    END Field

                END FieldDefaults

            END Database

            BEGIN Database
                DbType		 Facility
                DefDb		 stkFacility.fd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                END FieldDefaults

            END Database
        END GenDb

        BEGIN SOCDb
            BEGIN Defaults
            END Defaults
        END SOCDb

        BEGIN Msgp4Ext
        END Msgp4Ext

        BEGIN FileLocations
        END FileLocations

        BEGIN Author
            Optimize		 No
            UseBasicGlobe		 No
            SaveEphemeris		 Yes
            SaveScenFolder		 No
            BEGIN ExternalFileTypes
                BEGIN Type
                    FileType		 Calculation Scalar
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Celestial Image
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Cloud
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Component Supporting File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 EOIR Texture Map File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 EOP
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 External Vector Data
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Globe
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Globe Data
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Map
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Map Image
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Marker/Label
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Model
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Object Break-up File
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Planetary Ephemeris
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Python Script
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Report Style Script
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Report/Graph Style
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Scalar Calculation File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Terrain
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Volume Grid Intervals File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Volumetric File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 WTM
                    Include		 Yes
                END Type
            END ExternalFileTypes
            ReadOnly		 No
            ViewerPassword		 No
            STKPassword		 No
            ExcludeInstallFiles		 No
            BEGIN ExternalFileList
            END ExternalFileList
        END Author

        BEGIN ExportDataFile
            FileType		 Ephemeris
            IntervalType		 Ephemeris
            TimePeriodStart		 0
            TimePeriodStop		 0
            StepType		 Ephemeris
            StepSize		 60
            EphemType		 STK
            UseVehicleCentralBody		 Yes
            CentralBody		 Earth
            SatelliteID		 -200000
            CoordSys		 ICRF
            NonSatCoordSys		 Fixed
            InterpolateBoundaries		 Yes
            EphemFormat		 Current
            InterpType		 9
            InterpOrder		 5
            AttCoordSys		 Fixed
            Quaternions		 0
            ExportCovar		 Position
            AttitudeFormat		 Current
            TimePrecision		 6
            CCSDSDateFormat		 YMD
            CCSDSEphFormat		 SciNotation
            CCSDSTimeSystem		 UTC
            CCSDSRefFrame		 ICRF
            UseSatCenterAndFrame		 No
            IncludeCovariance		 No
            IncludeAcceleration		 No
            CCSDSFileFormat		 KVN
        END ExportDataFile

        BEGIN Desc
            BEGIN ShortText

            END ShortText
            BEGIN LongText
STK_Cert_VinayBharambe_V12_Task2
            END LongText
        END Desc

        BEGIN RfEnv
<?xml version = "1.0" standalone = "yes"?>
<SCOPE>
    <VAR name = "PropagationChannel">
        <SCOPE>
            <VAR name = "UseITU618Section2p5">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UseCloudFogModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "CloudFogModel">
                <VAR name = "ITU-R_P840-7">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P840-7">
                                <SCOPE Class = "CloudFogLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{35762574-8DCD-4EB9-A800-5637DDCF0820}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{E7BA4392-37BE-4446-A5C7-6068165B166A}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P840-7&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P840-7&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P840-7&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P840-7&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "LiquidWaterDensityValueChoice">
                                        <STRING>&quot;Liquid Water Content Density Value&quot;</STRING>
                                    </VAR>
                                    <VAR name = "CloudCeiling">
                                        <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                            <REAL>3000</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "CloudLayerThickness">
                                        <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                            <REAL>500</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "CloudTemp">
                                        <QUANTITY Dimension = "Temperature" Unit = "K">
                                            <REAL>273.15</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "CloudLiqWaterDensity">
                                        <QUANTITY Dimension = "SmallDensity" Unit = "kg*m^-3">
                                            <REAL>0.0001</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "AnnualAveragePercentValue">
                                        <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                            <REAL>0.01</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "MonthlyAveragePercentValue">
                                        <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                            <REAL>0.01</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "LiqWaterAverageDataMonth">
                                        <INT>1</INT>
                                    </VAR>
                                    <VAR name = "UseRainHeightAsCloudThickness">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseTropoScintModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "TropoScintModel">
                <VAR name = "ITU-R_P618-12">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P618-12">
                                <SCOPE Class = "TropoScintLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{26107632-ED3D-42BB-B126-0A690B03A0CC}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{BC27045B-5A54-458E-BF17-702BCFE40CA8}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P618-12&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P618-12&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "FadeDepthAverageTimeChoice">
                                        <STRING>&quot;Fade depth for the average year&quot;</STRING>
                                    </VAR>
                                    <VAR name = "FadeExceeded">
                                        <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                            <REAL>0.001</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "PercentTimeRefracGrad">
                                        <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                            <REAL>0.1</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "SurfaceTemperature">
                                        <QUANTITY Dimension = "Temperature" Unit = "K">
                                            <REAL>273.15</REAL>
                                        </QUANTITY>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseIonoFadingModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "IonoFadingModel">
                <VAR name = "ITU-R_P531-13">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P531-13">
                                <SCOPE Class = "IonoFadingLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{8850F2AB-C699-418F-B63D-64F7928C5BFA}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{1699891E-9828-41C7-ADD4-4BE20EFC34A8}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P531-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UseAlternateAPFile">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "AlternateAPDataFile">
                                        <STRING>&quot;&quot;</STRING>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseRainModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "RainModel">
                <VAR name = "ITU-R_P618-13">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P618-13">
                                <SCOPE Class = "RainLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{58201CE3-2BE2-4FEE-8FD8-EED5CFB383DE}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{62382EA0-41C0-45F7-AA94-ACC684509D66}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P618-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P618-13 rain model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P618-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P618-13 rain model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "SurfaceTemperature">
                                        <QUANTITY Dimension = "Temperature" Unit = "K">
                                            <REAL>273.15</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "EnableDepolarizationLoss">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "EnableITU1510">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "UseAnnualITU1510">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "ITU1510Month">
                                        <STRING>&quot;January&quot;</STRING>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseAtmosAbsorptionModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "AtmosAbsorptionModel">
                <VAR name = "ITU-R_P676-13">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P676-13">
                                <SCOPE Class = "AtmosphericAbsorptionModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.1 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{BAA5374F-5AC7-4CE1-BE36-A97FD47575E0}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{514A641E-EE86-4A59-ABB2-0969D49DBCAC}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P676-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P676-13 gaseous absorption model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P676-13&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P676-13 gaseous absorption model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UseApproxMethod">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "UseSeasonalRegional">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseUrbanTerresPropLossModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UrbanTerresPropLossModel">
                <VAR name = "Two_Ray">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "Two_Ray">
                                <SCOPE Class = "UrbanTerrestrialPropagationLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{11AD0451-E59D-495A-877F-870336B4500C}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{60FA4C9B-5D74-4743-A449-66CEB6DFC97B}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;Two_Ray&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;Two Ray&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "SurfaceTemperature">
                                        <QUANTITY Dimension = "Temperature" Unit = "K">
                                            <REAL>273.15</REAL>
                                        </QUANTITY>
                                    </VAR>
                                    <VAR name = "LossFactor">
                                        <REAL>1</REAL>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "UseCustomA">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UseCustomB">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "UseCustomC">
                <BOOL>false</BOOL>
            </VAR>
        </SCOPE>
    </VAR>
    <VAR name = "EarthTemperature">
        <QUANTITY Dimension = "Temperature" Unit = "K">
            <REAL>290</REAL>
        </QUANTITY>
    </VAR>
    <VAR name = "RainOutagePercent">
        <REAL>0.1</REAL>
    </VAR>
    <VAR name = "ActiveCommSystem">
        <LINKTOOBJ>
            <STRING>&quot;None&quot;</STRING>
        </LINKTOOBJ>
    </VAR>
    <VAR name = "MagneticNorthPoleLatitude">
        <QUANTITY Dimension = "AngleUnit" Unit = "rad">
            <REAL>1.387536755335492</REAL>
        </QUANTITY>
    </VAR>
    <VAR name = "MagneticNorthPoleLongitude">
        <QUANTITY Dimension = "AngleUnit" Unit = "rad">
            <REAL>-1.204277183876087</REAL>
        </QUANTITY>
    </VAR>
</SCOPE>        END RfEnv

        BEGIN LaserEnv
<?xml version = "1.0" standalone = "yes"?>
<SCOPE>
    <VAR name = "PropagationChannel">
        <SCOPE>
            <VAR name = "EnableAtmosphericLossModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "AtmosphericLossModel">
                <VAR name = "Beer-Bouguer-Lambert_Law">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "Beer-Bouguer-Lambert_Law">
                                <SCOPE Class = "LaserAtmosphericAbsorptionLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{611B706C-D35E-416C-94A3-E4C68D0BB738}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{6896684B-630D-472D-8027-385684842E74}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;Beer-Bouguer-Lambert_Law&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;Model atmospheric loss for laser receivers using the Beer-Bouguer-Lambert Law&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;Beer-Bouguer-Lambert Law&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;Model atmospheric loss for laser receivers using the Beer-Bouguer-Lambert Law&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "LayerList">
                                        <LIST>
                                            <SCOPE>
                                                <VAR name = "LayerNum">
                                                    <INT>1</INT>
                                                </VAR>
                                                <VAR name = "LayerTop">
                                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                                        <REAL>100000</REAL>
                                                    </QUANTITY>
                                                </VAR>
                                                <VAR name = "ExtinctionCoefficient">
                                                    <QUANTITY Dimension = "UnitlessPerSmallDistance" Unit = "m^-1">
                                                        <REAL>0</REAL>
                                                    </QUANTITY>
                                                </VAR>
                                            </SCOPE>
                                        </LIST>
                                    </VAR>
                                    <VAR name = "EnableEvenlySpacedHeights">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "MaxLayerHeight">
                                        <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                            <REAL>100000</REAL>
                                        </QUANTITY>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
            <VAR name = "EnableTropoScintLossModel">
                <BOOL>false</BOOL>
            </VAR>
            <VAR name = "TropoScintLossModel">
                <VAR name = "ITU-R_P1814">
                    <SCOPE Class = "LinkEmbedControl">
                        <VAR name = "ReferenceType">
                            <STRING>&quot;Unlinked&quot;</STRING>
                        </VAR>
                        <VAR name = "Component">
                            <VAR name = "ITU-R_P1814">
                                <SCOPE Class = "LaserTropoScintLossModel">
                                    <VAR name = "Version">
                                        <STRING>&quot;1.0.0 a&quot;</STRING>
                                    </VAR>
                                    <VAR name = "IdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{9B571554-CDF8-4BBC-850D-92C4B8D7A46D}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                            <VAR name = "SourceIdentifierInformation">
                                                <SCOPE>
                                                    <VAR name = "Identifier">
                                                        <STRING>&quot;{651AF2C8-7D6D-457E-8F99-1FB796A460BF}&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;1&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "SdfInformation">
                                                        <SCOPE>
                                                            <VAR name = "Version">
                                                                <STRING>&quot;0.0&quot;</STRING>
                                                            </VAR>
                                                            <VAR name = "Url">
                                                                <STRING>&quot;&quot;</STRING>
                                                            </VAR>
                                                        </SCOPE>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "ComponentName">
                                        <STRING>&quot;ITU-R_P1814&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Description">
                                        <STRING>&quot;ITU-R P1814&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Type">
                                        <STRING>&quot;ITU-R P1814&quot;</STRING>
                                    </VAR>
                                    <VAR name = "UserComment">
                                        <STRING>&quot;ITU-R P1814&quot;</STRING>
                                    </VAR>
                                    <VAR name = "ReadOnly">
                                        <BOOL>false</BOOL>
                                    </VAR>
                                    <VAR name = "Clonable">
                                        <BOOL>true</BOOL>
                                    </VAR>
                                    <VAR name = "Category">
                                        <STRING>&quot;@Top&quot;</STRING>
                                    </VAR>
                                    <VAR name = "AtmosphericTurbulenceModel">
                                        <VAR name = "Constant">
                                            <SCOPE Class = "AtmosphericTurbulenceModel">
                                                <VAR name = "ConstantRefractiveIndexStructureParameter">
                                                    <REAL>1.7e-14</REAL>
                                                </VAR>
                                                <VAR name = "Type">
                                                    <STRING>&quot;Constant&quot;</STRING>
                                                </VAR>
                                            </SCOPE>
                                        </VAR>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                        </VAR>
                    </SCOPE>
                </VAR>
            </VAR>
        </SCOPE>
    </VAR>
</SCOPE>        END LaserEnv

        BEGIN ComponentManager
        END ComponentManager

        BEGIN RadarCrossSection
<?xml version = "1.0" standalone = "yes"?>
<SCOPE>
    <VAR name = "Model">
        <VAR name = "Radar_Cross_Section">
            <SCOPE Class = "LinkEmbedControl">
                <VAR name = "ReferenceType">
                    <STRING>&quot;Unlinked&quot;</STRING>
                </VAR>
                <VAR name = "Component">
                    <VAR name = "Radar_Cross_Section">
                        <SCOPE Class = "RCS">
                            <VAR name = "Version">
                                <STRING>&quot;1.0.0 a&quot;</STRING>
                            </VAR>
                            <VAR name = "IdentifierInformation">
                                <SCOPE>
                                    <VAR name = "Identifier">
                                        <STRING>&quot;{973AC2EF-B506-4F3E-89A6-288922B80705}&quot;</STRING>
                                    </VAR>
                                    <VAR name = "Version">
                                        <STRING>&quot;1&quot;</STRING>
                                    </VAR>
                                    <VAR name = "SdfInformation">
                                        <SCOPE>
                                            <VAR name = "Version">
                                                <STRING>&quot;0.0&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Url">
                                                <STRING>&quot;&quot;</STRING>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                    <VAR name = "SourceIdentifierInformation">
                                        <SCOPE>
                                            <VAR name = "Identifier">
                                                <STRING>&quot;{EF03E656-5AB7-4F70-A363-4753683F2BD4}&quot;</STRING>
                                            </VAR>
                                            <VAR name = "Version">
                                                <STRING>&quot;1&quot;</STRING>
                                            </VAR>
                                            <VAR name = "SdfInformation">
                                                <SCOPE>
                                                    <VAR name = "Version">
                                                        <STRING>&quot;0.0&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "Url">
                                                        <STRING>&quot;&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </SCOPE>
                                    </VAR>
                                </SCOPE>
                            </VAR>
                            <VAR name = "ComponentName">
                                <STRING>&quot;Radar_Cross_Section&quot;</STRING>
                            </VAR>
                            <VAR name = "Description">
                                <STRING>&quot;Radar Cross Section&quot;</STRING>
                            </VAR>
                            <VAR name = "Type">
                                <STRING>&quot;Radar Cross Section&quot;</STRING>
                            </VAR>
                            <VAR name = "UserComment">
                                <STRING>&quot;Radar Cross Section&quot;</STRING>
                            </VAR>
                            <VAR name = "ReadOnly">
                                <BOOL>false</BOOL>
                            </VAR>
                            <VAR name = "Clonable">
                                <BOOL>true</BOOL>
                            </VAR>
                            <VAR name = "Category">
                                <STRING>&quot;@Top&quot;</STRING>
                            </VAR>
                            <VAR name = "FrequencyBandList">
                                <LIST>
                                    <SCOPE>
                                        <VAR name = "MinFrequency">
                                            <QUANTITY Dimension = "BandwidthUnit" Unit = "Hz">
                                                <REAL>2997920</REAL>
                                            </QUANTITY>
                                        </VAR>
                                        <VAR name = "ComputeTypeStrategy">
                                            <VAR name = "Constant Value">
                                                <SCOPE Class = "RCS Compute Strategy">
                                                    <VAR name = "ConstantValue">
                                                        <QUANTITY Dimension = "RcsUnit" Unit = "sqm">
                                                            <REAL>1</REAL>
                                                        </QUANTITY>
                                                    </VAR>
                                                    <VAR name = "Type">
                                                        <STRING>&quot;Constant Value&quot;</STRING>
                                                    </VAR>
                                                    <VAR name = "ComponentName">
                                                        <STRING>&quot;Constant Value&quot;</STRING>
                                                    </VAR>
                                                </SCOPE>
                                            </VAR>
                                        </VAR>
                                        <VAR name = "SwerlingCase">
                                            <STRING>&quot;0&quot;</STRING>
                                        </VAR>
                                    </SCOPE>
                                </LIST>
                            </VAR>
                        </SCOPE>
                    </VAR>
                </VAR>
            </SCOPE>
        </VAR>
    </VAR>
</SCOPE>        END RadarCrossSection

        BEGIN Gator
            RPOComponentsLoaded		 False
            RPOPythonComponentsLoaded		 False

            BEGIN PASSIVESAFETYUIVALS
                SPHERICALANALYSIS		 On
                CUSTOMINTERVAL		 Off
                SPHERICALRADIUS		  1.0000000000000000e+03
                PERAXR		  1.0000000000000000e+02
                PERAXI		  2.0000000000000000e+03
                PERAXC		  1.0000000000000000e+03
                PROPTIME		  8.6400000000000000e+04
                STEPSIZE		  6.0000000000000000e+01
                STARTTIME		  0.0000000000000000e+00
                STOPTIME		  0.0000000000000000e+00
            END PASSIVESAFETYUIVALS

        END Gator

        BEGIN Crdn
        END Crdn

        BEGIN ScenSpaceEnvironment

            BEGIN RadiationEnvironment

                NasaModelsActivity		 SolarMin
                CrresProActivity		 Quiet
                CrresRadActivity		 Average
                UseDefaultNasaEnergies		 Yes

            END RadiationEnvironment

        END ScenSpaceEnvironment

        BEGIN SpiceExt
            OutputErrorMsgsOnLoad		 No
            SpiceFile		 "asteroids.bsp"
            SpiceFile		 "jupiter.bsp"
            SpiceFile		 "mars.bsp"
            SpiceFile		 "neptune.bsp"
            SpiceFile		 "planets.bsp"
            SpiceFile		 "pluto.bsp"
            SpiceFile		 "saturn.bsp"
            SpiceFile		 "uranus.bsp"
        END SpiceExt

        BEGIN FlightScenExt
        END FlightScenExt

        BEGIN Graphics

            BEGIN Animation

                StartTime		 1 May 2024 06:00:00.000000000
                EndTime		 4 May 2024 06:00:00.000000000
                CurrentTime		 1 May 2024 10:47:48.000000000
                Direction		 Forward
                UpdateDelta		 10
                RefreshDelta		 0.010000
                XRealTimeMult		 1
                RealTimeOffset		 0
                XRtStartFromPause		                Yes		
                TimeArrayIncrement		 1

            END Animation


            BEGIN DisplayFlags
                ShowLabels		 On
                ShowPassLabel		 Off
                ShowElsetNum		 Off
                ShowGndTracks		 On
                ShowGndMarkers		 On
                ShowOrbitMarkers		 On
                ShowPlanetOrbits		 Off
                ShowPlanetCBIPos		 On
                ShowPlanetCBILabel		 On
                ShowPlanetGndPos		 On
                ShowPlanetGndLabel		 On
                ShowSensors		 On
                ShowWayptMarkers		 Off
                ShowWayptTurnMarkers		 Off
                ShowOrbits		 On
                ShowDtedRegions		 Off
                ShowAreaTgtCentroids		 On
                ShowToolBar		 On
                ShowStatusBar		 On
                ShowScrollBars		 On
                AllowAnimUpdate		 On
                AccShowLine		 On
                AccAnimHigh		 On
                AccStatHigh		 On
                AccAnimLineLineWidth		  1.0000000000000000e+00
                AccAnimLineLineStyle		 0
                ShowPrintButton		 On
                ShowAnimButtons		 On
                ShowAnimModeButtons		 On
                ShowZoomMsrButtons		 On
                ShowMapCbButton		 Off
            END DisplayFlags

            BEGIN WinFonts

                Consolas,12,700,0
                Consolas,14,700,0
                Consolas,16,700,0

            END WinFonts

            BEGIN MapData

                BEGIN TerrainConverterData
                    NorthLat		  0.0000000000000000e+00
                    EastLon		  0.0000000000000000e+00
                    SouthLat		  0.0000000000000000e+00
                    WestLon		  0.0000000000000000e+00
                    ColorByRGB		 No
                    AltsFromMSL		 No
                    UseColorRamp		 Yes
                    UseRegionMinMax		 Yes
                    SizeSameAsSrc		 Yes
                    MinAltHSV		  0.0000000000000000e+00  6.9999999999999996e-01  8.0000000000000004e-01  4.0000000000000002e-01
                    MaxAltHSV		  1.0000000000000000e+06  0.0000000000000000e+00  2.0000000000000001e-01  1.0000000000000000e+00
                    SmoothColors		 Yes
                    CreateChunkTrn		 No
                    OutputFormat		 PDTTX
                END TerrainConverterData

                DisableDefKbdActions		 Off
                TextShadowStyle		 Dark
                TextShadowColor		 #000000
                BingLevelOfDetailScale		 2
                BEGIN Map
                    MapNum		 1
                    TrackingMode		 LatLon
                    PickEnabled		 On
                    PanEnabled		 On

                    BEGIN MapAttributes
                        PrimaryBody		 Earth
                        SecondaryBody		 Sun
                        CenterLatitude		 0
                        CenterLongitude		 0
                        ProjectionAltitude		 63621860
                        FieldOfView		 35
                        OrthoDisplayDistance		 20000000
                        TransformTrajectory		 On
                        EquatorialRadius		 6378137
                        BackgroundColor		 #000000
                        LatLonLines		 On
                        LatSpacing		 30
                        LonSpacing		 30
                        LatLonLineColor		 #999999
                        LatLonLineStyle		 2
                        ShowOrthoDistGrid		 Off
                        OrthoGridXSpacing		 5
                        OrthoGridYSpacing		 5
                        OrthoGridColor		 #ffffff
                        ShowImageExtents		 Off
                        ImageExtentLineColor		 #ffffff
                        ImageExtentLineStyle		 0
                        ImageExtentLineWidth		 1
                        ShowImageNames		 Off
                        ImageNameFont		 0
                        Projection		 EquidistantCylindrical
                        Resolution		 VeryLow
                        CoordinateSys		 ECF
                        UseBackgroundImage		 On
                        UseBingForBackground		 On
                        BingType		 Aerial
                        BingLogoHorizAlign		 Right
                        BingLogoVertAlign		 Bottom
                        BackgroundImageFile		 Basic.bmp
                        UseNightLights		 Off
                        NightLightsFactor		 3.5
                        UseCloudsFile		 Off
                        BEGIN ZoomLocations
                            BEGIN ZoomLocation
                                CenterLat		 0
                                CenterLon		 0
                                ZoomWidth		 360
                                ZoomHeight		 180
                            END ZoomLocation
                        END ZoomLocations
                        UseVarAspectRatio		 No
                        SwapMapResolution		 Yes
                        NoneToVLowSwapDist		 2000000
                        VLowToLowSwapDist		 20000
                        LowToMediumSwapDist		 10000
                        MediumToHighSwapDist		 5000
                        HighToVHighSwapDist		 1000
                        VHighToSHighSwapDist		 100
                        BEGIN Axes
                            DisplayAxes		 no
                            CoordSys		 CBI
                            2aryCB		 Sun
                            Display+x		 yes
                            Label+x		 yes
                            Color+x		 #ffffff
                            Scale+x		 3
                            Display-x		 yes
                            Label-x		 yes
                            Color-x		 #ffffff
                            Scale-x		 3
                            Display+y		 yes
                            Label+y		 yes
                            Color+y		 #ffffff
                            Scale+y		 3
                            Display-y		 yes
                            Label-y		 yes
                            Color-y		 #ffffff
                            Scale-y		 3
                            Display+z		 yes
                            Label+z		 yes
                            Color+z		 #ffffff
                            Scale+z		 3
                            Display-z		 yes
                            Label-z		 yes
                            Color-z		 #ffffff
                            Scale-z		 3
                        END Axes

                    END MapAttributes

                    BEGIN MapList
                        BEGIN Detail
                            Alias		 RWDB2_Coastlines
                            Show		 Yes
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_International_Borders
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Islands
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Lakes
                            Show		 No
                            Color		 #87cefa
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Provincial_Borders
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Rivers
                            Show		 No
                            Color		 #87cefa
                        END Detail
                    END MapList


                    BEGIN MapAnnotations
                    END MapAnnotations

                    BEGIN DisplayFlags
                        ShowLabels		 On
                        ShowPassLabel		 Off
                        ShowElsetNum		 Off
                        ShowGndTracks		 On
                        ShowGndMarkers		 On
                        ShowOrbitMarkers		 On
                        ShowPlanetOrbits		 Off
                        ShowPlanetCBIPos		 On
                        ShowPlanetCBILabel		 On
                        ShowPlanetGndPos		 On
                        ShowPlanetGndLabel		 On
                        ShowSensors		 On
                        ShowWayptMarkers		 Off
                        ShowWayptTurnMarkers		 Off
                        ShowOrbits		 On
                        ShowDtedRegions		 Off
                        ShowAreaTgtCentroids		 On
                        ShowToolBar		 On
                        ShowStatusBar		 On
                        ShowScrollBars		 On
                        AllowAnimUpdate		 Off
                        AccShowLine		 On
                        AccAnimHigh		 On
                        AccStatHigh		 On
                        AccAnimLineLineWidth		  1.0000000000000000e+00
                        AccAnimLineLineStyle		 0
                        ShowPrintButton		 On
                        ShowAnimButtons		 On
                        ShowAnimModeButtons		 On
                        ShowZoomMsrButtons		 On
                        ShowMapCbButton		 Off
                    END DisplayFlags

                    BEGIN RecordMovie
                        OutputFormat		 VIDEO
                        SdfSelected		 No
                        BaseName		 Frame
                        Digits		 4
                        Frame		 0
                        LastAnimTime		 0
                        OutputMode		 Normal
                        HiResAssembly		 Assemble
                        HRWidth		 6000
                        HRHeight		 4500
                        HRDPI		 600
                        UseSnapInterval		 No
                        SnapInterval		 0
                        VideoCodec		 "H264"
                        Framerate		 30
                        Bitrate		 10000000
                    END RecordMovie


                    BEGIN TimeDisplay
                        Show		 0
                        TextColor		 #ffffff
                        TextTranslucency		 0
                        ShowBackground		 0
                        BackColor		 #4d4d4d
                        BackTranslucency		 0.4
                        XPosition		 20
                        YPosition		 -20
                    END TimeDisplay

                    BEGIN LightingData
                        DisplayAltitude		 0
                        SubsolarPoint		 Off
                        SubsolarPointColor		 #ffff00
                        SubsolarPointMarkerStyle		 2

                        ShowUmbraLine		 Off
                        UmbraLineColor		 #000000
                        UmbraLineStyle		 0
                        UmbraLineWidth		 2
                        FillUmbra		 On
                        UmbraFillColor		 #000000
                        ShowSunlightLine		 Off
                        SunlightLineColor		 #ffff00
                        SunlightLineStyle		 0
                        SunlightLineWidth		 2
                        FillSunlight		 On
                        SunlightFillColor		 #ffffff
                        SunlightMinOpacity		 0
                        SunlightMaxOpacity		 0.2
                        UmbraMaxOpacity		 0.7
                        UmbraMinOpacity		 0.4
                    END LightingData
                END Map

                BEGIN MapStyles

                    UseStyleTime		 No

                    BEGIN Style
                        Name		 DefaultWithBing
                        Time		 29032200
                        UpdateDelta		 10

                        BEGIN MapAttributes
                            PrimaryBody		 Earth
                            SecondaryBody		 Sun
                            CenterLatitude		 0
                            CenterLongitude		 0
                            ProjectionAltitude		 63621860
                            FieldOfView		 35
                            OrthoDisplayDistance		 20000000
                            TransformTrajectory		 On
                            EquatorialRadius		 6378137
                            BackgroundColor		 #000000
                            LatLonLines		 On
                            LatSpacing		 30
                            LonSpacing		 30
                            LatLonLineColor		 #999999
                            LatLonLineStyle		 2
                            ShowOrthoDistGrid		 Off
                            OrthoGridXSpacing		 5
                            OrthoGridYSpacing		 5
                            OrthoGridColor		 #ffffff
                            ShowImageExtents		 Off
                            ImageExtentLineColor		 #ffffff
                            ImageExtentLineStyle		 0
                            ImageExtentLineWidth		 1
                            ShowImageNames		 Off
                            ImageNameFont		 0
                            Projection		 EquidistantCylindrical
                            Resolution		 VeryLow
                            CoordinateSys		 ECF
                            UseBackgroundImage		 On
                            UseBingForBackground		 On
                            BingType		 Aerial
                            BingLogoHorizAlign		 Right
                            BingLogoVertAlign		 Bottom
                            BackgroundImageFile		 Basic.bmp
                            UseNightLights		 Off
                            NightLightsFactor		 3.5
                            UseCloudsFile		 Off
                            BEGIN ZoomLocations
                                BEGIN ZoomLocation
                                    CenterLat		 0
                                    CenterLon		 0
                                    ZoomWidth		 359.999998
                                    ZoomHeight		 180
                                END ZoomLocation
                            END ZoomLocations
                            UseVarAspectRatio		 No
                            SwapMapResolution		 Yes
                            NoneToVLowSwapDist		 2000000
                            VLowToLowSwapDist		 20000
                            LowToMediumSwapDist		 10000
                            MediumToHighSwapDist		 5000
                            HighToVHighSwapDist		 1000
                            VHighToSHighSwapDist		 100
                            BEGIN Axes
                                DisplayAxes		 no
                                CoordSys		 CBI
                                2aryCB		 Sun
                                Display+x		 yes
                                Label+x		 yes
                                Color+x		 #ffffff
                                Scale+x		 3
                                Display-x		 yes
                                Label-x		 yes
                                Color-x		 #ffffff
                                Scale-x		 3
                                Display+y		 yes
                                Label+y		 yes
                                Color+y		 #ffffff
                                Scale+y		 3
                                Display-y		 yes
                                Label-y		 yes
                                Color-y		 #ffffff
                                Scale-y		 3
                                Display+z		 yes
                                Label+z		 yes
                                Color+z		 #ffffff
                                Scale+z		 3
                                Display-z		 yes
                                Label-z		 yes
                                Color-z		 #ffffff
                                Scale-z		 3
                            END Axes

                        END MapAttributes

                        BEGIN MapList
                            BEGIN Detail
                                Alias		 RWDB2_Coastlines
                                Show		 Yes
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_International_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Islands
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Lakes
                                Show		 No
                                Color		 #87cefa
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Provincial_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Rivers
                                Show		 No
                                Color		 #87cefa
                            END Detail
                        END MapList


                        BEGIN MapAnnotations
                        END MapAnnotations

                        BEGIN RecordMovie
                            OutputFormat		 VIDEO
                            SdfSelected		 No
                            BaseName		 Frame
                            Digits		 4
                            Frame		 0
                            LastAnimTime		 0
                            OutputMode		 Normal
                            HiResAssembly		 Assemble
                            HRWidth		 6000
                            HRHeight		 4500
                            HRDPI		 600
                            UseSnapInterval		 No
                            SnapInterval		 0
                            VideoCodec		 "H264"
                            Framerate		 30
                            Bitrate		 10000000
                        END RecordMovie


                        BEGIN TimeDisplay
                            Show		 0
                            TextColor		 #ffffff
                            TextTranslucency		 0
                            ShowBackground		 0
                            BackColor		 #4d4d4d
                            BackTranslucency		 0.4
                            XPosition		 20
                            YPosition		 -20
                        END TimeDisplay

                        BEGIN LightingData
                            DisplayAltitude		 0
                            SubsolarPoint		 Off
                            SubsolarPointColor		 #ffff00
                            SubsolarPointMarkerStyle		 2

                            ShowUmbraLine		 Off
                            UmbraLineColor		 #000000
                            UmbraLineStyle		 0
                            UmbraLineWidth		 2
                            FillUmbra		 On
                            UmbraFillColor		 #000000
                            ShowSunlightLine		 Off
                            SunlightLineColor		 #ffff00
                            SunlightLineStyle		 0
                            SunlightLineWidth		 2
                            FillSunlight		 On
                            SunlightFillColor		 #ffffff
                            SunlightMinOpacity		 0
                            SunlightMaxOpacity		 0.2
                            UmbraMaxOpacity		 0.7
                            UmbraMinOpacity		 0.4
                        END LightingData

                        ShowDtedRegions		 Off

                    END Style

                    BEGIN Style
                        Name		 DefaultWithoutBing
                        Time		 29032200
                        UpdateDelta		 10

                        BEGIN MapAttributes
                            PrimaryBody		 Earth
                            SecondaryBody		 Sun
                            CenterLatitude		 0
                            CenterLongitude		 0
                            ProjectionAltitude		 63621860
                            FieldOfView		 35
                            OrthoDisplayDistance		 20000000
                            TransformTrajectory		 On
                            EquatorialRadius		 6378137
                            BackgroundColor		 #000000
                            LatLonLines		 On
                            LatSpacing		 30
                            LonSpacing		 30
                            LatLonLineColor		 #999999
                            LatLonLineStyle		 2
                            ShowOrthoDistGrid		 Off
                            OrthoGridXSpacing		 5
                            OrthoGridYSpacing		 5
                            OrthoGridColor		 #ffffff
                            ShowImageExtents		 Off
                            ImageExtentLineColor		 #ffffff
                            ImageExtentLineStyle		 0
                            ImageExtentLineWidth		 1
                            ShowImageNames		 Off
                            ImageNameFont		 0
                            Projection		 EquidistantCylindrical
                            Resolution		 VeryLow
                            CoordinateSys		 ECF
                            UseBackgroundImage		 On
                            UseBingForBackground		 Off
                            BingType		 Aerial
                            BingLogoHorizAlign		 Right
                            BingLogoVertAlign		 Bottom
                            BackgroundImageFile		 Basic.bmp
                            UseNightLights		 Off
                            NightLightsFactor		 3.5
                            UseCloudsFile		 Off
                            BEGIN ZoomLocations
                                BEGIN ZoomLocation
                                    CenterLat		 0
                                    CenterLon		 0
                                    ZoomWidth		 359.999998
                                    ZoomHeight		 180
                                END ZoomLocation
                            END ZoomLocations
                            UseVarAspectRatio		 No
                            SwapMapResolution		 Yes
                            NoneToVLowSwapDist		 2000000
                            VLowToLowSwapDist		 20000
                            LowToMediumSwapDist		 10000
                            MediumToHighSwapDist		 5000
                            HighToVHighSwapDist		 1000
                            VHighToSHighSwapDist		 100
                            BEGIN Axes
                                DisplayAxes		 no
                                CoordSys		 CBI
                                2aryCB		 Sun
                                Display+x		 yes
                                Label+x		 yes
                                Color+x		 #ffffff
                                Scale+x		 3
                                Display-x		 yes
                                Label-x		 yes
                                Color-x		 #ffffff
                                Scale-x		 3
                                Display+y		 yes
                                Label+y		 yes
                                Color+y		 #ffffff
                                Scale+y		 3
                                Display-y		 yes
                                Label-y		 yes
                                Color-y		 #ffffff
                                Scale-y		 3
                                Display+z		 yes
                                Label+z		 yes
                                Color+z		 #ffffff
                                Scale+z		 3
                                Display-z		 yes
                                Label-z		 yes
                                Color-z		 #ffffff
                                Scale-z		 3
                            END Axes

                        END MapAttributes

                        BEGIN MapList
                            BEGIN Detail
                                Alias		 RWDB2_Coastlines
                                Show		 Yes
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_International_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Islands
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Lakes
                                Show		 No
                                Color		 #87cefa
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Provincial_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Rivers
                                Show		 No
                                Color		 #87cefa
                            END Detail
                        END MapList


                        BEGIN MapAnnotations
                        END MapAnnotations

                        BEGIN RecordMovie
                            OutputFormat		 VIDEO
                            SdfSelected		 No
                            BaseName		 Frame
                            Digits		 4
                            Frame		 0
                            LastAnimTime		 0
                            OutputMode		 Normal
                            HiResAssembly		 Assemble
                            HRWidth		 6000
                            HRHeight		 4500
                            HRDPI		 600
                            UseSnapInterval		 No
                            SnapInterval		 0
                            VideoCodec		 "H264"
                            Framerate		 30
                            Bitrate		 3000000
                        END RecordMovie


                        BEGIN TimeDisplay
                            Show		 0
                            TextColor		 #ffffff
                            TextTranslucency		 0
                            ShowBackground		 0
                            BackColor		 #4d4d4d
                            BackTranslucency		 0.4
                            XPosition		 20
                            YPosition		 -20
                        END TimeDisplay

                        BEGIN LightingData
                            DisplayAltitude		 0
                            SubsolarPoint		 Off
                            SubsolarPointColor		 #ffff00
                            SubsolarPointMarkerStyle		 2

                            ShowUmbraLine		 Off
                            UmbraLineColor		 #000000
                            UmbraLineStyle		 0
                            UmbraLineWidth		 2
                            FillUmbra		 On
                            UmbraFillColor		 #000000
                            ShowSunlightLine		 Off
                            SunlightLineColor		 #ffff00
                            SunlightLineStyle		 0
                            SunlightLineWidth		 2
                            FillSunlight		 On
                            SunlightFillColor		 #ffffff
                            SunlightMinOpacity		 0
                            SunlightMaxOpacity		 0.2
                            UmbraMaxOpacity		 0.7
                            UmbraMinOpacity		 0.4
                        END LightingData

                        ShowDtedRegions		 Off

                    END Style

                END MapStyles

            END MapData

            BEGIN GfxClassPref

            END GfxClassPref


            BEGIN ConnectGraphicsOptions

                AsyncPickReturnUnique		 OFF

            END ConnectGraphicsOptions

        END Graphics

        BEGIN Overlays
        END Overlays

        BEGIN VO
        END VO

        BEGIN ScenSpaceEnvironmentGfx

            BEGIN Gfx

                BEGIN MagFieldGfx
                    Show		 No
                    ColorBy		 Magnitude
                    ColorScale		 Log
                    ColorRampStart		 #0000ff
                    ColorRampStop		 #ff0000
                    MaxTranslucency		 0.7
                    LineStyle		 0
                    LineWidth		 2
                    FieldLineRefresh		 300
                    NumLats		 8
                    NumLongs		 6
                    StartLat		 15
                    StopLat		 85
                    RefLongitude		 3.141592653589793
                    MainField		 IGRF
                    ExternalField		 None
                    IGRF_UpdateRate		 86400
                END MagFieldGfx

            END Gfx

        END ScenSpaceEnvironmentGfx

    END Extensions

    BEGIN SubObjects

        Class Place

            Raisting		

        END Class

        Class Satellite

            CommSat		

        END Class

    END SubObjects

    BEGIN References
        Instance *
            *		
        END Instance
        Instance Place/Raisting
            Place/Raisting		
            Place/Raisting/Receiver/DLRx		
        END Instance
        Instance Place/Raisting/Receiver/DLRx
            Place/Raisting/Receiver/DLRx		
        END Instance
        Instance Satellite/CommSat
            Satellite/CommSat		
            Satellite/CommSat/Transmitter/DLTx		
        END Instance
        Instance Satellite/CommSat/Transmitter/DLTx
            Satellite/CommSat/Transmitter/DLTx		
        END Instance
    END References

END Scenario
