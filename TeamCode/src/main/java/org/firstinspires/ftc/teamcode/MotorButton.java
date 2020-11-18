package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.TouchSensor;


@TeleOp(name="Ultimate Goal TeleOP", group="Linear Opmode")
public class MotorButton extends OpMode {

    public final static int MAX_ENCODER = 3700;

    private DcMotor motor = null;
    TouchSensor touch;

    private double speed = 1;



    public void init() {
        motor = hardwareMap.get(DcMotor.class, "motor");
        touch = hardwareMap.touchSensor.get("touch_sensor");


        motor.setDirection(DcMotor.Direction.FORWARD);
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);





    }

    private void resetDriveEncoders(){
        //Stop the motors and reset the encoders to zero
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
 //Make sure we re-enable the use of encoders
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
  }

    /**
     * Initialize the gyro
     */

    public void loop() {

        TeleOP1();
    }


    private void TeleOP1(){

        if(touch.isPressed()) {
            motor.setPower(1);
        }else{
            motor.setPower(0);
        }

    }
}


